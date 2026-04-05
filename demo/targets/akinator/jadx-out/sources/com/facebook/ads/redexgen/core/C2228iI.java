package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.iI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2228iI implements InterfaceC1508Re {
    public final /* synthetic */ C7B A00;

    public C2228iI(C7B c7b) {
        this.A00 = c7b;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508Re
    public final void ACM() {
        this.A00.A0C.set(true);
        this.A00.A01.AF4(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508Re
    public final void ACN() {
        this.A00.A01.AF7(this.A00, AdError.CACHE_ERROR);
    }
}
