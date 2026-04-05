package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ii, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2252ii extends AbstractRunnableC1624Vt {
    public final /* synthetic */ MW A00;

    public C2252ii(MW mw2) {
        this.A00 = mw2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A00.A07();
        this.A00.A02.A06();
        this.A00.A05.countDown();
    }
}
