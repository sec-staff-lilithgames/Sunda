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
public final class f extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f84415i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f84416j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j.a f84417k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f84418l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, j.a aVar, Object obj, zu.d dVar) {
        super(2, dVar);
        this.f84416j = iVar;
        this.f84417k = aVar;
        this.f84418l = obj;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new f(this.f84416j, this.f84417k, this.f84418l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f84415i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            Flow<Object> data = this.f84416j.f84430d.getData();
            this.f84415i = 1;
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
        return (jVar == null || (obj2 = jVar.get(this.f84417k)) == null) ? this.f84418l : obj2;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
