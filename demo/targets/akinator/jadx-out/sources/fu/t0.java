package fu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final s0 f56105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f56106c;

    public t0(u0 u0Var, s0 s0Var) {
        this.f56106c = u0Var;
        this.f56105b = s0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f56105b.f56102f = true;
        this.f56106c.f56109b.remove(this.f56105b);
    }
}
