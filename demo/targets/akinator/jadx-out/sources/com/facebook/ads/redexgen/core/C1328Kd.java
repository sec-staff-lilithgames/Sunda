package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1328Kd extends AbstractRunnableC1624Vt {
    public final /* synthetic */ C1719Zm A00;

    public C1328Kd(C1719Zm c1719Zm) {
        this.A00 = c1719Zm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A00.A03();
        if (!this.A00.A08) {
            return;
        }
        this.A00.A0D.postDelayed(this.A00.A0F, 250L);
    }
}
