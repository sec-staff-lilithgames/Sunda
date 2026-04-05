package d0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 extends bv.n implements kv.q {

    /* renamed from: i, reason: collision with root package name */
    public int f51372i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ e0.p2 f51373j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ long f51374k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f51375l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f0.q f51376m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51377n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v5 f51378o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(boolean z10, f0.q qVar, p0.j2 j2Var, v5 v5Var, zu.d dVar) {
        super(3, dVar);
        this.f51375l = z10;
        this.f51376m = qVar;
        this.f51377n = j2Var;
        this.f51378o = v5Var;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m3692invoked4ec7I((e0.p2) obj, ((i1.h) obj2).m4195unboximpl(), (zu.d) obj3);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m3692invoked4ec7I(e0.p2 p2Var, long j10, zu.d<? super tu.x0> dVar) {
        g0 g0Var = new g0(this.f51375l, this.f51376m, this.f51377n, this.f51378o, dVar);
        g0Var.f51373j = p2Var;
        g0Var.f51374k = j10;
        return g0Var.invokeSuspend(tu.x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f51372i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            e0.p2 p2Var = this.f51373j;
            long j10 = this.f51374k;
            if (this.f51375l) {
                this.f51372i = 1;
                if (k0.m3715handlePressInteractionEPk0efs(p2Var, j10, this.f51376m, this.f51377n, this.f51378o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }
}
