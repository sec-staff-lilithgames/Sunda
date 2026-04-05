package nh;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class s1 extends AbstractCollection {

    /* renamed from: b, reason: collision with root package name */
    public final Collection f76617b;

    /* renamed from: c, reason: collision with root package name */
    public final mh.q1 f76618c;

    public s1(Collection collection, mh.q1 q1Var) {
        this.f76617b = collection;
        this.f76618c = q1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        mh.p1.checkArgument(this.f76618c.apply(obj));
        return this.f76617b.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        Iterator<Object> it = collection.iterator();
        while (it.hasNext()) {
            mh.p1.checkArgument(this.f76618c.apply(it.next()));
        }
        return this.f76617b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        i7.removeIf(this.f76617b, this.f76618c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        boolean zContains;
        Collection collection = this.f76617b;
        mh.p1.checkNotNull(collection);
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f76618c.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return y1.b(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return !i7.any(this.f76617b, this.f76618c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return z7.filter(this.f76617b.iterator(), this.f76618c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return contains(obj) && this.f76617b.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator it = this.f76617b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f76618c.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Iterator it = this.f76617b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f76618c.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        Iterator it = this.f76617b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f76618c.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return p8.newArrayList(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) p8.newArrayList(iterator()).toArray(tArr);
    }
}
