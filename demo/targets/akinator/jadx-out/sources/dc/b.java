package dc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f51977a = new byte[15];

    /* renamed from: b, reason: collision with root package name */
    public int f51978b;

    public static int e(long j10, long j11) {
        long jA = c.a(j10, j11);
        return (int) ((((jA & 4294967295L) + 4294967295L) >>> 32) | (jA >>> 31));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String toString(float r6) {
        /*
            dc.b r0 = new dc.b
            r0.<init>()
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            r1 = 8388607(0x7fffff, float:1.1754942E-38)
            r1 = r1 & r6
            int r2 = r6 >>> 23
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            if (r2 >= r3) goto L69
            r3 = -1
            r0.f51978b = r3
            if (r6 >= 0) goto L1e
            r4 = 45
            r0.a(r4)
        L1e:
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            int r6 = 150 - r2
            r2 = 8388608(0x800000, float:1.1754944E-38)
            r1 = r1 | r2
            if (r6 <= 0) goto L2b
            r2 = r4
            goto L2c
        L2b:
            r2 = r5
        L2c:
            r3 = 24
            if (r6 >= r3) goto L32
            r3 = r4
            goto L33
        L32:
            r3 = r5
        L33:
            r2 = r2 & r3
            if (r2 == 0) goto L40
            int r2 = r1 >> r6
            int r3 = r2 << r6
            if (r3 != r1) goto L40
            r0.f(r2, r5)
            goto L56
        L40:
            int r6 = -r6
            r0.g(r6, r1, r5)
            goto L56
        L45:
            if (r1 == 0) goto L61
            r6 = 8
            r2 = -149(0xffffffffffffff6b, float:NaN)
            if (r1 >= r6) goto L53
            int r1 = r1 * 10
            r0.g(r2, r1, r3)
            goto L56
        L53:
            r0.g(r2, r1, r5)
        L56:
            java.lang.String r6 = new java.lang.String
            int r1 = r0.f51978b
            int r1 = r1 + r4
            byte[] r0 = r0.f51977a
            r6.<init>(r0, r5, r5, r1)
            return r6
        L61:
            if (r6 != 0) goto L66
            java.lang.String r6 = "0.0"
            return r6
        L66:
            java.lang.String r6 = "-0.0"
            return r6
        L69:
            if (r1 == 0) goto L6e
            java.lang.String r6 = "NaN"
            return r6
        L6e:
            if (r6 <= 0) goto L73
            java.lang.String r6 = "Infinity"
            return r6
        L73:
            java.lang.String r6 = "-Infinity"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.b.toString(float):java.lang.String");
    }

    public final void a(int i10) {
        int i11 = this.f51978b + 1;
        this.f51978b = i11;
        this.f51977a[i11] = (byte) i10;
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
        int i11 = this.f51978b + 1;
        this.f51978b = i11;
        this.f51977a[i11] = (byte) (i10 + 48);
    }

    public final void d() {
        int i10;
        byte b10;
        while (true) {
            i10 = this.f51978b;
            b10 = this.f51977a[i10];
            if (b10 != 48) {
                break;
            } else {
                this.f51978b = i10 - 1;
            }
        }
        if (b10 == 46) {
            this.f51978b = i10 + 1;
        }
    }

    public final void f(int i10, int i11) {
        int iNumberOfLeadingZeros = (int) (((32 - Integer.numberOfLeadingZeros(i10)) * 661971961083L) >> 41);
        long j10 = i10;
        long[] jArr = c.f51979a;
        if (j10 >= jArr[iNumberOfLeadingZeros]) {
            iNumberOfLeadingZeros++;
        }
        int i12 = (int) (j10 * jArr[9 - iNumberOfLeadingZeros]);
        int i13 = i11 + iNumberOfLeadingZeros;
        int i14 = (int) ((i12 * 1441151881) >>> 57);
        int i15 = i12 - (100000000 * i14);
        int i16 = 1;
        if (i13 > 0 && i13 <= 7) {
            c(i14);
            int iA = ((int) (c.a((i15 + 1) << 28, 193428131138340668L) >>> 20)) - 1;
            while (i16 < i13) {
                int i17 = iA * 10;
                c(i17 >>> 28);
                iA = i17 & 268435455;
                i16++;
            }
            a(46);
            while (i16 <= 8) {
                int i18 = iA * 10;
                c(i18 >>> 28);
                iA = i18 & 268435455;
                i16++;
            }
            d();
            return;
        }
        if (-3 < i13 && i13 <= 0) {
            c(0);
            a(46);
            while (i13 < 0) {
                c(0);
                i13++;
            }
            c(i14);
            b(i15);
            d();
            return;
        }
        c(i14);
        a(46);
        b(i15);
        d();
        int i19 = i13 - 1;
        a(69);
        if (i19 < 0) {
            a(45);
            i19 = -i19;
        }
        if (i19 < 10) {
            c(i19);
            return;
        }
        int i20 = (i19 * 103) >>> 10;
        c(i20);
        c(i19 - (i20 * 10));
    }

    public final void g(int i10, int i11, int i12) {
        char c10;
        long j10;
        long j11;
        int i13 = i11 & 1;
        long j12 = i11 << 2;
        long j13 = j12 + 2;
        if ((i11 != 8388608) || (i10 == -149)) {
            j10 = j12 - 2;
            c10 = ')';
            j11 = i10 * 661971961083L;
        } else {
            c10 = ')';
            j10 = j12 - 1;
            j11 = (i10 * 661971961083L) - 274743187321L;
        }
        int i14 = (int) (j11 >> c10);
        int i15 = ((int) (((-i14) * 913124641741L) >> 38)) + i10 + 33;
        long j14 = c.f51980b[(i14 + 324) << 1] + 1;
        int iE = e(j14, j12 << i15);
        int iE2 = e(j14, j10 << i15);
        int iE3 = e(j14, j13 << i15);
        int i16 = iE >> 2;
        if (i16 >= 100) {
            int i17 = ((int) ((i16 * 1717986919) >>> 34)) * 10;
            int i18 = i17 + 10;
            boolean z10 = iE2 + i13 <= (i17 << 2);
            if (z10 != ((i18 << 2) + i13 <= iE3)) {
                if (!z10) {
                    i17 = i18;
                }
                f(i17, i14);
                return;
            }
        }
        int i19 = i16 + 1;
        boolean z11 = iE2 + i13 <= (i16 << 2);
        if (z11 != ((i19 << 2) + i13 <= iE3)) {
            if (!z11) {
                i16 = i19;
            }
            f(i16, i14 + i12);
        } else {
            int i20 = iE - ((i16 + i19) << 1);
            if (i20 >= 0 && (i20 != 0 || (i16 & 1) != 0)) {
                i16 = i19;
            }
            f(i16, i14 + i12);
        }
    }
}
