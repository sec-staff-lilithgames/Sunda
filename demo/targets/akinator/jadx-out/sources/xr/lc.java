package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class lc implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rc f92772b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qc f92773c;

    public lc(qc qcVar, rc rcVar) {
        this.f92773c = qcVar;
        this.f92772b = rcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92773c.f92933b.f93040b.execute(new kc(this));
    }
}
