package a3;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s extends d {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f4027a;

    /* renamed from: b, reason: collision with root package name */
    public final double[][] f4028b;

    /* renamed from: c, reason: collision with root package name */
    public final double[][] f4029c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4030d = true;

    /* renamed from: e, reason: collision with root package name */
    public final double[] f4031e;

    public s(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f4031e = new double[length2];
        int i10 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i10, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i11 = 0; i11 < length2; i11++) {
            int i12 = 0;
            while (i12 < i10) {
                int i13 = i12 + 1;
                double d10 = dArr[i13] - dArr[i12];
                double[] dArr5 = dArr3[i12];
                double d11 = (dArr2[i13][i11] - dArr2[i12][i11]) / d10;
                dArr5[i11] = d11;
                if (i12 == 0) {
                    dArr4[i12][i11] = d11;
                } else {
                    dArr4[i12][i11] = (dArr3[i12 - 1][i11] + d11) * 0.5d;
                }
                i12 = i13;
            }
            dArr4[i10][i11] = dArr3[length - 2][i11];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = 0; i15 < length2; i15++) {
                double d12 = dArr3[i14][i15];
                if (d12 == 0.0d) {
                    dArr4[i14][i15] = 0.0d;
                    dArr4[i14 + 1][i15] = 0.0d;
                } else {
                    double d13 = dArr4[i14][i15] / d12;
                    int i16 = i14 + 1;
                    double d14 = dArr4[i16][i15] / d12;
                    double dHypot = Math.hypot(d13, d14);
                    if (dHypot > 9.0d) {
                        double d15 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i14];
                        double[] dArr7 = dArr3[i14];
                        dArr6[i15] = d13 * d15 * dArr7[i15];
                        dArr4[i16][i15] = d15 * d14 * dArr7[i15];
                    }
                }
            }
        }
        this.f4027a = dArr;
        this.f4028b = dArr2;
        this.f4029c = dArr4;
    }

    public static double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d11 * 6.0d;
        double d18 = 6.0d * d16 * d12;
        double d19 = (d18 + ((d17 * d13) + (((-6.0d) * d16) * d13))) - (d17 * d12);
        double d20 = 3.0d * d10;
        return (d10 * d14) + (((((d20 * d14) * d16) + (((d20 * d15) * d16) + d19)) - (((2.0d * d10) * d15) * d11)) - (((4.0d * d10) * d14) * d11));
    }

    public static double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d16 * d11;
        double d18 = 3.0d * d16;
        double d19 = d17 * 2.0d * d12;
        double d20 = ((d19 + ((d18 * d13) + (((-2.0d) * d17) * d13))) - (d18 * d12)) + d12;
        double d21 = d10 * d15;
        double d22 = (d21 * d17) + d20;
        double d23 = d10 * d14;
        return (d23 * d11) + ((((d17 * d23) + d22) - (d21 * d16)) - (((d10 * 2.0d) * d14) * d16));
    }

    public static s buildWave(String str) {
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i10 = 0;
        while (iIndexOf2 != -1) {
            dArr[i10] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i10++;
        }
        dArr[i10] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        double[] dArrCopyOf = Arrays.copyOf(dArr, i10 + 1);
        int length = (dArrCopyOf.length * 3) - 2;
        int length2 = dArrCopyOf.length - 1;
        double d10 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i11 = 0; i11 < dArrCopyOf.length; i11++) {
            double d11 = dArrCopyOf[i11];
            int i12 = i11 + length2;
            dArr2[i12][0] = d11;
            double d12 = i11 * d10;
            dArr3[i12] = d12;
            if (i11 > 0) {
                int i13 = (length2 * 2) + i11;
                dArr2[i13][0] = d11 + 1.0d;
                dArr3[i13] = d12 + 1.0d;
                int i14 = i11 - 1;
                dArr2[i14][0] = (d11 - 1.0d) - d10;
                dArr3[i14] = (d12 - 1.0d) - d10;
            }
        }
        return new s(dArr3, dArr2);
    }

    @Override // a3.d
    public void getPos(double d10, double[] dArr) {
        double[] dArr2 = this.f4027a;
        int length = dArr2.length;
        double[][] dArr3 = this.f4028b;
        int i10 = 0;
        int length2 = dArr3[0].length;
        if (this.f4030d) {
            double d11 = dArr2[0];
            double[] dArr4 = this.f4031e;
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
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i10 < length2) {
                    double d17 = dArr3[i15][i10];
                    double d18 = dArr3[i17][i10];
                    double[][] dArr5 = this.f4029c;
                    dArr[i10] = b(d15, d16, d17, d18, dArr5[i15][i10], dArr5[i17][i10]);
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    @Override // a3.d
    public void getSlope(double d10, double[] dArr) {
        double[] dArr2 = this.f4027a;
        int length = dArr2.length;
        double[][] dArr3 = this.f4028b;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        if (d10 > d11) {
            d11 = dArr2[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            int i11 = i10 + 1;
            double d12 = dArr2[i11];
            if (d11 <= d12) {
                double d13 = dArr2[i10];
                double d14 = d12 - d13;
                double d15 = (d11 - d13) / d14;
                for (int i12 = 0; i12 < length2; i12++) {
                    double d16 = dArr3[i10][i12];
                    double d17 = dArr3[i11][i12];
                    double[][] dArr4 = this.f4029c;
                    dArr[i12] = a(d14, d15, d16, d17, dArr4[i10][i12], dArr4[i11][i12]) / d14;
                }
                return;
            }
            i10 = i11;
        }
    }

    @Override // a3.d
    public double[] getTimePoints() {
        return this.f4027a;
    }

    @Override // a3.d
    public double getSlope(double d10, int i10) {
        double[] dArr = this.f4027a;
        int length = dArr.length;
        int i11 = 0;
        double d11 = dArr[0];
        if (d10 >= d11) {
            d11 = dArr[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        while (i11 < length - 1) {
            int i12 = i11 + 1;
            double d12 = dArr[i12];
            if (d11 <= d12) {
                double d13 = dArr[i11];
                double d14 = d12 - d13;
                double[][] dArr2 = this.f4028b;
                double d15 = dArr2[i11][i10];
                double d16 = dArr2[i12][i10];
                double[][] dArr3 = this.f4029c;
                return a(d14, (d11 - d13) / d14, d15, d16, dArr3[i11][i10], dArr3[i12][i10]) / d14;
            }
            i11 = i12;
        }
        return 0.0d;
    }

    @Override // a3.d
    public void getPos(double d10, float[] fArr) {
        double[] dArr = this.f4027a;
        int length = dArr.length;
        double[][] dArr2 = this.f4028b;
        int i10 = 0;
        int length2 = dArr2[0].length;
        if (this.f4030d) {
            double d11 = dArr[0];
            double[] dArr3 = this.f4031e;
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
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i10 < length2) {
                    double d17 = dArr2[i15][i10];
                    double d18 = dArr2[i17][i10];
                    double[][] dArr4 = this.f4029c;
                    fArr[i10] = (float) b(d15, d16, d17, d18, dArr4[i15][i10], dArr4[i17][i10]);
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    @Override // a3.d
    public double getPos(double d10, int i10) {
        double[] dArr = this.f4027a;
        int length = dArr.length;
        boolean z10 = this.f4030d;
        int i11 = 0;
        double[][] dArr2 = this.f4028b;
        if (z10) {
            double d11 = dArr[0];
            if (d10 <= d11) {
                return (getSlope(d11, i10) * (d10 - d11)) + dArr2[0][i10];
            }
            int i12 = length - 1;
            double d12 = dArr[i12];
            if (d10 >= d12) {
                return (getSlope(d12, i10) * (d10 - d12)) + dArr2[i12][i10];
            }
        } else {
            if (d10 <= dArr[0]) {
                return dArr2[0][i10];
            }
            int i13 = length - 1;
            if (d10 >= dArr[i13]) {
                return dArr2[i13][i10];
            }
        }
        while (i11 < length - 1) {
            double d13 = dArr[i11];
            if (d10 == d13) {
                return dArr2[i11][i10];
            }
            int i14 = i11 + 1;
            double d14 = dArr[i14];
            if (d10 < d14) {
                double d15 = d14 - d13;
                double d16 = (d10 - d13) / d15;
                double d17 = dArr2[i11][i10];
                double d18 = dArr2[i14][i10];
                double[][] dArr3 = this.f4029c;
                return b(d15, d16, d17, d18, dArr3[i11][i10], dArr3[i14][i10]);
            }
            i11 = i14;
        }
        return 0.0d;
    }
}
