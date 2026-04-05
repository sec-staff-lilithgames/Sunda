package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s extends m {

    /* renamed from: e, reason: collision with root package name */
    public final InneractiveAdRequest f24276e;

    /* renamed from: f, reason: collision with root package name */
    public final q0 f24277f;

    public s(InneractiveAdRequest inneractiveAdRequest, String str, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.flow.o oVar) {
        super(rVar, str, oVar);
        this.f24276e = inneractiveAdRequest;
        q0 q0Var = new q0(new q(this), inneractiveAdRequest, rVar);
        this.f24277f = q0Var;
        q0Var.f24285d = new r(this);
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public final void a() {
        this.f24253b = true;
        this.f24252a = null;
        this.f24277f.f24282a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public final String b() {
        return this.f24277f.r();
    }
}
