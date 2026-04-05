package dc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f51975a = new byte[24];

    /* renamed from: b, reason: collision with root package name */
    public int f51976b;

    public static long e(long j10, long j11, long j12) {
        long jA = c.a(j11, j12);
        long j13 = j10 * j12;
        long jA2 = c.a(j10, j12);
        long j14 = (j13 >>> 1) + jA;
        return (jA2 + (j14 >>> 63)) | (((j14 & Long.MAX_VALUE) + Long.MAX_VALUE) >>> 63);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String toString(double r8) {
        /*
            dc.a r0 = new dc.a
            r0.<init>()
            long r8 = java.lang.Double.doubleToRawLongBits(r8)
            r1 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r1 = r1 & r8
            r3 = 52
            long r3 = r8 >>> r3
            int r3 = (int) r3
            r4 = 2047(0x7ff, float:2.868E-42)
            r3 = r3 & r4
            r5 = 0
            if (r3 >= r4) goto L79
            r4 = -1
            r0.f51976b = r4
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 >= 0) goto L27
            r9 = 45
            r0.a(r9)
        L27:
            r9 = 1
            r7 = 0
            if (r3 == 0) goto L50
            int r8 = 1075 - r3
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r1 = r1 | r3
            if (r8 <= 0) goto L34
            r3 = r9
            goto L35
        L34:
            r3 = r7
        L35:
            r4 = 53
            if (r8 >= r4) goto L3b
            r4 = r9
            goto L3c
        L3b:
            r4 = r7
        L3c:
            r3 = r3 & r4
            if (r3 == 0) goto L4b
            long r3 = r1 >> r8
            long r5 = r3 << r8
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L4b
            r0.f(r7, r3)
            goto L66
        L4b:
            int r8 = -r8
            r0.g(r8, r7, r1)
            goto L66
        L50:
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L71
            r5 = 3
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r3 = -1074(0xfffffffffffffbce, float:NaN)
            if (r8 >= 0) goto L63
            r5 = 10
            long r1 = r1 * r5
            r0.g(r3, r4, r1)
            goto L66
        L63:
            r0.g(r3, r7, r1)
        L66:
            java.lang.String r8 = new java.lang.String
            int r1 = r0.f51976b
            int r1 = r1 + r9
            byte[] r9 = r0.f51975a
            r8.<init>(r9, r7, r7, r1)
            return r8
        L71:
            if (r8 != 0) goto L76
            java.lang.String r8 = "0.0"
            return r8
        L76:
            java.lang.String r8 = "-0.0"
            return r8
        L79:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L80
            java.lang.String r8 = "NaN"
            return r8
        L80:
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 <= 0) goto L87
            java.lang.String r8 = "Infinity"
            return r8
        L87:
            java.lang.String r8 = "-Infinity"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.a.toString(double):java.lang.String");
    }

    public final void a(int i10) {
        int i11 = this.f51976b + 1;
        this.f51976b = i11;
        this.f51975a[i11] = (byte) i10;
    }

    public final void b(int i10) {
        int iA = ((int) (c.a((i10 + 1) << 28, 193428131138340668L) >>> 20)) - 1;
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = iA * 10;
            c(i12 >>> 28);
            iA = i12 & 268435455;
        }
    }

    public final void c(int i10) {
        int i11 = this.f51976b + 1;
        this.f51976b = i11;
        this.f51975a[i11] = (byte) (i10 + 48);
    }

    public final void d(int i10) {
        int i11;
        byte b10;
        if (i10 != 0) {
            b(i10);
        }
        while (true) {
            i11 = this.f51976b;
            b10 = this.f51975a[i11];
            if (b10 != 48) {
                break;
            } else {
                this.f51976b = i11 - 1;
            }
        }
        if (b10 == 46) {
            this.f51976b = i11 + 1;
        }
    }

    public final void f(int i10, long j10) {
        int iNumberOfLeadingZeros = (int) (((64 - Long.numberOfLeadingZeros(j10)) * 661971961083L) >> 41);
        long[] jArr = c.f51979a;
        if (j10 >= jArr[iNumberOfLeadingZeros]) {
            iNumberOfLeadingZeros++;
        }
        long j11 = j10 * jArr[17 - iNumberOfLeadingZeros];
        int i11 = i10 + iNumberOfLeadingZeros;
        long jA = c.a(j11, 193428131138340668L) >>> 20;
        int i12 = (int) (j11 - (100000000 * jA));
        int i13 = (int) ((1441151881 * jA) >>> 57);
        int i14 = (int) (jA - (100000000 * i13));
        int i15 = 1;
        if (i11 > 0 && i11 <= 7) {
            c(i13);
            int iA = ((int) (c.a((i14 + 1) << 28, 193428131138340668L) >>> 20)) - 1;
            while (i15 < i11) {
                int i16 = iA * 10;
                c(i16 >>> 28);
                iA = i16 & 268435455;
                i15++;
            }
            a(46);
            while (i15 <= 8) {
                int i17 = iA * 10;
                c(i17 >>> 28);
                iA = i17 & 268435455;
                i15++;
            }
            d(i12);
            return;
        }
        if (-3 < i11 && i11 <= 0) {
            c(0);
            a(46);
            while (i11 < 0) {
                c(0);
                i11++;
            }
            c(i13);
            b(i14);
            d(i12);
            return;
        }
        c(i13);
        a(46);
        b(i14);
        d(i12);
        int i18 = i11 - 1;
        a(69);
        if (i18 < 0) {
            a(45);
            i18 = -i18;
        }
        if (i18 < 10) {
            c(i18);
            return;
        }
        if (i18 >= 100) {
            int i19 = (i18 * 1311) >>> 17;
            c(i19);
            i18 -= i19 * 100;
        }
        int i20 = (i18 * 103) >>> 10;
        c(i20);
        c(i18 - (i20 * 10));
    }

    public final void g(int i10, int i11, long j10) {
        int i12;
        char c10;
        long j11;
        long j12;
        int i13 = ((int) j10) & 1;
        long j13 = j10 << 2;
        long j14 = j13 + 2;
        if ((j10 != 4503599627370496L) || (i10 == -1074)) {
            j11 = j13 - 2;
            i12 = 1;
            c10 = 2;
            j12 = i10 * 661971961083L;
        } else {
            i12 = 1;
            c10 = 2;
            j11 = j13 - 1;
            j12 = (i10 * 661971961083L) - 274743187321L;
        }
        int i14 = (int) (j12 >> 41);
        int i15 = ((int) (((-i14) * 913124641741L) >> 38)) + i10 + 2;
        int i16 = (i14 + 324) << i12;
        long[] jArr = c.f51980b;
        long j15 = jArr[i16];
        long j16 = jArr[i16 | i12];
        long jE = e(j15, j16, j13 << i15);
        long jE2 = e(j15, j16, j11 << i15);
        long jE3 = e(j15, j16, j14 << i15);
        long j17 = jE >> c10;
        int i17 = i12;
        if (j17 >= 100) {
            long jA = c.a(j17, 1844674407370955168L) * 10;
            long j18 = jA + 10;
            long j19 = i13;
            int i18 = jE2 + j19 <= (jA << c10) ? i17 : 0;
            if (i18 != ((j18 << c10) + j19 <= jE3 ? i17 : 0)) {
                f(i14, i18 != 0 ? jA : j18);
                return;
            }
        }
        long j20 = j17 + 1;
        long j21 = i13;
        int i19 = jE2 + j21 <= (j17 << c10) ? i17 : 0;
        if (i19 != ((j20 << c10) + j21 <= jE3 ? i17 : 0)) {
            if (i19 == 0) {
                j17 = j20;
            }
            f(i14 + i11, j17);
        } else {
            long j22 = jE - ((j17 + j20) << i17);
            if (j22 >= 0 && (j22 != 0 || (j17 & 1) != 0)) {
                j17 = j20;
            }
            f(i14 + i11, j17);
        }
    }
}
