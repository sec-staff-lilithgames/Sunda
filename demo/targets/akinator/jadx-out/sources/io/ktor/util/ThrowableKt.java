package io.ktor.util;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ThrowableKt {
    public static final Throwable getRootCause(Throwable th2) {
        e0.checkNotNullParameter(th2, "<this>");
        while (true) {
            if ((th2 != null ? th2.getCause() : null) == null) {
                return th2;
            }
            th2 = th2.getCause();
        }
    }

    @InternalAPI
    public static /* synthetic */ void getRootCause$annotations(Throwable th2) {
    }
}
