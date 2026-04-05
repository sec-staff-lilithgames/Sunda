package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.z f26567a;

    /* renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.s f26568b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.n f26569c;

    public d0(com.fyber.inneractive.sdk.player.t tVar) {
        this.f26569c = (com.fyber.inneractive.sdk.player.n) tVar.f26241f;
    }

    public abstract com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var);

    public abstract com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar);

    public String a() {
        t0 t0Var;
        com.fyber.inneractive.sdk.player.n nVar = this.f26569c;
        com.fyber.inneractive.sdk.response.e eVar = (nVar == null || (t0Var = nVar.f26161b) == null) ? null : t0Var.f23945b;
        if (eVar != null) {
            return eVar.F;
        }
        return null;
    }

    public abstract void a(com.fyber.inneractive.sdk.player.e eVar);

    public abstract void b();
}
