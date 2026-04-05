package com.facebook.ads.redexgen.core;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Uz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1605Uz {
    public final InterfaceC1603Ux A0B;
    public final boolean A0F;
    public final String A0C = C1605Uz.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<C1604Uy> A0D = new LinkedList();

    public C1605Uz(SQ sq2, InterfaceC1603Ux interfaceC1603Ux) {
        int nativeViewabilityHistorySamplingRate = U9.A0D(sq2);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = sq2.A09().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = interfaceC1603Ux;
    }

    private int A00() {
        return this.A0B.A7V();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(C1604Uy c1604Uy) {
        synchronized (this.A0D) {
            this.A0D.add(c1604Uy);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new C1604Uy(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new C1604Uy(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new C1604Uy(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new C1604Uy(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new C1604Uy(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new C1604Uy(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new C1604Uy(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new C1604Uy(A01(), 102, A00(), null));
    }

    public final void A0C(SQ sq2, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new C1604Uy(A01(), 103, A00(), null));
        XU.A06.execute(new RunnableC1602Uw(this, str, sq2));
    }
}
