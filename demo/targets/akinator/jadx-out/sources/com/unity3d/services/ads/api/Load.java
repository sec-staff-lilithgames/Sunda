package com.unity3d.services.ads.api;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.load.LoadModule;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Load {
    @WebViewExposed
    public static void sendAdFailedToLoad(String str, String str2, String str3, String str4, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LoadModule.getInstance().onUnityAdsFailedToLoad(str2, UnityAds.UnityAdsLoadError.valueOf(str3), str4);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendAdLoaded(String str, String str2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LoadModule.getInstance().onUnityAdsAdLoaded(str2);
        webViewCallback.invoke(new Object[0]);
    }
}
