package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class bi extends pi {
    @Override // nh.ei, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.f76516c) {
            Set setC = c();
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                mh.p1.checkNotNull(entry);
                zContains = setC.contains(new la(entry));
            } else {
                zContains = false;
            }
        }
        return zContains;
    }

    @Override // nh.ei, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        boolean zB;
        synchronized (this.f76516c) {
            zB = y1.b(c(), collection);
        }
        return zB;
    }

    @Override // nh.pi, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        boolean zA;
        if (obj == this) {
            return true;
        }
        synchronized (this.f76516c) {
            zA = og.a(c(), obj);
        }
        return zA;
    }

    @Override // nh.ei, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Object, Collection<Object>>> iterator() {
        return new bb(this, super.iterator(), 1);
    }

    @Override // nh.ei, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.f76516c) {
            Set setC = c();
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                mh.p1.checkNotNull(entry);
                zRemove = setC.remove(new la(entry));
            } else {
                zRemove = false;
            }
        }
        return zRemove;
    }

    @Override // nh.ei, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll;
        synchronized (this.f76516c) {
            zRemoveAll = z7.removeAll(c().iterator(), collection);
        }
        return zRemoveAll;
    }

    @Override // nh.ei, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll;
        synchronized (this.f76516c) {
            zRetainAll = z7.retainAll(c().iterator(), collection);
        }
        return zRetainAll;
    }

    @Override // nh.ei, java.util.Collection, java.util.Set
    public Object[] toArray() {
        Object[] objArr;
        synchronized (this.f76516c) {
            Set setC = c();
            objArr = new Object[setC.size()];
            pe.b(setC, objArr);
        }
        return objArr;
    }

    @Override // nh.ei, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.f76516c) {
            tArr2 = (T[]) pe.c(c(), tArr);
        }
        return tArr2;
    }
}
