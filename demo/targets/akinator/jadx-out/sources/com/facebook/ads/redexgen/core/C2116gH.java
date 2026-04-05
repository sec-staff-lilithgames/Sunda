package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.gH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2116gH extends AbstractC1479Qb {
    public static byte[] A06;
    public static String[] A07 = {"ZeVLivVBnS1aoVlC2PGSN001bhNNVWpd", "UVHNMhASFprendMTBixyPal4p5ABOqh9", "McvoL7vwBcNsRrFgWF8", "NjfWBR2llDufPeBAgLyuBDteRTJCHxSb", "wixo9thO", "Otknv8q9MbYFm1QayK0knTm3Lm4p4QUP", "Dtck5bq60bDmwFSuqNFF3ANsa4oCLChk", "09JoBoJUIjBPlvD9emsVrlLKVUsGd7rc"};
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final int A03(View view, int i10) {
        QO qoA08 = A08();
        if (qoA08 == null || !qoA08.A23()) {
            return 0;
        }
        QP qp2 = (QP) view.getLayoutParams();
        return A0N(qoA08.A0q(view) - qp2.topMargin, qoA08.A0l(view) + qp2.bottomMargin, qoA08.A0i(), qoA08.A0Z() - qoA08.A0f(), i10);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A06 = new byte[]{45, 8, 15, 4, 0, 19, 50, 12, 14, 14, 21, 9, 50, 2, 19, 14, 13, 13, 4, 19, 124, 74, 80, 5, 86, 77, 74, 80, 73, 65, 5, 74, 83, 64, 87, 87, 76, 65, 64, 5, 70, 74, 72, 85, 80, 81, 64, 118, 70, 87, 74, 73, 73, 115, 64, 70, 81, 74, 87, 99, 74, 87, 117, 74, 86, 76, 81, 76, 74, 75, 5, 82, 77, 64, 75, 5, 81, 77, 64, 5, 105, 68, 92, 74, 80, 81, 104, 68, 75, 68, 66, 64, 87, 5, 65, 74, 64, 86, 5, 75, 74, 81, 5, 76, 72, 85, 73, 64, 72, 64, 75, 81, 5, 117, 104, 103, 118, 38, 118, 116, 99, 96, 99, 116, 99, 104, 101, 99, 38, 117, 110, 105, 115, 106, 98, 38, 100, 99, 38, 105, 104, 99, 38, 105, 96, 38, 114, 110, 99, 38, 101, 105, 104, 117, 114, 103, 104, 114, 117, 38, 98, 99, 96, 111, 104, 99, 98, 38, 111, 104, 38, 85, 107, 105, 105, 114, 110, 85, 101, 116, 105, 106, 106, 99, 116, 42, 38, 117, 114, 103, 116, 114, 111, 104, 97, 38, 113, 111, 114, 110, 38, 85, 72, 71, 86, 89};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public int A0O(View view, int i10) {
        QO qoA08 = A08();
        if (qoA08 == null || !qoA08.A22()) {
            return 0;
        }
        QP qp2 = (QP) view.getLayoutParams();
        return A0N(qoA08.A0m(view) - qp2.leftMargin, qoA08.A0p(view) + qp2.rightMargin, qoA08.A0g(), qoA08.A0j() - qoA08.A0h(), i10);
    }

    static {
        A06();
    }

    public C2116gH(Context context) {
        this.A03 = A0J(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        if (this.A02 == null || this.A02.y == 0.0f) {
            return 0;
        }
        return this.A02.y > 0.0f ? 1 : -1;
    }

    private int A01(int i10, int i11) {
        int before = i10 - i11;
        if (i10 * before <= 0) {
            return 0;
        }
        return before;
    }

    private final void A07(QZ qz) {
        PointF pointFA0P = A0P(A07());
        if (pointFA0P == null || (pointFA0P.x == 0.0f && pointFA0P.y == 0.0f)) {
            qz.A03(A07());
            A09();
            return;
        }
        A0B(pointFA0P);
        this.A02 = pointFA0P;
        this.A00 = (int) (pointFA0P.x * 10000.0f);
        this.A01 = (int) (pointFA0P.y * 10000.0f);
        int iA0L = A0L(10000);
        int i10 = (int) (this.A00 * 1.2f);
        int i11 = (int) (this.A01 * 1.2f);
        int time = A07[2].length();
        if (time != 19) {
            throw new RuntimeException();
        }
        A07[1] = "hx3pIt9eJlYI2ywoto5TCaec45lSGfjK";
        int time2 = (int) (iA0L * 1.2f);
        qz.A04(i10, i11, time2, this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1479Qb
    public final void A0G() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1479Qb
    public final void A0H(int i10, int i11, C1481Qd c1481Qd, QZ qz) {
        if (A06() == 0) {
            A09();
            if (A07[2].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[7] = "mtmNmOzcoe2a0U4cnzAn20gs4sdBvWQ8";
            strArr[3] = "eV2w3A07ZjFunHiJvnAZuuNmUx5etHx7";
            return;
        }
        this.A00 = A01(this.A00, i10);
        this.A01 = A01(this.A01, i11);
        if (A07[4].length() != 8) {
            if (this.A00 != 0) {
                return;
            }
        } else {
            String[] strArr2 = A07;
            strArr2[7] = "DcFC9yFlUF16xNqjYqSfoPj4l29Ulhpi";
            strArr2[3] = "h8WgdOPxw0F7hfvsQm1LsAkbSgkBaMel";
            if (this.A00 != 0) {
                return;
            }
        }
        if (this.A01 == 0) {
            A07(qz);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1479Qb
    public void A0I(View view, C1481Qd c1481Qd, QZ qz) {
        int iA0O = A0O(view, A0K());
        int dx2 = A00();
        int iA03 = A03(view, dx2);
        int dy = iA0O * iA0O;
        int dx3 = iA03 * iA03;
        int time = A0M((int) Math.sqrt(dy + dx3));
        if (time > 0) {
            int distance = -iA0O;
            int dy2 = -iA03;
            qz.A04(distance, dy2, time, this.A04);
        }
    }

    public float A0J(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0K() {
        if (this.A02 == null || this.A02.x == 0.0f) {
            return 0;
        }
        return this.A02.x > 0.0f ? 1 : -1;
    }

    public int A0L(int i10) {
        return (int) Math.ceil(Math.abs(i10) * this.A03);
    }

    public final int A0M(int i10) {
        return (int) Math.ceil(A0L(i10) / 0.3356d);
    }

    public final int A0N(int i10, int i11, int i12, int i13, int i14) {
        switch (i14) {
            case -1:
                return i12 - i10;
            case 0:
                int i15 = i12 - i10;
                if (i15 > 0) {
                    return i15;
                }
                int i16 = i13 - i11;
                if (i16 < 0) {
                    return i16;
                }
                return 0;
            case 1:
                return i13 - i11;
            default:
                throw new IllegalArgumentException(A04(113, 93, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
        }
    }

    public PointF A0P(int i10) {
        Object objA08 = A08();
        if (objA08 instanceof InterfaceC1478Qa) {
            return ((InterfaceC1478Qa) objA08).A4y(i10);
        }
        Log.w(A04(0, 20, 26), A04(20, 93, 94) + InterfaceC1478Qa.class.getCanonicalName());
        return null;
    }
}
