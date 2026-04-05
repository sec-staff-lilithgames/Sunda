package com.facebook.ads.redexgen.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* loaded from: assets/audience_network.dex */
public final class M4 {
    public static byte[] A05;
    public static String[] A06 = {"nQDli3B322dNyuNUEmcA1lNjVYYmcThQ", "JG8wfEU3nZ2EADYXO0uZDMHFqmVSkpWr", "8K0NmfCVVugnhGVgpCD", "5JHmUKWu4ei3dzUY0lNr", "xKwnuhTKVDH3YhaAiUGpqwLltg47C3CG", "Jcwv8MY0", "vBOLiuiZ", "hny3hth3cGmNH4IG9ndqfAmzri4VXjHL"};
    public C2262is A00;
    public final int A01;
    public final String A02;
    public final ArrayList<M3> A03;
    public final TreeSet<C2260iq> A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, -57, -62, 115, -100, -70, -68, -63, -66, -67, -100, -56, -57, -51, -66, -57, -51, -57, -30, -22, -19, -26, -27, -95, -11, -16, -95, -13, -26, -17, -30, -18, -26, -95};
    }

    static {
        A01();
    }

    public M4(int i10, String str) {
        this(i10, str, C2262is.A03);
    }

    public M4(int i10, String str, C2262is c2262is) {
        this.A01 = i10;
        this.A02 = str;
        this.A00 = c2262is;
        this.A04 = new TreeSet<>();
        this.A03 = new ArrayList<>();
    }

    public final long A02(long j10, long j11) {
        boolean z10 = true;
        C3M.A07(j10 >= 0);
        if (j11 < 0) {
            z10 = false;
        }
        C3M.A07(z10);
        C2260iq c2260iqA04 = A04(j10, j11);
        if (c2260iqA04.A03()) {
            return -Math.min(c2260iqA04.A04() ? Long.MAX_VALUE : c2260iqA04.A01, j11);
        }
        long j12 = j10 + j11;
        if (j12 < 0) {
            j12 = Long.MAX_VALUE;
        }
        long currentEndPosition = c2260iqA04.A02 + c2260iqA04.A01;
        if (currentEndPosition < j12) {
            TreeSet<C2260iq> treeSet = this.A04;
            String[] strArr = A06;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "31viDRwdD8ErVcI5dXS";
            strArr2[3] = "q1k4diPGE3D0s4ujqDJA";
            for (C2260iq c2260iq : treeSet.tailSet(c2260iqA04, false)) {
                if (c2260iq.A02 > currentEndPosition) {
                    break;
                }
                long j13 = c2260iq.A02;
                long queryEndPosition = c2260iq.A01;
                currentEndPosition = Math.max(currentEndPosition, j13 + queryEndPosition);
                if (currentEndPosition >= j12) {
                    break;
                }
            }
        }
        return Math.min(currentEndPosition - j10, j11);
    }

    public final C2262is A03() {
        return this.A00;
    }

    public final C2260iq A04(long j10, long j11) {
        C2260iq c2260iqA03 = C2260iq.A03(this.A02, j10);
        C2260iq c2260iqFloor = this.A04.floor(c2260iqA03);
        if (c2260iqFloor != null && c2260iqFloor.A02 + c2260iqFloor.A01 > j10) {
            return c2260iqFloor;
        }
        C2260iq lookupSpan = this.A04.ceiling(c2260iqA03);
        if (lookupSpan != null) {
            long jMin = lookupSpan.A02 - j10;
            if (j11 != -1) {
                jMin = Math.min(jMin, j11);
            }
            j11 = jMin;
        }
        return C2260iq.A04(this.A02, j10, j11);
    }

    public final C2260iq A05(C2260iq c2260iq, long j10, boolean z10) {
        C3M.A08(this.A04.remove(c2260iq));
        File file = (File) C3M.A01(c2260iq.A03);
        if (z10) {
            File file2 = file.getParentFile();
            File fileA05 = C2260iq.A05((File) C3M.A01(file2), this.A01, c2260iq.A02, j10);
            if (file.renameTo(fileA05)) {
                file = fileA05;
            } else {
                AnonymousClass44.A07(A00(4, 13, 42), A00(17, 17, 82) + file + A00(0, 4, 36) + fileA05);
            }
        }
        C2260iq newCacheSpan = c2260iq.A09(file, j10);
        this.A04.add(newCacheSpan);
        return newCacheSpan;
    }

    public final TreeSet<C2260iq> A06() {
        return this.A04;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(long r5) {
        /*
            r4 = this;
            r3 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.M3> r0 = r4.A03
            int r0 = r0.size()
            if (r3 >= r0) goto L20
            java.util.ArrayList<com.facebook.ads.redexgen.X.M3> r0 = r4.A03
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.redexgen.X.M3 r0 = (com.facebook.ads.redexgen.core.M3) r0
            long r1 = r0.A01
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L1d
            java.util.ArrayList<com.facebook.ads.redexgen.X.M3> r0 = r4.A03
            r0.remove(r3)
            return
        L1d:
            int r3 = r3 + 1
            goto L1
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.M4.A07(long):void");
    }

    public final void A08(C2260iq c2260iq) {
        this.A04.add(c2260iq);
    }

    public final boolean A09() {
        return this.A04.isEmpty();
    }

    public final boolean A0A() {
        return this.A03.isEmpty();
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0B(long r3, long r5) {
        /*
            r2 = this;
            r1 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.M3> r0 = r2.A03
            int r0 = r0.size()
            if (r1 >= r0) goto L1c
            java.util.ArrayList<com.facebook.ads.redexgen.X.M3> r0 = r2.A03
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.M3 r0 = (com.facebook.ads.redexgen.core.M3) r0
            boolean r0 = r0.A00(r3, r5)
            if (r0 == 0) goto L19
            r0 = 1
            return r0
        L19:
            int r1 = r1 + 1
            goto L1
        L1c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.M4.A0B(long, long):boolean");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0C(long r3, long r5) {
        /*
            r2 = this;
            r1 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.M3> r0 = r2.A03
            int r0 = r0.size()
            if (r1 >= r0) goto L1c
            java.util.ArrayList<com.facebook.ads.redexgen.X.M3> r0 = r2.A03
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.M3 r0 = (com.facebook.ads.redexgen.core.M3) r0
            boolean r0 = r0.A01(r3, r5)
            if (r0 == 0) goto L19
            r0 = 0
            return r0
        L19:
            int r1 = r1 + 1
            goto L1
        L1c:
            java.util.ArrayList<com.facebook.ads.redexgen.X.M3> r1 = r2.A03
            com.facebook.ads.redexgen.X.M3 r0 = new com.facebook.ads.redexgen.X.M3
            r0.<init>(r3, r5)
            r1.add(r0)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.M4.A0C(long, long):boolean");
    }

    public final boolean A0D(C1374Lx c1374Lx) {
        if (this.A04.remove(c1374Lx)) {
            if (c1374Lx.A03 != null) {
                c1374Lx.A03.delete();
                return true;
            }
            return true;
        }
        String[] strArr = A06;
        if (strArr[2].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[2] = "U4uu0ltzeeg5QMm1KwS";
        strArr2[3] = "VtFGErd1YdVsfyUNL3Po";
        return false;
    }

    public final boolean A0E(M9 m9) {
        C2262is c2262is = this.A00;
        C2262is oldMetadata = this.A00;
        this.A00 = oldMetadata.A05(m9);
        C2262is oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c2262is);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        M4 m42 = (M4) obj;
        if (this.A01 == m42.A01 && this.A02.equals(m42.A02) && this.A04.equals(m42.A04) && this.A00.equals(m42.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i10 = result * 31;
        int result2 = this.A02.hashCode();
        return ((i10 + result2) * 31) + this.A00.hashCode();
    }
}
