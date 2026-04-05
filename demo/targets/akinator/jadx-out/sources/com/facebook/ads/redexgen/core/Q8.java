package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class Q8 {
    public static byte[] A03;
    public int A00;
    public final Rect A01;
    public final QO A02;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-6, -1, 7, -14, -3, -6, -11, -79, 0, 3, -6, -10, -1, 5, -14, 5, -6, 0, -1};
    }

    public abstract int A06();

    public abstract int A07();

    public abstract int A08();

    public abstract int A09();

    public abstract int A0A();

    public abstract int A0B();

    public abstract int A0C(View view);

    public abstract int A0D(View view);

    public abstract int A0E(View view);

    public abstract int A0F(View view);

    public abstract int A0G(View view);

    public abstract int A0H(View view);

    public abstract void A0J(int i10);

    public Q8(QO qo2) {
        this.A00 = Integer.MIN_VALUE;
        this.A01 = new Rect();
        this.A02 = qo2;
    }

    public /* synthetic */ Q8(QO qo2, C2111gC c2111gC) {
        this(qo2);
    }

    public static C2111gC A00(QO qo2) {
        return new C2111gC(qo2);
    }

    public static C2110gB A01(QO qo2) {
        return new C2110gB(qo2);
    }

    public static Q8 A02(QO qo2, int i10) {
        switch (i10) {
            case 0:
                return A00(qo2);
            case 1:
                return A01(qo2);
            default:
                throw new IllegalArgumentException(A03(0, 19, 19));
        }
    }

    public final int A05() {
        if (Integer.MIN_VALUE == this.A00) {
            return 0;
        }
        return A0B() - this.A00;
    }

    public final void A0I() {
        this.A00 = A0B();
    }
}
