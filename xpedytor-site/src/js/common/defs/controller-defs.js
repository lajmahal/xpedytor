/**
 * Created by chakushy on 3/11/16.
 */
'use strict';

// initialize the module - implementation
function initializeCommonControllersModule(logService) {
    if (logService) {
        logService.info('Common Controllers Module initialized!');
    }
}

// tables view controller - implementation
function xpdTablesViewController(viewModel, service) {
    if (viewModel && service) {
        service.getTables().then(
            function (data) {
                if (data) {
                    viewModel.tables = data;
                }
            },
            function (error) {
                viewModel.errorMessage = 'Error occurred, details: ' + JSON.stringify(error);

                throw error;
            }
        );
    }
}