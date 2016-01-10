module.exports = {
    resume: function (successHandler, errorHandler) {
        cordova.exec(successHandler, errorHandler, "UMengAnalyticsPlugin", "resume", []);
    },
    pause: function (successHandler, errorHandler) {
        cordova.exec(successHandler, errorHandler, "UMengAnalyticsPlugin", "pause", []);
    }
};