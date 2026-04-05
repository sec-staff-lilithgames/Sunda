package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.e4 f92870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2 f92871c;

    public p2(t2 t2Var, wr.e4 e4Var) {
        this.f92871c = t2Var;
        this.f92870b = e4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92871c.f93001a.onHeaders(this.f92870b);
    }
}
