package d0;

import e0.q4;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f51610i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f51611j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f51612k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f51613l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f51614m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v5 f51615n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v5 f51616o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f0.q f51617p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51618q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v5 f51619r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v5 f51620s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(boolean z10, boolean z11, boolean z12, v5 v5Var, v5 v5Var2, f0.q qVar, p0.j2 j2Var, v5 v5Var3, v5 v5Var4, zu.d dVar) {
        super(2, dVar);
        this.f51612k = z10;
        this.f51613l = z11;
        this.f51614m = z12;
        this.f51615n = v5Var;
        this.f51616o = v5Var2;
        this.f51617p = qVar;
        this.f51618q = j2Var;
        this.f51619r = v5Var3;
        this.f51620s = v5Var4;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        t0 t0Var = new t0(this.f51612k, this.f51613l, this.f51614m, this.f51615n, this.f51616o, this.f51617p, this.f51618q, this.f51619r, this.f51620s, dVar);
        t0Var.f51611j = obj;
        return t0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f51610i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f51611j;
            boolean z10 = this.f51612k;
            q0 q0Var = null;
            boolean z11 = this.f51613l;
            p0 p0Var = (z10 && z11) ? new p0(this.f51615n) : null;
            if (this.f51614m && z11) {
                q0Var = new q0(this.f51616o);
            }
            q0 q0Var2 = q0Var;
            r0 r0Var = new r0(this.f51613l, this.f51617p, this.f51618q, this.f51619r, null);
            s0 s0Var = new s0(z11, this.f51620s);
            this.f51610i = 1;
            if (q4.detectTapGestures(k0Var, p0Var, q0Var2, r0Var, s0Var, this) == coroutine_suspended) {
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
        return ((t0) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
