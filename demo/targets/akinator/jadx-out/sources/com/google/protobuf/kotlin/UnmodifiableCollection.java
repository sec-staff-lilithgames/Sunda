package com.google.protobuf.kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.t;
import lv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class UnmodifiableCollection<E> implements Collection<E>, a {
    private final Collection<E> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableCollection(Collection<? extends E> delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e10) {
        return this.delegate.contains(e10);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        e0.checkNotNullParameter(elements, "elements");
        return this.delegate.containsAll(elements);
    }

    public int getSize() {
        return this.delegate.size();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new UnmodifiableIterator(this.delegate.iterator());
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return t.toArray(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        e0.checkNotNullParameter(array, "array");
        return (T[]) t.toArray(this, array);
    }
}
