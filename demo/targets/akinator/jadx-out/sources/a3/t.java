package a3;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public float[] f4032a = new float[0];

    /* renamed from: b, reason: collision with root package name */
    public double[] f4033b = new double[0];

    /* renamed from: c, reason: collision with root package name */
    public double[] f4034c;

    /* renamed from: d, reason: collision with root package name */
    public s f4035d;

    /* renamed from: e, reason: collision with root package name */
    public int f4036e;

    public final double a(double d10) {
        if (d10 <= 0.0d) {
            return 0.0d;
        }
        if (d10 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f4033b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f4032a;
        float f10 = fArr[iBinarySearch];
        int i10 = iBinarySearch - 1;
        float f11 = fArr[i10];
        double d11 = f10 - f11;
        double[] dArr = this.f4033b;
        double d12 = dArr[iBinarySearch];
        double d13 = dArr[i10];
        double d14 = d11 / (d12 - d13);
        return ((((d10 * d10) - (d13 * d13)) * d14) / 2.0d) + ((d10 - d13) * (f11 - (d14 * d13))) + this.f4034c[i10];
    }

    public void addPoint(double d10, float f10) {
        int length = this.f4032a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f4033b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f4033b = Arrays.copyOf(this.f4033b, length);
        this.f4032a = Arrays.copyOf(this.f4032a, length);
        this.f4034c = new double[length];
        double[] dArr = this.f4033b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f4033b[iBinarySearch] = d10;
        this.f4032a[iBinarySearch] = f10;
    }

    public double getSlope(double d10, double d11, double d12) {
        double d13;
        double dA = a(d10) + d11;
        if (d10 <= 0.0d) {
            d13 = 0.0d;
        } else if (d10 >= 1.0d) {
            d13 = 1.0d;
        } else {
            int iBinarySearch = Arrays.binarySearch(this.f4033b, d10);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 1;
            }
            float[] fArr = this.f4032a;
            float f10 = fArr[iBinarySearch];
            int i10 = iBinarySearch - 1;
            float f11 = fArr[i10];
            double d14 = f10 - f11;
            double[] dArr = this.f4033b;
            double d15 = dArr[iBinarySearch];
            double d16 = dArr[i10];
            double d17 = d14 / (d15 - d16);
            d13 = (f11 - (d17 * d16)) + (d10 * d17);
        }
        double d18 = d13 + d12;
        switch (this.f4036e) {
            case 1:
                return 0.0d;
            case 2:
                return Math.signum((((dA * 4.0d) + 3.0d) % 4.0d) - 2.0d) * d18 * 4.0d;
            case 3:
                return d18 * 2.0d;
            case 4:
                return (-d18) * 2.0d;
            case 5:
                return Math.sin(6.283185307179586d * dA) * (-6.283185307179586d) * d18;
            case 6:
                return ((((dA * 4.0d) + 2.0d) % 4.0d) - 2.0d) * d18 * 4.0d;
            case 7:
                return this.f4035d.getSlope(dA % 1.0d, 0);
            default:
                return Math.cos(6.283185307179586d * dA) * d18 * 6.283185307179586d;
        }
    }

    public double getValue(double d10, double d11) {
        double dAbs;
        double dA = a(d10) + d11;
        switch (this.f4036e) {
            case 1:
                return Math.signum(0.5d - (dA % 1.0d));
            case 2:
                dAbs = Math.abs((((dA * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dA * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dA * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d11 + dA) * 6.283185307179586d);
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dA * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f4035d.getPos(dA % 1.0d, 0);
            default:
                return Math.sin(6.283185307179586d * dA);
        }
        return 1.0d - dAbs;
    }

    public void normalize() {
        double d10 = 0.0d;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f4032a.length) {
                break;
            }
            d10 += r6[i10];
            i10++;
        }
        int i11 = 1;
        double d11 = 0.0d;
        int i12 = 1;
        while (true) {
            float[] fArr = this.f4032a;
            if (i12 >= fArr.length) {
                break;
            }
            int i13 = i12 - 1;
            float f10 = (fArr[i13] + fArr[i12]) / 2.0f;
            double[] dArr = this.f4033b;
            d11 += (dArr[i12] - dArr[i13]) * f10;
            i12++;
        }
        int i14 = 0;
        while (true) {
            float[] fArr2 = this.f4032a;
            if (i14 >= fArr2.length) {
                break;
            }
            fArr2[i14] = fArr2[i14] * ((float) (d10 / d11));
            i14++;
        }
        this.f4034c[0] = 0.0d;
        while (true) {
            float[] fArr3 = this.f4032a;
            if (i11 >= fArr3.length) {
                return;
            }
            int i15 = i11 - 1;
            float f11 = (fArr3[i15] + fArr3[i11]) / 2.0f;
            double[] dArr2 = this.f4033b;
            double d12 = dArr2[i11] - dArr2[i15];
            double[] dArr3 = this.f4034c;
            dArr3[i11] = (d12 * f11) + dArr3[i15];
            i11++;
        }
    }

    public void setType(int i10, String str) {
        this.f4036e = i10;
        if (str != null) {
            this.f4035d = s.buildWave(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f4033b) + " period=" + Arrays.toString(this.f4032a);
    }
}
