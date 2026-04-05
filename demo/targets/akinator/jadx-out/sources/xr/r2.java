package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f92947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wr.e4 f92948c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t2 f92949e;

    public r2(t2 t2Var, wr.m6 m6Var, wr.e4 e4Var) {
        this.f92949e = t2Var;
        this.f92947b = m6Var;
        this.f92948c = e4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92949e.f93001a.onClose(this.f92947b, this.f92948c);
    }
}
