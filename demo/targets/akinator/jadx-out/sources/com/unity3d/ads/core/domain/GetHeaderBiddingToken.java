package com.unity3d.ads.core.domain;

import com.unity3d.ads.TokenConfiguration;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface GetHeaderBiddingToken {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetHeaderBiddingToken getHeaderBiddingToken, int i10, TokenConfiguration tokenConfiguration, d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i11 & 2) != 0) {
                tokenConfiguration = null;
            }
            return getHeaderBiddingToken.invoke(i10, tokenConfiguration, dVar);
        }
    }

    Object invoke(int i10, TokenConfiguration tokenConfiguration, d<? super String> dVar);
}
