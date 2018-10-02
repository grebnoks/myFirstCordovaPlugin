public class MyCordovaPlugin extends CordovaPlugin {
    private static final String TAG = "MyCordovaPlugin";

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        supper.initialize(cordova, webView);

        Log.d(TAG, "Initializing MyCordovaPlugin");
    }

    public boolean execute(String action, JSONArray args, final CallbackContent callbackContent) throws JSONException {
        if(action.equals("echo")) {
            String phrase = args.getString(0);
            //Echo back the first argument
            Log.d(TAG, phrase);
        } else if(action.equals("getDate")) {
            //An example of returning data back to the web layer]
            final PluginResult result = new PluginResult(PluginResult.Status.OK, (new Date()).toString());
            callbackContent.sendPluginResult(result);
        }
        return true;
    }
}