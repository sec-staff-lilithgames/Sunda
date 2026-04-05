package tu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v0 implements Collection, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final short[] f87414b;

    public /* synthetic */ v0(short[] sArr) {
        this.f87414b = sArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ v0 m7113boximpl(short[] sArr) {
        return new v0(sArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short[] m7115constructorimpl(short[] storage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m7117containsAllimpl(short[] sArr, Collection<t0> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Collection<t0> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof t0) || !uu.k0.contains(sArr, ((t0) obj).m7111unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7118equalsimpl(short[] sArr, Object obj) {
        return (obj instanceof v0) && kotlin.jvm.internal.e0.areEqual(sArr, ((v0) obj).m7129unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7119equalsimpl0(short[] sArr, short[] sArr2) {
        return kotlin.jvm.internal.e0.areEqual(sArr, sArr2);
    }

    /* renamed from: get-Mh2AYeg, reason: not valid java name */
    public static final short m7120getMh2AYeg(short[] sArr, int i10) {
        return t0.m7106constructorimpl(sArr[i10]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m7121getSizeimpl(short[] sArr) {
        return sArr.length;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7122hashCodeimpl(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m7123isEmptyimpl(short[] sArr) {
        return sArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<t0> m7124iteratorimpl(short[] sArr) {
        return new u0(sArr);
    }

    /* renamed from: set-01HTLdE, reason: not valid java name */
    public static final void m7125set01HTLdE(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7126toStringimpl(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-xj2QHRw, reason: not valid java name */
    public boolean m7127addxj2QHRw(short s10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends t0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof t0) {
            return m7128containsxj2QHRw(((t0) obj).m7111unboximpl());
        }
        return false;
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m7128containsxj2QHRw(short s10) {
        return m7116containsxj2QHRw(this.f87414b, s10);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return m7117containsAllimpl(this.f87414b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m7118equalsimpl(this.f87414b, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m7121getSizeimpl(this.f87414b);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m7122hashCodeimpl(this.f87414b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m7123isEmptyimpl(this.f87414b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<t0> iterator() {
        return m7124iteratorimpl(this.f87414b);
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
        return m7126toStringimpl(this.f87414b);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short[] m7129unboximpl() {
        return this.f87414b;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short[] m7114constructorimpl(int i10) {
        return m7115constructorimpl(new short[i10]);
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public static boolean m7116containsxj2QHRw(short[] sArr, short s10) {
        return uu.k0.contains(sArr, s10);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.t.toArray(this, array);
    }

    public static /* synthetic */ void getStorage$annotations() {
    }
}
