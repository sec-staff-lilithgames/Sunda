package com.fyber.inneractive.sdk.ignite;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends ua.a {
    public l(Context context, k kVar, com.fyber.inneractive.sdk.ignite.events.wrappers.a aVar, boolean z10, boolean z11, boolean z12, h hVar) {
        l lVar;
        wa.f gVar;
        super(kVar, aVar);
        wa.e eVar = new wa.e(context);
        if (z10 && z11) {
            gVar = new wa.h(new wa.g(eVar, hVar), true, z12, hVar, this);
            lVar = this;
        } else if (z10) {
            lVar = this;
            gVar = new wa.h(eVar, false, z12, hVar, lVar);
        } else {
            lVar = this;
            gVar = z11 ? new wa.g(eVar, hVar) : new wa.i(eVar, hVar);
        }
        lVar.f88175a = gVar;
    }
}
