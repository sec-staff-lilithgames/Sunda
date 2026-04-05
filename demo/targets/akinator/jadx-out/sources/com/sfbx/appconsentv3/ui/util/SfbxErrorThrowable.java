package com.sfbx.appconsentv3.ui.util;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SfbxErrorThrowable extends RuntimeException {
    private final Throwable cause;
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfbxErrorThrowable(String message, Throwable th2) {
        super(message, th2);
        e0.checkNotNullParameter(message, "message");
        this.message = message;
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
