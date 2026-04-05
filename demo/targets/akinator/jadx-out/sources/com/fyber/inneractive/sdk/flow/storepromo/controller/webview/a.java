package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

import com.fyber.inneractive.sdk.web.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends m {

    /* renamed from: h, reason: collision with root package name */
    public final b f23808h;

    public a(b bVar) {
        this.f23808h = bVar;
        setWebViewClient(bVar);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setOverScrollMode(2);
    }

    @Override // com.fyber.inneractive.sdk.web.m, android.webkit.WebView
    public final void destroy() {
        b bVar = this.f23808h;
        bVar.f23810a = null;
        bVar.f23811b = null;
        super.destroy();
    }
}
