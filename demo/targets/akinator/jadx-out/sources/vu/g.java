package vu;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import uu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends n implements Collection {

    /* renamed from: b, reason: collision with root package name */
    public final d f89653b;

    public g(d backing) {
        e0.checkNotNullParameter(backing, "backing");
        this.f89653b = backing;
    }

    @Override // uu.n, java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<Object> elements) {
        e0.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f89653b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f89653b.containsValue(obj);
    }

    public final d getBacking() {
        return this.f89653b;
    }

    @Override // uu.n
    public int getSize() {
        return this.f89653b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f89653b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return this.f89653b.valuesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f89653b.removeValue$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        e0.checkNotNullParameter(elements, "elements");
        this.f89653b.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> elements) {
        e0.checkNotNullParameter(elements, "elements");
        this.f89653b.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }
}
