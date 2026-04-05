package com.unity3d.services.core.extensions;

import av.e;
import bv.f;
import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1", f = "CoroutineExtensions.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class CoroutineExtensionsKt$memoize$2$deferred$1$1$1 extends n implements p {
    final /* synthetic */ l $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineExtensionsKt$memoize$2$deferred$1$1$1(l lVar, d<? super CoroutineExtensionsKt$memoize$2$deferred$1$1$1> dVar) {
        super(2, dVar);
        this.$action = lVar;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(this.$action, dVar);
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
        l lVar = this.$action;
        this.label = 1;
        Object objInvoke = lVar.invoke(this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$action.invoke(this);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super T> dVar) {
        return ((CoroutineExtensionsKt$memoize$2$deferred$1$1$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
