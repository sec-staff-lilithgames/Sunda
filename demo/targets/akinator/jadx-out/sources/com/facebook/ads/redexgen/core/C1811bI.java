package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1811bI extends AbstractRunnableC1624Vt {
    public final /* synthetic */ C1911cu A00;

    public C1811bI(C1911cu c1911cu) {
        this.A00 = c1911cu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        for (C1545Sq c1545Sq : C1544Sp.A02()) {
            C1544Sp.A0A(this.A00, c1545Sq.A02(), c1545Sq.A00(), c1545Sq.A01(), false);
        }
        C1544Sp.A02().clear();
    }
}
