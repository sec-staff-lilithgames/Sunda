package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class pc implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qc f92902b;

    public pc(qc qcVar) {
        this.f92902b = qcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tc tcVar = this.f92902b.f92933b;
        if (tcVar.f93064z) {
            return;
        }
        tcVar.f93059u.onReady();
    }
}
