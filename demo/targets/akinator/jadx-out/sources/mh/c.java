package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c {
    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        char c10;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i10 = 0; i10 < length; i10++) {
                if (charSequence.charAt(i10) == charSequence2.charAt(i10) || ((c10 = (char) ((r3 | ' ') - 97)) < 26 && c10 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isLowerCase(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    public static boolean isUpperCase(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static String toLowerCase(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (isUpperCase(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (isUpperCase(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String toUpperCase(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (isLowerCase(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (isLowerCase(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String truncate(CharSequence charSequence, int i10, String str) {
        p1.checkNotNull(charSequence);
        int length = i10 - str.length();
        p1.checkArgument(length >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", i10, str.length());
        int length2 = charSequence.length();
        String str2 = charSequence;
        if (length2 <= i10) {
            String string = charSequence.toString();
            int length3 = string.length();
            str2 = string;
            if (length3 <= i10) {
                return string;
            }
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append((CharSequence) str2, 0, length);
        sb2.append(str);
        return sb2.toString();
    }

    public static String toLowerCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toLowerCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = toLowerCase(charSequence.charAt(i10));
        }
        return String.valueOf(cArr);
    }

    public static String toUpperCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toUpperCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = toUpperCase(charSequence.charAt(i10));
        }
        return String.valueOf(cArr);
    }

    public static char toLowerCase(char c10) {
        return isUpperCase(c10) ? (char) (c10 ^ ' ') : c10;
    }

    public static char toUpperCase(char c10) {
        return isLowerCase(c10) ? (char) (c10 ^ ' ') : c10;
    }
}
