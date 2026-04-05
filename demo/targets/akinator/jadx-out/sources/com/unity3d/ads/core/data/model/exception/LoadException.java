package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LoadException extends Exception {
    private final int errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadException(int i10, String message) {
        super(message);
        e0.checkNotNullParameter(message, "message");
        this.errorCode = i10;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
