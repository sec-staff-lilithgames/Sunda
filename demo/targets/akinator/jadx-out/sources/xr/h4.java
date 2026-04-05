package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f92581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i4 f92582c;

    public h4(i4 i4Var, n1 n1Var) {
        this.f92582c = i4Var;
        this.f92581b = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((u6) this.f92581b).onFailure(this.f92582c.f92604a.asException());
    }
}
