'use strict';

var http = require('http');
var os = require('os');
var util = require('util');
var express = require('express');
var bodyparser = require('body-parser');
var sio = require('socket.io');

var portNumber = process.env.PORT_NUMBER || 9090;
var hostName = os.hostname();
var message = util.format(
    'REST Service available at http://%s:%d/src',
    hostName, portNumber);

var app = new express();
var server = http.createServer(app);

var sioimpl = sio.listen(server);
sioimpl.on('connection', function (socketClient) {

    var socketId = Math.floor(Math.random() * (100000 - 1) + 1);

    socketClient.id = socketId;

    console.log('Socket Client ... ' + socketClient.id + ' Connected ...');

    socketClient.on('disconnect', function () {
        console.log('Socket Client ... ' + socketClient.id + ' Disconnected ...');
    });
});

app.use(function (error, request, response, next) {
    var HTTP_UNAUTHORIZED = 401;

    if (error && error.constructor.name === 'UnauthorizedError') {
        response.send(HTTP_UNAUTHORIZED).send('Authorization Failed!');
        return;
    }

    next();
});

app.use(bodyparser.json());
app.use('/', express.static(__dirname + "/../app/"));

server.listen(portNumber);

console.log(message);