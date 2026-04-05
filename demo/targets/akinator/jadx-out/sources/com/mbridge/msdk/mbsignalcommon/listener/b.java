package com.mbridge.msdk.mbsignalcommon.listener;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbsignalcommon.windvane.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b implements c {
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void a(WebView webView, String str, Bitmap bitmap) {
        p0.a("WindVaneWebView", "onPageStarted");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public boolean b(WebView webView, String str) {
        p0.a("WindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void c(WebView webView, int i10) {
        p0.a("WindVaneWebView", "onProgressChanged");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void a(WebView webView, int i10, String str, String str2) {
        p0.a("WindVaneWebView", "onReceivedError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void b(WebView webView, int i10) {
        p0.a("WindVaneWebView", "loadingResourceStatus");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        p0.a("WindVaneWebView", "onReceivedSslError");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void a(WebView webView, String str) {
        p0.a("WindVaneWebView", "onPageFinished");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void a(WebView webView, int i10) {
        p0.a("WindVaneWebView", "readyState");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.c
    public void a(WebView webView) {
        p0.a("WindVaneWebView", "onRenderProcessGone");
    }
}
