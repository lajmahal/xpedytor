/**
 * Created by chakushy on 3/11/16.
 */
'use strict';

function initializeCommonDirectivesModule(logService) {
    if (logService) {
        logService.info("Common Directives Module initialized!");
    }
}

function xpdCommonHeaderDirective(templateUrls) {

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