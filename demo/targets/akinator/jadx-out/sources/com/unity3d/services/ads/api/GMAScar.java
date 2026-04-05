package com.unity3d.services.ads.api;

import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import kl.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class GMAScar {
    private static final GMAScarAdapterBridge gmaScarAdapterBridge = GMA.getInstance().getBridge();

    @WebViewExposed
    public static void getSCARSignal(String str, String str2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gmaScarAdapterBridge.getSCARSignal(str, e.valueOf(str2.toUpperCase()));
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void getVersion(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gmaScarAdapterBridge.getVersion();
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void initializeScar(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gmaScarAdapterBridge.initializeScar();
        webViewCallback.invoke(new Object[0]);
    }

    public static void isInitialized(WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gmaScarAdapterBridge.isInitialized();
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void load(String str, String str2, Boolean bool, String str3, String str4, Integer num, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gmaScarAdapterBridge.load(bool.booleanValue(), str, str2, str4, str3, num.intValue());
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void show(String str, String str2, Boolean bool, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        gmaScarAdapterBridge.show(str, str2);
        webViewCallback.invoke(new Object[0]);
    }
}
