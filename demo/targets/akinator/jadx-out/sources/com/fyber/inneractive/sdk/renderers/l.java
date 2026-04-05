package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.mraid.f0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.ironsource.G5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends com.fyber.inneractive.sdk.flow.b0 implements com.fyber.inneractive.sdk.interfaces.d, com.fyber.inneractive.sdk.util.a0 {

    /* renamed from: l, reason: collision with root package name */
    public InneractiveAdViewUnitController f26576l;

    /* renamed from: m, reason: collision with root package name */
    public IAmraidWebViewController f26577m;

    /* renamed from: n, reason: collision with root package name */
    public h f26578n;

    /* renamed from: p, reason: collision with root package name */
    public ViewGroup f26580p;

    /* renamed from: q, reason: collision with root package name */
    public j f26581q;

    /* renamed from: s, reason: collision with root package name */
    public i f26583s;

    /* renamed from: y, reason: collision with root package name */
    public d f26589y;

    /* renamed from: k, reason: collision with root package name */
    public long f26575k = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26579o = false;

    /* renamed from: r, reason: collision with root package name */
    public long f26582r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f26584t = 0;

    /* renamed from: u, reason: collision with root package name */
    public long f26585u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f26586v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f26587w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f26588x = false;

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int A() {
        IAmraidWebViewController iAmraidWebViewController = this.f26577m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.f26879b == null || !iAmraidWebViewController.p()) ? com.fyber.inneractive.sdk.util.o.c(this.f26577m.f26903e0) : com.fyber.inneractive.sdk.util.o.c(this.f26577m.f26879b.getHeight());
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int B() {
        IAmraidWebViewController iAmraidWebViewController = this.f26577m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.f26879b == null || !iAmraidWebViewController.p()) ? com.fyber.inneractive.sdk.util.o.c(this.f26577m.f26902d0) : com.fyber.inneractive.sdk.util.o.c(this.f26577m.f26879b.getWidth());
        }
        return -1;
    }

    public final void K() {
        if (this.f26583s != null) {
            IAlog.a("%scancelling refreen runnable", IAlog.a(this));
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(this.f26583s);
            this.f26583s = null;
        }
    }

    public final void L() {
        d dVar = this.f26589y;
        if (dVar != null) {
            dVar.f26563g = false;
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(dVar.f26566j);
        }
        if (this.f26577m != null) {
            K();
            com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
            if (xVar != null) {
                ((q0) xVar).destroy();
            }
            this.f26577m = null;
            this.f23531b = null;
            ViewGroup viewGroup = this.f26580p;
            if (viewGroup != null) {
                viewGroup.removeView(this.f26581q);
            }
            j jVar = this.f26581q;
            if (jVar != null) {
                jVar.removeAllViews();
                this.f26581q = null;
            }
        }
        this.f26586v = false;
    }

    public final int M() {
        l0 l0Var;
        int iIntValue;
        int i10 = this.f26584t;
        if (i10 == -1) {
            IAlog.a("%sreturning disable value for banner refresh", IAlog.a(this));
            return 0;
        }
        if (i10 <= 0) {
            s0 s0Var = this.f23530a.getAdContent().f23947d;
            if (s0Var != null && (l0Var = ((r0) s0Var).f23345c) != null) {
                Integer num = l0Var.f23329a;
                IAlog.a("%sreturning refreshConfig = %d", IAlog.a(this), num);
                if (num != null) {
                    iIntValue = num.intValue();
                }
            }
            IAlog.a("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.a(this));
            return 0;
        }
        IAlog.a("%sreturning overriden refresh interval = %d", IAlog.a(this), Integer.valueOf(this.f26584t));
        iIntValue = this.f26584t;
        return iIntValue * 1000;
    }

    public final void N() {
        InneractiveAdViewUnitController inneractiveAdViewUnitController;
        IAmraidWebViewController iAmraidWebViewController = this.f26577m;
        if (iAmraidWebViewController == null || iAmraidWebViewController.f26879b == null) {
            return;
        }
        IAlog.a("%srefreshing ad", IAlog.a(this));
        if ((!this.f26577m.p() || this.f26577m.N == f0.RESIZED) && (inneractiveAdViewUnitController = this.f26576l) != null) {
            this.f26582r = 0L;
            inneractiveAdViewUnitController.refreshAd();
        }
    }

    public final void O() {
        com.fyber.inneractive.sdk.web.m mVar;
        IAmraidWebViewController iAmraidWebViewController = this.f26577m;
        if (iAmraidWebViewController == null || (mVar = iAmraidWebViewController.f26879b) == null || !mVar.getIsVisible() || this.f26582r == 0 || this.f26577m.p() || this.f26577m.N == f0.RESIZED) {
            return;
        }
        if (!this.f26587w) {
            if (this.f26575k < System.currentTimeMillis() - this.f26582r) {
                this.f26585u = 1L;
            } else {
                this.f26585u = this.f26575k - (System.currentTimeMillis() - this.f26582r);
            }
        }
        IAlog.a("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.a(this), Long.valueOf(this.f26585u));
        a(false, this.f26585u);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof q0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        return view != null && view.equals(this.f26580p);
    }

    public final void c(boolean z10) {
        if (this.f26583s != null) {
            this.f26587w = z10;
            K();
            this.f26585u = this.f26575k - (System.currentTimeMillis() - this.f26582r);
            IAlog.a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.a(this), Long.valueOf(this.f26585u), Long.valueOf(this.f26575k));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.f26577m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.p() || this.f26577m.N == f0.RESIZED) ? false : true;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.f26577m;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, com.fyber.inneractive.sdk.measurement.tracker.d.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        K();
        L();
        this.f26578n = null;
        com.fyber.inneractive.sdk.util.z.f26832a.f26761a.remove(this);
        i iVar = this.f26583s;
        if (iVar != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(iVar);
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int e() {
        return this.f26577m.f26902d0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int o() {
        return this.f26577m.f26903e0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
        com.fyber.inneractive.sdk.web.m mVar;
        IAlog.a("%sgot onAdRefreshFailed", IAlog.a(this));
        IAmraidWebViewController iAmraidWebViewController = this.f26577m;
        if (iAmraidWebViewController == null || (mVar = iAmraidWebViewController.f26879b) == null) {
            return;
        }
        if (!mVar.getIsVisible() || com.fyber.inneractive.sdk.util.z.f26832a.f26762b || this.f26577m.p() || this.f26577m.N == f0.RESIZED) {
            IAlog.a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.a(this));
            this.f26585u = 1L;
            return;
        }
        IAlog.a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.a(this));
        long jM = M();
        this.f26575k = jM;
        if (jM != 0) {
            a(false, 10000L);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void t() {
        d dVar = this.f26589y;
        if (dVar != null) {
            dVar.f26563g = false;
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(dVar.f26566j);
        }
        j jVar = this.f26581q;
        if (jVar != null) {
            jVar.removeAllViews();
            this.f26581q = null;
        }
        ViewGroup viewGroup = this.f26580p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f26580p = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        IAmraidWebViewController iAmraidWebViewController = this.f26577m;
        if (iAmraidWebViewController != null) {
            return iAmraidWebViewController.f26879b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        j jVar;
        l0 l0Var;
        UnitDisplayType unitDisplayType;
        InneractiveAdSpot inneractiveAdSpot = this.f23530a;
        if (inneractiveAdSpot == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f26579o = false;
        this.f23534e = false;
        if (viewGroup != null) {
            this.f26580p = viewGroup;
            this.f26576l = (InneractiveAdViewUnitController) inneractiveAdSpot.getSelectedUnitController();
        } else if (!this.f26588x) {
            L();
            if (!(this.f23530a.getAdContent() instanceof q0)) {
                IAlog.f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f23530a.getAdContent());
                return;
            }
            this.f23531b = (q0) this.f23530a.getAdContent();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        IAmraidWebViewController iAmraidWebViewController = xVar != null ? ((q0) xVar).f23777i : null;
        this.f26577m = iAmraidWebViewController;
        if (iAmraidWebViewController != null) {
            if (this.f26578n == null) {
                this.f26578n = new h(this);
            }
            iAmraidWebViewController.setListener(this.f26578n);
            q0 q0Var = (q0) this.f23531b;
            InneractiveAdRequest inneractiveAdRequest = q0Var.f23944a;
            s0 s0Var = q0Var.f23947d;
            if (s0Var == null || (l0Var = ((r0) s0Var).f23345c) == null || (unitDisplayType = l0Var.f23330b) == null || !unitDisplayType.isFullscreenUnit()) {
                this.f26581q = new j(this.f26580p.getContext(), 0.0f);
                q0 q0Var2 = (q0) this.f23531b;
                com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) q0Var2.f23945b;
                h1 h1VarA = a(fVar.f26633e, fVar.f26634f, q0Var2.f23947d);
                this.f26577m.setAdDefaultSize(h1VarA.f26780a, h1VarA.f26781b);
                IAmraidWebViewController iAmraidWebViewController2 = this.f26577m;
                com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController2.f26879b;
                if (mVar != null || com.fyber.inneractive.sdk.util.o.f26796a == null) {
                    ViewParent parent = mVar != null ? mVar.getParent() : null;
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(mVar);
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(h1VarA.f26780a, h1VarA.f26781b);
                    layoutParams.addRule(new int[]{13}[0]);
                    this.f26577m.a(this.f26581q, layoutParams);
                    this.f26580p.addView(this.f26581q);
                    j jVar2 = this.f26581q;
                    ViewGroup.LayoutParams layoutParams2 = jVar2.getLayoutParams();
                    layoutParams2.width = -2;
                    layoutParams2.height = -2;
                    jVar2.setLayoutParams(layoutParams2);
                    InneractiveAdSpot inneractiveAdSpot2 = this.f23530a;
                    if (inneractiveAdSpot2 != null && inneractiveAdSpot2.getAdContent() != null && (viewGroup2 = this.f26580p) != null) {
                        Context context = viewGroup2.getContext();
                        com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(context, false, this.f23530a.getAdContent().f23944a, this.f23530a.getAdContent().b(), this.f23530a.getAdContent().f23946c);
                        ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.ia_layout_fyber_ad_identifier_relative, this.f26580p, false);
                        IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
                        IFyberAdIdentifier iFyberAdIdentifier = gVar.f23645d;
                        iFyberAdIdentifier.f26733k = corner;
                        iFyberAdIdentifier.a(viewGroup4);
                        viewGroup4.setVisibility(0);
                        IAmraidWebViewController iAmraidWebViewController3 = this.f26577m;
                        if (iAmraidWebViewController3 == null) {
                            viewGroup3 = null;
                        } else {
                            viewGroup3 = iAmraidWebViewController3.f26879b;
                            if (viewGroup3 != null && viewGroup3.getParent() != null) {
                                viewGroup3 = (ViewGroup) viewGroup3.getParent();
                            }
                        }
                        if (viewGroup3 != null && z() != null) {
                            ViewGroup.LayoutParams layoutParams3 = z().getLayoutParams();
                            IAmraidWebViewController iAmraidWebViewController4 = this.f26577m;
                            viewGroup3.addView(viewGroup4, layoutParams3);
                            iAmraidWebViewController4.a(viewGroup4, com.fyber.inneractive.sdk.measurement.tracker.d.IdentifierView);
                        }
                    }
                } else if (this.f26588x) {
                    FrameLayout frameLayout = new FrameLayout(this.f26580p.getContext());
                    frameLayout.setBackgroundResource(R.color.ia_blank_background);
                    this.f26580p.removeAllViews();
                    this.f26580p.addView(frameLayout, new FrameLayout.LayoutParams(h1VarA.f26780a, h1VarA.f26781b, 17));
                } else {
                    this.f26588x = true;
                    iAmraidWebViewController2.f26879b = iAmraidWebViewController2.a(((q0) this.f23531b).f23946c);
                    try {
                        iAmraidWebViewController2.h();
                        iAmraidWebViewController2.f26879b.loadDataWithBaseURL(iAmraidWebViewController2.f26893p, iAmraidWebViewController2.f26894q, "text/html", G5.N, null);
                    } catch (Throwable unused) {
                        FrameLayout frameLayout2 = new FrameLayout(this.f26580p.getContext());
                        frameLayout2.setBackgroundResource(R.color.ia_blank_background);
                        this.f26580p.removeAllViews();
                        this.f26580p.addView(frameLayout2, new FrameLayout.LayoutParams(h1VarA.f26780a, h1VarA.f26781b, 17));
                    }
                }
            } else {
                j jVar3 = new j(this.f26580p.getContext(), 1.5f);
                this.f26581q = jVar3;
                this.f26577m.a(jVar3, new ViewGroup.LayoutParams(-1, -1));
                this.f26580p.addView(this.f26581q, new ViewGroup.LayoutParams(-2, -2));
            }
            com.fyber.inneractive.sdk.flow.x xVar2 = this.f23531b;
            com.fyber.inneractive.sdk.response.f fVar2 = xVar2 != null ? (com.fyber.inneractive.sdk.response.f) ((q0) xVar2).f23945b : null;
            if (fVar2 != null && (jVar = this.f26581q) != null) {
                d dVar = new d(fVar2, jVar, new g(this));
                this.f26589y = dVar;
                dVar.f26564h = false;
                dVar.f26560d = 1;
                dVar.f26561e = 0.0f;
                int i10 = fVar2.f26650v;
                if (i10 >= 1) {
                    dVar.f26560d = Math.min(i10, 100);
                }
                float f10 = fVar2.f26651w;
                if (f10 >= -1.0f) {
                    dVar.f26561e = f10;
                }
                if (dVar.f26561e >= 0.0f) {
                    IAlog.a("IAVisibilityTracker: startTrackingVisibility", new Object[0]);
                    dVar.f26559c = 0.0f;
                    dVar.f26562f = System.currentTimeMillis();
                    dVar.f26563g = true;
                    dVar.a();
                }
            }
        } else {
            IAlog.f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", xVar);
        }
        com.fyber.inneractive.sdk.util.b0 b0Var = com.fyber.inneractive.sdk.util.z.f26832a;
        if (b0Var.f26761a.contains(this)) {
            return;
        }
        b0Var.f26761a.add(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void e(View view) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        IAmraidWebViewController iAmraidWebViewController = this.f26577m;
        if (iAmraidWebViewController == null || (eVar = iAmraidWebViewController.I) == null) {
            return;
        }
        try {
            AdSession adSession = eVar.f24029a;
            if (adSession == null || view == null) {
                return;
            }
            adSession.removeFriendlyObstruction(view);
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void m() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void r() {
    }

    public final void a(boolean z10, long j10) {
        IAmraidWebViewController iAmraidWebViewController;
        com.fyber.inneractive.sdk.web.m mVar;
        if (!TextUtils.isEmpty(this.f23530a.getMediationNameString()) || j10 == 0 || (this.f23530a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) || this.f26584t == -1 || (iAmraidWebViewController = this.f26577m) == null || (mVar = iAmraidWebViewController.f26879b) == null) {
            return;
        }
        if (!mVar.getIsVisible()) {
            IAlog.a("%sstartRefreshTimer called but ad is not visible", IAlog.a(this));
            return;
        }
        this.f26582r = System.currentTimeMillis();
        this.f26575k = z10 ? this.f26575k : j10;
        IAlog.a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.a(this), Long.valueOf(j10), Long.valueOf(this.f26575k));
        if (j10 > 1) {
            i iVar = this.f26583s;
            if (iVar != null) {
                com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(iVar);
            }
            K();
            i iVar2 = new i(this);
            this.f26583s = iVar2;
            com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(iVar2, j10);
            return;
        }
        N();
    }

    public static h1 a(int i10, int i11, s0 s0Var) {
        int iA;
        int iA2;
        l0 l0Var;
        IAlog.a("View layout params: response width and height: %d, %d", Integer.valueOf(i10), Integer.valueOf(i11));
        if (i10 > 0 && i11 > 0) {
            iA = com.fyber.inneractive.sdk.util.o.a(i10);
            iA2 = com.fyber.inneractive.sdk.util.o.a(i11);
        } else {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (s0Var != null && (l0Var = ((r0) s0Var).f23345c) != null) {
                unitDisplayType = l0Var.f23330b;
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                iA = com.fyber.inneractive.sdk.util.o.a(k.RECTANGLE_WIDTH.value);
                iA2 = com.fyber.inneractive.sdk.util.o.a(k.RECTANGLE_HEIGHT.value);
            } else if (com.fyber.inneractive.sdk.util.k.m()) {
                iA = com.fyber.inneractive.sdk.util.o.a(k.BANNER_TABLET_WIDTH.value);
                iA2 = com.fyber.inneractive.sdk.util.o.a(k.BANNER_TABLET_HEIGHT.value);
            } else {
                iA = com.fyber.inneractive.sdk.util.o.a(k.BANNER_WIDTH.value);
                iA2 = com.fyber.inneractive.sdk.util.o.a(k.BANNER_HEIGHT.value);
            }
        }
        IAlog.e("View layout params: final scaled width and height: %d, %d", Integer.valueOf(iA), Integer.valueOf(iA2));
        return new h1(iA, iA2);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i10) {
        this.f26584t = i10;
    }
}
