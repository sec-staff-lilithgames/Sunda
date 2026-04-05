package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2072fY extends AbstractRunnableC1624Vt {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ RS A01;
    public final /* synthetic */ C1480Qc A02;

    public C2072fY(RS rs, C1480Qc c1480Qc, Drawable drawable) {
        this.A01 = rs;
        this.A02 = c1480Qc;
        this.A00 = drawable;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        this.A02.A1K(this.A00);
    }
}
