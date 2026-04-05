package uu;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t implements Collection, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f88783b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f88784c;

    public t(Object[] values, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
        this.f88783b = values;
        this.f88784c = z10;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return k0.contains(this.f88783b, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Collection<?> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.f88783b.length;
    }

    public final Object[] getValues() {
        return this.f88783b;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f88783b.length == 0;
    }

    public final boolean isVarargs() {
        return this.f88784c;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return kotlin.jvm.internal.i.iterator(this.f88783b);
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
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.e0.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.t.toArray(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return o0.copyToArrayOfAny(this.f88783b, this.f88784c);
    }
}
