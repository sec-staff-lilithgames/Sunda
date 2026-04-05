package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AdMarkupJsonError extends VungleError {
    public AdMarkupJsonError(String str) {
        super(Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD, a.b.k("Unable to decode payload into BidPayload object. Error: ", str), null);
    }
}
