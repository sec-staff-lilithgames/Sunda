package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class OI implements ZY {
    public final /* synthetic */ OD A00;

    public OI(OD od2) {
        this.A00 = od2;
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AES(String str) {
        this.A00.A0C.setProgress(100);
        this.A00.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEU(String str) throws SecurityException {
        this.A00.A05 = true;
        this.A00.A0B.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEq(int i10) {
        if (this.A00.A05) {
            this.A00.A0C.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEt(String str) {
        this.A00.A0B.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEw() {
        this.A00.A0A.ACf(14);
    }
}
