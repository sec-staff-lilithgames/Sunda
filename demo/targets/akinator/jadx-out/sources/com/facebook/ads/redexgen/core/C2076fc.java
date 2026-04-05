package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2076fc extends AbstractRunnableC1611Vg {
    public final /* synthetic */ C2075fb A00;

    public C2076fc(C2075fb c2075fb) {
        this.A00 = c2075fb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1611Vg
    public final void A01() {
        if (this.A00.A01.A00.A00() != null) {
            this.A00.A01.A00.A00().onAdsLoaded();
        }
    }
}
