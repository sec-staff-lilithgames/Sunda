package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class KU {
    public static byte[] A08;
    public static String[] A09 = {"voRQ6Eoiy", "dM5sUr3BWW4nkGo5nRVfbphD0FkiLgeI", "t4ngtozvUcRON5qFCPMw9NZHviWOcz8N", "2o", "HR4o0SgaegzvmEvMyBsSV3cy", "Fxd3YqblXENYapC", "iFe6DhKEBr1iW4qwRCto7Lk6hMgexe67", "drzzj9o5hc6Li6ZR2JGiBSJ"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C4R A07 = new C4R(0);
    public long A01 = C.TIME_UNSET;
    public long A02 = C.TIME_UNSET;
    public long A00 = C.TIME_UNSET;
    public final C4J A06 = new C4J();

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{-19, -33, 20, 50, 40, 45, 38, -33, 19, 8, 12, 4, 30, 20, 13, 18, 4, 19, -33, 40, 45, 50, 51, 36, 32, 35, -19, 18, 55, Utf8.REPLACEMENT_BYTE, 42, 53, 50, 45, -23, 45, 62, 59, 42, 61, 50, 56, 55, 3, -23, 22, 57, 10, 59, 56, 39, 58, 47, 53, 52, 24, 43, 39, 42, 43, 56};
    }

    static {
        A09();
    }

    private int A00(InterfaceC2403lN interfaceC2403lN) {
        this.A06.A0i(AbstractC09264a.A07);
        this.A03 = true;
        interfaceC2403lN.AI1();
        return 0;
    }

    private int A01(InterfaceC2403lN interfaceC2403lN, C1241Gt c1241Gt) throws IOException {
        int iMin = (int) Math.min(20000L, interfaceC2403lN.A8G());
        if (interfaceC2403lN.A8f() != 0) {
            c1241Gt.A00 = 0;
            return 1;
        }
        C4J c4j = this.A06;
        int bytesToSearch = A09[6].length();
        if (bytesToSearch == 30) {
            throw new RuntimeException();
        }
        A09[6] = "JjjcAHcIe3bphcpehmdhx0lOvmd2";
        c4j.A0d(iMin);
        interfaceC2403lN.AI1();
        interfaceC2403lN.AG9(this.A06.A0l(), 0, iMin);
        this.A01 = A04(this.A06);
        this.A04 = true;
        return 0;
    }

    private int A02(InterfaceC2403lN interfaceC2403lN, C1241Gt c1241Gt) throws IOException {
        long jA8G = interfaceC2403lN.A8G();
        int iMin = (int) Math.min(20000L, jA8G);
        long j10 = jA8G - iMin;
        long searchStartPosition = interfaceC2403lN.A8f();
        if (searchStartPosition != j10) {
            c1241Gt.A00 = j10;
            return 1;
        }
        this.A06.A0d(iMin);
        interfaceC2403lN.AI1();
        interfaceC2403lN.AG9(this.A06.A0l(), 0, iMin);
        long inputLength = A05(this.A06);
        this.A02 = inputLength;
        this.A05 = true;
        return 0;
    }

    private int A03(byte[] bArr, int i10) {
        return ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long A04(com.facebook.ads.redexgen.core.C4J r8) {
        /*
            r7 = this;
            int r6 = r8.A09()
            int r5 = r8.A0A()
        L8:
            int r0 = r5 + (-3)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 >= r0) goto L2e
            byte[] r0 = r8.A0l()
            int r1 = r7.A03(r0, r6)
            r0 = 442(0x1ba, float:6.2E-43)
            if (r1 != r0) goto L2b
            int r0 = r6 + 4
            r8.A0f(r0)
            long r1 = A06(r8)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L2b
            return r1
        L2b:
            int r6 = r6 + 1
            goto L8
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.KU.A04(com.facebook.ads.redexgen.X.4J):long");
    }

    private long A05(C4J c4j) {
        int iA09 = c4j.A09();
        int searchStartPosition = c4j.A0A();
        for (int nextStartCode = searchStartPosition - 4; nextStartCode >= iA09; nextStartCode--) {
            int searchEndPosition = A03(c4j.A0l(), nextStartCode);
            if (searchEndPosition == 442) {
                int searchStartPosition2 = nextStartCode + 4;
                c4j.A0f(searchStartPosition2);
                long jA06 = A06(c4j);
                int searchEndPosition2 = A09[1].charAt(26);
                if (searchEndPosition2 != 107) {
                    throw new RuntimeException();
                }
                A09[6] = "fZ";
                if (jA06 != C.TIME_UNSET) {
                    return jA06;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public static long A06(C4J c4j) {
        int iA09 = c4j.A09();
        if (c4j.A07() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        int originalPosition = bArr.length;
        c4j.A0k(bArr, 0, originalPosition);
        c4j.A0f(iA09);
        return !A0A(bArr) ? C.TIME_UNSET : A07(bArr);
    }

    public static long A07(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public static boolean A0A(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public final int A0B(InterfaceC2403lN interfaceC2403lN, C1241Gt c1241Gt) throws IOException {
        if (!this.A05) {
            return A02(interfaceC2403lN, c1241Gt);
        }
        if (this.A02 == C.TIME_UNSET) {
            return A00(interfaceC2403lN);
        }
        if (!this.A04) {
            return A01(interfaceC2403lN, c1241Gt);
        }
        if (this.A01 == C.TIME_UNSET) {
            return A00(interfaceC2403lN);
        }
        this.A00 = this.A07.A06(this.A02) - this.A07.A06(this.A01);
        if (this.A00 < 0) {
            AnonymousClass44.A07(A08(45, 16, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), A08(27, 18, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE) + this.A00 + A08(0, 27, 112));
            this.A00 = C.TIME_UNSET;
        }
        return A00(interfaceC2403lN);
    }

    public final long A0C() {
        return this.A00;
    }

    public final C4R A0D() {
        return this.A07;
    }

    public final boolean A0E() {
        return this.A03;
    }
}
