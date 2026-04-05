package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class fa implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13990c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdListener f13991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaxAd f13992f;

    public /* synthetic */ fa(boolean z10, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, int i10) {
        this.f13989b = i10;
        this.f13990c = z10;
        this.f13991e = maxNativeAdListener;
        this.f13992f = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13989b) {
            case 0:
                q2.a(this.f13990c, this.f13991e, this.f13992f);
                break;
            default:
                q2.b(this.f13990c, this.f13991e, this.f13992f);
                break;
        }
    }
}
