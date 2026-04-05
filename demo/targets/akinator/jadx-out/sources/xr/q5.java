package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i6 f92921b;

    public q5(i6 i6Var) {
        this.f92921b = i6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f92921b.f92632y.getState() == wr.f0.f90915f) {
            this.f92921b.f92618k.log(wr.l.f91018c, "CONNECTING as requested");
            i6.a(this.f92921b, wr.f0.f90912b);
            i6.b(this.f92921b);
        }
    }
}
