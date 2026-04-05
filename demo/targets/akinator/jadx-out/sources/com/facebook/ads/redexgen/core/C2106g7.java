package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.g7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2106g7 implements QI {
    public final /* synthetic */ C09846g A00;

    public C2106g7(C09846g c09846g) {
        this.A00 = c09846g;
    }

    @Override // com.facebook.ads.redexgen.core.QI
    public final void ACK(AbstractC1484Qg abstractC1484Qg) {
        abstractC1484Qg.A0d(true);
        if (abstractC1484Qg.A06 != null && abstractC1484Qg.A07 == null) {
            abstractC1484Qg.A06 = null;
        }
        abstractC1484Qg.A07 = null;
        if (!abstractC1484Qg.A0G() && !this.A00.A1x(abstractC1484Qg.A0H) && abstractC1484Qg.A0i()) {
            this.A00.removeDetachedView(abstractC1484Qg.A0H, false);
        }
    }
}
