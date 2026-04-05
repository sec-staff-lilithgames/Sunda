package com.unity3d.ads.beta;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UnityAdsError {
    private final int code;
    private final String message;

    public UnityAdsError(int i10, String message) {
        e0.checkNotNullParameter(message, "message");
        this.code = i10;
        this.message = message;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}
