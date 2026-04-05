package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.m0;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.player.controller.g0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v extends p0 implements g0, com.fyber.inneractive.sdk.flow.storepromo.observer.a {
    public com.fyber.inneractive.sdk.external.g D;
    public d0 F;

    /* renamed from: w, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.e f26612w;

    /* renamed from: x, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.m f26613x;

    /* renamed from: y, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.b f26614y;

    /* renamed from: z, reason: collision with root package name */
    public WeakReference f26615z;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public UnitDisplayType E = UnitDisplayType.INTERSTITIAL;
    public boolean G = false;
    public final u H = new u(this);
    public final RelativeLayout.LayoutParams I = new RelativeLayout.LayoutParams(-1, -1);
    public boolean J = false;
    public boolean K = false;

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean D() {
        com.fyber.inneractive.sdk.player.ui.m mVar = this.f26613x;
        return mVar != null && mVar.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void I() {
        View view = this.f23539j;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean K() {
        return this.J;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int M() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        if (xVar == null || (rVar = ((t0) xVar).f23946c) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.r) rVar.a(com.fyber.inneractive.sdk.config.global.features.r.class)).a("close_clickable_area_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int N() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        if (xVar == null || (rVar = ((t0) xVar).f23946c) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.r) rVar.a(com.fyber.inneractive.sdk.config.global.features.r.class)).a("close_visible_size_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long O() {
        int iA;
        d0 d0Var;
        if (InneractiveAdManager.isCurrentUserAChild()) {
            if (C()) {
                Integer numA = ((com.fyber.inneractive.sdk.config.global.features.c) ((t0) this.f23531b).f23946c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).a("end_card_skip_time_sec");
                int iIntValue = numA != null ? numA.intValue() : 0;
                if (iIntValue < 0 || iIntValue > 5) {
                    iIntValue = 0;
                }
                if (iIntValue > 0) {
                    IAlog.a("%s: overriding endcard dismiss time with child mode with %d", IAlog.a(this), Integer.valueOf(iIntValue));
                    return iIntValue;
                }
            }
            IAlog.a("%s: overriding endcard dismiss time with child mode with %d", IAlog.a(this), 0);
            return 0L;
        }
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.config.l lVarA = iAConfigManager.f23226u.f23394b.a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26614y;
        if (bVar == null && (d0Var = this.F) != null) {
            bVar = d0Var.f26567a;
        }
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
        if (kVarJ != null) {
            com.fyber.inneractive.sdk.flow.endcard.b bVarA = kVarJ.f23574b.a();
            iA = bVarA != null ? bVarA.f23560f : kVarJ.f23578f;
        } else {
            iA = iAConfigManager.f23226u.f23394b.a("vast_endcard_x_delay", 5, 0);
        }
        long j10 = iA;
        if (lVarA.f23328a.containsKey("endcard_cr") || lVarA.f23328a.containsKey("endcard_ci")) {
            String str = this.E != UnitDisplayType.REWARDED ? "endcard_ci" : "endcard_cr";
            long j11 = lVarA.f23328a.containsKey(str) ? Long.parseLong((String) lVarA.f23328a.get(str)) : j10;
            if (j11 >= 0 && j11 <= 5) {
                IAlog.a("%s : overriding endcard dismiss time for type: %s with: %d sec.", IAlog.a(this), this.E, Long.valueOf(j11));
                this.f23773t = true;
                j10 = j11;
            }
        }
        return j10 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean P() {
        com.fyber.inneractive.sdk.player.ui.m mVar = this.f26613x;
        return mVar != null && mVar.b();
    }

    public final void Q() {
        if (this.B || this.f23532c == null) {
            return;
        }
        this.B = true;
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f26612w;
        if (eVar != null && (eVar.wasDismissedByUser() || IAConfigManager.O.f23226u.f23394b.a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).a())) {
            com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_CLOSE;
            com.fyber.inneractive.sdk.flow.x xVar2 = this.f23531b;
            if (xVar2 != null) {
                t0 t0Var = (t0) xVar2;
                if (t0Var.f23892i != null) {
                    String[] strArr = {xVar.a()};
                    com.fyber.inneractive.sdk.player.t tVar = t0Var.f23892i;
                    if (tVar != null) {
                        tVar.a("EVENT_TRACKING", strArr);
                    }
                }
            }
            com.fyber.inneractive.sdk.model.vast.x xVar3 = com.fyber.inneractive.sdk.model.vast.x.EVENT_CLOSE_LINEAR;
            com.fyber.inneractive.sdk.flow.x xVar4 = this.f23531b;
            if (xVar4 != null) {
                t0 t0Var2 = (t0) xVar4;
                if (t0Var2.f23892i != null) {
                    String[] strArr2 = {xVar3.a()};
                    com.fyber.inneractive.sdk.player.t tVar2 = t0Var2.f23892i;
                    if (tVar2 != null) {
                        tVar2.a("EVENT_TRACKING", strArr2);
                    }
                }
            }
        }
        ((InneractiveFullscreenAdEventsListener) this.f23532c).onAdDismissed(this.f23530a);
    }

    public final void R() {
        s0 s0Var;
        l0 l0Var;
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        if (xVar == null || (s0Var = ((t0) xVar).f23947d) == null || (l0Var = ((r0) s0Var).f23345c) == null) {
            return;
        }
        UnitDisplayType unitDisplayType = l0Var.f23330b;
        x0 x0Var = IAConfigManager.O.f23229x;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar = unitDisplayType == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO;
        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
        com.fyber.inneractive.sdk.cache.session.e eVar = x0Var.f23420a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f26803a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean b(com.fyber.inneractive.sdk.flow.x xVar) {
        Boolean boolC;
        com.fyber.inneractive.sdk.config.global.r rVar;
        d0 d0Var;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.config.o oVar = iAConfigManager.f23226u.f23394b;
        oVar.getClass();
        String str = iAConfigManager.f23209d;
        if (!(oVar.f23337b.containsKey(str) ? (com.fyber.inneractive.sdk.config.m) oVar.f23337b.get(str) : new com.fyber.inneractive.sdk.config.m()).f23333a.containsKey(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) {
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26614y;
            if (bVar == null && (d0Var = this.F) != null) {
                bVar = d0Var.f26567a;
            }
            com.fyber.inneractive.sdk.config.global.features.u uVar = null;
            com.fyber.inneractive.sdk.flow.endcard.k kVarJ = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
            com.fyber.inneractive.sdk.flow.endcard.b bVarA = kVarJ != null ? kVarJ.f23574b.a() : null;
            if (bVarA != null && bVarA.i() == com.fyber.inneractive.sdk.model.vast.i.Static) {
                com.fyber.inneractive.sdk.flow.x xVar2 = this.f23531b;
                if (xVar2 != null && (rVar = ((t0) xVar2).f23946c) != null) {
                    uVar = (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class);
                }
                UnitDisplayType unitDisplayType = this.E;
                uVar.getClass();
                int i10 = com.fyber.inneractive.sdk.config.global.features.s.f23293a[unitDisplayType.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2 && (boolC = uVar.c("countdown_iv")) != null) {
                        return boolC.booleanValue();
                    }
                    return false;
                }
                Boolean boolC2 = uVar.c("countdown_rv");
                if (boolC2 != null) {
                    return boolC2.booleanValue();
                }
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void d() {
        if (!this.C) {
            this.f23774u.a(true);
        }
        this.C = true;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f26612w;
        if (eVar != null) {
            eVar.destroy();
        }
        if (this.A) {
            Q();
        }
        com.fyber.inneractive.sdk.player.controller.b bVar = this.f26614y;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.z) bVar).b(this);
            this.f26614y.destroy();
            this.f26614y = null;
        }
        com.fyber.inneractive.sdk.player.ui.m mVar = this.f26613x;
        if (mVar != null) {
            mVar.destroy();
            this.f26613x = null;
        }
        this.f26612w = null;
        this.f26615z = null;
        super.destroy();
    }

    public final void e(boolean z10) throws JSONException {
        if (P() && this.J) {
            return;
        }
        if (z10) {
            com.fyber.inneractive.sdk.player.controller.b bVar = this.f26614y;
            com.fyber.inneractive.sdk.flow.endcard.k kVarJ = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
            com.fyber.inneractive.sdk.flow.endcard.o oVar = kVarJ != null ? (com.fyber.inneractive.sdk.flow.endcard.o) kVarJ.f23574b.a(com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card) : null;
            this.f23774u.a(oVar != null ? oVar.g().toString() : null);
            return;
        }
        com.fyber.inneractive.sdk.util.a aVar = this.f23774u;
        aVar.f26754d = 0L;
        aVar.f26755e = 0L;
        aVar.f26756f = 0L;
        aVar.f26752b = false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void f() {
        R();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void g() throws JSONException {
        this.J = true;
        m0 m0Var = this.f23775v;
        if (m0Var != null) {
            m0Var.cancel();
            this.f23775v = null;
        }
        if (!this.f23772s) {
            this.f23772s = true;
            com.fyber.inneractive.sdk.interfaces.e eVar = this.f26612w;
            if (eVar != null) {
                c(eVar.isCloseButtonDisplay());
            }
        }
        com.fyber.inneractive.sdk.interfaces.e eVar2 = this.f26612w;
        if (eVar2 == null || !eVar2.isCloseButtonDisplay()) {
            return;
        }
        d(true ^ this.f23773t);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void i() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f26612w;
        if (eVar != null) {
            eVar.dismissAd(false);
        }
        a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void j() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f26612w;
        if (eVar != null) {
            eVar.dismissAd(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void k() {
        x0 x0Var = IAConfigManager.O.f23229x;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar = this.E == UnitDisplayType.INTERSTITIAL ? com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO;
        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
        com.fyber.inneractive.sdk.cache.session.e eVar = x0Var.f23420a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f26803a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
        }
        G();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void l() {
        Q();
        InneractiveAdSpot inneractiveAdSpot = this.f23530a;
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof i0)) {
            return;
        }
        ((i0) inneractiveAdSpot).a();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void n() {
        super.n();
        com.fyber.inneractive.sdk.util.a aVar = this.f23774u;
        if (!aVar.f26752b || aVar.f26755e <= 0) {
            return;
        }
        aVar.f26756f += System.currentTimeMillis() - aVar.f26755e;
        aVar.f26755e = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onCompleted() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.v.a(this.f26615z);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onCompleted();
        }
        x0 x0Var = IAConfigManager.O.f23229x;
        UnitDisplayType unitDisplayType = this.E;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.REWARDED;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar = unitDisplayType == unitDisplayType2 ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO;
        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION;
        com.fyber.inneractive.sdk.cache.session.e eVar = x0Var.f23420a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f26803a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
        }
        if (this.E == unitDisplayType2) {
            com.fyber.inneractive.sdk.external.g gVar = this.D;
            if (gVar != null) {
                i0 i0Var = (i0) com.fyber.inneractive.sdk.util.v.a(((com.fyber.inneractive.sdk.flow.s0) gVar.f23518a).mAdSpot);
                InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = gVar.f23518a.f23496b;
                if (inneractiveFullScreenAdRewardedListener != null && i0Var != null) {
                    inneractiveFullScreenAdRewardedListener.onAdRewarded(i0Var);
                }
            }
            J();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        if (xVar == null || ((t0) xVar).f23892i == null) {
            return;
        }
        L();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onPlayerError() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.v.a(this.f26615z);
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f26612w;
        if (eVar != null) {
            eVar.dismissAd(false);
        }
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onProgress(int i10, int i11) {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.v.a(this.f26615z);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onProgress(i10, i11);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void s() {
        super.s();
        com.fyber.inneractive.sdk.util.a aVar = this.f23774u;
        if (aVar.f26752b) {
            aVar.f26755e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final boolean v() throws JSONException {
        com.fyber.inneractive.sdk.player.t tVar;
        com.fyber.inneractive.sdk.player.controller.b bVar;
        com.fyber.inneractive.sdk.interfaces.e eVar;
        com.fyber.inneractive.sdk.player.ui.m mVar;
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar;
        View view;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar2;
        View view2;
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        if (xVar == null || (tVar = ((t0) xVar).f23892i) == null || (bVar = this.f26614y) == null || (eVar = this.f26612w) == null || (mVar = this.f26613x) == null) {
            return false;
        }
        com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) tVar.f26241f;
        com.fyber.inneractive.sdk.flow.storepromo.b bVar3 = nVar.f26228v;
        if (bVar3 == null || (bVar2 = bVar3.f23785d) == null || (cVar = bVar2.f23795d) == null || cVar.f23883b == null || (view = cVar.f23882a) == null || view.getParent() == null || cVar.f23883b.getVisibility() != 0) {
            if (mVar.b()) {
                if (this.f23769p) {
                    eVar.dismissAd(true);
                    return true;
                }
            } else if (bVar.b()) {
                com.fyber.inneractive.sdk.player.controller.z zVar = (com.fyber.inneractive.sdk.player.controller.z) bVar;
                if (zVar.B()) {
                    zVar.g(true);
                    return true;
                }
                zVar.d(true);
            }
            return true;
        }
        com.fyber.inneractive.sdk.flow.storepromo.b bVar4 = nVar.f26228v;
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar5 = bVar4.f23785d;
        if (bVar5 == null || (cVar2 = bVar5.f23795d) == null || cVar2.f23883b == null || (view2 = cVar2.f23882a) == null || view2.getParent() == null || cVar2.f23883b.getVisibility() != 0) {
            IAlog.f("StorePromoManager: hidePromo: unable hide promo: controller null or not ready", new Object[0]);
            return true;
        }
        bVar4.f23785d.a();
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void x() {
        View view = this.f23539j;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.interfaces.e eVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        com.fyber.inneractive.sdk.config.t0 t0Var;
        super.a(eVar, activity);
        this.f26612w = eVar;
        this.A = false;
        this.B = false;
        this.K = false;
        InneractiveUnitController selectedUnitController = this.f23530a.getSelectedUnitController();
        if (selectedUnitController != null) {
            if (selectedUnitController instanceof InneractiveFullscreenUnitController) {
                InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
                if (selectedContentController != null) {
                    if (selectedContentController instanceof InneractiveFullscreenVideoContentController) {
                        this.f26615z = new WeakReference((InneractiveFullscreenVideoContentController) selectedContentController);
                    } else {
                        IAlog.f("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.a(this), selectedContentController.getClass().getSimpleName());
                    }
                }
            } else {
                IAlog.f("%sWrong type of unit controller found. Expecting InneractiveFullscreenUnitController", IAlog.a(this));
            }
        }
        s0 s0Var = this.f23530a.getAdContent().f23947d;
        if (s0Var != null && (t0Var = ((r0) s0Var).f23348f) != null) {
            this.E = t0Var.f23408j;
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        if (xVar != null) {
            ((t0) xVar).f();
        }
        com.fyber.inneractive.sdk.flow.x xVar2 = this.f23531b;
        com.fyber.inneractive.sdk.player.t tVar = xVar2 != null ? ((t0) xVar2).f23892i : null;
        Context context = this.f26612w.getLayout().getContext();
        if (tVar != null) {
            com.fyber.inneractive.sdk.player.a aVar = tVar.f26241f;
            if (aVar == null || ((com.fyber.inneractive.sdk.player.n) aVar).f26160a == null) {
                IAlog.f("%sFull screen video ad renderer is not valid.", IAlog.a(this));
                throw new InneractiveUnitController.AdDisplayError("Full screen video could not be loaded");
            }
            f fVar = new f(tVar);
            this.F = fVar;
            this.f26613x = fVar.a(context, ((t0) this.f23531b).f23946c);
            com.fyber.inneractive.sdk.player.controller.b bVarA = this.F.a(this.f23530a, (t0) this.f23531b);
            this.f26614y = bVarA;
            this.F.b();
            bVarA.b(false);
            com.fyber.inneractive.sdk.player.controller.z zVar = (com.fyber.inneractive.sdk.player.controller.z) this.f26614y;
            zVar.getClass();
            zVar.f24461g = this;
            ((com.fyber.inneractive.sdk.player.controller.z) this.f26614y).a(this);
            ((com.fyber.inneractive.sdk.player.ui.e) this.f26613x).e();
            this.I.addRule(13);
            this.f26612w.getLayout().addView((View) this.f26613x, this.I);
            this.f23539j = ((View) this.f26613x).findViewById(R.id.ia_click_overlay);
            this.F.a(this.H);
            this.A = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (((r2 == null || (r2 = r2.E) == null || !android.text.TextUtils.equals(r2, "1")) ? false : true) != false) goto L52;
     */
    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r6) throws org.json.JSONException {
        /*
            r5 = this;
            r5.e(r6)
            com.fyber.inneractive.sdk.player.controller.b r6 = r5.f26614y
            r0 = 0
            if (r6 == 0) goto Lf
            com.fyber.inneractive.sdk.player.controller.z r6 = (com.fyber.inneractive.sdk.player.controller.z) r6
            com.fyber.inneractive.sdk.flow.endcard.k r6 = r6.j()
            goto L10
        Lf:
            r6 = r0
        L10:
            com.fyber.inneractive.sdk.player.ui.m r1 = r5.f26613x
            if (r1 == 0) goto L22
            com.fyber.inneractive.sdk.player.ui.s r1 = (com.fyber.inneractive.sdk.player.ui.s) r1
            android.view.ViewGroup r1 = r1.f26325q
            if (r1 == 0) goto L22
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L22
            goto L9e
        L22:
            boolean r1 = r5.G
            if (r1 != 0) goto L9e
            r1 = 0
            if (r6 == 0) goto L41
            com.fyber.inneractive.sdk.flow.x0 r2 = r6.f23573a
            com.fyber.inneractive.sdk.response.g r2 = r2.f23953d
            if (r2 == 0) goto L3d
            java.lang.String r2 = r2.E
            if (r2 == 0) goto L3d
            java.lang.String r3 = "1"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L3d
            r2 = 1
            goto L3e
        L3d:
            r2 = r1
        L3e:
            if (r2 == 0) goto L41
            goto L9e
        L41:
            if (r6 == 0) goto L48
            com.fyber.inneractive.sdk.flow.endcard.b r6 = r6.a()
            goto L49
        L48:
            r6 = r0
        L49:
            if (r6 == 0) goto L96
            com.fyber.inneractive.sdk.flow.x0 r2 = r6.f23557c
            com.fyber.inneractive.sdk.model.vast.b r2 = r2.f23954e
            com.fyber.inneractive.sdk.model.vast.o r2 = r2.f24075f
            if (r2 == 0) goto L96
            boolean r2 = r2.f24129d
            if (r2 == 0) goto L96
            r5.J = r1
            r5.f23769p = r1
            com.fyber.inneractive.sdk.interfaces.e r2 = r5.f23764k
            if (r2 == 0) goto L62
            r2.disableCloseButton()
        L62:
            com.fyber.inneractive.sdk.util.a r2 = r5.f23774u
            r3 = 0
            r2.f26754d = r3
            r2.f26755e = r3
            r2.f26756f = r3
            r2.f26752b = r1
            java.lang.Runnable r1 = r5.f23765l
            if (r1 == 0) goto L79
            android.os.Handler r2 = com.fyber.inneractive.sdk.util.r.f26804b
            r2.removeCallbacks(r1)
            r5.f23765l = r0
        L79:
            java.lang.Runnable r1 = r5.f23767n
            if (r1 == 0) goto L84
            android.os.Handler r2 = com.fyber.inneractive.sdk.util.r.f26804b
            r2.removeCallbacks(r1)
            r5.f23767n = r0
        L84:
            r5.L()
            com.fyber.inneractive.sdk.renderers.d0 r0 = r5.F
            com.fyber.inneractive.sdk.player.controller.z r0 = r0.f26567a
            r0.a(r6)
            com.fyber.inneractive.sdk.interfaces.e r6 = r5.f26612w
            if (r6 == 0) goto La5
            r6.secondEndCardWasDisplayed()
            return
        L96:
            com.fyber.inneractive.sdk.interfaces.e r6 = r5.f26612w
            if (r6 == 0) goto La5
            r6.destroy()
            return
        L9e:
            com.fyber.inneractive.sdk.interfaces.e r6 = r5.f26612w
            if (r6 == 0) goto La5
            r6.destroy()
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.v.b(boolean):void");
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.external.g gVar) {
        this.D = gVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        Context context;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        R();
        if (this.f26613x.getContext() == null) {
            context = com.fyber.inneractive.sdk.util.o.f26796a;
        } else {
            context = this.f26613x.getContext();
        }
        Context context2 = context;
        com.fyber.inneractive.sdk.flow.x xVar = this.f23531b;
        return a(context2, (xVar == null || (eVar = ((t0) xVar).f23945b) == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).O) == null) ? null : bVar.f24071b, g1Var, gVar, false, null);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z10, Orientation orientation) {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f26612w;
        if (eVar != null) {
            eVar.setActivityOrientation(z10, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(String str, String str2) throws JSONException {
        IAlog.a(IAlog.a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f26612w;
        if (eVar == null || eVar.getLayout() == null || this.f26612w.getLayout().getContext() == null) {
            return;
        }
        if (!this.K) {
            com.fyber.inneractive.sdk.network.b0.a(this.f26612w.getLayout().getContext(), str, str2, this.f23531b);
            this.K = true;
            IAlog.a(IAlog.a(this) + "reporting auto redirect", new Object[0]);
            return;
        }
        IAlog.a(IAlog.a(this) + "redirect already reported for this ad", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final boolean b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.player.controller.b bVar = this.f26614y;
        if (bVar == null) {
            IAlog.f("Unable to register store promo observer - ui controller unavailable", new Object[0]);
            return false;
        }
        return ((com.fyber.inneractive.sdk.player.controller.z) bVar).a(aVar);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var, boolean z10) {
        d0 d0Var;
        if (this.E == UnitDisplayType.INTERSTITIAL) {
            this.G = true;
        }
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26614y;
        if (bVar == null && (d0Var = this.F) != null) {
            bVar = d0Var.f26567a;
        }
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
        com.fyber.inneractive.sdk.flow.endcard.b bVarA = kVarJ != null ? kVarJ.f23574b.a() : null;
        if (bVarA != null) {
            R();
            com.fyber.inneractive.sdk.util.d0 d0VarA = a(bVarA.f23557c.f23950a, str, g1Var, bVarA.g(), false, null);
            if (d0VarA.f26769a != com.fyber.inneractive.sdk.util.g0.FAILED) {
                t0 t0Var = bVarA.f23557c.f23951b;
                String[] strArr = {com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK.toString()};
                com.fyber.inneractive.sdk.player.t tVar = t0Var.f23892i;
                if (tVar != null) {
                    tVar.a("EVENT_TRACKING", strArr);
                }
            }
            return d0VarA;
        }
        return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("No Companion clicked"));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z10) throws JSONException {
        com.fyber.inneractive.sdk.player.t tVar;
        com.fyber.inneractive.sdk.interfaces.e eVar;
        if (z10) {
            com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_SKIP;
            com.fyber.inneractive.sdk.flow.x xVar2 = this.f23531b;
            if (xVar2 != null) {
                t0 t0Var = (t0) xVar2;
                if (t0Var.f23892i != null) {
                    String[] strArr = {xVar.a()};
                    com.fyber.inneractive.sdk.player.t tVar2 = t0Var.f23892i;
                    if (tVar2 != null) {
                        tVar2.a("EVENT_TRACKING", strArr);
                    }
                }
            }
        }
        com.fyber.inneractive.sdk.flow.x xVar3 = this.f23531b;
        if (xVar3 == null || (tVar = ((t0) xVar3).f23892i) == null) {
            return;
        }
        tVar.a("TRACKING_COMPLETED", new String[0]);
        L();
        String[] strArr2 = new String[0];
        com.fyber.inneractive.sdk.player.t tVar3 = ((t0) this.f23531b).f23892i;
        if (tVar3 != null) {
            tVar3.a("TRACKING_COMPLETED", strArr2);
        }
        if (IAConfigManager.O.f23226u.f23394b.a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).a() && z10 && (eVar = this.f26612w) != null) {
            eVar.destroy();
        }
        e(z10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view, String str) {
        if (view != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(c(view), str);
            a(c(view), false, Float.NaN, Float.NaN);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view) {
        a(c(view), false, Float.NaN, Float.NaN);
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long a(long j10) {
        if (this.f23773t) {
            return j10;
        }
        long j11 = 12;
        try {
            j11 = Long.parseLong(IAConfigManager.O.f23226u.f23394b.a("vast_endcard_x_fallback_delay", Long.toString(12L)));
        } catch (Throwable unused) {
        }
        return j11 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.player.controller.b bVar = this.f26614y;
        if (bVar == null) {
            IAlog.f("Unable to unregister store promo observer - ui controller unavailable", new Object[0]);
        } else {
            ((com.fyber.inneractive.sdk.player.controller.z) bVar).b(aVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.observer.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar) {
        if (this.E == UnitDisplayType.INTERSTITIAL) {
            IAlog.a("InneractiveFullscreenVideoAdRenderer: update: StorePromo isClicked: %s", Boolean.valueOf(bVar.f23879b));
            this.G = bVar.f23879b;
        }
    }
}
