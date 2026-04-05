package e0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53130i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53131j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t2 f53132k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v5 f53133l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(t2 t2Var, v5 v5Var, zu.d dVar) {
        super(2, dVar);
        this.f53132k = t2Var;
        this.f53133l = v5Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        j3 j3Var = new j3(this.f53132k, this.f53133l, dVar);
        j3Var.f53131j = obj;
        return j3Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53130i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f53131j;
            i3 i3Var = new i3(this.f53132k, this.f53133l, null);
            this.f53130i = 1;
            if (k0Var.awaitPointerEventScope(i3Var, this) == coroutine_suspended) {
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
        return ((j3) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
