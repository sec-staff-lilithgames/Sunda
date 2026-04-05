package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class JZ extends AbstractRunnableC1624Vt {
    public final /* synthetic */ JU A00;

    public JZ(JU ju2) {
        this.A00 = ju2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        if (!this.A00.A0e) {
            XP.A0D(1000, this.A00.A0O);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
