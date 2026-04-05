package io.ktor.util.pipeline;

import kotlin.jvm.internal.e0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StackTraceRecoverKt {
    public static final Throwable recoverStackTraceBridge(Throwable exception, d<?> continuation) {
        e0.checkNotNullParameter(exception, "exception");
        e0.checkNotNullParameter(continuation, "continuation");
        try {
            return StackTraceRecoverJvmKt.withCause(exception, exception.getCause());
        } catch (Throwable unused) {
            return exception;
        }
    }
}
