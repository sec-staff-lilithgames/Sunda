package com.fyber.inneractive.sdk.cache.session;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends HashMap {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23141a = 25;

    public a() {
        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE) {
                put(cVar, new k(this.f23141a));
            }
        }
    }
}
