package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ok, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1436Ok implements ZY {
    public static byte[] A01;
    public final /* synthetic */ C6H A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-36, -38, -52, -39, -58, -55, -36, -51, -51, -52, -39, -52, -53, -58, -54, -45, -48, -54, -46, -58, -48, -56, -55, -58, -43, -56, -35, -48, -50, -56, -37, -48, -42, -43};
    }

    public C1436Ok(C6H c6h) {
        this.A00 = c6h;
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AES(String str) {
        this.A00.A0C.setProgress(100);
        ((OD) this.A00).A05 = false;
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEU(String str) throws SecurityException {
        ((OD) this.A00).A05 = true;
        this.A00.A0B.setUrl(str);
        if (this.A00.A00 > 1) {
            this.A00.A0H(A00(0, 34, 31));
        }
        C6H.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEq(int i10) {
        if (((OD) this.A00).A05) {
            this.A00.A0C.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEt(String str) {
        this.A00.A0B.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEw() {
        this.A00.A0A.ACf(14);
    }
}
