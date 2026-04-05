package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class QJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final QJ A00(AbstractC1484Qg abstractC1484Qg, int i10) {
        View view = abstractC1484Qg.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final QJ A01(AbstractC1484Qg abstractC1484Qg) {
        return A00(abstractC1484Qg, 0);
    }
}
