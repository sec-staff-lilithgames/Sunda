package io.ktor.client.plugins;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.ContentType;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.jvm.internal.e0;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpPlainText$Plugin$install$1", f = "HttpPlainText.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class HttpPlainText$Plugin$install$1 extends n implements q {
    final /* synthetic */ HttpPlainText $plugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPlainText$Plugin$install$1(HttpPlainText httpPlainText, d<? super HttpPlainText$Plugin$install$1> dVar) {
        super(3, dVar);
        this.$plugin = httpPlainText;
    }

    @Override // kv.q
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
        HttpPlainText$Plugin$install$1 httpPlainText$Plugin$install$1 = new HttpPlainText$Plugin$install$1(this.$plugin, dVar);
        httpPlainText$Plugin$install$1.L$0 = pipelineContext;
        httpPlainText$Plugin$install$1.L$1 = obj;
        return httpPlainText$Plugin$install$1.invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        x0 x0Var = x0.f87415a;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            Object obj2 = this.L$1;
            this.$plugin.addCharsetHeaders$ktor_client_core((HttpRequestBuilder) pipelineContext.getContext());
            if (!(obj2 instanceof String)) {
                return x0Var;
            }
            ContentType contentType = HttpMessagePropertiesKt.contentType((HttpMessageBuilder) pipelineContext.getContext());
            if (contentType != null && !e0.areEqual(contentType.getContentType(), ContentType.Text.INSTANCE.getPlain().getContentType())) {
                return x0Var;
            }
            Object objWrapContent = this.$plugin.wrapContent((HttpRequestBuilder) pipelineContext.getContext(), (String) obj2, contentType);
            this.L$0 = null;
            this.label = 1;
            if (pipelineContext.proceedWith(objWrapContent, this) == coroutine_suspended) {
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
