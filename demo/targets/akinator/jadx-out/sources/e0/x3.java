package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public z3 f53394i;

    /* renamed from: j, reason: collision with root package name */
    public kotlin.jvm.internal.a1 f53395j;

    /* renamed from: k, reason: collision with root package name */
    public long f53396k;

    /* renamed from: l, reason: collision with root package name */
    public int f53397l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f53398m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z3 f53399n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.a1 f53400o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f53401p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(z3 z3Var, kotlin.jvm.internal.a1 a1Var, long j10, zu.d dVar) {
        super(2, dVar);
        this.f53399n = z3Var;
        this.f53400o = a1Var;
        this.f53401p = j10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        x3 x3Var = new x3(this.f53399n, this.f53400o, this.f53401p, dVar);
        x3Var.f53398m = obj;
        return x3Var;
    }

    @Override // kv.p
    public final Object invoke(d3 d3Var, zu.d<? super tu.x0> dVar) {
        return ((x3) create(d3Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        z3 z3Var;
        kotlin.jvm.internal.a1 a1Var;
        long j10;
        z3 z3Var2;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53397l;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            d3 d3Var = (d3) this.f53398m;
            z3Var = this.f53399n;
            w3 w3Var = new w3(z3Var, new v3(z3Var, d3Var));
            d2 flingBehavior = z3Var.getFlingBehavior();
            kotlin.jvm.internal.a1 a1Var2 = this.f53400o;
            long j11 = a1Var2.f71813b;
            float fReverseIfNeeded = z3Var.reverseIfNeeded(z3Var.m3797toFloatTH1AsA0(this.f53401p));
            this.f53398m = z3Var;
            this.f53394i = z3Var;
            this.f53395j = a1Var2;
            this.f53396k = j11;
            this.f53397l = 1;
            obj = flingBehavior.performFling(w3Var, fReverseIfNeeded, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            a1Var = a1Var2;
            j10 = j11;
            z3Var2 = z3Var;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f53396k;
            a1Var = this.f53395j;
            z3Var = this.f53394i;
            z3Var2 = (z3) this.f53398m;
            tu.a0.throwOnFailure(obj);
        }
        a1Var.f71813b = z3Var.m3801updateQWom1Mo(j10, z3Var2.reverseIfNeeded(((Number) obj).floatValue()));
        return tu.x0.f87415a;
    }
}
