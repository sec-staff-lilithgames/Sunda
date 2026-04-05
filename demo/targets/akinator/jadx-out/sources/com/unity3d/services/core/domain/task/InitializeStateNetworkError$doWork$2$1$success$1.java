package com.unity3d.services.core.domain.task;

import av.b;
import av.e;
import bv.f;
import bv.h;
import bv.n;
import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2$1$success$1", f = "InitializeStateNetworkError.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class InitializeStateNetworkError$doWork$2$1$success$1 extends n implements p {
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$2$1$success$1(InitializeStateNetworkError initializeStateNetworkError, d<? super InitializeStateNetworkError$doWork$2$1$success$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateNetworkError;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new InitializeStateNetworkError$doWork$2$1$success$1(this.this$0, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            InitializeStateNetworkError initializeStateNetworkError = this.this$0;
            this.L$0 = initializeStateNetworkError;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(b.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            initializeStateNetworkError.startListening(cancellableContinuationImpl);
            Object result = cancellableContinuationImpl.getResult();
            if (result == e.getCOROUTINE_SUSPENDED()) {
                h.probeCoroutineSuspended(this);
            }
            if (result == coroutine_suspended) {
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
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((InitializeStateNetworkError$doWork$2$1$success$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
