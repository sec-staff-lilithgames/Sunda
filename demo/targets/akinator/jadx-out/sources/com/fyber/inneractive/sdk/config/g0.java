package com.fyber.inneractive.sdk.config;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        WebView webView2 = iAConfigManager.L;
        if (webView2 == null || iAConfigManager.f23211f == null) {
            return;
        }
        webView2.destroy();
        try {
            webView = new WebView(iAConfigManager.f23211f);
            webView.setWebViewClient(new y());
        } catch (Throwable unused) {
            IAlog.a("failed to create a new webview", new Object[0]);
            webView = null;
        }
        iAConfigManager.L = webView;
    }
}
