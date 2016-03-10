/**
 * Created by laj on 2/28/16.
 */
'use strict';

function initializeAppModule(logService) {
    var validation = logService;
    if (validation) {
        logService.info('Application Initialized!');
    }
}