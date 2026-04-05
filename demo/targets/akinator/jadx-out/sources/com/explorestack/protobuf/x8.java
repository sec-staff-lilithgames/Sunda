package com.explorestack.protobuf;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x8 implements Collection {

    /* renamed from: b, reason: collision with root package name */
    public final b9 f22885b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f22886c;

    public x8(b9 b9Var, Collection collection) {
        this.f22885b = b9Var;
        this.f22886c = collection;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        this.f22885b.ensureMutable();
        this.f22886c.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f22886c.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f22886c.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return this.f22886c.equals(obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f22886c.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f22886c.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new y8(this.f22885b, this.f22886c.iterator());
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        this.f22885b.ensureMutable();
        return this.f22886c.remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        this.f22885b.ensureMutable();
        return this.f22886c.removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        this.f22885b.ensureMutable();
        return this.f22886c.retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return this.f22886c.size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return this.f22886c.toArray();
    }

    public String toString() {
        return this.f22886c.toString();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f22886c.toArray(tArr);
    }
}
