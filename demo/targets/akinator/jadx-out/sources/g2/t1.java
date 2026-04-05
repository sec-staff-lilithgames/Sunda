package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f56854a = s2.a0.getSp(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f56855b = s2.a0.getSp(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f56856c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f56857d;

    static {
        j1.l0 l0Var = j1.m0.f68918b;
        f56856c = l0Var.m4834getTransparent0d7_KjU();
        f56857d = l0Var.m4825getBlack0d7_KjU();
    }

    public static final r1 lerp(r1 start, r1 stop, float f10) {
        d0 d0VarLerp;
        kotlin.jvm.internal.e0.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.e0.checkNotNullParameter(stop, "stop");
        r2.t tVarLerp = r2.u.lerp(start.getTextDrawStyle$ui_text_release(), stop.getTextDrawStyle$ui_text_release(), f10);
        l2.x xVar = (l2.x) lerpDiscrete(start.getFontFamily(), stop.getFontFamily(), f10);
        long jM4023lerpTextUnitInheritableC3pnCVY = m4023lerpTextUnitInheritableC3pnCVY(start.m4017getFontSizeXSAIIZE(), stop.m4017getFontSizeXSAIIZE(), f10);
        l2.c1 fontWeight = start.getFontWeight();
        if (fontWeight == null) {
            fontWeight = l2.c1.f72258c.getNormal();
        }
        l2.c1 fontWeight2 = stop.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = l2.c1.f72258c.getNormal();
        }
        l2.c1 c1VarLerp = l2.d1.lerp(fontWeight, fontWeight2, f10);
        l2.y0 y0Var = (l2.y0) lerpDiscrete(start.m4018getFontStyle4Lr2A7w(), stop.m4018getFontStyle4Lr2A7w(), f10);
        l2.a1 a1Var = (l2.a1) lerpDiscrete(start.m4019getFontSynthesisZQGJjVo(), stop.m4019getFontSynthesisZQGJjVo(), f10);
        String str = (String) lerpDiscrete(start.getFontFeatureSettings(), stop.getFontFeatureSettings(), f10);
        long jM4023lerpTextUnitInheritableC3pnCVY2 = m4023lerpTextUnitInheritableC3pnCVY(start.m4020getLetterSpacingXSAIIZE(), stop.m4020getLetterSpacingXSAIIZE(), f10);
        r2.b bVarM4015getBaselineShift5SSeXJ0 = start.m4015getBaselineShift5SSeXJ0();
        float fM6037unboximpl = bVarM4015getBaselineShift5SSeXJ0 != null ? bVarM4015getBaselineShift5SSeXJ0.m6037unboximpl() : r2.b.m6032constructorimpl(0.0f);
        r2.b bVarM4015getBaselineShift5SSeXJ02 = stop.m4015getBaselineShift5SSeXJ0();
        float fM6038lerpjWV1Mfo = r2.c.m6038lerpjWV1Mfo(fM6037unboximpl, bVarM4015getBaselineShift5SSeXJ02 != null ? bVarM4015getBaselineShift5SSeXJ02.m6037unboximpl() : r2.b.m6032constructorimpl(0.0f), f10);
        r2.v textGeometricTransform = start.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = r2.v.f83724c.getNone$ui_text_release();
        }
        r2.v textGeometricTransform2 = stop.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = r2.v.f83724c.getNone$ui_text_release();
        }
        r2.v vVarLerp = r2.w.lerp(textGeometricTransform, textGeometricTransform2, f10);
        n2.e eVar = (n2.e) lerpDiscrete(start.getLocaleList(), stop.getLocaleList(), f10);
        long jM4891lerpjxsXWHM = j1.o0.m4891lerpjxsXWHM(start.m4014getBackground0d7_KjU(), stop.m4014getBackground0d7_KjU(), f10);
        r2.n nVar = (r2.n) lerpDiscrete(start.getTextDecoration(), stop.getTextDecoration(), f10);
        j1.d2 shadow = start.getShadow();
        if (shadow == null) {
            shadow = new j1.d2(0L, 0L, 0.0f, 7, null);
        }
        j1.d2 shadow2 = stop.getShadow();
        if (shadow2 == null) {
            shadow2 = new j1.d2(0L, 0L, 0.0f, 7, null);
        }
        j1.d2 d2VarLerp = j1.e2.lerp(shadow, shadow2, f10);
        d0 platformStyle = start.getPlatformStyle();
        d0 platformStyle2 = stop.getPlatformStyle();
        if (platformStyle == null && platformStyle2 == null) {
            d0VarLerp = null;
        } else {
            if (platformStyle == null) {
                platformStyle = d0.f56747a.getDefault();
            }
            if (platformStyle2 == null) {
                platformStyle2 = d0.f56747a.getDefault();
            }
            d0VarLerp = a.lerp(platformStyle, platformStyle2, f10);
        }
        return new r1(tVarLerp, jM4023lerpTextUnitInheritableC3pnCVY, c1VarLerp, y0Var, a1Var, xVar, str, jM4023lerpTextUnitInheritableC3pnCVY2, r2.b.m6031boximpl(fM6038lerpjWV1Mfo), vVarLerp, eVar, jM4891lerpjxsXWHM, nVar, d2VarLerp, d0VarLerp, (kotlin.jvm.internal.u) null);
    }

    public static final <T> T lerpDiscrete(T t10, T t11, float f10) {
        return ((double) f10) < 0.5d ? t10 : t11;
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m4023lerpTextUnitInheritableC3pnCVY(long j10, long j11, float f10) {
        return (s2.a0.m6730isUnspecifiedR2X_6o(j10) || s2.a0.m6730isUnspecifiedR2X_6o(j11)) ? ((s2.z) lerpDiscrete(s2.z.m6984boximpl(j10), s2.z.m6984boximpl(j11), f10)).m7003unboximpl() : s2.a0.m6732lerpC3pnCVY(j10, j11, f10);
    }

    public static final r1 resolveSpanStyleDefaults(r1 style) {
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        r2.t tVarTakeOrElse = style.getTextDrawStyle$ui_text_release().takeOrElse(s1.f56849e);
        long jM4017getFontSizeXSAIIZE = s2.a0.m6730isUnspecifiedR2X_6o(style.m4017getFontSizeXSAIIZE()) ? f56854a : style.m4017getFontSizeXSAIIZE();
        l2.c1 fontWeight = style.getFontWeight();
        if (fontWeight == null) {
            fontWeight = l2.c1.f72258c.getNormal();
        }
        l2.c1 c1Var = fontWeight;
        l2.y0 y0VarM4018getFontStyle4Lr2A7w = style.m4018getFontStyle4Lr2A7w();
        l2.y0 y0VarM5482boximpl = l2.y0.m5482boximpl(y0VarM4018getFontStyle4Lr2A7w != null ? y0VarM4018getFontStyle4Lr2A7w.m5488unboximpl() : l2.y0.f72394b.m5480getNormal_LCdwA());
        l2.a1 a1VarM4019getFontSynthesisZQGJjVo = style.m4019getFontSynthesisZQGJjVo();
        l2.a1 a1VarM5423boximpl = l2.a1.m5423boximpl(a1VarM4019getFontSynthesisZQGJjVo != null ? a1VarM4019getFontSynthesisZQGJjVo.m5431unboximpl() : l2.a1.f72244b.m5489getAllGVVA2EU());
        l2.x fontFamily = style.getFontFamily();
        if (fontFamily == null) {
            fontFamily = l2.x.f72386c.getDefault();
        }
        l2.x xVar = fontFamily;
        String fontFeatureSettings = style.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long jM4020getLetterSpacingXSAIIZE = s2.a0.m6730isUnspecifiedR2X_6o(style.m4020getLetterSpacingXSAIIZE()) ? f56855b : style.m4020getLetterSpacingXSAIIZE();
        r2.b bVarM4015getBaselineShift5SSeXJ0 = style.m4015getBaselineShift5SSeXJ0();
        r2.b bVarM6031boximpl = r2.b.m6031boximpl(bVarM4015getBaselineShift5SSeXJ0 != null ? bVarM4015getBaselineShift5SSeXJ0.m6037unboximpl() : r2.b.f83677b.m6021getNoney9eOQZs());
        r2.v textGeometricTransform = style.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = r2.v.f83724c.getNone$ui_text_release();
        }
        r2.v vVar = textGeometricTransform;
        n2.e localeList = style.getLocaleList();
        if (localeList == null) {
            localeList = n2.e.f75556e.getCurrent();
        }
        n2.e eVar = localeList;
        long jM4014getBackground0d7_KjU = style.m4014getBackground0d7_KjU();
        if (jM4014getBackground0d7_KjU == j1.m0.f68918b.m4835getUnspecified0d7_KjU()) {
            jM4014getBackground0d7_KjU = f56856c;
        }
        long j10 = jM4014getBackground0d7_KjU;
        r2.n textDecoration = style.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = r2.n.f83709b.getNone();
        }
        r2.n nVar = textDecoration;
        j1.d2 shadow = style.getShadow();
        if (shadow == null) {
            shadow = j1.d2.f68857d.getNone();
        }
        return new r1(tVarTakeOrElse, jM4017getFontSizeXSAIIZE, c1Var, y0VarM5482boximpl, a1VarM5423boximpl, xVar, str, jM4020getLetterSpacingXSAIIZE, bVarM6031boximpl, vVar, eVar, j10, nVar, shadow, style.getPlatformStyle(), (kotlin.jvm.internal.u) null);
    }
}
