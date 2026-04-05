package rh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import mh.p1;
import mh.q0;
import mh.u2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class k extends kotlin.jvm.internal.d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f84376b = Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", "+"));

    public static int K(double[] dArr, double d10, int i10, int i11) {
        while (i10 < i11) {
            if (dArr[i10] == d10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static List<Double> asList(double... dArr) {
        return dArr.length == 0 ? Collections.EMPTY_LIST : new h(dArr, 0, dArr.length);
    }

    public static int compare(double d10, double d11) {
        return Double.compare(d10, d11);
    }

    public static double[] concat(double[]... dArr) {
        long length = 0;
        for (double[] dArr2 : dArr) {
            length += dArr2.length;
        }
        int i10 = (int) length;
        p1.checkArgument(length == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", length);
        double[] dArr3 = new double[i10];
        int length2 = 0;
        for (double[] dArr4 : dArr) {
            System.arraycopy(dArr4, 0, dArr3, length2, dArr4.length);
            length2 += dArr4.length;
        }
        return dArr3;
    }

    public static double constrainToRange(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return Math.min(Math.max(d10, d11), d12);
        }
        throw new IllegalArgumentException(u2.lenientFormat("min (%s) must be less than or equal to max (%s)", Double.valueOf(d11), Double.valueOf(d12)));
    }

    public static boolean contains(double[] dArr, double d10) {
        for (double d11 : dArr) {
            if (d11 == d10) {
                return true;
            }
        }
        return false;
    }

    public static double[] ensureCapacity(double[] dArr, int i10, int i11) {
        p1.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        p1.checkArgument(i11 >= 0, "Invalid padding: %s", i11);
        return dArr.length < i10 ? Arrays.copyOf(dArr, i10 + i11) : dArr;
    }

    public static int hashCode(double d10) {
        return Double.hashCode(d10);
    }

    public static int indexOf(double[] dArr, double d10) {
        return K(dArr, d10, 0, dArr.length);
    }

    public static boolean isFinite(double d10) {
        return Double.isFinite(d10);
    }

    public static String join(String str, double... dArr) {
        p1.checkNotNull(str);
        if (dArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(dArr.length * 12);
        sb2.append(dArr[0]);
        for (int i10 = 1; i10 < dArr.length; i10++) {
            sb2.append(str);
            sb2.append(dArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(double[] dArr, double d10) {
        for (int length = dArr.length - 1; length >= 0; length--) {
            if (dArr[length] == d10) {
                return length;
            }
        }
        return -1;
    }

    public static Comparator<double[]> lexicographicalComparator() {
        return j.f84374b;
    }

    public static double max(double... dArr) {
        p1.checkArgument(dArr.length > 0);
        double dMax = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            dMax = Math.max(dMax, dArr[i10]);
        }
        return dMax;
    }

    public static double min(double... dArr) {
        p1.checkArgument(dArr.length > 0);
        double dMin = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            dMin = Math.min(dMin, dArr[i10]);
        }
        return dMin;
    }

    public static void reverse(double[] dArr) {
        p1.checkNotNull(dArr);
        reverse(dArr, 0, dArr.length);
    }

    public static void rotate(double[] dArr, int i10) {
        rotate(dArr, i10, 0, dArr.length);
    }

    public static void sortDescending(double[] dArr) {
        p1.checkNotNull(dArr);
        sortDescending(dArr, 0, dArr.length);
    }

    public static q0 stringConverter() {
        return i.f84370c;
    }

    public static double[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof h) {
            h hVar = (h) collection;
            return Arrays.copyOfRange(hVar.f84365b, hVar.f84366c, hVar.f84367e);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = ((Number) p1.checkNotNull(array[i10])).doubleValue();
        }
        return dArr;
    }

    public static Double tryParse(String str) {
        if (!f84376b.matcher(str).matches()) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(str));
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
    public static int indexOf(double[] r7, double[] r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: rh.k.indexOf(double[], double[]):int");
    }

    public static void rotate(double[] dArr, int i10, int i11, int i12) {
        p1.checkNotNull(dArr);
        p1.checkPositionIndexes(i11, i12, dArr.length);
        if (dArr.length <= 1) {
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
        reverse(dArr, i11, i15);
        reverse(dArr, i15, i12);
        reverse(dArr, i11, i12);
    }

    public static void reverse(double[] dArr, int i10, int i11) {
        p1.checkNotNull(dArr);
        p1.checkPositionIndexes(i10, i11, dArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            double d10 = dArr[i10];
            dArr[i10] = dArr[i12];
            dArr[i12] = d10;
            i10++;
        }
    }

    public static void sortDescending(double[] dArr, int i10, int i11) {
        p1.checkNotNull(dArr);
        p1.checkPositionIndexes(i10, i11, dArr.length);
        Arrays.sort(dArr, i10, i11);
        reverse(dArr, i10, i11);
    }
}
