package io.ktor.client.plugins.websocket;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.HttpHeaders;
import io.ktor.serialization.WebsocketContentConverter;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import io.ktor.websocket.DefaultWebSocketSession;
import io.ktor.websocket.DefaultWebSocketSessionKt;
import io.ktor.websocket.WebSocketExtension;
import io.ktor.websocket.WebSocketExtensionHeader;
import io.ktor.websocket.WebSocketExtensionHeaderKt;
import io.ktor.websocket.WebSocketExtensionsConfig;
import io.ktor.websocket.WebSocketSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import uu.p0;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class WebSockets {
    public static final Plugin Plugin = new Plugin(null);
    private static final AttributeKey<WebSockets> key = new AttributeKey<>("Websocket");
    private final WebsocketContentConverter contentConverter;
    private final WebSocketExtensionsConfig extensionsConfig;
    private final long maxFrameSize;
    private final long pingInterval;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class Config {
        private WebsocketContentConverter contentConverter;
        private final WebSocketExtensionsConfig extensionsConfig = new WebSocketExtensionsConfig();
        private long pingInterval = -1;
        private long maxFrameSize = 2147483647L;

        public final void extensions(l block) {
            e0.checkNotNullParameter(block, "block");
            block.invoke(this.extensionsConfig);
        }

        public final WebsocketContentConverter getContentConverter() {
            return this.contentConverter;
        }

        public final WebSocketExtensionsConfig getExtensionsConfig$ktor_client_core() {
            return this.extensionsConfig;
        }

        public final long getMaxFrameSize() {
            return this.maxFrameSize;
        }

        public final long getPingInterval() {
            return this.pingInterval;
        }

        public final void setContentConverter(WebsocketContentConverter websocketContentConverter) {
            this.contentConverter = websocketContentConverter;
        }

        public final void setMaxFrameSize(long j10) {
            this.maxFrameSize = j10;
        }

        public final void setPingInterval(long j10) {
            this.pingInterval = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Plugin implements HttpClientPlugin<Config, WebSockets> {
        public /* synthetic */ Plugin(u uVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<WebSockets> getKey() {
            return WebSockets.key;
        }

        private Plugin() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(WebSockets plugin, HttpClient scope) {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            boolean zContains = scope.getEngine().getSupportedCapabilities().contains(WebSocketExtensionsCapability.INSTANCE);
            scope.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getRender(), new WebSockets$Plugin$install$1(zContains, plugin, null));
            scope.getResponsePipeline().intercept(HttpResponsePipeline.Phases.getTransform(), new WebSockets$Plugin$install$2(plugin, zContains, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public WebSockets prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return new WebSockets(config.getPingInterval(), config.getMaxFrameSize(), config.getExtensionsConfig$ktor_client_core(), config.getContentConverter());
        }
    }

    public WebSockets(long j10, long j11, WebSocketExtensionsConfig extensionsConfig, WebsocketContentConverter websocketContentConverter) {
        e0.checkNotNullParameter(extensionsConfig, "extensionsConfig");
        this.pingInterval = j10;
        this.maxFrameSize = j11;
        this.extensionsConfig = extensionsConfig;
        this.contentConverter = websocketContentConverter;
    }

    private final void addNegotiatedProtocols(HttpRequestBuilder httpRequestBuilder, List<WebSocketExtensionHeader> list) {
        if (list.isEmpty()) {
            return;
        }
        UtilsKt.header(httpRequestBuilder, HttpHeaders.INSTANCE.getSecWebSocketExtensions(), y0.joinToString$default(list, ";", null, null, 0, null, null, 62, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<WebSocketExtension<?>> completeNegotiation(HttpClientCall httpClientCall) {
        List<WebSocketExtensionHeader> listEmptyList;
        String str = httpClientCall.getResponse().getHeaders().get(HttpHeaders.INSTANCE.getSecWebSocketExtensions());
        if (str == null || (listEmptyList = WebSocketExtensionHeaderKt.parseWebSocketExtensions(str)) == null) {
            listEmptyList = p0.emptyList();
        }
        List list = (List) httpClientCall.getAttributes().get(WebSocketsKt.REQUEST_EXTENSIONS_KEY);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((WebSocketExtension) obj).clientNegotiation(listEmptyList)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void installExtensions(HttpRequestBuilder httpRequestBuilder) {
        List<WebSocketExtension<?>> listBuild = this.extensionsConfig.build();
        httpRequestBuilder.getAttributes().put(WebSocketsKt.REQUEST_EXTENSIONS_KEY, listBuild);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listBuild.iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, ((WebSocketExtension) it.next()).getProtocols());
        }
        addNegotiatedProtocols(httpRequestBuilder, arrayList);
    }

    public final DefaultWebSocketSession convertSessionToDefault$ktor_client_core(WebSocketSession session) {
        e0.checkNotNullParameter(session, "session");
        if (session instanceof DefaultWebSocketSession) {
            return (DefaultWebSocketSession) session;
        }
        long j10 = this.pingInterval;
        DefaultWebSocketSession DefaultWebSocketSession = DefaultWebSocketSessionKt.DefaultWebSocketSession(session, j10, 2 * j10);
        DefaultWebSocketSession.setMaxFrameSize(this.maxFrameSize);
        return DefaultWebSocketSession;
    }

    public final WebsocketContentConverter getContentConverter() {
        return this.contentConverter;
    }

    public final long getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final long getPingInterval() {
        return this.pingInterval;
    }

    public /* synthetic */ WebSockets(long j10, long j11, WebSocketExtensionsConfig webSocketExtensionsConfig, WebsocketContentConverter websocketContentConverter, int i10, u uVar) {
        this(j10, j11, webSocketExtensionsConfig, (i10 & 8) != 0 ? null : websocketContentConverter);
    }

    public /* synthetic */ WebSockets(long j10, long j11, int i10, u uVar) {
        this((i10 & 1) != 0 ? -1L : j10, (i10 & 2) != 0 ? 2147483647L : j11);
    }

    public WebSockets(long j10, long j11) {
        this(j10, j11, new WebSocketExtensionsConfig(), null, 8, null);
    }

    public WebSockets() {
        this(-1L, 2147483647L, new WebSocketExtensionsConfig(), null, 8, null);
    }
}
