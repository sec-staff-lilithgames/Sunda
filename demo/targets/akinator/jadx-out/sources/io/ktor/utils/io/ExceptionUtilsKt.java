package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ExceptionUtilsKt {
    public static final Throwable unwrapCancellationException(Throwable th2) {
        e0.checkNotNullParameter(th2, "<this>");
        Throwable th3 = th2;
        while (th3 instanceof CancellationException) {
            if (e0.areEqual(th3, th3.getCause())) {
                return th2;
            }
            Throwable cause = th3.getCause();
            if (cause == null) {
                return th3;
            }
            th3 = cause;
        }
        return th3;
    }
}
