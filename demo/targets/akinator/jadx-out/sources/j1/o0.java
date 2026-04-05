package j1;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o0 {
    public static final long Color(float f10, float f11, float f12, float f13, k1.g colorSpace) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colorSpace, "colorSpace");
        float minValue = colorSpace.getMinValue(0);
        if (f10 <= colorSpace.getMaxValue(0) && minValue <= f10) {
            float minValue2 = colorSpace.getMinValue(1);
            if (f11 <= colorSpace.getMaxValue(1) && minValue2 <= f11) {
                float minValue3 = colorSpace.getMinValue(2);
                if (f12 <= colorSpace.getMaxValue(2) && minValue3 <= f12 && 0.0f <= f13 && f13 <= 1.0f) {
                    if (colorSpace.isSrgb()) {
                        return m0.m4854constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl((((((int) ((f10 * 255.0f) + 0.5f)) << 16) | (((int) ((f13 * 255.0f) + 0.5f)) << 24)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((f12 * 255.0f) + 0.5f))) & 4294967295L) << 32));
                    }
                    if (colorSpace.getComponentCount() != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                    }
                    int id$ui_graphics_release = colorSpace.getId$ui_graphics_release();
                    if (id$ui_graphics_release == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    short sM4960constructorimpl = t0.m4960constructorimpl(f10);
                    return m0.m4854constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(t0.m4960constructorimpl(f11)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(sM4960constructorimpl) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48)) | tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(t0.m4960constructorimpl(f12)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16)) | tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(id$ui_graphics_release) & 63)));
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f10 + ", green = " + f11 + ", blue = " + f12 + ", alpha = " + f13 + " outside the range for " + colorSpace).toString());
    }

    public static /* synthetic */ long Color$default(float f10, float f11, float f12, float f13, k1.g gVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            gVar = k1.k.f70039a.getSrgb();
        }
        return Color(f10, f11, f12, f13, gVar);
    }

    /* renamed from: access$getComponents-8_81llA, reason: not valid java name */
    public static final float[] m4885access$getComponents8_81llA(long j10) {
        return new float[]{m0.m4864getRedimpl(j10), m0.m4863getGreenimpl(j10), m0.m4861getBlueimpl(j10), m0.m4860getAlphaimpl(j10)};
    }

    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m4886compositeOverOWjLjI(long j10, long j11) {
        float f10;
        float f11;
        long jM4855convertvNxB06k = m0.m4855convertvNxB06k(j10, m0.m4862getColorSpaceimpl(j11));
        float fM4860getAlphaimpl = m0.m4860getAlphaimpl(j11);
        float fM4860getAlphaimpl2 = m0.m4860getAlphaimpl(jM4855convertvNxB06k);
        float f12 = 1.0f - fM4860getAlphaimpl2;
        float f13 = (fM4860getAlphaimpl * f12) + fM4860getAlphaimpl2;
        float fM4864getRedimpl = m0.m4864getRedimpl(jM4855convertvNxB06k);
        float fM4864getRedimpl2 = m0.m4864getRedimpl(j11);
        float f14 = 0.0f;
        if (f13 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((fM4864getRedimpl2 * fM4860getAlphaimpl) * f12) + (fM4864getRedimpl * fM4860getAlphaimpl2)) / f13;
        }
        float fM4863getGreenimpl = m0.m4863getGreenimpl(jM4855convertvNxB06k);
        float fM4863getGreenimpl2 = m0.m4863getGreenimpl(j11);
        if (f13 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (((fM4863getGreenimpl2 * fM4860getAlphaimpl) * f12) + (fM4863getGreenimpl * fM4860getAlphaimpl2)) / f13;
        }
        float fM4861getBlueimpl = m0.m4861getBlueimpl(jM4855convertvNxB06k);
        float fM4861getBlueimpl2 = m0.m4861getBlueimpl(j11);
        if (f13 != 0.0f) {
            f14 = (((fM4861getBlueimpl2 * fM4860getAlphaimpl) * f12) + (fM4861getBlueimpl * fM4860getAlphaimpl2)) / f13;
        }
        return Color(f10, f11, f14, f13, m0.m4862getColorSpaceimpl(j11));
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m4887isSpecified8_81llA(long j10) {
        return j10 != m0.f68918b.m4835getUnspecified0d7_KjU();
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m4889isUnspecified8_81llA(long j10) {
        return j10 == m0.f68918b.m4835getUnspecified0d7_KjU();
    }

    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m4891lerpjxsXWHM(long j10, long j11, float f10) {
        k1.g oklab = k1.k.f70039a.getOklab();
        long jM4855convertvNxB06k = m0.m4855convertvNxB06k(j10, oklab);
        long jM4855convertvNxB06k2 = m0.m4855convertvNxB06k(j11, oklab);
        float fM4860getAlphaimpl = m0.m4860getAlphaimpl(jM4855convertvNxB06k);
        float fM4864getRedimpl = m0.m4864getRedimpl(jM4855convertvNxB06k);
        float fM4863getGreenimpl = m0.m4863getGreenimpl(jM4855convertvNxB06k);
        float fM4861getBlueimpl = m0.m4861getBlueimpl(jM4855convertvNxB06k);
        float fM4860getAlphaimpl2 = m0.m4860getAlphaimpl(jM4855convertvNxB06k2);
        float fM4864getRedimpl2 = m0.m4864getRedimpl(jM4855convertvNxB06k2);
        float fM4863getGreenimpl2 = m0.m4863getGreenimpl(jM4855convertvNxB06k2);
        float fM4861getBlueimpl2 = m0.m4861getBlueimpl(jM4855convertvNxB06k2);
        return m0.m4855convertvNxB06k(Color(t2.a.lerp(fM4864getRedimpl, fM4864getRedimpl2, f10), t2.a.lerp(fM4863getGreenimpl, fM4863getGreenimpl2, f10), t2.a.lerp(fM4861getBlueimpl, fM4861getBlueimpl2, f10), t2.a.lerp(fM4860getAlphaimpl, fM4860getAlphaimpl2, f10), oklab), m0.m4862getColorSpaceimpl(j11));
    }

    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m4892luminance8_81llA(long j10) {
        k1.g gVarM4862getColorSpaceimpl = m0.m4862getColorSpaceimpl(j10);
        if (!k1.f.m5104equalsimpl0(gVarM4862getColorSpaceimpl.m5109getModelxdoWZVw(), k1.f.f70028b.m5099getRgbxdoWZVw())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) k1.f.m5107toStringimpl(gVarM4862getColorSpaceimpl.m5109getModelxdoWZVw()))).toString());
        }
        kv.l eotf = ((k1.z) gVarM4862getColorSpaceimpl).getEotf();
        double dDoubleValue = ((Number) eotf.invoke(Double.valueOf(m0.m4864getRedimpl(j10)))).doubleValue();
        float fDoubleValue = (float) ((((Number) eotf.invoke(Double.valueOf(m0.m4861getBlueimpl(j10)))).doubleValue() * 0.0722d) + (((Number) eotf.invoke(Double.valueOf(m0.m4863getGreenimpl(j10)))).doubleValue() * 0.7152d) + (dDoubleValue * 0.2126d));
        if (fDoubleValue <= 0.0f) {
            return 0.0f;
        }
        if (fDoubleValue >= 1.0f) {
            return 1.0f;
        }
        return fDoubleValue;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m4893takeOrElseDxMtmZc(long j10, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return j10 != m0.f68918b.m4835getUnspecified0d7_KjU() ? j10 : ((m0) block.invoke()).m4868unboximpl();
    }

    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m4894toArgb8_81llA(long j10) {
        k1.g gVarM4862getColorSpaceimpl = m0.m4862getColorSpaceimpl(j10);
        if (gVarM4862getColorSpaceimpl.isSrgb()) {
            return (int) tu.o0.m7081constructorimpl(j10 >>> 32);
        }
        float[] fArr = {m0.m4864getRedimpl(j10), m0.m4863getGreenimpl(j10), m0.m4861getBlueimpl(j10), m0.m4860getAlphaimpl(j10)};
        k1.h.m5111connectYBCOT_4$default(gVarM4862getColorSpaceimpl, null, 0, 3, null).transform(fArr);
        return (((int) ((fArr[3] * 255.0f) + 0.5f)) << 24) | (((int) ((fArr[0] * 255.0f) + 0.5f)) << 16) | (((int) ((fArr[1] * 255.0f) + 0.5f)) << 8) | ((int) ((fArr[2] * 255.0f) + 0.5f));
    }

    public static /* synthetic */ long Color$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return Color(i10, i11, i12, i13);
    }

    public static final long Color(int i10) {
        return m0.m4854constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(i10) << 32));
    }

    public static final long Color(long j10) {
        return m0.m4854constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(j10) & 4294967295L) << 32));
    }

    public static final long Color(int i10, int i11, int i12, int i13) {
        return Color(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }

    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m4888isSpecified8_81llA$annotations(long j10) {
    }

    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m4890isUnspecified8_81llA$annotations(long j10) {
    }
}
