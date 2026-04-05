package rh;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import mh.p1;
import mh.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class w {
    public static int a(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static List<Integer> asList(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new t(iArr, 0, iArr.length);
    }

    public static int checkedCast(long j10) {
        int i10 = (int) j10;
        p1.checkArgument(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int compare(int i10, int i11) {
        return Integer.compare(i10, i11);
    }

    public static int[] concat(int[]... iArr) {
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += iArr2.length;
        }
        int i10 = (int) length;
        p1.checkArgument(length == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", length);
        int[] iArr3 = new int[i10];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return iArr3;
    }

    public static int constrainToRange(int i10, int i11, int i12) {
        p1.checkArgument(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static boolean contains(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static int[] ensureCapacity(int[] iArr, int i10, int i11) {
        p1.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        p1.checkArgument(i11 >= 0, "Invalid padding: %s", i11);
        return iArr.length < i10 ? Arrays.copyOf(iArr, i10 + i11) : iArr;
    }

    public static int fromByteArray(byte[] bArr) {
        p1.checkArgument(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int fromBytes(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((b12 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b13 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static int indexOf(int[] iArr, int i10) {
        return a(iArr, i10, 0, iArr.length);
    }

    public static String join(String str, int... iArr) {
        p1.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(iArr.length * 5);
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < iArr.length; i10++) {
            sb2.append(str);
            sb2.append(iArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(int[] iArr, int i10) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (iArr[length] == i10) {
                return length;
            }
        }
        return -1;
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return v.f84395b;
    }

    public static int max(int... iArr) {
        p1.checkArgument(iArr.length > 0);
        int i10 = iArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 > i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    public static int min(int... iArr) {
        p1.checkArgument(iArr.length > 0);
        int i10 = iArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 < i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    public static void reverse(int[] iArr) {
        p1.checkNotNull(iArr);
        reverse(iArr, 0, iArr.length);
    }

    public static void rotate(int[] iArr, int i10) {
        rotate(iArr, i10, 0, iArr.length);
    }

    public static int saturatedCast(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static void sortDescending(int[] iArr) {
        p1.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    public static q0 stringConverter() {
        return u.f84394c;
    }

    public static int[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof t) {
            t tVar = (t) collection;
            return Arrays.copyOfRange(tVar.f84391b, tVar.f84392c, tVar.f84393e);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) p1.checkNotNull(array[i10])).intValue();
        }
        return iArr;
    }

    public static byte[] toByteArray(int i10) {
        return new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10};
    }

    public static Integer tryParse(String str) {
        return tryParse(str, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int indexOf(int[] r5, int[] r6) {
        /*
            java.lang.String r0 = "array"
            mh.p1.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            mh.p1.checkNotNull(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2a
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L29
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            if (r3 == r4) goto L26
            int r0 = r0 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r0
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.w.indexOf(int[], int[]):int");
    }

    public static void rotate(int[] iArr, int i10, int i11, int i12) {
        p1.checkNotNull(iArr);
        p1.checkPositionIndexes(i11, i12, iArr.length);
        if (iArr.length <= 1) {
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
        reverse(iArr, i11, i15);
        reverse(iArr, i15, i12);
        reverse(iArr, i11, i12);
    }

    public static Integer tryParse(String str, int i10) {
        Long lTryParse = b0.tryParse(str, i10);
        if (lTryParse == null || lTryParse.longValue() != lTryParse.intValue()) {
            return null;
        }
        return Integer.valueOf(lTryParse.intValue());
    }

    public static void reverse(int[] iArr, int i10, int i11) {
        p1.checkNotNull(iArr);
        p1.checkPositionIndexes(i10, i11, iArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            int i13 = iArr[i10];
            iArr[i10] = iArr[i12];
            iArr[i12] = i13;
            i10++;
        }
    }

    public static void sortDescending(int[] iArr, int i10, int i11) {
        p1.checkNotNull(iArr);
        p1.checkPositionIndexes(i10, i11, iArr.length);
        Arrays.sort(iArr, i10, i11);
        reverse(iArr, i10, i11);
    }

    public static int hashCode(int i10) {
        return i10;
    }
}
