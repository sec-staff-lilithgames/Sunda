package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t0 extends w {

    /* renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.t f23892i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23893j;

    public t0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(s0Var, rVar);
        this.f23893j = false;
        this.f23945b = gVar;
        this.f23944a = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        com.fyber.inneractive.sdk.config.t0 t0Var;
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f23947d;
        if (s0Var == null || (t0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).f23348f) == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config: %s or mUnitConfig.getVideo is null", IAlog.a(this), this.f23947d);
            return false;
        }
        UnitDisplayType unitDisplayType = t0Var.f23408j;
        return UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) || UnitDisplayType.REWARDED.equals(unitDisplayType) || UnitDisplayType.VERTICAL.equals(unitDisplayType);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        com.fyber.inneractive.sdk.player.n nVar;
        if (this.f23924g != null && c()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f23924g;
            v0Var.f26982y = true;
            v0Var.D = false;
            v0Var.f26959b.f23985h.remove(v0Var);
            v0Var.f26966i = null;
            IAlog.a("destroy internalStoreWebpageController", new Object[0]);
            this.f23924g = null;
        }
        com.fyber.inneractive.sdk.player.t tVar = this.f23892i;
        if (tVar != null) {
            com.fyber.inneractive.sdk.player.b bVar = tVar.f26236a;
            if (bVar != null && (nVar = bVar.f24343b) != null) {
                nVar.f26168i = true;
                IAlog.a("IAMediaPlayerFlowManager: destroy", new Object[0]);
                nVar.a();
                com.fyber.inneractive.sdk.flow.endcard.b bVarA = nVar.f26226t.f23574b.a();
                if (bVarA != null) {
                    bVarA.destroy();
                }
                if (nVar.f26160a != null) {
                    IAlog.a("%s : destroy() : playerController being destroyed", InneractiveMediationDefs.GENDER_FEMALE);
                    nVar.f26160a.a();
                    nVar.f26160a = null;
                }
                nVar.f26171l = null;
                com.fyber.inneractive.sdk.flow.endcard.k kVar = nVar.f26226t;
                if (kVar != null) {
                    com.fyber.inneractive.sdk.flow.endcard.m mVar = kVar.f23574b;
                    Iterator it = mVar.f23609a.iterator();
                    while (it.hasNext()) {
                        ((com.fyber.inneractive.sdk.flow.endcard.b) it.next()).destroy();
                    }
                    mVar.f23609a.clear();
                    mVar.f23610b.clear();
                    mVar.f23611c = -1;
                }
                com.fyber.inneractive.sdk.player.ui.remote.g gVar = nVar.f26227u;
                if (gVar != null) {
                    gVar.f26316a.a();
                }
                com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = nVar.f26228v;
                if (bVar2 != null) {
                    bVar2.f23782a.a();
                    bVar2.a();
                    bVar2.f23786e = null;
                    bVar2.f23789h.clear();
                }
            }
            this.f23892i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return this.f23892i != null;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return true;
    }
}
