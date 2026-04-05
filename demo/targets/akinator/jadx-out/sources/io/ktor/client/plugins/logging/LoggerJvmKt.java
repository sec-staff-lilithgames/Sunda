package io.ktor.client.plugins.logging;

import bx.a;
import bx.b;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.logging.Logger;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class LoggerJvmKt {
    public static final Logger getANDROID(Logger.Companion companion) {
        e0.checkNotNullParameter(companion, "<this>");
        return new MessageLengthLimitingLogger(0, 0, null, 7, null);
    }

    public static final Logger getDEFAULT(Logger.Companion companion) {
        e0.checkNotNullParameter(companion, "<this>");
        return new Logger() { // from class: io.ktor.client.plugins.logging.LoggerJvmKt$DEFAULT$1
            private final a delegate;

            {
                a logger = b.getLogger((Class<?>) HttpClient.class);
                e0.checkNotNull(logger);
                this.delegate = logger;
            }

            @Override // io.ktor.client.plugins.logging.Logger
            public void log(String message) {
                e0.checkNotNullParameter(message, "message");
                this.delegate.info(message);
            }
        };
    }
}
