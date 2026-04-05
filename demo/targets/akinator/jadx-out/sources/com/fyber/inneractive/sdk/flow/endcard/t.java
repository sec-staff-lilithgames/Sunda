package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t implements com.fyber.inneractive.sdk.web.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a f23623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f23624b;

    public t(u uVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        this.f23624b = uVar;
        this.f23623a = aVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        this.f23624b.f23630h.set(false);
        this.f23624b.f23631i.a(iVar);
        this.f23623a.a();
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.f23624b.f23630h.set(false);
        this.f23624b.f23631i.a(iVar, inneractiveInfrastructureError);
        this.f23623a.a(inneractiveInfrastructureError.description());
    }
}
