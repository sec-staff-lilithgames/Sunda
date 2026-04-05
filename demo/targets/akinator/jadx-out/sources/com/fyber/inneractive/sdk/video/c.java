package com.fyber.inneractive.sdk.video;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.g;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.interfaces.f;
import com.fyber.inneractive.sdk.renderers.q;
import com.fyber.inneractive.sdk.renderers.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements g {
    @Override // com.fyber.inneractive.sdk.factories.g
    public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof t0);
    }

    @Override // com.fyber.inneractive.sdk.factories.g
    public final f b(InneractiveAdSpot inneractiveAdSpot) {
        InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().f23944a;
        return (inneractiveAdSpot.getAdContent().c() && (inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen())) ? new v() : new q();
    }
}
