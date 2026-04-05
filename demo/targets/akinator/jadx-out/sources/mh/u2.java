package mh;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class u2 {
    public static String a(Object obj) {
        if (obj == null) {
            return AbstractJsonLexerKt.NULL;
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e10);
            StringBuilder sbO = e3.g.o("<", str, " threw ");
            sbO.append(e10.getClass().getName());
            sbO.append(">");
            return sbO.toString();
        }
    }

    public static boolean b(CharSequence charSequence, int i10) {
        return i10 >= 0 && i10 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i10)) && Character.isLowSurrogate(charSequence.charAt(i10 + 1));
    }

    public static String commonPrefix(CharSequence charSequence, CharSequence charSequence2) {
        p1.checkNotNull(charSequence);
        p1.checkNotNull(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i10 = 0;
        while (i10 < iMin && charSequence.charAt(i10) == charSequence2.charAt(i10)) {
            i10++;
        }
        int i11 = i10 - 1;
        if (b(charSequence, i11) || b(charSequence2, i11)) {
            i10--;
        }
        return charSequence.subSequence(0, i10).toString();
    }

    public static String commonSuffix(CharSequence charSequence, CharSequence charSequence2) {
        p1.checkNotNull(charSequence);
        p1.checkNotNull(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i10 = 0;
        while (i10 < iMin && charSequence.charAt((charSequence.length() - i10) - 1) == charSequence2.charAt((charSequence2.length() - i10) - 1)) {
            i10++;
        }
        if (b(charSequence, (charSequence.length() - i10) - 1) || b(charSequence2, (charSequence2.length() - i10) - 1)) {
            i10--;
        }
        return charSequence.subSequence(charSequence.length() - i10, charSequence.length()).toString();
    }

    public static String emptyToNull(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static String lenientFormat(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i10 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i11 = 0;
        while (i10 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i11)) != -1) {
            sb2.append((CharSequence) strValueOf, i11, iIndexOf);
            sb2.append(a(objArr[i10]));
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) strValueOf, i11, strValueOf.length());
        if (i10 < objArr.length) {
            String str2 = " [";
            while (i10 < objArr.length) {
                sb2.append(str2);
                sb2.append(a(objArr[i10]));
                i10++;
                str2 = ", ";
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb2.toString();
    }

    public static String nullToEmpty(String str) {
        return str == null ? "" : str;
    }

    public static String padEnd(String str, int i10, char c10) {
        p1.checkNotNull(str);
        if (str.length() >= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        for (int length = str.length(); length < i10; length++) {
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public static String padStart(String str, int i10, char c10) {
        p1.checkNotNull(str);
        if (str.length() >= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        for (int length = str.length(); length < i10; length++) {
            sb2.append(c10);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String repeat(String str, int i10) {
        p1.checkNotNull(str);
        if (i10 <= 1) {
            p1.checkArgument(i10 >= 0, "invalid count: %s", i10);
            return i10 == 0 ? "" : str;
        }
        int length = str.length();
        long j10 = length * i10;
        int i11 = (int) j10;
        if (i11 != j10) {
            throw new ArrayIndexOutOfBoundsException(p0.o2.m(j10, "Required array size too large: "));
        }
        char[] cArr = new char[i11];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i12 = i11 - length;
            if (length >= i12) {
                System.arraycopy(cArr, 0, cArr, length, i12);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }
}
