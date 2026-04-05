package e0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o4 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53223i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53224j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u1.k0 f53225k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.q f53226l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.l f53227m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kv.l f53228n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kv.l f53229o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(u1.k0 k0Var, kv.l lVar, kv.l lVar2, kv.q qVar, kv.l lVar3, zu.d dVar) {
        super(2, dVar);
        this.f53225k = k0Var;
        this.f53226l = qVar;
        this.f53227m = lVar;
        this.f53228n = lVar2;
        this.f53229o = lVar3;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        o4 o4Var = new o4(this.f53225k, this.f53227m, this.f53228n, this.f53226l, this.f53229o, dVar);
        o4Var.f53224j = obj;
        return o4Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53223i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f53224j;
            u1.k0 k0Var = this.f53225k;
            n4 n4Var = new n4(new s2(k0Var), this.f53226l, coroutineScope, this.f53227m, this.f53228n, this.f53229o, null);
            this.f53223i = 1;
            if (h2.forEachGesture(k0Var, n4Var, this) == coroutine_suspended) {
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
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((o4) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
