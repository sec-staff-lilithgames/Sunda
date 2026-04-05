package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g0;
import com.fyber.inneractive.sdk.util.g1;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements com.fyber.inneractive.sdk.web.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f26572a;

    public h(l lVar) {
        this.f26572a = lVar;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z10, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z10) {
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        l lVar = this.f26572a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(lVar));
        l lVar2 = this.f26572a;
        InneractiveUnitController.EventsListener eventsListener = lVar2.f23532c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdExpanded(lVar2.f23530a);
        }
        l lVar3 = this.f26572a;
        lVar3.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(lVar3));
        this.f26572a.c(true);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        l lVar = this.f26572a;
        lVar.a(lVar.y(), false, Float.NaN, Float.NaN);
        this.f26572a.H();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        l lVar = this.f26572a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(lVar));
        l lVar2 = this.f26572a;
        InneractiveUnitController.EventsListener eventsListener = lVar2.f23532c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdCollapsed(lVar2.f23530a);
        }
        this.f26572a.O();
        l lVar3 = this.f26572a;
        lVar3.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(lVar3));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var) {
        s0 s0Var;
        l0 l0Var;
        l lVar = this.f26572a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(lVar));
        ViewGroup viewGroup = this.f26572a.f26580p;
        Context context = (viewGroup == null || viewGroup.getContext() == null) ? com.fyber.inneractive.sdk.util.o.f26796a : this.f26572a.f26580p.getContext();
        if (context != null) {
            l lVar2 = this.f26572a;
            if (lVar2.f23535f) {
                com.fyber.inneractive.sdk.flow.x xVar = lVar2.f23531b;
                com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((q0) xVar).f23945b : null;
                if (eVar != null) {
                    com.fyber.inneractive.sdk.flow.b0.a(eVar);
                }
                com.fyber.inneractive.sdk.flow.x xVar2 = this.f26572a.f23531b;
                if (xVar2 != null && (s0Var = ((q0) xVar2).f23947d) != null && (l0Var = ((r0) s0Var).f23345c) != null) {
                    com.fyber.inneractive.sdk.flow.b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.CLICK, l0Var.f23330b == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY);
                }
                return this.f26572a.a(context, str, g1Var, com.fyber.inneractive.sdk.util.g.DISPLAY, false, null);
            }
        }
        return new com.fyber.inneractive.sdk.util.d0(g0.FAILED, new Exception("No context or no native click detected"));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b() {
        this.f26572a.c(true);
        l lVar = this.f26572a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onResize", IAlog.a(lVar));
        l lVar2 = this.f26572a;
        InneractiveUnitController.EventsListener eventsListener = lVar2.f23532c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdResized(lVar2.f23530a);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        this.f26572a.a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(String str, String str2) throws JSONException {
        l lVar = this.f26572a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(lVar));
        ViewGroup viewGroup = this.f26572a.f26580p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        l lVar2 = this.f26572a;
        if (!lVar2.f26586v) {
            com.fyber.inneractive.sdk.network.b0.a(lVar2.f26580p.getContext(), str, str2, this.f26572a.f23531b);
            l lVar3 = this.f26572a;
            lVar3.f26586v = true;
            IAlog.a("%sreporting auto redirect", IAlog.a(lVar3));
            return;
        }
        IAlog.a("%sredirect already reported for this ad", IAlog.a(lVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(boolean z10) {
        s0 s0Var;
        l0 l0Var;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar;
        l lVar = this.f26572a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onVisibilityChanged: %s", IAlog.a(lVar), Boolean.valueOf(z10));
        if (z10) {
            l lVar2 = this.f26572a;
            if (!lVar2.f26579o) {
                IAlog.a("%sonShownForTheFirstTime called", IAlog.a(lVar2));
                com.fyber.inneractive.sdk.flow.x xVar = lVar2.f23531b;
                com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((q0) xVar).f23945b : null;
                if (eVar != null) {
                    IAmraidWebViewController iAmraidWebViewController = lVar2.f26577m;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.l();
                    }
                    lVar2.b(eVar);
                    lVar2.G();
                }
                long jM = lVar2.M();
                lVar2.f26575k = jM;
                if (jM != 0) {
                    lVar2.a(true, jM);
                }
                com.fyber.inneractive.sdk.flow.x xVar2 = lVar2.f23531b;
                if (xVar2 != null && (s0Var = ((q0) xVar2).f23947d) != null && (l0Var = ((r0) s0Var).f23345c) != null) {
                    com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
                    if (l0Var.f23330b == UnitDisplayType.MRECT) {
                        cVar = com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY;
                    } else {
                        cVar = com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY;
                    }
                    com.fyber.inneractive.sdk.flow.b0.a(aVar, cVar);
                }
                this.f26572a.f26579o = true;
                return;
            }
            d dVar = lVar2.f26589y;
            if (dVar != null && !dVar.f26564h && !dVar.f26563g && dVar.f26562f != 0) {
                dVar.f26562f = 0L;
                dVar.f26563g = true;
                dVar.a();
            }
            this.f26572a.O();
            return;
        }
        d dVar2 = this.f26572a.f26589y;
        if (dVar2 != null && dVar2.f26563g) {
            dVar2.f26563g = false;
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(dVar2.f26566j);
        }
        this.f26572a.c(false);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(String str) {
        Context contextA = com.fyber.inneractive.sdk.util.o.a(this.f26572a.z());
        boolean zStartRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(contextA, str);
        if (zStartRichMediaIntent) {
            l lVar = this.f26572a;
            if (lVar.f23532c != null) {
                lVar.a(contextA, false, Float.NaN, Float.NaN);
            }
        }
        return zStartRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        l lVar = this.f26572a;
        InneractiveUnitController.EventsListener eventsListener = lVar.f23532c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdEnteredErrorState(lVar.f23530a, mraidVideoFailedToDisplayError);
        }
    }
}
