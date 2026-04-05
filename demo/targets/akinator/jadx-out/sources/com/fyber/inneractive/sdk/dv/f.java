package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements com.fyber.inneractive.sdk.factories.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f23438a;

    public f(g gVar) {
        this.f23438a = gVar;
    }

    @Override // com.fyber.inneractive.sdk.factories.a
    public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
        this.f23438a.getClass();
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof a);
    }

    @Override // com.fyber.inneractive.sdk.factories.a
    public final com.fyber.inneractive.sdk.interfaces.d a() {
        return new com.fyber.inneractive.sdk.dv.banner.c();
    }
}
