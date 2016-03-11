/**
 * Created by chakushy on 3/11/16.
 */
'use strict';

var dependencies =
    [
        'angular',
        'common/defs/controller-defs',
        'common/services'
    ];

define(dependencies, function () {

    var commonControllersModule = angular.module('com.xpedytor.modules.common.controllers',
        [
            'com.xpedytor.modules.common.services'
        ]);

    // initialize the module
    commonControllersModule.run(
        [
            '$log',
            initializeCommonControllersModule
        ]
    );

    // tables view controller
    commonControllersModule.controller('xpdTablesViewController',
        [
            '$scope',
            'xpdTablesService',
            xpdTablesViewController
        ]);
});