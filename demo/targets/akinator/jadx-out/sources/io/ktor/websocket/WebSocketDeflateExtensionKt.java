package io.ktor.websocket;

import io.ktor.websocket.Frame;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WebSocketDeflateExtensionKt {
    private static final String CLIENT_MAX_WINDOW_BITS = "client_max_window_bits";
    private static final String CLIENT_NO_CONTEXT_TAKEOVER = "client_no_context_takeover";
    private static final int MAX_WINDOW_BITS = 15;
    private static final int MIN_WINDOW_BITS = 8;
    private static final String PERMESSAGE_DEFLATE = "permessage-deflate";
    private static final String SERVER_MAX_WINDOW_BITS = "server_max_window_bits";
    private static final String SERVER_NO_CONTEXT_TAKEOVER = "server_no_context_takeover";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCompressed(Frame frame) {
        if (frame.getRsv1()) {
            return (frame instanceof Frame.Text) || (frame instanceof Frame.Binary);
        }
        return false;
    }
}
