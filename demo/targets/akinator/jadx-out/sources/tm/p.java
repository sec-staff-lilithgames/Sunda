package tm;

import br.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f87110a;

    public p(q qVar) {
        this.f87110a = qVar;
    }

    @Override // tm.m0
    public void onCalendarEvent(l0 l0Var, String str, um.k kVar) {
        t.d("MraidInterstitial", "ViewListener - onCalendarEvent (%s)", str);
        q qVar = this.f87110a;
        r rVar = qVar.f87116e;
        if (rVar != null) {
            rVar.onCalendarEvent(qVar, str, kVar);
        }
    }

    @Override // tm.m0
    public void onClose(l0 l0Var) {
        t.d("MraidInterstitial", "ViewListener - onClose", new Object[0]);
        q qVar = this.f87110a;
        q.b(qVar);
        if (qVar.isClosed()) {
            return;
        }
        qVar.f87118g = true;
        r rVar = qVar.f87116e;
        if (rVar != null) {
            rVar.onClose(qVar);
        }
        if (qVar.f87120i) {
            qVar.destroy();
        }
    }

    @Override // tm.m0
    public void onExpired(l0 l0Var, qm.b bVar) {
        t.d("MraidInterstitial", "ViewListener - onExpired (%s)", bVar);
        q qVar = this.f87110a;
        r rVar = qVar.f87116e;
        if (rVar != null) {
            rVar.onExpired(qVar, bVar);
        }
    }

    @Override // tm.m0
    public void onLoadFailed(l0 l0Var, qm.b bVar) {
        t.d("MraidInterstitial", "ViewListener - onLoadFailed (%s)", bVar);
        q qVar = this.f87110a;
        q.b(qVar);
        qVar.f87117f = false;
        qVar.f87119h = true;
        r rVar = qVar.f87116e;
        if (rVar != null) {
            rVar.onLoadFailed(qVar, bVar);
        }
    }

    @Override // tm.m0
    public void onLoaded(l0 l0Var) {
        t.d("MraidInterstitial", "ViewListener - onLoaded", new Object[0]);
        q qVar = this.f87110a;
        qVar.f87117f = true;
        r rVar = qVar.f87116e;
        if (rVar != null) {
            rVar.onLoaded(qVar);
        }
    }

    @Override // tm.m0
    public void onOpenPrivacySheet(l0 l0Var, p1 p1Var) {
        t.d("MraidInterstitial", "ViewListener - onOpenPrivacySheet (%s)", p1Var.toString());
        q qVar = this.f87110a;
        r rVar = qVar.f87116e;
        if (rVar != null) {
            rVar.onOpenPrivacySheet(qVar, p1Var);
        }
    }

    @Override // tm.m0
    public void onOpenUrl(l0 l0Var, String str, um.k kVar) {
        t.d("MraidInterstitial", "ViewListener - onOpenBrowser (%s)", str);
        q qVar = this.f87110a;
        r rVar = qVar.f87116e;
        if (rVar != null) {
            rVar.onOpenUrl(qVar, str, kVar);
        }
    }

    @Override // tm.m0
    public void onPlayVideo(l0 l0Var, String str) {
        t.d("MraidInterstitial", "ViewListener - onPlayVideo (%s)", str);
        q qVar = this.f87110a;
        r rVar = qVar.f87116e;
        if (rVar != null) {
            rVar.onPlayVideo(qVar, str);
        }
    }

    @Override // tm.m0
    public void onShowFailed(l0 l0Var, qm.b bVar) {
        t.d("MraidInterstitial", "ViewListener - onShowFailed (%s)", bVar);
        q qVar = this.f87110a;
        q.b(qVar);
        qVar.f87117f = false;
        qVar.f87119h = true;
        qVar.c(bVar);
    }

    @Override // tm.m0
    public void onShown(l0 l0Var) {
        t.d("MraidInterstitial", "ViewListener - onShown", new Object[0]);
        q qVar = this.f87110a;
        qVar.f87113b.set(true);
        r rVar = qVar.f87116e;
        if (rVar != null) {
            rVar.onShown(qVar);
        }
    }

    @Override // tm.m0
    public void onStorePicture(l0 l0Var, String str, um.k kVar) {
        t.d("MraidInterstitial", "ViewListener - onCalendarEvent (%s)", str);
        q qVar = this.f87110a;
        r rVar = qVar.f87116e;
        if (rVar != null) {
            rVar.onStorePicture(qVar, str, kVar);
        }
    }

    @Override // tm.m0
    public void onExpand(l0 l0Var) {
    }
}
