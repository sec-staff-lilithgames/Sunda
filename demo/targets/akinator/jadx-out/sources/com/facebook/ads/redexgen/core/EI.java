package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class EI extends AbstractRunnableC1624Vt {
    public final /* synthetic */ EG A00;

    public EI(EG eg2) {
        this.A00 = eg2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A00.A03.A07();
        this.A00.A04.getEventBus().A04(this.A00.A06, this.A00.A05);
    }
}
