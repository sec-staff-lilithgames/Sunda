package com.fyber.inneractive.sdk.util;

import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f26797a;

    public o0(WebView webView) {
        this.f26797a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26797a.getSettings().setDisplayZoomControls(false);
    }
}
