package l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72175i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f72176j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0 f72177k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(x0 x0Var, zu.d dVar) {
        super(2, dVar);
        this.f72177k = x0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        u0 u0Var = new u0(this.f72177k, dVar);
        u0Var.f72176j = obj;
        return u0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72175i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f72176j;
            z0 longPressDragObserver = this.f72177k.getLongPressDragObserver();
            this.f72175i = 1;
            if (j0.detectDragGesturesAfterLongPressWithObserver(k0Var, longPressDragObserver, this) == coroutine_suspended) {
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
        return ((u0) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
