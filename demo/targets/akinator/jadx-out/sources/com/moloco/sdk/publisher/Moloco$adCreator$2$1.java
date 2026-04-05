package com.moloco.sdk.publisher;

import av.e;
import bv.f;
import bv.n;
import com.moloco.sdk.internal.publisher.j0;
import kv.l;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.moloco.sdk.publisher.Moloco$adCreator$2$1", f = "Moloco.kt", i = {}, l = {459}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class Moloco$adCreator$2$1 extends n implements l {
    int label;

    public Moloco$adCreator$2$1(zu.d<? super Moloco$adCreator$2$1> dVar) {
        super(1, dVar);
    }

    @Override // bv.a
    public final zu.d<x0> create(zu.d<?> dVar) {
        return new Moloco$adCreator$2$1(dVar);
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
        j0 initializationHandler = Moloco.INSTANCE.getInitializationHandler();
        this.label = 1;
        Object objA = initializationHandler.a(this);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }

    @Override // kv.l
    public final Object invoke(zu.d<? super com.moloco.sdk.internal.e> dVar) {
        return ((Moloco$adCreator$2$1) create(dVar)).invokeSuspend(x0.f87415a);
    }
}
