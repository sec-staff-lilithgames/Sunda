package io.ktor.client.plugins.websocket;

import io.ktor.client.call.HttpClientCall;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketExtension;
import io.ktor.websocket.WebSocketSession;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import tu.f;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DelegatingClientWebSocketSession implements ClientWebSocketSession, WebSocketSession {
    private final /* synthetic */ WebSocketSession $$delegate_0;
    private final HttpClientCall call;

    public DelegatingClientWebSocketSession(HttpClientCall call, WebSocketSession session) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(session, "session");
        this.call = call;
        this.$$delegate_0 = session;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object flush(d<? super x0> dVar) {
        return this.$$delegate_0.flush(dVar);
    }

    @Override // io.ktor.client.plugins.websocket.ClientWebSocketSession
    public HttpClientCall getCall() {
        return this.call;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public List<WebSocketExtension<?>> getExtensions() {
        return this.$$delegate_0.getExtensions();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public ReceiveChannel<Frame> getIncoming() {
        return this.$$delegate_0.getIncoming();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return this.$$delegate_0.getMasking();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return this.$$delegate_0.getMaxFrameSize();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public SendChannel<Frame> getOutgoing() {
        return this.$$delegate_0.getOutgoing();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object send(Frame frame, d<? super x0> dVar) {
        return this.$$delegate_0.send(frame, dVar);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z10) {
        this.$$delegate_0.setMasking(z10);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j10) {
        this.$$delegate_0.setMaxFrameSize(j10);
    }

    @Override // io.ktor.websocket.WebSocketSession
    @f
    public void terminate() {
        this.$$delegate_0.terminate();
    }
}
