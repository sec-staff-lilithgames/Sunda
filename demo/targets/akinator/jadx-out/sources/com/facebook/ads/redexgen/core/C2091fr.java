package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2091fr extends AbstractRunnableC1611Vg {
    public final /* synthetic */ C2090fq A00;

    public C2091fr(C2090fq c2090fq) {
        this.A00 = c2090fq;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1611Vg
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onLoggingImpression(this.A00.A01.A07());
        }
    }
}
