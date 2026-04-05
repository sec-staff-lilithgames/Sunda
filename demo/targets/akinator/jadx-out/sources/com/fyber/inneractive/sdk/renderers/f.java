package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends d0 {
    public f(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        if (this.f26568b == null) {
            this.f26568b = new com.fyber.inneractive.sdk.player.ui.i(context, new com.fyber.inneractive.sdk.player.ui.f(), this.f26569c, rVar, a());
        }
        return this.f26568b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final void b() {
        this.f26569c.getClass();
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var) {
        if (this.f26567a == null) {
            Object selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f26567a = new com.fyber.inneractive.sdk.player.controller.g(this.f26569c, this.f26568b, inneractiveAdSpot.getAdContent().f23947d, t0Var.f23946c, selectedUnitController instanceof u0 ? ((u0) selectedUnitController).isOverlayOutside() : false, IAConfigManager.O.f23216k || t0Var.f23949f, a());
        }
        return this.f26567a;
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final void a(com.fyber.inneractive.sdk.player.e eVar) {
        this.f26569c.getClass();
        eVar.a();
    }
}
