package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class EmptyBidPayloadError extends VungleError {
    public EmptyBidPayloadError(String str) {
        super(Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD, o2.l(str, " header bidding status does not match with loadAd parameters"), null);
    }
}
