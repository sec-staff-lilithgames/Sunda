package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.hP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2182hP extends AbstractRunnableC1624Vt {
    public final /* synthetic */ C2238iS A00;
    public final /* synthetic */ NU A01;
    public final /* synthetic */ C10026y A02;

    public C2182hP(C10026y c10026y, NU nu2, C2238iS c2238iS) {
        this.A02 = c10026y;
        this.A01 = nu2;
        this.A00 = c2238iS;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        V1 v1A00 = V1.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5Y(v1A00.A03().getErrorCode(), v1A00.A04());
        this.A02.A07.A0G(v1A00);
    }
}
