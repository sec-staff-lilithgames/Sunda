package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g extends e {
    public long N;
    public com.fyber.inneractive.sdk.model.vast.b O;
    public final ArrayList R = new ArrayList();
    public final LinkedHashMap P = new LinkedHashMap();
    public final ArrayList Q = new ArrayList();
    public final LinkedHashMap S = new LinkedHashMap();

    @Override // com.fyber.inneractive.sdk.response.e
    public InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar) {
        return com.fyber.inneractive.sdk.flow.vast.j.a(inneractiveAdRequest, this, rVar);
    }

    @Override // com.fyber.inneractive.sdk.response.e
    public InneractiveErrorCode b() {
        return a(null, null);
    }
}
