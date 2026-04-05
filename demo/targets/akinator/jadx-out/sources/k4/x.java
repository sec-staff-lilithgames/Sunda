package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f70556i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q2 f70557j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q2 q2Var, zu.d dVar) {
        super(2, dVar);
        this.f70557j = q2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        x xVar = new x(this.f70557j, dVar);
        xVar.f70556i = obj;
        return xVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        q2 q2Var = (q2) this.f70556i;
        return bv.b.boxBoolean((q2Var instanceof g) && q2Var.getVersion() <= this.f70557j.getVersion());
    }

    @Override // kv.p
    public final Object invoke(q2 q2Var, zu.d<? super Boolean> dVar) {
        return ((x) create(q2Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
