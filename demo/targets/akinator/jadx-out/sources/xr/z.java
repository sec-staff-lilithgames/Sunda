package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f93273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f93274c;

    public z(c0 c0Var, boolean z10) {
        this.f93274c = c0Var;
        this.f93273b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f93274c.f92297b.deframerClosed(this.f93273b);
    }
}
