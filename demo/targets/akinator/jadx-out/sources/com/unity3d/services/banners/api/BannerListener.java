package com.unity3d.services.banners.api;

import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class BannerListener {
    @WebViewExposed
    public static void sendClickEvent(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        BannerViewCache.getInstance().triggerBannerClickEvent(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendErrorEvent(String str, Integer num, String str2, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        BannerViewCache.getInstance().triggerBannerErrorEvent(str, new BannerErrorInfo(str2, BannerErrorCode.values()[num.intValue()]));
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendLeaveApplicationEvent(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        BannerViewCache.getInstance().triggerBannerLeftApplicationEvent(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendLoadEvent(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        BannerViewCache.getInstance().triggerBannerLoadEvent(str);
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowEvent(String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        BannerViewCache.getInstance().triggerBannerShowEvent(str);
        webViewCallback.invoke(new Object[0]);
    }
}
