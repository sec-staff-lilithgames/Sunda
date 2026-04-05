package com.explorestack.protobuf;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z8 implements Set {

    /* renamed from: b, reason: collision with root package name */
    public final b9 f22975b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f22976c;

    public z8(b9 b9Var, Set set) {
        this.f22975b = b9Var;
        this.f22976c = set;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        this.f22975b.ensureMutable();
        return this.f22976c.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        this.f22975b.ensureMutable();
        return this.f22976c.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f22975b.ensureMutable();
        this.f22976c.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f22976c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f22976c.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        return this.f22976c.equals(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f22976c.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f22976c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new y8(this.f22975b, this.f22976c.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        this.f22975b.ensureMutable();
        return this.f22976c.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        this.f22975b.ensureMutable();
        return this.f22976c.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        this.f22975b.ensureMutable();
        return this.f22976c.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f22976c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f22976c.toArray();
    }

    public String toString() {
        return this.f22976c.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f22976c.toArray(tArr);
    }
}
