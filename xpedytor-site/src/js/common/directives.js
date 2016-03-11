/**
 * Created by chakushy on 3/11/16.
 */
'use strict';

var dependencies =
    [
        'angular',
        'common/config'
    ];

define(dependencies, function () {
    var commonDirectivesModule = angular.module('com.xpedytor.modules.common.directives',
        [
            'com.xpedytor.modules.common.config'
        ]);

    commonDirectivesModule.directive('commonHeader',
        [
            'commonDirectivesTemplateURLs',
            commonHeaderDirective
        ]);

    function commonHeaderDirective(templateUrls) {

        var directiveDefinition = {
            restrict: 'EA',
            scope: {
                headerTitle: '@'
            },
            templateUrl: function () {
                return templateUrls.header;
            }
        };

        return directiveDefinition;
    }
});