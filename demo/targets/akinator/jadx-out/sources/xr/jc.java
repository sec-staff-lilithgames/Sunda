package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class jc implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.e4 f92717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qc f92718c;

    public jc(qc qcVar, wr.e4 e4Var) {
        this.f92718c = qcVar;
        this.f92717b = e4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92718c.f92933b.f93059u.headersRead(this.f92717b);
    }
}
