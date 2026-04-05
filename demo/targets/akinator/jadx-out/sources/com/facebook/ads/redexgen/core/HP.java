package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class HP implements InterfaceC1633Wc {
    public final /* synthetic */ C09394n A00;

    public HP(C09394n c09394n) {
        this.A00 = c09394n;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final void ACp() {
        this.A00.A0M.ACy(this.A00.A0C);
        this.A00.A0M.ACZ();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final void AEn(float f10) {
        int i10;
        float totalForce = (this.A00.A0C - f10) + (this.A00.A0a ? 0 : this.A00.A0P.getDuration());
        if (this.A00.A0a) {
            i10 = this.A00.A0C;
        } else {
            i10 = this.A00.A0B;
        }
        float seenTime = i10;
        this.A00.A0M.AJs(totalForce / seenTime);
    }
}
