package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f93254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z3 f93255c;

    public y3(z3 z3Var, boolean z10) {
        this.f93255c = z3Var;
        this.f93254b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10 = this.f93254b;
        z3 z3Var = this.f93255c;
        if (z10) {
            d4 d4Var = z3Var.f93292c;
            d4Var.f92399l = true;
            if (d4Var.f92396i > 0) {
                d4Var.f92398k.reset().start();
            }
        }
        z3Var.f93292c.f92404q = false;
    }
}
