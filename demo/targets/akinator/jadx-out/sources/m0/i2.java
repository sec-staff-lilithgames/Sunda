package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f73760i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f73761j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l0.z0 f73762k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(l0.z0 z0Var, zu.d dVar) {
        super(2, dVar);
        this.f73762k = z0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        i2 i2Var = new i2(this.f73762k, dVar);
        i2Var.f73761j = obj;
        return i2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f73760i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f73761j;
            this.f73760i = 1;
            if (l0.j0.detectDownAndDragGesturesWithObserver(k0Var, this.f73762k, this) == coroutine_suspended) {
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
        return ((i2) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
