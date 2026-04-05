package com.inmobi.media;

import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f32171a;

    public Q9(WebView webView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(webView, "webView");
        this.f32171a = new WeakReference(webView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = (WebView) this.f32171a.get();
        WebSettings settings = webView != null ? webView.getSettings() : null;
        if (settings == null) {
            return;
        }
        settings.setBlockNetworkLoads(true);
    }
}
