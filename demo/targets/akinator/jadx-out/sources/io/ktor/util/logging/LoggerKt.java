package io.ktor.util.logging;

import bx.a;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LoggerKt {
    public static final void error(a aVar, Throwable exception) {
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(exception, "exception");
        String message = exception.getMessage();
        if (message == null) {
            message = "Exception of type " + c1.getOrCreateKotlinClass(exception.getClass());
        }
        aVar.error(message, exception);
    }
}
