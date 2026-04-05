package rg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class a {
    public static boolean areAllElementsEqual(float[] fArr) {
        if (fArr.length <= 1) {
            return true;
        }
        float f10 = fArr[0];
        for (int i10 = 1; i10 < fArr.length; i10++) {
            if (fArr[i10] != f10) {
                return false;
            }
        }
        return true;
    }

    public static float dist(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f12 - f10, f13 - f11);
    }

    public static float distanceToFurthestCorner(float f10, float f11, float f12, float f13, float f14, float f15) {
        float fDist = dist(f10, f11, f12, f13);
        float fDist2 = dist(f10, f11, f14, f13);
        float fDist3 = dist(f10, f11, f14, f15);
        float fDist4 = dist(f10, f11, f12, f15);
        return (fDist <= fDist2 || fDist <= fDist3 || fDist <= fDist4) ? (fDist2 <= fDist3 || fDist2 <= fDist4) ? fDist3 > fDist4 ? fDist3 : fDist4 : fDist2 : fDist;
    }

    public static float floorMod(float f10, int i10) {
        float f11 = i10;
        int i11 = (int) (f10 / f11);
        if (Math.signum(f10) * f11 < 0.0f && i11 * i10 != f10) {
            i11--;
        }
        return f10 - (i11 * i10);
    }

    public static boolean geq(float f10, float f11, float f12) {
        return f10 + f12 >= f11;
    }

    public static float lerp(float f10, float f11, float f12) {
        return (f12 * f11) + ((1.0f - f12) * f10);
    }

    public static int floorMod(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i12 * i11 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }
}
