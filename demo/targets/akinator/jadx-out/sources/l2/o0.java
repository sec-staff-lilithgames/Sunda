package l2;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72339i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h1 f72340j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f72341k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(w wVar, h1 h1Var, zu.d dVar) {
        super(2, dVar);
        this.f72340j = h1Var;
        this.f72341k = wVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new o0(this.f72341k, this.f72340j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72339i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72339i = 1;
        Object objAwaitLoad = this.f72340j.awaitLoad(this.f72341k, this);
        return objAwaitLoad == coroutine_suspended ? coroutine_suspended : objAwaitLoad;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((o0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
