package lb;

import kotlinx.coroutines.CoroutineScope;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72957i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72958j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f72959k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e.c f72960l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(e eVar, int i10, e.c cVar, zu.d dVar) {
        super(2, dVar);
        this.f72958j = eVar;
        this.f72959k = i10;
        this.f72960l = cVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new q0(this.f72958j, this.f72959k, this.f72960l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72957i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72957i = 1;
        Object objB = this.f72958j.b(this.f72959k, false, false, null, this.f72960l, this);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((q0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
