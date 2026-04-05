package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class QN extends AbstractRunnableC1611Vg {
    public final /* synthetic */ C6I A00;
    public final /* synthetic */ V1 A01;

    public QN(C6I c6i, V1 v12) {
        this.A00 = c6i;
        this.A01 = v12;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1611Vg
    public final void A01() {
        this.A00.A01.onError(this.A00.A00, WT.A00(this.A01));
    }
}
