package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;

/* loaded from: assets/audience_network.dex */
public final class IV {
    public static String[] A0A = {"EJzHBf6C0sknf46Vq1Osr72lZWU", "EzVPMe4nRAbvxSng0PXVwtyqLeoR1KIv", "OkBxNGbCc3SGP6NNAhHfxcRtiUQBpmsu", "1fihPQnAv3tt3xF1xxV2XjfJNe5jiXUE", "EaQIZLU4UTAcxpaH6Zb3hTUPzu", "nXVDjS3P8WK4na35on8K5ox1mEuGJ9Tn", "34qesDVsFPLU35m5e8V9GlfuLx1oAXXP", "IwUkif7926Fg"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public IP A04;
    public C1285Im A05;
    public final H1 A06;
    public final C1287Io A07 = new C1287Io();
    public final C4J A09 = new C4J(1);
    public final C4J A08 = new C4J();

    public IV(H1 h12) {
        this.A06 = h12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1286In A00() {
        C1286In encryptionBox;
        int i10 = this.A07.A06.A02;
        if (this.A07.A07 != null) {
            encryptionBox = this.A07.A07;
        } else {
            encryptionBox = this.A05.A00(i10);
        }
        if (encryptionBox == null || !encryptionBox.A03) {
            return null;
        }
        return encryptionBox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C1286In c1286InA00 = A00();
        if (c1286InA00 == null) {
            return;
        }
        C4J c4j = this.A07.A0H;
        if (c1286InA00.A00 != 0) {
            c4j.A0g(c1286InA00.A00);
        }
        if (this.A07.A06(this.A01)) {
            c4j.A0g(c4j.A0M() * 6);
        }
    }

    public final int A04() {
        C4J c4j;
        int vectorSize;
        C1286In c1286InA00 = A00();
        if (c1286InA00 == null) {
            return 0;
        }
        if (c1286InA00.A00 != 0) {
            c4j = this.A07.A0H;
            vectorSize = c1286InA00.A00;
        } else {
            byte[] initVectorData = c1286InA00.A04;
            this.A08.A0j(initVectorData, initVectorData.length);
            c4j = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean zA06 = this.A07.A06(this.A01);
        this.A09.A00[0] = (byte) ((zA06 ? 128 : 0) | vectorSize);
        this.A09.A0f(0);
        H1 h12 = this.A06;
        C4J initializationVectorData = this.A09;
        h12.AI7(initializationVectorData, 1);
        this.A06.AI7(c4j, vectorSize);
        if (!zA06) {
            int vectorSize2 = vectorSize + 1;
            if (A0A[2].charAt(9) == '1') {
                throw new RuntimeException();
            }
            A0A[3] = "cKav7mEAu9tQ2Y9RA5SJHOCCBpQ48rqR";
            return vectorSize2;
        }
        C4J c4j2 = this.A07.A0H;
        int iA0M = c4j2.A0M();
        c4j2.A0g(-2);
        int i10 = (iA0M * 6) + 2;
        this.A06.AI7(c4j2, i10);
        return vectorSize + 1 + i10;
    }

    public final void A05() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(long r5) {
        /*
            r4 = this;
            int r3 = r4.A01
        L2:
            com.facebook.ads.redexgen.X.Io r0 = r4.A07
            int r0 = r0.A00
            if (r3 >= r0) goto L1f
            com.facebook.ads.redexgen.X.Io r0 = r4.A07
            long r1 = r0.A00(r3)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L1f
            com.facebook.ads.redexgen.X.Io r0 = r4.A07
            boolean[] r0 = r0.A0G
            boolean r0 = r0[r3]
            if (r0 == 0) goto L1c
            r4.A03 = r3
        L1c:
            int r3 = r3 + 1
            goto L2
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.IV.A06(long):void");
    }

    public final void A07(DrmInitData drmInitData) {
        C1286In encryptionBox = this.A05.A00(this.A07.A06.A02);
        this.A06.A6W(this.A05.A07.A09(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A08(C1285Im c1285Im, IP ip2) {
        this.A05 = (C1285Im) C3M.A01(c1285Im);
        this.A04 = (IP) C3M.A01(ip2);
        this.A06.A6W(c1285Im.A07);
        A05();
    }

    public final boolean A09() {
        this.A01++;
        this.A00++;
        if (this.A00 != this.A07.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
