package tm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f87093b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g gVar) {
        super(gVar);
        this.f87093b = gVar;
    }

    @Override // tm.k, tm.t0
    public void onPageFinished(String str) {
        g gVar = this.f87093b;
        if (gVar.f87057v == null) {
            return;
        }
        gVar.updateMetrics(new f(gVar));
    }

    @Override // tm.k, tm.t0
    public void onUseCustomClose(boolean z10) {
        g gVar = this.f87093b;
        w0 w0Var = gVar.f87057v;
        if (w0Var != null) {
            gVar.f87056u.onSyncCustomCloseIntention(gVar, w0Var.isUseCustomClose());
        }
    }

    @Override // tm.k, tm.t0
    public void onViewableChanged(boolean z10) {
    }
}
