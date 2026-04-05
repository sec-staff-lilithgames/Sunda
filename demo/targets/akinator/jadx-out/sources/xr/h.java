package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f92573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f92574c;

    public h(j jVar, wr.m6 m6Var) {
        this.f92574c = jVar;
        this.f92573b = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92574c.d(this.f92573b);
    }
}
