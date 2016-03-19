/**
 * Created by chakushy on 3/11/16.
 */
'use strict';

// initialize the module - implementation
function initializeCommonServicesModule(logService) {
    logService.info('Common Services Module initialized!');
}

// tables service - implentation
function xpdTablesService(restService, serviceURLs) {
    var serviceDefinition = {};

    if (restService && serviceURLs) {
        var restServiceURL = serviceURLs.baseURL + serviceURLs.tablesService;
        var tablesService = restService(restServiceURL);

        serviceDefinition = {
            getTables: function () {
                return tablesService.query().$promise;
            }
        };
    }

    return serviceDefinition;
}