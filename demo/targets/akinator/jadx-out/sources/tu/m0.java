package tu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m0 implements Collection, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final int[] f87396b;

    public /* synthetic */ m0(int[] iArr) {
        this.f87396b = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ m0 m7063boximpl(int[] iArr) {
        return new m0(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m7065constructorimpl(int[] storage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m7067containsAllimpl(int[] iArr, Collection<k0> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Collection<k0> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof k0) || !uu.k0.contains(iArr, ((k0) obj).m7061unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7068equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof m0) && kotlin.jvm.internal.e0.areEqual(iArr, ((m0) obj).m7079unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7069equalsimpl0(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.e0.areEqual(iArr, iArr2);
    }

    /* renamed from: get-pVg5ArA, reason: not valid java name */
    public static final int m7070getpVg5ArA(int[] iArr, int i10) {
        return k0.m7056constructorimpl(iArr[i10]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m7071getSizeimpl(int[] iArr) {
        return iArr.length;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7072hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m7073isEmptyimpl(int[] iArr) {
        return iArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<k0> m7074iteratorimpl(int[] iArr) {
        return new l0(iArr);
    }

    /* renamed from: set-VXSXFK8, reason: not valid java name */
    public static final void m7075setVXSXFK8(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7076toStringimpl(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-WZ4Q5Ns, reason: not valid java name */
    public boolean m7077addWZ4Q5Ns(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends k0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof k0) {
            return m7078containsWZ4Q5Ns(((k0) obj).m7061unboximpl());
        }
        return false;
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m7078containsWZ4Q5Ns(int i10) {
        return m7066containsWZ4Q5Ns(this.f87396b, i10);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return m7067containsAllimpl(this.f87396b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m7068equalsimpl(this.f87396b, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m7071getSizeimpl(this.f87396b);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m7072hashCodeimpl(this.f87396b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m7073isEmptyimpl(this.f87396b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<k0> iterator() {
        return m7074iteratorimpl(this.f87396b);
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
        return m7076toStringimpl(this.f87396b);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m7079unboximpl() {
        return this.f87396b;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m7064constructorimpl(int i10) {
        return m7065constructorimpl(new int[i10]);
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public static boolean m7066containsWZ4Q5Ns(int[] iArr, int i10) {
        return uu.k0.contains(iArr, i10);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.t.toArray(this, array);
    }

    public static /* synthetic */ void getStorage$annotations() {
    }
}
