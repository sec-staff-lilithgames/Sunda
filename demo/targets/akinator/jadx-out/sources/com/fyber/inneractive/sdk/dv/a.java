package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.flow.x;
import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a extends x {

    /* renamed from: g, reason: collision with root package name */
    public c f23428g;

    /* renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.banner.c f23429h;

    /* renamed from: i, reason: collision with root package name */
    public Object f23430i;

    public a(s0 s0Var, r rVar, i iVar) {
        super(s0Var, rVar);
        this.f23945b = iVar;
    }

    public abstract void a(AdRequest adRequest, c cVar);

    @Override // com.fyber.inneractive.sdk.flow.x
    public final com.fyber.inneractive.sdk.response.e b() {
        return (i) this.f23945b;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        this.f23428g = null;
        this.f23430i = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return false;
    }
}
