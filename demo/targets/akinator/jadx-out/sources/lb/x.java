package lb;

import kotlinx.coroutines.CoroutineScope;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f73034i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f73035j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e.f f73036k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f73037l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f73038m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e eVar, e.f fVar, boolean z10, boolean z11, zu.d dVar) {
        super(2, dVar);
        this.f73035j = eVar;
        this.f73036k = fVar;
        this.f73037l = z10;
        this.f73038m = z11;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new x(this.f73035j, this.f73036k, this.f73037l, this.f73038m, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f73034i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f73034i = 1;
        Object objectForPropositionAsync = this.f73035j.getObjectForPropositionAsync(this.f73036k, this.f73037l, this.f73038m, this);
        return objectForPropositionAsync == coroutine_suspended ? coroutine_suspended : objectForPropositionAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((x) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
