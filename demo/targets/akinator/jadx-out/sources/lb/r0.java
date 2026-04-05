package lb;

import kotlinx.coroutines.CoroutineScope;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72964i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72965j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f72966k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f72967l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e.c f72968m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(e eVar, int i10, String str, e.c cVar, zu.d dVar) {
        super(2, dVar);
        this.f72965j = eVar;
        this.f72966k = i10;
        this.f72967l = str;
        this.f72968m = cVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new r0(this.f72965j, this.f72966k, this.f72967l, this.f72968m, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72964i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72964i = 1;
        Object objB = this.f72965j.b(this.f72966k, true, false, this.f72967l, this.f72968m, this);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((r0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
