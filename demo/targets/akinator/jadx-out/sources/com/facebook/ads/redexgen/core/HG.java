package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class HG implements ZY {
    public static byte[] A01;
    public static String[] A02 = {"BeK4HZWWIRhrC207wWuIOn", "ZxUaKMHZMCvHIxTDkc1UvZSYXikI2iYM", "xy0Ab8m7NOX4ZRxTfyGPwRY1TRrgVPC4", "ij8auLNb9rfA8yI55JUjNirWgnYpCp0M", "e9T4yeifuMgQg3dKDn6E2LsVBs4fgiHR", "ibrxpSG6qut0wBAmR6wSiB8exNotCqiu", "LMYPYXdb4SaVI93FsN1uYFih9", "8N3vGs6nddgUWUG"};
    public final /* synthetic */ C4Z A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A02[2] = "F3dYTVgRpzEGoEWMN2T8FFCtbrhRHRBi";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 99);
            i13++;
        }
    }

    public static void A01() {
        A01 = new byte[]{21, 19, 5, 18, Utf8.REPLACEMENT_BYTE, 14, 1, 22, 9, 7, 1, 20, 9, 15, 14, Utf8.REPLACEMENT_BYTE, 9, 1, 2};
    }

    static {
        A01();
    }

    public HG(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AES(String str) {
        this.A00.A0Q = false;
        this.A00.A0F.setProgress(100);
        XP.A0L(this.A00.A0F, 8);
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEU(String str) throws SecurityException {
        this.A00.A0Q = true;
        XP.A0L(this.A00.A0F, 0);
        this.A00.A0E.setUrl(str);
        if (!this.A00.A0P) {
            C4Z c4z = this.A00;
            if (A02[5].charAt(30) != 'i') {
                throw new RuntimeException();
            }
            A02[7] = "LFtEVX0D7i5Pos5vlgnVVb1H7Q5y";
            if (c4z.A02 > 1) {
                this.A00.A0P = true;
                this.A00.A0i(A00(0, 19, 3));
            }
        }
        C4Z.A05(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEq(int i10) {
        if (this.A00.A0Q) {
            this.A00.A0F.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEt(String str) {
        this.A00.A0E.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.ZY
    public final void AEw() {
        ((AbstractC1264Hr) this.A00).A0B.ACf(14);
    }
}
