/**
 * Created by laj on 2/28/16.
 */

'use strict';

console.log('Inside require-main.js');

require.config({
    baseUrl: 'js',
    paths: {
        'angular': '../../../js/lib/angular/angular.min',
        'uiRouter': '../../../js/lib/angular-ui-router/release/angular-ui-router.min',
        'ngResource': '../../../js/lib/angular-resource/angular-resource.min'
    },
    shim: {
        'angular': {
            export: 'angular'
        },
        'uiRouter': {
            depends: ['angular'],
            export: 'uiRouter'
        },
        'ngResource': {
            depends: ['angular'],
            export: 'ngResource'
        },
        'app': {
            depends: ['angular', 'uiRouter'],
            export: 'app'
        }
    },
});

require(['app'],
    function () {
        angular.element(document).ready(
            function () {
                angular.bootstrap(document, ['com.xpedytor.app']);
            }
        );
    }
);