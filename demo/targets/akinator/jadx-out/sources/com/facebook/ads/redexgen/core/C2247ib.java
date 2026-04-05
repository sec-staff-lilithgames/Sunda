package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2247ib extends AbstractRunnableC1624Vt {
    public final /* synthetic */ C2245iZ A00;
    public final /* synthetic */ C5G A01;

    public C2247ib(C2245iZ c2245iZ, C5G c5g) {
        this.A00 = c2245iZ;
        this.A01 = c5g;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A00.A00.A0A();
        if (this.A00.A00.A0C != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0C);
            this.A00.A00.A0C.A0U();
        }
    }
}
