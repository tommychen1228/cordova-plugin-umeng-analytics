package com.myideaway.cordova.umeng.analytics;

import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.MobclickAgent;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by cdm on 1/5/16.
 */
public class UMengAnalyticsPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("resume")) {
            resume(args, callbackContext);
            return true;
        } else if (action.equals("pause")) {
            pause(args, callbackContext);
            return true;
        } else if (action.equals("initApp")) {
            initApp(args, callbackContext);
            return true;
        }
        return false;
    }

    private void resume(JSONArray args, CallbackContext callbackContext) {
        MobclickAgent.onResume(cordova.getActivity());

        callbackContext.success();
    }

    private void pause(JSONArray args, CallbackContext callbackContext) {
        MobclickAgent.onPause(cordova.getActivity());

        callbackContext.success();
    }

    private void initApp(JSONArray args, CallbackContext callbackContext) {
        String androidAppkey = args.optString(0);
        String iosAppKey = args.optString(1);

        AnalyticsConfig.setAppkey(cordova.getActivity().getApplicationContext(), androidAppkey);

        callbackContext.success();
    }

}
