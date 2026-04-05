package io.ktor.client.plugins.websocket;

import a.b;
import com.amazon.device.ads.DtbConstants;
import io.ktor.client.request.ClientUpgradeContent;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.websocket.UtilsKt;
import io.ktor.util.Base64Kt;
import io.ktor.util.CryptoKt;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class WebSocketContent extends ClientUpgradeContent {
    private final Headers headers;
    private final String nonce;

    public WebSocketContent() {
        String str = Base64Kt.encodeBase64(CryptoKt.generateNonce(16));
        e0.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        this.nonce = str;
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        headersBuilder.append(httpHeaders.getUpgrade(), "websocket");
        headersBuilder.append(httpHeaders.getConnection(), "Upgrade");
        headersBuilder.append(httpHeaders.getSecWebSocketKey(), str);
        headersBuilder.append(httpHeaders.getSecWebSocketVersion(), DtbConstants.NETWORK_TYPE_LTE);
        this.headers = headersBuilder.build();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Headers getHeaders() {
        return this.headers;
    }

    public String toString() {
        return "WebSocketContent";
    }

    @Override // io.ktor.client.request.ClientUpgradeContent
    public void verify(Headers headers) {
        e0.checkNotNullParameter(headers, "headers");
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String str = headers.get(httpHeaders.getSecWebSocketAccept());
        if (str == null) {
            throw new IllegalStateException(("Server should specify header " + httpHeaders.getSecWebSocketAccept()).toString());
        }
        String strWebsocketServerAccept = UtilsKt.websocketServerAccept(this.nonce);
        if (!e0.areEqual(strWebsocketServerAccept, str)) {
            throw new IllegalStateException(b.m("Failed to verify server accept header. Expected: ", strWebsocketServerAccept, ", received: ", str).toString());
        }
    }
}
