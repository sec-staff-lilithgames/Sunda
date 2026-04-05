package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f92600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u2 f92601c;

    public i2(u2 u2Var, wr.m6 m6Var) {
        this.f92601c = u2Var;
        this.f92600b = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        wr.p pVar = this.f92601c.f93077f;
        wr.m6 m6Var = this.f92600b;
        pVar.cancel(m6Var.getDescription(), m6Var.getCause());
    }
}
