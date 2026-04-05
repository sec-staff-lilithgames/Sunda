package e0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53040i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f53041j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d0.l3 f53042k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.p f53043l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, d0.l3 l3Var, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f53041j = hVar;
        this.f53042k = l3Var;
        this.f53043l = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new f(this.f53041j, this.f53042k, this.f53043l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53040i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            h hVar = this.f53041j;
            d0.m3 m3Var = hVar.f53083c;
            i1 i1Var = hVar.f53082b;
            this.f53040i = 1;
            if (m3Var.mutateWith(i1Var, this.f53042k, this.f53043l, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
