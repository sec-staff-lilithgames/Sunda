package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.os.Handler;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i implements j, com.fyber.inneractive.sdk.util.m0, l, x0 {

    /* renamed from: b, reason: collision with root package name */
    public m f26879b;

    /* renamed from: c, reason: collision with root package name */
    public j0 f26880c;

    /* renamed from: d, reason: collision with root package name */
    public k0 f26881d;

    /* renamed from: f, reason: collision with root package name */
    public g f26883f;

    /* renamed from: g, reason: collision with root package name */
    public j1 f26884g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26887j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f26888k;

    /* renamed from: l, reason: collision with root package name */
    public f f26889l;

    /* renamed from: m, reason: collision with root package name */
    public final d f26890m;

    /* renamed from: n, reason: collision with root package name */
    public final c f26891n;

    /* renamed from: o, reason: collision with root package name */
    public e f26892o;

    /* renamed from: p, reason: collision with root package name */
    public String f26893p;

    /* renamed from: q, reason: collision with root package name */
    public String f26894q;

    /* renamed from: r, reason: collision with root package name */
    public InneractiveAdRequest f26895r;

    /* renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.x f26896s;

    /* renamed from: t, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f26897t;

    /* renamed from: a, reason: collision with root package name */
    public boolean f26878a = false;

    /* renamed from: h, reason: collision with root package name */
    public float f26885h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f26886i = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26882e = false;

    public i(boolean z10, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f26888k = z10;
        this.f26879b = a(rVar);
        i1 i1Var = (i1) this;
        this.f26891n = new c(i1Var);
        this.f26890m = new d(i1Var);
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void a(WebView webView) {
    }

    public abstract boolean a(String str, com.fyber.inneractive.sdk.util.g1 g1Var);

    public void b(boolean z10) {
        IAlog.a("%s destroy is fatal: %b", IAlog.a(this), Boolean.valueOf(z10));
        e eVar = this.f26892o;
        if (eVar != null && !eVar.f26854a.isTerminated() && !eVar.f26854a.isShutdown()) {
            e eVar2 = this.f26892o;
            eVar2.f26859f = true;
            eVar2.f26854a.shutdownNow();
            Handler handler = eVar2.f26855b;
            if (handler != null) {
                com.fyber.inneractive.sdk.util.d dVar = eVar2.f26857d;
                if (dVar != null) {
                    handler.removeCallbacks(dVar);
                }
                com.fyber.inneractive.sdk.util.e eVar3 = eVar2.f26856c;
                if (eVar3 != null) {
                    eVar2.f26855b.removeCallbacks(eVar3);
                }
                eVar2.f26855b = null;
            }
            this.f26892o = null;
        }
        m mVar = this.f26879b;
        if (mVar != null) {
            com.fyber.inneractive.sdk.util.l0.f26787a.a(mVar);
            com.fyber.inneractive.sdk.util.v.a(this.f26879b);
            this.f26879b.setWebChromeClient(null);
            if (f() == null) {
                this.f26879b.destroy();
            } else {
                com.fyber.inneractive.sdk.measurement.tracker.e eVarF = f();
                AdSession adSession = eVarF.f24029a;
                if (adSession != null) {
                    try {
                        adSession.finish();
                    } catch (Throwable unused) {
                    }
                    com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVarF), z10 ? 0 : 1000);
                    eVarF.f24029a = null;
                    eVarF.f24030b = null;
                }
            }
        }
        k0 k0Var = this.f26881d;
        if (k0Var != null) {
            k0Var.f26924e = null;
        }
        c cVar = this.f26891n;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(cVar);
        }
        d dVar2 = this.f26890m;
        if (dVar2 != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(dVar2);
        }
        this.f26884g = null;
        if (!z10) {
            this.f26883f = null;
        }
        this.f26879b = null;
        this.f26880c = null;
        this.f26881d = null;
        this.f26896s = null;
        this.f26895r = null;
    }

    public void e() {
        b(false);
    }

    public abstract com.fyber.inneractive.sdk.measurement.tracker.e f();

    public com.fyber.inneractive.sdk.util.g1 g() {
        m mVar = this.f26879b;
        return mVar != null ? mVar.getLastClickedLocation() : new com.fyber.inneractive.sdk.util.g1();
    }

    public void h() {
        WebSettings settings = this.f26879b.getSettings();
        boolean z10 = true;
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (!IAConfigManager.O.f23222q && com.fyber.inneractive.sdk.util.s.a()) {
            settings.setMixedContentMode(2);
        }
        if (this.f26882e) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        m mVar = this.f26879b;
        mVar.setHorizontalScrollBarEnabled(false);
        mVar.setHorizontalScrollbarOverlay(false);
        mVar.setVerticalScrollBarEnabled(false);
        mVar.setVerticalScrollbarOverlay(false);
        mVar.getSettings().setSupportZoom(false);
        this.f26879b.setFocusable(true);
        this.f26879b.setBackgroundColor(0);
        j0 j0Var = new j0();
        this.f26880c = j0Var;
        this.f26879b.setWebChromeClient(j0Var);
        try {
            Context context = this.f26879b.getContext();
            ApplicationInfo applicationInfo = context != null ? context.getApplicationInfo() : null;
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                z10 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z10);
        } catch (Exception unused) {
            IAlog.a("Could not set web contents debugging flag", new Object[0]);
        }
        this.f26879b.setListener(this);
    }

    public final void i() {
        IAlog.a("IAWebViewController resetClick()", new Object[0]);
        c cVar = this.f26891n;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(cVar);
        }
        d dVar = this.f26890m;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(dVar);
        }
        this.f26887j = false;
    }

    public void setAdContent(com.fyber.inneractive.sdk.flow.x xVar) {
        this.f26896s = xVar;
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.f26895r = inneractiveAdRequest;
    }

    public void setAdResponse(com.fyber.inneractive.sdk.response.e eVar) {
        this.f26897t = eVar;
    }

    public void setListener(j1 j1Var) {
        this.f26884g = j1Var;
    }

    public final void a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        m mVar = this.f26879b;
        if (mVar != null) {
            if (layoutParams != null) {
                viewGroup.addView(mVar, layoutParams);
            } else {
                viewGroup.addView(mVar);
            }
            com.fyber.inneractive.sdk.util.l0.f26787a.a(viewGroup.getContext(), this.f26879b, this);
            this.f26879b.setTapListener(this);
        }
    }

    public final m a(com.fyber.inneractive.sdk.config.global.r rVar) {
        int i10;
        int i11;
        m mVar = new m();
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.f fVar = (com.fyber.inneractive.sdk.config.global.features.f) rVar.a(com.fyber.inneractive.sdk.config.global.features.f.class);
            Boolean boolC = fVar.c("agg_res");
            zBooleanValue = boolC != null ? boolC.booleanValue() : false;
            Integer numA = fVar.a("agg_res_ct");
            int iMax = Math.max(numA != null ? numA.intValue() : 500, 50);
            Integer numA2 = fVar.a("agg_res_rt");
            int iMax2 = Math.max(numA2 != null ? numA2.intValue() : 500, 50);
            Integer numA3 = fVar.a("agg_res_retries");
            iMax = Math.max(numA3 != null ? numA3.intValue() : 2, 1);
            i11 = iMax2;
            i10 = iMax;
        } else {
            i10 = 500;
            i11 = 500;
        }
        k0 k0Var = new k0(this, zBooleanValue, i10, i11, iMax);
        this.f26881d = k0Var;
        mVar.setWebViewClient(k0Var);
        return mVar;
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void d() {
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f10, Rect rect) {
        if (f10 == this.f26885h && rect.equals(this.f26886i)) {
            return;
        }
        this.f26885h = f10;
        this.f26886i.set(rect);
        m mVar = this.f26879b;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public boolean a(WebView webView, String str) {
        IAlog.a("%shandleUrl called with: %s", IAlog.a(this), str);
        if (this.f26879b == null) {
            IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        }
        if (com.fyber.inneractive.sdk.util.j1.a(str)) {
            this.f26879b.loadUrl("chrome://crash");
            return true;
        }
        if (str != null && str.startsWith("data:")) {
            return false;
        }
        com.fyber.inneractive.sdk.util.g1 g1VarG = g();
        if (a(str, g1VarG)) {
            return true;
        }
        a(new h(this, str, g1VarG));
        return true;
    }

    public void a(boolean z10) {
        IAlog.a("%sonWebViewVisibilityChanged called with: %s", IAlog.a(this), Boolean.valueOf(z10));
        j1 j1Var = this.f26884g;
        if (j1Var != null) {
            j1Var.a(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void a() {
        j1 j1Var = this.f26884g;
        if (j1Var != null) {
            j1Var.a();
        }
        b(true);
    }

    public final void a(f fVar) {
        IAlog.e("IAWebViewController Web view click detected", new Object[0]);
        if (this.f26887j) {
            IAlog.e("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            fVar.d();
            i();
            return;
        }
        if (this.f26888k) {
            IAlog.e("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
            d dVar = this.f26890m;
            if (dVar != null) {
                com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(dVar);
            }
            this.f26889l = fVar;
            if (this.f26890m != null) {
                com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(this.f26890m, IAConfigManager.O.f23226u.f23394b.a("click_timeout", 1000, 1000));
                return;
            }
            return;
        }
        d dVar2 = this.f26890m;
        if (dVar2 != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(dVar2);
        }
        this.f26889l = null;
        fVar.d();
    }
}
