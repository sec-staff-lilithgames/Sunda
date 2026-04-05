package com.ironsource;

import com.ironsource.C3313l1;
import com.ironsource.InterfaceC3260i1;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.y5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3542y5 implements Cb {

    /* renamed from: a, reason: collision with root package name */
    private final IronSourceError f39251a;

    /* renamed from: b, reason: collision with root package name */
    private final C3208f3 f39252b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3386p1 f39253c;

    public C3542y5(IronSourceError error, C3208f3 adLoadTaskListener, InterfaceC3386p1 analytics) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.e0.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(analytics, "analytics");
        this.f39251a = error;
        this.f39252b = adLoadTaskListener;
        this.f39253c = analytics;
    }

    public final IronSourceError a() {
        return this.f39251a;
    }

    @Override // com.ironsource.Cb
    public void start() {
        InterfaceC3260i1.c.a aVar = InterfaceC3260i1.c.f36900a;
        aVar.a().a(this.f39253c);
        aVar.a(new C3313l1.j(this.f39251a.getErrorCode()), new C3313l1.k(this.f39251a.getErrorMessage()), new C3313l1.f(0L)).a(this.f39253c);
        this.f39252b.b(this.f39251a);
    }
}
