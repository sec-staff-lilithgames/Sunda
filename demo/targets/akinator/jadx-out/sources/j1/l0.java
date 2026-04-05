package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 {
    public l0(kotlin.jvm.internal.u uVar) {
    }

    public static float a(float f10, float f11, float f12, int i10) {
        float f13 = ((f10 / 30.0f) + i10) % 12.0f;
        return f12 - (Math.max(-1.0f, Math.min(f13 - 3, Math.min(9 - f13, 1.0f))) * (Math.min(f12, 1.0f - f12) * f11));
    }

    public static float b(float f10, float f11, float f12, int i10) {
        float f13 = ((f10 / 60.0f) + i10) % 6.0f;
        return f12 - (Math.max(0.0f, Math.min(f13, Math.min(4 - f13, 1.0f))) * (f11 * f12));
    }

    /* renamed from: hsl-JlNiLsg$default, reason: not valid java name */
    public static /* synthetic */ long m4823hslJlNiLsg$default(l0 l0Var, float f10, float f11, float f12, float f13, k1.z zVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        float f14 = f13;
        if ((i10 & 16) != 0) {
            zVar = k1.k.f70039a.getSrgb();
        }
        return l0Var.m4838hslJlNiLsg(f10, f11, f12, f14, zVar);
    }

    /* renamed from: hsv-JlNiLsg$default, reason: not valid java name */
    public static /* synthetic */ long m4824hsvJlNiLsg$default(l0 l0Var, float f10, float f11, float f12, float f13, k1.z zVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        float f14 = f13;
        if ((i10 & 16) != 0) {
            zVar = k1.k.f70039a.getSrgb();
        }
        return l0Var.m4839hsvJlNiLsg(f10, f11, f12, f14, zVar);
    }

    /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
    public final long m4825getBlack0d7_KjU() {
        return m0.f68919c;
    }

    /* renamed from: getBlue-0d7_KjU, reason: not valid java name */
    public final long m4826getBlue0d7_KjU() {
        return m0.f68926j;
    }

    /* renamed from: getCyan-0d7_KjU, reason: not valid java name */
    public final long m4827getCyan0d7_KjU() {
        return m0.f68928l;
    }

    /* renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
    public final long m4828getDarkGray0d7_KjU() {
        return m0.f68920d;
    }

    /* renamed from: getGray-0d7_KjU, reason: not valid java name */
    public final long m4829getGray0d7_KjU() {
        return m0.f68921e;
    }

    /* renamed from: getGreen-0d7_KjU, reason: not valid java name */
    public final long m4830getGreen0d7_KjU() {
        return m0.f68925i;
    }

    /* renamed from: getLightGray-0d7_KjU, reason: not valid java name */
    public final long m4831getLightGray0d7_KjU() {
        return m0.f68922f;
    }

    /* renamed from: getMagenta-0d7_KjU, reason: not valid java name */
    public final long m4832getMagenta0d7_KjU() {
        return m0.f68929m;
    }

    /* renamed from: getRed-0d7_KjU, reason: not valid java name */
    public final long m4833getRed0d7_KjU() {
        return m0.f68924h;
    }

    /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
    public final long m4834getTransparent0d7_KjU() {
        return m0.f68930n;
    }

    /* renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
    public final long m4835getUnspecified0d7_KjU() {
        return m0.f68931o;
    }

    /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
    public final long m4836getWhite0d7_KjU() {
        return m0.f68923g;
    }

    /* renamed from: getYellow-0d7_KjU, reason: not valid java name */
    public final long m4837getYellow0d7_KjU() {
        return m0.f68927k;
    }

    /* renamed from: hsl-JlNiLsg, reason: not valid java name */
    public final long m4838hslJlNiLsg(float f10, float f11, float f12, float f13, k1.z colorSpace) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colorSpace, "colorSpace");
        if (0.0f <= f10 && f10 <= 360.0f && 0.0f <= f11 && f11 <= 1.0f && 0.0f <= f12 && f12 <= 1.0f) {
            return o0.Color(a(f10, f11, f12, 0), a(f10, f11, f12, 8), a(f10, f11, f12, 4), f13, colorSpace);
        }
        throw new IllegalArgumentException(("HSL (" + f10 + ", " + f11 + ", " + f12 + ") must be in range (0..360, 0..1, 0..1)").toString());
    }

    /* renamed from: hsv-JlNiLsg, reason: not valid java name */
    public final long m4839hsvJlNiLsg(float f10, float f11, float f12, float f13, k1.z colorSpace) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colorSpace, "colorSpace");
        if (0.0f <= f10 && f10 <= 360.0f && 0.0f <= f11 && f11 <= 1.0f && 0.0f <= f12 && f12 <= 1.0f) {
            return o0.Color(b(f10, f11, f12, 5), b(f10, f11, f12, 3), b(f10, f11, f12, 1), f13, colorSpace);
        }
        throw new IllegalArgumentException(("HSV (" + f10 + ", " + f11 + ", " + f12 + ") must be in range (0..360, 0..1, 0..1)").toString());
    }

    /* renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4810getBlack0d7_KjU$annotations() {
    }

    /* renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4811getBlue0d7_KjU$annotations() {
    }

    /* renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4812getCyan0d7_KjU$annotations() {
    }

    /* renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4813getDarkGray0d7_KjU$annotations() {
    }

    /* renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4814getGray0d7_KjU$annotations() {
    }

    /* renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4815getGreen0d7_KjU$annotations() {
    }

    /* renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4816getLightGray0d7_KjU$annotations() {
    }

    /* renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4817getMagenta0d7_KjU$annotations() {
    }

    /* renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4818getRed0d7_KjU$annotations() {
    }

    /* renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4819getTransparent0d7_KjU$annotations() {
    }

    /* renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4820getUnspecified0d7_KjU$annotations() {
    }

    /* renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4821getWhite0d7_KjU$annotations() {
    }

    /* renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4822getYellow0d7_KjU$annotations() {
    }
}
