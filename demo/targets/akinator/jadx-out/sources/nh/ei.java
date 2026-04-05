package nh;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class ei extends ni implements Collection {
    @Override // java.util.Collection
    public boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.f76516c) {
            zAdd = c().add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        boolean zAddAll;
        synchronized (this.f76516c) {
            zAddAll = c().addAll(collection);
        }
        return zAddAll;
    }

    public Collection c() {
        return (Collection) this.f76515b;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f76516c) {
            c().clear();
        }
    }

    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f76516c) {
            zContains = c().contains(obj);
        }
        return zContains;
    }

    public boolean containsAll(Collection<?> collection) {
        boolean zContainsAll;
        synchronized (this.f76516c) {
            zContainsAll = c().containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f76516c) {
            zIsEmpty = c().isEmpty();
        }
        return zIsEmpty;
    }

    public Iterator<Object> iterator() {
        return c().iterator();
    }

    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f76516c) {
            zRemove = c().remove(obj);
        }
        return zRemove;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll;
        synchronized (this.f76516c) {
            zRemoveAll = c().removeAll(collection);
        }
        return zRemoveAll;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll;
        synchronized (this.f76516c) {
            zRetainAll = c().retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f76516c) {
            size = c().size();
        }
        return size;
    }

    public Object[] toArray() {
        Object[] array;
        synchronized (this.f76516c) {
            array = c().toArray();
        }
        return array;
    }

    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.f76516c) {
            tArr2 = (T[]) c().toArray(tArr);
        }
        return tArr2;
    }
}
