package m0;

import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f73855i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f73856j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.l f73857k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(kv.l lVar, zu.d dVar) {
        super(2, dVar);
        this.f73857k = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        x0 x0Var = new x0(this.f73857k, dVar);
        x0Var.f73856j = obj;
        return x0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f73855i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            w0 w0Var = new w0((u1.k0) this.f73856j, this.f73857k, null);
            this.f73855i = 1;
            if (CoroutineScopeKt.coroutineScope(w0Var, this) == coroutine_suspended) {
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
    public final Object invoke(u1.k0 k0Var, zu.d<? super tu.x0> dVar) {
        return ((x0) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
