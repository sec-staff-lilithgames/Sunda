package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class mc extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f10663c;

    /* renamed from: e, reason: collision with root package name */
    public final long f10664e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10665f;

    public mc(mt.g0 g0Var, long j10, long j11, int i10) {
        super(g0Var);
        this.f10663c = j10;
        this.f10664e = j11;
        this.f10665f = i10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        long j10 = this.f10664e;
        long j11 = this.f10663c;
        mt.g0 g0Var = this.f10053b;
        if (j11 == j10) {
            g0Var.subscribe(new kc(i0Var, j11, this.f10665f));
            return;
        }
        g0Var.subscribe(new lc(i0Var, this.f10663c, this.f10664e, this.f10665f));
    }
}
