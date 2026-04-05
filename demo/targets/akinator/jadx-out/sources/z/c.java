package z;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements Set {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f96775b;

    public c(f fVar) {
        this.f96775b = fVar;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f96775b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f96775b.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f96775b.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        f fVar = this.f96775b;
        int iHashCode = 0;
        for (int size = fVar.size() - 1; size >= 0; size--) {
            Object objKeyAt = fVar.keyAt(size);
            iHashCode += objKeyAt == null ? 0 : objKeyAt.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f96775b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new b(this.f96775b, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        f fVar = this.f96775b;
        int iIndexOfKey = fVar.indexOfKey(obj);
        if (iIndexOfKey < 0) {
            return false;
        }
        fVar.removeAt(iIndexOfKey);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f96775b.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f96775b.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f96775b.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        f fVar = this.f96775b;
        int size = fVar.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = fVar.keyAt(i10);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        for (int i10 = 0; i10 < size; i10++) {
            tArr[i10] = this.f96775b.keyAt(i10);
        }
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }
}
