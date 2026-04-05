package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.c1 f92496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3 f92497c;

    public f3(v3 v3Var, wr.c1 c1Var) {
        this.f92497c = v3Var;
        this.f92496b = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92497c.f93162c.setDecompressorRegistry(this.f92496b);
    }
}
