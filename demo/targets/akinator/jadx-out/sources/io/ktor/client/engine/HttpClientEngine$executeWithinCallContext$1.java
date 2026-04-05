package io.ktor.client.engine;

import bv.d;
import bv.f;
import io.ktor.client.engine.HttpClientEngine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", i = {0, 0}, l = {91, 100}, m = "executeWithinCallContext", n = {"$this", "requestData"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class HttpClientEngine$executeWithinCallContext$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public HttpClientEngine$executeWithinCallContext$1(zu.d<? super HttpClientEngine$executeWithinCallContext$1> dVar) {
        super(dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpClientEngine.DefaultImpls.executeWithinCallContext(null, null, this);
    }
}
