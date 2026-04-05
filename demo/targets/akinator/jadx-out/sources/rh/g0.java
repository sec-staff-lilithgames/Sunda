package rh;

import java.util.Arrays;
import java.util.Comparator;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g0 {
    public static int checkedCast(long j10) {
        p1.checkArgument((j10 >> 32) == 0, "out of range: %s", j10);
        return (int) j10;
    }

    public static int compare(int i10, int i11) {
        return w.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    public static int decode(String str) {
        com.android.billingclient.api.w wVarA = com.android.billingclient.api.w.a(str);
        try {
            return parseUnsignedInt((String) wVarA.f12791b, wVarA.f12790a);
        } catch (NumberFormatException e10) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: ".concat(str));
            numberFormatException.initCause(e10);
            throw numberFormatException;
        }
    }

    public static int divide(int i10, int i11) {
        return (int) (toLong(i10) / toLong(i11));
    }

    public static String join(String str, int... iArr) {
        p1.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(iArr.length * 5);
        sb2.append(toString(iArr[0]));
        for (int i10 = 1; i10 < iArr.length; i10++) {
            sb2.append(str);
            sb2.append(toString(iArr[i10]));
        }
        return sb2.toString();
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return f0.f84363b;
    }

    public static int max(int... iArr) {
        p1.checkArgument(iArr.length > 0);
        int i10 = iArr[0] ^ Integer.MIN_VALUE;
        for (int i11 = 1; i11 < iArr.length; i11++) {
            int i12 = iArr[i11] ^ Integer.MIN_VALUE;
            if (i12 > i10) {
                i10 = i12;
            }
        }
        return i10 ^ Integer.MIN_VALUE;
    }

    public static int min(int... iArr) {
        p1.checkArgument(iArr.length > 0);
        int i10 = iArr[0] ^ Integer.MIN_VALUE;
        for (int i11 = 1; i11 < iArr.length; i11++) {
            int i12 = iArr[i11] ^ Integer.MIN_VALUE;
            if (i12 < i10) {
                i10 = i12;
            }
        }
        return i10 ^ Integer.MIN_VALUE;
    }

    public static int parseUnsignedInt(String str) {
        return parseUnsignedInt(str, 10);
    }

    public static int remainder(int i10, int i11) {
        return (int) (toLong(i10) % toLong(i11));
    }

    public static int saturatedCast(long j10) {
        if (j10 <= 0) {
            return 0;
        }
        if (j10 >= 4294967296L) {
            return -1;
        }
        return (int) j10;
    }

    public static void sort(int[] iArr) {
        p1.checkNotNull(iArr);
        sort(iArr, 0, iArr.length);
    }

    public static void sortDescending(int[] iArr) {
        p1.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    public static long toLong(int i10) {
        return i10 & 4294967295L;
    }

    public static String toString(int i10) {
        return toString(i10, 10);
    }

    public static int parseUnsignedInt(String str, int i10) throws NumberFormatException {
        p1.checkNotNull(str);
        long j10 = Long.parseLong(str, i10);
        if ((4294967295L & j10) == j10) {
            return (int) j10;
        }
        throw new NumberFormatException("Input " + str + " in base " + i10 + " is not in the range of an unsigned integer");
    }

    public static String toString(int i10, int i11) {
        return Long.toString(i10 & 4294967295L, i11);
    }

    public static void sort(int[] iArr, int i10, int i11) {
        p1.checkNotNull(iArr);
        p1.checkPositionIndexes(i10, i11, iArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            iArr[i12] = Integer.MIN_VALUE ^ iArr[i12];
        }
        Arrays.sort(iArr, i10, i11);
        while (i10 < i11) {
            iArr[i10] = iArr[i10] ^ Integer.MIN_VALUE;
            i10++;
        }
    }

    public static void sortDescending(int[] iArr, int i10, int i11) {
        p1.checkNotNull(iArr);
        p1.checkPositionIndexes(i10, i11, iArr.length);
        for (int i12 = i10; i12 < i11; i12++) {
            iArr[i12] = Integer.MAX_VALUE ^ iArr[i12];
        }
        Arrays.sort(iArr, i10, i11);
        while (i10 < i11) {
            iArr[i10] = iArr[i10] ^ Integer.MAX_VALUE;
            i10++;
        }
    }
}
