package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f93252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a3 f93253c;

    public y2(a3 a3Var, wr.m6 m6Var) {
        this.f93253c = a3Var;
        this.f93252b = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f93253c.f92237h.transportShutdown(this.f93252b);
    }
}
