package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f87690i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f87691j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f87692k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f87693l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f87694m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z10, z zVar, t tVar, zu.d dVar) {
        super(2, dVar);
        this.f87692k = z10;
        this.f87693l = zVar;
        this.f87694m = tVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        x xVar = new x(this.f87692k, this.f87693l, this.f87694m, dVar);
        xVar.f87691j = obj;
        return xVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f87690i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            k0 k0Var = (k0) this.f87691j;
            w wVar = new w(this.f87692k, this.f87693l, this.f87694m, null);
            this.f87690i = 1;
            if (k0Var.awaitPointerEventScope(wVar, this) == coroutine_suspended) {
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
    public final Object invoke(k0 k0Var, zu.d<? super tu.x0> dVar) {
        return ((x) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
