package com.unity3d.services.core.api;

import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ClassDetection {
    @WebViewExposed
    public static void isMadeWithUnity(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        webViewCallback.invoke(Boolean.valueOf(MadeWithUnityDetector.isMadeWithUnity()));
    }
}
