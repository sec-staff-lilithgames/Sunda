package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class x9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewEventListener f16218c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f16219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdView f16220f;

    public /* synthetic */ x9(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, int i10) {
        this.f16217b = i10;
        this.f16218c = appLovinAdViewEventListener;
        this.f16219e = appLovinAd;
        this.f16220f = appLovinAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16217b) {
            case 0:
                q2.e(this.f16218c, this.f16219e, this.f16220f);
                break;
            case 1:
                q2.f(this.f16218c, this.f16219e, this.f16220f);
                break;
            default:
                q2.d(this.f16218c, this.f16219e, this.f16220f);
                break;
        }
    }
}
