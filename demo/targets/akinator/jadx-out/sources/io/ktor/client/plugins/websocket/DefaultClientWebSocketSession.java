package io.ktor.client.plugins.websocket;

import io.ktor.client.call.HttpClientCall;
import io.ktor.util.InternalAPI;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.DefaultWebSocketSession;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketExtension;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import tu.f;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DefaultClientWebSocketSession implements ClientWebSocketSession, DefaultWebSocketSession {
    private final /* synthetic */ DefaultWebSocketSession $$delegate_0;
    private final HttpClientCall call;

    public DefaultClientWebSocketSession(HttpClientCall call, DefaultWebSocketSession delegate) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(delegate, "delegate");
        this.call = call;
        this.$$delegate_0 = delegate;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object flush(d<? super x0> dVar) {
        return this.$$delegate_0.flush(dVar);
    }

    @Override // io.ktor.client.plugins.websocket.ClientWebSocketSession
    public HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public Deferred<CloseReason> getCloseReason() {
        return this.$$delegate_0.getCloseReason();
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

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getPingIntervalMillis() {
        return this.$$delegate_0.getPingIntervalMillis();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getTimeoutMillis() {
        return this.$$delegate_0.getTimeoutMillis();
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

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setPingIntervalMillis(long j10) {
        this.$$delegate_0.setPingIntervalMillis(j10);
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setTimeoutMillis(long j10) {
        this.$$delegate_0.setTimeoutMillis(j10);
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    @InternalAPI
    public void start(List<? extends WebSocketExtension<?>> negotiatedExtensions) {
        e0.checkNotNullParameter(negotiatedExtensions, "negotiatedExtensions");
        this.$$delegate_0.start(negotiatedExtensions);
    }

    @Override // io.ktor.websocket.WebSocketSession
    @f
    public void terminate() {
        this.$$delegate_0.terminate();
    }
}
