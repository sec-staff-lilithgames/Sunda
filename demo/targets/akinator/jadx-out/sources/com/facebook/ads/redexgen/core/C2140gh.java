package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* renamed from: com.facebook.ads.redexgen.X.gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2140gh {
    public static byte[] A06;
    public static String[] A07 = {"1rXfVnNZRCMKSBmKvXBkqyIampQHuBTT", "2bLZXAk3pl72OxsXhKzzangZVfhmAhBr", "LE0trkh5BaXy0JUPm", "MtA6uT6DKVcUBVmop0u", "GFOlAA7vgdvYkzDNo5MadPPE0QeXaZAF", "iEcBvH9q7CiihZ6SUT8L1eAmSvCZtCKk", "3wBrZQLKvBQ6cLhc0qq", "ySHp1IuW6hVExgFmQZh21v0rDd75pKs8"};
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final AbstractC1426Nz A03;
    public final O1 A04;
    public final O1 A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A06 = new byte[]{-42, -30, -32, -29, -33, -40, -25, -40, -38, -29, -39, -38, -39, -72, -87, -69, -69, -83, -84, -66, -81, -67, -66, -99, -66, -85, -66, -67, -78, -91, -95, -77, -99, -98, -88, -95, -113, -80, -99, -80, -81};
    }

    static {
        A04();
    }

    public C2140gh(AbstractC1426Nz abstractC1426Nz) {
        this.A01 = false;
        this.A02 = false;
        this.A00 = false;
        this.A03 = abstractC1426Nz;
        this.A04 = new O1(abstractC1426Nz.A01);
        this.A05 = new O1(abstractC1426Nz.A01);
    }

    public C2140gh(AbstractC1426Nz abstractC1426Nz, Bundle bundle) {
        this.A01 = false;
        this.A02 = false;
        this.A00 = false;
        this.A03 = abstractC1426Nz;
        this.A04 = (O1) X2.A00(bundle.getByteArray(A00(19, 9, 23)));
        this.A05 = (O1) X2.A00(bundle.getByteArray(A00(28, 13, 9)));
        this.A01 = bundle.getBoolean(A00(8, 5, 66));
        this.A02 = bundle.getBoolean(A00(13, 6, 21));
        this.A00 = bundle.getBoolean(A00(0, 8, 64));
    }

    private void A01() {
        this.A00 = true;
        A02();
    }

    private void A02() {
        this.A01 = true;
        this.A03.A00(this.A00, this.A02, this.A02 ? this.A05 : this.A04);
    }

    private void A03() {
        this.A02 = true;
        A01();
    }

    public final Bundle A05() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(28, 13, 9), X2.A01(this.A05));
        bundle.putByteArray(A00(19, 9, 23), X2.A01(this.A04));
        bundle.putBoolean(A00(8, 5, 66), this.A01);
        bundle.putBoolean(A00(13, 6, 21), this.A02);
        bundle.putBoolean(A00(0, 8, 64), this.A00);
        return bundle;
    }

    public final void A06() {
        if (!this.A01) {
            this.A05.A03();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (r8 == 0.0d) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        A01();
        r2 = com.facebook.ads.redexgen.core.C2140gh.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r2[3].length() == r2[6].length()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        com.facebook.ads.redexgen.core.C2140gh.A07[2] = "tDZlaAUjytzZ2vtOC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r8 == 0.0d) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        r2 = com.facebook.ads.redexgen.core.C2140gh.A07;
        r2[5] = "PWt3UCdLmacUDAaKa7qG1WjHdRUwYQML";
        r2[7] = "nsPDOGo5haoHqx4MxUvN1JuyDQrM6Fdb";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(double r11, double r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2140gh.A07(double, double):void");
    }
}
