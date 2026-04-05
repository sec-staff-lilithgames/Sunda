package ri;

import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import o4.j;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f84405i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f84406j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j.a f84407k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, j.a aVar, zu.d dVar) {
        super(2, dVar);
        this.f84406j = iVar;
        this.f84407k = aVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new b(this.f84406j, this.f84407k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f84405i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            Flow<Object> data = this.f84406j.f84430d.getData();
            this.f84405i = 1;
            obj = FlowKt.firstOrNull(data, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        o4.j jVar = (o4.j) obj;
        return bv.b.boxBoolean(jVar != null ? jVar.contains(this.f84407k) : false);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Boolean> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
