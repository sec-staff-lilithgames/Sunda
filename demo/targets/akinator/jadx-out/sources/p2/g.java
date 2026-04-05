package p2;

import android.graphics.Typeface;
import g2.r1;
import i1.o;
import j1.d2;
import j1.l0;
import j1.m0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.r;
import l2.a1;
import l2.c1;
import l2.x;
import l2.y0;
import o2.l;
import r2.n;
import r2.v;
import s2.b0;
import s2.c0;
import s2.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g {
    public static final r1 applySpanStyle(l lVar, r1 style, r resolveTypeface, s2.e density) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(style, "style");
        e0.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        e0.checkNotNullParameter(density, "density");
        long jM6993getTypeUIouoOA = z.m6993getTypeUIouoOA(style.m4017getFontSizeXSAIIZE());
        b0 b0Var = c0.f85325b;
        if (c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6742getSpUIouoOA())) {
            lVar.setTextSize(density.mo3424toPxR2X_6o(style.m4017getFontSizeXSAIIZE()));
        } else if (c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6741getEmUIouoOA())) {
            lVar.setTextSize(z.m6994getValueimpl(style.m4017getFontSizeXSAIIZE()) * lVar.getTextSize());
        }
        if (hasFontAttributes(style)) {
            x fontFamily = style.getFontFamily();
            c1 fontWeight = style.getFontWeight();
            if (fontWeight == null) {
                fontWeight = c1.f72258c.getNormal();
            }
            y0 y0VarM4018getFontStyle4Lr2A7w = style.m4018getFontStyle4Lr2A7w();
            y0 y0VarM5482boximpl = y0.m5482boximpl(y0VarM4018getFontStyle4Lr2A7w != null ? y0VarM4018getFontStyle4Lr2A7w.m5488unboximpl() : y0.f72394b.m5480getNormal_LCdwA());
            a1 a1VarM4019getFontSynthesisZQGJjVo = style.m4019getFontSynthesisZQGJjVo();
            lVar.setTypeface((Typeface) resolveTypeface.invoke(fontFamily, fontWeight, y0VarM5482boximpl, a1.m5423boximpl(a1VarM4019getFontSynthesisZQGJjVo != null ? a1VarM4019getFontSynthesisZQGJjVo.m5431unboximpl() : a1.f72244b.m5489getAllGVVA2EU())));
        }
        if (style.getLocaleList() != null && !e0.areEqual(style.getLocaleList(), n2.e.f75556e.getCurrent())) {
            b.f80670a.setTextLocales(lVar, style.getLocaleList());
        }
        long jM6993getTypeUIouoOA2 = z.m6993getTypeUIouoOA(style.m4020getLetterSpacingXSAIIZE());
        if (c0.m6765equalsimpl0(jM6993getTypeUIouoOA2, b0Var.m6741getEmUIouoOA())) {
            lVar.setLetterSpacing(z.m6994getValueimpl(style.m4020getLetterSpacingXSAIIZE()));
        } else {
            c0.m6765equalsimpl0(jM6993getTypeUIouoOA2, b0Var.m6742getSpUIouoOA());
        }
        if (style.getFontFeatureSettings() != null && !e0.areEqual(style.getFontFeatureSettings(), "")) {
            lVar.setFontFeatureSettings(style.getFontFeatureSettings());
        }
        if (style.getTextGeometricTransform() != null && !e0.areEqual(style.getTextGeometricTransform(), v.f83724c.getNone$ui_text_release())) {
            lVar.setTextScaleX(style.getTextGeometricTransform().getScaleX() * lVar.getTextScaleX());
            lVar.setTextSkewX(style.getTextGeometricTransform().getSkewX() + lVar.getTextSkewX());
        }
        lVar.m5775setColor8_81llA(style.m4016getColor0d7_KjU());
        lVar.m5774setBrushd16Qtg0(style.getBrush(), o.f59366b.m4238getUnspecifiedNHjbRc());
        lVar.setShadow(style.getShadow());
        lVar.setTextDecoration(style.getTextDecoration());
        long jM6983getUnspecifiedXSAIIZE = (!c0.m6765equalsimpl0(z.m6993getTypeUIouoOA(style.m4020getLetterSpacingXSAIIZE()), b0Var.m6742getSpUIouoOA()) || z.m6994getValueimpl(style.m4020getLetterSpacingXSAIIZE()) == 0.0f) ? z.f85366b.m6983getUnspecifiedXSAIIZE() : style.m4020getLetterSpacingXSAIIZE();
        long jM4014getBackground0d7_KjU = style.m4014getBackground0d7_KjU();
        l0 l0Var = m0.f68918b;
        long jM4835getUnspecified0d7_KjU = m0.m4859equalsimpl0(jM4014getBackground0d7_KjU, l0Var.m4834getTransparent0d7_KjU()) ? l0Var.m4835getUnspecified0d7_KjU() : style.m4014getBackground0d7_KjU();
        r2.b bVarM4015getBaselineShift5SSeXJ0 = style.m4015getBaselineShift5SSeXJ0();
        return new r1(0L, 0L, (c1) null, (y0) null, (a1) null, (x) null, (String) null, jM6983getUnspecifiedXSAIIZE, bVarM4015getBaselineShift5SSeXJ0 == null ? false : r2.b.m6034equalsimpl0(bVarM4015getBaselineShift5SSeXJ0.m6037unboximpl(), r2.b.f83677b.m6021getNoney9eOQZs()) ? null : style.m4015getBaselineShift5SSeXJ0(), (v) null, (n2.e) null, jM4835getUnspecified0d7_KjU, (n) null, (d2) null, 13951, (u) null);
    }

    public static final boolean hasFontAttributes(r1 r1Var) {
        e0.checkNotNullParameter(r1Var, "<this>");
        return (r1Var.getFontFamily() == null && r1Var.m4018getFontStyle4Lr2A7w() == null && r1Var.getFontWeight() == null) ? false : true;
    }
}
