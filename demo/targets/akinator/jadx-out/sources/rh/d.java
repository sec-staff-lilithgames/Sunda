package rh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d {
    public static int a(boolean[] zArr, boolean z10, int i10, int i11) {
        while (i10 < i11) {
            if (zArr[i10] == z10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static List<Boolean> asList(boolean... zArr) {
        return zArr.length == 0 ? Collections.EMPTY_LIST : new a(zArr, 0, zArr.length);
    }

    public static int compare(boolean z10, boolean z11) {
        return Boolean.compare(z10, z11);
    }

    public static boolean[] concat(boolean[]... zArr) {
        long length = 0;
        for (boolean[] zArr2 : zArr) {
            length += zArr2.length;
        }
        int i10 = (int) length;
        p1.checkArgument(length == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", length);
        boolean[] zArr3 = new boolean[i10];
        int length2 = 0;
        for (boolean[] zArr4 : zArr) {
            System.arraycopy(zArr4, 0, zArr3, length2, zArr4.length);
            length2 += zArr4.length;
        }
        return zArr3;
    }

    public static boolean contains(boolean[] zArr, boolean z10) {
        for (boolean z11 : zArr) {
            if (z11 == z10) {
                return true;
            }
        }
        return false;
    }

    public static int countTrue(boolean... zArr) {
        int i10 = 0;
        for (boolean z10 : zArr) {
            if (z10) {
                i10++;
            }
        }
        return i10;
    }

    public static boolean[] ensureCapacity(boolean[] zArr, int i10, int i11) {
        p1.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        p1.checkArgument(i11 >= 0, "Invalid padding: %s", i11);
        return zArr.length < i10 ? Arrays.copyOf(zArr, i10 + i11) : zArr;
    }

    public static Comparator<Boolean> falseFirst() {
        return b.FALSE_FIRST;
    }

    public static int hashCode(boolean z10) {
        return Boolean.hashCode(z10);
    }

    public static int indexOf(boolean[] zArr, boolean z10) {
        return a(zArr, z10, 0, zArr.length);
    }

    public static String join(String str, boolean... zArr) {
        p1.checkNotNull(str);
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(zArr.length * 7);
        sb2.append(zArr[0]);
        for (int i10 = 1; i10 < zArr.length; i10++) {
            sb2.append(str);
            sb2.append(zArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(boolean[] zArr, boolean z10) {
        for (int length = zArr.length - 1; length >= 0; length--) {
            if (zArr[length] == z10) {
                return length;
            }
        }
        return -1;
    }

    public static Comparator<boolean[]> lexicographicalComparator() {
        return c.f84353b;
    }

    public static void reverse(boolean[] zArr) {
        p1.checkNotNull(zArr);
        reverse(zArr, 0, zArr.length);
    }

    public static void rotate(boolean[] zArr, int i10) {
        rotate(zArr, i10, 0, zArr.length);
    }

    public static boolean[] toArray(Collection<Boolean> collection) {
        if (collection instanceof a) {
            a aVar = (a) collection;
            return Arrays.copyOfRange(aVar.f84344b, aVar.f84345c, aVar.f84346e);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = ((Boolean) p1.checkNotNull(array[i10])).booleanValue();
        }
        return zArr;
    }

    public static Comparator<Boolean> trueFirst() {
        return b.TRUE_FIRST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int indexOf(boolean[] r5, boolean[] r6) {
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
            boolean r3 = r5[r3]
            boolean r4 = r6[r2]
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
        throw new UnsupportedOperationException("Method not decompiled: rh.d.indexOf(boolean[], boolean[]):int");
    }

    public static void rotate(boolean[] zArr, int i10, int i11, int i12) {
        p1.checkNotNull(zArr);
        p1.checkPositionIndexes(i11, i12, zArr.length);
        if (zArr.length <= 1) {
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
        reverse(zArr, i11, i15);
        reverse(zArr, i15, i12);
        reverse(zArr, i11, i12);
    }

    public static void reverse(boolean[] zArr, int i10, int i11) {
        p1.checkNotNull(zArr);
        p1.checkPositionIndexes(i10, i11, zArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            boolean z10 = zArr[i10];
            zArr[i10] = zArr[i12];
            zArr[i12] = z10;
            i10++;
        }
    }
}
