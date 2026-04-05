package io.ktor.client.plugins.websocket;

import bx.a;
import io.ktor.util.AttributeKey;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.websocket.WebSocketExtension;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class WebSocketsKt {
    private static final AttributeKey<List<WebSocketExtension<?>>> REQUEST_EXTENSIONS_KEY = new AttributeKey<>("Websocket extensions");
    private static final a LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.websocket.WebSockets");

    public static final a getLOGGER() {
        return LOGGER;
    }
}
