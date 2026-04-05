package com.ironsource;

import com.ironsource.C3313l1;
import com.ironsource.InterfaceC3260i1;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.w5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3508w5 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3386p1 f39165a;

    public C3508w5(InterfaceC3386p1 analytics, String adRequestAdId, InterfaceC3567zd adRequestProviderName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.e0.checkNotNullParameter(adRequestAdId, "adRequestAdId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adRequestProviderName, "adRequestProviderName");
        this.f39165a = analytics;
        analytics.a(new C3313l1.s(adRequestProviderName.value()), new C3313l1.b(adRequestAdId));
    }

    public final void a() {
        InterfaceC3260i1.c.f36900a.a().a(this.f39165a);
    }

    public final void a(IronSourceError error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        InterfaceC3260i1.c.f36900a.a(new C3313l1.j(error.getErrorCode()), new C3313l1.k(error.getErrorMessage()), new C3313l1.f(0L)).a(this.f39165a);
    }
}
