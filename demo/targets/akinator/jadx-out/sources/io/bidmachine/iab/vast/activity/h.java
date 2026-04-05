package io.bidmachine.iab.vast.activity;

import br.p1;
import io.bidmachine.iab.vast.t;
import io.bidmachine.iab.vast.w;
import tm.q;
import tm.r;
import um.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VastView f60480a;

    public h(VastView vastView) {
        this.f60480a = vastView;
    }

    @Override // tm.r
    public void onClose(q qVar) {
        int i10 = VastView.f60422k0;
        this.f60480a.u();
    }

    @Override // tm.r
    public void onExpired(q qVar, qm.b bVar) {
        VastView vastView = this.f60480a;
        io.bidmachine.iab.vast.e.e(vastView.f60424b, "handleCompanionExpired - %s", bVar);
        t tVar = vastView.f60452v;
        if (tVar != null) {
            tVar.sendVastSpecError(w.f60563k);
        }
        if (vastView.f60449s != null) {
            vastView.z();
            vastView.k(true);
        }
    }

    @Override // tm.r
    public void onLoadFailed(q qVar, qm.b bVar) {
        int i10 = VastView.f60422k0;
        this.f60480a.n(bVar);
    }

    @Override // tm.r
    public void onLoaded(q qVar) {
        VastView vastView = this.f60480a;
        if (vastView.f60453w.f60466l) {
            vastView.setLoadingViewVisibility(false);
            qVar.showInView(vastView, false);
        }
    }

    @Override // tm.r
    public void onOpenUrl(q qVar, String str, k kVar) throws IllegalStateException {
        kVar.clickHandled();
        VastView vastView = this.f60480a;
        VastView.f(vastView, vastView.f60449s, str);
    }

    @Override // tm.r
    public void onShowFailed(q qVar, qm.b bVar) {
        int i10 = VastView.f60422k0;
        this.f60480a.n(bVar);
    }

    @Override // tm.r
    public void onShown(q qVar) {
    }

    @Override // tm.r
    public void onOpenPrivacySheet(q qVar, p1 p1Var) {
    }

    @Override // tm.r
    public void onPlayVideo(q qVar, String str) {
    }

    @Override // tm.r
    public void onCalendarEvent(q qVar, String str, k kVar) {
    }

    @Override // tm.r
    public void onStorePicture(q qVar, String str, k kVar) {
    }
}
