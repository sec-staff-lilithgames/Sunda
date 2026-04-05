package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class w extends x {

    /* renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.v0 f23924g;

    /* renamed from: h, reason: collision with root package name */
    public final v f23925h;

    public w(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
        this.f23925h = new v(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final com.fyber.inneractive.sdk.web.v0 a() {
        return this.f23924g;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean d() {
        com.fyber.inneractive.sdk.web.v0 v0Var = this.f23924g;
        return v0Var != null && v0Var.f26969l;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void f() {
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.response.e eVar2;
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.O.E;
        if (!hVar.f23983f || (eVar = this.f23945b) == null || !eVar.a() || !hVar.n() || d() || (eVar2 = this.f23945b) == null) {
            return;
        }
        com.fyber.inneractive.sdk.ignite.m mVar = eVar2.H;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        if (mVar != mVar2) {
            IAlog.a("ignite webpage was not loaded yet, stopping the loading process", new Object[0]);
            com.fyber.inneractive.sdk.response.e eVar3 = this.f23945b;
            if (mVar2 == null) {
                eVar3.getClass();
            }
            eVar3.H = mVar2;
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f23924g;
            if (v0Var != null) {
                com.fyber.inneractive.sdk.web.n0 n0Var = v0Var.f26973p;
                if (n0Var != null) {
                    com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(n0Var);
                    v0Var.f26973p = null;
                }
                if (!v0Var.f26982y) {
                    v0Var.f26958a.stopLoading();
                }
                this.f23925h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_LOAD_WEBPAGE, this.f23924g.f26968k, com.fyber.inneractive.sdk.ignite.j.WEBPAGE_NOT_LOADED_BEFORE_SHOW.a(), this.f23945b.H);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void a(String str) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        com.fyber.inneractive.sdk.response.e eVar2 = this.f23945b;
        if (eVar2 != null) {
            com.fyber.inneractive.sdk.ignite.m mVar3 = eVar2.H;
            mVar3.getClass();
            mVar = com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
            if (mVar3 != mVar) {
                com.fyber.inneractive.sdk.ignite.m mVar4 = this.f23945b.H;
                mVar4.getClass();
                if (mVar4 != com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP || isVideoAd()) {
                    mVar = this.f23945b.H;
                } else {
                    this.f23925h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_MODE_NOT_COMPATIBLE, null, null, null);
                }
            }
        } else {
            mVar = mVar2;
        }
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.O.E;
        if (!hVar.f23983f || (eVar = this.f23945b) == null || !eVar.a() || !hVar.n()) {
            com.fyber.inneractive.sdk.response.e eVar3 = this.f23945b;
            if (eVar3 != null) {
                eVar3.H = mVar2;
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.response.e eVar4 = this.f23945b;
        String str2 = eVar4 != null ? eVar4.A : null;
        com.fyber.inneractive.sdk.web.w0 w0Var = new com.fyber.inneractive.sdk.web.w0();
        w0Var.f26985a = str2;
        w0Var.f26986b = mVar;
        w0Var.f26987c = str;
        w0Var.f26988d = this.f23946c;
        w0Var.f26989e = eVar4 != null ? eVar4.G : null;
        w0Var.f26990f = eVar4 != null ? eVar4.I : null;
        w0Var.f26991g = this.f23925h;
        com.fyber.inneractive.sdk.web.v0 v0Var = new com.fyber.inneractive.sdk.web.v0(w0Var);
        this.f23924g = v0Var;
        com.fyber.inneractive.sdk.config.global.features.q qVar = (com.fyber.inneractive.sdk.config.global.features.q) this.f23946c.a(com.fyber.inneractive.sdk.config.global.features.q.class);
        if (qVar == null || str2 == null) {
            return;
        }
        String strA = qVar.a("detail_url", "https://cdn2.inner-active.mobi/app-detail-page-v0/[BUNDLE_ID].html");
        v0Var.e(strA == null ? "" : strA.replace("[BUNDLE_ID]", str2));
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean a(boolean z10, com.fyber.inneractive.sdk.util.g gVar) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.response.e eVar = this.f23945b;
        if (eVar != null) {
            mVar = eVar.H;
        } else {
            mVar = com.fyber.inneractive.sdk.ignite.m.NONE;
        }
        if (z10 || mVar == null || mVar != com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP) {
            return false;
        }
        return gVar == com.fyber.inneractive.sdk.util.g.VIDEO_CTA || gVar == com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD;
    }
}
