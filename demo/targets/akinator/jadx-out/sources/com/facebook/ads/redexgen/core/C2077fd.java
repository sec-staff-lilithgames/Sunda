package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2077fd extends AbstractRunnableC1611Vg {
    public final /* synthetic */ C2074fa A00;
    public final /* synthetic */ V1 A01;

    public C2077fd(C2074fa c2074fa, V1 v12) {
        this.A00 = c2074fa;
        this.A01 = v12;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1611Vg
    public final void A01() {
        if (this.A00.A00.A00() != null) {
            this.A00.A00.A00().onAdError(WT.A00(this.A01));
        }
    }
}
