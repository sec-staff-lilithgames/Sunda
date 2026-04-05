package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.k6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2336k6 implements J7 {
    public final C1309Jk A00;
    public final Map<String, C1316Jr> A01;
    public final Map<String, String> A02;
    public final Map<String, C1310Jl> A03;
    public final long[] A04;

    public C2336k6(C1309Jk c1309Jk, Map<String, C1316Jr> map, Map<String, C1310Jl> map2, Map<String, String> imageMap) {
        this.A00 = c1309Jk;
        this.A03 = map2;
        this.A02 = imageMap;
        this.A01 = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.A04 = c1309Jk.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final List<C2565o2> A7P(long j10) {
        return this.A00.A0E(j10, this.A01, this.A03, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final long A7v(int i10) {
        return this.A04[i10];
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A7w() {
        return this.A04.length;
    }

    @Override // com.facebook.ads.redexgen.core.J7
    public final int A8S(long j10) {
        int iA0K = AbstractC09264a.A0K(this.A04, j10, false, false);
        int index = this.A04.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
