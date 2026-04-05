package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.g0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2100g0 extends QK {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0X(AbstractC1484Qg abstractC1484Qg);

    public abstract boolean A0Y(AbstractC1484Qg abstractC1484Qg);

    public abstract boolean A0Z(AbstractC1484Qg abstractC1484Qg, int i10, int i11, int i12, int i13);

    public abstract boolean A0a(AbstractC1484Qg abstractC1484Qg, AbstractC1484Qg abstractC1484Qg2, int i10, int i11, int i12, int i13);

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0N(AbstractC1484Qg abstractC1484Qg) {
        return !this.A00 || abstractC1484Qg.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0O(AbstractC1484Qg abstractC1484Qg, QJ qj2, QJ qj3) {
        if (qj2 != null && (qj2.A01 != qj3.A01 || qj2.A03 != qj3.A03)) {
            return A0Z(abstractC1484Qg, qj2.A01, qj2.A03, qj3.A01, qj3.A03);
        }
        return A0X(abstractC1484Qg);
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0P(AbstractC1484Qg abstractC1484Qg, QJ qj2, QJ qj3) {
        int i10 = qj2.A01;
        int oldLeft = qj2.A03;
        View view = abstractC1484Qg.A0H;
        int oldTop = qj3 == null ? view.getLeft() : qj3.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = qj3 == null ? view.getTop() : qj3.A03;
        if (!abstractC1484Qg.A0g() && (i10 != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0Z(abstractC1484Qg, i10, oldLeft, oldTop, top);
        }
        return A0Y(abstractC1484Qg);
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0Q(AbstractC1484Qg abstractC1484Qg, QJ qj2, QJ qj3) {
        if (qj2.A01 != qj3.A01 || qj2.A03 != qj3.A03) {
            return A0Z(abstractC1484Qg, qj2.A01, qj2.A03, qj3.A01, qj3.A03);
        }
        A0U(abstractC1484Qg);
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0R(AbstractC1484Qg abstractC1484Qg, AbstractC1484Qg abstractC1484Qg2, QJ qj2, QJ qj3) {
        int i10;
        int i11;
        int i12 = qj2.A01;
        int i13 = qj2.A03;
        if (abstractC1484Qg2.A0l()) {
            i10 = qj2.A01;
            i11 = qj2.A03;
        } else {
            i10 = qj3.A01;
            i11 = qj3.A03;
        }
        return A0a(abstractC1484Qg, abstractC1484Qg2, i12, i13, i10, i11);
    }

    public final void A0T(AbstractC1484Qg abstractC1484Qg) {
        A0K(abstractC1484Qg);
    }

    public final void A0U(AbstractC1484Qg abstractC1484Qg) {
        A0K(abstractC1484Qg);
    }

    public final void A0V(AbstractC1484Qg abstractC1484Qg) {
        A0K(abstractC1484Qg);
    }

    public final void A0W(AbstractC1484Qg abstractC1484Qg, boolean z10) {
        A0K(abstractC1484Qg);
    }
}
