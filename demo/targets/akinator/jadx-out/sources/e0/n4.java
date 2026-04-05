package e0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n4 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53207i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53208j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s2 f53209k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.q f53210l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f53211m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kv.l f53212n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kv.l f53213o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kv.l f53214p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(s2 s2Var, kv.q qVar, CoroutineScope coroutineScope, kv.l lVar, kv.l lVar2, kv.l lVar3, zu.d dVar) {
        super(2, dVar);
        this.f53209k = s2Var;
        this.f53210l = qVar;
        this.f53211m = coroutineScope;
        this.f53212n = lVar;
        this.f53213o = lVar2;
        this.f53214p = lVar3;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        n4 n4Var = new n4(this.f53209k, this.f53210l, this.f53211m, this.f53212n, this.f53213o, this.f53214p, dVar);
        n4Var.f53208j = obj;
        return n4Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53207i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f53208j;
            m4 m4Var = new m4(this.f53209k, this.f53210l, this.f53211m, this.f53212n, this.f53213o, this.f53214p, null);
            this.f53207i = 1;
            if (k0Var.awaitPointerEventScope(m4Var, this) == coroutine_suspended) {
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
        return ((n4) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
