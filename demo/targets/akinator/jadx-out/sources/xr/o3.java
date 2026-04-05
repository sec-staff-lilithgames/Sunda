package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f92842b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3 f92843c;

    public o3(v3 v3Var, wr.m6 m6Var) {
        this.f92843c = v3Var;
        this.f92842b = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92843c.f93162c.cancel(this.f92842b);
    }
}
