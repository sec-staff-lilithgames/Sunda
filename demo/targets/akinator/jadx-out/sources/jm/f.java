package jm;

import br.p1;
import cr.r;
import io.bidmachine.i4;
import tm.l0;
import tm.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final hr.f f69681a;

    public f(hr.f fVar) {
        this.f69681a = fVar;
    }

    @Override // tm.m0
    public void onCalendarEvent(l0 l0Var, String str, um.k kVar) {
        this.f69681a.onAdClicked();
        r.openCalendar(l0Var.getContext(), str, new d(kVar, 2));
    }

    @Override // tm.m0
    public void onExpired(l0 l0Var, qm.b bVar) {
        this.f69681a.onAdExpired();
    }

    @Override // tm.m0
    public void onLoadFailed(l0 l0Var, qm.b bVar) {
        this.f69681a.onAdLoadFailed(pr.g.mapError(bVar));
    }

    @Override // tm.m0
    public void onLoaded(l0 l0Var) {
        ((i4) this.f69681a).onAdLoaded(l0Var);
    }

    @Override // tm.m0
    public void onOpenPrivacySheet(l0 l0Var, p1 p1Var) {
        nm.j.ifNotNull(nm.j.findDialogContext(l0Var.peekContext(), l0Var), new e(p1Var, 0));
    }

    @Override // tm.m0
    public void onOpenUrl(l0 l0Var, String str, um.k kVar) {
        this.f69681a.onAdClicked();
        r.openUrl(l0Var.getContext(), str, new d(kVar, 0));
    }

    @Override // tm.m0
    public void onShowFailed(l0 l0Var, qm.b bVar) {
        this.f69681a.onAdShowFailed(pr.g.mapError(bVar));
    }

    @Override // tm.m0
    public void onShown(l0 l0Var) {
        this.f69681a.onAdShown();
    }

    @Override // tm.m0
    public void onStorePicture(l0 l0Var, String str, um.k kVar) {
        this.f69681a.onAdClicked();
        r.storePicture(l0Var.getContext(), str, new d(kVar, 1));
    }

    @Override // tm.m0
    public void onClose(l0 l0Var) {
    }

    @Override // tm.m0
    public void onExpand(l0 l0Var) {
    }

    @Override // tm.m0
    public void onPlayVideo(l0 l0Var, String str) {
    }
}
