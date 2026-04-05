package uu;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f0 extends w {
    public static <T> List<T> asList(T[] tArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        List<T> listAsList = Arrays.asList(tArr);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(listAsList, "asList(...)");
        return listAsList;
    }

    public static final <T> int binarySearch(T[] tArr, T t10, Comparator<? super T> comparator, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return Arrays.binarySearch(tArr, i10, i11, t10, comparator);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, Comparator comparator, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        return binarySearch(objArr, obj, comparator, i10, i11);
    }

    public static <T> T[] copyInto(T[] tArr, T[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ Object[] copyInto$default(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return copyInto(objArr, objArr2, i10, i11, i12);
    }

    public static <T> T[] copyOfRange(T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        v.copyOfRangeToIndexCheck(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static <T> void fill(T[] tArr, T t10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void fill$default(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        fill(objArr, obj, i10, i11);
    }

    public static final <R> List<R> filterIsInstance(Object[] objArr, Class<R> klass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(objArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(klass, "klass");
        return (List) filterIsInstanceTo(objArr, new ArrayList(), klass);
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(Object[] objArr, C destination, Class<R> klass) {
        kotlin.jvm.internal.e0.checkNotNullParameter(objArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(klass, "klass");
        for (Object obj : objArr) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @tu.f
    public static final /* synthetic */ Double max(Double[] dArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        return k0.maxOrNull(dArr);
    }

    @tu.f
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(T[] tArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = k0.getLastIndex(tArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(t10);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t11 = tArr[i10];
                    Comparable comparable2 = (Comparable) selector.invoke(t11);
                    if (comparable.compareTo(comparable2) < 0) {
                        t10 = t11;
                        comparable = comparable2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @tu.f
    public static final /* synthetic */ Object maxWith(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(objArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.maxWithOrNull(objArr, comparator);
    }

    @tu.f
    public static final /* synthetic */ Double min(Double[] dArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        return k0.minOrNull(dArr);
    }

    @tu.f
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(T[] tArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = k0.getLastIndex(tArr);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(t10);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t11 = tArr[i10];
                    Comparable comparable2 = (Comparable) selector.invoke(t11);
                    if (comparable.compareTo(comparable2) > 0) {
                        t10 = t11;
                        comparable = comparable2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @tu.f
    public static final /* synthetic */ Object minWith(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(objArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.minWithOrNull(objArr, comparator);
    }

    public static <T> T[] plus(T[] tArr, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t10;
        kotlin.jvm.internal.e0.checkNotNull(tArr2);
        return tArr2;
    }

    public static final void sort(int[] iArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static /* synthetic */ void sort$default(Comparable[] comparableArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = comparableArr.length;
        }
        sort(comparableArr, i10, i11);
    }

    public static final <T> void sortWith(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static /* synthetic */ void sortWith$default(Object[] objArr, Comparator comparator, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        sortWith(objArr, comparator, i10, i11);
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(T[] tArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        return (SortedSet) k0.toCollection(tArr, new TreeSet());
    }

    public static final Byte[] toTypedArray(byte[] bArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    public static final <T> int binarySearch(T[] tArr, T t10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        return Arrays.binarySearch(tArr, i10, i11, t10);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        return binarySearch(objArr, obj, i10, i11);
    }

    public static byte[] copyInto(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static void fill(byte[] bArr, byte b10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b10);
    }

    @tu.f
    public static final /* synthetic */ Float max(Float[] fArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        return k0.maxOrNull(fArr);
    }

    @tu.f
    public static final /* synthetic */ Byte maxWith(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.maxWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    @tu.f
    public static final /* synthetic */ Float min(Float[] fArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        return k0.minOrNull(fArr);
    }

    @tu.f
    public static final /* synthetic */ Byte minWith(byte[] bArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.minWithOrNull(bArr, (Comparator<? super Byte>) comparator);
    }

    public static final void sort(long[] jArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static <T> void sortWith(T[] tArr, Comparator<? super T> comparator, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }

    public static final SortedSet<Byte> toSortedSet(byte[] bArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        return (SortedSet) k0.toCollection(bArr, new TreeSet());
    }

    public static final List<Byte> asList(byte[] bArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        return new x(bArr);
    }

    public static final int binarySearch(byte[] bArr, byte b10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        return Arrays.binarySearch(bArr, i10, i11, b10);
    }

    public static /* synthetic */ int binarySearch$default(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return binarySearch(bArr, b10, i10, i11);
    }

    public static final short[] copyInto(short[] sArr, short[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        System.arraycopy(sArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] copyInto$default(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return copyInto(bArr, bArr2, i10, i11, i12);
    }

    public static byte[] copyOfRange(byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        v.copyOfRangeToIndexCheck(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static void fill(short[] sArr, short s10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        Arrays.fill(sArr, i10, i11, s10);
    }

    public static /* synthetic */ void fill$default(byte[] bArr, byte b10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        fill(bArr, b10, i10, i11);
    }

    @tu.f
    public static final /* synthetic */ Comparable max(Comparable[] comparableArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(comparableArr, "<this>");
        return k0.maxOrNull(comparableArr);
    }

    @tu.f
    public static final /* synthetic */ Short maxWith(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.maxWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    @tu.f
    public static final /* synthetic */ Comparable min(Comparable[] comparableArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(comparableArr, "<this>");
        return k0.minOrNull(comparableArr);
    }

    @tu.f
    public static final /* synthetic */ Short minWith(short[] sArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.minWithOrNull(sArr, (Comparator<? super Short>) comparator);
    }

    public static final void sort(byte[] bArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    public static /* synthetic */ void sort$default(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        sort(bArr, i10, i11);
    }

    public static final SortedSet<Short> toSortedSet(short[] sArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, QFzuMMDfrzagDN.JyurhAlTcU);
        return (SortedSet) k0.toCollection(sArr, new TreeSet());
    }

    public static final List<Short> asList(short[] sArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        return new y(sArr);
    }

    public static final int binarySearch(short[] sArr, short s10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        return Arrays.binarySearch(sArr, i10, i11, s10);
    }

    public static /* synthetic */ int binarySearch$default(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        return binarySearch(sArr, s10, i10, i11);
    }

    public static int[] copyInto(int[] iArr, int[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static void fill(int[] iArr, int i10, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    @tu.f
    public static final /* synthetic */ Byte max(byte[] bArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        return k0.maxOrNull(bArr);
    }

    @tu.f
    public static final /* synthetic */ Integer maxWith(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.maxWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    @tu.f
    public static final /* synthetic */ Byte min(byte[] bArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        return k0.minOrNull(bArr);
    }

    @tu.f
    public static final /* synthetic */ Integer minWith(int[] iArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.minWithOrNull(iArr, (Comparator<? super Integer>) comparator);
    }

    public static final void sort(short[] sArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    public static final SortedSet<Integer> toSortedSet(int[] iArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        return (SortedSet) k0.toCollection(iArr, new TreeSet());
    }

    public static final Short[] toTypedArray(short[] sArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            shArr[i10] = Short.valueOf(sArr[i10]);
        }
        return shArr;
    }

    public static final List<Integer> asList(int[] iArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        return new z(iArr);
    }

    public static final int binarySearch(int[] iArr, int i10, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        return Arrays.binarySearch(iArr, i11, i12, i10);
    }

    public static /* synthetic */ int binarySearch$default(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        return binarySearch(iArr, i10, i11, i12);
    }

    public static long[] copyInto(long[] jArr, long[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ short[] copyInto$default(short[] sArr, short[] sArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sArr.length;
        }
        return copyInto(sArr, sArr2, i10, i11, i12);
    }

    public static short[] copyOfRange(short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        v.copyOfRangeToIndexCheck(i11, sArr.length);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i10, i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sArrCopyOfRange, "copyOfRange(...)");
        return sArrCopyOfRange;
    }

    public static void fill(long[] jArr, long j10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    public static /* synthetic */ void fill$default(short[] sArr, short s10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = sArr.length;
        }
        fill(sArr, s10, i10, i11);
    }

    @tu.f
    public static final /* synthetic */ Short max(short[] sArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        return k0.maxOrNull(sArr);
    }

    @tu.f
    public static final /* synthetic */ Long maxWith(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.maxWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    @tu.f
    public static final /* synthetic */ Short min(short[] sArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        return k0.minOrNull(sArr);
    }

    @tu.f
    public static final /* synthetic */ Long minWith(long[] jArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.minWithOrNull(jArr, (Comparator<? super Long>) comparator);
    }

    public static final byte[] plus(byte[] bArr, byte b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 1);
        bArrCopyOf[length] = b10;
        kotlin.jvm.internal.e0.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final void sort(double[] dArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    public static /* synthetic */ void sort$default(short[] sArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = sArr.length;
        }
        sort(sArr, i10, i11);
    }

    public static final SortedSet<Long> toSortedSet(long[] jArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        return (SortedSet) k0.toCollection(jArr, new TreeSet());
    }

    public static final List<Long> asList(long[] jArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        return new a0(jArr);
    }

    public static final int binarySearch(long[] jArr, long j10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        return Arrays.binarySearch(jArr, i10, i11, j10);
    }

    public static /* synthetic */ int binarySearch$default(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        return binarySearch(jArr, j10, i10, i11);
    }

    public static float[] copyInto(float[] fArr, float[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static final void fill(float[] fArr, float f10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        Arrays.fill(fArr, i10, i11, f10);
    }

    @tu.f
    public static final /* synthetic */ Integer max(int[] iArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        return k0.maxOrNull(iArr);
    }

    @tu.f
    public static final /* synthetic */ Float maxWith(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.maxWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    @tu.f
    public static final /* synthetic */ Integer min(int[] iArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        return k0.minOrNull(iArr);
    }

    @tu.f
    public static final /* synthetic */ Float minWith(float[] fArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.minWithOrNull(fArr, (Comparator<? super Float>) comparator);
    }

    public static final void sort(float[] fArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    public static final SortedSet<Float> toSortedSet(float[] fArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        return (SortedSet) k0.toCollection(fArr, new TreeSet());
    }

    public static final List<Float> asList(float[] fArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        return new b0(fArr);
    }

    public static final int binarySearch(float[] fArr, float f10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    public static /* synthetic */ int binarySearch$default(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return binarySearch(fArr, f10, i10, i11);
    }

    public static final double[] copyInto(double[] dArr, double[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        System.arraycopy(dArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ int[] copyInto$default(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return copyInto(iArr, iArr2, i10, i11, i12);
    }

    public static int[] copyOfRange(int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        v.copyOfRangeToIndexCheck(i11, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i10, i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOfRange, "copyOfRange(...)");
        return iArrCopyOfRange;
    }

    public static final void fill(double[] dArr, double d10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        Arrays.fill(dArr, i10, i11, d10);
    }

    public static /* synthetic */ void fill$default(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        fill(iArr, i10, i11, i12);
    }

    @tu.f
    public static final /* synthetic */ Long max(long[] jArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        return k0.maxOrNull(jArr);
    }

    @tu.f
    public static final /* synthetic */ Double maxWith(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.maxWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    @tu.f
    public static final /* synthetic */ Long min(long[] jArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        return k0.minOrNull(jArr);
    }

    @tu.f
    public static final /* synthetic */ Double minWith(double[] dArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.minWithOrNull(dArr, (Comparator<? super Double>) comparator);
    }

    public static final void sort(char[] cArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    public static /* synthetic */ void sort$default(int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = iArr.length;
        }
        sort(iArr, i10, i11);
    }

    public static final SortedSet<Double> toSortedSet(double[] dArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        return (SortedSet) k0.toCollection(dArr, new TreeSet());
    }

    public static final Integer[] toTypedArray(int[] iArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    public static final List<Double> asList(double[] dArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        return new c0(dArr);
    }

    public static final int binarySearch(double[] dArr, double d10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        return Arrays.binarySearch(dArr, i10, i11, d10);
    }

    public static /* synthetic */ int binarySearch$default(double[] dArr, double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        return binarySearch(dArr, d10, i10, i11);
    }

    public static final boolean[] copyInto(boolean[] zArr, boolean[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        System.arraycopy(zArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static final void fill(boolean[] zArr, boolean z10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zArr, "<this>");
        Arrays.fill(zArr, i10, i11, z10);
    }

    @tu.f
    public static final /* synthetic */ Float max(float[] fArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        return k0.maxOrNull(fArr);
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte maxBy(byte[] bArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = k0.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b10);
        }
        Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b11 = bArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b11));
                if (comparable.compareTo(comparable2) < 0) {
                    b10 = b11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @tu.f
    public static final /* synthetic */ Boolean maxWith(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.maxWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    @tu.f
    public static final /* synthetic */ Float min(float[] fArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        return k0.minOrNull(fArr);
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte minBy(byte[] bArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = k0.getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b10);
        }
        Comparable comparable = (Comparable) selector.invoke(Byte.valueOf(b10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b11 = bArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Byte.valueOf(b11));
                if (comparable.compareTo(comparable2) > 0) {
                    b10 = b11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @tu.f
    public static final /* synthetic */ Boolean minWith(boolean[] zArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.minWithOrNull(zArr, (Comparator<? super Boolean>) comparator);
    }

    public static <T> void sort(T[] tArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final SortedSet<Boolean> toSortedSet(boolean[] zArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zArr, "<this>");
        return (SortedSet) k0.toCollection(zArr, new TreeSet());
    }

    public static final List<Boolean> asList(boolean[] zArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zArr, "<this>");
        return new d0(zArr);
    }

    public static final int binarySearch(char[] cArr, char c10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        return Arrays.binarySearch(cArr, i10, i11, c10);
    }

    public static /* synthetic */ int binarySearch$default(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        return binarySearch(cArr, c10, i10, i11);
    }

    public static char[] copyInto(char[] cArr, char[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ long[] copyInto$default(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        return copyInto(jArr, jArr2, i10, i11, i12);
    }

    public static long[] copyOfRange(long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        v.copyOfRangeToIndexCheck(i11, jArr.length);
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i10, i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jArrCopyOfRange, "copyOfRange(...)");
        return jArrCopyOfRange;
    }

    public static void fill(char[] cArr, char c10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        Arrays.fill(cArr, i10, i11, c10);
    }

    public static /* synthetic */ void fill$default(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        fill(jArr, j10, i10, i11);
    }

    @tu.f
    public static final /* synthetic */ Double max(double[] dArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        return k0.maxOrNull(dArr);
    }

    @tu.f
    public static final /* synthetic */ Character maxWith(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.maxWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    @tu.f
    public static final /* synthetic */ Double min(double[] dArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        return k0.minOrNull(dArr);
    }

    @tu.f
    public static final /* synthetic */ Character minWith(char[] cArr, Comparator comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return k0.minWithOrNull(cArr, (Comparator<? super Character>) comparator);
    }

    public static final short[] plus(short[] sArr, short s10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + 1);
        sArrCopyOf[length] = s10;
        kotlin.jvm.internal.e0.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    public static final <T extends Comparable<? super T>> void sort(T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    public static /* synthetic */ void sort$default(long[] jArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = jArr.length;
        }
        sort(jArr, i10, i11);
    }

    public static final SortedSet<Character> toSortedSet(char[] cArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, yFkbx.kcVbRAuUBco);
        return (SortedSet) k0.toCollection(cArr, new TreeSet());
    }

    public static final List<Character> asList(char[] cArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        return new e0(cArr);
    }

    @tu.f
    public static final /* synthetic */ Character max(char[] cArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        return k0.maxOrNull(cArr);
    }

    @tu.f
    public static final /* synthetic */ Character min(char[] cArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        return k0.minOrNull(cArr);
    }

    public static final void sort(byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        Arrays.sort(bArr, i10, i11);
    }

    public static final <T> SortedSet<T> toSortedSet(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) k0.toCollection(tArr, new TreeSet(comparator));
    }

    public static final Long[] toTypedArray(long[] jArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    public static /* synthetic */ float[] copyInto$default(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return copyInto(fArr, fArr2, i10, i11, i12);
    }

    public static float[] copyOfRange(float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        v.copyOfRangeToIndexCheck(i11, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    public static /* synthetic */ void fill$default(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        fill(fArr, f10, i10, i11);
    }

    public static final void sort(short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        Arrays.sort(sArr, i10, i11);
    }

    public static /* synthetic */ void sort$default(float[] fArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = fArr.length;
        }
        sort(fArr, i10, i11);
    }

    public static void sort(int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    public static /* synthetic */ double[] copyInto$default(double[] dArr, double[] dArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = dArr.length;
        }
        return copyInto(dArr, dArr2, i10, i11, i12);
    }

    public static final double[] copyOfRange(double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        v.copyOfRangeToIndexCheck(i11, dArr.length);
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i10, i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(dArrCopyOfRange, "copyOfRange(...)");
        return dArrCopyOfRange;
    }

    public static /* synthetic */ void fill$default(double[] dArr, double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = dArr.length;
        }
        fill(dArr, d10, i10, i11);
    }

    public static int[] plus(int[] iArr, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        kotlin.jvm.internal.e0.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static void sort(long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        Arrays.sort(jArr, i10, i11);
    }

    public static /* synthetic */ void sort$default(double[] dArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = dArr.length;
        }
        sort(dArr, i10, i11);
    }

    public static final Float[] toTypedArray(float[] fArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    public static final void sort(float[] fArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, yFkbx.WkHKuoEVAnlIu);
        Arrays.sort(fArr, i10, i11);
    }

    public static /* synthetic */ boolean[] copyInto$default(boolean[] zArr, boolean[] zArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = zArr.length;
        }
        return copyInto(zArr, zArr2, i10, i11, i12);
    }

    public static final boolean[] copyOfRange(boolean[] zArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zArr, "<this>");
        v.copyOfRangeToIndexCheck(i11, zArr.length);
        boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i10, i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(zArrCopyOfRange, "copyOfRange(...)");
        return zArrCopyOfRange;
    }

    public static /* synthetic */ void fill$default(boolean[] zArr, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = zArr.length;
        }
        fill(zArr, z10, i10, i11);
    }

    public static final void sort(double[] dArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        Arrays.sort(dArr, i10, i11);
    }

    public static /* synthetic */ void sort$default(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        sort(cArr, i10, i11);
    }

    public static final void sort(char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        Arrays.sort(cArr, i10, i11);
    }

    public static final Double[] toTypedArray(double[] dArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    public static /* synthetic */ char[] copyInto$default(char[] cArr, char[] cArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = cArr.length;
        }
        return copyInto(cArr, cArr2, i10, i11, i12);
    }

    public static final char[] copyOfRange(char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        v.copyOfRangeToIndexCheck(i11, cArr.length);
        char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i10, i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(cArrCopyOfRange, "copyOfRange(...)");
        return cArrCopyOfRange;
    }

    public static /* synthetic */ void fill$default(char[] cArr, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        fill(cArr, c10, i10, i11);
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Short maxBy(short[] sArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int lastIndex = k0.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s10);
        }
        Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s11 = sArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s11));
                if (comparable.compareTo(comparable2) < 0) {
                    s10 = s11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Short minBy(short[] sArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int lastIndex = k0.getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s10);
        }
        Comparable comparable = (Comparable) selector.invoke(Short.valueOf(s10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s11 = sArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Short.valueOf(s11));
                if (comparable.compareTo(comparable2) > 0) {
                    s10 = s11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    public static final long[] plus(long[] jArr, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        jArrCopyOf[length] = j10;
        kotlin.jvm.internal.e0.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final <T> void sort(T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        Arrays.sort(tArr, i10, i11);
    }

    public static /* synthetic */ void sort$default(Object[] objArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = objArr.length;
        }
        sort(objArr, i10, i11);
    }

    public static final Boolean[] toTypedArray(boolean[] zArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static final float[] plus(float[] fArr, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        fArrCopyOf[length] = f10;
        kotlin.jvm.internal.e0.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    public static final Character[] toTypedArray(char[] cArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            chArr[i10] = Character.valueOf(cArr[i10]);
        }
        return chArr;
    }

    public static final double[] plus(double[] dArr, double d10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
        dArrCopyOf[length] = d10;
        kotlin.jvm.internal.e0.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer maxBy(int[] iArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = k0.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i10);
        }
        Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i10));
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i12 = iArr[i11];
                Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i12));
                if (comparable.compareTo(comparable2) < 0) {
                    i10 = i12;
                    comparable = comparable2;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer minBy(int[] iArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = k0.getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i10);
        }
        Comparable comparable = (Comparable) selector.invoke(Integer.valueOf(i10));
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i12 = iArr[i11];
                Comparable comparable2 = (Comparable) selector.invoke(Integer.valueOf(i12));
                if (comparable.compareTo(comparable2) > 0) {
                    i10 = i12;
                    comparable = comparable2;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    public static final boolean[] plus(boolean[] zArr, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        zArrCopyOf[length] = z10;
        kotlin.jvm.internal.e0.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    public static final char[] plus(char[] cArr, char c10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + 1);
        cArrCopyOf[length] = c10;
        kotlin.jvm.internal.e0.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Long maxBy(long[] jArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = k0.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j10);
        }
        Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j11 = jArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j11));
                if (comparable.compareTo(comparable2) < 0) {
                    j10 = j11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Long minBy(long[] jArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = k0.getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j10);
        }
        Comparable comparable = (Comparable) selector.invoke(Long.valueOf(j10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j11 = jArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Long.valueOf(j11));
                if (comparable.compareTo(comparable2) > 0) {
                    j10 = j11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    public static final <T> T[] plus(T[] tArr, Collection<? extends T> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, elements.size() + length);
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        kotlin.jvm.internal.e0.checkNotNull(tArr2);
        return tArr2;
    }

    public static final byte[] plus(byte[] bArr, Collection<Byte> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, elements.size() + length);
        Iterator<Byte> it = elements.iterator();
        while (it.hasNext()) {
            bArrCopyOf[length] = it.next().byteValue();
            length++;
        }
        kotlin.jvm.internal.e0.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Float maxBy(float[] fArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int lastIndex = k0.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f10);
        }
        Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f11 = fArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f11));
                if (comparable.compareTo(comparable2) < 0) {
                    f10 = f11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Float minBy(float[] fArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int lastIndex = k0.getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f10);
        }
        Comparable comparable = (Comparable) selector.invoke(Float.valueOf(f10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f11 = fArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Float.valueOf(f11));
                if (comparable.compareTo(comparable2) > 0) {
                    f10 = f11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    public static final short[] plus(short[] sArr, Collection<Short> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, elements.size() + length);
        Iterator<Short> it = elements.iterator();
        while (it.hasNext()) {
            sArrCopyOf[length] = it.next().shortValue();
            length++;
        }
        kotlin.jvm.internal.e0.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    public static final int[] plus(int[] iArr, Collection<Integer> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, elements.size() + length);
        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            iArrCopyOf[length] = it.next().intValue();
            length++;
        }
        kotlin.jvm.internal.e0.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Double maxBy(double[] dArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int lastIndex = k0.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d10);
        }
        Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d11 = dArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d11));
                if (comparable.compareTo(comparable2) < 0) {
                    d10 = d11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Double minBy(double[] dArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int lastIndex = k0.getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d10);
        }
        Comparable comparable = (Comparable) selector.invoke(Double.valueOf(d10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d11 = dArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Double.valueOf(d11));
                if (comparable.compareTo(comparable2) > 0) {
                    d10 = d11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    public static final long[] plus(long[] jArr, Collection<Long> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, elements.size() + length);
        Iterator<Long> it = elements.iterator();
        while (it.hasNext()) {
            jArrCopyOf[length] = it.next().longValue();
            length++;
        }
        kotlin.jvm.internal.e0.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final float[] plus(float[] fArr, Collection<Float> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, elements.size() + length);
        Iterator<Float> it = elements.iterator();
        while (it.hasNext()) {
            fArrCopyOf[length] = it.next().floatValue();
            length++;
        }
        kotlin.jvm.internal.e0.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    public static final double[] plus(double[] dArr, Collection<Double> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, elements.size() + length);
        Iterator<Double> it = elements.iterator();
        while (it.hasNext()) {
            dArrCopyOf[length] = it.next().doubleValue();
            length++;
        }
        kotlin.jvm.internal.e0.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean maxBy(boolean[] zArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int lastIndex = k0.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z10);
        }
        Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z11 = zArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z11));
                if (comparable.compareTo(comparable2) < 0) {
                    z10 = z11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean minBy(boolean[] zArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int lastIndex = k0.getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z10);
        }
        Comparable comparable = (Comparable) selector.invoke(Boolean.valueOf(z10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z11 = zArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Boolean.valueOf(z11));
                if (comparable.compareTo(comparable2) > 0) {
                    z10 = z11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    public static final boolean[] plus(boolean[] zArr, Collection<Boolean> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, elements.size() + length);
        Iterator<Boolean> it = elements.iterator();
        while (it.hasNext()) {
            zArrCopyOf[length] = it.next().booleanValue();
            length++;
        }
        kotlin.jvm.internal.e0.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    public static final char[] plus(char[] cArr, Collection<Character> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, elements.size() + length);
        Iterator<Character> it = elements.iterator();
        while (it.hasNext()) {
            cArrCopyOf[length] = it.next().charValue();
            length++;
        }
        kotlin.jvm.internal.e0.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(char[] cArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = k0.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c10);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c11 = cArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c11));
                if (comparable.compareTo(comparable2) < 0) {
                    c10 = c11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @tu.f
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(char[] cArr, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = k0.getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c10);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(c10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c11 = cArr[i10];
                Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(c11));
                if (comparable.compareTo(comparable2) > 0) {
                    c10 = c11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    public static final <T> T[] plus(T[] tArr, T[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        kotlin.jvm.internal.e0.checkNotNull(tArr2);
        return tArr2;
    }

    public static byte[] plus(byte[] bArr, byte[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        kotlin.jvm.internal.e0.checkNotNull(bArrCopyOf);
        return bArrCopyOf;
    }

    public static final short[] plus(short[] sArr, short[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = sArr.length;
        int length2 = elements.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(elements, 0, sArrCopyOf, length, length2);
        kotlin.jvm.internal.e0.checkNotNull(sArrCopyOf);
        return sArrCopyOf;
    }

    public static int[] plus(int[] iArr, int[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        kotlin.jvm.internal.e0.checkNotNull(iArrCopyOf);
        return iArrCopyOf;
    }

    public static final long[] plus(long[] jArr, long[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        kotlin.jvm.internal.e0.checkNotNull(jArrCopyOf);
        return jArrCopyOf;
    }

    public static final float[] plus(float[] fArr, float[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        kotlin.jvm.internal.e0.checkNotNull(fArrCopyOf);
        return fArrCopyOf;
    }

    public static final double[] plus(double[] dArr, double[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dArr, wHkgq.tPYGwtTsgibfUla);
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = dArr.length;
        int length2 = elements.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(elements, 0, dArrCopyOf, length, length2);
        kotlin.jvm.internal.e0.checkNotNull(dArrCopyOf);
        return dArrCopyOf;
    }

    public static final boolean[] plus(boolean[] zArr, boolean[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        kotlin.jvm.internal.e0.checkNotNull(zArrCopyOf);
        return zArrCopyOf;
    }

    public static final char[] plus(char[] cArr, char[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cArr, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, cArrCopyOf, length, length2);
        kotlin.jvm.internal.e0.checkNotNull(cArrCopyOf);
        return cArrCopyOf;
    }
}
