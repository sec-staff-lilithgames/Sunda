package com.unity3d.ads.core.domain;

import com.unity3d.services.core.network.core.HttpClient;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface HttpClientProvider {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(HttpClientProvider httpClientProvider, boolean z10, d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return httpClientProvider.invoke(z10, dVar);
        }
    }

    Object invoke(boolean z10, d<? super HttpClient> dVar);
}
