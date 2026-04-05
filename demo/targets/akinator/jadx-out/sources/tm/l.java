package tm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f87075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar) {
        super(gVar);
        this.f87075b = gVar;
    }

    @Override // tm.k, tm.t0
    public void onPageFinished(String str) {
        g gVar = this.f87075b;
        w0 w0Var = gVar.f87055t;
        if (gVar.f87058w == n0.f87102b && gVar.f87042g.compareAndSet(false, true)) {
            w0Var.applySupportedServices(gVar.f87052q);
            y yVar = gVar.f87038b;
            if (yVar != null) {
                w0Var.applyPlacement(yVar);
            }
            w0Var.applyViewable(w0Var.isViewable());
            w0Var.b(gVar.f87040e);
            gVar.b(w0Var.getWebView());
            gVar.setViewState(n0.f87103c);
            if (gVar.f87043h.compareAndSet(false, true)) {
                w0Var.notifyReady();
            }
            gVar.f87056u.onMraidAdViewPageLoaded(gVar, str, w0Var.getWebView(), w0Var.isUseCustomClose());
        }
    }

    @Override // tm.k, tm.t0
    public void onUseCustomClose(boolean z10) {
        g gVar = this.f87075b;
        gVar.f87056u.onSyncCustomCloseIntention(gVar, gVar.f87055t.isUseCustomClose());
    }

    @Override // tm.k, tm.t0
    public void onViewableChanged(boolean z10) {
        if (z10) {
            int i10 = g.f87037y;
            g gVar = this.f87075b;
            if (gVar.f87043h.compareAndSet(false, true)) {
                gVar.f87055t.notifyReady();
            }
            if (gVar.f87045j.compareAndSet(false, true)) {
                gVar.f87056u.onMraidAdViewShown(gVar);
            }
        }
    }
}
