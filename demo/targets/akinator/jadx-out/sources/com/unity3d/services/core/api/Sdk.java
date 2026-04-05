package com.unity3d.services.core.api;

import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.properties.Session;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Sdk {
    @WebViewExposed
    public static void downloadLatestWebView(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads init: WebView called download");
        webViewCallback.invoke(Integer.valueOf(InitializeThread.downloadLatestWebView().getValue()));
    }

    @WebViewExposed
    public static void getDebugMode(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        webViewCallback.invoke(Boolean.valueOf(SdkProperties.getDebugMode()));
    }

    @WebViewExposed
    public static void getSharedSessionID(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        webViewCallback.invoke(Session.Default.getId());
    }

    @WebViewExposed
    public static void getTrrData(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        webViewCallback.invoke(WebViewApp.getCurrentApp().getConfiguration().getRawConfigData().toString());
    }

    @WebViewExposed
    public static void initComplete(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Web Application initialized");
        SdkProperties.setInitialized(true);
        WebViewApp.getCurrentApp().setWebAppInitialized(true);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void initError(String str, Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        WebViewApp.getCurrentApp().setWebAppFailureMessage(str);
        WebViewApp.getCurrentApp().setWebAppFailureCode(num.intValue());
        WebViewApp.getCurrentApp().setWebAppInitialized(false);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void loadComplete(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Web Application loaded");
        WebViewApp.getCurrentApp().setWebAppLoaded(true);
        webViewCallback.invoke(ClientProperties.getGameId(), Boolean.valueOf(SdkProperties.isTestMode()), ClientProperties.getAppName(), ClientProperties.getAppVersion(), Integer.valueOf(SdkProperties.getVersionCode()), SdkProperties.getVersionName(), Boolean.valueOf(ClientProperties.isAppDebuggable()), SdkProperties.getConfigUrl(), WebViewApp.getCurrentApp().getConfiguration().getWebViewUrl(), WebViewApp.getCurrentApp().getConfiguration().getWebViewHash(), WebViewApp.getCurrentApp().getConfiguration().getWebViewVersion(), Long.valueOf(SdkProperties.getInitializationTime()), Boolean.valueOf(SdkProperties.isReinitialized()), Boolean.TRUE, Boolean.valueOf(SdkProperties.getLatestConfiguration() != null), Long.valueOf(Device.getElapsedRealtime()), WebViewApp.getCurrentApp().getConfiguration().getStateId(), PrivacyConfigStorage.getInstance().getPrivacyConfig().getPrivacyStatus().toLowerCase());
    }

    @WebViewExposed
    public static void logDebug(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void logError(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.error(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void logInfo(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.info(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void logWarning(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.warning(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void reinitialize(WebViewCallback webViewCallback) {
        SdkProperties.setReinitialized(true);
        InitializeThread.initialize(WebViewApp.getCurrentApp().getConfiguration());
    }

    @WebViewExposed
    public static void setDebugMode(Boolean bool, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        SdkProperties.setDebugMode(bool.booleanValue());
        webViewCallback.invoke(new Object[0]);
    }
}
