package kg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    public static final double[][] f70938k = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* renamed from: l, reason: collision with root package name */
    public static final double[][] f70939l = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    /* renamed from: a, reason: collision with root package name */
    public final double f70940a;

    /* renamed from: b, reason: collision with root package name */
    public final double f70941b;

    /* renamed from: c, reason: collision with root package name */
    public final double f70942c;

    /* renamed from: d, reason: collision with root package name */
    public final double f70943d;

    /* renamed from: e, reason: collision with root package name */
    public final double f70944e;

    /* renamed from: f, reason: collision with root package name */
    public final double f70945f;

    /* renamed from: g, reason: collision with root package name */
    public final double f70946g;

    /* renamed from: h, reason: collision with root package name */
    public final double f70947h;

    /* renamed from: i, reason: collision with root package name */
    public final double f70948i;

    /* renamed from: j, reason: collision with root package name */
    public final double[] f70949j = {0.0d, 0.0d, 0.0d};

    public b(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f70940a = d10;
        this.f70941b = d11;
        this.f70942c = d12;
        this.f70943d = d13;
        this.f70944e = d14;
        this.f70945f = d15;
        this.f70946g = d16;
        this.f70947h = d17;
        this.f70948i = d18;
    }

    public static b a(double d10, double d11, double d12, g gVar) {
        double[][] dArr = f70938k;
        double[] dArr2 = dArr[0];
        double d13 = (dArr2[2] * d12) + (dArr2[1] * d11) + (dArr2[0] * d10);
        double[] dArr3 = dArr[1];
        double d14 = (dArr3[2] * d12) + (dArr3[1] * d11) + (dArr3[0] * d10);
        double[] dArr4 = dArr[2];
        double d15 = (dArr4[2] * d12) + (dArr4[1] * d11) + (dArr4[0] * d10);
        double[] rgbD = gVar.getRgbD();
        double d16 = gVar.f70965d;
        double d17 = rgbD[0] * d13;
        double d18 = gVar.getRgbD()[1] * d14;
        double d19 = gVar.getRgbD()[2] * d15;
        double d20 = gVar.f70969h;
        double dPow = Math.pow((Math.abs(d17) * d20) / 100.0d, 0.42d);
        double dPow2 = Math.pow((Math.abs(d18) * d20) / 100.0d, 0.42d);
        double dPow3 = Math.pow((Math.abs(d19) * d20) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d17) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d18) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d19) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d21 = ((((-12.0d) * dSignum2) + (dSignum * 11.0d)) + dSignum3) / 11.0d;
        double d22 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d23 = dSignum2 * 20.0d;
        double d24 = ((21.0d * dSignum3) + ((dSignum * 20.0d) + d23)) / 20.0d;
        double d25 = (((dSignum * 40.0d) + d23) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d22, d21));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d26 = degrees;
        double radians = Math.toRadians(d26);
        double dPow4 = Math.pow((gVar.getNbb() * d25) / gVar.getAw(), gVar.f70971j * d16) * 100.0d;
        double d27 = dPow4 / 100.0d;
        double flRoot = gVar.getFlRoot() * (gVar.getAw() + 4.0d) * Math.sqrt(d27) * (4.0d / d16);
        double dPow5 = Math.pow((Math.hypot(d21, d22) * (((((Math.cos(Math.toRadians(d26 < 20.14d ? d26 + 360.0d : d26) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * gVar.f70966e) * gVar.f70964c)) / (d24 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, gVar.getN()), 0.73d);
        double dSqrt = Math.sqrt(d27) * dPow5;
        double flRoot2 = gVar.getFlRoot() * dSqrt;
        double dSqrt2 = Math.sqrt((dPow5 * d16) / (gVar.getAw() + 4.0d)) * 50.0d;
        double d28 = (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new b(d26, dSqrt, dPow4, flRoot, flRoot2, dSqrt2, d28, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public static b fromInt(int i10) {
        g gVar = g.f70961k;
        double dLinearized = c.linearized((16711680 & i10) >> 16);
        double dLinearized2 = c.linearized((65280 & i10) >> 8);
        double dLinearized3 = c.linearized(i10 & 255);
        return a((0.18051042d * dLinearized3) + (0.35762064d * dLinearized2) + (0.41233895d * dLinearized), (0.0722d * dLinearized3) + (0.7152d * dLinearized2) + (0.2126d * dLinearized), (dLinearized3 * 0.95034478d) + (dLinearized2 * 0.11916382d) + (dLinearized * 0.01932141d), gVar);
    }

    public static b fromUcs(double d10, double d11, double d12) {
        return fromUcsInViewingConditions(d10, d11, d12, g.f70961k);
    }

    public static b fromUcsInViewingConditions(double d10, double d11, double d12, g gVar) {
        double dExpm1 = Math.expm1(Math.hypot(d11, d12) * 0.0228d) / 0.0228d;
        double flRoot = gVar.getFlRoot();
        double d13 = gVar.f70965d;
        double d14 = dExpm1 / flRoot;
        double dAtan2 = Math.atan2(d12, d11) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        double d15 = dAtan2;
        double d16 = d10 / (1.0d - ((d10 - 100.0d) * 0.007d));
        double d17 = d16 / 100.0d;
        double flRoot2 = gVar.getFlRoot() * (gVar.getAw() + 4.0d) * Math.sqrt(d17) * (4.0d / d13);
        double flRoot3 = gVar.getFlRoot() * d14;
        double dSqrt = Math.sqrt(((d14 / Math.sqrt(d17)) * d13) / (gVar.getAw() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d15);
        double dLog1p = Math.log1p(0.0228d * flRoot3) * 43.859649122807014d;
        return new b(d15, d14, d16, flRoot2, flRoot3, dSqrt, (1.7000000000000002d * d16) / ((0.007d * d16) + 1.0d), Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public final double[] b(g gVar, double[] dArr) {
        double chroma = (getChroma() == 0.0d || getJ() == 0.0d) ? 0.0d : getChroma() / Math.sqrt(getJ() / 100.0d);
        double n9 = gVar.getN();
        double d10 = gVar.f70969h;
        double dPow = Math.pow(chroma / Math.pow(1.64d - Math.pow(0.29d, n9), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double dCos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double dPow2 = Math.pow(getJ() / 100.0d, (1.0d / gVar.f70965d) / gVar.f70971j) * gVar.getAw();
        double d11 = dCos * 3846.153846153846d * gVar.f70966e * gVar.f70964c;
        double nbb = dPow2 / gVar.getNbb();
        double dSin = Math.sin(radians);
        double dCos2 = Math.cos(radians);
        double d12 = (((0.305d + nbb) * 23.0d) * dPow) / (((dPow * 108.0d) * dSin) + (((11.0d * dPow) * dCos2) + (d11 * 23.0d)));
        double d13 = dCos2 * d12;
        double d14 = d12 * dSin;
        double d15 = nbb * 460.0d;
        double d16 = ((288.0d * d14) + ((451.0d * d13) + d15)) / 1403.0d;
        double d17 = ((d15 - (891.0d * d13)) - (261.0d * d14)) / 1403.0d;
        double d18 = ((d15 - (d13 * 220.0d)) - (d14 * 6300.0d)) / 1403.0d;
        double dPow3 = Math.pow(Math.max(0.0d, (Math.abs(d16) * 27.13d) / (400.0d - Math.abs(d16))), 2.380952380952381d) * (100.0d / d10) * Math.signum(d16);
        double dPow4 = Math.pow(Math.max(0.0d, (Math.abs(d17) * 27.13d) / (400.0d - Math.abs(d17))), 2.380952380952381d) * (100.0d / d10) * Math.signum(d17);
        double dPow5 = Math.pow(Math.max(0.0d, (Math.abs(d18) * 27.13d) / (400.0d - Math.abs(d18))), 2.380952380952381d) * (100.0d / d10) * Math.signum(d18);
        double d19 = dPow3 / gVar.getRgbD()[0];
        double d20 = dPow4 / gVar.getRgbD()[1];
        double d21 = dPow5 / gVar.getRgbD()[2];
        double[][] dArr2 = f70939l;
        double[] dArr3 = dArr2[0];
        double d22 = (dArr3[2] * d21) + (dArr3[1] * d20) + (dArr3[0] * d19);
        double[] dArr4 = dArr2[1];
        double d23 = (dArr4[2] * d21) + (dArr4[1] * d20) + (dArr4[0] * d19);
        double[] dArr5 = dArr2[2];
        double d24 = (d21 * dArr5[2]) + (d20 * dArr5[1]) + (d19 * dArr5[0]);
        if (dArr == null) {
            return new double[]{d22, d23, d24};
        }
        dArr[0] = d22;
        dArr[1] = d23;
        dArr[2] = d24;
        return dArr;
    }

    public double distance(b bVar) {
        double jstar = getJstar() - bVar.getJstar();
        double astar = getAstar() - bVar.getAstar();
        double bstar = getBstar() - bVar.getBstar();
        return Math.pow(Math.sqrt((bstar * bstar) + (astar * astar) + (jstar * jstar)), 0.63d) * 1.41d;
    }

    public double getAstar() {
        return this.f70947h;
    }

    public double getBstar() {
        return this.f70948i;
    }

    public double getChroma() {
        return this.f70941b;
    }

    public double getHue() {
        return this.f70940a;
    }

    public double getJ() {
        return this.f70942c;
    }

    public double getJstar() {
        return this.f70946g;
    }

    public double getM() {
        return this.f70944e;
    }

    public double getQ() {
        return this.f70943d;
    }

    public double getS() {
        return this.f70945f;
    }

    public int toInt() {
        double[] dArrB = b(g.f70961k, this.f70949j);
        return c.argbFromXyz(dArrB[0], dArrB[1], dArrB[2]);
    }
}
