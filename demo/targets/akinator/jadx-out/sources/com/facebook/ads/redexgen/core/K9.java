package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class K9 extends AbstractRunnableC1624Vt {
    public final /* synthetic */ AbstractC1742aB A00;

    public K9(AbstractC1742aB abstractC1742aB) {
        this.A00 = abstractC1742aB;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        if (!this.A00.isPressed()) {
            this.A00.setPressed(true);
            this.A00.postOnAnimationDelayed(this.A00.A0A, 250L);
        } else {
            this.A00.postDelayed(this, this.A00.A08);
        }
    }
}
