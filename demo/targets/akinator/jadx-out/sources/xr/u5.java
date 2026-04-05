package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f93084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i6 f93085c;

    public u5(i6 i6Var, wr.m6 m6Var) {
        this.f93085c = i6Var;
        this.f93084b = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        wr.f0 state = this.f93085c.f92632y.getState();
        wr.f0 f0Var = wr.f0.f90916g;
        if (state == f0Var) {
            return;
        }
        i6 i6Var = this.f93085c;
        i6Var.f92633z = this.f93084b;
        b6 b6Var = i6Var.f92631x;
        i6 i6Var2 = this.f93085c;
        b6 b6Var2 = i6Var2.f92630w;
        i6Var2.f92631x = null;
        i6 i6Var3 = this.f93085c;
        i6Var3.f92630w = null;
        i6.a(i6Var3, f0Var);
        this.f93085c.f92621n.reset();
        if (this.f93085c.f92628u.isEmpty()) {
            i6 i6Var4 = this.f93085c;
            i6Var4.f92620m.execute(new v5(i6Var4));
        }
        i6 i6Var5 = this.f93085c;
        i6Var5.f92620m.throwIfNotInThisSynchronizationContext();
        wr.t6 t6Var = i6Var5.f92625r;
        if (t6Var != null) {
            t6Var.cancel();
            i6Var5.f92625r = null;
            i6Var5.f92623p = null;
        }
        wr.t6 t6Var2 = this.f93085c.f92626s;
        if (t6Var2 != null) {
            t6Var2.cancel();
            this.f93085c.f92627t.shutdown(this.f93084b);
            i6 i6Var6 = this.f93085c;
            i6Var6.f92626s = null;
            i6Var6.f92627t = null;
        }
        if (b6Var != null) {
            b6Var.shutdown(this.f93084b);
        }
        if (b6Var2 != null) {
            b6Var2.shutdown(this.f93084b);
        }
    }
}
