package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.a3;
import com.applovin.impl.c8;
import com.applovin.impl.d8;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b implements d8.a {

    /* renamed from: a, reason: collision with root package name */
    private final k f14593a;

    /* renamed from: b, reason: collision with root package name */
    private final a3 f14594b;

    /* renamed from: c, reason: collision with root package name */
    private final d8 f14595c;

    /* renamed from: d, reason: collision with root package name */
    private final c8 f14596d;

    /* renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0034a f14597e;

    public b(a3 a3Var, ViewGroup viewGroup, a.InterfaceC0034a interfaceC0034a, k kVar) {
        this.f14593a = kVar;
        this.f14594b = a3Var;
        this.f14597e = interfaceC0034a;
        this.f14596d = new c8(viewGroup, kVar);
        d8 d8Var = new d8(viewGroup, kVar, this);
        this.f14595c = d8Var;
        d8Var.a(a3Var);
        kVar.O();
        if (o.a()) {
            kVar.O().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f14595c.b();
    }

    public a3 b() {
        return this.f14594b;
    }

    public void c() {
        this.f14593a.O();
        if (o.a()) {
            this.f14593a.O().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f14594b.o0().compareAndSet(false, true)) {
            this.f14593a.O();
            if (o.a()) {
                this.f14593a.O().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f14594b.getNativeAd().isExpired()) {
                o.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f14593a.f().a(this.f14594b);
            }
            this.f14593a.X().processRawAdImpression(this.f14594b, this.f14597e);
        }
    }

    @Override // com.applovin.impl.d8.a
    public void onLogVisibilityImpression() {
        a(this.f14596d.a(this.f14594b));
    }

    private void a(long j10) {
        if (this.f14594b.p0().compareAndSet(false, true)) {
            this.f14593a.O();
            if (o.a()) {
                this.f14593a.O().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f14593a.X().processViewabilityAdImpressionPostback(this.f14594b, j10, this.f14597e);
        }
    }
}
