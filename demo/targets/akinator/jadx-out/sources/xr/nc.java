package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class nc implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rc f92826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qc f92827c;

    public nc(qc qcVar, rc rcVar) {
        this.f92827c = qcVar;
        this.f92826b = rcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tc tcVar = this.f92827c.f92933b;
        wr.z3 z3Var = tc.A;
        tcVar.e(this.f92826b);
    }
}
