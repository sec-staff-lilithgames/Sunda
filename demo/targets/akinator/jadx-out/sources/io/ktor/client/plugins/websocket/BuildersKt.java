package io.ktor.client.plugins.websocket;

import av.e;
import bv.d;
import bv.f;
import bv.n;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.websocket.WebSockets;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLProtocol;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kv.l;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class BuildersKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$WebSockets$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ l $config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar) {
            super(1);
            this.$config = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((WebSockets.Config) obj);
            return x0.f87415a;
        }

        public final void invoke(WebSockets.Config install) {
            e0.checkNotNullParameter(install, "$this$install");
            this.$config.invoke(install);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.websocket.BuildersKt", f = "builders.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {242, 245, 101, 103, 103, 251, 251}, m = "webSocket", n = {"block", "this_$iv", "block", "this_$iv", "response$iv", "this_$iv", "response$iv", "it", "this_$iv", "response$iv", "it", "this_$iv", "response$iv", "it"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocket$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39171 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C39171(zu.d<? super C39171> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BuildersKt.webSocket(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocket$4, reason: invalid class name */
    public static final class AnonymousClass4 extends f0 implements l {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocket$5, reason: invalid class name */
    public static final class AnonymousClass5 extends f0 implements l {
        final /* synthetic */ String $host;
        final /* synthetic */ HttpMethod $method;
        final /* synthetic */ String $path;
        final /* synthetic */ Integer $port;
        final /* synthetic */ l $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HttpMethod httpMethod, String str, Integer num, String str2, l lVar) {
            super(1);
            this.$method = httpMethod;
            this.$host = str;
            this.$port = num;
            this.$path = str2;
            this.$request = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }

        public final void invoke(HttpRequestBuilder webSocket) {
            e0.checkNotNullParameter(webSocket, "$this$webSocket");
            webSocket.setMethod(this.$method);
            HttpRequestKt.url$default(webSocket, "ws", this.$host, this.$port, this.$path, null, 16, null);
            this.$request.invoke(webSocket);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocket$7, reason: invalid class name */
    public static final class AnonymousClass7 extends f0 implements l {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocket$8, reason: invalid class name */
    public static final class AnonymousClass8 extends f0 implements l {
        final /* synthetic */ l $request;
        final /* synthetic */ String $urlString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(String str, l lVar) {
            super(1);
            this.$urlString = str;
            this.$request = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }

        public final void invoke(HttpRequestBuilder webSocket) {
            e0.checkNotNullParameter(webSocket, "$this$webSocket");
            webSocket.getUrl().setProtocol(URLProtocol.Companion.getWS());
            webSocket.getUrl().setPort(UtilsKt.getPort(webSocket));
            URLParserKt.takeFrom(webSocket.getUrl(), this.$urlString);
            this.$request.invoke(webSocket);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2", f = "builders.kt", i = {0, 1, 1, 2, 2}, l = {PsExtractor.VIDEO_STREAM_MASK, 243, 49, 249, 249}, m = "invokeSuspend", n = {"this_$iv", "this_$iv", "response$iv", "this_$iv", "response$iv"}, s = {"L$0", "L$0", "L$2", "L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ CompletableDeferred<DefaultClientWebSocketSession> $sessionDeferred;
        final /* synthetic */ HttpStatement $statement;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HttpStatement httpStatement, CompletableDeferred<DefaultClientWebSocketSession> completableDeferred, zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$statement = httpStatement;
            this.$sessionDeferred = completableDeferred;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new AnonymousClass2(this.$statement, this.$sessionDeferred, dVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:68)|(1:(2:(1:(1:(1:(2:9|10)(3:11|12|63))(3:18|19|67))(5:21|74|22|50|(1:62)(1:67)))(6:26|69|27|28|73|(3:46|(3:49|50|(0))|62)(2:56|57))|60)(3:31|32|33))(4:34|35|36|(2:38|62)(1:39))|40|71|41|(3:44|73|(0)(0))|62|(2:(0)|(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f9, code lost:
        
            r7 = r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0107, code lost:
        
            if (r7.cleanup(r3, r17) != r2) goto L63;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00b9 A[Catch: all -> 0x00ec, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00ec, blocks: (B:46:0x00b9, B:56:0x00f0, B:57:0x00f7), top: B:73:0x00b7 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00f0 A[Catch: all -> 0x00ec, TRY_ENTER, TryCatch #3 {all -> 0x00ec, blocks: (B:46:0x00b9, B:56:0x00f0, B:57:0x00f7), top: B:73:0x00b7 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0115 A[RETURN] */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.websocket.BuildersKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$4, reason: invalid class name and case insensitive filesystem */
    public static final class C39184 extends f0 implements l {
        public static final C39184 INSTANCE = new C39184();

        public C39184() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$5, reason: invalid class name and case insensitive filesystem */
    public static final class C39195 extends f0 implements l {
        final /* synthetic */ l $block;
        final /* synthetic */ String $host;
        final /* synthetic */ HttpMethod $method;
        final /* synthetic */ String $path;
        final /* synthetic */ Integer $port;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39195(HttpMethod httpMethod, String str, Integer num, String str2, l lVar) {
            super(1);
            this.$method = httpMethod;
            this.$host = str;
            this.$port = num;
            this.$path = str2;
            this.$block = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }

        public final void invoke(HttpRequestBuilder webSocketSession) {
            e0.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
            webSocketSession.setMethod(this.$method);
            HttpRequestKt.url$default(webSocketSession, "ws", this.$host, this.$port, this.$path, null, 16, null);
            this.$block.invoke(webSocketSession);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$7, reason: invalid class name and case insensitive filesystem */
    public static final class C39207 extends f0 implements l {
        public static final C39207 INSTANCE = new C39207();

        public C39207() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$8, reason: invalid class name and case insensitive filesystem */
    public static final class C39218 extends f0 implements l {
        final /* synthetic */ l $block;
        final /* synthetic */ String $urlString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39218(String str, l lVar) {
            super(1);
            this.$urlString = str;
            this.$block = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }

        public final void invoke(HttpRequestBuilder webSocketSession) {
            e0.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
            URLParserKt.takeFrom(webSocketSession.getUrl(), this.$urlString);
            this.$block.invoke(webSocketSession);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$ws$2, reason: invalid class name and case insensitive filesystem */
    public static final class C39222 extends f0 implements l {
        public static final C39222 INSTANCE = new C39222();

        public C39222() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$ws$5, reason: invalid class name and case insensitive filesystem */
    public static final class C39235 extends f0 implements l {
        public static final C39235 INSTANCE = new C39235();

        public C39235() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$wss$2, reason: invalid class name and case insensitive filesystem */
    public static final class C39242 extends f0 implements l {
        final /* synthetic */ l $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39242(l lVar) {
            super(1);
            this.$request = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }

        public final void invoke(HttpRequestBuilder webSocket) {
            e0.checkNotNullParameter(webSocket, "$this$webSocket");
            webSocket.getUrl().setProtocol(URLProtocol.Companion.getWSS());
            webSocket.getUrl().setPort(webSocket.getUrl().getProtocol().getDefaultPort());
            this.$request.invoke(webSocket);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$wss$4, reason: invalid class name and case insensitive filesystem */
    public static final class C39254 extends f0 implements l {
        public static final C39254 INSTANCE = new C39254();

        public C39254() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$wss$5, reason: invalid class name and case insensitive filesystem */
    public static final class C39265 extends f0 implements l {
        final /* synthetic */ l $request;
        final /* synthetic */ String $urlString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39265(String str, l lVar) {
            super(1);
            this.$urlString = str;
            this.$request = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }

        public final void invoke(HttpRequestBuilder wss) {
            e0.checkNotNullParameter(wss, "$this$wss");
            URLParserKt.takeFrom(wss.getUrl(), this.$urlString);
            this.$request.invoke(wss);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$wss$7, reason: invalid class name and case insensitive filesystem */
    public static final class C39277 extends f0 implements l {
        public static final C39277 INSTANCE = new C39277();

        public C39277() {
            super(1);
        }

        public final void invoke(HttpRequestBuilder httpRequestBuilder) {
            e0.checkNotNullParameter(httpRequestBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$wss$8, reason: invalid class name and case insensitive filesystem */
    public static final class C39288 extends f0 implements l {
        final /* synthetic */ Integer $port;
        final /* synthetic */ l $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39288(Integer num, l lVar) {
            super(1);
            this.$port = num;
            this.$request = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HttpRequestBuilder) obj);
            return x0.f87415a;
        }

        public final void invoke(HttpRequestBuilder webSocket) {
            e0.checkNotNullParameter(webSocket, "$this$webSocket");
            webSocket.getUrl().setProtocol(URLProtocol.Companion.getWSS());
            if (this.$port != null) {
                webSocket.getUrl().setPort(this.$port.intValue());
            }
            this.$request.invoke(webSocket);
        }
    }

    public static final void WebSockets(HttpClientConfig<?> httpClientConfig, l config) {
        e0.checkNotNullParameter(httpClientConfig, "<this>");
        e0.checkNotNullParameter(config, "config");
        httpClientConfig.install(WebSockets.Plugin, new AnonymousClass1(config));
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:
    
        if (r0.cleanup(r10, r1) != r2) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd A[Catch: all -> 0x0058, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0058, blocks: (B:19:0x0053, B:66:0x014c, B:67:0x0153, B:24:0x0069, B:56:0x0120, B:53:0x0110, B:63:0x013a, B:32:0x0096, B:48:0x00fd, B:68:0x0154, B:69:0x015b), top: B:83:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120 A[Catch: all -> 0x0058, PHI: r0 r8 r10
      0x0120: PHI (r0v13 io.ktor.client.statement.HttpStatement) = (r0v10 io.ktor.client.statement.HttpStatement), (r0v15 io.ktor.client.statement.HttpStatement) binds: [B:54:0x011d, B:24:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r8v26 io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) = 
      (r8v22 io.ktor.client.plugins.websocket.DefaultClientWebSocketSession)
      (r8v31 io.ktor.client.plugins.websocket.DefaultClientWebSocketSession)
     binds: [B:54:0x011d, B:24:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0120: PHI (r10v17 io.ktor.client.statement.HttpResponse) = (r10v12 io.ktor.client.statement.HttpResponse), (r10v19 io.ktor.client.statement.HttpResponse) binds: [B:54:0x011d, B:24:0x0069] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0058, blocks: (B:19:0x0053, B:66:0x014c, B:67:0x0153, B:24:0x0069, B:56:0x0120, B:53:0x0110, B:63:0x013a, B:32:0x0096, B:48:0x00fd, B:68:0x0154, B:69:0x015b), top: B:83:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154 A[Catch: all -> 0x0058, TryCatch #2 {all -> 0x0058, blocks: (B:19:0x0053, B:66:0x014c, B:67:0x0153, B:24:0x0069, B:56:0x0120, B:53:0x0110, B:63:0x013a, B:32:0x0096, B:48:0x00fd, B:68:0x0154, B:69:0x015b), top: B:83:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Class, java.lang.Class<io.ktor.client.plugins.websocket.DefaultClientWebSocketSession>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.ktor.client.statement.HttpStatement] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kv.p] */
    /* JADX WARN: Type inference failed for: r10v1, types: [io.ktor.client.statement.HttpResponse] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kv.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object webSocket(io.ktor.client.HttpClient r8, kv.l r9, kv.p r10, zu.d<? super tu.x0> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.websocket.BuildersKt.webSocket(io.ktor.client.HttpClient, kv.l, kv.p, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object webSocket$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, l lVar, p pVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            httpMethod = HttpMethod.Companion.getGet();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            lVar = AnonymousClass4.INSTANCE;
        }
        l lVar2 = lVar;
        return webSocket(httpClient, httpMethod, str, num, str2, lVar2, pVar, dVar);
    }

    public static final Object webSocketSession(HttpClient httpClient, l lVar, zu.d<? super DefaultClientWebSocketSession> dVar) {
        HttpClientPluginKt.plugin(httpClient, WebSockets.Plugin);
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.url(BuildersKt$webSocketSession$statement$1$1.INSTANCE);
        lVar.invoke(httpRequestBuilder);
        BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new AnonymousClass2(new HttpStatement(httpRequestBuilder, httpClient), completableDeferredCompletableDeferred$default, null), 3, null);
        return completableDeferredCompletableDeferred$default.await(dVar);
    }

    public static /* synthetic */ Object webSocketSession$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, l lVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            httpMethod = HttpMethod.Companion.getGet();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            lVar = C39184.INSTANCE;
        }
        return webSocketSession(httpClient, httpMethod, str, num, str2, lVar, dVar);
    }

    public static final Object ws(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, l lVar, p pVar, zu.d<? super x0> dVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, httpMethod, str, num, str2, lVar, pVar, dVar);
        return objWebSocket == e.getCOROUTINE_SUSPENDED() ? objWebSocket : x0.f87415a;
    }

    public static /* synthetic */ Object ws$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, l lVar, p pVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            httpMethod = HttpMethod.Companion.getGet();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            lVar = C39222.INSTANCE;
        }
        l lVar2 = lVar;
        return ws(httpClient, httpMethod, str, num, str2, lVar2, pVar, dVar);
    }

    public static final Object wss(HttpClient httpClient, l lVar, p pVar, zu.d<? super x0> dVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, new C39242(lVar), pVar, dVar);
        return objWebSocket == e.getCOROUTINE_SUSPENDED() ? objWebSocket : x0.f87415a;
    }

    public static /* synthetic */ Object wss$default(HttpClient httpClient, String str, l lVar, p pVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = C39254.INSTANCE;
        }
        return wss(httpClient, str, lVar, pVar, dVar);
    }

    public static final Object ws(HttpClient httpClient, l lVar, p pVar, zu.d<? super x0> dVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, lVar, pVar, dVar);
        return objWebSocket == e.getCOROUTINE_SUSPENDED() ? objWebSocket : x0.f87415a;
    }

    public static final Object wss(HttpClient httpClient, String str, l lVar, p pVar, zu.d<? super x0> dVar) throws Throwable {
        Object objWss = wss(httpClient, new C39265(str, lVar), pVar, dVar);
        return objWss == e.getCOROUTINE_SUSPENDED() ? objWss : x0.f87415a;
    }

    public static final Object ws(HttpClient httpClient, String str, l lVar, p pVar, zu.d<? super x0> dVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, str, lVar, pVar, dVar);
        return objWebSocket == e.getCOROUTINE_SUSPENDED() ? objWebSocket : x0.f87415a;
    }

    public static final Object wss(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, l lVar, p pVar, zu.d<? super x0> dVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, httpMethod, str, num, str2, new C39288(num, lVar), pVar, dVar);
        return objWebSocket == e.getCOROUTINE_SUSPENDED() ? objWebSocket : x0.f87415a;
    }

    public static /* synthetic */ Object wss$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, l lVar, p pVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            httpMethod = HttpMethod.Companion.getGet();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            lVar = C39277.INSTANCE;
        }
        l lVar2 = lVar;
        return wss(httpClient, httpMethod, str, num, str2, lVar2, pVar, dVar);
    }

    public static /* synthetic */ Object webSocket$default(HttpClient httpClient, String str, l lVar, p pVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = AnonymousClass7.INSTANCE;
        }
        return webSocket(httpClient, str, lVar, pVar, dVar);
    }

    public static /* synthetic */ Object webSocketSession$default(HttpClient httpClient, String str, l lVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = C39207.INSTANCE;
        }
        return webSocketSession(httpClient, str, lVar, dVar);
    }

    public static /* synthetic */ Object ws$default(HttpClient httpClient, String str, l lVar, p pVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = C39235.INSTANCE;
        }
        return ws(httpClient, str, lVar, pVar, dVar);
    }

    public static final Object webSocketSession(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, l lVar, zu.d<? super DefaultClientWebSocketSession> dVar) {
        return webSocketSession(httpClient, new C39195(httpMethod, str, num, str2, lVar), dVar);
    }

    public static final Object webSocketSession(HttpClient httpClient, String str, l lVar, zu.d<? super DefaultClientWebSocketSession> dVar) {
        return webSocketSession(httpClient, new C39218(str, lVar), dVar);
    }

    public static final Object webSocket(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, l lVar, p pVar, zu.d<? super x0> dVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, new AnonymousClass5(httpMethod, str, num, str2, lVar), pVar, dVar);
        return objWebSocket == e.getCOROUTINE_SUSPENDED() ? objWebSocket : x0.f87415a;
    }

    public static final Object webSocket(HttpClient httpClient, String str, l lVar, p pVar, zu.d<? super x0> dVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, HttpMethod.Companion.getGet(), null, null, null, new AnonymousClass8(str, lVar), pVar, dVar);
        return objWebSocket == e.getCOROUTINE_SUSPENDED() ? objWebSocket : x0.f87415a;
    }
}
