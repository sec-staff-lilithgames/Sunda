package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.hi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2199hi implements InterfaceC1508Re {
    public final /* synthetic */ AbstractC2212hy A00;
    public final /* synthetic */ NG A01;
    public final /* synthetic */ NH A02;
    public final /* synthetic */ C1937dL A03;
    public final /* synthetic */ boolean A04;

    public C2199hi(NH nh2, C1937dL c1937dL, boolean z10, AbstractC2212hy abstractC2212hy, NG ng2) {
        this.A02 = nh2;
        this.A03 = c1937dL;
        this.A04 = z10;
        this.A00 = abstractC2212hy;
        this.A01 = ng2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508Re
    public final void ACM() {
        if (U7.A1l(this.A03) && this.A04) {
            this.A02.A02.add(AbstractC1849bu.A01(this.A03, this.A00, 1, new C2200hj(this)));
        } else {
            this.A01.ACG();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508Re
    public final void ACN() {
        this.A01.ACF(AdError.CACHE_ERROR);
    }
}
