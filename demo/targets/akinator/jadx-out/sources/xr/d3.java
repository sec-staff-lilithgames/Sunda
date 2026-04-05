package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.d0 f92379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3 f92380c;

    public d3(v3 v3Var, wr.d0 d0Var) {
        this.f92380c = v3Var;
        this.f92379b = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92380c.f93162c.setCompressor(this.f92379b);
    }
}
