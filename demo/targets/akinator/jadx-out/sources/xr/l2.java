package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f92753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u2 f92754c;

    public l2(u2 u2Var, int i10) {
        this.f92754c = u2Var;
        this.f92753b = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92754c.f93077f.request(this.f92753b);
    }
}
