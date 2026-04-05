package com.fyber.inneractive.sdk.util;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q0 {
    public static void a(com.fyber.inneractive.sdk.web.m mVar, String str, ValueCallback valueCallback) {
        mVar.evaluateJavascript(str, valueCallback);
    }

    public static void a(WebView webView, String str) {
        webView.evaluateJavascript(str, null);
    }
}
