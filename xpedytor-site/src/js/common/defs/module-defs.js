/**
 * Created by chakushy on 3/10/16.
 */
'use strict';

function initializeCommonModule(logService) {
    var validation = logService;
    if (validation) {
        logService.info('Common Module initialized!');
    }
}