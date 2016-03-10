/**
 * Created by laj on 2/28/16.
 */
'use strict';

var dependencies =
    [
        'angular',
        'common/module',
        'defs/app-defs'
    ];

define(dependencies,
    function () {
        var appModule = angular.module('com.xpedytor.app',
            [
                'com.xpedytor.modules.common'
            ]);

        appModule.run(
            [
                '$log',
                initializeAppModule
            ]
        );
    }
);