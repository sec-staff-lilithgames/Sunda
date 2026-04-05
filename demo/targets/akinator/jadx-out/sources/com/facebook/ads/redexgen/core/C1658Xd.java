package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1658Xd {
    public static C1658Xd A02;
    public final C1438Om A00;
    public final C1660Xf A01;

    public C1658Xd(C1937dL c1937dL, Executor executor, TE te2) {
        this.A01 = new C1660Xf(c1937dL);
        this.A00 = new C1438Om(executor, te2, c1937dL);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1937dL c1937dL, Executor executor, TE te2) {
        if (!U7.A1X(c1937dL)) {
            return;
        }
        if (A02 == null) {
            A02 = new C1658Xd(c1937dL, executor, te2);
            A02.A00();
        } else {
            A02.A02(te2);
        }
    }

    private void A02(TE te2) {
        this.A00.A07(te2);
    }
}
