package io.odeeo.internal.w0;

import io.odeeo.internal.t0.u;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                long j10 = jArr[i10];
                long j11 = jArr2[i10];
                if (j10 != j11) {
                    return g.compare(j10, j11);
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final long[] f67342a = new long[37];

        /* renamed from: b, reason: collision with root package name */
        public static final int[] f67343b = new int[37];

        /* renamed from: c, reason: collision with root package name */
        public static final int[] f67344c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i10 = 2; i10 <= 36; i10++) {
                long j10 = i10;
                f67342a[i10] = g.divide(-1L, j10);
                f67343b[i10] = (int) g.remainder(-1L, j10);
                f67344c[i10] = bigInteger.toString(i10).length() - 1;
            }
        }

        public static boolean a(long j10, int i10, int i11) {
            if (j10 < 0) {
                return true;
            }
            long j11 = f67342a[i11];
            if (j10 < j11) {
                return false;
            }
            return j10 > j11 || i10 > f67343b[i11];
        }
    }

    public static long a(long j10) {
        return j10 ^ Long.MIN_VALUE;
    }

    public static int compare(long j10, long j11) {
        return e.compare(a(j10), a(j11));
    }

    public static long decode(String str) {
        f fVarA = f.a(str);
        try {
            return parseUnsignedLong(fVarA.f67338a, fVarA.f67339b);
        } catch (NumberFormatException e10) {
            NumberFormatException numberFormatException = new NumberFormatException(a.b.k("Error parsing value: ", str));
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
        u.checkNotNull(str);
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
        return a.INSTANCE;
    }

    public static long max(long... jArr) {
        u.checkArgument(jArr.length > 0);
        long jA = a(jArr[0]);
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long jA2 = a(jArr[i10]);
            if (jA2 > jA) {
                jA = jA2;
            }
        }
        return a(jA);
    }

    public static long min(long... jArr) {
        u.checkArgument(jArr.length > 0);
        long jA = a(jArr[0]);
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long jA2 = a(jArr[i10]);
            if (jA2 < jA) {
                jA = jA2;
            }
        }
        return a(jA);
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
        u.checkNotNull(jArr);
        sort(jArr, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        u.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static String toString(long j10) {
        return toString(j10, 10);
    }

    public static long parseUnsignedLong(String str, int i10) {
        u.checkNotNull(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (i10 < 2 || i10 > 36) {
            throw new NumberFormatException(a.b.e(i10, "illegal radix: "));
        }
        int i11 = b.f67344c[i10] - 1;
        long j10 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            int iDigit = Character.digit(str.charAt(i12), i10);
            if (iDigit == -1) {
                throw new NumberFormatException(str);
            }
            if (i12 > i11 && b.a(j10, iDigit, i10)) {
                throw new NumberFormatException("Too large for unsigned long: ".concat(str));
            }
            j10 = (j10 * i10) + iDigit;
        }
        return j10;
    }

    public static String toString(long j10, int i10) {
        u.checkArgument(i10 >= 2 && i10 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i10);
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
        u.checkNotNull(jArr);
        u.checkPositionIndexes(i10, i11, jArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            jArr[i12] = a(jArr[i12]);
        }
        Arrays.sort(jArr, i10, i11);
        while (i10 < i11) {
            jArr[i10] = a(jArr[i10]);
            i10++;
        }
    }

    public static void sortDescending(long[] jArr, int i10, int i11) {
        u.checkNotNull(jArr);
        u.checkPositionIndexes(i10, i11, jArr.length);
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
