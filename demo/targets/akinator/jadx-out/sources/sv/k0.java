package sv;

import b0.e2;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class k0 extends j0 {
    @tu.f
    public static final String capitalize(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(locale, "getDefault(...)");
        return capitalize(str, locale);
    }

    public static final int compareTo(String str, String other, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return z10 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static /* synthetic */ int compareTo$default(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return compareTo(str, str2, z10);
    }

    public static String concatToString(char[] cArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static /* synthetic */ String concatToString$default(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        return concatToString(cArr, i10, i11);
    }

    public static final boolean contentEquals(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? n0.contentEqualsImpl(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    @tu.f
    public static final String decapitalize(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(locale, "getDefault(...)");
        kotlin.jvm.internal.e0.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public static String decodeToString(byte[] bArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, g.f86134b);
    }

    public static /* synthetic */ String decodeToString$default(byte[] bArr, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return decodeToString(bArr, i10, i11, z10);
    }

    public static byte[] encodeToByteArray(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(g.f86134b);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return encodeToByteArray(str, i10, i11, z10);
    }

    public static boolean endsWith(String str, String suffix, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : regionMatches(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean endsWith$default(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return endsWith(str, str2, z10);
    }

    public static boolean equals(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean equals$default(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return equals(str, str2, z10);
    }

    public static Comparator<String> getCASE_INSENSITIVE_ORDER(g1 g1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(g1Var, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static final boolean regionMatches(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return ((charSequence instanceof String) && (other instanceof String)) ? regionMatches((String) charSequence, i10, (String) other, i11, i12, z10) : n0.regionMatchesImpl(charSequence, i10, other, i11, i12, z10);
    }

    public static /* synthetic */ boolean regionMatches$default(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return regionMatches(charSequence, i10, charSequence2, i11, i12, z10);
    }

    public static String repeat(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(e2.h('.', "Count 'n' must be non-negative, but was ", i10).toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNull(string);
        return string;
    }

    public static final String replace(String str, char c10, char c11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (f.equals(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static /* synthetic */ String replace$default(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return replace(str, c10, c11, z10);
    }

    public static final String replaceFirst(String str, char c10, char c11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        int iIndexOf$default = n0.indexOf$default(str, c10, 0, z10, 2, (Object) null);
        return iIndexOf$default < 0 ? str : n0.replaceRange(str, iIndexOf$default, iIndexOf$default + 1, String.valueOf(c11)).toString();
    }

    public static /* synthetic */ String replaceFirst$default(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return replaceFirst(str, c10, c11, z10);
    }

    public static final List<String> split(CharSequence charSequence, Pattern regex, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(regex, "regex");
        n0.requireNonNegativeLimit(i10);
        if (i10 == 0) {
            i10 = -1;
        }
        String[] strArrSplit = regex.split(charSequence, i10);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strArrSplit, "split(...)");
        return uu.f0.asList(strArrSplit);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Pattern pattern, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return split(charSequence, pattern, i10);
    }

    public static boolean startsWith(String str, String prefix, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : regionMatches(str, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return startsWith(str, str2, z10);
    }

    public static final char[] toCharArray(String str, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        uu.g.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, str.length());
        char[] cArr = new char[i11 - i10];
        str.getChars(i10, i11, cArr, 0);
        return cArr;
    }

    public static /* synthetic */ char[] toCharArray$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return toCharArray(str, i10, i11);
    }

    @tu.f
    public static final String capitalize(String str, Locale locale) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb2.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            kotlin.jvm.internal.e0.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public static String concatToString(char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        uu.g.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    @tu.f
    public static final String decapitalize(String str, Locale locale) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        kotlin.jvm.internal.e0.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public static final String decodeToString(byte[] bArr, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        uu.g.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, bArr.length);
        if (!z10) {
            return new String(bArr, i10, i11 - i10, g.f86134b);
        }
        CharsetDecoder charsetDecoderNewDecoder = g.f86134b.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final byte[] encodeToByteArray(String str, int i10, int i11, boolean z10) throws CharacterCodingException {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        uu.g.Companion.checkBoundsIndexes$kotlin_stdlib(i10, i11, str.length());
        if (!z10) {
            String strSubstring = str.substring(i10, i11);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = g.f86134b;
            kotlin.jvm.internal.e0.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        }
        CharsetEncoder charsetEncoderNewEncoder = g.f86134b.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i10, i11));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            kotlin.jvm.internal.e0.checkNotNull(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                kotlin.jvm.internal.e0.checkNotNull(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static /* synthetic */ boolean regionMatches$default(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return regionMatches(str, i10, str2, i11, i12, z10);
    }

    public static /* synthetic */ String replace$default(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return replace(str, str2, str3, z10);
    }

    public static /* synthetic */ String replaceFirst$default(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return replaceFirst(str, str2, str3, z10);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return startsWith(str, str2, i10, z10);
    }

    public static final String replaceFirst(String str, String oldValue, String newValue, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(oldValue, "oldValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(newValue, "newValue");
        int iIndexOf$default = n0.indexOf$default(str, oldValue, 0, z10, 2, (Object) null);
        return iIndexOf$default < 0 ? str : n0.replaceRange(str, iIndexOf$default, oldValue.length() + iIndexOf$default, newValue).toString();
    }

    public static boolean startsWith(String str, String prefix, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        if (!z10) {
            return str.startsWith(prefix, i10);
        }
        return regionMatches(str, i10, prefix, 0, prefix.length(), z10);
    }

    public static boolean contentEquals(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        if (z10) {
            return n0.contentEqualsIgnoreCaseImpl(charSequence, charSequence2);
        }
        return contentEquals(charSequence, charSequence2);
    }

    public static boolean regionMatches(String str, int i10, String other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        if (!z10) {
            return str.regionMatches(i10, other, i11, i12);
        }
        return str.regionMatches(z10, i10, other, i11, i12);
    }

    public static String replace(String str, String oldValue, String newValue, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(oldValue, "oldValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(newValue, "newValue");
        int i10 = 0;
        int iIndexOf = n0.indexOf(str, oldValue, 0, z10);
        if (iIndexOf < 0) {
            return str;
        }
        int length = oldValue.length();
        int iCoerceAtLeast = qv.v.coerceAtLeast(length, 1);
        int length2 = newValue.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append((CharSequence) str, i10, iIndexOf);
                sb2.append(newValue);
                i10 = iIndexOf + length;
                if (iIndexOf >= str.length()) {
                    break;
                }
                iIndexOf = n0.indexOf(str, oldValue, iIndexOf + iCoerceAtLeast, z10);
            } while (iIndexOf > 0);
            sb2.append((CharSequence) str, i10, str.length());
            String string = sb2.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        throw new OutOfMemoryError();
    }
}
