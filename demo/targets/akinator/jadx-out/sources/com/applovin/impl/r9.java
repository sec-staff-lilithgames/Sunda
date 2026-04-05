package com.applovin.impl;

import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class r9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f15207c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f15208e;

    public /* synthetic */ r9(WebView webView, String str, int i10) {
        this.f15206b = i10;
        this.f15207c = webView;
        this.f15208e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15206b) {
            case 0:
                this.f15207c.evaluateJavascript(this.f15208e, null);
                break;
            default:
                this.f15207c.loadUrl(this.f15208e);
                break;
        }
    }
}
