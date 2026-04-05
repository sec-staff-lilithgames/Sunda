package vp;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements dn.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f89520a;

    public g(l lVar) {
        this.f89520a = lVar;
    }

    @Override // dn.i
    public boolean onViewShown() {
        return this.f89520a.dispatchShown();
    }

    @Override // dn.i
    public void onViewTrackingFinished() {
        l lVar = this.f89520a;
        lVar.f89537l = true;
        lVar.dispatchImpression();
    }
}
