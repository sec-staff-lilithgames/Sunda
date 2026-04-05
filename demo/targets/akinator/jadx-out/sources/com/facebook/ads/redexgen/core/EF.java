package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class EF extends AbstractRunnableC1624Vt {
    public final /* synthetic */ E1 A00;

    public EF(E1 e12) {
        this.A00 = e12;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        if (!this.A00.A04) {
            C1559Te c1559Te = this.A00.A0C;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c1559Te.A02(new DY(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.3Q
            });
            this.A00.A08.postDelayed(this, this.A00.A01);
        }
    }
}
