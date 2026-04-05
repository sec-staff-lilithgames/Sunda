package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class q1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f54618i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v1 f54619j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(v1 v1Var, zu.d dVar) {
        super(2, dVar);
        this.f54619j = v1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        q1 q1Var = new q1(this.f54619j, dVar);
        q1Var.f54618i = obj;
        return q1Var;
    }

    @Override // kv.p
    public final Object invoke(t0 t0Var, zu.d<? super t0> dVar) {
        return ((q1) create(t0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return t0.copy$default((t0) this.f54618i, null, ((a2) this.f54619j.f54653d).currentTime(), null, 5, null);
    }
}
