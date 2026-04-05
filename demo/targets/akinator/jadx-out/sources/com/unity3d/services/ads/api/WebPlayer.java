package com.unity3d.services.ads.api;

import com.unity3d.services.ads.webplayer.WebPlayerError;
import com.unity3d.services.ads.webplayer.WebPlayerEventBridge;
import com.unity3d.services.ads.webplayer.WebPlayerSettingsCache;
import com.unity3d.services.ads.webplayer.WebPlayerView;
import com.unity3d.services.ads.webplayer.WebPlayerViewCache;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class WebPlayer {
    @WebViewExposed
    public static void clearSettings(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        WebPlayerSettingsCache webPlayerSettingsCache = WebPlayerSettingsCache.getInstance();
        webPlayerSettingsCache.removeWebSettings(str);
        webPlayerSettingsCache.removeWebPlayerSettings(str);
        webPlayerSettingsCache.removeWebPlayerEventSettings(str);
        final WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.6
                @Override // java.lang.Runnable
                public void run() throws JSONException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    webPlayer.setSettings(new JSONObject(), new JSONObject());
                    webPlayer.setEventSettings(new JSONObject());
                }
            });
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void getErroredSettings(String str, WebViewCallback webViewCallback) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
            return;
        }
        Map<String, String> erroredSettings = webPlayer.getErroredSettings();
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : erroredSettings.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (Exception e10) {
            DeviceLog.exception("Error forming JSON object", e10);
        }
        webViewCallback.invoke(jSONObject);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void getFrame(final String str, final String str2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        webViewCallback.invoke(new Object[0]);
        final WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str2);
        if (webPlayer != null) {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.7
                @Override // java.lang.Runnable
                public void run() {
                    int[] iArr = new int[2];
                    webPlayer.getLocationOnScreen(iArr);
                    WebPlayerEventBridge.sendGetFrameResponse(str, str2, iArr[0], iArr[1], webPlayer.getWidth(), webPlayer.getHeight(), webPlayer.getAlpha());
                }
            });
        }
    }

    @WebViewExposed
    public static void sendEvent(JSONArray jSONArray, String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            webPlayer.sendEvent(jSONArray);
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setData(final String str, final String str2, final String str3, String str4, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        final WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str4);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.2
                @Override // java.lang.Runnable
                public void run() {
                    webPlayer.loadData(str, str2, str3);
                }
            });
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setDataWithUrl(final String str, final String str2, final String str3, final String str4, String str5, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        final WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str5);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.3
                @Override // java.lang.Runnable
                public void run() {
                    webPlayer.loadDataWithBaseURL(str, str2, str3, str4, null);
                }
            });
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setEventSettings(final JSONObject jSONObject, String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        WebPlayerSettingsCache.getInstance().addWebPlayerEventSettings(str, jSONObject);
        final WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.5
                @Override // java.lang.Runnable
                public void run() {
                    webPlayer.setEventSettings(jSONObject);
                }
            });
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setSettings(final JSONObject jSONObject, final JSONObject jSONObject2, String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        WebPlayerSettingsCache.getInstance().addWebSettings(str, jSONObject);
        WebPlayerSettingsCache.getInstance().addWebPlayerSettings(str, jSONObject2);
        final WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.4
                @Override // java.lang.Runnable
                public void run() throws JSONException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    webPlayer.setSettings(jSONObject, jSONObject2);
                }
            });
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setUrl(final String str, String str2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        final WebPlayerView webPlayer = WebPlayerViewCache.getInstance().getWebPlayer(str2);
        if (webPlayer == null) {
            webViewCallback.error(WebPlayerError.WEBPLAYER_NULL, new Object[0]);
        } else {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.WebPlayer.1
                @Override // java.lang.Runnable
                public void run() {
                    webPlayer.loadUrl(str);
                }
            });
            webViewCallback.invoke(new Object[0]);
        }
    }
}
