package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NetworkTimeoutError extends VungleError {
    public NetworkTimeoutError() {
        super(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT, "Ads: Network Timeout", null);
    }
}
