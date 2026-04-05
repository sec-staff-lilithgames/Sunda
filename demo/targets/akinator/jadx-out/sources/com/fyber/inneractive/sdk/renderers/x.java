package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x extends a {
    public x(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final String a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.renderers.a, com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        if (this.f26568b == null) {
            this.f26568b = new com.fyber.inneractive.sdk.player.ui.t(context, new com.fyber.inneractive.sdk.player.ui.h(), rVar);
        }
        return this.f26568b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.a, com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var) {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.f26567a;
        if (zVar != null) {
            return zVar;
        }
        this.f26567a = new com.fyber.inneractive.sdk.player.controller.c0(this.f26569c, (com.fyber.inneractive.sdk.player.ui.t) this.f26568b, com.fyber.inneractive.sdk.config.a.a(inneractiveAdSpot.getAdContent().b().f26643o), t0Var.f23946c);
        return super.a(inneractiveAdSpot, t0Var);
    }
}
