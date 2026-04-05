package io.ktor.client.plugins.websocket;

import av.e;
import io.ktor.client.call.HttpClientCall;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketSession;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface ClientWebSocketSession extends WebSocketSession {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static Object send(ClientWebSocketSession clientWebSocketSession, Frame frame, d<? super x0> dVar) {
            Object objSend = WebSocketSession.DefaultImpls.send(clientWebSocketSession, frame, dVar);
            return objSend == e.getCOROUTINE_SUSPENDED() ? objSend : x0.f87415a;
        }
    }

    HttpClientCall getCall();
}
