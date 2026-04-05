package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i6 f92874b;

    public p5(i6 i6Var) {
        this.f92874b = i6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        i6 i6Var = this.f92874b;
        i6Var.f92625r = null;
        i6Var.f92618k.log(wr.l.f91018c, "CONNECTING after backoff");
        i6.a(i6Var, wr.f0.f90912b);
        i6.b(i6Var);
    }
}
