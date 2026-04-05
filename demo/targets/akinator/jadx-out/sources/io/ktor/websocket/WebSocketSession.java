package io.ktor.websocket;

import av.e;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import tu.f;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface WebSocketSession extends CoroutineScope {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static Object send(WebSocketSession webSocketSession, Frame frame, d<? super x0> dVar) {
            Object objSend = webSocketSession.getOutgoing().send(frame, dVar);
            return objSend == e.getCOROUTINE_SUSPENDED() ? objSend : x0.f87415a;
        }
    }

    Object flush(d<? super x0> dVar);

    List<WebSocketExtension<?>> getExtensions();

    ReceiveChannel<Frame> getIncoming();

    boolean getMasking();

    long getMaxFrameSize();

    SendChannel<Frame> getOutgoing();

    Object send(Frame frame, d<? super x0> dVar);

    void setMasking(boolean z10);

    void setMaxFrameSize(long j10);

    @f
    void terminate();
}
