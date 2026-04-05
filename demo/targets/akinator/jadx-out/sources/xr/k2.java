package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f92728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u2 f92729c;

    public k2(u2 u2Var, boolean z10) {
        this.f92729c = u2Var;
        this.f92728b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92729c.f93077f.setMessageCompression(this.f92728b);
    }
}
