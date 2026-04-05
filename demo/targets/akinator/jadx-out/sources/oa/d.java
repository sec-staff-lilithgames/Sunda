package oa;

import android.content.Context;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import r7.k0;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78730i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f78731j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f78732k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, String str, zu.d dVar) {
        super(2, dVar);
        this.f78731j = lVar;
        this.f78732k = str;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new d(this.f78731j, this.f78732k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78730i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        this.f78730i = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(this), 1);
        cancellableContinuationImpl.initCancellability();
        l lVar = this.f78731j;
        Context context = lVar.f78768a.getContext();
        String str = this.f78732k;
        k0 k0VarFromAsset = r7.o.fromAsset(context, str);
        c cVar = new c(lVar, cancellableContinuationImpl);
        b bVar = new b(lVar, str, cancellableContinuationImpl);
        k0VarFromAsset.addListener(cVar);
        k0VarFromAsset.addFailureListener(bVar);
        cancellableContinuationImpl.invokeOnCancellation(new a(k0VarFromAsset, cVar, bVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(this);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super r7.h> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
