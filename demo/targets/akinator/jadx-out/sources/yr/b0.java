package yr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f94839b;

    public b0(d0 d0Var) {
        this.f94839b = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f94839b.getClass();
        d0 d0Var = this.f94839b;
        d0Var.f94863o.execute(d0Var.f94868t);
        synchronized (this.f94839b.f94859k) {
            d0 d0Var2 = this.f94839b;
            d0Var2.E = Integer.MAX_VALUE;
            d0Var2.l();
        }
        this.f94839b.getClass();
    }
}
