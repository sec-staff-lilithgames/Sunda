package com.unity3d.services.core.domain.task;

import av.e;
import bv.f;
import bv.n;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2$1$webViewData$1", f = "InitializeSDK.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeSDK$doWork$2$1$webViewData$1 extends n implements p {
    final /* synthetic */ Object $configResult;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2$1$webViewData$1(InitializeSDK initializeSDK, Object obj, d<? super InitializeSDK$doWork$2$1$webViewData$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeSDK;
        this.$configResult = obj;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new InitializeSDK$doWork$2$1$webViewData$1(this.this$0, this.$configResult, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            InitializeStateLoadWeb initializeStateLoadWeb = this.this$0.initializeStateLoadWeb;
            Object obj2 = this.$configResult;
            a0.throwOnFailure(obj2);
            InitializeStateLoadWeb.Params params = new InitializeStateLoadWeb.Params((Configuration) obj2);
            this.label = 1;
            if (initializeStateLoadWeb.mo3513invokegIAlus(params, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            ((z) obj).m7139unboximpl();
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((InitializeSDK$doWork$2$1$webViewData$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
