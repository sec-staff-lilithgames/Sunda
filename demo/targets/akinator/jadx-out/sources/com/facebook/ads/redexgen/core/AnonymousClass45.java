package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.45, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass45 {
    public static byte[] A02;
    public int A00;
    public long[] A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-125, 119, -54, -64, -47, -68, 119, -64, -54, 119, -97, -60, -52, -73, -62, -65, -70, 118, -65, -60, -70, -69, -50, 118};
    }

    public AnonymousClass45() {
        this(32);
    }

    public AnonymousClass45(int i10) {
        this.A01 = new long[i10];
    }

    public final int A02() {
        return this.A00;
    }

    public final long A03(int i10) {
        if (i10 >= 0 && i10 < this.A00) {
            return this.A01[i10];
        }
        throw new IndexOutOfBoundsException(A00(10, 14, 43) + i10 + A00(0, 10, 44) + this.A00);
    }

    public final void A04(long j10) {
        if (this.A00 == this.A01.length) {
            this.A01 = Arrays.copyOf(this.A01, this.A00 * 2);
        }
        long[] jArr = this.A01;
        int i10 = this.A00;
        this.A00 = i10 + 1;
        jArr[i10] = j10;
    }

    public final long[] A05() {
        return Arrays.copyOf(this.A01, this.A00);
    }
}
