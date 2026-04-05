package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public class QV {
    public SparseArray<QU> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j10, long j11) {
        if (j10 == 0) {
            return j11;
        }
        return ((j10 / 4) * 3) + (j11 / 4);
    }

    private QU A01(int i10) {
        QU qu2 = this.A00.get(i10);
        if (qu2 == null) {
            QU qu3 = new QU();
            this.A00.put(i10, qu3);
            return qu3;
        }
        return qu2;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02() {
        /*
            r2 = this;
            r1 = 0
        L1:
            android.util.SparseArray<com.facebook.ads.redexgen.X.QU> r0 = r2.A00
            int r0 = r0.size()
            if (r1 >= r0) goto L19
            android.util.SparseArray<com.facebook.ads.redexgen.X.QU> r0 = r2.A00
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.QU r0 = (com.facebook.ads.redexgen.core.QU) r0
            java.util.ArrayList<com.facebook.ads.redexgen.X.Qg> r0 = r0.A03
            r0.clear()
            int r1 = r1 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.QV.A02():void");
    }

    public final AbstractC1484Qg A03(int i10) {
        QU qu2 = this.A00.get(i10);
        if (qu2 != null && !qu2.A03.isEmpty()) {
            return qu2.A03.remove(r1.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i10, long j10) {
        QU quA01 = A01(i10);
        quA01.A01 = A00(quA01.A01, j10);
    }

    public final void A06(int i10, long j10) {
        QU quA01 = A01(i10);
        quA01.A02 = A00(quA01.A02, j10);
    }

    public final void A07(QC qc2) {
        this.A01++;
    }

    public final void A08(QC qc2, QC qc3, boolean z10) {
        if (qc2 != null) {
            A04();
        }
        if (!z10 && this.A01 == 0) {
            A02();
        }
        if (qc3 != null) {
            A07(qc3);
        }
    }

    public final void A09(AbstractC1484Qg abstractC1484Qg) {
        int iA0N = abstractC1484Qg.A0N();
        ArrayList<AbstractC1484Qg> arrayList = A01(iA0N).A03;
        int i10 = this.A00.get(iA0N).A00;
        int viewType = arrayList.size();
        if (i10 <= viewType) {
            return;
        }
        abstractC1484Qg.A0W();
        arrayList.add(abstractC1484Qg);
    }

    public final boolean A0A(int i10, long j10, long j11) {
        long j12 = A01(i10).A01;
        return j12 == 0 || j10 + j12 < j11;
    }

    public final boolean A0B(int i10, long j10, long j11) {
        long j12 = A01(i10).A02;
        return j12 == 0 || j10 + j12 < j11;
    }
}
