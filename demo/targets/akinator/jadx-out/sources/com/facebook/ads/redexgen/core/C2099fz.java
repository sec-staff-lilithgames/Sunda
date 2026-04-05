package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2099fz extends QT {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC2098fy A01;

    public C2099fz(AbstractC2098fy abstractC2098fy) {
        this.A01 = abstractC2098fy;
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void A0L(C09846g c09846g, int i10) {
        super.A0L(c09846g, i10);
        if (i10 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void A0M(C09846g c09846g, int i10, int i11) {
        if (i10 != 0 || i11 != 0) {
            this.A00 = true;
        }
    }
}
