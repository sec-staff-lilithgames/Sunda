package l2;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72355i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0 f72356j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f72357k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h1 f72358l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(m0 m0Var, w wVar, h1 h1Var, zu.d dVar) {
        super(2, dVar);
        this.f72356j = m0Var;
        this.f72357k = wVar;
        this.f72358l = h1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new q0(this.f72356j, this.f72357k, this.f72358l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72355i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        o oVar = this.f72356j.f72329a;
        w wVar = this.f72357k;
        h1 h1Var = this.f72358l;
        p0 p0Var = new p0(wVar, h1Var, null);
        this.f72355i = 1;
        Object objRunCached = oVar.runCached(wVar, h1Var, true, p0Var, this);
        return objRunCached == coroutine_suspended ? coroutine_suspended : objRunCached;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((q0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
