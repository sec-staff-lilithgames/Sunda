package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.iM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2232iM implements S7 {
    public final /* synthetic */ C7B A00;

    public C2232iM(C7B c7b) {
        this.A00 = c7b;
    }

    private void A00(boolean z10) {
        if (!z10) {
            this.A00.A01.AF7(this.A00, AdError.CACHE_ERROR);
        } else {
            this.A00.A0C.set(true);
            this.A00.A01.AF4(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACh() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACq() {
        A00(true);
    }
}
