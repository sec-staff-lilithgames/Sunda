package io.ktor.client.plugins;

import av.e;
import bv.f;
import bv.n;
import bx.a;
import e3.g;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.StringValuesKt;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.jvm.internal.e0;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.DefaultRequest$Plugin$install$1", f = "DefaultRequest.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class DefaultRequest$Plugin$install$1 extends n implements q {
    final /* synthetic */ DefaultRequest $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultRequest$Plugin$install$1(DefaultRequest defaultRequest, d<? super DefaultRequest$Plugin$install$1> dVar) {
        super(3, dVar);
        this.$plugin = defaultRequest;
    }

    @Override // kv.q
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
        DefaultRequest$Plugin$install$1 defaultRequest$Plugin$install$1 = new DefaultRequest$Plugin$install$1(this.$plugin, dVar);
        defaultRequest$Plugin$install$1.L$0 = pipelineContext;
        return defaultRequest$Plugin$install$1.invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        PipelineContext pipelineContext = (PipelineContext) this.L$0;
        String string = ((HttpRequestBuilder) pipelineContext.getContext()).getUrl().toString();
        DefaultRequest.DefaultRequestBuilder defaultRequestBuilder = new DefaultRequest.DefaultRequestBuilder();
        DefaultRequest defaultRequest = this.$plugin;
        StringValuesKt.appendAll(defaultRequestBuilder.getHeaders(), ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders());
        defaultRequest.block.invoke(defaultRequestBuilder);
        DefaultRequest.Plugin.mergeUrls(defaultRequestBuilder.getUrl().build(), ((HttpRequestBuilder) pipelineContext.getContext()).getUrl());
        for (AttributeKey<?> attributeKey : defaultRequestBuilder.getAttributes().getAllKeys()) {
            if (!((HttpRequestBuilder) pipelineContext.getContext()).getAttributes().contains(attributeKey)) {
                Attributes attributes = ((HttpRequestBuilder) pipelineContext.getContext()).getAttributes();
                e0.checkNotNull(attributeKey, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                attributes.put(attributeKey, defaultRequestBuilder.getAttributes().get(attributeKey));
            }
        }
        ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders().clear();
        ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders().appendAll(defaultRequestBuilder.getHeaders().build());
        a aVar = DefaultRequestKt.LOGGER;
        StringBuilder sbO = g.o("Applied DefaultRequest to ", string, ". New url: ");
        sbO.append(((HttpRequestBuilder) pipelineContext.getContext()).getUrl());
        aVar.trace(sbO.toString());
        return x0.f87415a;
    }
}
