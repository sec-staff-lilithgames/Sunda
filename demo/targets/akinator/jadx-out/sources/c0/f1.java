package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f1 {
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(tu.v r30, double r31, double r33, double r35, double r37) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.f1.a(tu.v, double, double, double, double):long");
    }

    public static final long estimateAnimationDurationMillis(float f10, float f11, float f12, float f13, float f14) {
        return estimateAnimationDurationMillis(f10, f11, f12, f13, f14);
    }

    public static final long estimateAnimationDurationMillis(double d10, double d11, double d12, double d13, double d14) {
        return a(z.complexQuadraticFormula(1.0d, Math.sqrt(d10) * 2.0d * d11, d10), d11, d12, d13, d14);
    }

    public static final long estimateAnimationDurationMillis(double d10, double d11, double d12, double d13, double d14, double d15) {
        return a(z.complexQuadraticFormula(d12, d11, d10), d11 / (Math.sqrt(d10 * d12) * 2.0d), d13, d14, d15);
    }
}
