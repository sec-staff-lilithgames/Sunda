package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amazon.device.ads.DTBMetricReport;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import com.iab.omid.library.fyber.adsession.AdSession;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t extends p0 {
    public v1 E;
    public com.fyber.inneractive.sdk.external.g I;
    public a1 J;

    /* renamed from: w, reason: collision with root package name */
    public s f26607w;

    /* renamed from: y, reason: collision with root package name */
    public IAmraidWebViewController f26609y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f26608x = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f26610z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public UnitDisplayType F = UnitDisplayType.INTERSTITIAL;
    public boolean G = false;
    public boolean H = false;

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean K() {
        return !this.B && this.f26609y.X;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int M() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        if (xVar == null || (rVar = ((q0) xVar).f23946c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.e) ((q0) this.f23531b).f23946c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_clickable_area_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int N() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        if (xVar == null || (rVar = ((q0) xVar).f23946c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.e) ((q0) this.f23531b).f23946c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_visible_size_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    @Override // com.fyber.inneractive.sdk.flow.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long O() {
        /*
            r7 = this;
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r7.F
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            r2 = 30
            r3 = 5
            if (r0 != r1) goto L2a
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.O
            com.fyber.inneractive.sdk.config.s r0 = r0.f23226u
            com.fyber.inneractive.sdk.config.o r0 = r0.f23394b
            java.lang.String r1 = "rewarded_mraid_delay"
            r4 = 31
            int r0 = r0.a(r1, r4, r2)
            java.lang.String r1 = com.fyber.inneractive.sdk.util.IAlog.a(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "%sGetting rewarded total delay of %d seconds"
            com.fyber.inneractive.sdk.util.IAlog.a(r2, r1)
            goto L93
        L2a:
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.O
            com.fyber.inneractive.sdk.config.s r0 = r0.f23226u
            if (r0 != 0) goto L32
            r0 = r3
            goto L93
        L32:
            com.fyber.inneractive.sdk.config.o r0 = r0.f23394b
            java.lang.String r1 = "mraid_x_delay_v2"
            r4 = 0
            int r1 = r0.b(r1, r3, r4)
            java.lang.String r4 = "int_configuration"
            com.fyber.inneractive.sdk.config.l r4 = r0.a(r4)
            if (r4 == 0) goto L6d
            java.util.HashMap r5 = r4.f23328a
            java.lang.String r6 = "close_d"
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto L6d
            java.util.HashMap r0 = r4.f23328a     // Catch: java.lang.Throwable -> L62
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L62
            java.util.HashMap r0 = r4.f23328a     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L62
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L62
            goto L63
        L62:
            r0 = r3
        L63:
            if (r0 < 0) goto L68
            if (r0 > r2) goto L68
            goto L69
        L68:
            r0 = r3
        L69:
            r1 = 1
            r7.f23773t = r1
            goto L93
        L6d:
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r2 = r7.F
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r4 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL
            if (r2 != r4) goto L92
            com.fyber.inneractive.sdk.config.enums.CreativeType r2 = com.fyber.inneractive.sdk.config.enums.CreativeType.PLAYABLE
            com.fyber.inneractive.sdk.flow.x r4 = r7.f23531b
            if (r4 == 0) goto L84
            com.fyber.inneractive.sdk.flow.q0 r4 = (com.fyber.inneractive.sdk.flow.q0) r4
            com.fyber.inneractive.sdk.response.e r4 = r4.f23945b
            if (r4 == 0) goto L84
            com.fyber.inneractive.sdk.response.f r4 = (com.fyber.inneractive.sdk.response.f) r4
            com.fyber.inneractive.sdk.config.enums.CreativeType r4 = r4.M
            goto L85
        L84:
            r4 = 0
        L85:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L92
            java.lang.String r2 = "d_ad_int_pl"
            int r0 = r0.b(r2, r1, r3)
            goto L93
        L92:
            r0 = r1
        L93:
            boolean r1 = com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()
            if (r1 == 0) goto Lcb
            boolean r1 = r7.C()
            if (r1 == 0) goto Lc3
            com.fyber.inneractive.sdk.flow.x r1 = r7.f23531b
            com.fyber.inneractive.sdk.flow.q0 r1 = (com.fyber.inneractive.sdk.flow.q0) r1
            com.fyber.inneractive.sdk.config.global.r r1 = r1.f23946c
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.c> r2 = com.fyber.inneractive.sdk.config.global.features.c.class
            com.fyber.inneractive.sdk.config.global.features.h r1 = r1.a(r2)
            com.fyber.inneractive.sdk.config.global.features.c r1 = (com.fyber.inneractive.sdk.config.global.features.c) r1
            java.lang.String r2 = "skip_time_sec"
            java.lang.Integer r1 = r1.a(r2)
            if (r1 == 0) goto Lba
            int r1 = r1.intValue()
            goto Lbb
        Lba:
            r1 = r3
        Lbb:
            if (r1 < 0) goto Lc7
            r2 = 8
            if (r1 > r2) goto Lc7
            r3 = r1
            goto Lc7
        Lc3:
            int r3 = java.lang.Math.min(r0, r3)
        Lc7:
            int r0 = java.lang.Math.min(r3, r0)
        Lcb:
            int r0 = r0 * 1000
            long r0 = (long) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.t.O():long");
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean P() {
        return false;
    }

    public final void Q() {
        IAlog.a("%sprovide reward called", IAlog.a(this));
        if (this.H) {
            IAlog.a("%sreward was already provided", IAlog.a(this));
            return;
        }
        IAlog.a("%sreward sent", IAlog.a(this));
        if (this.I != null) {
            com.fyber.inneractive.sdk.flow.b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION, com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY);
            com.fyber.inneractive.sdk.external.g gVar = this.I;
            i0 i0Var = (i0) com.fyber.inneractive.sdk.util.v.a(((s0) gVar.f23518a).mAdSpot);
            InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = gVar.f23518a.f23496b;
            if (inneractiveFullScreenAdRewardedListener != null && i0Var != null) {
                inneractiveFullScreenAdRewardedListener.onAdRewarded(i0Var);
            }
        }
        IAmraidWebViewController iAmraidWebViewController = this.f26609y;
        if (iAmraidWebViewController == null || !iAmraidWebViewController.D) {
            J();
        }
        this.H = true;
    }

    public final void R() {
        IAmraidWebViewController iAmraidWebViewController;
        if (this.f23531b == null || (iAmraidWebViewController = this.f26609y) == null) {
            IAlog.a("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController.f26879b;
        if (mVar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            mVar.setLayoutParams(layoutParams);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.interfaces.e eVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        com.fyber.inneractive.sdk.config.s0 s0Var;
        super.a(eVar, activity);
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        l0 l0Var = (xVar == null || (s0Var = ((q0) xVar).f23947d) == null) ? null : ((r0) s0Var).f23345c;
        if (l0Var == null) {
            IAlog.f("%sNo display config for full screen mraid ad renderer! Cannot render", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No display config for full screen mraid");
        }
        IAmraidWebViewController iAmraidWebViewController = xVar != null ? ((q0) xVar).f23777i : null;
        this.f26609y = iAmraidWebViewController;
        if (iAmraidWebViewController == null || iAmraidWebViewController.f26879b == null) {
            IAlog.f("%sWeb view controller content is not valid. Web view might have crashed", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Web view could not be loaded");
        }
        ((q0) xVar).f();
        this.F = l0Var.f23330b;
        this.f26610z = false;
        this.A = false;
        this.J = new a1(this.f23530a);
        this.f23764k = eVar;
        IAmraidWebViewController iAmraidWebViewController2 = this.f26609y;
        if (iAmraidWebViewController2 == null) {
            IAlog.f("InneractiveFullscreenMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f23531b);
            return;
        }
        iAmraidWebViewController2.a(eVar.getCloseButton(), com.fyber.inneractive.sdk.measurement.tracker.d.CloseButton);
        com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) ((q0) this.f23531b).f23945b;
        int i10 = fVar.f26633e;
        int i11 = fVar.f26634f;
        boolean z10 = (i10 == 300 && i11 == 250) || (i10 == 600 && i11 == 500);
        this.B = z10;
        if (z10) {
            this.f26609y.setAdDefaultSize(com.fyber.inneractive.sdk.util.o.a(i10), com.fyber.inneractive.sdk.util.o.a(i11));
        }
        if (this.f26607w == null) {
            this.f26607w = new s(this);
        }
        this.f26609y.setListener(this.f26607w);
        InneractiveAdSpot inneractiveAdSpot = this.f23530a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && activity != null) {
            com.fyber.inneractive.sdk.flow.x adContent = this.f23530a.getAdContent();
            com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(activity, false, adContent.f23944a, adContent.b(), adContent.f23946c);
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.ia_identifier_overlay);
            IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            IFyberAdIdentifier iFyberAdIdentifier = gVar.f23645d;
            iFyberAdIdentifier.f26733k = corner;
            iFyberAdIdentifier.a(viewGroup);
            viewGroup.setVisibility(0);
            this.f26609y.a(viewGroup, com.fyber.inneractive.sdk.measurement.tracker.d.IdentifierView);
        }
        R();
        IAmraidWebViewController iAmraidWebViewController3 = this.f26609y;
        ViewGroup layout = this.f23764k.getLayout();
        InneractiveAdRequest inneractiveAdRequest = ((q0) this.f23531b).f23944a;
        iAmraidWebViewController3.a(layout, (ViewGroup.LayoutParams) null);
        this.f26610z = true;
        if (this.F == UnitDisplayType.REWARDED) {
            v1 v1Var = new v1(TimeUnit.SECONDS, IAConfigManager.O.f23226u.f23394b.a("rewarded_mraid_delay", 31, 30));
            this.E = v1Var;
            v1Var.f26828e = new r(this);
            t1 t1Var = new t1(v1Var);
            v1Var.f26826c = t1Var;
            v1Var.f26827d = false;
            t1Var.sendEmptyMessage(1932593528);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final /* bridge */ /* synthetic */ boolean b(com.fyber.inneractive.sdk.flow.x xVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.f26609y;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, com.fyber.inneractive.sdk.measurement.tracker.d.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        InneractiveUnitController.EventsListener eventsListener;
        if (this.f26610z && !this.A && (eventsListener = this.f23532c) != null) {
            this.A = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f23530a);
        }
        this.f26607w = null;
        v1 v1Var = this.E;
        if (v1Var != null) {
            v1Var.f26828e = null;
            this.E = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void e(View view) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        IAmraidWebViewController iAmraidWebViewController = this.f26609y;
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

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void l() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        InneractiveUnitController.EventsListener eventsListener;
        if (this.F == UnitDisplayType.REWARDED && this.G) {
            Q();
        }
        if (!this.A && (eventsListener = this.f23532c) != null) {
            this.A = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f23530a);
        }
        a1 a1Var = this.J;
        if (a1Var != null && a1Var.f26758b != 0) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - a1Var.f26758b) - a1Var.f26760d;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long seconds = timeUnit.toSeconds(jCurrentTimeMillis);
            long millis = timeUnit.toMillis(jCurrentTimeMillis - TimeUnit.SECONDS.toMillis(seconds));
            Locale locale = Locale.US;
            String str = seconds + "." + millis;
            a1Var.f26758b = 0L;
            a1Var.f26759c = 0L;
            a1Var.f26760d = 0L;
            InneractiveAdSpot inneractiveAdSpot = a1Var.f26757a;
            com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.INTERSTITIAL_VIEW_TIME;
            InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f23944a : null;
            com.fyber.inneractive.sdk.response.e eVarB = adContent != null ? adContent.b() : null;
            JSONArray jSONArrayB = (adContent == null || (rVar = adContent.f23946c) == null) ? null : rVar.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
            wVar.f24326c = uVar;
            wVar.f24324a = inneractiveAdRequest;
            wVar.f24327d = jSONArrayB;
            wVar.a(DTBMetricReport.TIME, str);
            wVar.a((String) null);
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f23530a;
        if (inneractiveAdSpot2 == null || !(inneractiveAdSpot2 instanceof i0)) {
            return;
        }
        ((i0) inneractiveAdSpot2).a();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void n() {
        v1 v1Var;
        super.n();
        if (this.F == UnitDisplayType.REWARDED && (v1Var = this.E) != null) {
            v1Var.f26827d = false;
            v1Var.a(SystemClock.uptimeMillis());
        }
        a1 a1Var = this.J;
        if (a1Var != null) {
            if (a1Var.f26758b == 0) {
                a1Var.f26758b = System.currentTimeMillis();
            }
            if (a1Var.f26759c > 0) {
                a1Var.f26760d += System.currentTimeMillis() - a1Var.f26759c;
                a1Var.f26759c = 0L;
            }
        }
        com.fyber.inneractive.sdk.util.a aVar = this.f23774u;
        if (!aVar.f26752b || aVar.f26755e <= 0) {
            return;
        }
        aVar.f26756f += System.currentTimeMillis() - aVar.f26755e;
        aVar.f26755e = 0L;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void s() {
        v1 v1Var;
        super.s();
        if (this.F == UnitDisplayType.REWARDED && (v1Var = this.E) != null) {
            v1Var.f26827d = true;
            t1 t1Var = v1Var.f26826c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
        a1 a1Var = this.J;
        if (a1Var != null) {
            a1Var.f26759c = System.currentTimeMillis();
        }
        com.fyber.inneractive.sdk.util.a aVar = this.f23774u;
        if (aVar.f26752b) {
            aVar.f26755e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final boolean v() {
        boolean z10;
        if (this.f23764k == null) {
            z10 = true;
        } else if (this.F == UnitDisplayType.REWARDED) {
            if (this.G) {
                Q();
            }
            z10 = this.G;
        } else {
            z10 = this.f23769p;
        }
        if (!z10) {
            return true;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f23764k;
        if (eVar == null) {
            return false;
        }
        eVar.dismissAd(true);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final Context y() {
        IAmraidWebViewController iAmraidWebViewController = this.f26609y;
        return c(iAmraidWebViewController != null ? iAmraidWebViewController.f26879b : null);
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void b(boolean z10) throws JSONException {
        if (!K()) {
            if (z10) {
                this.f23774u.a((String) null);
            } else {
                com.fyber.inneractive.sdk.util.a aVar = this.f23774u;
                aVar.f26754d = 0L;
                aVar.f26755e = 0L;
                aVar.f26756f = 0L;
                aVar.f26752b = false;
            }
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f23764k;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a() {
        R();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long a(long j10) {
        if (this.F == UnitDisplayType.REWARDED) {
            return 0L;
        }
        if (this.f23773t) {
            return j10;
        }
        long j11 = 13;
        try {
            j11 = Long.parseLong(IAConfigManager.O.f23226u.f23394b.a("mraid_x_fallback_delay", Long.toString(13L)));
        } catch (Throwable unused) {
        }
        return j11 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.external.g gVar) {
        this.I = gVar;
    }
}
