package yr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xr.d0 f94992b;

    public q(xr.d0 d0Var) {
        this.f94992b = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f94992b.backoff();
    }
}
