package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.dO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1940dO {
    public static byte[] A09;
    public final E1 A02;
    public final C2166h8 A05;
    public final String A06;
    public final Map<String, String> A07;
    public final boolean A08;
    public final DU A04 = new DU() { // from class: com.facebook.ads.redexgen.X.3o
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C3Z c3z) {
            C2167h9 c2167h9 = new C2167h9(this.A00.A06, c3z.A03(), c3z.A01(), c3z.A02());
            if (c3z.A00() >= 0.05d) {
                c2167h9.A06(c3z.A01());
            }
            C1940dO.A00(this.A00);
            this.A00.A05.A04(c2167h9);
        }
    };
    public final DX A03 = new DX() { // from class: com.facebook.ads.redexgen.X.3n
        public static String[] A01 = {"6BCUDqBTxMKsyDySTDfAgToNrOyTrTD7", "Djf66yrzqq1vnadUmdmWvJcbyzxtAl6k", "tEWjotQxZjNCyKq2vbPJS9KAzb4A3hxJ", "kfWCXMrmmpdmvn7", "tPgONuxPqcgn4e0Z", "11TiM4f61A8Ladhbi7mmvNycAncH9GAZ", "vRuUugy6JKGdIehMZ73GXeup75bhp5n7", "ksJD2q6S6mSNkSfcUAtwhZVbKKRTJPP1"};

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C09033d c09033d) {
            if (this.A00.A08) {
                C1940dO c1940dO = this.A00;
                String[] strArr = A01;
                if (strArr[0].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A01[3] = "Cld5vqCsdzETAPzY9HB959";
                c1940dO.A07();
            }
        }
    };
    public int A01 = 0;
    public int A00 = 0;

    static {
        A04();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-116, -99, -116, -107, -101, -122, -112, -107, -117, -116, -97, 3, 15, -2, 10, 2, -4, 0, 12, 18, 11, 17, -90, -78, -95, -83, -91, -77};
    }

    public C1940dO(E1 e12, String str, boolean z10, Map<String, String> map) {
        this.A06 = str;
        this.A02 = e12;
        this.A07 = map;
        this.A08 = z10;
        this.A05 = new C2166h8(this.A06);
        this.A02.getEventBus().A03(this.A04, this.A03);
    }

    public static /* synthetic */ int A00(C1940dO c1940dO) {
        int i10 = c1940dO.A01;
        c1940dO.A01 = i10 + 1;
        return i10;
    }

    public final Map<String, String> A06() {
        String strA01 = C2166h8.A01(this.A05.A03());
        HashMap map = new HashMap();
        if (this.A07 != null) {
            map.putAll(this.A07);
        }
        if (strA01 == null) {
            strA01 = A02(0, 0, 25);
        }
        map.put(A02(22, 6, 33), strA01);
        map.put(A02(11, 11, 126), String.valueOf(this.A01));
        int i10 = this.A00 + 1;
        this.A00 = i10;
        map.put(A02(0, 11, 8), String.valueOf(i10));
        return map;
    }

    public final void A07() {
        this.A02.getEventBus().A04(this.A04, this.A03);
    }
}
