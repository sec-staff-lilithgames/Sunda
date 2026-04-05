package com.facebook.ads.redexgen.core;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.ironsource.Hc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public abstract class QK {
    public static byte[] A06;
    public static String[] A07 = {Hc.f34588e, "BOchn05cOqPQPKgaZhD7MWqYHqoCKx7o", "EPTevQXo6AzOyuxFlfcAvx5eJdnVP8", ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, "6fNY9lNhy7nUhuOGP7YDUX6WqdzgNzMN", "SLjIMlZrt8LApw5SyAUFDc4ipDag7tTu", "zXvx6U5xIRhnU3fWG5rnYTWUnq20aSrc", "c4GOdlXhzm3270NA43EFNLoVECdVoF38"};
    public QI A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 109);
            String[] strArr = A07;
            if (strArr[6].charAt(25) == strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            A07[2] = "awpTB9u15TkHVvPjjOCd09Fy8dol99E";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A06 = new byte[]{76, 75, 30, 75, 70, 74, 62, 81, 70, 76, 75, 80, 35, 70, 75, 70, 80, 69, 66, 65};
    }

    public abstract void A0H();

    public abstract void A0I();

    public abstract void A0L(AbstractC1484Qg abstractC1484Qg);

    public abstract boolean A0M();

    public abstract boolean A0N(AbstractC1484Qg abstractC1484Qg);

    public abstract boolean A0O(AbstractC1484Qg abstractC1484Qg, QJ qj2, QJ qj3);

    public abstract boolean A0P(AbstractC1484Qg abstractC1484Qg, QJ qj2, QJ qj3);

    public abstract boolean A0Q(AbstractC1484Qg abstractC1484Qg, QJ qj2, QJ qj3);

    public abstract boolean A0R(AbstractC1484Qg abstractC1484Qg, AbstractC1484Qg abstractC1484Qg2, QJ qj2, QJ qj3);

    static {
        A09();
    }

    public static int A06(AbstractC1484Qg abstractC1484Qg) {
        int i10 = abstractC1484Qg.A0C & 14;
        if (abstractC1484Qg.A0f()) {
            return 4;
        }
        int flags = i10 & 4;
        if (flags == 0) {
            int pos = abstractC1484Qg.A0P();
            int oldPos = abstractC1484Qg.A0M();
            if (pos != -1 && oldPos != -1 && pos != oldPos) {
                return i10 | 2048;
            }
            return i10;
        }
        return i10;
    }

    private final QJ A07() {
        return new QJ();
    }

    public final long A0A() {
        return this.A00;
    }

    public final long A0B() {
        return this.A01;
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D() {
        return this.A03;
    }

    public final QJ A0E(C1481Qd c1481Qd, AbstractC1484Qg abstractC1484Qg) {
        return A07().A01(abstractC1484Qg);
    }

    public final QJ A0F(C1481Qd c1481Qd, AbstractC1484Qg abstractC1484Qg, int i10, List<Object> payloads) {
        return A07().A01(abstractC1484Qg);
    }

    public final void A0G() {
        int count = this.A05.size();
        if (0 < count) {
            this.A05.get(0);
            throw new NullPointerException(A08(0, 20, 112));
        }
        this.A05.clear();
    }

    public final void A0J(QI qi2) {
        this.A04 = qi2;
    }

    public final void A0K(AbstractC1484Qg abstractC1484Qg) {
        if (this.A04 != null) {
            this.A04.ACK(abstractC1484Qg);
        }
    }

    public boolean A0S(AbstractC1484Qg abstractC1484Qg, List<Object> payloads) {
        return A0N(abstractC1484Qg);
    }
}
