package l0;

import m0.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72185i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f72186j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w0 f72187k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, zu.d dVar) {
        super(2, dVar);
        this.f72187k = w0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        v0 v0Var = new v0(this.f72187k, dVar);
        v0Var.f72186j = obj;
        return v0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72185i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f72186j;
            this.f72185i = 1;
            if (b3.mouseSelectionDetector(k0Var, this.f72187k, this) == coroutine_suspended) {
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
        return ((v0) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
