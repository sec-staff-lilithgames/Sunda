package io.ktor.client.plugins;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1$1$killer$1", f = "HttpTimeout.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class HttpTimeout$Plugin$install$1$1$killer$1 extends n implements p {
    final /* synthetic */ Job $executionContext;
    final /* synthetic */ HttpRequestBuilder $request;
    final /* synthetic */ Long $requestTimeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeout$Plugin$install$1$1$killer$1(Long l9, HttpRequestBuilder httpRequestBuilder, Job job, d<? super HttpTimeout$Plugin$install$1$1$killer$1> dVar) {
        super(2, dVar);
        this.$requestTimeout = l9;
        this.$request = httpRequestBuilder;
        this.$executionContext = job;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new HttpTimeout$Plugin$install$1$1$killer$1(this.$requestTimeout, this.$request, this.$executionContext, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            long jLongValue = this.$requestTimeout.longValue();
            this.label = 1;
            if (DelayKt.delay(jLongValue, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(this.$request);
        HttpTimeoutKt.LOGGER.trace("Request timeout: " + this.$request.getUrl());
        Job job = this.$executionContext;
        String message = httpRequestTimeoutException.getMessage();
        e0.checkNotNull(message);
        JobKt.cancel(job, message, httpRequestTimeoutException);
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((HttpTimeout$Plugin$install$1$1$killer$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
