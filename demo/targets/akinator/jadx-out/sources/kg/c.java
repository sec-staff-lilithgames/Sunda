package kg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final double[][] f70950a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* renamed from: b, reason: collision with root package name */
    public static final double[][] f70951b = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* renamed from: c, reason: collision with root package name */
    public static final double[] f70952c = {95.047d, 100.0d, 108.883d};

    public static double a(double d10) {
        return d10 > 0.008856451679035631d ? Math.pow(d10, 0.3333333333333333d) : ((d10 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static int alphaFromArgb(int i10) {
        return (i10 >> 24) & 255;
    }

    public static int argbFromLab(double d10, double d11, double d12) {
        double d13 = (d10 + 16.0d) / 116.0d;
        double d14 = d13 - (d12 / 200.0d);
        double dB = b((d11 / 500.0d) + d13);
        double dB2 = b(d13);
        double dB3 = b(d14);
        double[] dArr = f70952c;
        return argbFromXyz(dB * dArr[0], dB2 * dArr[1], dB3 * dArr[2]);
    }

    public static int argbFromLinrgb(double[] dArr) {
        return argbFromRgb(delinearized(dArr[0]), delinearized(dArr[1]), delinearized(dArr[2]));
    }

    public static int argbFromLstar(double d10) {
        int iDelinearized = delinearized(yFromLstar(d10));
        return argbFromRgb(iDelinearized, iDelinearized, iDelinearized);
    }

    public static int argbFromRgb(int i10, int i11, int i12) {
        return ((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255);
    }

    public static int argbFromXyz(double d10, double d11, double d12) {
        double[][] dArr = f70951b;
        double[] dArr2 = dArr[0];
        double d13 = (dArr2[2] * d12) + (dArr2[1] * d11) + (dArr2[0] * d10);
        double[] dArr3 = dArr[1];
        double d14 = (dArr3[2] * d12) + (dArr3[1] * d11) + (dArr3[0] * d10);
        double[] dArr4 = dArr[2];
        return argbFromRgb(delinearized(d13), delinearized(d14), delinearized((dArr4[2] * d12) + (dArr4[1] * d11) + (dArr4[0] * d10)));
    }

    public static double b(double d10) {
        double d11 = d10 * d10 * d10;
        return d11 > 0.008856451679035631d ? d11 : ((d10 * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    public static int blueFromArgb(int i10) {
        return i10 & 255;
    }

    public static int delinearized(double d10) {
        double d11 = d10 / 100.0d;
        return f.clampInt(0, 255, (int) Math.round((d11 <= 0.0031308d ? d11 * 12.92d : (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    public static int greenFromArgb(int i10) {
        return (i10 >> 8) & 255;
    }

    public static boolean isOpaque(int i10) {
        return alphaFromArgb(i10) >= 255;
    }

    public static double[] labFromArgb(int i10) {
        double dLinearized = linearized(redFromArgb(i10));
        double dLinearized2 = linearized(greenFromArgb(i10));
        double dLinearized3 = linearized(blueFromArgb(i10));
        double[][] dArr = f70950a;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[2] * dLinearized3) + (dArr2[1] * dLinearized2) + (dArr2[0] * dLinearized);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[2] * dLinearized3) + (dArr3[1] * dLinearized2) + (dArr3[0] * dLinearized);
        double[] dArr4 = dArr[2];
        double d12 = (dArr4[2] * dLinearized3) + (dArr4[1] * dLinearized2) + (dArr4[0] * dLinearized);
        double[] dArr5 = f70952c;
        double d13 = d10 / dArr5[0];
        double d14 = d11 / dArr5[1];
        double d15 = d12 / dArr5[2];
        double dA = a(d13);
        double dA2 = a(d14);
        return new double[]{(116.0d * dA2) - 16.0d, (dA - dA2) * 500.0d, (dA2 - a(d15)) * 200.0d};
    }

    public static double linearized(int i10) {
        double d10 = i10 / 255.0d;
        return (d10 <= 0.040449936d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static double lstarFromArgb(int i10) {
        return (a(xyzFromArgb(i10)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public static double lstarFromY(double d10) {
        return (a(d10 / 100.0d) * 116.0d) - 16.0d;
    }

    public static int redFromArgb(int i10) {
        return (i10 >> 16) & 255;
    }

    public static double[] whitePointD65() {
        return f70952c;
    }

    public static double[] xyzFromArgb(int i10) {
        return f.matrixMultiply(new double[]{linearized(redFromArgb(i10)), linearized(greenFromArgb(i10)), linearized(blueFromArgb(i10))}, f70950a);
    }

    public static double yFromLstar(double d10) {
        return b((d10 + 16.0d) / 116.0d) * 100.0d;
    }
}
