package io.ktor.client.plugins.websocket;

import io.ktor.client.engine.HttpClientEngineCapability;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class WebSocketExtensionsCapability implements HttpClientEngineCapability<x0> {
    public static final WebSocketExtensionsCapability INSTANCE = new WebSocketExtensionsCapability();

    private WebSocketExtensionsCapability() {
    }

    public String toString() {
        return "WebSocketExtensionsCapability";
    }
}
