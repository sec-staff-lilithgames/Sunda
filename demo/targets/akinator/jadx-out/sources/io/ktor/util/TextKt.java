package io.ktor.util;

import kotlin.jvm.internal.e0;
import kv.a;
import sv.n0;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TextKt {
    public static final CaseInsensitiveString caseInsensitive(String str) {
        e0.checkNotNullParameter(str, "<this>");
        return new CaseInsensitiveString(str);
    }

    public static final v chomp(String str, String separator, a onMissingDelimiter) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(separator, "separator");
        e0.checkNotNullParameter(onMissingDelimiter, "onMissingDelimiter");
        int iIndexOf$default = n0.indexOf$default((CharSequence) str, separator, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return (v) onMissingDelimiter.invoke();
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring2 = str.substring(iIndexOf$default + 1);
        e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        return tu.e0.to(strSubstring, strSubstring2);
    }

    public static final String escapeHTML(String str) {
        e0.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\'') {
                sb2.append("&#x27;");
            } else if (cCharAt == '\"') {
                sb2.append("&quot;");
            } else if (cCharAt == '&') {
                sb2.append("&amp;");
            } else if (cCharAt == '<') {
                sb2.append("&lt;");
            } else if (cCharAt == '>') {
                sb2.append("&gt;");
            } else {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    private static final char toLowerCasePreservingASCII(char c10) {
        return ('A' > c10 || c10 >= '[') ? (c10 < 0 || c10 >= 128) ? Character.toLowerCase(c10) : c10 : (char) (c10 + ' ');
    }

    public static final String toLowerCasePreservingASCIIRules(String str) {
        e0.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            char cCharAt = str.charAt(i10);
            if (toLowerCasePreservingASCII(cCharAt) != cCharAt) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i10);
        int lastIndex = n0.getLastIndex(str);
        if (i10 <= lastIndex) {
            while (true) {
                sb2.append(toLowerCasePreservingASCII(str.charAt(i10)));
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    private static final char toUpperCasePreservingASCII(char c10) {
        return ('a' > c10 || c10 >= '{') ? (c10 < 0 || c10 >= 128) ? Character.toLowerCase(c10) : c10 : (char) (c10 - ' ');
    }

    public static final String toUpperCasePreservingASCIIRules(String str) {
        e0.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            char cCharAt = str.charAt(i10);
            if (toUpperCasePreservingASCII(cCharAt) != cCharAt) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i10);
        int lastIndex = n0.getLastIndex(str);
        if (i10 <= lastIndex) {
            while (true) {
                sb2.append(toUpperCasePreservingASCII(str.charAt(i10)));
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
