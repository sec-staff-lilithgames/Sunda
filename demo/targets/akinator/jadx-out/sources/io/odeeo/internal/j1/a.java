package io.odeeo.internal.j1;

import java.io.IOException;
import java.util.Set;
import kotlin.jvm.internal.e0;
import xv.g0;
import xv.h0;
import xv.i0;
import xv.o0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements i0 {
    @Override // xv.i0
    public v0 intercept(h0 chain) throws IOException {
        e0.checkNotNullParameter(chain, "chain");
        o0 o0VarRequest = chain.request();
        g0 g0VarUrl = o0VarRequest.url();
        g0.a aVarNewBuilder = g0VarUrl.newBuilder();
        Set<String> setQueryParameterNames = g0VarUrl.queryParameterNames();
        e0.checkNotNullExpressionValue(setQueryParameterNames, "originalUrl.queryParameterNames()");
        for (String str : setQueryParameterNames) {
            String strQueryParameter = g0VarUrl.queryParameter(str);
            if (strQueryParameter == null || strQueryParameter.length() == 0) {
                aVarNewBuilder.removeAllQueryParameters(str);
            }
        }
        v0 v0VarProceed = chain.proceed(o0VarRequest.newBuilder().url(aVarNewBuilder.build()).build());
        e0.checkNotNullExpressionValue(v0VarProceed, "chain.proceed(newRequest)");
        return v0VarProceed;
    }
}
