/**
 * Created by chakushy on 3/10/16.
 */
'use strict';

var dependencies =
    [
        'angular',
        'common/defs/module-defs',
        'common/controllers',
        'common/directives'
    ];

define(dependencies, function () {
    var commonModule = angular.module('com.xpedytor.modules.common',
        [
            'com.xpedytor.modules.common.controllers',
            'com.xpedytor.modules.common.directives'
        ]);

    commonModule.run(['$log', initializeCommonModule]);
});