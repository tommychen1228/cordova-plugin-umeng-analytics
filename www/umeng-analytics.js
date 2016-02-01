module.exports = {
	initApp:function(androidKey, iosKey, successHandler, errorHandler){
		cordova.exec(successHandler, errorHandler, "UMengAnalyticsPlugin", "initApp", [androidKey, iosKey]);
	},
    resume: function (successHandler, errorHandler) {
        cordova.exec(successHandler, errorHandler, "UMengAnalyticsPlugin", "resume", []);
    },
    pause: function (successHandler, errorHandler) {
        cordova.exec(successHandler, errorHandler, "UMengAnalyticsPlugin", "pause", []);
    }
};