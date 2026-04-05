package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class ea implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdDisplayListener f13954c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f13955e;

    public /* synthetic */ ea(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd, int i10) {
        this.f13953b = i10;
        this.f13954c = appLovinAdDisplayListener;
        this.f13955e = appLovinAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13953b) {
            case 0:
                q2.d(this.f13954c, this.f13955e);
                break;
            default:
                q2.c(this.f13954c, this.f13955e);
                break;
        }
    }
}
