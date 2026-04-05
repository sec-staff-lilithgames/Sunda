package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class D7 extends AbstractC1560Tf<C3Q> {
    public final /* synthetic */ D6 A00;

    public D7(D6 d62) {
        this.A00 = d62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C3Q c3q) {
        if (this.A00.A00 == null) {
            return;
        }
        this.A00.setText(this.A00.A02(this.A00.A00.getDuration() - this.A00.A00.getCurrentPositionInMillis()));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
    public final Class<C3Q> A01() {
        return C3Q.class;
    }
}
