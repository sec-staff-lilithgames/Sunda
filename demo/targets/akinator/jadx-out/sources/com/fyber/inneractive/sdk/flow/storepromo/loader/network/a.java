package com.fyber.inneractive.sdk.flow.storepromo.loader.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.c1;
import com.fyber.inneractive.sdk.network.l;
import com.fyber.inneractive.sdk.network.o0;
import com.fyber.inneractive.sdk.network.t0;
import java.util.Map;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends c1 {

    /* renamed from: q, reason: collision with root package name */
    public int f23853q;

    public a(String str, com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.b bVar) {
        super(bVar, str, null);
    }

    @Override // com.fyber.inneractive.sdk.network.c1, com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.a {
        int iA;
        int iA2 = IAConfigManager.O.f23226u.f23394b.a("sp_max_size", 307200, 0);
        this.f23853q = iA2;
        int i11 = iA2 + 10;
        if (lVar != null && (iA = t0.a(lVar.f24240d)) >= 0) {
            i11 = iA;
        }
        long j10 = i11;
        int i12 = this.f23853q;
        if (j10 <= i12) {
            return super.a(lVar, map, i10);
        }
        throw new com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.a(i.a(i12, i11, "The image exceeds the maximal size: ", ", actual size: "));
    }
}
