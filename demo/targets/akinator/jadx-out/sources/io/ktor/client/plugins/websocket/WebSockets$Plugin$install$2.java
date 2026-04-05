package io.ktor.client.plugins.websocket;

import ao.kwoC.zAQQWzBxnS;
import av.e;
import bv.f;
import bv.n;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.websocket.WebSocketSession;
import j1.o2;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kv.q;
import tu.a0;
import tu.x0;
import uu.p0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2", f = "WebSockets.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class WebSockets$Plugin$install$2 extends n implements q {
    final /* synthetic */ boolean $extensionsSupported;
    final /* synthetic */ WebSockets $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSockets$Plugin$install$2(WebSockets webSockets, boolean z10, d<? super WebSockets$Plugin$install$2> dVar) {
        super(3, dVar);
        this.$plugin = webSockets;
        this.$extensionsSupported = z10;
    }

    @Override // kv.q
    public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, d<? super x0> dVar) {
        WebSockets$Plugin$install$2 webSockets$Plugin$install$2 = new WebSockets$Plugin$install$2(this.$plugin, this.$extensionsSupported, dVar);
        webSockets$Plugin$install$2.L$0 = pipelineContext;
        webSockets$Plugin$install$2.L$1 = httpResponseContainer;
        return webSockets$Plugin$install$2.invokeSuspend(x0.f87415a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [io.ktor.client.plugins.websocket.DefaultClientWebSocketSession] */
    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        DelegatingClientWebSocketSession delegatingClientWebSocketSession;
        List listEmptyList;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        x0 x0Var = x0.f87415a;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.throwOnFailure(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            HttpResponseContainer httpResponseContainer = (HttpResponseContainer) this.L$1;
            TypeInfo typeInfoComponent1 = httpResponseContainer.component1();
            Object objComponent2 = httpResponseContainer.component2();
            HttpResponse response = ((HttpClientCall) pipelineContext.getContext()).getResponse();
            HttpStatusCode status = response.getStatus();
            if (!(HttpResponseKt.getRequest(response).getContent() instanceof WebSocketContent)) {
                WebSocketsKt.getLOGGER().trace(zAQQWzBxnS.HICMe + ((HttpClientCall) pipelineContext.getContext()).getRequest().getUrl() + ": " + objComponent2);
                return x0Var;
            }
            HttpStatusCode.Companion companion = HttpStatusCode.Companion;
            if (e0.areEqual(status, companion.getSwitchingProtocols())) {
                if (objComponent2 instanceof WebSocketSession) {
                    WebSocketsKt.getLOGGER().trace("Receive websocket session from " + ((HttpClientCall) pipelineContext.getContext()).getRequest().getUrl() + ": " + objComponent2);
                    if (e0.areEqual(typeInfoComponent1.getType(), c1.getOrCreateKotlinClass(DefaultClientWebSocketSession.class))) {
                        ?? defaultClientWebSocketSession = new DefaultClientWebSocketSession((HttpClientCall) pipelineContext.getContext(), this.$plugin.convertSessionToDefault$ktor_client_core((WebSocketSession) objComponent2));
                        if (this.$extensionsSupported) {
                            listEmptyList = this.$plugin.completeNegotiation((HttpClientCall) pipelineContext.getContext());
                        } else {
                            listEmptyList = p0.emptyList();
                        }
                        defaultClientWebSocketSession.start(listEmptyList);
                        delegatingClientWebSocketSession = defaultClientWebSocketSession;
                    } else {
                        delegatingClientWebSocketSession = new DelegatingClientWebSocketSession((HttpClientCall) pipelineContext.getContext(), (WebSocketSession) objComponent2);
                    }
                    HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(typeInfoComponent1, delegatingClientWebSocketSession);
                    this.L$0 = null;
                    this.label = 1;
                    if (pipelineContext.proceedWith(httpResponseContainer2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new WebSocketException(o2.j(objComponent2, "Handshake exception, expected `WebSocketSession` content but was "));
                }
            } else {
                throw new WebSocketException("Handshake exception, expected status code " + companion.getSwitchingProtocols().getValue() + " but was " + status.getValue());
            }
        }
        return x0Var;
    }
}
