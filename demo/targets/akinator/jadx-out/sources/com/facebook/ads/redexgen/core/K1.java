package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class K1 extends AbstractRunnableC1624Vt {
    public final /* synthetic */ AbstractC1742aB A00;

    public K1(AbstractC1742aB abstractC1742aB) {
        this.A00 = abstractC1742aB;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A00.setPressed(false);
        this.A00.postOnAnimationDelayed(this.A00.A09, this.A00.A08);
    }
}
