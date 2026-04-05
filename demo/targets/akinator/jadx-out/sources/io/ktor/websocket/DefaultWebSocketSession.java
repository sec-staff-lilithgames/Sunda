package io.ktor.websocket;

import av.e;
import io.ktor.util.InternalAPI;
import io.ktor.websocket.WebSocketSession;
import java.util.List;
import kotlinx.coroutines.Deferred;
import tu.x0;
import uu.p0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface DefaultWebSocketSession extends WebSocketSession {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static Object send(DefaultWebSocketSession defaultWebSocketSession, Frame frame, d<? super x0> dVar) {
            Object objSend = WebSocketSession.DefaultImpls.send(defaultWebSocketSession, frame, dVar);
            return objSend == e.getCOROUTINE_SUSPENDED() ? objSend : x0.f87415a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void start$default(DefaultWebSocketSession defaultWebSocketSession, List list, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i10 & 1) != 0) {
                list = p0.emptyList();
            }
            defaultWebSocketSession.start(list);
        }
    }

    Deferred<CloseReason> getCloseReason();

    long getPingIntervalMillis();

    long getTimeoutMillis();

    void setPingIntervalMillis(long j10);

    void setTimeoutMillis(long j10);

    @InternalAPI
    void start(List<? extends WebSocketExtension<?>> list);
}
