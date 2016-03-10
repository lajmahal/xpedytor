/**
 * Created by chakushy on 3/10/16.
 */
'use strict';

var dependencies =
    [
        'angular',
        'common/defs/module-defs'
    ];

define(dependencies, function () {
    var commonModule = angular.module('com.xpedytor.modules.common', []);

    commonModule.run(['$log', initializeCommonModule]);
});