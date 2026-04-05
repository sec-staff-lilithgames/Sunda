package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f92606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f92607c;

    public i5(n1 n1Var, Throwable th2) {
        this.f92606b = n1Var;
        this.f92607c = th2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((u6) this.f92606b).onFailure(this.f92607c);
    }
}
