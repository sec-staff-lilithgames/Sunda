package io.ktor.websocket;

import bx.a;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.websocket.CloseReason;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineName;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DefaultWebSocketSessionKt {
    private static final a LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.websocket.WebSocket");
    private static final CoroutineName IncomingProcessorCoroutineName = new CoroutineName("ws-incoming-processor");
    private static final CoroutineName OutgoingProcessorCoroutineName = new CoroutineName("ws-outgoing-processor");
    private static final CloseReason NORMAL_CLOSE = new CloseReason(CloseReason.Codes.NORMAL, "OK");

    public static final DefaultWebSocketSession DefaultWebSocketSession(WebSocketSession session, long j10, long j11) {
        e0.checkNotNullParameter(session, "session");
        if (session instanceof DefaultWebSocketSession) {
            throw new IllegalArgumentException("Cannot wrap other DefaultWebSocketSession");
        }
        return new DefaultWebSocketSessionImpl(session, j10, j11);
    }

    public static /* synthetic */ DefaultWebSocketSession DefaultWebSocketSession$default(WebSocketSession webSocketSession, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = -1;
        }
        if ((i10 & 4) != 0) {
            j11 = MBInterstitialActivity.WEB_LOAD_TIME;
        }
        return DefaultWebSocketSession(webSocketSession, j10, j11);
    }

    public static final a getLOGGER() {
        return LOGGER;
    }
}
