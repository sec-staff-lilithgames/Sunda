package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PlacementMismatchError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacementMismatchError(String message) {
        super(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH, message, null);
        e0.checkNotNullParameter(message, "message");
    }
}
