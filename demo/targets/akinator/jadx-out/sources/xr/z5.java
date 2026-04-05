package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z5 extends l4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f93295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a6 f93296b;

    public z5(a6 a6Var, m1 m1Var) {
        this.f93296b = a6Var;
        this.f93295a = m1Var;
    }

    @Override // xr.l4, xr.m1
    public void closed(wr.m6 m6Var, l1 l1Var, wr.e4 e4Var) {
        this.f93296b.f92248b.f92272b.reportCallEnded(m6Var.isOk());
        super.closed(m6Var, l1Var, e4Var);
    }
}
