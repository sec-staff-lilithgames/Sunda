package com.unity3d.services.ads.api;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.show.ShowModule;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Show {
    @WebViewExposed
    public static void sendShowClickEvent(String str, String str2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ShowModule.getInstance().onUnityAdsShowClick(str2);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowCompleteEvent(String str, String str2, String str3, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ShowModule.getInstance().onUnityAdsShowComplete(str2, UnityAds.UnityAdsShowCompletionState.valueOf(str3));
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowConsentEvent(String str, String str2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ShowModule.getInstance().onUnityAdsShowConsent(str2);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowFailedEvent(String str, String str2, String str3, String str4, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ShowModule.getInstance().onUnityAdsShowFailure(str2, UnityAds.UnityAdsShowError.valueOf(str3), str4);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowStartEvent(String str, String str2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ShowModule.getInstance().onUnityAdsShowStart(str2);
        webViewCallback.invoke(new Object[0]);
    }
}
