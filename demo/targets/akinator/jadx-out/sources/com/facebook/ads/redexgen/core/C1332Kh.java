package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Kh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1332Kh {
    public static byte[] A02;
    public static String[] A03 = {"5V45xVrzlJXesqnrbjrZeT76qkPwv", "706Txtts1K7q5FoHp33PEv9HaNMSsjAK", "qupHUySH2p9zJgxISfihn0myWA92wmd9", "5DvGIEuDVuIxxSW2dLmZtZYg2a6kN8VU", "n2fidlshYBQzN55WQs4Vi6", "kTscsm2f8c9DflsdA4bvXVbGUagx", "", "mbeoGjxKtAefmgmFA563kx"};
    public final List<C2614or> A00;
    public final H1[] A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[5].length() == 31) {
                throw new RuntimeException();
            }
            A03[0] = "BUpOOmvQBkZMcHt4Z";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 6);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-114, -77, -69, -90, -79, -82, -87, 101, -88, -79, -76, -72, -86, -87, 101, -88, -90, -75, -71, -82, -76, -77, 101, -78, -82, -78, -86, 101, -71, -66, -75, -86, 101, -75, -73, -76, -69, -82, -87, -86, -87, AbstractJsonLexerKt.TC_INVALID, 101, -38, -23, -23, -27, -30, -36, -38, -19, -30, -24, -25, -88, -36, -34, -38, -90, -81, -87, -79, -116, -101, -101, -105, -108, -114, -116, -97, -108, -102, -103, 90, -114, -112, -116, 88, 98, 91, 99};
    }

    static {
        A01();
    }

    public C1332Kh(List<C2614or> list) {
        this.A00 = list;
        this.A01 = new H1[list.size()];
    }

    public final void A02(long j10, C4J c4j) {
        if (c4j.A07() < 9) {
            return;
        }
        int userDataIdentifier = c4j.A0C();
        int iA0C = c4j.A0C();
        int iA0I = c4j.A0I();
        if (userDataIdentifier == 434) {
            int userDataIdentifier2 = A03[3].charAt(2);
            if (userDataIdentifier2 != 118) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "5ag0VzOfRdhx9UNauvnxAz";
            strArr[4] = "f0o3UWjxlhBFesYxHlhgg4";
            if (iA0C == 1195456820 && iA0I == 3) {
                GR.A04(j10, c4j, this.A01);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(com.facebook.ads.redexgen.core.GY r10, com.facebook.ads.redexgen.core.C1329Ke r11) {
        /*
            r9 = this;
            r3 = 0
        L1:
            com.facebook.ads.redexgen.X.H1[] r0 = r9.A01
            int r0 = r0.length
            if (r3 >= r0) goto L94
            r11.A05()
            int r1 = r11.A03()
            r0 = 3
            com.facebook.ads.redexgen.X.H1 r2 = r10.AJh(r1, r0)
            java.util.List<com.facebook.ads.redexgen.X.or> r0 = r9.A00
            java.lang.Object r4 = r0.get(r3)
            com.facebook.ads.redexgen.X.or r4 = (com.facebook.ads.redexgen.core.C2614or) r4
            java.lang.String r6 = r4.A0W
            r5 = 43
            r1 = 19
            r0 = 115(0x73, float:1.61E-43)
            java.lang.String r0 = A00(r5, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L3c
            r5 = 62
            r1 = 19
            r0 = 37
            java.lang.String r0 = A00(r5, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L92
        L3c:
            r8 = 1
        L3d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r5 = 0
            r1 = 43
            r0 = 63
            java.lang.String r0 = A00(r5, r1, r0)
            java.lang.StringBuilder r0 = r7.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.facebook.ads.redexgen.core.C3M.A09(r8, r0)
            com.facebook.ads.redexgen.X.2D r1 = new com.facebook.ads.redexgen.X.2D
            r1.<init>()
            java.lang.String r0 = r11.A04()
            com.facebook.ads.redexgen.X.2D r0 = r1.A0y(r0)
            com.facebook.ads.redexgen.X.2D r1 = r0.A11(r6)
            int r0 = r4.A0H
            com.facebook.ads.redexgen.X.2D r1 = r1.A0n(r0)
            java.lang.String r0 = r4.A0V
            com.facebook.ads.redexgen.X.2D r1 = r1.A10(r0)
            int r0 = r4.A03
            com.facebook.ads.redexgen.X.2D r1 = r1.A0Z(r0)
            java.util.List<byte[]> r0 = r4.A0X
            com.facebook.ads.redexgen.X.2D r0 = r1.A12(r0)
            com.facebook.ads.redexgen.X.or r0 = r0.A14()
            r2.A6W(r0)
            com.facebook.ads.redexgen.X.H1[] r0 = r9.A01
            r0[r3] = r2
            int r3 = r3 + 1
            goto L1
        L92:
            r8 = 0
            goto L3d
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1332Kh.A03(com.facebook.ads.redexgen.X.GY, com.facebook.ads.redexgen.X.Ke):void");
    }
}
