package kg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: k, reason: collision with root package name */
    public static final g f70961k = defaultWithBackgroundLstar(50.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f70962a;

    /* renamed from: b, reason: collision with root package name */
    public final double f70963b;

    /* renamed from: c, reason: collision with root package name */
    public final double f70964c;

    /* renamed from: d, reason: collision with root package name */
    public final double f70965d;

    /* renamed from: e, reason: collision with root package name */
    public final double f70966e;

    /* renamed from: f, reason: collision with root package name */
    public final double f70967f;

    /* renamed from: g, reason: collision with root package name */
    public final double[] f70968g;

    /* renamed from: h, reason: collision with root package name */
    public final double f70969h;

    /* renamed from: i, reason: collision with root package name */
    public final double f70970i;

    /* renamed from: j, reason: collision with root package name */
    public final double f70971j;

    public g(double d10, double d11, double d12, double d13, double d14, double d15, double[] dArr, double d16, double d17, double d18) {
        this.f70967f = d10;
        this.f70962a = d11;
        this.f70963b = d12;
        this.f70964c = d13;
        this.f70965d = d14;
        this.f70966e = d15;
        this.f70968g = dArr;
        this.f70969h = d16;
        this.f70970i = d17;
        this.f70971j = d18;
    }

    public static g defaultWithBackgroundLstar(double d10) {
        return make(c.whitePointD65(), (c.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d10, 2.0d, false);
    }

    public static g make(double[] dArr, double d10, double d11, double d12, boolean z10) {
        double dMax = Math.max(0.1d, d11);
        double d13 = dArr[0];
        double[][] dArr2 = b.f70938k;
        double[] dArr3 = dArr2[0];
        double d14 = dArr3[0] * d13;
        double d15 = dArr[1];
        double d16 = (dArr3[1] * d15) + d14;
        double d17 = dArr[2];
        double d18 = (dArr3[2] * d17) + d16;
        double[] dArr4 = dArr2[1];
        double d19 = (dArr4[2] * d17) + (dArr4[1] * d15) + (dArr4[0] * d13);
        double[] dArr5 = dArr2[2];
        double d20 = (d17 * dArr5[2]) + (d15 * dArr5[1]) + (d13 * dArr5[0]);
        double d21 = (d12 / 10.0d) + 0.8d;
        double dLerp = d21 >= 0.9d ? f.lerp(0.59d, 0.69d, (d21 - 0.9d) * 10.0d) : f.lerp(0.525d, 0.59d, (d21 - 0.8d) * 10.0d);
        double dClampDouble = f.clampDouble(0.0d, 1.0d, z10 ? 1.0d : (1.0d - (Math.exp(((-d10) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d21);
        double[] dArr6 = {(((100.0d / d18) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d19) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d20) * dClampDouble) + 1.0d) - dClampDouble};
        double d22 = 5.0d * d10;
        double d23 = 1.0d / (d22 + 1.0d);
        double d24 = d23 * d23 * d23 * d23;
        double d25 = 1.0d - d24;
        double dCbrt = (Math.cbrt(d22) * 0.1d * d25 * d25) + (d24 * d10);
        double dYFromLstar = c.yFromLstar(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dYFromLstar) + 1.48d;
        double dPow = 0.725d / Math.pow(dYFromLstar, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d18) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d19) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d20) / 100.0d, 0.42d)};
        double d26 = dArr7[0];
        double d27 = (d26 * 400.0d) / (d26 + 27.13d);
        double d28 = dArr7[1];
        double d29 = (d28 * 400.0d) / (d28 + 27.13d);
        double d30 = dArr7[2];
        double[] dArr8 = {d27, d29, (400.0d * d30) / (d30 + 27.13d)};
        return new g(dYFromLstar, ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * dPow, dPow, dPow, dLerp, d21, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public double getAw() {
        return this.f70962a;
    }

    public double getFlRoot() {
        return this.f70970i;
    }

    public double getN() {
        return this.f70967f;
    }

    public double getNbb() {
        return this.f70963b;
    }

    public double[] getRgbD() {
        return this.f70968g;
    }
}
