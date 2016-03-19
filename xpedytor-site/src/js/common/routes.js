/**
 * Created by chakushy on 3/11/16.
 */
/*global
 initializeCommonRoutesModule, configureCommonRouter
 */
'use strict';

var dependencies =
    [
        'angular',
        'uiRouter',
        'common/config',
        'common/controllers',
        'common/defs/route-defs'
    ];

define(dependencies, function () {

    var commonRoutesModule = angular.module('com.xpedytor.modules.common.routes',
        [
            'ui.router',
            'com.xpedytor.modules.common.config',
            'com.xpedytor.modules.common.controllers'
        ]
    );

    // initialize module
    commonRoutesModule.run(
        [
            '$log',
            initializeCommonRoutesModule
        ]
    );

    // configure router
    commonRoutesModule.config(
        [
            '$stateProvider',
            '$urlRouterProvider',
            'xpdCommonViewTemplateURLs',
            configureCommonRouter
        ]
    );
});