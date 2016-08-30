Error.stackTraceLimit = Infinity;
jasmine.DEFAULT_TIMEOUT_INTERVAL = 10000;
__karma__.loaded = function () {
};

var distPath = '/base/dist/';
var appPaths = ['app'];
function isJsFile(path) {
    return path.slice(-3) === '.js';
}

function isSpecFile(path) {
    return path.slice(-8) === '.spec.js';
}

function isAppFile(path) {
    return isJsFile(path) && appPaths.some(function (appPath) {
            var fullAppPath = distPath + appPath + '/';
            return path.substr(0, fullAppPath.length) === fullAppPath;
        });
}

var allSpecFiles = Object.keys(window.__karma__.files).filter(isSpecFile).filter(isAppFile);
System.config({baseUrl: distPath});

System.import('system-config.js').then(function () {
    return Promise.all([
        System.import('@angular/core/testing'), System.import('@angular/platform-browser-dynamic/testing')])
        .then(function (providers) {
            var testing = providers[0];
            var testingBrowser = providers[1];
            testing.setBaseTestProviders(testingBrowser.TEST_BROWSER_DYNAMIC_PLATFORM_PROVIDERS, testingBrowser.TEST_BROWSER_DYNAMIC_APPLICATION_PROVIDERS);
        });
}).then(function () {
    return Promise.all(allSpecFiles.map(function (moduleName) {
        return System.import(moduleName)
    }));
})
    .then(__karam__.start, __karma__.errors);