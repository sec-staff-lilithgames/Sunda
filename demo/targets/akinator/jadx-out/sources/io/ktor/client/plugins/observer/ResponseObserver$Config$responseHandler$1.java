package io.ktor.client.plugins.observer;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.statement.HttpResponse;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.observer.ResponseObserver$Config$responseHandler$1", f = "ResponseObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class ResponseObserver$Config$responseHandler$1 extends n implements p {
    int label;

    public ResponseObserver$Config$responseHandler$1(d<? super ResponseObserver$Config$responseHandler$1> dVar) {
        super(2, dVar);
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new ResponseObserver$Config$responseHandler$1(dVar);
    }

    @Override // kv.p
    public final Object invoke(HttpResponse httpResponse, d<? super x0> dVar) {
        return ((ResponseObserver$Config$responseHandler$1) create(httpResponse, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        return x0.f87415a;
    }
}
