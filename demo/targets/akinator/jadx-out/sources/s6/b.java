package s6;

import bv.n;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f85475i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f85476j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f85477k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, zu.d dVar) {
        super(2, dVar);
        this.f85477k = cVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        b bVar = new b(this.f85477k, dVar);
        bVar.f85476j = obj;
        return bVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f85475i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.f85476j;
            c cVar = this.f85477k;
            a aVar = new a(cVar, producerScope);
            cVar.f85478a.addListener(aVar);
            androidx.lifecycle.x0 x0Var = new androidx.lifecycle.x0(21, cVar, aVar);
            this.f85475i = 1;
            if (ProduceKt.awaitClose(producerScope, x0Var, this) == coroutine_suspended) {
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
    public final Object invoke(ProducerScope<? super r6.c> producerScope, zu.d<? super x0> dVar) {
        return ((b) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
