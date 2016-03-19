/**
 * Created by chakushy on 3/19/16.
 */
'use strict';

var gulp = require('gulp');

// gulp plugins
var jscs = require('gulp-jscs');
var jshint = require('gulp-jshint');

// Hello World task
gulp.task('hello-world', function () {
    console.log('Hello World!');
});

// vet task
gulp.task('vet', function () {

    return gulp
        .src('./xpedytor-site/src/js/**/*.js')
        .pipe(jscs())
        .pipe(jshint())
        .pipe(jshint.reporter('jshint-stylish', {verbose: true}))
        .pipe(jshint.reporter('fail'));

});