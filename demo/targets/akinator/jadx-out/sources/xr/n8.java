package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f92812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p8 f92813c;

    public n8(p8 p8Var, Runnable runnable) {
        this.f92813c = p8Var;
        this.f92812b = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92812b.run();
        p8 p8Var = this.f92813c;
        p8Var.f92880p.f92927d.f93126s.execute(new o8(p8Var));
    }
}
