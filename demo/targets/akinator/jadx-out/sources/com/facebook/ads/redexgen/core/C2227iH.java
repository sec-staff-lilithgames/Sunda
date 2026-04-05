package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.iH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2227iH implements NP {
    public final /* synthetic */ C7B A00;

    public C2227iH(C7B c7b) {
        this.A00 = c7b;
    }

    @Override // com.facebook.ads.redexgen.core.NP
    public final void AEZ(AdError adError) {
        this.A00.A01.AF7(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.core.NP
    public final void AEa() {
        this.A00.A0C.set(true);
        this.A00.A01.AF4(this.A00);
    }
}
