package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w3 f51294i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(w3 w3Var, zu.d dVar) {
        super(2, dVar);
        this.f51294i = w3Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new a3(this.f51294i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        this.f51294i.updateContent();
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(tu.x0 x0Var, zu.d<? super tu.x0> dVar) {
        return ((a3) create(x0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
