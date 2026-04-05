package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f6 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g6 f92503b;

    public f6(g6 g6Var) {
        this.f92503b = g6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        g6 g6Var = this.f92503b;
        g6Var.f92557c.f92628u.remove(g6Var.f92555a);
        if (this.f92503b.f92557c.f92632y.getState() == wr.f0.f90916g && this.f92503b.f92557c.f92628u.isEmpty()) {
            i6 i6Var = this.f92503b.f92557c;
            i6Var.f92620m.execute(new v5(i6Var));
        }
    }
}
