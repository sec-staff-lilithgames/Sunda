package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AdRetryActiveError extends VungleError {
    public AdRetryActiveError() {
        super(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER, "Ads: Server Retry Error active", null);
    }
}
