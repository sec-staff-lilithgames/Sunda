package j5;

import bv.n;
import j5.h;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f69107i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h.a f69108j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h.a aVar, zu.d dVar) {
        super(2, dVar);
        this.f69108j = aVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new b(this.f69108j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f69107i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        l5.c cVar = this.f69108j.f69126b;
        this.f69107i = 1;
        Object measurementApiStatus = cVar.getMeasurementApiStatus(this);
        return measurementApiStatus == coroutine_suspended ? coroutine_suspended : measurementApiStatus;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
