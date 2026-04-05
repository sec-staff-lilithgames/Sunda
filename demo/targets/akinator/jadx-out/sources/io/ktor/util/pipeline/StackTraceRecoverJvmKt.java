package io.ktor.util.pipeline;

import io.ktor.utils.io.ExceptionUtilsJvmKt;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StackTraceRecoverJvmKt {
    public static final Throwable withCause(Throwable th2, Throwable th3) {
        Throwable thTryCopyException;
        e0.checkNotNullParameter(th2, "<this>");
        if (th3 == null || e0.areEqual(th2.getCause(), th3) || (thTryCopyException = ExceptionUtilsJvmKt.tryCopyException(th2, th3)) == null) {
            return th2;
        }
        thTryCopyException.setStackTrace(th2.getStackTrace());
        return thTryCopyException;
    }
}
