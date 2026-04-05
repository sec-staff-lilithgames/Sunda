package io.ktor.client.utils;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ExceptionUtilsJvmKt {
    public static final Throwable unwrapCancellationException(Throwable th2) {
        e0.checkNotNullParameter(th2, "<this>");
        Throwable cause = th2;
        while (true) {
            if (!(cause instanceof CancellationException)) {
                if (cause == null) {
                    break;
                }
                return cause;
            }
            CancellationException cancellationException = (CancellationException) cause;
            if (e0.areEqual(cause, cancellationException.getCause())) {
                break;
            }
            cause = cancellationException.getCause();
        }
        return th2;
    }
}
