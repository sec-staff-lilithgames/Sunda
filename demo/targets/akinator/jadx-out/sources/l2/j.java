package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends bv.n implements kv.l {

    /* renamed from: i, reason: collision with root package name */
    public int f72305i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f72306j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f72307k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, w wVar, zu.d dVar) {
        super(1, dVar);
        this.f72306j = mVar;
        this.f72307k = wVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(zu.d<?> dVar) {
        return new j(this.f72306j, this.f72307k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72305i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72305i = 1;
        Object objLoadWithTimeoutOrNull$ui_text_release = this.f72306j.loadWithTimeoutOrNull$ui_text_release(this.f72307k, this);
        return objLoadWithTimeoutOrNull$ui_text_release == coroutine_suspended ? coroutine_suspended : objLoadWithTimeoutOrNull$ui_text_release;
    }

    @Override // kv.l
    public final Object invoke(zu.d<Object> dVar) {
        return ((j) create(dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
