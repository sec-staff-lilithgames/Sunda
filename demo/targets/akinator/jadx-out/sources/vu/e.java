package vu;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends a {

    /* renamed from: b, reason: collision with root package name */
    public final d f89651b;

    public e(d backing) {
        e0.checkNotNullParameter(backing, "backing");
        this.f89651b = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<Object, Object>> elements) {
        e0.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f89651b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> elements) {
        e0.checkNotNullParameter(elements, "elements");
        return this.f89651b.containsAllEntries$kotlin_stdlib(elements);
    }

    @Override // vu.a
    public boolean containsEntry(Map.Entry<Object, Object> element) {
        e0.checkNotNullParameter(element, "element");
        return this.f89651b.containsEntry$kotlin_stdlib(element);
    }

    public final d getBacking() {
        return this.f89651b;
    }

    @Override // uu.q
    public int getSize() {
        return this.f89651b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f89651b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return this.f89651b.entriesIterator$kotlin_stdlib();
    }

    @Override // vu.a
    public boolean remove(Map.Entry<Object, Object> element) {
        e0.checkNotNullParameter(element, "element");
        return this.f89651b.removeEntry$kotlin_stdlib(element);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> elements) {
        e0.checkNotNullParameter(elements, "elements");
        this.f89651b.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> elements) {
        e0.checkNotNullParameter(elements, "elements");
        this.f89651b.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }

    @Override // uu.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry<Object, Object> element) {
        e0.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }
}
