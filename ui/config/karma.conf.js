module.exports = function (config) {
    config.set({
        basepath: '..',
        frameworks: ['jasmine'],
        plugins: [require('karma-jasmine'), require('karma-chrome-launcher')],
        files: [
            {pattern: 'dist/vendor/es6-shim.js', included: true, watched: false},
            {pattern: 'dist/vendor/zone.js/zone.js', included: true, watched: false},
            {pattern: 'dist/vendor/reflect-metadata/Reflect.js', included: true, watched: false},
            {pattern: 'dist/vendor/systemjs/dist/system-polyfills.js', included: true, watched: false},
            {pattern: 'dist/vendor/systemjs/dist/system.src.js', included: true, watched: false},
            {pattern: 'dist/vendor/zone.js/dist/async-test.js', included: true, watched: false},
            {pattern: 'dist/vendor/zone.js/dist/fake-async-test.js', included: true, watched: false},
            {pattern: 'config/karma-test-shim.js', included: true, watched: true},
            {pattern: 'dist/**/*', included: false, watched: true}
        ],
        exclude: [
            'dist/vendor/**/*.spec.js'
        ],
        preprocessors: {},
        reporters: ['progress'],
        port: 9876,
        colors: true,
        logLevel: config.LOG_INFO,
        autoWatch: true,
        browsers: ['Chrome'],
        singleRun: false
    })
};