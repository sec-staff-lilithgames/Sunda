package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.j0;
import com.fyber.inneractive.sdk.flow.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class NativeAdImageContentController extends j0 {
    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        x adContent = inneractiveAdSpot.getAdContent();
        return (adContent instanceof NativeAdContent) && !adContent.isVideoAd();
    }
}
