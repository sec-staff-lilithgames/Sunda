package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.flow.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v extends c {

    /* renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.k f23632h;

    public v(x0 x0Var, com.fyber.inneractive.sdk.model.vast.c cVar, int i10) {
        super(x0Var, cVar, i10);
        this.f23632h = cVar.f24087b;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final n c() {
        return new w(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.c, com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean l() {
        return super.l() && ((w) f()).f23633c != null;
    }
}
