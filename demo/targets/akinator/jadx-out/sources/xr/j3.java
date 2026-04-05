package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.z0 f92694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3 f92695c;

    public j3(v3 v3Var, wr.z0 z0Var) {
        this.f92695c = v3Var;
        this.f92694b = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92695c.f93162c.setDeadline(this.f92694b);
    }
}
