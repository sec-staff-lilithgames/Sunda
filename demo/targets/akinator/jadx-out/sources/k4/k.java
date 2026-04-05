package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends bv.n implements kv.l {

    /* renamed from: i, reason: collision with root package name */
    public int f70383i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f70384j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, zu.d dVar) {
        super(1, dVar);
        this.f70384j = hVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(zu.d<?> dVar) {
        return new k(this.f70384j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f70383i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            this.f70383i = 1;
            if (this.f70384j.cleanUp(this) == coroutine_suspended) {
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

    @Override // kv.l
    public final Object invoke(zu.d<? super tu.x0> dVar) {
        return ((k) create(dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
