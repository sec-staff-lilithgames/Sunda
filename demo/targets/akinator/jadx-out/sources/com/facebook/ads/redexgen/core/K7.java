package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class K7 {
    public static byte[] A04;
    public static String[] A05 = {"Tlnn5cKjLaIjRpnStB3TtMXpCr", "3ektkjDKhO", "UADsPGxQMgbdHUVZTw2T7TudB6ybNpUs", "wMkteQxfp4DsqI2DXiVAWfh1RT3", "vTGkM2prP14EX1TDx6P9XqiD0Fmww", "sal8paYv5RRrD9uY6TWNX8GISo", "qTpYd1bjPJIA7eigqjtgMToqdlzi", "UsOSpCey7qyyyJdYXs2GK2q4qSEth0kx"};
    public final int A00;
    public final String A01;
    public final String A02;
    public final Set<String> A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{2, 73, 59};
        if (A05[2].charAt(0) == 'K') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[6] = "WMYi1W8Xbtf0WzjxHgJrZE6ARrtq";
        strArr[1] = "r4jVis15Qe";
    }

    static {
        A03();
    }

    public K7(String str, int i10, String str2, Set<String> classes) {
        this.A00 = i10;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = classes;
    }

    public static K7 A00() {
        Set setEmptySet = Collections.emptySet();
        String strA02 = A02(0, 0, 5);
        return new K7(strA02, 0, strA02, setEmptySet);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0039 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.K7 A01(java.lang.String r5, int r6) {
        /*
            java.lang.String r4 = r5.trim()
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            com.facebook.ads.redexgen.core.C3M.A07(r0)
            r2 = 0
            r1 = 1
            r0 = 24
            java.lang.String r0 = A02(r2, r1, r0)
            int r1 = r4.indexOf(r0)
            r0 = -1
            r3 = 0
            if (r1 != r0) goto L43
            r2 = 0
            r1 = 0
            r0 = 5
            java.lang.String r5 = A02(r2, r1, r0)
        L24:
            r2 = 1
            r1 = 2
            r0 = 47
            java.lang.String r0 = A02(r2, r1, r0)
            java.lang.String[] r4 = com.facebook.ads.redexgen.core.AbstractC09264a.A1O(r4, r0)
            r3 = r4[r3]
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1 = 1
        L38:
            int r0 = r4.length
            if (r1 >= r0) goto L50
            r0 = r4[r1]
            r2.add(r0)
            int r1 = r1 + 1
            goto L38
        L43:
            java.lang.String r0 = r4.substring(r1)
            java.lang.String r5 = r0.trim()
            java.lang.String r4 = r4.substring(r3, r1)
            goto L24
        L50:
            com.facebook.ads.redexgen.X.K7 r0 = new com.facebook.ads.redexgen.X.K7
            r0.<init>(r3, r6, r5, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.K7.A01(java.lang.String, int):com.facebook.ads.redexgen.X.K7");
    }
}
