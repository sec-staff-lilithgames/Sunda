package tu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i0 implements Collection, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f87385b;

    public /* synthetic */ i0(byte[] bArr) {
        this.f87385b = bArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ i0 m7038boximpl(byte[] bArr) {
        return new i0(bArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m7040constructorimpl(byte[] storage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m7042containsAllimpl(byte[] bArr, Collection<g0> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Collection<g0> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof g0) || !uu.k0.contains(bArr, ((g0) obj).m7036unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7043equalsimpl(byte[] bArr, Object obj) {
        return (obj instanceof i0) && kotlin.jvm.internal.e0.areEqual(bArr, ((i0) obj).m7054unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7044equalsimpl0(byte[] bArr, byte[] bArr2) {
        return kotlin.jvm.internal.e0.areEqual(bArr, bArr2);
    }

    /* renamed from: get-w2LRezQ, reason: not valid java name */
    public static final byte m7045getw2LRezQ(byte[] bArr, int i10) {
        return g0.m7031constructorimpl(bArr[i10]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m7046getSizeimpl(byte[] bArr) {
        return bArr.length;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7047hashCodeimpl(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m7048isEmptyimpl(byte[] bArr) {
        return bArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<g0> m7049iteratorimpl(byte[] bArr) {
        return new h0(bArr);
    }

    /* renamed from: set-VurrAj0, reason: not valid java name */
    public static final void m7050setVurrAj0(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7051toStringimpl(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-7apg3OU, reason: not valid java name */
    public boolean m7052add7apg3OU(byte b10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends g0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof g0) {
            return m7053contains7apg3OU(((g0) obj).m7036unboximpl());
        }
        return false;
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m7053contains7apg3OU(byte b10) {
        return m7041contains7apg3OU(this.f87385b, b10);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return m7042containsAllimpl(this.f87385b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m7043equalsimpl(this.f87385b, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m7046getSizeimpl(this.f87385b);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m7047hashCodeimpl(this.f87385b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m7048isEmptyimpl(this.f87385b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<g0> iterator() {
        return m7049iteratorimpl(this.f87385b);
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
        return m7051toStringimpl(this.f87385b);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte[] m7054unboximpl() {
        return this.f87385b;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m7039constructorimpl(int i10) {
        return m7040constructorimpl(new byte[i10]);
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public static boolean m7041contains7apg3OU(byte[] bArr, byte b10) {
        return uu.k0.contains(bArr, b10);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.t.toArray(this, array);
    }

    public static /* synthetic */ void getStorage$annotations() {
    }
}
