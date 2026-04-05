package o3;

import android.graphics.Color;
import androidx.appcompat.app.j0;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f77430a = new ThreadLocal();

    public static int HSLToColor(float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3 = 0;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fAbs = (1.0f - Math.abs((f12 * 2.0f) - 1.0f)) * f11;
        float f13 = f12 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f10 / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f10) / 60) {
            case 0:
                iRound3 = Math.round((fAbs + f13) * 255.0f);
                iRound = Math.round((fAbs2 + f13) * 255.0f);
                iRound2 = Math.round(f13 * 255.0f);
                break;
            case 1:
                iRound3 = Math.round((fAbs2 + f13) * 255.0f);
                iRound = Math.round((fAbs + f13) * 255.0f);
                iRound2 = Math.round(f13 * 255.0f);
                break;
            case 2:
                iRound3 = Math.round(f13 * 255.0f);
                iRound = Math.round((fAbs + f13) * 255.0f);
                iRound2 = Math.round((fAbs2 + f13) * 255.0f);
                break;
            case 3:
                iRound3 = Math.round(f13 * 255.0f);
                iRound = Math.round((fAbs2 + f13) * 255.0f);
                iRound2 = Math.round((fAbs + f13) * 255.0f);
                break;
            case 4:
                iRound3 = Math.round((fAbs2 + f13) * 255.0f);
                iRound = Math.round(f13 * 255.0f);
                iRound2 = Math.round((fAbs + f13) * 255.0f);
                break;
            case 5:
            case 6:
                iRound3 = Math.round((fAbs + f13) * 255.0f);
                iRound = Math.round(f13 * 255.0f);
                iRound2 = Math.round((fAbs2 + f13) * 255.0f);
                break;
            default:
                iRound2 = 0;
                iRound = 0;
                break;
        }
        return Color.rgb(b(iRound3), b(iRound), b(iRound2));
    }

    public static int LABToColor(double d10, double d11, double d12) {
        ThreadLocal threadLocal = f77430a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        double[] dArr2 = dArr;
        LABToXYZ(d10, d11, d12, dArr2);
        return XYZToColor(dArr2[0], dArr2[1], dArr2[2]);
    }

    public static void LABToXYZ(double d10, double d11, double d12, double[] dArr) {
        double d13 = (d10 + 16.0d) / 116.0d;
        double d14 = (d11 / 500.0d) + d13;
        double d15 = d13 - (d12 / 200.0d);
        double dPow = Math.pow(d14, 3.0d);
        if (dPow <= 0.008856d) {
            dPow = ((d14 * 116.0d) - 16.0d) / 903.3d;
        }
        double dPow2 = d10 > 7.9996247999999985d ? Math.pow(d13, 3.0d) : d10 / 903.3d;
        double dPow3 = Math.pow(d15, 3.0d);
        if (dPow3 <= 0.008856d) {
            dPow3 = ((d15 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = dPow * 95.047d;
        dArr[1] = dPow2 * 100.0d;
        dArr[2] = dPow3 * 108.883d;
    }

    public static int M3HCTToColor(float f10, float f11, float f12) {
        return n3.a.toColor(f10, f11, f12);
    }

    public static void RGBToHSL(int i10, int i11, int i12, float[] fArr) {
        float f10;
        float fAbs;
        float f11 = i10 / 255.0f;
        float f12 = i11 / 255.0f;
        float f13 = i12 / 255.0f;
        float fMax = Math.max(f11, Math.max(f12, f13));
        float fMin = Math.min(f11, Math.min(f12, f13));
        float f14 = fMax - fMin;
        float f15 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f10 = 0.0f;
            fAbs = 0.0f;
        } else {
            f10 = fMax == f11 ? ((f12 - f13) / f14) % 6.0f : fMax == f12 ? ((f13 - f11) / f14) + 2.0f : 4.0f + ((f11 - f12) / f14);
            fAbs = f14 / (1.0f - Math.abs((2.0f * f15) - 1.0f));
        }
        float f16 = (f10 * 60.0f) % 360.0f;
        if (f16 < 0.0f) {
            f16 += 360.0f;
        }
        fArr[0] = f16 < 0.0f ? 0.0f : Math.min(f16, 360.0f);
        fArr[1] = fAbs < 0.0f ? 0.0f : Math.min(fAbs, 1.0f);
        fArr[2] = f15 >= 0.0f ? Math.min(f15, 1.0f) : 0.0f;
    }

    public static void RGBToLAB(int i10, int i11, int i12, double[] dArr) {
        RGBToXYZ(i10, i11, i12, dArr);
        XYZToLAB(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void RGBToXYZ(int i10, int i11, int i12, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = i10 / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = i11 / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = i12 / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        dArr[1] = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
    }

    public static int XYZToColor(double d10, double d11, double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        return Color.rgb(b((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d)), b((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d)), b((int) Math.round((d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d) * 255.0d)));
    }

    public static void XYZToLAB(double d10, double d11, double d12, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double dC = c(d10 / 95.047d);
        double dC2 = c(d11 / 100.0d);
        double dC3 = c(d12 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * dC2) - 16.0d);
        dArr[1] = (dC - dC2) * 500.0d;
        dArr[2] = (dC2 - dC3) * 200.0d;
    }

    public static int a(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return o2.b(255, i11, i12 * i13, (i10 * 255) * i11) / (i14 * 255);
    }

    public static int b(int i10) {
        if (i10 < 0) {
            return 0;
        }
        return Math.min(i10, 255);
    }

    public static int blendARGB(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), (int) ((Color.red(i11) * f10) + (Color.red(i10) * f11)), (int) ((Color.green(i11) * f10) + (Color.green(i10) * f11)), (int) ((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static void blendHSL(float[] fArr, float[] fArr2, float f10, float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f11 = 1.0f - f10;
        float f12 = fArr[0];
        float f13 = fArr2[0];
        if (Math.abs(f13 - f12) > 180.0f) {
            if (f13 > f12) {
                f12 += 360.0f;
            } else {
                f13 += 360.0f;
            }
        }
        fArr3[0] = (((f13 - f12) * f10) + f12) % 360.0f;
        fArr3[1] = (fArr2[1] * f10) + (fArr[1] * f11);
        fArr3[2] = (fArr2[2] * f10) + (fArr[2] * f11);
    }

    public static void blendLAB(double[] dArr, double[] dArr2, double d10, double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d11 = 1.0d - d10;
        dArr3[0] = (dArr2[0] * d10) + (dArr[0] * d11);
        dArr3[1] = (dArr2[1] * d10) + (dArr[1] * d11);
        dArr3[2] = (dArr2[2] * d10) + (dArr[2] * d11);
    }

    public static double c(double d10) {
        return d10 > 0.008856d ? Math.pow(d10, 0.3333333333333333d) : ((d10 * 903.3d) + 16.0d) / 116.0d;
    }

    public static double calculateContrast(int i10, int i11) {
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException(w0.i.b(i11, new StringBuilder("background can not be translucent: #")));
        }
        if (Color.alpha(i10) < 255) {
            i10 = compositeColors(i10, i11);
        }
        double dCalculateLuminance = calculateLuminance(i10) + 0.05d;
        double dCalculateLuminance2 = calculateLuminance(i11) + 0.05d;
        return Math.max(dCalculateLuminance, dCalculateLuminance2) / Math.min(dCalculateLuminance, dCalculateLuminance2);
    }

    public static double calculateLuminance(int i10) {
        ThreadLocal threadLocal = f77430a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        colorToXYZ(i10, dArr);
        return dArr[1] / 100.0d;
    }

    public static int calculateMinimumAlpha(int i10, int i11, float f10) {
        int i12 = 255;
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException(w0.i.b(i11, new StringBuilder("background can not be translucent: #")));
        }
        double d10 = f10;
        if (calculateContrast(setAlphaComponent(i10, 255), i11) < d10) {
            return -1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 <= 10 && i12 - i13 > 1; i14++) {
            int i15 = (i13 + i12) / 2;
            if (calculateContrast(setAlphaComponent(i10, i15), i11) < d10) {
                i13 = i15;
            } else {
                i12 = i15;
            }
        }
        return i12;
    }

    public static void colorToHSL(int i10, float[] fArr) {
        RGBToHSL(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
    }

    public static void colorToLAB(int i10, double[] dArr) {
        RGBToLAB(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static void colorToM3HCT(int i10, float[] fArr) {
        n3.a.getM3HCTfromColor(i10, fArr);
    }

    public static void colorToXYZ(int i10, double[] dArr) {
        RGBToXYZ(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static int compositeColors(int i10, int i11) {
        int iAlpha = Color.alpha(i11);
        int iAlpha2 = Color.alpha(i10);
        int i12 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i12, a(Color.red(i10), iAlpha2, Color.red(i11), iAlpha, i12), a(Color.green(i10), iAlpha2, Color.green(i11), iAlpha, i12), a(Color.blue(i10), iAlpha2, Color.blue(i11), iAlpha, i12));
    }

    public static double distanceEuclidean(double[] dArr, double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[2] - dArr2[2], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[0] - dArr2[0], 2.0d));
    }

    public static int setAlphaComponent(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }

    public static Color compositeColors(Color color, Color color2) {
        return j0.d(color, color2);
    }
}
