package com.applovin.impl;

import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class l9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f14401c;

    public /* synthetic */ l9(WebView webView, int i10) {
        this.f14400b = i10;
        this.f14401c = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14400b) {
            case 0:
                this.f14401c.destroy();
                break;
            default:
                l8.a(this.f14401c);
                break;
        }
    }
}
