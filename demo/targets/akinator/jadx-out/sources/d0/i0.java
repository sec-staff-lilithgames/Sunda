package d0;

import e0.q4;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f51390i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f51391j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f51392k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f0.q f51393l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51394m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v5 f51395n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v5 f51396o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(boolean z10, f0.q qVar, p0.j2 j2Var, v5 v5Var, v5 v5Var2, zu.d dVar) {
        super(2, dVar);
        this.f51392k = z10;
        this.f51393l = qVar;
        this.f51394m = j2Var;
        this.f51395n = v5Var;
        this.f51396o = v5Var2;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        i0 i0Var = new i0(this.f51392k, this.f51393l, this.f51394m, this.f51395n, this.f51396o, dVar);
        i0Var.f51391j = obj;
        return i0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f51390i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f51391j;
            g0 g0Var = new g0(this.f51392k, this.f51393l, this.f51394m, this.f51395n, null);
            h0 h0Var = new h0(this.f51392k, this.f51396o);
            this.f51390i = 1;
            if (q4.detectTapAndPress(k0Var, g0Var, h0Var, this) == coroutine_suspended) {
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
        return ((i0) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
