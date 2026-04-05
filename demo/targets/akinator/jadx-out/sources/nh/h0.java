package nh;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h0 extends AbstractCollection implements ud {

    /* renamed from: b, reason: collision with root package name */
    public transient Set f76311b;

    /* renamed from: c, reason: collision with root package name */
    public transient Set f76312c;

    @Override // java.util.AbstractCollection, java.util.Collection, nh.ud
    public final boolean add(Object obj) {
        add(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<Object> collection) {
        mh.p1.checkNotNull(this);
        mh.p1.checkNotNull(collection);
        if (!(collection instanceof ud)) {
            if (collection.isEmpty()) {
                return false;
            }
            return z7.addAll(this, collection.iterator());
        }
        ud udVar = (ud) collection;
        if (!(udVar instanceof z)) {
            if (udVar.isEmpty()) {
                return false;
            }
            for (td tdVar : udVar.entrySet()) {
                add(tdVar.getElement(), tdVar.getCount());
            }
            return true;
        }
        z zVar = (z) udVar;
        if (zVar.isEmpty()) {
            return false;
        }
        mh.p1.checkNotNull(this);
        se seVar = zVar.f76801e;
        for (int iB = seVar.b(); iB >= 0; iB = seVar.i(iB)) {
            add(seVar.c(iB), seVar.d(iB));
        }
        return true;
    }

    public Set c() {
        return new f0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, nh.ud
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    public abstract /* synthetic */ int count(Object obj);

    public Set d() {
        return new g0(this);
    }

    public abstract int e();

    public Set<Object> elementSet() {
        Set<Object> set = this.f76311b;
        if (set != null) {
            return set;
        }
        Set<Object> setC = c();
        this.f76311b = setC;
        return setC;
    }

    public Set<td> entrySet() {
        Set<td> set = this.f76312c;
        if (set != null) {
            return set;
        }
        Set<td> setD = d();
        this.f76312c = setD;
        return setD;
    }

    @Override // java.util.Collection, nh.ud
    public final boolean equals(Object obj) {
        return le.a(this, obj);
    }

    public abstract Iterator f();

    public abstract Iterator g();

    @Override // java.util.Collection, nh.ud
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, nh.ud
    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, nh.ud
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof ud) {
            collection = ((ud) collection).elementSet();
        }
        return elementSet().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, nh.ud
    public final boolean retainAll(Collection<?> collection) {
        mh.p1.checkNotNull(collection);
        if (collection instanceof ud) {
            collection = ((ud) collection).elementSet();
        }
        return elementSet().retainAll(collection);
    }

    @Override // nh.ud
    public int setCount(Object obj, int i10) {
        jh.i.o(i10, "count");
        int iCount = count(obj);
        int i11 = i10 - iCount;
        if (i11 > 0) {
            add(obj, i11);
            return iCount;
        }
        if (i11 < 0) {
            remove(obj, -i11);
        }
        return iCount;
    }

    @Override // java.util.AbstractCollection, nh.ud
    public final String toString() {
        return entrySet().toString();
    }

    public int add(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    public int remove(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.ud
    public boolean setCount(Object obj, int i10, int i11) {
        jh.i.o(i10, "oldCount");
        jh.i.o(i11, "newCount");
        if (count(obj) != i10) {
            return false;
        }
        setCount(obj, i11);
        return true;
    }
}
