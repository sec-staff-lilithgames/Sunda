package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q0 extends w {

    /* renamed from: i, reason: collision with root package name */
    public IAmraidWebViewController f23777i;

    public q0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        com.fyber.inneractive.sdk.config.l0 l0Var;
        UnitDisplayType unitDisplayType;
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f23947d;
        if (s0Var == null || (l0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).f23345c) == null || (unitDisplayType = l0Var.f23330b) == null) {
            return false;
        }
        return unitDisplayType.isFullscreenUnit();
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        AdSession adSession;
        if (this.f23924g != null && c()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f23924g;
            v0Var.f26982y = true;
            v0Var.D = false;
            v0Var.f26959b.f23985h.remove(v0Var);
            v0Var.f26966i = null;
            IAlog.a("destroy internalStoreWebpageController", new Object[0]);
            this.f23924g = null;
        }
        IAmraidWebViewController iAmraidWebViewController = this.f23777i;
        if (iAmraidWebViewController != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.I;
            if (eVar != null && (adSession = eVar.f24029a) != null) {
                try {
                    adSession.finish();
                } catch (Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f24029a = null;
                eVar.f24030b = null;
            }
            this.f23777i.e();
            this.f23777i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        IAmraidWebViewController iAmraidWebViewController = this.f23777i;
        return (iAmraidWebViewController == null || iAmraidWebViewController.f26879b == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return false;
    }
}
