package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.gJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2118gJ implements QM {
    public static byte[] A04;
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-95, -74, -50, -60, -54, -55, 117, -59, -60, -56, -66, -55, -66, -60, -61, -56, 117, -62, -54, -56, -55, 117, -73, -70, 117, -61, -60, -61, -126, -61, -70, -68, -74, -55, -66, -53, -70, -117, -92, -77, -96, -89, 91, -97, -92, -82, -81, -100, -87, -98, -96, 91, -88, -80, -82, -81, 91, -99, -96, 91, -87, -86, -87, 104, -87, -96, -94, -100, -81, -92, -79, -96};
    }

    public final void A02() {
        if (this.A03 != null) {
            Arrays.fill(this.A03, -1);
        }
        this.A00 = 0;
    }

    public final void A03(int i10, int i11) {
        this.A01 = i10;
        this.A02 = i11;
    }

    public final void A04(C09846g c09846g, boolean z10) {
        this.A00 = 0;
        if (this.A03 != null) {
            Arrays.fill(this.A03, -1);
        }
        QO qo2 = c09846g.A06;
        if (c09846g.A04 != null && qo2 != null && qo2.A1W()) {
            if (z10) {
                if (!c09846g.A00.A0B()) {
                    qo2.A1t(c09846g.A04.A0B(), this);
                }
            } else if (!c09846g.A1r()) {
                qo2.A1s(this.A01, this.A02, c09846g.A0s, this);
            }
            if (this.A00 > qo2.A00) {
                qo2.A00 = this.A00;
                qo2.A08 = z10;
                c09846g.A0r.A0O();
            }
        }
    }

    public final boolean A05(int i10) {
        if (this.A03 != null) {
            int i11 = this.A00 * 2;
            for (int i12 = 0; i12 < i11; i12 += 2) {
                int count = this.A03[i12];
                if (count == i10) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.QM
    public final void A3u(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                int i12 = this.A00 * 2;
                if (this.A03 == null) {
                    this.A03 = new int[4];
                    Arrays.fill(this.A03, -1);
                } else {
                    int storagePosition = this.A03.length;
                    if (i12 >= storagePosition) {
                        int[] iArr = this.A03;
                        int storagePosition2 = i12 * 2;
                        this.A03 = new int[storagePosition2];
                        System.arraycopy(iArr, 0, this.A03, 0, iArr.length);
                    }
                }
                this.A03[i12] = i10;
                int storagePosition3 = i12 + 1;
                this.A03[storagePosition3] = i11;
                int storagePosition4 = this.A00;
                this.A00 = storagePosition4 + 1;
                return;
            }
            throw new IllegalArgumentException(A00(37, 35, 8));
        }
        throw new IllegalArgumentException(A00(0, 37, 34));
    }
}
