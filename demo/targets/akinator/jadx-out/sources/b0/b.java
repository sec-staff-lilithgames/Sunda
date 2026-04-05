package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8331a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f8332b;

    static {
        float[] fArr = new float[101];
        f8332b = fArr;
        r2.access$computeSplineInfo(fArr, new float[101], 100);
    }

    public final double deceleration(float f10, float f11) {
        return Math.log((Math.abs(f10) * 0.35f) / f11);
    }

    public final a flingPosition(float f10) {
        float fA;
        float f11;
        float f12 = 100;
        int i10 = (int) (f12 * f10);
        if (i10 < 100) {
            float f13 = i10 / f12;
            int i11 = i10 + 1;
            float f14 = i11 / f12;
            float[] fArr = f8332b;
            float f15 = fArr[i10];
            f11 = (fArr[i11] - f15) / (f14 - f13);
            fA = j1.o2.a(f10, f13, f11, f15);
        } else {
            fA = 1.0f;
            f11 = 0.0f;
        }
        return new a(fA, f11);
    }
}
