package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends a {
    public b(j jVar, String str) {
        super(str, jVar, null);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(j jVar, String str) {
        jVar.getClass();
        String str2 = str + "_global_timeout";
        int i10 = j.d(str) ? 30000 : 10000;
        Integer numA = jVar.a(str2);
        return numA != null ? numA.intValue() : i10;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(j jVar, String str) {
        jVar.getClass();
        String strA = j.a(str, "min", "rat");
        "read".equalsIgnoreCase(str);
        Integer numA = jVar.a(strA);
        if (numA != null) {
            return numA.intValue();
        }
        return 5000;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(j jVar, String str) {
        jVar.getClass();
        String strA = j.a(str, "rat_perc");
        int i10 = "read".equalsIgnoreCase(str) ? 15 : 10;
        Integer numA = jVar.a(strA);
        return numA != null ? numA.intValue() : i10;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(j jVar) {
        jVar.getClass();
        Integer numA = jVar.a(j.a("timeout", "threshold"));
        if (numA != null) {
            return numA.intValue();
        }
        return 300;
    }
}
