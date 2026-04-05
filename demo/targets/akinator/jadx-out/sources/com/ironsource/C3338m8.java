package com.ironsource;

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.m8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3338m8 {

    /* renamed from: a, reason: collision with root package name */
    private C3393p8 f37212a;

    public C3338m8(C3393p8 c3393p8) {
        this.f37212a = c3393p8;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.f37212a.handleMessageFromAd(str);
    }
}
