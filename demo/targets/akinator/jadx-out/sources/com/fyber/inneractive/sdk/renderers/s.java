package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.n0;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import com.fyber.inneractive.sdk.web.g0;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f26606a;

    public s(t tVar) {
        this.f26606a = tVar;
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var) {
        t tVar = this.f26606a;
        tVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(tVar));
        Context contextY = this.f26606a.y();
        t tVar2 = this.f26606a;
        com.fyber.inneractive.sdk.interfaces.e eVar = tVar2.f23764k;
        if (eVar != null) {
            contextY = tVar2.c(eVar.getLayout());
        }
        Context context = contextY;
        t tVar3 = this.f26606a;
        if (!tVar3.f23535f) {
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("No context or no native click detected"));
        }
        com.fyber.inneractive.sdk.flow.x xVar = tVar3.f23531b;
        com.fyber.inneractive.sdk.response.e eVar2 = xVar == null ? null : ((q0) xVar).f23945b;
        if (eVar2 != null) {
            com.fyber.inneractive.sdk.flow.b0.a(eVar2);
        }
        com.fyber.inneractive.sdk.flow.b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.CLICK, this.f26606a.F == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_DISPLAY);
        return this.f26606a.a(context, str, g1Var, com.fyber.inneractive.sdk.util.g.DISPLAY, false, null);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b() {
        t tVar = this.f26606a;
        tVar.getClass();
        IAlog.a("%sweb view callback: onResize", IAlog.a(tVar));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        t tVar = this.f26606a;
        tVar.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(tVar));
        t tVar2 = this.f26606a;
        tVar2.C = true;
        tVar2.R();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        t tVar = this.f26606a;
        tVar.a(tVar.y(), false, Float.NaN, Float.NaN);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        t tVar = this.f26606a;
        tVar.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(tVar));
        t tVar2 = this.f26606a;
        if (tVar2.C) {
            tVar2.C = false;
            tVar2.R();
            return;
        }
        if (tVar2.F == UnitDisplayType.REWARDED) {
            tVar2.Q();
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f26606a.f23764k;
        if (eVar != null) {
            eVar.dismissAd(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z10) throws JSONException {
        if (z10) {
            t tVar = this.f26606a;
            if (!tVar.f23772s) {
                tVar.f23772s = true;
                com.fyber.inneractive.sdk.interfaces.e eVar = tVar.f23764k;
                if (eVar != null) {
                    tVar.c(eVar.isCloseButtonDisplay());
                }
            }
            t tVar2 = this.f26606a;
            if (!tVar2.f23770q) {
                tVar2.f23770q = true;
                v1 v1Var = new v1(TimeUnit.MILLISECONDS, tVar2.f23771r);
                tVar2.f23766m = v1Var;
                v1Var.f26828e = new n0(tVar2);
                t1 t1Var = new t1(v1Var);
                v1Var.f26826c = t1Var;
                v1Var.f26827d = false;
                t1Var.sendEmptyMessage(1932593528);
            }
            com.fyber.inneractive.sdk.interfaces.e eVar2 = this.f26606a.f23764k;
            if (eVar2 == null || !eVar2.isCloseButtonDisplay()) {
                return;
            }
            t tVar3 = this.f26606a;
            tVar3.f23769p = false;
            com.fyber.inneractive.sdk.interfaces.e eVar3 = tVar3.f23764k;
            if (eVar3 != null) {
                eVar3.disableCloseButton();
            }
            com.fyber.inneractive.sdk.util.a aVar = tVar3.f23774u;
            aVar.f26754d = 0L;
            aVar.f26755e = 0L;
            aVar.f26756f = 0L;
            aVar.f26752b = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        this.f26606a.a(new WebViewRendererProcessHasGoneError());
        this.f26606a.destroy();
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(String str, String str2) throws JSONException {
        t tVar = this.f26606a;
        tVar.getClass();
        IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(tVar));
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f26606a.f23764k;
        if (eVar == null || eVar.getLayout() == null) {
            return;
        }
        t tVar2 = this.f26606a;
        if (!tVar2.D) {
            com.fyber.inneractive.sdk.network.b0.a(tVar2.f23764k.getLayout().getContext(), str, str2, this.f26606a.f23531b);
            t tVar3 = this.f26606a;
            tVar3.D = true;
            IAlog.a("%sreporting auto redirect", IAlog.a(tVar3));
            return;
        }
        IAlog.a("%sredirect already reported for this ad", IAlog.a(tVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(boolean z10) {
        String str;
        if (z10) {
            t tVar = this.f26606a;
            if (!tVar.f26608x) {
                tVar.f26608x = true;
                if (tVar.f23531b != null) {
                    IAmraidWebViewController iAmraidWebViewController = tVar.f26609y;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.l();
                    }
                    com.fyber.inneractive.sdk.response.e eVar = ((q0) tVar.f23531b).f23945b;
                    if (eVar != null && (str = eVar.f26639k) != null && str.trim().length() > 0) {
                        IAlog.e("%sfiring impression!", IAlog.a(tVar));
                        IAlog.d("AD_IMPRESSION", new Object[0]);
                        z0.b(str);
                    }
                    com.fyber.inneractive.sdk.web.m mVar = tVar.f26609y.f26879b;
                    if (mVar != null) {
                        mVar.a("var forceReflow = function(elem){ elem = elem || document.documentElement; elem.style.zIndex = 2147483646; var width = elem.style.width, px = elem.offsetWidth+1; elem.style.width = px+'px'; setTimeout(function(){ elem.style.zIndex = 2147483646; elem.style.width = width; elem = null; }, 0); }; forceReflow(document.documentElement);");
                    }
                    com.fyber.inneractive.sdk.flow.b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION, tVar.F == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_DISPLAY);
                    tVar.G();
                    tVar.L();
                }
            }
        }
        t tVar2 = this.f26606a;
        tVar2.getClass();
        IAlog.a("%sweb view callback: onVisibilityChanged: %s", IAlog.a(tVar2), Boolean.valueOf(z10));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z10, Orientation orientation) {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f26606a.f23764k;
        if (eVar != null) {
            eVar.setActivityOrientation(z10, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(String str) {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f26606a.f23764k;
        if (eVar == null || eVar.getLayout() == null) {
            return false;
        }
        t tVar = this.f26606a;
        Context contextC = tVar.c(tVar.f23764k.getLayout());
        boolean zStartRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(contextC, str);
        if (zStartRichMediaIntent) {
            this.f26606a.a(contextC, false, Float.NaN, Float.NaN);
        }
        return zStartRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        this.f26606a.d(false);
        t tVar = this.f26606a;
        InneractiveUnitController.EventsListener eventsListener = tVar.f23532c;
        if (eventsListener != null) {
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdEnteredErrorState(tVar.f23530a, mraidVideoFailedToDisplayError);
        }
    }
}
