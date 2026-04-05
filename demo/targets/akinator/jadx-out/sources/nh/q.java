package nh;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class q extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final Object f76571b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f76572c;

    /* renamed from: e, reason: collision with root package name */
    public final q f76573e;

    /* renamed from: f, reason: collision with root package name */
    public final Collection f76574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f76575g;

    public q(w wVar, Object obj, Collection collection, q qVar) {
        this.f76575g = wVar;
        this.f76571b = obj;
        this.f76572c = collection;
        this.f76573e = qVar;
        this.f76574f = qVar == null ? null : qVar.f76572c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        d();
        boolean zIsEmpty = this.f76572c.isEmpty();
        boolean zAdd = this.f76572c.add(obj);
        if (zAdd) {
            this.f76575g.f76727i++;
            if (zIsEmpty) {
                c();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f76572c.addAll(collection);
        if (zAddAll) {
            this.f76575g.f76727i += this.f76572c.size() - size;
            if (size == 0) {
                c();
            }
        }
        return zAddAll;
    }

    public final void c() {
        q qVar = this.f76573e;
        if (qVar != null) {
            qVar.c();
        } else {
            this.f76575g.f76726h.put(this.f76571b, this.f76572c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f76572c.clear();
        this.f76575g.f76727i -= size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        d();
        return this.f76572c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        d();
        return this.f76572c.containsAll(collection);
    }

    public final void d() {
        Collection collection;
        q qVar = this.f76573e;
        if (qVar != null) {
            qVar.d();
            if (qVar.f76572c != this.f76574f) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f76572c.isEmpty() || (collection = (Collection) this.f76575g.f76726h.get(this.f76571b)) == null) {
                return;
            }
            this.f76572c = collection;
        }
    }

    public final void e() {
        q qVar = this.f76573e;
        if (qVar != null) {
            qVar.e();
        } else if (this.f76572c.isEmpty()) {
            this.f76575g.f76726h.remove(this.f76571b);
        }
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        d();
        return this.f76572c.equals(obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        d();
        return this.f76572c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        d();
        return new p(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        d();
        boolean zRemove = this.f76572c.remove(obj);
        if (zRemove) {
            w wVar = this.f76575g;
            wVar.f76727i--;
            e();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f76572c.removeAll(collection);
        if (zRemoveAll) {
            this.f76575g.f76727i += this.f76572c.size() - size;
            e();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        mh.p1.checkNotNull(collection);
        int size = size();
        boolean zRetainAll = this.f76572c.retainAll(collection);
        if (zRetainAll) {
            this.f76575g.f76727i += this.f76572c.size() - size;
            e();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        d();
        return this.f76572c.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        d();
        return this.f76572c.toString();
    }
}
