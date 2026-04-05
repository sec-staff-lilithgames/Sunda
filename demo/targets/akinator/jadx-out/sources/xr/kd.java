package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class kd implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final wr.n0 f92741b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f92742c;

    public kd(wr.n0 n0Var, Throwable th2) {
        this.f92741b = n0Var;
        this.f92742c = th2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92741b.cancel(this.f92742c);
    }
}
