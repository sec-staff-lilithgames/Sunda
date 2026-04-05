package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g6 f92421b;

    public d6(g6 g6Var) {
        this.f92421b = g6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        g6 g6Var = this.f92421b;
        i6 i6Var = g6Var.f92557c;
        i6Var.f92623p = null;
        if (i6Var.f92633z != null) {
            mh.p1.checkState(i6Var.f92631x == null, "Unexpected non-null activeTransport");
            g6 g6Var2 = this.f92421b;
            g6Var2.f92555a.shutdown(g6Var2.f92557c.f92633z);
            return;
        }
        b6 b6Var = i6Var.f92630w;
        b6 b6Var2 = g6Var.f92555a;
        if (b6Var == b6Var2) {
            i6Var.f92631x = b6Var2;
            i6 i6Var2 = this.f92421b.f92557c;
            i6Var2.f92630w = null;
            i6.a(i6Var2, wr.f0.f90913c);
        }
    }
}
