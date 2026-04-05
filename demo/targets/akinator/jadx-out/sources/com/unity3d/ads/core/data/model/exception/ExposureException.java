package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ExposureException extends Exception {
    private final Object[] parameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureException(String message, Object[] parameters) {
        super(message);
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(parameters, "parameters");
        this.parameters = parameters;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }
}
