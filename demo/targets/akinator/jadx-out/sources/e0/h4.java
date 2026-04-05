package e0;

import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h4 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53092i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53093j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s2 f53094k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.q f53095l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.l f53096m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(s2 s2Var, kv.q qVar, kv.l lVar, zu.d dVar) {
        super(2, dVar);
        this.f53094k = s2Var;
        this.f53095l = qVar;
        this.f53096m = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        h4 h4Var = new h4(this.f53094k, this.f53095l, this.f53096m, dVar);
        h4Var.f53093j = obj;
        return h4Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53092i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            g4 g4Var = new g4(this.f53094k, (u1.k0) this.f53093j, this.f53095l, this.f53096m, null);
            this.f53092i = 1;
            if (CoroutineScopeKt.coroutineScope(g4Var, this) == coroutine_suspended) {
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
        return ((h4) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
