/**
 * Created by chakushy on 3/11/16.
 */
'use strict';

var dependencies = ['angular'];

define(dependencies, function () {
    var commonConfigModule = angular.module('com.xpedytor.modules.common.config', []);

    // constant for common directive partial templates
    commonConfigModule.constant('xpdCommonDirectivesTemplateURLs', {
        header: 'js/common/partials/directives/header.html',
        footer: 'js/common/partials/directives/footer.html'
    });

    // constants for common service URLs
    commonConfigModule.constant('xpdCommonServiceURLs', {
        baseURL: 'http://localhost:8080/webapi',
        tablesService: '/tables'
    });

    // constants for common view partial template URLs
    commonConfigModule.constant('xpdCommonViewTemplateURLs', {
        tables: 'js/common/partials/views/tables.html'
    });
});