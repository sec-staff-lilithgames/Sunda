package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.iK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2230iK implements InterfaceC1508Re {
    public final /* synthetic */ C7B A00;
    public final /* synthetic */ boolean A01;

    public C2230iK(C7B c7b, boolean z10) {
        this.A00 = c7b;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508Re
    public final void ACM() {
        if (!U7.A1o(this.A00.A04) || !this.A01) {
            this.A00.A0C.set(true);
            this.A00.A01.AF4(this.A00);
        } else {
            this.A00.A06 = AbstractC1849bu.A01(this.A00.A04, (AnonymousClass73) this.A00.A03, 0, new C2231iL(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508Re
    public final void ACN() {
        this.A00.A01.AF7(this.A00, AdError.CACHE_ERROR);
    }
}
