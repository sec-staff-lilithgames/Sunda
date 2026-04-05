package rh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import mh.p1;
import mh.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b0 {
    public static int a(long[] jArr, long j10, int i10, int i11) {
        while (i10 < i11) {
            if (jArr[i10] == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static List<Long> asList(long... jArr) {
        return jArr.length == 0 ? Collections.EMPTY_LIST : new z(jArr, 0, jArr.length);
    }

    public static int compare(long j10, long j11) {
        return Long.compare(j10, j11);
    }

    public static long[] concat(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        int i10 = (int) length;
        p1.checkArgument(length == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i10];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static long constrainToRange(long j10, long j11, long j12) {
        p1.checkArgument(j11 <= j12, "min (%s) must be less than or equal to max (%s)", j11, j12);
        return Math.min(Math.max(j10, j11), j12);
    }

    public static boolean contains(long[] jArr, long j10) {
        for (long j11 : jArr) {
            if (j11 == j10) {
                return true;
            }
        }
        return false;
    }

    public static long[] ensureCapacity(long[] jArr, int i10, int i11) {
        p1.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        p1.checkArgument(i11 >= 0, "Invalid padding: %s", i11);
        return jArr.length < i10 ? Arrays.copyOf(jArr, i10 + i11) : jArr;
    }

    public static long fromByteArray(byte[] bArr) {
        p1.checkArgument(bArr.length >= 8, "array too small: %s < %s", bArr.length, 8);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long fromBytes(byte b10, byte b11, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17) {
        return ((b11 & 255) << 48) | ((b10 & 255) << 56) | ((b12 & 255) << 40) | ((b13 & 255) << 32) | ((b14 & 255) << 24) | ((b15 & 255) << 16) | ((b16 & 255) << 8) | (b17 & 255);
    }

    public static int hashCode(long j10) {
        return Long.hashCode(j10);
    }

    public static int indexOf(long[] jArr, long j10) {
        return a(jArr, j10, 0, jArr.length);
    }

    public static String join(String str, long... jArr) {
        p1.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(jArr.length * 10);
        sb2.append(jArr[0]);
        for (int i10 = 1; i10 < jArr.length; i10++) {
            sb2.append(str);
            sb2.append(jArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(long[] jArr, long j10) {
        for (int length = jArr.length - 1; length >= 0; length--) {
            if (jArr[length] == j10) {
                return length;
            }
        }
        return -1;
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return y.f84398b;
    }

    public static long max(long... jArr) {
        p1.checkArgument(jArr.length > 0);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10];
            if (j11 > j10) {
                j10 = j11;
            }
        }
        return j10;
    }

    public static long min(long... jArr) {
        p1.checkArgument(jArr.length > 0);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10];
            if (j11 < j10) {
                j10 = j11;
            }
        }
        return j10;
    }

    public static void reverse(long[] jArr) {
        p1.checkNotNull(jArr);
        reverse(jArr, 0, jArr.length);
    }

    public static void rotate(long[] jArr, int i10) {
        rotate(jArr, i10, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        p1.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static q0 stringConverter() {
        return a0.f84347c;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof z) {
            z zVar = (z) collection;
            return Arrays.copyOfRange(zVar.f84400b, zVar.f84401c, zVar.f84402e);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = ((Number) p1.checkNotNull(array[i10])).longValue();
        }
        return jArr;
    }

    public static byte[] toByteArray(long j10) {
        byte[] bArr = new byte[8];
        for (int i10 = 7; i10 >= 0; i10--) {
            bArr[i10] = (byte) (255 & j10);
            j10 >>= 8;
        }
        return bArr;
    }

    public static Long tryParse(String str) {
        return tryParse(str, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int indexOf(long[] r7, long[] r8) {
        /*
            java.lang.String r0 = "array"
            mh.p1.checkNotNull(r7, r0)
            java.lang.String r0 = "target"
            mh.p1.checkNotNull(r8, r0)
            int r0 = r8.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r7.length
            int r3 = r8.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r8.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r7[r3]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.b0.indexOf(long[], long[]):int");
    }

    public static void rotate(long[] jArr, int i10, int i11, int i12) {
        p1.checkNotNull(jArr);
        p1.checkPositionIndexes(i11, i12, jArr.length);
        if (jArr.length <= 1) {
            return;
        }
        int i13 = i12 - i11;
        int i14 = (-i10) % i13;
        if (i14 < 0) {
            i14 += i13;
        }
        int i15 = i14 + i11;
        if (i15 == i11) {
            return;
        }
        reverse(jArr, i11, i15);
        reverse(jArr, i15, i12);
        reverse(jArr, i11, i12);
    }

    public static Long tryParse(String str, int i10) {
        byte b10;
        byte b11;
        if (((String) p1.checkNotNull(str)).isEmpty()) {
            return null;
        }
        if (i10 < 2 || i10 > 36) {
            throw new IllegalArgumentException(a.b.e(i10, "radix must be between MIN_RADIX and MAX_RADIX but was "));
        }
        int i11 = str.charAt(0) == '-' ? 1 : 0;
        if (i11 == str.length()) {
            return null;
        }
        int i12 = i11 + 1;
        char cCharAt = str.charAt(i11);
        char c10 = 128;
        if (cCharAt < 128) {
            b10 = x.f84397a[cCharAt];
        } else {
            byte[] bArr = x.f84397a;
            b10 = -1;
        }
        if (b10 < 0 || b10 >= i10) {
            return null;
        }
        long j10 = -b10;
        long j11 = i10;
        long j12 = Long.MIN_VALUE / j11;
        while (i12 < str.length()) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < c10) {
                b11 = x.f84397a[cCharAt2];
            } else {
                byte[] bArr2 = x.f84397a;
                b11 = -1;
            }
            if (b11 < 0 || b11 >= i10 || j10 < j12) {
                return null;
            }
            long j13 = j10 * j11;
            long j14 = b11;
            if (j13 < j14 - Long.MIN_VALUE) {
                return null;
            }
            j10 = j13 - j14;
            i12 = i13;
            c10 = 128;
        }
        if (i11 != 0) {
            return Long.valueOf(j10);
        }
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j10);
    }

    public static void reverse(long[] jArr, int i10, int i11) {
        p1.checkNotNull(jArr);
        p1.checkPositionIndexes(i10, i11, jArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            long j10 = jArr[i10];
            jArr[i10] = jArr[i12];
            jArr[i12] = j10;
            i10++;
        }
    }

    public static void sortDescending(long[] jArr, int i10, int i11) {
        p1.checkNotNull(jArr);
        p1.checkPositionIndexes(i10, i11, jArr.length);
        Arrays.sort(jArr, i10, i11);
        reverse(jArr, i10, i11);
    }
}
