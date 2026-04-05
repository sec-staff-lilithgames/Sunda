package com.fyber.inneractive.sdk.flow.endcard.loaders.fmp;

import com.fyber.inneractive.sdk.flow.endcard.j;
import com.fyber.inneractive.sdk.flow.endcard.o;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f23599a;

    /* renamed from: b, reason: collision with root package name */
    public final j f23600b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b f23601c;

    /* renamed from: d, reason: collision with root package name */
    public o f23602d;

    public a(j jVar, x0 x0Var, com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar) {
        this.f23600b = jVar;
        this.f23599a = x0Var;
        this.f23601c = bVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a() {
        com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar = this.f23601c;
        o oVar = this.f23602d;
        bVar.getClass();
        if (oVar != null) {
            IAlog.a("%s : onCompanionLoadSuccess: endcard type: %s", "EndCardLoader", oVar.i());
            bVar.f23585d.a(oVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a(String str) {
        this.f23601c.getClass();
        IAlog.a("%s : onCompanionLoadFailure: error: %s", "EndCardLoader", str);
    }
}
