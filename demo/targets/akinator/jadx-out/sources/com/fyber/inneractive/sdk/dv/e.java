package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements com.fyber.inneractive.sdk.factories.g {
    @Override // com.fyber.inneractive.sdk.factories.g
    public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
        return IAConfigManager.O.G != null && (inneractiveAdSpot.getAdContent() instanceof a);
    }

    @Override // com.fyber.inneractive.sdk.factories.g
    public final com.fyber.inneractive.sdk.interfaces.f b(InneractiveAdSpot inneractiveAdSpot) {
        InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().f23944a;
        boolean z10 = inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen();
        if (inneractiveAdSpot.getAdContent().c() && z10) {
            return inneractiveAdSpot.getAdContent().b().f26644p == UnitDisplayType.INTERSTITIAL ? new com.fyber.inneractive.sdk.dv.interstitial.h() : new com.fyber.inneractive.sdk.dv.rewarded.h();
        }
        return null;
    }
}
