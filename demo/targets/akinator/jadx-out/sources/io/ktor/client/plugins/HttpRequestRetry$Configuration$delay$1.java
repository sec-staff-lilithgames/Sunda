package io.ktor.client.plugins;

import av.e;
import bv.f;
import bv.n;
import kotlinx.coroutines.DelayKt;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpRequestRetry$Configuration$delay$1", f = "HttpRequestRetry.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class HttpRequestRetry$Configuration$delay$1 extends n implements p {
    /* synthetic */ long J$0;
    int label;

    public HttpRequestRetry$Configuration$delay$1(d<? super HttpRequestRetry$Configuration$delay$1> dVar) {
        super(2, dVar);
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        HttpRequestRetry$Configuration$delay$1 httpRequestRetry$Configuration$delay$1 = new HttpRequestRetry$Configuration$delay$1(dVar);
        httpRequestRetry$Configuration$delay$1.J$0 = ((Number) obj).longValue();
        return httpRequestRetry$Configuration$delay$1;
    }

    public final Object invoke(long j10, d<? super x0> dVar) {
        return ((HttpRequestRetry$Configuration$delay$1) create(Long.valueOf(j10), dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            long j10 = this.J$0;
            this.label = 1;
            if (DelayKt.delay(j10, this) == coroutine_suspended) {
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

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (d<? super x0>) obj2);
    }
}
