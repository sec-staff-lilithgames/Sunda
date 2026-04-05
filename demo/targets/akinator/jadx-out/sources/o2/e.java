package o2;

import android.text.SpannableString;
import g2.b;
import g2.c0;
import g2.c2;
import g2.f0;
import java.util.List;
import kotlin.jvm.internal.e0;
import kv.r;
import r2.x;
import s2.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {
    public static final CharSequence createCharSequence(String text, float f10, c2 contextTextStyle, List<b.C0570b> spanStyles, List<b.C0570b> placeholders, s2.e density, r resolveTypeface) {
        float f11;
        s2.e eVar;
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(contextTextStyle, "contextTextStyle");
        e0.checkNotNullParameter(spanStyles, "spanStyles");
        e0.checkNotNullParameter(placeholders, "placeholders");
        e0.checkNotNullParameter(density, "density");
        e0.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        if (spanStyles.isEmpty() && placeholders.isEmpty() && e0.areEqual(contextTextStyle.getTextIndent(), x.f83728c.getNone()) && a0.m6730isUnspecifiedR2X_6o(contextTextStyle.m3988getLineHeightXSAIIZE())) {
            return text;
        }
        SpannableString spannableString = new SpannableString(text);
        if (isIncludeFontPaddingEnabled(contextTextStyle) && contextTextStyle.getLineHeightStyle() == null) {
            p2.f.m5876setLineHeightr9BaKPg(spannableString, contextTextStyle.m3988getLineHeightXSAIIZE(), f10, density);
            f11 = f10;
            eVar = density;
        } else {
            r2.h lineHeightStyle = contextTextStyle.getLineHeightStyle();
            if (lineHeightStyle == null) {
                lineHeightStyle = r2.h.f83689c.getDefault();
            }
            f11 = f10;
            eVar = density;
            p2.f.m5875setLineHeightKmRG4DE(spannableString, contextTextStyle.m3988getLineHeightXSAIIZE(), f11, eVar, lineHeightStyle);
        }
        p2.f.setTextIndent(spannableString, contextTextStyle.getTextIndent(), f11, eVar);
        p2.f.setSpanStyles(spannableString, contextTextStyle, spanStyles, eVar, resolveTypeface);
        p2.c.setPlaceholders(spannableString, placeholders, eVar);
        return spannableString;
    }

    public static final boolean isIncludeFontPaddingEnabled(c2 c2Var) {
        c0 paragraphStyle;
        e0.checkNotNullParameter(c2Var, "<this>");
        f0 platformStyle = c2Var.getPlatformStyle();
        if (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) {
            return true;
        }
        return paragraphStyle.getIncludeFontPadding();
    }
}
