package a2;

import android.os.Parcel;
import android.util.Base64;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public Parcel f3693a;

    public k3() {
        Parcel parcelObtain = Parcel.obtain();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(parcelObtain, "obtain()");
        this.f3693a = parcelObtain;
    }

    public final void encode(g2.r1 spanStyle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(spanStyle, "spanStyle");
        long jM4016getColor0d7_KjU = spanStyle.m4016getColor0d7_KjU();
        j1.l0 l0Var = j1.m0.f68918b;
        if (!j1.m0.m4859equalsimpl0(jM4016getColor0d7_KjU, l0Var.m4835getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m48encode8_81llA(spanStyle.m4016getColor0d7_KjU());
        }
        long jM4017getFontSizeXSAIIZE = spanStyle.m4017getFontSizeXSAIIZE();
        s2.y yVar = s2.z.f85366b;
        if (!s2.z.m6991equalsimpl0(jM4017getFontSizeXSAIIZE, yVar.m6983getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m45encodeR2X_6o(spanStyle.m4017getFontSizeXSAIIZE());
        }
        l2.c1 fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        l2.y0 y0VarM4018getFontStyle4Lr2A7w = spanStyle.m4018getFontStyle4Lr2A7w();
        if (y0VarM4018getFontStyle4Lr2A7w != null) {
            int iM5488unboximpl = y0VarM4018getFontStyle4Lr2A7w.m5488unboximpl();
            encode((byte) 4);
            m50encodenzbMABs(iM5488unboximpl);
        }
        l2.a1 a1VarM4019getFontSynthesisZQGJjVo = spanStyle.m4019getFontSynthesisZQGJjVo();
        if (a1VarM4019getFontSynthesisZQGJjVo != null) {
            int iM5431unboximpl = a1VarM4019getFontSynthesisZQGJjVo.m5431unboximpl();
            encode((byte) 5);
            m47encode6p3vJLY(iM5431unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!s2.z.m6991equalsimpl0(spanStyle.m4020getLetterSpacingXSAIIZE(), yVar.m6983getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m45encodeR2X_6o(spanStyle.m4020getLetterSpacingXSAIIZE());
        }
        r2.b bVarM4015getBaselineShift5SSeXJ0 = spanStyle.m4015getBaselineShift5SSeXJ0();
        if (bVarM4015getBaselineShift5SSeXJ0 != null) {
            float fM6037unboximpl = bVarM4015getBaselineShift5SSeXJ0.m6037unboximpl();
            encode((byte) 8);
            m46encode4Dl_Bck(fM6037unboximpl);
        }
        r2.v textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!j1.m0.m4859equalsimpl0(spanStyle.m4014getBackground0d7_KjU(), l0Var.m4835getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m48encode8_81llA(spanStyle.m4014getBackground0d7_KjU());
        }
        r2.n textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        j1.d2 shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m45encodeR2X_6o(long j10) {
        long jM6993getTypeUIouoOA = s2.z.m6993getTypeUIouoOA(j10);
        s2.b0 b0Var = s2.c0.f85325b;
        byte b10 = 0;
        if (!s2.c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6743getUnspecifiedUIouoOA())) {
            if (s2.c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6742getSpUIouoOA())) {
                b10 = 1;
            } else if (s2.c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6741getEmUIouoOA())) {
                b10 = 2;
            }
        }
        encode(b10);
        if (s2.c0.m6765equalsimpl0(s2.z.m6993getTypeUIouoOA(j10), b0Var.m6743getUnspecifiedUIouoOA())) {
            return;
        }
        encode(s2.z.m6994getValueimpl(j10));
    }

    /* renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m46encode4Dl_Bck(float f10) {
        encode(f10);
    }

    /* renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m47encode6p3vJLY(int i10) {
        l2.z0 z0Var = l2.a1.f72244b;
        byte b10 = 0;
        if (!l2.a1.m5426equalsimpl0(i10, z0Var.m5490getNoneGVVA2EU())) {
            if (l2.a1.m5426equalsimpl0(i10, z0Var.m5489getAllGVVA2EU())) {
                b10 = 1;
            } else if (l2.a1.m5426equalsimpl0(i10, z0Var.m5492getWeightGVVA2EU())) {
                b10 = 2;
            } else if (l2.a1.m5426equalsimpl0(i10, z0Var.m5491getStyleGVVA2EU())) {
                b10 = 3;
            }
        }
        encode(b10);
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public final void m48encode8_81llA(long j10) {
        m49encodeVKZWuLQ(j10);
    }

    /* renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m49encodeVKZWuLQ(long j10) {
        this.f3693a.writeLong(j10);
    }

    /* renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m50encodenzbMABs(int i10) {
        l2.x0 x0Var = l2.y0.f72394b;
        byte b10 = 0;
        if (!l2.y0.m5485equalsimpl0(i10, x0Var.m5480getNormal_LCdwA()) && l2.y0.m5485equalsimpl0(i10, x0Var.m5479getItalic_LCdwA())) {
            b10 = 1;
        }
        encode(b10);
    }

    public final String encodedString() {
        String strEncodeToString = Base64.encodeToString(this.f3693a.marshall(), 0);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strEncodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return strEncodeToString;
    }

    public final void reset() {
        this.f3693a.recycle();
        Parcel parcelObtain = Parcel.obtain();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(parcelObtain, "obtain()");
        this.f3693a = parcelObtain;
    }

    public final void encode(l2.c1 fontWeight) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fontWeight, "fontWeight");
        encode(fontWeight.getWeight());
    }

    public final void encode(r2.v textGeometricTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(textGeometricTransform, "textGeometricTransform");
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(r2.n textDecoration) {
        kotlin.jvm.internal.e0.checkNotNullParameter(textDecoration, "textDecoration");
        encode(textDecoration.getMask());
    }

    public final void encode(j1.d2 shadow) {
        kotlin.jvm.internal.e0.checkNotNullParameter(shadow, "shadow");
        m48encode8_81llA(shadow.m4720getColor0d7_KjU());
        encode(i1.h.m4185getXimpl(shadow.m4721getOffsetF1C5BW0()));
        encode(i1.h.m4186getYimpl(shadow.m4721getOffsetF1C5BW0()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b10) {
        this.f3693a.writeByte(b10);
    }

    public final void encode(int i10) {
        this.f3693a.writeInt(i10);
    }

    public final void encode(float f10) {
        this.f3693a.writeFloat(f10);
    }

    public final void encode(String string) {
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        this.f3693a.writeString(string);
    }
}
