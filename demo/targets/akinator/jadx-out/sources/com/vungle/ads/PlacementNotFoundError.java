package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PlacementNotFoundError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacementNotFoundError(String placementId) {
        super(Sdk.SDKError.Reason.INVALID_PLACEMENT_ID, a.b.l("Placement '", placementId, "' is invalid"), null);
        e0.checkNotNullParameter(placementId, "placementId");
    }
}
