package io.ktor.util.internal;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ExceptionUtilsJvmKt {
    public static final void initCauseBridge(Throwable th2, Throwable cause) {
        e0.checkNotNullParameter(th2, "<this>");
        e0.checkNotNullParameter(cause, "cause");
        th2.initCause(cause);
    }
}
