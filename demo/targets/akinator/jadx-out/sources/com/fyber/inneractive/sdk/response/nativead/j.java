package com.fyber.inneractive.sdk.response.nativead;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends com.fyber.inneractive.sdk.response.g {
    public final k T = new k();

    @Override // com.fyber.inneractive.sdk.response.g, com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar) {
        InneractiveErrorCode inneractiveErrorCodeA = this.T.d() ? com.fyber.inneractive.sdk.flow.vast.j.a(inneractiveAdRequest, this, rVar) : null;
        if (inneractiveErrorCodeA != null) {
            return inneractiveErrorCodeA;
        }
        this.T.getClass();
        return null;
    }

    @Override // com.fyber.inneractive.sdk.response.g, com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode b() {
        return a(null, null);
    }
}
