package com.facebook.ads.redexgen.core;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class YI implements ST {
    public final SQ A00;

    public YI(SQ sq2) {
        this.A00 = sq2;
    }

    @Override // com.facebook.ads.redexgen.core.ST
    public final Map<String, String> A5S() {
        return TQ.A01(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.ST
    public final Map<String, String> A6o() {
        return T5.A02();
    }

    @Override // com.facebook.ads.redexgen.core.ST
    public final String A8D() {
        return T5.A00();
    }

    @Override // com.facebook.ads.redexgen.core.ST
    public final String A8F() {
        return AbstractC1521Rr.A00().A03();
    }

    @Override // com.facebook.ads.redexgen.core.ST
    public final boolean AAL() {
        return WH.A00().A03();
    }
}
