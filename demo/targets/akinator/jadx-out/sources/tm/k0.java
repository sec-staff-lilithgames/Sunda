package tm;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import br.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f87074a;

    public k0(l0 l0Var) {
        this.f87074a = l0Var;
    }

    @Override // tm.i
    public void onCalendarEventIntention(g gVar, String str) {
        l0 l0Var = this.f87074a;
        if (l0Var.f87083q == null) {
            return;
        }
        l0Var.setLoadingVisible(true);
        sm.b bVar = l0Var.f87084r;
        if (bVar != null) {
            bVar.onAdClicked();
        }
        l0Var.f87083q.onCalendarEvent(l0Var, str, l0Var);
    }

    @Override // tm.i
    public void onChangeOrientationIntention(g gVar, x xVar) {
        this.f87074a.d(xVar);
    }

    @Override // tm.i
    public void onCloseIntention(g gVar) {
        this.f87074a.f();
    }

    @Override // tm.i
    public boolean onExpandIntention(g gVar, WebView webView, x xVar, boolean z10) {
        l0 l0Var = this.f87074a;
        an.e eVar = l0Var.f87079m;
        if (eVar == null || eVar.getParent() == null) {
            View topmostView = d0.getTopmostView(l0Var.peekContext(), l0Var);
            if (!(topmostView instanceof ViewGroup)) {
                t.e("MraidView", "Can't add resized view because can't find required parent", new Object[0]);
                return false;
            }
            an.e eVar2 = new an.e(l0Var.getContext());
            l0Var.f87079m = eVar2;
            eVar2.setCloseClickListener(l0Var);
            ((ViewGroup) topmostView).addView(l0Var.f87079m);
        }
        um.h0.removeFromParent(webView);
        l0Var.f87079m.addView(webView);
        l0Var.c(l0Var.f87079m, z10);
        l0Var.d(xVar);
        return true;
    }

    @Override // tm.i
    public void onExpanded(g gVar) {
        l0 l0Var = this.f87074a;
        m0 m0Var = l0Var.f87083q;
        if (m0Var != null) {
            m0Var.onExpand(l0Var);
        }
    }

    @Override // tm.i
    public void onMraidAdViewExpired(g gVar, qm.b bVar) {
        l0 l0Var = this.f87074a;
        sm.b bVar2 = l0Var.f87084r;
        if (bVar2 != null) {
            bVar2.onError(bVar);
        }
        m0 m0Var = l0Var.f87083q;
        if (m0Var != null) {
            m0Var.onExpired(l0Var, bVar);
        }
    }

    @Override // tm.i
    public void onMraidAdViewLoadFailed(g gVar, qm.b bVar) {
        l0 l0Var = this.f87074a;
        sm.b bVar2 = l0Var.f87084r;
        if (bVar2 != null) {
            bVar2.onError(bVar);
        }
        m0 m0Var = l0Var.f87083q;
        if (m0Var != null) {
            m0Var.onLoadFailed(l0Var, bVar);
        }
    }

    @Override // tm.i
    public void onMraidAdViewPageLoaded(g gVar, String str, WebView webView, boolean z10) {
        l0 l0Var = this.f87074a;
        l0Var.setLoadingVisible(false);
        if (l0Var.f87077k.isInterstitial()) {
            l0Var.c(l0Var, z10);
        }
        sm.b bVar = l0Var.f87084r;
        if (bVar != null) {
            bVar.onAdViewReady(webView);
        }
        if (l0Var.f87085s != qm.a.f83288b || l0Var.f87089w || str.equals("data:text/html,<html></html>")) {
            return;
        }
        l0Var.h();
    }

    @Override // tm.i
    public void onMraidAdViewShowFailed(g gVar, qm.b bVar) {
        l0 l0Var = this.f87074a;
        sm.b bVar2 = l0Var.f87084r;
        if (bVar2 != null) {
            bVar2.onError(bVar);
        }
        m0 m0Var = l0Var.f87083q;
        if (m0Var != null) {
            m0Var.onShowFailed(l0Var, bVar);
        }
    }

    @Override // tm.i
    public void onMraidAdViewShown(g gVar) {
        l0 l0Var = this.f87074a;
        sm.b bVar = l0Var.f87084r;
        if (bVar != null) {
            bVar.onAdShown();
        }
        m0 m0Var = l0Var.f87083q;
        if (m0Var != null) {
            m0Var.onShown(l0Var);
        }
    }

    @Override // tm.i
    public void onMraidLoadedIntention(g gVar) {
        this.f87074a.h();
    }

    @Override // tm.i
    public void onOpenPrivacySheet(g gVar, p1 p1Var) {
        l0 l0Var = this.f87074a;
        m0 m0Var = l0Var.f87083q;
        if (m0Var == null) {
            return;
        }
        m0Var.onOpenPrivacySheet(l0Var, p1Var);
    }

    @Override // tm.i
    public void onOpenUrlIntention(g gVar, String str) {
        l0 l0Var = this.f87074a;
        if (l0Var.f87083q == null) {
            return;
        }
        l0Var.setLoadingVisible(true);
        sm.b bVar = l0Var.f87084r;
        if (bVar != null) {
            bVar.onAdClicked();
        }
        l0Var.f87083q.onOpenUrl(l0Var, str, l0Var);
    }

    @Override // tm.i
    public void onPlayVideoIntention(g gVar, String str) {
        l0 l0Var = this.f87074a;
        m0 m0Var = l0Var.f87083q;
        if (m0Var != null) {
            m0Var.onPlayVideo(l0Var, str);
        }
    }

    @Override // tm.i
    public boolean onResizeIntention(g gVar, WebView webView, z zVar, a0 a0Var) {
        l0 l0Var = this.f87074a;
        an.e eVar = l0Var.f87078l;
        if (eVar == null || eVar.getParent() == null) {
            View topmostView = d0.getTopmostView(l0Var.peekContext(), l0Var);
            if (!(topmostView instanceof ViewGroup)) {
                t.e("MraidView", "Can't add resized view because can't find required parent", new Object[0]);
                return false;
            }
            an.e eVar2 = new an.e(l0Var.getContext());
            l0Var.f87078l = eVar2;
            eVar2.setCloseClickListener(l0Var);
            ((ViewGroup) topmostView).addView(l0Var.f87078l);
        }
        um.h0.removeFromParent(webView);
        l0Var.f87078l.addView(webView);
        um.p pVarResolveDefCloseStyle = um.a.resolveDefCloseStyle(l0Var.getContext(), l0Var.C);
        pVarResolveDefCloseStyle.setHorizontalPosition(Integer.valueOf(zVar.f87158e.getGravity() & 7));
        pVarResolveDefCloseStyle.setVerticalPosition(Integer.valueOf(zVar.f87158e.getGravity() & 112));
        l0Var.f87078l.setCloseStyle(pVarResolveDefCloseStyle);
        l0Var.f87078l.setCloseVisibility(false, l0Var.f87087u);
        t.d("MraidView", "setResizedViewSizeAndPosition: %s", zVar);
        if (l0Var.f87078l == null) {
            return true;
        }
        int iDpToPx = um.h0.dpToPx(l0Var.getContext(), zVar.f87154a);
        int iDpToPx2 = um.h0.dpToPx(l0Var.getContext(), zVar.f87155b);
        int iDpToPx3 = um.h0.dpToPx(l0Var.getContext(), zVar.f87156c);
        int iDpToPx4 = um.h0.dpToPx(l0Var.getContext(), zVar.f87157d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx2);
        Rect rect = a0Var.f86980h;
        int i10 = rect.left + iDpToPx3;
        int i11 = rect.top + iDpToPx4;
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        l0Var.f87078l.setLayoutParams(layoutParams);
        return true;
    }

    @Override // tm.i
    public void onStorePictureIntention(g gVar, String str) {
        l0 l0Var = this.f87074a;
        if (l0Var.f87083q == null) {
            return;
        }
        l0Var.setLoadingVisible(true);
        sm.b bVar = l0Var.f87084r;
        if (bVar != null) {
            bVar.onAdClicked();
        }
        l0Var.f87083q.onStorePicture(l0Var, str, l0Var);
    }

    @Override // tm.i
    public void onSyncCustomCloseIntention(g gVar, boolean z10) {
        l0 l0Var = this.f87074a;
        if (l0Var.f87090x) {
            return;
        }
        if (z10 && !l0Var.F) {
            l0Var.F = true;
        }
        l0Var.e(z10);
    }
}
