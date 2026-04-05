package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Iu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1293Iu {
    public static String[] A05 = {"woqNFTEJ1xTDdkI437bHtamdu4tXteqY", "wF9EC05jEy4IHYIwxnPCGFJPaq3oRF", "mvXHGyDRnyfaH7rDUTrxLU", "Y3pxu", "rdrAFFFqCGKv06lfALLqqSpp4fott15M", "y1UafG2XcmxkBa1SOf4hmBpigeNmapwO", "We1qkMSr6SX3sfWhtZ2XCBlgLjoOgFnd", "pWnGwQQvfY"};
    public int A01;
    public boolean A02;
    public final C1294Iv A04 = new C1294Iv();
    public final C4J A03 = new C4J(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    public int A00 = -1;

    /* JADX WARN: Incorrect condition in loop: B:4:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00(int r5) {
        /*
            r4 = this;
            r0 = 0
            r4.A01 = r0
            r3 = 0
        L4:
            int r1 = r4.A01
            int r1 = r1 + r5
            com.facebook.ads.redexgen.X.Iv r0 = r4.A04
            int r0 = r0.A02
            if (r1 >= r0) goto L1f
            com.facebook.ads.redexgen.X.Iv r0 = r4.A04
            int[] r2 = r0.A09
            int r1 = r4.A01
            int r0 = r1 + 1
            r4.A01 = r0
            int r1 = r1 + r5
            r1 = r2[r1]
            int r3 = r3 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L4
        L1f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1293Iu.A00(int):int");
    }

    public final C4J A01() {
        return this.A03;
    }

    public final C1294Iv A02() {
        return this.A04;
    }

    public final void A03() {
        this.A04.A02();
        this.A03.A0d(0);
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A03.A0l().length == 65025) {
            return;
        }
        this.A03.A0j(Arrays.copyOf(this.A03.A0l(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.A03.A0A())), this.A03.A0A());
    }

    public final boolean A05(InterfaceC2403lN interfaceC2403lN) throws IOException {
        C3M.A08(interfaceC2403lN != null);
        if (this.A02) {
            this.A02 = false;
            this.A03.A0d(0);
        }
        while (!this.A02) {
            int i10 = this.A00;
            if (A05[2].length() == 22) {
                String[] strArr = A05;
                strArr[4] = "11LtUWwuTljX7vpVMDmw91gP9qyXcF1F";
                strArr[5] = "domIksdZFoGV1iSe2ioqlJ00HNTdFQYJ";
                if (i10 < 0) {
                    if (!this.A04.A03(interfaceC2403lN) || !this.A04.A05(interfaceC2403lN, true)) {
                        return false;
                    }
                    int bytesToSkip = 0;
                    int iA00 = this.A04.A01;
                    if ((this.A04.A04 & 1) == 1) {
                        int iA0A = this.A03.A0A();
                        String[] strArr2 = A05;
                        if (strArr2[6].charAt(23) == strArr2[0].charAt(23)) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A05;
                        strArr3[6] = "Y9zvOFuJw9CJ8t2sOsvBkpDySrHa8OsK";
                        strArr3[0] = "XKYFbcbdBuLAcpGhFvzSCFSZpxBENLjQ";
                        if (iA0A == 0) {
                            iA00 += A00(0);
                            bytesToSkip = 0 + this.A01;
                        }
                    }
                    if (!GZ.A02(interfaceC2403lN, iA00)) {
                        return false;
                    }
                    this.A00 = bytesToSkip;
                }
                int bytesToSkip2 = this.A00;
                String[] strArr4 = A05;
                if (strArr4[4].charAt(26) != strArr4[5].charAt(26)) {
                    A05[2] = "D5kSzmFKF6oS1B0XjjhMyT";
                    int iA002 = A00(bytesToSkip2);
                    int bytesToSkip3 = this.A00;
                    int segmentIndex = bytesToSkip3 + this.A01;
                    if (iA002 > 0) {
                        this.A03.A0c(this.A03.A0A() + iA002);
                        if (!GZ.A03(interfaceC2403lN, this.A03.A0l(), this.A03.A0A(), iA002)) {
                            return false;
                        }
                        this.A03.A0e(this.A03.A0A() + iA002);
                        int i11 = this.A04.A09[segmentIndex - 1];
                        if (A05[2].length() == 22) {
                            String[] strArr5 = A05;
                            strArr5[7] = "zAFVDFtFmf";
                            strArr5[3] = "FIDx8";
                            this.A02 = i11 != 255;
                        }
                    }
                    if (segmentIndex == this.A04.A02) {
                        segmentIndex = -1;
                    }
                    this.A00 = segmentIndex;
                }
            }
            throw new RuntimeException();
        }
        return true;
    }
}
