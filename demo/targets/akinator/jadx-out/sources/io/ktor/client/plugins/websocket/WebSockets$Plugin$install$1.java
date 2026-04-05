package io.ktor.client.plugins.websocket;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.URLProtocolKt;
import io.ktor.util.pipeline.PipelineContext;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1", f = "WebSockets.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class WebSockets$Plugin$install$1 extends n implements q {
    final /* synthetic */ boolean $extensionsSupported;
    final /* synthetic */ WebSockets $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSockets$Plugin$install$1(boolean z10, WebSockets webSockets, d<? super WebSockets$Plugin$install$1> dVar) {
        super(3, dVar);
        this.$extensionsSupported = z10;
        this.$plugin = webSockets;
    }

    @Override // kv.q
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
        WebSockets$Plugin$install$1 webSockets$Plugin$install$1 = new WebSockets$Plugin$install$1(this.$extensionsSupported, this.$plugin, dVar);
        webSockets$Plugin$install$1.L$0 = pipelineContext;
        return webSockets$Plugin$install$1.invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        x0 x0Var = x0.f87415a;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            if (!URLProtocolKt.isWebsocket(((HttpRequestBuilder) pipelineContext.getContext()).getUrl().getProtocol())) {
                WebSocketsKt.getLOGGER().trace("Skipping WebSocket plugin for non-websocket request: " + ((HttpRequestBuilder) pipelineContext.getContext()).getUrl());
                return x0Var;
            }
            WebSocketsKt.getLOGGER().trace("Sending WebSocket request " + ((HttpRequestBuilder) pipelineContext.getContext()).getUrl());
            ((HttpRequestBuilder) pipelineContext.getContext()).setCapability(WebSocketCapability.INSTANCE, x0Var);
            if (this.$extensionsSupported) {
                this.$plugin.installExtensions((HttpRequestBuilder) pipelineContext.getContext());
            }
            WebSocketContent webSocketContent = new WebSocketContent();
            this.label = 1;
            if (pipelineContext.proceedWith(webSocketContent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0Var;
    }
}
