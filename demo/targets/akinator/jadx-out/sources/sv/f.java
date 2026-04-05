package sv;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f extends e {
    public static final char digitToChar(int i10) {
        if (i10 < 0 || i10 >= 10) {
            throw new IllegalArgumentException(o2.k(i10, "Int ", " is not a decimal digit"));
        }
        return (char) (i10 + 48);
    }

    public static final int digitToInt(char c10) {
        int iDigitOf = e.digitOf(c10, 10);
        if (iDigitOf >= 0) {
            return iDigitOf;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    public static final Integer digitToIntOrNull(char c10) {
        Integer numValueOf = Integer.valueOf(e.digitOf(c10, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean equals(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean equals$default(char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return equals(c10, c11, z10);
    }

    public static boolean isSurrogate(char c10) {
        return 55296 <= c10 && c10 < 57344;
    }

    public static String titlecase(char c10) {
        return s0.titlecaseImpl(c10);
    }

    public static final Integer digitToIntOrNull(char c10, int i10) {
        e.checkRadix(i10);
        Integer numValueOf = Integer.valueOf(e.digitOf(c10, i10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final int digitToInt(char c10, int i10) {
        Integer numDigitToIntOrNull = digitToIntOrNull(c10, i10);
        if (numDigitToIntOrNull != null) {
            return numDigitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a digit in the given radix=" + i10);
    }

    public static final char digitToChar(int i10, int i11) {
        if (2 > i11 || i11 >= 37) {
            throw new IllegalArgumentException(o2.k(i11, "Invalid radix: ", ". Valid radix values are in range 2..36"));
        }
        if (i10 < 0 || i10 >= i11) {
            throw new IllegalArgumentException(w0.i.a(i10, i11, "Digit ", " does not represent a valid digit in radix "));
        }
        return (char) (i10 < 10 ? i10 + 48 : ((char) (i10 + 65)) - '\n');
    }
}
