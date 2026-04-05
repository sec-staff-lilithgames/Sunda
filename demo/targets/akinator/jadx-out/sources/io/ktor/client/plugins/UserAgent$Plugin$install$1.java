package io.ktor.client.plugins;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.UtilsKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.util.pipeline.PipelineContext;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.UserAgent$Plugin$install$1", f = "UserAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class UserAgent$Plugin$install$1 extends n implements q {
    final /* synthetic */ UserAgent $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgent$Plugin$install$1(UserAgent userAgent, d<? super UserAgent$Plugin$install$1> dVar) {
        super(3, dVar);
        this.$plugin = userAgent;
    }

    @Override // kv.q
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
        UserAgent$Plugin$install$1 userAgent$Plugin$install$1 = new UserAgent$Plugin$install$1(this.$plugin, dVar);
        userAgent$Plugin$install$1.L$0 = pipelineContext;
        return userAgent$Plugin$install$1.invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        PipelineContext pipelineContext = (PipelineContext) this.L$0;
        UserAgentKt.LOGGER.trace("Adding User-Agent header: " + this.$plugin.getAgent() + " for " + ((HttpRequestBuilder) pipelineContext.getContext()).getUrl());
        UtilsKt.header((HttpMessageBuilder) pipelineContext.getContext(), HttpHeaders.INSTANCE.getUserAgent(), this.$plugin.getAgent());
        return x0.f87415a;
    }
}
