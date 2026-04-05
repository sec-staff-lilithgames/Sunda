package com.unity3d.ads.core.data.repository;

import av.e;
import bv.f;
import bv.n;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$nativeConfiguration$1", f = "AndroidSessionRepository.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class AndroidSessionRepository$nativeConfiguration$1 extends n implements p {
    int label;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSessionRepository$nativeConfiguration$1(AndroidSessionRepository androidSessionRepository, d<? super AndroidSessionRepository$nativeConfiguration$1> dVar) {
        super(2, dVar);
        this.this$0 = androidSessionRepository;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new AndroidSessionRepository$nativeConfiguration$1(this.this$0, dVar);
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
        Flow flow = this.this$0.persistedNativeConfiguration;
        this.label = 1;
        Object objFirst = FlowKt.first(flow, this);
        return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super NativeConfigurationOuterClass.NativeConfiguration> dVar) {
        return ((AndroidSessionRepository$nativeConfiguration$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
