package com.fyber.inneractive.sdk.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInternalBrowserActivity f23055a;

    public e(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f23055a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        this.f23055a.setTitle("Page is Loading...");
        this.f23055a.setProgress(i10 * 100);
        if (i10 == 100) {
            this.f23055a.setTitle(webView.getUrl());
        }
    }
}
