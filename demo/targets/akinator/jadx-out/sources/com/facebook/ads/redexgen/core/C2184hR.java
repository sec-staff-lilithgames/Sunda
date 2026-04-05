package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2184hR extends AbstractRunnableC1624Vt {
    public final /* synthetic */ AbstractC2183hQ A00;
    public final /* synthetic */ V1 A01;

    public C2184hR(AbstractC2183hQ abstractC2183hQ, V1 v12) {
        this.A00 = abstractC2183hQ;
        this.A01 = v12;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A00.A0B.A0F().A5Y(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
