package e0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g4 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53075i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53076j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s2 f53077k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u1.k0 f53078l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.q f53079m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kv.l f53080n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(s2 s2Var, u1.k0 k0Var, kv.q qVar, kv.l lVar, zu.d dVar) {
        super(2, dVar);
        this.f53077k = s2Var;
        this.f53078l = k0Var;
        this.f53079m = qVar;
        this.f53080n = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        g4 g4Var = new g4(this.f53077k, this.f53078l, this.f53079m, this.f53080n, dVar);
        g4Var.f53076j = obj;
        return g4Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53075i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f53076j;
            s2 s2Var = this.f53077k;
            s2Var.reset();
            f4 f4Var = new f4(this.f53079m, coroutineScope, s2Var, this.f53080n, null);
            this.f53075i = 1;
            if (this.f53078l.awaitPointerEventScope(f4Var, this) == coroutine_suspended) {
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
        return ((g4) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
