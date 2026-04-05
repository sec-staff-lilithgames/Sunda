package uu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class p0 extends o0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.l f88776b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Comparable f88777c;

        /* JADX WARN: Incorrect types in method signature: (Lkv/l;TK;)V */
        public a(kv.l lVar, Comparable comparable) {
            this.f88776b = lVar;
            this.f88777c = comparable;
        }

        @Override // kv.l
        public final Integer invoke(T t10) {
            return Integer.valueOf(xu.d.compareValues((Comparable) this.f88776b.invoke(t10), this.f88777c));
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((a) obj);
        }
    }

    public static final void a(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException(o2.i(i11, i12, "fromIndex (", ") is greater than toIndex (", ")."));
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(o2.k(i11, "fromIndex (", ") is less than zero."));
        }
        if (i12 > i10) {
            throw new IndexOutOfBoundsException(o2.i(i12, i10, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static <T> ArrayList<T> arrayListOf(T... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(asCollection(elements, true));
    }

    public static final <T> Collection<T> asCollection(T[] tArr, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        return new t(tArr, z10);
    }

    public static /* synthetic */ Collection asCollection$default(Object[] objArr, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return asCollection(objArr, z10);
    }

    public static final <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T t10, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        a(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iCompareValues = xu.d.compareValues(list.get(i13), t10);
            if (iCompareValues < 0) {
                i10 = i13 + 1;
            } else {
                if (iCompareValues <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int binarySearch$default(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return binarySearch((List<? extends Comparable>) list, comparable, i10, i11);
    }

    public static final <T, K extends Comparable<? super K>> int binarySearchBy(List<? extends T> list, K k10, int i10, int i11, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        return binarySearch(list, i10, i11, new a(selector, k10));
    }

    public static /* synthetic */ int binarySearchBy$default(List list, Comparable comparable, int i10, int i11, kv.l selector, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        return binarySearch(list, i10, i11, new a(selector, comparable));
    }

    public static final Object[] collectionToArrayCommonImpl(Collection<?> collection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "collection");
        int i10 = 0;
        if (collection.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    public static <T> List<T> emptyList() {
        return b1.f88706b;
    }

    public static qv.m getIndices(Collection<?> collection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        return new qv.m(0, collection.size() - 1);
    }

    public static <T> int getLastIndex(List<? extends T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> listOf(T... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? f0.asList(elements) : emptyList();
    }

    public static <T> List<T> listOfNotNull(T t10) {
        return t10 != null ? o0.listOf(t10) : emptyList();
    }

    public static <T> List<T> mutableListOf(T... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(asCollection(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> optimizeReadOnlyList(List<? extends T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : o0.listOf(list.get(0)) : emptyList();
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> iterable, ov.g random) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(random, "random");
        List<T> mutableList = y0.toMutableList(iterable);
        y0.shuffle(mutableList, random);
        return mutableList;
    }

    public static void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static /* synthetic */ int binarySearch$default(List list, Object obj, Comparator comparator, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = list.size();
        }
        return binarySearch(list, obj, comparator, i10, i11);
    }

    public static <T> List<T> listOfNotNull(T... elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return k0.filterNotNull(elements);
    }

    public static /* synthetic */ int binarySearch$default(List list, int i10, int i11, kv.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return binarySearch(list, i10, i11, lVar);
    }

    public static final <T> int binarySearch(List<? extends T> list, T t10, Comparator<? super T> comparator, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        a(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iCompare = comparator.compare(list.get(i13), t10);
            if (iCompare < 0) {
                i10 = i13 + 1;
            } else {
                if (iCompare <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final <T> T[] collectionToArrayCommonImpl(Collection<?> collection, T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "collection");
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        int i10 = 0;
        if (collection.isEmpty()) {
            return (T[]) o0.terminateCollectionToArray(0, array);
        }
        int length = array.length;
        Object[] objArr = array;
        if (length < collection.size()) {
            objArr = (T[]) v.arrayOfNulls(array, collection.size());
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return (T[]) o0.terminateCollectionToArray(collection.size(), objArr);
    }

    public static final <T> int binarySearch(List<? extends T> list, int i10, int i11, kv.l comparison) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparison, "comparison");
        a(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iIntValue = ((Number) comparison.invoke(list.get(i13))).intValue();
            if (iIntValue < 0) {
                i10 = i13 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }
}
