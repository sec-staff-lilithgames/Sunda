package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f24028a;

    public c(e eVar) {
        this.f24028a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("clearing webview", new Object[0]);
        WebView webView = this.f24028a.f24033e;
        if (webView != null) {
            webView.destroy();
            this.f24028a.f24033e = null;
        }
    }
}
