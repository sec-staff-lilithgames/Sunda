package com.unity3d.services.core.configuration;

import android.webkit.JavascriptInterface;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class EnvironmentCheck {
    private static boolean hasJavascriptInterface(Method method) {
        Annotation[] annotations = method.getAnnotations();
        if (annotations != null) {
            for (Annotation annotation : annotations) {
                if (annotation instanceof JavascriptInterface) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isEnvironmentOk() {
        return testProGuard() && testCacheDirectory();
    }

    public static boolean testCacheDirectory() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        File cacheDirectory = SdkProperties.getCacheDirectory();
        File webViewCacheDirectory = SdkProperties.getWebViewCacheDirectory();
        if (cacheDirectory == null || webViewCacheDirectory == null) {
            DeviceLog.error("Unity Ads cache directory check fail: no working cache directory available");
            return false;
        }
        DeviceLog.debug("Unity Ads cache directory check OK");
        return true;
    }

    public static boolean testProGuard() throws NoSuchMethodException, SecurityException {
        try {
            Method method = WebViewBridgeInterface.class.getMethod("handleInvocation", String.class);
            Method method2 = WebViewBridgeInterface.class.getMethod("handleCallback", String.class, String.class, String.class);
            if (hasJavascriptInterface(method) && hasJavascriptInterface(method2)) {
                DeviceLog.debug("Unity Ads ProGuard check OK");
                return true;
            }
            DeviceLog.error("Unity Ads ProGuard check fail: missing @JavascriptInterface annotations in Unity Ads web bridge");
            return false;
        } catch (ClassNotFoundException e10) {
            DeviceLog.exception("Unity Ads ProGuard check fail: Unity Ads web bridge class not found", e10);
            return false;
        } catch (NoSuchMethodException e11) {
            DeviceLog.exception("Unity Ads ProGuard check fail: Unity Ads web bridge methods not found", e11);
            return false;
        } catch (Exception e12) {
            DeviceLog.exception("Unknown exception during Unity Ads ProGuard check: " + e12.getMessage(), e12);
            return true;
        }
    }
}
