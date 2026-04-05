package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53418i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53419j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f53420k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c0.n f53421l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y0 f53422m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(float f10, c0.n nVar, kotlin.jvm.internal.y0 y0Var, zu.d dVar) {
        super(2, dVar);
        this.f53420k = f10;
        this.f53421l = nVar;
        this.f53422m = y0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        y2 y2Var = new y2(this.f53420k, this.f53421l, this.f53422m, dVar);
        y2Var.f53419j = obj;
        return y2Var;
    }

    @Override // kv.p
    public final Object invoke(d3 d3Var, zu.d<? super tu.x0> dVar) {
        return ((y2) create(d3Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53418i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            x2 x2Var = new x2(this.f53422m, (d3) this.f53419j);
            this.f53418i = 1;
            if (c0.x1.animate$default(0.0f, this.f53420k, 0.0f, this.f53421l, x2Var, this, 4, null) == coroutine_suspended) {
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
}
