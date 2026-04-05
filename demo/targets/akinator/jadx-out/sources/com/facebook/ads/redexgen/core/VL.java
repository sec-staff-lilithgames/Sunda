package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class VL extends AbstractRunnableC1624Vt {
    public final /* synthetic */ VJ A00;

    public VL(VJ vj2) {
        this.A00 = vj2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() throws Exception {
        VJ.A00(this.A00);
        if (this.A00.A01 > 0) {
            try {
                Thread.sleep(this.A00.A01);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
