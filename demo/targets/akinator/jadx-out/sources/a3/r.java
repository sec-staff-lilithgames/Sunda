package a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class r extends d {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f4023a;

    /* renamed from: b, reason: collision with root package name */
    public final double[][] f4024b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4025c = true;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f4026d;

    public r(double[] dArr, double[][] dArr2) {
        int length = dArr2[0].length;
        this.f4026d = new double[length];
        this.f4023a = dArr;
        this.f4024b = dArr2;
        if (length <= 2) {
            return;
        }
        double d10 = 0.0d;
        int i10 = 0;
        while (true) {
            double d11 = d10;
            if (i10 >= dArr.length) {
                return;
            }
            double d12 = dArr2[i10][0];
            if (i10 > 0) {
                Math.hypot(d12 - d10, d12 - d11);
            }
            i10++;
            d10 = d12;
        }
    }

    @Override // a3.d
    public void getPos(double d10, double[] dArr) {
        double[] dArr2 = this.f4023a;
        int length = dArr2.length;
        double[][] dArr3 = this.f4024b;
        int i10 = 0;
        int length2 = dArr3[0].length;
        if (this.f4025c) {
            double d11 = dArr2[0];
            double[] dArr4 = this.f4026d;
            if (d10 <= d11) {
                getSlope(d11, dArr4);
                for (int i11 = 0; i11 < length2; i11++) {
                    dArr[i11] = ((d10 - dArr2[0]) * dArr4[i11]) + dArr3[0][i11];
                }
                return;
            }
            int i12 = length - 1;
            double d12 = dArr2[i12];
            if (d10 >= d12) {
                getSlope(d12, dArr4);
                while (i10 < length2) {
                    dArr[i10] = ((d10 - dArr2[i12]) * dArr4[i10]) + dArr3[i12][i10];
                    i10++;
                }
                return;
            }
        } else {
            if (d10 <= dArr2[0]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = dArr3[0][i13];
                }
                return;
            }
            int i14 = length - 1;
            if (d10 >= dArr2[i14]) {
                while (i10 < length2) {
                    dArr[i10] = dArr3[i14][i10];
                    i10++;
                }
                return;
            }
        }
        int i15 = 0;
        while (i15 < length - 1) {
            if (d10 == dArr2[i15]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    dArr[i16] = dArr3[i15][i16];
                }
            }
            int i17 = i15 + 1;
            double d13 = dArr2[i17];
            if (d10 < d13) {
                double d14 = dArr2[i15];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    dArr[i10] = (dArr3[i17][i10] * d15) + ((1.0d - d15) * dArr3[i15][i10]);
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[PHI: r5
      0x000f: PHI (r5v6 double) = (r5v0 double), (r5v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getSlope(double r12, double[] r14) {
        /*
            r11 = this;
            double[] r0 = r11.f4023a
            int r1 = r0.length
            double[][] r2 = r11.f4024b
            r3 = 0
            r4 = r2[r3]
            int r4 = r4.length
            r5 = r0[r3]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 > 0) goto L11
        Lf:
            r12 = r5
            goto L1a
        L11:
            int r5 = r1 + (-1)
            r5 = r0[r5]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 < 0) goto L1a
            goto Lf
        L1a:
            r5 = r3
        L1b:
            int r6 = r1 + (-1)
            if (r5 >= r6) goto L3d
            int r6 = r5 + 1
            r7 = r0[r6]
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 > 0) goto L3b
            r12 = r0[r5]
            double r7 = r7 - r12
        L2a:
            if (r3 >= r4) goto L3d
            r12 = r2[r5]
            r0 = r12[r3]
            r12 = r2[r6]
            r9 = r12[r3]
            double r9 = r9 - r0
            double r9 = r9 / r7
            r14[r3] = r9
            int r3 = r3 + 1
            goto L2a
        L3b:
            r5 = r6
            goto L1b
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.r.getSlope(double, double[]):void");
    }

    @Override // a3.d
    public double[] getTimePoints() {
        return this.f4023a;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v5 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double getSlope(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.f4023a
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r8 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 < 0) goto L15
            goto La
        L15:
            int r3 = r1 + (-1)
            if (r2 >= r3) goto L33
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L31
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f4024b
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L31:
            r2 = r3
            goto L15
        L33:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.r.getSlope(double, int):double");
    }

    @Override // a3.d
    public void getPos(double d10, float[] fArr) {
        double[] dArr = this.f4023a;
        int length = dArr.length;
        double[][] dArr2 = this.f4024b;
        int i10 = 0;
        int length2 = dArr2[0].length;
        if (this.f4025c) {
            double d11 = dArr[0];
            double[] dArr3 = this.f4026d;
            if (d10 <= d11) {
                getSlope(d11, dArr3);
                for (int i11 = 0; i11 < length2; i11++) {
                    fArr[i11] = (float) (((d10 - dArr[0]) * dArr3[i11]) + dArr2[0][i11]);
                }
                return;
            }
            int i12 = length - 1;
            double d12 = dArr[i12];
            if (d10 >= d12) {
                getSlope(d12, dArr3);
                while (i10 < length2) {
                    fArr[i10] = (float) (((d10 - dArr[i12]) * dArr3[i10]) + dArr2[i12][i10]);
                    i10++;
                }
                return;
            }
        } else {
            if (d10 <= dArr[0]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) dArr2[0][i13];
                }
                return;
            }
            int i14 = length - 1;
            if (d10 >= dArr[i14]) {
                while (i10 < length2) {
                    fArr[i10] = (float) dArr2[i14][i10];
                    i10++;
                }
                return;
            }
        }
        int i15 = 0;
        while (i15 < length - 1) {
            if (d10 == dArr[i15]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    fArr[i16] = (float) dArr2[i15][i16];
                }
            }
            int i17 = i15 + 1;
            double d13 = dArr[i17];
            if (d10 < d13) {
                double d14 = dArr[i15];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    fArr[i10] = (float) ((dArr2[i17][i10] * d15) + ((1.0d - d15) * dArr2[i15][i10]));
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    @Override // a3.d
    public double getPos(double d10, int i10) {
        double d11;
        double d12;
        double slope;
        double[] dArr = this.f4023a;
        int length = dArr.length;
        boolean z10 = this.f4025c;
        int i11 = 0;
        double[][] dArr2 = this.f4024b;
        if (z10) {
            double d13 = dArr[0];
            if (d10 <= d13) {
                d11 = dArr2[0][i10];
                d12 = d10 - d13;
                slope = getSlope(d13, i10);
            } else {
                int i12 = length - 1;
                double d14 = dArr[i12];
                if (d10 >= d14) {
                    d11 = dArr2[i12][i10];
                    d12 = d10 - d14;
                    slope = getSlope(d14, i10);
                }
            }
            return (slope * d12) + d11;
        }
        if (d10 <= dArr[0]) {
            return dArr2[0][i10];
        }
        int i13 = length - 1;
        if (d10 >= dArr[i13]) {
            return dArr2[i13][i10];
        }
        while (i11 < length - 1) {
            double d15 = dArr[i11];
            if (d10 == d15) {
                return dArr2[i11][i10];
            }
            int i14 = i11 + 1;
            double d16 = dArr[i14];
            if (d10 < d16) {
                double d17 = (d10 - d15) / (d16 - d15);
                return (dArr2[i14][i10] * d17) + ((1.0d - d17) * dArr2[i11][i10]);
            }
            i11 = i14;
        }
        return 0.0d;
    }
}
