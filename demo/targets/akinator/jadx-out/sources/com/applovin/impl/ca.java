package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class ca implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13795c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewAdListener f13796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaxAd f13797f;

    public /* synthetic */ ca(boolean z10, MaxAdViewAdListener maxAdViewAdListener, MaxAd maxAd, int i10) {
        this.f13794b = i10;
        this.f13795c = z10;
        this.f13796e = maxAdViewAdListener;
        this.f13797f = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13794b) {
            case 0:
                q2.b(this.f13795c, this.f13796e, this.f13797f);
                break;
            default:
                q2.d(this.f13795c, this.f13796e, this.f13797f);
                break;
        }
    }
}
