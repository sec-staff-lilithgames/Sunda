package sv;

import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class s0 {
    public static final String titlecaseImpl(char c10) {
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.e0.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        kotlin.jvm.internal.e0.checkNotNull(upperCase, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = upperCase.substring(1);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        kotlin.jvm.internal.e0.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }
}
