package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2087fn extends AbstractRunnableC1624Vt {
    public final /* synthetic */ C2086fm A00;
    public final /* synthetic */ C5G A01;

    public C2087fn(C2086fm c2086fm, C5G c5g) {
        this.A00 = c2086fm;
        this.A01 = c5g;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1B());
        this.A00.A02.A1f(true, true);
    }
}
