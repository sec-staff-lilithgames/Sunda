package o2;

import com.unity3d.ads.beta.xyn.RnJusJ;
import g2.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class j implements e0 {
    @Override // g2.e0
    public String capitalize(String string, n2.f locale) {
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = string.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? sv.e.titlecase(cCharAt, ((n2.a) locale).getJavaLocale()) : String.valueOf(cCharAt)));
        String strSubstring = string.substring(1);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @Override // g2.e0
    public String decapitalize(String string, n2.f locale) {
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) sv.e.lowercase(string.charAt(0), ((n2.a) locale).getJavaLocale()));
        String strSubstring = string.substring(1);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @Override // g2.e0
    public String toLowerCase(String string, n2.f locale) {
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
        String lowerCase = string.toLowerCase(((n2.a) locale).getJavaLocale());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // g2.e0
    public String toUpperCase(String str, n2.f locale) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, RnJusJ.UiBwQIbRuNz);
        kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
        String upperCase = str.toUpperCase(((n2.a) locale).getJavaLocale());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
