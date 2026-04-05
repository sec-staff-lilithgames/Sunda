package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements com.fyber.inneractive.sdk.factories.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAMraidKit f24164a;

    public d(IAMraidKit iAMraidKit) {
        this.f24164a = iAMraidKit;
    }

    @Override // com.fyber.inneractive.sdk.factories.a
    public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
        return this.f24164a.isMRaidSpotContent(inneractiveAdSpot);
    }

    @Override // com.fyber.inneractive.sdk.factories.a
    public final com.fyber.inneractive.sdk.interfaces.d a() {
        return new com.fyber.inneractive.sdk.renderers.l();
    }
}
