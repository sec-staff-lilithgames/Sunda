package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f92226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f92227c;

    public a0(c0 c0Var, Throwable th2) {
        this.f92227c = c0Var;
        this.f92226b = th2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92227c.f92297b.deframeFailed(this.f92226b);
    }
}
