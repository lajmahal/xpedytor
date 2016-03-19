/**
 * Created by chakushy on 3/11/16.
 */
/*global
 initializeCommonServicesModule, xpdTablesService
 */
'use strict';

var dependencies =
    [
        'angular',
        'ngResource',
        'common/config',
        'common/defs/service-defs'
    ];

define(dependencies, function () {

    var commonServicesModule = angular.module('com.xpedytor.modules.common.services',
        [
            'ngResource',
            'com.xpedytor.modules.common.config'
        ]);

    // initialize the module
    commonServicesModule.run(
        [
            '$log',
            initializeCommonServicesModule
        ]);

    // tables service
    commonServicesModule.factory('xpdTablesService',
        [
            '$resource',
            'xpdCommonServiceURLs',
            xpdTablesService
        ]);
});