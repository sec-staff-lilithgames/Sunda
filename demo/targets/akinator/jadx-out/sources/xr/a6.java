package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a6 extends k4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1 f92247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b6 f92248b;

    public a6(b6 b6Var, k1 k1Var) {
        this.f92248b = b6Var;
        this.f92247a = k1Var;
    }

    @Override // xr.k4, xr.k1
    public void start(m1 m1Var) {
        this.f92248b.f92272b.reportCallStarted();
        super.start(new z5(this, m1Var));
    }
}
