package io.ktor.http;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UnsafeHeaderException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsafeHeaderException(String header) {
        super("Header(s) " + header + " are controlled by the engine and cannot be set explicitly");
        e0.checkNotNullParameter(header, "header");
    }
}
