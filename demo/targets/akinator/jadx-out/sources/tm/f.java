package tm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f87035b;

    public f(g gVar) {
        this.f87035b = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        g gVar = this.f87035b;
        gVar.f87057v.applySupportedServices(gVar.f87052q);
        y yVar = gVar.f87038b;
        if (yVar != null) {
            gVar.f87057v.applyPlacement(yVar);
        }
        w0 w0Var = gVar.f87057v;
        w0Var.applyViewable(w0Var.isViewable());
        gVar.f87057v.applyState(gVar.f87058w);
        gVar.f87057v.b(gVar.f87040e);
        gVar.f87057v.notifyReady();
    }
}
