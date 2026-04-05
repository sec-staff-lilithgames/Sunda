package jm;

import android.content.Context;
import br.p1;
import io.bidmachine.i2;
import tm.q;
import tm.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j implements r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f69691a;

    /* renamed from: b, reason: collision with root package name */
    public final hr.i f69692b;

    /* renamed from: c, reason: collision with root package name */
    public final fn.c f69693c;

    public j(Context context, hr.i iVar, fn.c cVar) {
        this.f69691a = context;
        this.f69692b = iVar;
        this.f69693c = cVar;
    }

    @Override // tm.r
    public void onCalendarEvent(q qVar, String str, um.k kVar) {
        this.f69692b.onAdClicked();
        cr.r.openCalendar(this.f69691a, str, new d(kVar, 5));
    }

    @Override // tm.r
    public void onClose(q qVar) {
        boolean zIsShown = qVar.isShown();
        hr.i iVar = this.f69692b;
        if (zIsShown) {
            fn.c cVar = this.f69693c;
            if (cVar != null) {
                cVar.destroy();
            }
            ((i2) iVar).onAdFinished();
        }
        ((i2) iVar).onAdClosed();
    }

    @Override // tm.r
    public void onExpired(q qVar, qm.b bVar) {
        this.f69692b.onAdExpired();
    }

    @Override // tm.r
    public void onLoadFailed(q qVar, qm.b bVar) {
        this.f69692b.onAdLoadFailed(pr.g.mapError(bVar));
    }

    @Override // tm.r
    public void onLoaded(q qVar) {
        ((i2) this.f69692b).onAdLoaded();
    }

    @Override // tm.r
    public void onOpenPrivacySheet(q qVar, p1 p1Var) {
        Context contextPeekContext = qVar.peekContext();
        if (contextPeekContext == null) {
            contextPeekContext = this.f69691a;
        }
        nm.j.ifNotNull(nm.j.findDialogContext(contextPeekContext), new e(p1Var, 1));
    }

    @Override // tm.r
    public void onOpenUrl(q qVar, String str, um.k kVar) {
        this.f69692b.onAdClicked();
        cr.r.openUrl(this.f69691a, str, new d(kVar, 3));
    }

    @Override // tm.r
    public void onShowFailed(q qVar, qm.b bVar) {
        this.f69692b.onAdShowFailed(pr.g.mapError(bVar));
    }

    @Override // tm.r
    public void onShown(q qVar) {
        this.f69692b.onAdShown();
    }

    @Override // tm.r
    public void onStorePicture(q qVar, String str, um.k kVar) {
        this.f69692b.onAdClicked();
        cr.r.storePicture(this.f69691a, str, new d(kVar, 4));
    }

    @Override // tm.r
    public void onPlayVideo(q qVar, String str) {
    }
}
