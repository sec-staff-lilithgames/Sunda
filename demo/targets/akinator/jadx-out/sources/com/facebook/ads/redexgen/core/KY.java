package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class KY {
    public static byte[] A09;
    public static String[] A0A = {"YKrx4tQL3HFlbX0m6cI7YSMmMtJDnVWt", "EhNKRydGslBNjHwz4Qke8RkUgCBaonuc", "lVt1vjccWtobRJMyEDSjQomkweVugX5V", "X5vaF2wJa8umjlLI", "q53FR06vPOBUDZ08SG0Q3HmIsvEwqM01", "eDYPuZuNQVkkkUOb40HZTr2GxKWyUyQ4", "7DZ3geXrHcZNODb56yin0lXQD6ovjT1O", "oKDHpDD8v386AT9biWd"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C4R A08 = new C4R(0);
    public long A01 = C.TIME_UNSET;
    public long A02 = C.TIME_UNSET;
    public long A00 = C.TIME_UNSET;
    public final C4J A07 = new C4J();

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{-89, -103, -50, -20, -30, -25, -32, -103, -51, -62, -58, -66, -40, -50, -57, -52, -66, -51, -103, -30, -25, -20, -19, -34, -38, -35, -89, -119, -82, -74, -95, -84, -87, -92, 96, -92, -75, -78, -95, -76, -87, -81, -82, 122, 96, -95, -64, -111, -62, -65, -82, -63, -74, -68, -69, -97, -78, -82, -79, -78, -65};
    }

    static {
        A06();
    }

    public KY(int i10) {
        this.A06 = i10;
    }

    private int A00(InterfaceC2403lN interfaceC2403lN) {
        this.A07.A0i(AbstractC09264a.A07);
        this.A03 = true;
        interfaceC2403lN.AI1();
        return 0;
    }

    private int A01(InterfaceC2403lN interfaceC2403lN, C1241Gt c1241Gt, int i10) throws IOException {
        int iMin = (int) Math.min(this.A06, interfaceC2403lN.A8G());
        if (interfaceC2403lN.A8f() != 0) {
            c1241Gt.A00 = 0;
            return 1;
        }
        this.A07.A0d(iMin);
        interfaceC2403lN.AI1();
        interfaceC2403lN.AG9(this.A07.A0l(), 0, iMin);
        this.A01 = A03(this.A07, i10);
        this.A04 = true;
        return 0;
    }

    private int A02(InterfaceC2403lN interfaceC2403lN, C1241Gt c1241Gt, int i10) throws IOException {
        long inputLength = interfaceC2403lN.A8G();
        int iMin = (int) Math.min(this.A06, inputLength);
        long inputLength2 = inputLength - iMin;
        if (interfaceC2403lN.A8f() != inputLength2) {
            c1241Gt.A00 = inputLength2;
            return 1;
        }
        this.A07.A0d(iMin);
        interfaceC2403lN.AI1();
        interfaceC2403lN.AG9(this.A07.A0l(), 0, iMin);
        this.A02 = A04(this.A07, i10);
        this.A05 = true;
        return 0;
    }

    private long A03(C4J c4j, int i10) {
        int iA0A = c4j.A0A();
        for (int iA09 = c4j.A09(); iA09 < iA0A; iA09++) {
            int searchEndPosition = c4j.A0l()[iA09];
            if (searchEndPosition == 71) {
                long jA01 = AbstractC1331Kg.A01(c4j, iA09, i10);
                if (jA01 != C.TIME_UNSET) {
                    return jA01;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private long A04(C4J c4j, int i10) {
        int iA09 = c4j.A09();
        int iA0A = c4j.A0A();
        for (int i11 = iA0A - 188; i11 >= iA09; i11--) {
            if (AbstractC1331Kg.A03(c4j.A0l(), iA09, iA0A, i11)) {
                long jA01 = AbstractC1331Kg.A01(c4j, i11, i10);
                if (jA01 != C.TIME_UNSET) {
                    return jA01;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public final int A07(InterfaceC2403lN interfaceC2403lN, C1241Gt c1241Gt, int i10) throws IOException {
        if (i10 <= 0) {
            return A00(interfaceC2403lN);
        }
        if (!this.A05) {
            return A02(interfaceC2403lN, c1241Gt, i10);
        }
        if (this.A02 == C.TIME_UNSET) {
            return A00(interfaceC2403lN);
        }
        if (!this.A04) {
            int iA01 = A01(interfaceC2403lN, c1241Gt, i10);
            if (A0A[0].charAt(2) == 'O') {
                throw new RuntimeException();
            }
            A0A[0] = "U4EwafF7WjzJM20D4nSEnM6oLnkPTMDI";
            return iA01;
        }
        if (this.A01 == C.TIME_UNSET) {
            return A00(interfaceC2403lN);
        }
        this.A00 = this.A08.A06(this.A02) - this.A08.A06(this.A01);
        if (this.A00 < 0) {
            AnonymousClass44.A07(A05(45, 16, 60), A05(27, 18, 47) + this.A00 + A05(0, 27, 104));
            this.A00 = C.TIME_UNSET;
        }
        return A00(interfaceC2403lN);
    }

    public final long A08() {
        return this.A00;
    }

    public final C4R A09() {
        return this.A08;
    }

    public final boolean A0A() {
        return this.A03;
    }
}
