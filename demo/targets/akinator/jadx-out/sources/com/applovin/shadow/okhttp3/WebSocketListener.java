package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.ByteString;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i10, String reason) {
        e0.checkNotNullParameter(webSocket, "webSocket");
        e0.checkNotNullParameter(reason, "reason");
    }

    public void onClosing(WebSocket webSocket, int i10, String reason) {
        e0.checkNotNullParameter(webSocket, "webSocket");
        e0.checkNotNullParameter(reason, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable t10, Response response) {
        e0.checkNotNullParameter(webSocket, "webSocket");
        e0.checkNotNullParameter(t10, "t");
    }

    public void onMessage(WebSocket webSocket, ByteString bytes) {
        e0.checkNotNullParameter(webSocket, "webSocket");
        e0.checkNotNullParameter(bytes, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        e0.checkNotNullParameter(webSocket, "webSocket");
        e0.checkNotNullParameter(response, "response");
    }

    public void onMessage(WebSocket webSocket, String text) {
        e0.checkNotNullParameter(webSocket, "webSocket");
        e0.checkNotNullParameter(text, "text");
    }
}
