package io.ktor.client.plugins.websocket;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class WebSocketException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketException(String message, Throwable th2) {
        super(message, th2);
        e0.checkNotNullParameter(message, "message");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebSocketException(String message) {
        this(message, null);
        e0.checkNotNullParameter(message, "message");
    }
}
