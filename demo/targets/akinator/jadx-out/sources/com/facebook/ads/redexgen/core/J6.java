package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class J6 extends AbstractRunnableC1624Vt {
    public final /* synthetic */ C1291Is A00;
    public final /* synthetic */ boolean A01;

    public J6(C1291Is c1291Is, boolean z10) {
        this.A00 = c1291Is;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        AbstractC1667Xm abstractC1667XmA0C = this.A00.A0c.A0C();
        if (abstractC1667XmA0C == null) {
            return;
        }
        abstractC1667XmA0C.setPageDetailsVisible((this.A01 || abstractC1667XmA0C.A0B()) ? false : true);
        abstractC1667XmA0C.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
