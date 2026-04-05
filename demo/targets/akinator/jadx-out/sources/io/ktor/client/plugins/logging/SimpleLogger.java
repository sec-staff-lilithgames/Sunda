package io.ktor.client.plugins.logging;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
final class SimpleLogger implements Logger {
    @Override // io.ktor.client.plugins.logging.Logger
    public void log(String message) {
        e0.checkNotNullParameter(message, "message");
        System.out.println((Object) ("HttpClient: " + message));
    }
}
