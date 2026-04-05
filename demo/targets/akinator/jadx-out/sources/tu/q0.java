package tu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q0 implements Collection, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final long[] f87401b;

    public /* synthetic */ q0(long[] jArr) {
        this.f87401b = jArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ q0 m7088boximpl(long[] jArr) {
        return new q0(jArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long[] m7090constructorimpl(long[] storage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m7092containsAllimpl(long[] jArr, Collection<o0> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Collection<o0> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof o0) || !uu.k0.contains(jArr, ((o0) obj).m7086unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7093equalsimpl(long[] jArr, Object obj) {
        return (obj instanceof q0) && kotlin.jvm.internal.e0.areEqual(jArr, ((q0) obj).m7104unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7094equalsimpl0(long[] jArr, long[] jArr2) {
        return kotlin.jvm.internal.e0.areEqual(jArr, jArr2);
    }

    /* renamed from: get-s-VKNKU, reason: not valid java name */
    public static final long m7095getsVKNKU(long[] jArr, int i10) {
        return o0.m7081constructorimpl(jArr[i10]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m7096getSizeimpl(long[] jArr) {
        return jArr.length;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7097hashCodeimpl(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m7098isEmptyimpl(long[] jArr) {
        return jArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<o0> m7099iteratorimpl(long[] jArr) {
        return new p0(jArr);
    }

    /* renamed from: set-k8EXiF4, reason: not valid java name */
    public static final void m7100setk8EXiF4(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7101toStringimpl(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-VKZWuLQ, reason: not valid java name */
    public boolean m7102addVKZWuLQ(long j10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends o0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof o0) {
            return m7103containsVKZWuLQ(((o0) obj).m7086unboximpl());
        }
        return false;
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m7103containsVKZWuLQ(long j10) {
        return m7091containsVKZWuLQ(this.f87401b, j10);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return m7092containsAllimpl(this.f87401b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m7093equalsimpl(this.f87401b, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m7096getSizeimpl(this.f87401b);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m7097hashCodeimpl(this.f87401b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m7098isEmptyimpl(this.f87401b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<o0> iterator() {
        return m7099iteratorimpl(this.f87401b);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.toArray(this);
    }

    public String toString() {
        return m7101toStringimpl(this.f87401b);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long[] m7104unboximpl() {
        return this.f87401b;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long[] m7089constructorimpl(int i10) {
        return m7090constructorimpl(new long[i10]);
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public static boolean m7091containsVKZWuLQ(long[] jArr, long j10) {
        return uu.k0.contains(jArr, j10);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.t.toArray(this, array);
    }

    public static /* synthetic */ void getStorage$annotations() {
    }
}
