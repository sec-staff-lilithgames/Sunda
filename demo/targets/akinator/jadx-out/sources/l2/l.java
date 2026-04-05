package l2;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72315i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f72316j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f72317k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, w wVar, zu.d dVar) {
        super(2, dVar);
        this.f72316j = mVar;
        this.f72317k = wVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new l(this.f72316j, this.f72317k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72315i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        h1 h1Var = this.f72316j.f72324g;
        this.f72315i = 1;
        Object objAwaitLoad = h1Var.awaitLoad(this.f72317k, this);
        return objAwaitLoad == coroutine_suspended ? coroutine_suspended : objAwaitLoad;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((l) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
