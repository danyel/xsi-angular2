'use strict';
const map: any = {};
const packages: any = {
    'angular2-busy': {
        format: 'cjs',
        main: 'index.js'
    }
};

const barrels: string[] = [
    '@angular/core',
    '@angular/common',
    '@angular/compiler',
    '@angular/forms',
    '@angular/http',
    '@angular/router',
    '@angular/platform-browser',
    '@angular/platform-browser-dynamic',
    'rxjs',
    'app'
];

const cliSystemConfigPackages: any = {};
barrels.forEach((barrelName: string)=> {
    cliSystemConfigPackages[barrelName] = {main: 'index'};
});
declare var System: any;
System.config({
    map: {
        '@angular': 'vendor/@angular',
        'rxjs': 'vendor/rxjs',
        'angular2-busy': 'vendor/angular2-busy',
        'main': 'main.js'
    },
    packages: cliSystemConfigPackages
});
System.config({map, packages});