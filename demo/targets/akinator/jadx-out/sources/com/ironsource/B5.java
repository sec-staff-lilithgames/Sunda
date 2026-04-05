package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class B5 implements Cb {

    /* renamed from: a, reason: collision with root package name */
    private final RewardedAdRequest f33882a;

    /* renamed from: b, reason: collision with root package name */
    private final Rd f33883b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3386p1 f33884c;

    /* renamed from: d, reason: collision with root package name */
    private final IronSourceError f33885d;

    public B5(RewardedAdRequest adRequest, Rd adLoadTaskListener, InterfaceC3386p1 analytics, IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f33882a = adRequest;
        this.f33883b = adLoadTaskListener;
        this.f33884c = analytics;
        this.f33885d = error;
    }

    public final IronSourceError a() {
        return this.f33885d;
    }

    @Override // com.ironsource.Cb
    public void start() {
        C3508w5 c3508w5 = new C3508w5(this.f33884c, this.f33882a.getAdId$mediationsdk_release(), this.f33882a.getProviderName$mediationsdk_release());
        c3508w5.a();
        c3508w5.a(this.f33885d);
        this.f33883b.b(this.f33885d);
    }
}
