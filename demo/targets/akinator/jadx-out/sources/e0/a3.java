package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f52971i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y0 f52972j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f52973k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(kotlin.jvm.internal.y0 y0Var, float f10, zu.d dVar) {
        super(2, dVar);
        this.f52972j = y0Var;
        this.f52973k = f10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        a3 a3Var = new a3(this.f52972j, this.f52973k, dVar);
        a3Var.f52971i = obj;
        return a3Var;
    }

    @Override // kv.p
    public final Object invoke(d3 d3Var, zu.d<? super tu.x0> dVar) {
        return ((a3) create(d3Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        this.f52972j.f71865b = ((d3) this.f52971i).scrollBy(this.f52973k);
        return tu.x0.f87415a;
    }
}
