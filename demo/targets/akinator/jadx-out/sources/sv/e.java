package sv;

import java.util.Locale;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e {
    public static int checkRadix(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        StringBuilder sbT = o2.t(i10, "radix ", " was not in valid range ");
        sbT.append(new qv.m(2, 36));
        throw new IllegalArgumentException(sbT.toString());
    }

    public static final int digitOf(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    public static final b getCategory(char c10) {
        return b.f86118e.valueOf(Character.getType(c10));
    }

    public static final d getDirectionality(char c10) {
        return d.f86128c.valueOf(Character.getDirectionality(c10));
    }

    public static boolean isWhitespace(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static String lowercase(char c10, Locale locale) {
        kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.e0.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static String titlecase(char c10, Locale locale) {
        kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
        String strUppercase = uppercase(c10, locale);
        if (strUppercase.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            kotlin.jvm.internal.e0.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (kotlin.jvm.internal.e0.areEqual(strUppercase, upperCase)) {
                return String.valueOf(Character.toTitleCase(c10));
            }
        } else if (c10 != 329) {
            char cCharAt = strUppercase.charAt(0);
            kotlin.jvm.internal.e0.checkNotNull(strUppercase, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strUppercase.substring(1);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            kotlin.jvm.internal.e0.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return strUppercase;
    }

    public static final String uppercase(char c10, Locale locale) {
        kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.e0.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
