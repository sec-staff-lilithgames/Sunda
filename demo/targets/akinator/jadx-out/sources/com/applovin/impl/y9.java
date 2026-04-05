package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class y9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16313c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f16314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaxAd f16315f;

    public /* synthetic */ y9(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd, int i10) {
        this.f16312b = i10;
        this.f16313c = z10;
        this.f16314e = maxAdListener;
        this.f16315f = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16312b) {
            case 0:
                q2.a(this.f16313c, this.f16314e, this.f16315f);
                break;
            case 1:
                q2.f(this.f16313c, this.f16314e, this.f16315f);
                break;
            case 2:
                q2.e(this.f16313c, this.f16314e, this.f16315f);
                break;
            default:
                q2.c(this.f16313c, this.f16314e, this.f16315f);
                break;
        }
    }
}
