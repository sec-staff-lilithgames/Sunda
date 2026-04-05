package io.ktor.client.plugins.logging;

import io.ktor.client.plugins.logging.Logger;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class LoggerKt {
    public static final Logger getEMPTY(Logger.Companion companion) {
        e0.checkNotNullParameter(companion, "<this>");
        return new Logger() { // from class: io.ktor.client.plugins.logging.LoggerKt$EMPTY$1
            @Override // io.ktor.client.plugins.logging.Logger
            public void log(String message) {
                e0.checkNotNullParameter(message, "message");
            }
        };
    }

    public static final Logger getSIMPLE(Logger.Companion companion) {
        e0.checkNotNullParameter(companion, "<this>");
        return new SimpleLogger();
    }
}
