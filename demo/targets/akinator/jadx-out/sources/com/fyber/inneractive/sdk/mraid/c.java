package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements com.fyber.inneractive.sdk.factories.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAMraidKit f24161a;

    public c(IAMraidKit iAMraidKit) {
        this.f24161a = iAMraidKit;
    }

    @Override // com.fyber.inneractive.sdk.factories.g
    public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
        return this.f24161a.isMRaidSpotContent(inneractiveAdSpot);
    }

    @Override // com.fyber.inneractive.sdk.factories.g
    public final com.fyber.inneractive.sdk.interfaces.f b(InneractiveAdSpot inneractiveAdSpot) {
        return new com.fyber.inneractive.sdk.renderers.t();
    }
}
