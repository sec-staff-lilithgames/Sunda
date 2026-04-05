package com.inmobi.media;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.v7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3037v7 implements xv.i0 {
    @Override // xv.i0
    public final xv.v0 intercept(xv.h0 chain) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(chain, "chain");
        xv.v0 v0VarProceed = chain.proceed(chain.request());
        if (v0VarProceed.isRedirect()) {
            kotlin.jvm.internal.e0.checkNotNull(v0VarProceed);
            kotlin.jvm.internal.e0.checkNotNullParameter(v0VarProceed, "<this>");
            String strHeader = v0VarProceed.isRedirect() ? v0VarProceed.header("Location") : null;
            if (strHeader != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter(strHeader, "<this>");
                try {
                    new URL(strHeader);
                } catch (MalformedURLException unused) {
                }
            }
            chain.call().cancel();
            throw new MalformedURLException(AbstractC2811i0.a("Invalid URL in Location header: ", strHeader));
        }
        kotlin.jvm.internal.e0.checkNotNull(v0VarProceed);
        return v0VarProceed;
    }
}
