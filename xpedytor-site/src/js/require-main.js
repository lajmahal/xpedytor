/**
 * Created by laj on 2/28/16.
 */

'use strict';

console.log('Inside require-main.js');

require.config({
    baseUrl: 'js',
    paths: {
        'angular': '../../../node_modules/angular/angular.min'
    },
    shim: {
        'angular': {
            export: 'angular'
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