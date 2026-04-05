package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class mc implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qc f92803b;

    public mc(qc qcVar) {
        this.f92803b = qcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tc tcVar = this.f92803b.f92933b;
        tcVar.f93064z = true;
        m1 m1Var = tcVar.f93059u;
        androidx.appcompat.app.i1 i1Var = tcVar.f93057s;
        m1Var.closed((wr.m6) i1Var.f4754a, (l1) i1Var.f4755b, (wr.e4) i1Var.f4756c);
    }
}
