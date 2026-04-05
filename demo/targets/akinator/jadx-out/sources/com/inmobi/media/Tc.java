package com.inmobi.media;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Tc implements xv.i0 {
    @Override // xv.i0
    public final xv.v0 intercept(xv.h0 chain) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(chain, "chain");
        xv.o0 o0VarRequest = chain.request();
        o0VarRequest.tag();
        xv.v0 v0VarProceed = chain.proceed(o0VarRequest);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(v0VarProceed, "proceed(...)");
        return v0VarProceed;
    }
}
