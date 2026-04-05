package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Oz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1451Oz extends AbstractRunnableC1624Vt {
    public final /* synthetic */ C1634Wd A00;

    public C1451Oz(C1634Wd c1634Wd) {
        this.A00 = c1634Wd;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        if (!this.A00.A05()) {
            return;
        }
        this.A00.A02();
        this.A00.A05.postDelayed(this, this.A00.A02);
    }
}
