package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class A5 implements Cb {

    /* renamed from: a, reason: collision with root package name */
    private final InterstitialAdRequest f33824a;

    /* renamed from: b, reason: collision with root package name */
    private final C3546y9 f33825b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3386p1 f33826c;

    /* renamed from: d, reason: collision with root package name */
    private final IronSourceError f33827d;

    public A5(InterstitialAdRequest adRequest, C3546y9 adLoadTaskListener, InterfaceC3386p1 analytics, IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f33824a = adRequest;
        this.f33825b = adLoadTaskListener;
        this.f33826c = analytics;
        this.f33827d = error;
    }

    public final IronSourceError a() {
        return this.f33827d;
    }

    @Override // com.ironsource.Cb
    public void start() {
        C3508w5 c3508w5 = new C3508w5(this.f33826c, this.f33824a.getAdId$mediationsdk_release(), this.f33824a.getProviderName$mediationsdk_release());
        c3508w5.a();
        c3508w5.a(this.f33827d);
        this.f33825b.b(this.f33827d);
    }
}
