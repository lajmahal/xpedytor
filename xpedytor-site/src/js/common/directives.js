/**
 * Created by chakushy on 3/11/16.
 */
'use strict';

var dependencies =
    [
        'angular',
        'common/config',
        'common/defs/directive-defs'
    ];

define(dependencies, function () {
    var commonDirectivesModule = angular.module('com.xpedytor.modules.common.directives',
        [
            'com.xpedytor.modules.common.config'
        ]);

    // initialize
    commonDirectivesModule.run(
        [
            '$log',
            initializeCommonDirectivesModule
        ]
    );

    // set up directives
    commonDirectivesModule.directive('commonHeader',
        [
            'commonDirectivesTemplateURLs',
            commonHeaderDirective
        ]);
});