package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.y0;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b0 implements InneractiveAdRenderer, InneractiveInternalBrowserActivity.InternalBrowserListener, com.fyber.inneractive.sdk.click.f, com.fyber.inneractive.sdk.web.t0 {

    /* renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f23530a;

    /* renamed from: b, reason: collision with root package name */
    public x f23531b;

    /* renamed from: c, reason: collision with root package name */
    public InneractiveUnitController.EventsListener f23532c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23533d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23534e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23535f = true;

    /* renamed from: g, reason: collision with root package name */
    public Runnable f23536g;

    /* renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.click.r f23537h;

    /* renamed from: i, reason: collision with root package name */
    public z f23538i;

    /* renamed from: j, reason: collision with root package name */
    public View f23539j;

    public int A() {
        return -1;
    }

    public int B() {
        return -1;
    }

    public final boolean C() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        x xVar = this.f23531b;
        if (xVar == null || (rVar = xVar.f23946c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class) == null) {
            return false;
        }
        com.fyber.inneractive.sdk.config.global.features.c cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.f23531b.f23946c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
        cVar.getClass();
        return new ArrayList(cVar.f23291c.values()).size() > 0;
    }

    public boolean D() {
        return false;
    }

    public boolean E() {
        x xVar = this.f23531b;
        if (xVar != null) {
            return xVar.c();
        }
        return true;
    }

    public boolean F() {
        return this instanceof com.fyber.inneractive.sdk.renderers.a0;
    }

    public final void G() {
        com.fyber.inneractive.sdk.response.e eVarB;
        Context contextY = y();
        if (this.f23534e || this.f23532c == null) {
            return;
        }
        IAlog.a("%sCalling external interface onAdImpression", IAlog.a(this));
        this.f23532c.onAdImpression(this.f23530a);
        x xVar = this.f23531b;
        if (xVar != null && (eVarB = xVar.b()) != null) {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            com.fyber.inneractive.sdk.config.x0 x0Var = iAConfigManager.f23229x;
            if (x0Var != null) {
                UnitDisplayType unitDisplayType = eVarB.f26644p;
                ImpressionData impressionData = eVarB.f26648t;
                x0Var.a(unitDisplayType, "LAST_DOMAIN_SHOWED", impressionData != null ? impressionData.getAdvertiserDomain() : null);
                x0Var.a(unitDisplayType, "LAST_APP_BUNDLE_ID", eVarB.A);
                if (this.f23531b.isVideoAd()) {
                    x0Var.a(unitDisplayType, new String[]{"LAST_VAST_SKIPED"}[0], "0");
                    x0Var.a(unitDisplayType, new String[]{"LAST_VAST_CLICKED_TYPE"}[0], "0");
                }
                x0Var.a(unitDisplayType, new String[]{"LAST_CLICKED"}[0], "0");
            }
            y0 y0Var = iAConfigManager.A;
            com.fyber.inneractive.sdk.config.s0 s0Var = this.f23531b.f23947d;
            ImpressionData impressionData2 = eVarB.f26648t;
            if (s0Var != null) {
                OnGlobalImpressionDataListener onGlobalImpressionDataListener = y0Var.f26831a;
                if (onGlobalImpressionDataListener != null) {
                    com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
                    onGlobalImpressionDataListener.onImpression(r0Var.f23344b, r0Var.f23343a, impressionData2);
                }
            } else {
                y0Var.getClass();
            }
            InneractiveUnitController.EventsListener eventsListener = this.f23532c;
            if (eventsListener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f23530a, eVarB.f26648t);
            } else if (eventsListener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                ((InneractiveAdViewEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f23530a, eVarB.f26648t);
            }
            com.fyber.inneractive.sdk.privacysandbox.b bVarA = com.fyber.inneractive.sdk.privacysandbox.b.a(contextY);
            if (bVarA == null) {
                bVarA = null;
            }
            String str = eVarB.f26641m;
            if (!TextUtils.isEmpty(str) && bVarA != null) {
                bVarA.a(str, null);
            }
        }
        this.f23534e = true;
    }

    public final void H() {
        if (this.f23532c != null) {
            IAlog.a("%sCalling external interface onAdWillOpenExternalApp", IAlog.a(this));
            this.f23532c.onAdWillOpenExternalApp(this.f23530a);
        }
    }

    public void I() {
        View viewZ = z();
        if (viewZ == null || this.f23539j == null || viewZ.getParent() == null || !(viewZ.getParent() instanceof ViewGroup)) {
            return;
        }
        viewZ.getLayoutParams();
        ((ViewGroup) viewZ.getParent()).removeView(this.f23539j);
        e(this.f23539j);
        this.f23539j = null;
    }

    public final void J() {
        x xVar = this.f23531b;
        if (xVar == null || xVar.b() == null) {
            return;
        }
        String str = this.f23531b.b().f26645q;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.e("%sfiring rewarded completion!", IAlog.a(this));
        IAlog.d("AD_REWARDED_COMPLETION", new Object[0]);
        z0.b(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.util.d0 a(android.content.Context r17, java.lang.String r18, com.fyber.inneractive.sdk.util.g1 r19, com.fyber.inneractive.sdk.util.g r20, boolean r21, com.fyber.inneractive.sdk.click.o r22) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.b0.a(android.content.Context, java.lang.String, com.fyber.inneractive.sdk.util.g1, com.fyber.inneractive.sdk.util.g, boolean, com.fyber.inneractive.sdk.click.o):com.fyber.inneractive.sdk.util.d0");
    }

    public final void b(com.fyber.inneractive.sdk.response.e eVar) {
        String str = eVar.f26639k;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        IAlog.e("%sfiring impression!", IAlog.a(this));
        IAlog.d("AD_IMPRESSION", new Object[0]);
        z0.b(str);
    }

    public final Context c(View view) {
        View view2;
        View[] viewArr = {view, z()};
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                view2 = null;
                break;
            }
            view2 = viewArr[i10];
            if (view2 != null) {
                break;
            }
            i10++;
        }
        return com.fyber.inneractive.sdk.util.o.a(view2);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        return true;
    }

    public void d(View view) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (this.f23533d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
            this.f23533d = false;
        }
        Runnable runnable = this.f23536g;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(runnable);
            this.f23536g = null;
        }
        this.f23531b = null;
        this.f23532c = null;
        this.f23530a = null;
        if (this.f23537h != null) {
            I();
            com.fyber.inneractive.sdk.click.r rVar = this.f23537h;
            rVar.f23197e = true;
            Iterator it = rVar.f23201i.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.click.a) it.next()).cancel();
            }
            rVar.f23201i.clear();
            h1 h1Var = rVar.f23200h;
            if (h1Var != null) {
                h1Var.f24282a = true;
            }
            rVar.f23196d = null;
            this.f23537h = null;
            this.f23538i = null;
        }
    }

    public void e(View view) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f23530a = inneractiveAdSpot;
        this.f23531b = inneractiveAdSpot.getAdContent();
        this.f23532c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onApplicationInBackground() {
        H();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onInternalBrowserDismissed() {
        IAlog.a("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.f23533d) {
            this.f23533d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
        }
        if (this.f23532c != null) {
            IAlog.a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.a(this));
            this.f23532c.onAdWillCloseInternalBrowser(this.f23530a);
        }
    }

    public final com.fyber.inneractive.sdk.ignite.m p() {
        x xVar = this.f23531b;
        return (xVar == null || !xVar.d() || this.f23531b.b() == null) ? com.fyber.inneractive.sdk.ignite.m.NONE : this.f23531b.b().H;
    }

    public void u() {
        G();
    }

    public void x() {
        View viewZ = z();
        if (viewZ == null || viewZ.getParent() == null || !(viewZ.getParent() instanceof ViewGroup) || this.f23539j != null) {
            return;
        }
        View viewInflate = View.inflate(viewZ.getContext(), R.layout.ia_layout_click_overlay, null);
        this.f23539j = viewInflate;
        if (viewInflate != null) {
            ((ViewGroup) viewZ.getParent()).addView(this.f23539j, viewZ.getLayoutParams());
            d(this.f23539j);
        }
    }

    public Context y() {
        return com.fyber.inneractive.sdk.util.o.a(z());
    }

    public abstract View z();

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.fyber.inneractive.sdk.click.b r11, com.fyber.inneractive.sdk.util.g1 r12, com.fyber.inneractive.sdk.util.g r13) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.b0.b(com.fyber.inneractive.sdk.click.b, com.fyber.inneractive.sdk.util.g1, com.fyber.inneractive.sdk.util.g):void");
    }

    public static void a(com.fyber.inneractive.sdk.response.e eVar) {
        String str = eVar.f26640l;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        IAlog.d("AD_CLICKED", new Object[0]);
        z0.b(str);
    }

    @Override // com.fyber.inneractive.sdk.click.f
    public final void a(com.fyber.inneractive.sdk.click.b bVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) throws JSONException {
        b(bVar, g1Var, gVar);
    }

    public final void a(String str, com.fyber.inneractive.sdk.click.q qVar) {
        com.fyber.inneractive.sdk.response.e eVarB;
        JSONArray jSONArrayB;
        InneractiveAdRequest inneractiveAdRequest;
        x xVar = this.f23531b;
        if (xVar != null) {
            eVarB = xVar.b();
            x xVar2 = this.f23531b;
            inneractiveAdRequest = xVar2.f23944a;
            com.fyber.inneractive.sdk.config.global.r rVar = xVar2.f23946c;
            jSONArrayB = rVar != null ? rVar.b() : null;
        } else {
            eVarB = null;
            jSONArrayB = null;
            inneractiveAdRequest = null;
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.EXTERNAL_BROWSER_OPENED;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
        wVar.f24326c = uVar;
        wVar.f24324a = inneractiveAdRequest;
        wVar.f24327d = jSONArrayB;
        wVar.a("url", str).a("fallback", (qVar == com.fyber.inneractive.sdk.click.q.OPENED_USING_CHROME_NAVIGATE || qVar == com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER) ? "chrome" : "na").a((String) null);
    }

    public final void a(Context context, boolean z10, float f10, float f11) {
        com.fyber.inneractive.sdk.response.e eVarB;
        if (z10) {
            IAlog.a("%s : will not notify click on fallback", IAlog.a(this));
            return;
        }
        if (this.f23532c != null) {
            IAlog.a("%sCalling external interface onAdClicked", IAlog.a(this));
            this.f23532c.onAdClicked(this.f23530a);
        }
        x xVar = this.f23531b;
        if (xVar == null || (eVarB = xVar.b()) == null) {
            return;
        }
        IAConfigManager.O.f23229x.a(eVarB.f26644p, "LAST_CLICKED", "1");
        com.fyber.inneractive.sdk.privacysandbox.b bVarA = com.fyber.inneractive.sdk.privacysandbox.b.a(context);
        if (bVarA == null) {
            bVarA = null;
        }
        String str = eVarB.f26642n;
        Float fValueOf = Float.valueOf(f10);
        Float fValueOf2 = Float.valueOf(f11);
        if (!fValueOf.isNaN() && !fValueOf2.isNaN() && f10 >= 0.0f && f11 >= 0.0f) {
            MotionEvent motionEventObtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, f10, f11, 0);
            if (TextUtils.isEmpty(str) || bVarA == null) {
                return;
            }
            bVarA.a(str, motionEventObtain);
            return;
        }
        if (TextUtils.isEmpty(str) || bVarA == null) {
            return;
        }
        bVarA.a(str, null);
    }

    public final void a(WebViewRendererProcessHasGoneError webViewRendererProcessHasGoneError) {
        String simpleName = webViewRendererProcessHasGoneError.getClass().getSimpleName();
        String message = webViewRendererProcessHasGoneError.getMessage();
        x xVar = this.f23531b;
        com.fyber.inneractive.sdk.network.z.a(simpleName, message, xVar != null ? xVar.f23944a : null, xVar != null ? xVar.b() : null);
        if (this.f23532c != null) {
            IAlog.a("%sCalling external interface onAdEnteredErrorState: %s", IAlog.a(this), webViewRendererProcessHasGoneError.getMessage());
            this.f23532c.onAdEnteredErrorState(this.f23530a, webViewRendererProcessHasGoneError);
        }
    }

    public static void a(com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.c cVar) {
        com.fyber.inneractive.sdk.cache.session.e eVar = IAConfigManager.O.f23229x.f23420a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f26803a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
        }
    }
}
