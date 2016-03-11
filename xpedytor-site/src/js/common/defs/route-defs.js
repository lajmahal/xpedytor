/**
 * Created by chakushy on 3/11/16.
 */
'use strict';

// initialize module - implementation
function initializeCommonRoutesModule(logService) {
    if (logService) {
        logService.info("Common Routes Module initialized!");
    }
}

// configure router - implementation
function configureCommonRouter(stateProvider, urlRouterProvider, templateURLs) {
    var validation = stateProvider && urlRouterProvider && templateURLs;
    if (validation) {

        // home state
        stateProvider.state('tables', {
            url: '/tables',
            templateUrl: function () {
                return templateURLs.tables;
            },
            controller: 'xpdTablesViewController'
        });

        // all other states
        urlRouterProvider.otherwise('/tables');
    }
}