package b1;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p0.a3;
import uu.j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 implements List, lv.d {

    /* renamed from: b, reason: collision with root package name */
    public final SnapshotStateList f8579b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8580c;

    /* renamed from: e, reason: collision with root package name */
    public int f8581e;

    /* renamed from: f, reason: collision with root package name */
    public int f8582f;

    public c1(SnapshotStateList<Object> snapshotStateList, int i10, int i11) {
        this.f8579b = snapshotStateList;
        this.f8580c = i10;
        this.f8581e = h0.getStructure(snapshotStateList);
        this.f8582f = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        c();
        int size = size() + this.f8580c;
        SnapshotStateList snapshotStateList = this.f8579b;
        snapshotStateList.add(size, obj);
        this.f8582f = size() + 1;
        this.f8581e = h0.getStructure(snapshotStateList);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<Object> collection) {
        c();
        int i11 = i10 + this.f8580c;
        SnapshotStateList snapshotStateList = this.f8579b;
        boolean zAddAll = snapshotStateList.addAll(i11, collection);
        if (zAddAll) {
            this.f8582f = collection.size() + size();
            this.f8581e = h0.getStructure(snapshotStateList);
        }
        return zAddAll;
    }

    public final void c() {
        if (h0.getStructure(this.f8579b) != this.f8581e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            c();
            int size = size();
            int i10 = this.f8580c;
            SnapshotStateList snapshotStateList = this.f8579b;
            snapshotStateList.removeRange(i10, size + i10);
            this.f8582f = 0;
            this.f8581e = h0.getStructure(snapshotStateList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Collection<?> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public Object get(int i10) {
        c();
        h0.access$validateRange(i10, size());
        return this.f8579b.get(this.f8580c + i10);
    }

    public final SnapshotStateList<Object> getParentList() {
        return this.f8579b;
    }

    public int getSize() {
        return this.f8582f;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        c();
        int size = size();
        int i10 = this.f8580c;
        Iterator it = qv.v.until(i10, size + i10).iterator();
        while (it.hasNext()) {
            int iNextInt = ((j1) it).nextInt();
            if (kotlin.jvm.internal.e0.areEqual(obj, this.f8579b.get(iNextInt))) {
                return iNextInt - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        c();
        int size = size();
        int i10 = this.f8580c;
        for (int i11 = (size + i10) - 1; i11 >= i10; i11--) {
            if (kotlin.jvm.internal.e0.areEqual(obj, this.f8579b.get(i11))) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i10) {
        return removeAt(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    public Object removeAt(int i10) {
        c();
        int i11 = this.f8580c + i10;
        SnapshotStateList snapshotStateList = this.f8579b;
        Object objRemove = snapshotStateList.remove(i11);
        this.f8582f = size() - 1;
        this.f8581e = h0.getStructure(snapshotStateList);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        c();
        int size = size();
        int i10 = this.f8580c;
        SnapshotStateList snapshotStateList = this.f8579b;
        int iRetainAllInRange$runtime = snapshotStateList.retainAllInRange$runtime(collection, i10, size + i10);
        if (iRetainAllInRange$runtime > 0) {
            this.f8581e = h0.getStructure(snapshotStateList);
            this.f8582f = size() - iRetainAllInRange$runtime;
        }
        return iRetainAllInRange$runtime > 0;
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        h0.access$validateRange(i10, size());
        c();
        int i11 = i10 + this.f8580c;
        SnapshotStateList snapshotStateList = this.f8579b;
        Object obj2 = snapshotStateList.set(i11, obj);
        this.f8581e = h0.getStructure(snapshotStateList);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public List<Object> subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            a3.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        c();
        int i12 = this.f8580c;
        return new c1(this.f8579b, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.t.toArray(this);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i10) {
        c();
        kotlin.jvm.internal.z0 z0Var = new kotlin.jvm.internal.z0();
        z0Var.f71866b = i10 - 1;
        return new b1(z0Var, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.t.toArray(this, tArr);
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        c();
        int i11 = this.f8580c + i10;
        SnapshotStateList snapshotStateList = this.f8579b;
        snapshotStateList.add(i11, obj);
        this.f8582f = size() + 1;
        this.f8581e = h0.getStructure(snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        return addAll(size(), collection);
    }
}
