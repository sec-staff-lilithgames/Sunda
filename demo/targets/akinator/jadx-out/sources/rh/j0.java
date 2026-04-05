package rh;

import java.util.Arrays;
import java.util.Comparator;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j0 {
    public static int compare(long j10, long j11) {
        return b0.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static long decode(String str) {
        com.android.billingclient.api.w wVarA = com.android.billingclient.api.w.a(str);
        try {
            return parseUnsignedLong((String) wVarA.f12791b, wVarA.f12790a);
        } catch (NumberFormatException e10) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: ".concat(str));
            numberFormatException.initCause(e10);
            throw numberFormatException;
        }
    }

    public static long divide(long j10, long j11) {
        if (j11 < 0) {
            return compare(j10, j11) < 0 ? 0L : 1L;
        }
        if (j10 >= 0) {
            return j10 / j11;
        }
        long j12 = ((j10 >>> 1) / j11) << 1;
        return j12 + (compare(j10 - (j12 * j11), j11) < 0 ? 0 : 1);
    }

    public static String join(String str, long... jArr) {
        p1.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(jArr.length * 5);
        sb2.append(toString(jArr[0]));
        for (int i10 = 1; i10 < jArr.length; i10++) {
            sb2.append(str);
            sb2.append(toString(jArr[i10]));
        }
        return sb2.toString();
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return h0.f84368b;
    }

    public static long max(long... jArr) {
        p1.checkArgument(jArr.length > 0);
        long j10 = jArr[0] ^ Long.MIN_VALUE;
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10] ^ Long.MIN_VALUE;
            if (j11 > j10) {
                j10 = j11;
            }
        }
        return j10 ^ Long.MIN_VALUE;
    }

    public static long min(long... jArr) {
        p1.checkArgument(jArr.length > 0);
        long j10 = jArr[0] ^ Long.MIN_VALUE;
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10] ^ Long.MIN_VALUE;
            if (j11 < j10) {
                j10 = j11;
            }
        }
        return j10 ^ Long.MIN_VALUE;
    }

    public static long parseUnsignedLong(String str) {
        return parseUnsignedLong(str, 10);
    }

    public static long remainder(long j10, long j11) {
        if (j11 < 0) {
            return compare(j10, j11) < 0 ? j10 : j10 - j11;
        }
        if (j10 >= 0) {
            return j10 % j11;
        }
        long j12 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
        if (compare(j12, j11) < 0) {
            j11 = 0;
        }
        return j12 - j11;
    }

    public static void sort(long[] jArr) {
        p1.checkNotNull(jArr);
        sort(jArr, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        p1.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static String toString(long j10) {
        return toString(j10, 10);
    }

    public static long parseUnsignedLong(String str, int i10) {
        p1.checkNotNull(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (i10 < 2 || i10 > 36) {
            throw new NumberFormatException(a.b.e(i10, "illegal radix: "));
        }
        int i11 = i0.f84373c[i10] - 1;
        long j10 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            int iDigit = Character.digit(str.charAt(i12), i10);
            if (iDigit == -1) {
                throw new NumberFormatException(str);
            }
            if (i12 > i11) {
                if (j10 >= 0) {
                    long j11 = i0.f84371a[i10];
                    if (j10 >= j11 && (j10 > j11 || iDigit > i0.f84372b[i10])) {
                    }
                }
                throw new NumberFormatException("Too large for unsigned long: ".concat(str));
            }
            j10 = (j10 * i10) + iDigit;
        }
        return j10;
    }

    public static String toString(long j10, int i10) {
        p1.checkArgument(i10 >= 2 && i10 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i10);
        if (j10 == 0) {
            return "0";
        }
        if (j10 > 0) {
            return Long.toString(j10, i10);
        }
        int i11 = 64;
        char[] cArr = new char[64];
        int i12 = i10 - 1;
        if ((i10 & i12) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i10);
            do {
                i11--;
                cArr[i11] = Character.forDigit(((int) j10) & i12, i10);
                j10 >>>= iNumberOfTrailingZeros;
            } while (j10 != 0);
        } else {
            long jDivide = (i10 & 1) == 0 ? (j10 >>> 1) / (i10 >>> 1) : divide(j10, i10);
            long j11 = i10;
            int i13 = 63;
            cArr[63] = Character.forDigit((int) (j10 - (jDivide * j11)), i10);
            while (jDivide > 0) {
                i13--;
                cArr[i13] = Character.forDigit((int) (jDivide % j11), i10);
                jDivide /= j11;
            }
            i11 = i13;
        }
        return new String(cArr, i11, 64 - i11);
    }

    public static void sort(long[] jArr, int i10, int i11) {
        p1.checkNotNull(jArr);
        p1.checkPositionIndexes(i10, i11, jArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            jArr[i12] = Long.MIN_VALUE ^ jArr[i12];
        }
        Arrays.sort(jArr, i10, i11);
        while (i10 < i11) {
            jArr[i10] = jArr[i10] ^ Long.MIN_VALUE;
            i10++;
        }
    }

    public static void sortDescending(long[] jArr, int i10, int i11) {
        p1.checkNotNull(jArr);
        p1.checkPositionIndexes(i10, i11, jArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            jArr[i12] = Long.MAX_VALUE ^ jArr[i12];
        }
        Arrays.sort(jArr, i10, i11);
        while (i10 < i11) {
            jArr[i10] = jArr[i10] ^ Long.MAX_VALUE;
            i10++;
        }
    }
}
