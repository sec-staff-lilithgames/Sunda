package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.kO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2354kO extends AbstractC1298Iz {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", "m", "OXoEHzgO5FTzqO33f", "i"};
    public int A00;
    public H5 A01;
    public H7 A02;
    public J0 A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final J0 A02(C4J c4j) throws IOException {
        if (this.A02 == null) {
            this.A02 = H8.A06(c4j);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = H8.A04(c4j);
            return null;
        }
        H7 h72 = this.A02;
        H5 h52 = this.A01;
        byte[] bArr = new byte[c4j.A0A()];
        System.arraycopy(c4j.A0l(), 0, bArr, 0, c4j.A0A());
        return new J0(h72, h52, bArr, H8.A0D(c4j, h72.A05), H8.A00(r6.length - 1));
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-108, -88, -105, -100, -94, 98, -87, -94, -91, -107, -100, -90};
    }

    static {
        A04();
    }

    public static int A00(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static int A01(byte b10, J0 j02) {
        if (!j02.A04[A00(b10, j02.A00, 1)].A03) {
            int modeNumber = j02.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = j02.A02.A04;
        return modeNumber2;
    }

    public static void A05(C4J c4j, long j10) {
        if (c4j.A08() < c4j.A0A() + 4) {
            c4j.A0i(Arrays.copyOf(c4j.A0l(), c4j.A0A() + 4));
        } else {
            c4j.A0e(c4j.A0A() + 4);
        }
        byte[] bArrA0l = c4j.A0l();
        bArrA0l[c4j.A0A() - 4] = (byte) (j10 & 255);
        bArrA0l[c4j.A0A() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrA0l[c4j.A0A() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrA0l[c4j.A0A() - 1] = (byte) (255 & (j10 >>> 24));
    }

    public static boolean A06(C4J c4j) {
        try {
            return H8.A0C(1, c4j, true);
        } catch (C08822i unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1298Iz
    public final long A09(C4J c4j) {
        int i10 = 0;
        if ((c4j.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = c4j.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b10, (J0) C3M.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i10 = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c4j, i10);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1298Iz
    public final void A0A(long j10) {
        super.A0A(j10);
        this.A04 = j10 != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1298Iz
    public final void A0B(boolean z10) {
        super.A0B(z10);
        if (z10) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1298Iz
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C4J c4j, long j10, C1297Iy c1297Iy) throws IOException {
        if (this.A03 != null) {
            C3M.A01(c1297Iy.A00);
            return false;
        }
        this.A03 = A02(c4j);
        if (this.A03 == null) {
            return true;
        }
        J0 j02 = this.A03;
        H7 h72 = j02.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(h72.A09);
        codecInitializationData.add(j02.A03);
        c1297Iy.A00 = new C2D().A11(A03(0, 12, 22)).A0a(h72.A02).A0j(h72.A00).A0b(h72.A05).A0m(h72.A06).A12(codecInitializationData).A0v(H8.A02(MetaExoPlayerCustomizedCollections.A02(j02.A01.A02))).A14();
        return true;
    }
}
