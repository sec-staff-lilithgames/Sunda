package com.fyber.inneractive.sdk.cache.session;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        if (gVar == null || gVar2 == null) {
            return 0;
        }
        return gVar.f23157d < gVar2.f23157d ? -1 : 1;
    }
}
