package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HeartbeatMissingError extends VungleError {
    public HeartbeatMissingError() {
        super(Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT, "Ad closed without receiving heartbeat", null);
    }
}
