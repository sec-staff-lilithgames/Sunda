package nh;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e4 extends l4 implements Collection {
    @Override // java.util.Collection
    public boolean add(Object obj) {
        return delegate().add(obj);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        return delegate().addAll(collection);
    }

    @Override // nh.l4
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract Collection delegate();

    @Override // java.util.Collection
    public void clear() {
        delegate().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return delegate().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Iterator<Object> iterator() {
        return delegate().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return delegate().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return delegate().size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return delegate().toArray();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) delegate().toArray(tArr);
    }
}
