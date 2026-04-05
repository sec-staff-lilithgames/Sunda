package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class LQ implements ZZ {
    public final /* synthetic */ ZO A00;

    public LQ(ZO zo2) {
        this.A00 = zo2;
    }

    @Override // com.facebook.ads.redexgen.core.ZZ
    public final void ACa(boolean z10) {
        this.A00.A0D(z10);
        if (!this.A00.A0C || this.A00.A00 == null) {
            return;
        }
        this.A00.A00.setEnabled(z10);
        this.A00.A00.setAlpha(z10 ? 1.0f : 0.3f);
    }

    @Override // com.facebook.ads.redexgen.core.ZZ
    public final void ADJ(boolean z10) {
        this.A00.A0D(z10);
        if (!this.A00.A0C || this.A00.A02 == null) {
            return;
        }
        this.A00.A02.setEnabled(z10);
        this.A00.A02.setAlpha(z10 ? 1.0f : 0.3f);
    }
}
