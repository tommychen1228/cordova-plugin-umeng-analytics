module.exports = {
    init: function (successHandler, errorHandler) {
        cordova.exec(successHandler, errorHandler, "UMengAnalyticsPlugin", "init", []);
    }
};