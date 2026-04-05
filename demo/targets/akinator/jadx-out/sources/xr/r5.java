package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i6 f92951b;

    public r5(i6 i6Var) {
        this.f92951b = i6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f92951b.f92632y.getState() != wr.f0.f90914e) {
            return;
        }
        i6 i6Var = this.f92951b;
        i6Var.f92620m.throwIfNotInThisSynchronizationContext();
        wr.t6 t6Var = i6Var.f92625r;
        if (t6Var != null) {
            t6Var.cancel();
            i6Var.f92625r = null;
            i6Var.f92623p = null;
        }
        this.f92951b.f92618k.log(wr.l.f91018c, "CONNECTING; backoff interrupted");
        i6.a(this.f92951b, wr.f0.f90912b);
        i6.b(this.f92951b);
    }
}
