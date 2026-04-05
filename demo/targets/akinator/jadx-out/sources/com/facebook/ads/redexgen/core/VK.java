package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class VK extends AbstractRunnableC1624Vt {
    public final /* synthetic */ VJ A00;

    public VK(VJ vj2) {
        this.A00 = vj2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A00.A0C = false;
        if (this.A00.A0B.getQueue().isEmpty()) {
            this.A00.A0B.execute(this.A00.A0A);
        }
    }
}
