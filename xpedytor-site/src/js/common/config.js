/**
 * Created by chakushy on 3/11/16.
 */
'use strict';

var dependencies = ['angular'];

define(dependencies, function () {
    var commonConfigModule = angular.module('com.xpedytor.modules.common.config', []);

    // constant for common directive partial templates
    commonConfigModule.constant('xpdCommonDirectivesTemplateURLs', {
        header: 'js/common/partials/directives/header.html'
    });
});