/**
 * Created by laj on 2/28/16.
 */
'use strict';

var dependencies =
    [
        'angular',
        'defs/app-defs'
    ];

define(dependencies,
    function () {
        var appModule= angular.module('com.xpedytor.app', []);

        appModule.run(
            [
                '$log',
                initializeAppModule
            ]
        );
    }
);