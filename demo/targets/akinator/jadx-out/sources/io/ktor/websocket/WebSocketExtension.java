package io.ktor.websocket;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface WebSocketExtension<ConfigType> {
    boolean clientNegotiation(List<WebSocketExtensionHeader> list);

    WebSocketExtensionFactory<ConfigType, ? extends WebSocketExtension<ConfigType>> getFactory();

    List<WebSocketExtensionHeader> getProtocols();

    Frame processIncomingFrame(Frame frame);

    Frame processOutgoingFrame(Frame frame);

    List<WebSocketExtensionHeader> serverNegotiation(List<WebSocketExtensionHeader> list);
}
