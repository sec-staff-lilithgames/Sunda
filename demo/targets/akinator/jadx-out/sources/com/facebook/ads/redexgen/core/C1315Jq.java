package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Jq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1315Jq implements InterfaceC1633Wc {
    public final /* synthetic */ C09555d A00;

    public C1315Jq(C09555d c09555d) {
        this.A00 = c09555d;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final void ACp() {
        this.A00.A0B = false;
        if (this.A00.A06 != null) {
            this.A00.A06.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final void AEn(float f10) {
        if (this.A00.A06 != null) {
            this.A00.A06.setProgressImmediate(100.0f * (1.0f - (f10 / this.A00.getAdInfo().A0K().A00())));
        }
    }
}
