package com.facebook.ads.redexgen.core;

import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.hF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2173hF extends AbstractRunnableC1611Vg {
    public final /* synthetic */ Message A00;
    public final /* synthetic */ AbstractC2171hD A01;

    public C2173hF(AbstractC2171hD abstractC2171hD, Message message) {
        this.A01 = abstractC2171hD;
        this.A00 = message;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1611Vg
    public final void A01() {
        this.A01.A05.A9b(this.A00);
    }
}
