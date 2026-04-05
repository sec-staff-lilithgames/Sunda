package io.odeeo.internal.k0;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import java.util.ArrayDeque;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f {
    public static d a(d dVar, Map<String, g> map) {
        while (dVar != null) {
            g gVarResolveStyle = resolveStyle(dVar.f64460f, dVar.getStyleIds(), map);
            if (gVarResolveStyle != null && gVarResolveStyle.getRubyType() == 1) {
                return dVar;
            }
            dVar = dVar.f64464j;
        }
        return null;
    }

    public static void applyStylesToSpan(Spannable spannable, int i10, int i11, g gVar, d dVar, Map<String, g> map, int i12) {
        d dVarB;
        g gVarResolveStyle;
        int i13;
        if (gVar.getStyle() != -1) {
            spannable.setSpan(new StyleSpan(gVar.getStyle()), i10, i11, 33);
        }
        if (gVar.isLinethrough()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.isUnderline()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.hasFontColor()) {
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannable, new ForegroundColorSpan(gVar.getFontColor()), i10, i11, 33);
        }
        if (gVar.hasBackgroundColor()) {
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannable, new BackgroundColorSpan(gVar.getBackgroundColor()), i10, i11, 33);
        }
        if (gVar.getFontFamily() != null) {
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannable, new TypefaceSpan(gVar.getFontFamily()), i10, i11, 33);
        }
        if (gVar.getTextEmphasis() != null) {
            b bVar = (b) io.odeeo.internal.q0.a.checkNotNull(gVar.getTextEmphasis());
            int i14 = bVar.f64435a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = bVar.f64436b;
            }
            int i15 = bVar.f64437c;
            if (i15 == -2) {
                i15 = 1;
            }
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannable, new io.odeeo.internal.h0.d(i14, i13, i15), i10, i11, 33);
        }
        int rubyType = gVar.getRubyType();
        if (rubyType == 2) {
            d dVarA = a(dVar, map);
            if (dVarA != null && (dVarB = b(dVarA, map)) != null) {
                if (dVarB.getChildCount() != 1 || dVarB.getChild(0).f64456b == null) {
                    p.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) g0.castNonNull(dVarB.getChild(0).f64456b);
                    g gVarResolveStyle2 = resolveStyle(dVarB.f64460f, dVarB.getStyleIds(), map);
                    int rubyPosition = gVarResolveStyle2 != null ? gVarResolveStyle2.getRubyPosition() : -1;
                    if (rubyPosition == -1 && (gVarResolveStyle = resolveStyle(dVarA.f64460f, dVarA.getStyleIds(), map)) != null) {
                        rubyPosition = gVarResolveStyle.getRubyPosition();
                    }
                    spannable.setSpan(new io.odeeo.internal.h0.b(str, rubyPosition), i10, i11, 33);
                }
            }
        } else if (rubyType == 3 || rubyType == 4) {
            spannable.setSpan(new a(), i10, i11, 33);
        }
        if (gVar.getTextCombine()) {
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannable, new io.odeeo.internal.h0.a(), i10, i11, 33);
        }
        int fontSizeUnit = gVar.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannable, new AbsoluteSizeSpan((int) gVar.getFontSize(), true), i10, i11, 33);
        } else if (fontSizeUnit == 2) {
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannable, new RelativeSizeSpan(gVar.getFontSize()), i10, i11, 33);
        } else {
            if (fontSizeUnit != 3) {
                return;
            }
            io.odeeo.internal.h0.c.addOrReplaceSpan(spannable, new RelativeSizeSpan(gVar.getFontSize() / 100.0f), i10, i11, 33);
        }
    }

    public static d b(d dVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            d dVar2 = (d) arrayDeque.pop();
            g gVarResolveStyle = resolveStyle(dVar2.f64460f, dVar2.getStyleIds(), map);
            if (gVarResolveStyle != null && gVarResolveStyle.getRubyType() == 3) {
                return dVar2;
            }
            for (int childCount = dVar2.getChildCount() - 1; childCount >= 0; childCount--) {
                arrayDeque.push(dVar2.getChild(childCount));
            }
        }
        return null;
    }

    public static g resolveStyle(g gVar, String[] strArr, Map<String, g> map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.chain(map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.chain(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.chain(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    public static String a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }
}
