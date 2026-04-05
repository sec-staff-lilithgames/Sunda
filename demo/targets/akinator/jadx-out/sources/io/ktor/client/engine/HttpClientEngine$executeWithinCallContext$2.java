package io.ktor.client.engine;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class HttpClientEngine$executeWithinCallContext$2 extends n implements p {
    final /* synthetic */ HttpRequestData $requestData;
    int label;
    final /* synthetic */ HttpClientEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientEngine$executeWithinCallContext$2(HttpClientEngine httpClientEngine, HttpRequestData httpRequestData, d<? super HttpClientEngine$executeWithinCallContext$2> dVar) {
        super(2, dVar);
        this.this$0 = httpClientEngine;
        this.$requestData = httpRequestData;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new HttpClientEngine$executeWithinCallContext$2(this.this$0, this.$requestData, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        if (HttpClientEngine.DefaultImpls.getClosed(this.this$0)) {
            throw new ClientEngineClosedException(null, 1, null);
        }
        HttpClientEngine httpClientEngine = this.this$0;
        HttpRequestData httpRequestData = this.$requestData;
        this.label = 1;
        Object objExecute = httpClientEngine.execute(httpRequestData, this);
        return objExecute == coroutine_suspended ? coroutine_suspended : objExecute;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super HttpResponseData> dVar) {
        return ((HttpClientEngine$executeWithinCallContext$2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
