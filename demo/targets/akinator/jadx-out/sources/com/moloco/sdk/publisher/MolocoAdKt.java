package com.moloco.sdk.publisher;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MolocoAdKt {
    public static final MolocoAd createAdInfo(String adUnitId, Float f10) {
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        return new MolocoAd("Moloco", adUnitId, f10);
    }

    public static /* synthetic */ MolocoAd createAdInfo$default(String str, Float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = null;
        }
        return createAdInfo(str, f10);
    }
}
