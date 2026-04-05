package io.ktor.client.plugins.cookies;

import av.e;
import bv.f;
import bv.n;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.util.pipeline.PipelineContext;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.cookies.HttpCookies$Companion$install$1", f = "HttpCookies.kt", i = {}, l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class HttpCookies$Companion$install$1 extends n implements q {
    final /* synthetic */ HttpCookies $plugin;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCookies$Companion$install$1(HttpCookies httpCookies, d<? super HttpCookies$Companion$install$1> dVar) {
        super(3, dVar);
        this.$plugin = httpCookies;
    }

    @Override // kv.q
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, d<? super x0> dVar) {
        HttpCookies$Companion$install$1 httpCookies$Companion$install$1 = new HttpCookies$Companion$install$1(this.$plugin, dVar);
        httpCookies$Companion$install$1.L$0 = pipelineContext;
        return httpCookies$Companion$install$1.invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            HttpCookies httpCookies = this.$plugin;
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) pipelineContext.getContext();
            this.label = 1;
            if (httpCookies.captureHeaderCookies$ktor_client_core(httpRequestBuilder, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }
}
