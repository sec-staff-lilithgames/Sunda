package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r2 {
    public static final void access$computeSplineInfo(float[] fArr, float[] fArr2, int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19 = 0.0f;
        int i11 = 0;
        float f20 = 0.0f;
        while (true) {
            float f21 = 1.0f;
            if (i11 >= i10) {
                fArr2[i10] = 1.0f;
                fArr[i10] = 1.0f;
                return;
            }
            float f22 = i11 / i10;
            float f23 = 1.0f;
            while (true) {
                f10 = ((f23 - f19) / 2.0f) + f19;
                f11 = f21 - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float fA = e2.a(f10, 0.35000002f, f11 * 0.175f, f12) + f13;
                f14 = f21;
                if (Math.abs(fA - f22) < 1.0E-5d) {
                    break;
                }
                if (fA > f22) {
                    f23 = f10;
                } else {
                    f19 = f10;
                }
                f21 = f14;
            }
            float f24 = 0.5f;
            fArr[i11] = (((f11 * 0.5f) + f10) * f12) + f13;
            float f25 = f14;
            while (true) {
                f15 = ((f25 - f20) / 2.0f) + f20;
                f16 = f14 - f15;
                f17 = f15 * 3.0f * f16;
                f18 = f15 * f15 * f15;
                float fA2 = e2.a(f16, f24, f15, f17) + f18;
                float f26 = f22;
                if (Math.abs(fA2 - f22) >= 1.0E-5d) {
                    if (fA2 > f26) {
                        f25 = f15;
                    } else {
                        f20 = f15;
                    }
                    f22 = f26;
                    f24 = 0.5f;
                }
            }
            fArr2[i11] = (((f15 * 0.35000002f) + (f16 * 0.175f)) * f17) + f18;
            i11++;
        }
    }

    public static final <T> c0.c0 splineBasedDecay(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return c0.e0.generateDecayAnimationSpec(new s2(density));
    }
}
