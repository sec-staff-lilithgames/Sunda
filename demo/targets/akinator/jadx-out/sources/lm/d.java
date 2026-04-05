package lm;

import cr.r;
import fn.y;
import hr.i;
import io.bidmachine.i2;
import io.bidmachine.iab.vast.activity.VastActivity;
import io.bidmachine.iab.vast.t;
import pr.g;
import um.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements io.bidmachine.iab.vast.b {

    /* renamed from: a, reason: collision with root package name */
    public final i f73402a;

    /* renamed from: b, reason: collision with root package name */
    public final y f73403b;

    /* renamed from: c, reason: collision with root package name */
    public final fn.c f73404c;

    public d(i iVar, y yVar, fn.c cVar) {
        this.f73402a = iVar;
        this.f73403b = yVar;
        this.f73404c = cVar;
    }

    @Override // io.bidmachine.iab.vast.b
    public void onVastClick(VastActivity vastActivity, t tVar, k kVar, String str) {
        this.f73402a.onAdClicked();
        if (str != null) {
            r.openUrl(vastActivity, str, new jm.d(kVar, 6));
        } else {
            kVar.clickHandleCanceled();
        }
    }

    @Override // io.bidmachine.iab.vast.b
    public void onVastComplete(VastActivity vastActivity, t tVar) {
        y yVar = this.f73403b;
        if (yVar != null) {
            yVar.destroy();
        }
        ((i2) this.f73402a).onAdFinished();
    }

    @Override // io.bidmachine.iab.vast.b
    public void onVastDismiss(VastActivity vastActivity, t tVar, boolean z10) {
        fn.c cVar = this.f73404c;
        if (cVar != null) {
            cVar.destroy();
        }
        ((i2) this.f73402a).onAdClosed();
    }

    @Override // io.bidmachine.iab.vast.b
    public void onVastShowFailed(t tVar, qm.b bVar) {
        this.f73402a.onAdShowFailed(g.mapError(bVar));
    }

    @Override // io.bidmachine.iab.vast.b
    public void onVastShown(VastActivity vastActivity, t tVar) {
        this.f73402a.onAdShown();
    }
}
