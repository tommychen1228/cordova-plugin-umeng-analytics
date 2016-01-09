package com.myideaway.cordova.umeng.update;

import com.umeng.update.UmengUpdateAgent;

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
        if (action.equals("init")) {
            init(args, callbackContext);
            return true;
        }

        return false;
    }

    private void init(JSONArray args, CallbackContext callbackContext) {
        UmengUpdateAgent.setUpdateOnlyWifi(false);
        UmengUpdateAgent.update(cordova.getActivity());

        callbackContext.success();
    }


}
