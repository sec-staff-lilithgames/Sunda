package com.facebook.ads.redexgen.core;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Qb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1479Qb {
    public static byte[] A07;
    public View A01;
    public QO A02;
    public C09846g A03;
    public boolean A04;
    public boolean A05;
    public int A00 = -1;
    public final QZ A06 = new QZ(0, 0);

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{106, 77, 85, 66, 79, 74, 71, 3, 87, 66, 81, 68, 70, 87, 3, 83, 76, 80, 74, 87, 74, 76, 77, 5, 52, 38, 38, 48, 49, 117, 58, 35, 48, 39, 117, 33, 52, 39, 50, 48, 33, 117, 37, 58, 38, 60, 33, 60, 58, 59, 117, 34, 61, 60, 57, 48, 117, 38, 56, 58, 58, 33, 61, 117, 38, 54, 39, 58, 57, 57, 60, 59, 50, 123, 123, 76, 74, 80, 74, 69, 76, 91, AbstractJsonLexerKt.TC_INVALID, 64, 76, 94};
    }

    public abstract void A0G();

    public abstract void A0H(int i10, int i11, C1481Qd c1481Qd, QZ qz);

    public abstract void A0I(View view, C1481Qd c1481Qd, QZ qz);

    private final int A00(View view) {
        return this.A03.A1B(view);
    }

    private final View A01(int i10) {
        return this.A03.A06.A1o(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i10, int i11) {
        C09846g c09846g = this.A03;
        if (!this.A05 || this.A00 == -1 || c09846g == null) {
            A09();
        }
        this.A04 = false;
        if (this.A01 != null) {
            if (A00(this.A01) == this.A00) {
                A0I(this.A01, c09846g.A0s, this.A06);
                this.A06.A05(c09846g);
                A09();
            } else {
                Log.e(A02(74, 12, 61), A02(23, 51, 65));
                this.A01 = null;
            }
        }
        if (this.A05) {
            A0H(i10, i11, c09846g.A0s, this.A06);
            boolean hadJumpTarget = this.A06.A06();
            this.A06.A05(c09846g);
            if (hadJumpTarget) {
                if (this.A05) {
                    this.A04 = true;
                    c09846g.A08.A07();
                } else {
                    A09();
                }
            }
        }
    }

    public final int A06() {
        return this.A03.A06.A0Y();
    }

    public final int A07() {
        return this.A00;
    }

    public final QO A08() {
        return this.A02;
    }

    public final void A09() {
        if (!this.A05) {
            return;
        }
        A0G();
        this.A03.A0s.A0F = -1;
        this.A01 = null;
        this.A00 = -1;
        this.A04 = false;
        this.A05 = false;
        this.A02.A0O(this);
        this.A02 = null;
        this.A03 = null;
    }

    public final void A0A(int i10) {
        this.A00 = i10;
    }

    public final void A0B(PointF pointF) {
        float fSqrt = (float) Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
        float magnitude = pointF.x;
        pointF.x = magnitude / fSqrt;
        float magnitude2 = pointF.y;
        pointF.y = magnitude2 / fSqrt;
    }

    public final void A0C(View view) {
        if (A00(view) == A07()) {
            this.A01 = view;
        }
    }

    public final void A0D(C09846g c09846g, QO qo2) {
        this.A03 = c09846g;
        this.A02 = qo2;
        if (this.A00 != -1) {
            this.A03.A0s.A0F = this.A00;
            this.A05 = true;
            this.A04 = true;
            this.A01 = A01(A07());
            this.A03.A08.A07();
            return;
        }
        throw new IllegalArgumentException(A02(0, 23, 55));
    }

    public final boolean A0E() {
        return this.A04;
    }

    public final boolean A0F() {
        return this.A05;
    }
}
