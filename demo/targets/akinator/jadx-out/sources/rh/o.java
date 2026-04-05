package rh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import mh.p1;
import mh.q0;
import mh.u2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o {
    public static int a(float[] fArr, float f10, int i10, int i11) {
        while (i10 < i11) {
            if (fArr[i10] == f10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static List<Float> asList(float... fArr) {
        return fArr.length == 0 ? Collections.EMPTY_LIST : new l(fArr, 0, fArr.length);
    }

    public static int compare(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static float[] concat(float[]... fArr) {
        long length = 0;
        for (float[] fArr2 : fArr) {
            length += fArr2.length;
        }
        int i10 = (int) length;
        p1.checkArgument(length == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", length);
        float[] fArr3 = new float[i10];
        int length2 = 0;
        for (float[] fArr4 : fArr) {
            System.arraycopy(fArr4, 0, fArr3, length2, fArr4.length);
            length2 += fArr4.length;
        }
        return fArr3;
    }

    public static float constrainToRange(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return Math.min(Math.max(f10, f11), f12);
        }
        throw new IllegalArgumentException(u2.lenientFormat("min (%s) must be less than or equal to max (%s)", Float.valueOf(f11), Float.valueOf(f12)));
    }

    public static boolean contains(float[] fArr, float f10) {
        for (float f11 : fArr) {
            if (f11 == f10) {
                return true;
            }
        }
        return false;
    }

    public static float[] ensureCapacity(float[] fArr, int i10, int i11) {
        p1.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        p1.checkArgument(i11 >= 0, "Invalid padding: %s", i11);
        return fArr.length < i10 ? Arrays.copyOf(fArr, i10 + i11) : fArr;
    }

    public static int hashCode(float f10) {
        return Float.hashCode(f10);
    }

    public static int indexOf(float[] fArr, float f10) {
        return a(fArr, f10, 0, fArr.length);
    }

    public static boolean isFinite(float f10) {
        return Float.isFinite(f10);
    }

    public static String join(String str, float... fArr) {
        p1.checkNotNull(str);
        if (fArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(fArr.length * 12);
        sb2.append(fArr[0]);
        for (int i10 = 1; i10 < fArr.length; i10++) {
            sb2.append(str);
            sb2.append(fArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(float[] fArr, float f10) {
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (fArr[length] == f10) {
                return length;
            }
        }
        return -1;
    }

    public static Comparator<float[]> lexicographicalComparator() {
        return n.f84381b;
    }

    public static float max(float... fArr) {
        p1.checkArgument(fArr.length > 0);
        float fMax = fArr[0];
        for (int i10 = 1; i10 < fArr.length; i10++) {
            fMax = Math.max(fMax, fArr[i10]);
        }
        return fMax;
    }

    public static float min(float... fArr) {
        p1.checkArgument(fArr.length > 0);
        float fMin = fArr[0];
        for (int i10 = 1; i10 < fArr.length; i10++) {
            fMin = Math.min(fMin, fArr[i10]);
        }
        return fMin;
    }

    public static void reverse(float[] fArr) {
        p1.checkNotNull(fArr);
        reverse(fArr, 0, fArr.length);
    }

    public static void rotate(float[] fArr, int i10) {
        rotate(fArr, i10, 0, fArr.length);
    }

    public static void sortDescending(float[] fArr) {
        p1.checkNotNull(fArr);
        sortDescending(fArr, 0, fArr.length);
    }

    public static q0 stringConverter() {
        return m.f84380c;
    }

    public static float[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof l) {
            l lVar = (l) collection;
            return Arrays.copyOfRange(lVar.f84377b, lVar.f84378c, lVar.f84379e);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = ((Number) p1.checkNotNull(array[i10])).floatValue();
        }
        return fArr;
    }

    public static Float tryParse(String str) {
        if (!k.f84376b.matcher(str).matches()) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int indexOf(float[] r5, float[] r6) {
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
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.o.indexOf(float[], float[]):int");
    }

    public static void rotate(float[] fArr, int i10, int i11, int i12) {
        p1.checkNotNull(fArr);
        p1.checkPositionIndexes(i11, i12, fArr.length);
        if (fArr.length <= 1) {
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
        reverse(fArr, i11, i15);
        reverse(fArr, i15, i12);
        reverse(fArr, i11, i12);
    }

    public static void reverse(float[] fArr, int i10, int i11) {
        p1.checkNotNull(fArr);
        p1.checkPositionIndexes(i10, i11, fArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            float f10 = fArr[i10];
            fArr[i10] = fArr[i12];
            fArr[i12] = f10;
            i10++;
        }
    }

    public static void sortDescending(float[] fArr, int i10, int i11) {
        p1.checkNotNull(fArr);
        p1.checkPositionIndexes(i10, i11, fArr.length);
        Arrays.sort(fArr, i10, i11);
        reverse(fArr, i10, i11);
    }
}
