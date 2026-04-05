package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.G5;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23262b;

    public f0(String str, String str2) {
        this.f23261a = str;
        this.f23262b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (iAConfigManager.L == null && (context = iAConfigManager.f23211f) != null) {
            try {
                webView = new WebView(context);
                webView.setWebViewClient(new y());
            } catch (Throwable unused) {
                IAlog.a("failed to create a new webview", new Object[0]);
                webView = null;
            }
            iAConfigManager.L = webView;
        }
        WebView webView2 = iAConfigManager.L;
        String str = this.f23261a;
        String str2 = this.f23262b;
        if (webView2 != null) {
            if (str2 == null) {
                str2 = "";
            }
            webView2.loadDataWithBaseURL(str, str2, "text/html", G5.N, null);
        }
        com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(IAConfigManager.Q, TimeUnit.SECONDS.toMillis(10L));
    }
}
