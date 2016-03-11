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

    function commonHeaderDirective(templateUrls, scope, controller) {
        var directiveDefinition = {
            restrict: 'EA'
        };

        if (templateUrls && templateUrls.header) {
            directiveDefinition.templateUrl = function () {
                return templateUrls.header;
            }
        }

        if (scope) {
            directiveDefinition.scope = scope;
        }

        if (controller) {
            directiveDefinition.controller = controller;
        }

        return directiveDefinition;
    }
});