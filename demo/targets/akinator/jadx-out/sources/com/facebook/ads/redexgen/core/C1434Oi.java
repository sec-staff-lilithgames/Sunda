package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1434Oi implements R6 {
    public final /* synthetic */ OD A00;

    public C1434Oi(OD od2) {
        this.A00 = od2;
    }

    @Override // com.facebook.ads.redexgen.core.R6
    public final boolean AAA() {
        if (this.A00.A0E.canGoBack()) {
            this.A00.A0E.goBack();
            return true;
        }
        return false;
    }
}
