
var exec = require('cordova/exec');

var PLUGIN_NAME = 'MyCordovaPlugin';


//Use will be as follows:
// window.MyCordovaPlugin.echo(‘Hello!’, function() { //callback })
var MyCordovaPlugin = {
    echo: function(phrase, cb) {
        exec(cb, null, PLUGIN_NAME, 'echo', [phrase]);
    },
    getDate: function (cb) {
        exec(cb, null, PLUGIN_NAME, 'getDate', []);
    }
};

module.exports = MyCordovaPlugin;