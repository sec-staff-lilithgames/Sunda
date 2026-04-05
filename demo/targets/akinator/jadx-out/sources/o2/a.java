package o2;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import g2.b;
import g2.f2;
import g2.r1;
import java.util.List;
import kotlin.jvm.internal.e0;
import l2.a1;
import l2.c1;
import l2.e1;
import l2.t;
import l2.v;
import l2.x;
import l2.y;
import l2.y0;
import r2.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static final SpannableString toAccessibilitySpannableString(g2.b bVar, s2.e density, v resourceLoader) {
        e0.checkNotNullParameter(bVar, "<this>");
        e0.checkNotNullParameter(density, "density");
        e0.checkNotNullParameter(resourceLoader, "resourceLoader");
        return toAccessibilitySpannableString(bVar, density, t.createFontFamilyResolver(resourceLoader));
    }

    public static final SpannableString toAccessibilitySpannableString(g2.b bVar, s2.e eVar, y fontFamilyResolver) {
        int i10;
        e0.checkNotNullParameter(bVar, "<this>");
        s2.e density = eVar;
        e0.checkNotNullParameter(density, "density");
        e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(bVar.getText());
        List<b.C0570b> spanStyles = bVar.getSpanStyles();
        int size = spanStyles.size();
        int i11 = 0;
        while (i11 < size) {
            b.C0570b c0570b = spanStyles.get(i11);
            r1 r1Var = (r1) c0570b.component1();
            int iComponent2 = c0570b.component2();
            int iComponent3 = c0570b.component3();
            r1 r1VarM4012copyIuqyXdg = r1Var.m4012copyIuqyXdg((16351 & 1) != 0 ? r1Var.m4016getColor0d7_KjU() : 0L, (16351 & 2) != 0 ? r1Var.f56827b : 0L, (16351 & 4) != 0 ? r1Var.f56828c : null, (16351 & 8) != 0 ? r1Var.f56829d : null, (16351 & 16) != 0 ? r1Var.f56830e : null, (16351 & 32) != 0 ? r1Var.f56831f : null, (16351 & 64) != 0 ? r1Var.f56832g : null, (16351 & 128) != 0 ? r1Var.f56833h : 0L, (16351 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? r1Var.f56834i : null, (16351 & 512) != 0 ? r1Var.f56835j : null, (16351 & 1024) != 0 ? r1Var.f56836k : null, (16351 & 2048) != 0 ? r1Var.f56837l : 0L, (16351 & 4096) != 0 ? r1Var.f56838m : null, (16351 & Segment.SIZE) != 0 ? r1Var.f56839n : null);
            p2.f.m5873setColorRPmYEkk(spannableString, r1VarM4012copyIuqyXdg.m4016getColor0d7_KjU(), iComponent2, iComponent3);
            p2.f.m5874setFontSizeKmRG4DE(spannableString, r1VarM4012copyIuqyXdg.m4017getFontSizeXSAIIZE(), density, iComponent2, iComponent3);
            SpannableString spannableString2 = spannableString;
            if (r1VarM4012copyIuqyXdg.getFontWeight() != null || r1VarM4012copyIuqyXdg.m4018getFontStyle4Lr2A7w() != null) {
                c1 fontWeight = r1VarM4012copyIuqyXdg.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = c1.f72258c.getNormal();
                }
                y0 y0VarM4018getFontStyle4Lr2A7w = r1VarM4012copyIuqyXdg.m4018getFontStyle4Lr2A7w();
                spannableString2.setSpan(new StyleSpan(l2.h.m5438getAndroidTypefaceStyleFO1MlWM(fontWeight, y0VarM4018getFontStyle4Lr2A7w != null ? y0VarM4018getFontStyle4Lr2A7w.m5488unboximpl() : y0.f72394b.m5480getNormal_LCdwA())), iComponent2, iComponent3, 33);
            }
            if (r1VarM4012copyIuqyXdg.getFontFamily() == null) {
                i10 = iComponent3;
            } else {
                if (r1VarM4012copyIuqyXdg.getFontFamily() instanceof e1) {
                    spannableString2.setSpan(new TypefaceSpan(((e1) r1VarM4012copyIuqyXdg.getFontFamily()).getName()), iComponent2, iComponent3, 33);
                } else if (Build.VERSION.SDK_INT >= 28) {
                    x fontFamily = r1VarM4012copyIuqyXdg.getFontFamily();
                    a1 a1VarM4019getFontSynthesisZQGJjVo = r1VarM4012copyIuqyXdg.m4019getFontSynthesisZQGJjVo();
                    i10 = iComponent3;
                    spannableString2.setSpan(m.f77419a.createTypefaceSpan((Typeface) y.m5481resolveDPcqOEQ$default(fontFamilyResolver, fontFamily, null, 0, a1VarM4019getFontSynthesisZQGJjVo != null ? a1VarM4019getFontSynthesisZQGJjVo.m5431unboximpl() : a1.f72244b.m5489getAllGVVA2EU(), 6, null).getValue()), iComponent2, i10, 33);
                }
                i10 = iComponent3;
            }
            if (r1VarM4012copyIuqyXdg.getTextDecoration() != null) {
                r2.n textDecoration = r1VarM4012copyIuqyXdg.getTextDecoration();
                n.a aVar = r2.n.f83709b;
                if (textDecoration.contains(aVar.getUnderline())) {
                    spannableString2.setSpan(new UnderlineSpan(), iComponent2, i10, 33);
                }
                if (r1VarM4012copyIuqyXdg.getTextDecoration().contains(aVar.getLineThrough())) {
                    spannableString2.setSpan(new StrikethroughSpan(), iComponent2, i10, 33);
                }
            }
            if (r1VarM4012copyIuqyXdg.getTextGeometricTransform() != null) {
                spannableString2.setSpan(new ScaleXSpan(r1VarM4012copyIuqyXdg.getTextGeometricTransform().getScaleX()), iComponent2, i10, 33);
            }
            p2.f.setLocaleList(spannableString2, r1VarM4012copyIuqyXdg.getLocaleList(), iComponent2, i10);
            p2.f.m5872setBackgroundRPmYEkk(spannableString2, r1VarM4012copyIuqyXdg.m4014getBackground0d7_KjU(), iComponent2, i10);
            i11++;
            density = eVar;
            spannableString = spannableString2;
        }
        SpannableString spannableString3 = spannableString;
        List<b.C0570b> ttsAnnotations = bVar.getTtsAnnotations(0, bVar.length());
        int size2 = ttsAnnotations.size();
        for (int i12 = 0; i12 < size2; i12++) {
            b.C0570b c0570b2 = ttsAnnotations.get(i12);
            spannableString3.setSpan(p2.h.toSpan((f2) c0570b2.component1()), c0570b2.component2(), c0570b2.component3(), 33);
        }
        return spannableString3;
    }
}
