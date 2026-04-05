package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class r {

    /* renamed from: a, reason: collision with root package name */
    private s f38675a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f38676b = false;

    public r(s sVar) {
        this.f38675a = sVar;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.f38676b) {
            return "";
        }
        this.f38676b = true;
        return this.f38675a.b();
    }
}
