package p2;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import g2.b;
import g2.c2;
import g2.r1;
import j1.b2;
import j1.d2;
import j1.j2;
import j1.m0;
import j1.o0;
import j2.k;
import j2.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.q;
import kv.r;
import r2.j;
import r2.n;
import r2.v;
import r2.x;
import s2.a0;
import s2.b0;
import s2.c0;
import s2.z;
import uu.f0;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f {
    public static final float a(long j10, float f10, s2.e eVar) {
        long jM6993getTypeUIouoOA = z.m6993getTypeUIouoOA(j10);
        b0 b0Var = c0.f85325b;
        if (c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6742getSpUIouoOA())) {
            return eVar.mo3424toPxR2X_6o(j10);
        }
        if (c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6741getEmUIouoOA())) {
            return z.m6994getValueimpl(j10) * f10;
        }
        return Float.NaN;
    }

    public static final void flattenFontStylesAndApply(r1 r1Var, List<b.C0570b> spanStyles, q block) {
        e0.checkNotNullParameter(spanStyles, "spanStyles");
        e0.checkNotNullParameter(block, "block");
        if (spanStyles.size() <= 1) {
            if (spanStyles.isEmpty()) {
                return;
            }
            r1 r1VarMerge = (r1) spanStyles.get(0).getItem();
            if (r1Var != null) {
                r1VarMerge = r1Var.merge(r1VarMerge);
            }
            block.invoke(r1VarMerge, Integer.valueOf(spanStyles.get(0).getStart()), Integer.valueOf(spanStyles.get(0).getEnd()));
            return;
        }
        int size = spanStyles.size();
        int i10 = size * 2;
        Integer[] numArr = new Integer[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            numArr[i11] = 0;
        }
        int size2 = spanStyles.size();
        for (int i12 = 0; i12 < size2; i12++) {
            b.C0570b c0570b = spanStyles.get(i12);
            numArr[i12] = Integer.valueOf(c0570b.getStart());
            numArr[i12 + size] = Integer.valueOf(c0570b.getEnd());
        }
        f0.sort(numArr);
        int iIntValue = ((Number) k0.first(numArr)).intValue();
        for (int i13 = 0; i13 < i10; i13++) {
            Integer num = numArr[i13];
            int iIntValue2 = num.intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = spanStyles.size();
                r1 r1VarMerge2 = r1Var;
                for (int i14 = 0; i14 < size3; i14++) {
                    b.C0570b c0570b2 = spanStyles.get(i14);
                    if (c0570b2.getStart() != c0570b2.getEnd() && g2.g.intersect(iIntValue, iIntValue2, c0570b2.getStart(), c0570b2.getEnd())) {
                        r1 r1Var2 = (r1) c0570b2.getItem();
                        r1VarMerge2 = r1VarMerge2 == null ? r1Var2 : r1VarMerge2.merge(r1Var2);
                    }
                }
                if (r1VarMerge2 != null) {
                    block.invoke(r1VarMerge2, Integer.valueOf(iIntValue), num);
                }
                iIntValue = iIntValue2;
            }
        }
    }

    /* renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m5872setBackgroundRPmYEkk(Spannable setBackground, long j10, int i10, int i11) {
        e0.checkNotNullParameter(setBackground, "$this$setBackground");
        if (j10 != m0.f68918b.m4835getUnspecified0d7_KjU()) {
            setSpan(setBackground, new BackgroundColorSpan(o0.m4894toArgb8_81llA(j10)), i10, i11);
        }
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m5873setColorRPmYEkk(Spannable setColor, long j10, int i10, int i11) {
        e0.checkNotNullParameter(setColor, "$this$setColor");
        if (j10 != m0.f68918b.m4835getUnspecified0d7_KjU()) {
            setSpan(setColor, new ForegroundColorSpan(o0.m4894toArgb8_81llA(j10)), i10, i11);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m5874setFontSizeKmRG4DE(Spannable setFontSize, long j10, s2.e density, int i10, int i11) {
        e0.checkNotNullParameter(setFontSize, "$this$setFontSize");
        e0.checkNotNullParameter(density, "density");
        long jM6993getTypeUIouoOA = z.m6993getTypeUIouoOA(j10);
        b0 b0Var = c0.f85325b;
        if (c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6742getSpUIouoOA())) {
            setSpan(setFontSize, new AbsoluteSizeSpan(mv.d.roundToInt(density.mo3424toPxR2X_6o(j10)), false), i10, i11);
        } else if (c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6741getEmUIouoOA())) {
            setSpan(setFontSize, new RelativeSizeSpan(z.m6994getValueimpl(j10)), i10, i11);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m5875setLineHeightKmRG4DE(Spannable setLineHeight, long j10, float f10, s2.e density, r2.h lineHeightStyle) {
        e0.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        e0.checkNotNullParameter(density, "density");
        e0.checkNotNullParameter(lineHeightStyle, "lineHeightStyle");
        float fA = a(j10, f10, density);
        if (Float.isNaN(fA)) {
            return;
        }
        setSpan(setLineHeight, new j2.f(fA, 0, setLineHeight.length(), j.m6062isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m6053getTrimEVpEnUU()), j.m6063isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m6053getTrimEVpEnUU()), lineHeightStyle.m6052getAlignmentPIaL0Z0()), 0, setLineHeight.length());
    }

    /* renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m5876setLineHeightr9BaKPg(Spannable setLineHeight, long j10, float f10, s2.e density) {
        e0.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        e0.checkNotNullParameter(density, "density");
        float fA = a(j10, f10, density);
        if (Float.isNaN(fA)) {
            return;
        }
        setSpan(setLineHeight, new j2.e(fA), 0, setLineHeight.length());
    }

    public static final void setLocaleList(Spannable spannable, n2.e eVar, int i10, int i11) {
        e0.checkNotNullParameter(spannable, "<this>");
        if (eVar != null) {
            setSpan(spannable, b.f80670a.localeSpan(eVar), i10, i11);
        }
    }

    public static final void setSpan(Spannable spannable, Object span, int i10, int i11) {
        e0.checkNotNullParameter(spannable, "<this>");
        e0.checkNotNullParameter(span, "span");
        spannable.setSpan(span, i10, i11, 33);
    }

    public static final void setSpanStyles(Spannable spannable, c2 contextTextStyle, List<b.C0570b> spanStyles, s2.e density, r resolveTypeface) {
        e0.checkNotNullParameter(spannable, "<this>");
        e0.checkNotNullParameter(contextTextStyle, "contextTextStyle");
        e0.checkNotNullParameter(spanStyles, "spanStyles");
        e0.checkNotNullParameter(density, "density");
        e0.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        ArrayList arrayList = new ArrayList(spanStyles.size());
        int size = spanStyles.size();
        for (int i10 = 0; i10 < size; i10++) {
            b.C0570b c0570b = spanStyles.get(i10);
            b.C0570b c0570b2 = c0570b;
            if (g.hasFontAttributes((r1) c0570b2.getItem()) || ((r1) c0570b2.getItem()).m4019getFontSynthesisZQGJjVo() != null) {
                arrayList.add(c0570b);
            }
        }
        flattenFontStylesAndApply((g.hasFontAttributes(contextTextStyle.toSpanStyle()) || contextTextStyle.m3986getFontSynthesisZQGJjVo() != null) ? new r1(0L, 0L, contextTextStyle.getFontWeight(), contextTextStyle.m3985getFontStyle4Lr2A7w(), contextTextStyle.m3986getFontSynthesisZQGJjVo(), contextTextStyle.getFontFamily(), (String) null, 0L, (r2.b) null, (v) null, (n2.e) null, 0L, (n) null, (d2) null, 16323, (u) null) : null, arrayList, new e(spannable, resolveTypeface));
        ArrayList arrayList2 = new ArrayList();
        int size2 = spanStyles.size();
        for (int i11 = 0; i11 < size2; i11++) {
            b.C0570b c0570b3 = spanStyles.get(i11);
            int start = c0570b3.getStart();
            int end = c0570b3.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                int start2 = c0570b3.getStart();
                int end2 = c0570b3.getEnd();
                r1 r1Var = (r1) c0570b3.getItem();
                r2.b bVarM4015getBaselineShift5SSeXJ0 = r1Var.m4015getBaselineShift5SSeXJ0();
                if (bVarM4015getBaselineShift5SSeXJ0 != null) {
                    setSpan(spannable, new j2.a(bVarM4015getBaselineShift5SSeXJ0.m6037unboximpl()), start2, end2);
                }
                m5873setColorRPmYEkk(spannable, r1Var.m4016getColor0d7_KjU(), start2, end2);
                j1.b0 brush = r1Var.getBrush();
                if (brush != null) {
                    if (brush instanceof j2) {
                        m5873setColorRPmYEkk(spannable, ((j2) brush).m4781getValue0d7_KjU(), start2, end2);
                    } else if (brush instanceof b2) {
                        setSpan(spannable, new q2.a((b2) brush), start2, end2);
                    }
                }
                setTextDecoration(spannable, r1Var.getTextDecoration(), start2, end2);
                m5874setFontSizeKmRG4DE(spannable, r1Var.m4017getFontSizeXSAIIZE(), density, start2, end2);
                String fontFeatureSettings = r1Var.getFontFeatureSettings();
                if (fontFeatureSettings != null) {
                    setSpan(spannable, new j2.b(fontFeatureSettings), start2, end2);
                }
                v textGeometricTransform = r1Var.getTextGeometricTransform();
                if (textGeometricTransform != null) {
                    setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), start2, end2);
                    setSpan(spannable, new k(textGeometricTransform.getSkewX()), start2, end2);
                }
                setLocaleList(spannable, r1Var.getLocaleList(), start2, end2);
                m5872setBackgroundRPmYEkk(spannable, r1Var.m4014getBackground0d7_KjU(), start2, end2);
                d2 shadow = r1Var.getShadow();
                if (shadow != null) {
                    setSpan(spannable, new j2.j(o0.m4894toArgb8_81llA(shadow.m4720getColor0d7_KjU()), i1.h.m4185getXimpl(shadow.m4721getOffsetF1C5BW0()), i1.h.m4186getYimpl(shadow.m4721getOffsetF1C5BW0()), shadow.getBlurRadius()), start2, end2);
                }
                long jM4020getLetterSpacingXSAIIZE = r1Var.m4020getLetterSpacingXSAIIZE();
                long jM6993getTypeUIouoOA = z.m6993getTypeUIouoOA(jM4020getLetterSpacingXSAIIZE);
                b0 b0Var = c0.f85325b;
                Object dVar = c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6742getSpUIouoOA()) ? new j2.d(density.mo3424toPxR2X_6o(jM4020getLetterSpacingXSAIIZE)) : c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6741getEmUIouoOA()) ? new j2.c(z.m6994getValueimpl(jM4020getLetterSpacingXSAIIZE)) : null;
                if (dVar != null) {
                    arrayList2.add(new d(dVar, start2, end2));
                }
            }
        }
        int size3 = arrayList2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar2 = (d) arrayList2.get(i12);
            setSpan(spannable, dVar2.component1(), dVar2.component2(), dVar2.component3());
        }
    }

    public static final void setTextDecoration(Spannable spannable, n nVar, int i10, int i11) {
        e0.checkNotNullParameter(spannable, "<this>");
        if (nVar != null) {
            n.a aVar = n.f83709b;
            setSpan(spannable, new l(nVar.contains(aVar.getUnderline()), nVar.contains(aVar.getLineThrough())), i10, i11);
        }
    }

    public static final void setTextIndent(Spannable spannable, x xVar, float f10, s2.e density) {
        e0.checkNotNullParameter(spannable, "<this>");
        e0.checkNotNullParameter(density, "density");
        if (xVar != null) {
            if ((z.m6991equalsimpl0(xVar.m6094getFirstLineXSAIIZE(), a0.getSp(0)) && z.m6991equalsimpl0(xVar.m6095getRestLineXSAIIZE(), a0.getSp(0))) || a0.m6730isUnspecifiedR2X_6o(xVar.m6094getFirstLineXSAIIZE()) || a0.m6730isUnspecifiedR2X_6o(xVar.m6095getRestLineXSAIIZE())) {
                return;
            }
            long jM6993getTypeUIouoOA = z.m6993getTypeUIouoOA(xVar.m6094getFirstLineXSAIIZE());
            b0 b0Var = c0.f85325b;
            float fM6994getValueimpl = 0.0f;
            float fMo3424toPxR2X_6o = c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6742getSpUIouoOA()) ? density.mo3424toPxR2X_6o(xVar.m6094getFirstLineXSAIIZE()) : c0.m6765equalsimpl0(jM6993getTypeUIouoOA, b0Var.m6741getEmUIouoOA()) ? z.m6994getValueimpl(xVar.m6094getFirstLineXSAIIZE()) * f10 : 0.0f;
            long jM6993getTypeUIouoOA2 = z.m6993getTypeUIouoOA(xVar.m6095getRestLineXSAIIZE());
            if (c0.m6765equalsimpl0(jM6993getTypeUIouoOA2, b0Var.m6742getSpUIouoOA())) {
                fM6994getValueimpl = density.mo3424toPxR2X_6o(xVar.m6095getRestLineXSAIIZE());
            } else if (c0.m6765equalsimpl0(jM6993getTypeUIouoOA2, b0Var.m6741getEmUIouoOA())) {
                fM6994getValueimpl = z.m6994getValueimpl(xVar.m6095getRestLineXSAIIZE()) * f10;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fMo3424toPxR2X_6o), (int) Math.ceil(fM6994getValueimpl)), 0, spannable.length());
        }
    }
}
