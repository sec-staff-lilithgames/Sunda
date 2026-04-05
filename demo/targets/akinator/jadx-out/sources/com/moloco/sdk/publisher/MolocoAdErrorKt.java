package com.moloco.sdk.publisher;

import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MolocoAdErrorKt {
    public static final MolocoAdError createAdErrorInfo(String adUnitId, MolocoAdError.ErrorType errorType) {
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(errorType, "errorType");
        return new MolocoAdError("Moloco", adUnitId, errorType, null, 8, null);
    }
}
