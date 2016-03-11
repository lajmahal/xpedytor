/**
 * Created by chakushy on 3/10/16.
 */
'use strict';

var dependencies =
    [
        'angular',
        'common/defs/module-defs',
        'common/directives',
        'common/services'
    ];

define(dependencies, function () {
    var commonModule = angular.module('com.xpedytor.modules.common',
        [
            'com.xpedytor.modules.common.directives',
            'com.xpedytor.modules.common.services'
        ]);

    commonModule.run(['$log', initializeCommonModule]);
});