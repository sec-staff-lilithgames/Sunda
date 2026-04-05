package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class H0 implements ZY {
    public static byte[] A01;
    public static String[] A02 = {"lymitVL5Elx23yNuagrdcc1tj4byFzuO", "OtHhm4I6MY8qhok47NcALtT", "GJmhN4rXhrf709OMeDU9UKBK4KfDlX2Y", "UKN", "ioCWBc07RK8NAgZ7uqzQ2Ov99bHrMaFb", "vsb8Ufoa8H", "zp4FcHB1hqlJdpy7ZALmHMQwB62WRf78", "qbR"};
    public final /* synthetic */ C4K A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A02[1].length() != 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "68tvMXLM0DzUKrc9PEEpmru8eIlurAzh";
        strArr[2] = "oZlS45uLmtttWs7KR8Y8sKnmk93hftbi";
        A01 = new byte[]{51, 49, 35, 48, 29, 44, 31, 52, 39, 37, 31, 50, 39, 45, 44, 29, 39, 31, 32};
    }

    static {
        A01();
    }

    public H0(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AES(String str) {
        this.A00.A0F = false;
        if (this.A00.A05 != null) {
            this.A00.A05.setProgress(100);
        }
        XP.A0L(this.A00.A05, 8);
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEU(String str) throws SecurityException {
        this.A00.A0F = true;
        XP.A0L(this.A00.A05, 0);
        if (this.A00.A04 != null) {
            this.A00.A04.setUrl(str);
        }
        if (!this.A00.A0E && this.A00.A01 > 1) {
            this.A00.A0E = true;
            this.A00.A0n(A00(0, 19, 88));
        }
        C4K c4k = this.A00;
        if (A02[1].length() != 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "Ijw";
        strArr[3] = "65M";
        C4K.A03(c4k);
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEq(int i10) {
        if (this.A00.A0F && this.A00.A05 != null) {
            this.A00.A05.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEt(String str) {
        if (this.A00.A04 != null) {
            this.A00.A04.setTitle(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEw() {
        ((AbstractC1264Hr) this.A00).A0B.ACf(14);
    }
}
