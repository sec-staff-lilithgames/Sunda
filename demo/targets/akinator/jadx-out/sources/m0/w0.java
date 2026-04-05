package m0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f73848i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u1.k0 f73849j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.l f73850k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u1.k0 k0Var, kv.l lVar, zu.d dVar) {
        super(2, dVar);
        this.f73849j = k0Var;
        this.f73850k = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new w0(this.f73849j, this.f73850k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f73848i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            v0 v0Var = new v0(this.f73850k, null);
            this.f73848i = 1;
            if (this.f73849j.awaitPointerEventScope(v0Var, this) == coroutine_suspended) {
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
        return ((w0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
