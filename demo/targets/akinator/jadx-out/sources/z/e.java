package z;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements Collection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f96792b;

    public e(f fVar) {
        this.f96792b = fVar;
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
        this.f96792b.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f96792b.__restricted$indexOfValue(obj) >= 0;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f96792b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new b(this.f96792b, 1);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        f fVar = this.f96792b;
        int i__restricted$indexOfValue = fVar.__restricted$indexOfValue(obj);
        if (i__restricted$indexOfValue < 0) {
            return false;
        }
        fVar.removeAt(i__restricted$indexOfValue);
        return true;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        f fVar = this.f96792b;
        int size = fVar.size();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            if (collection.contains(fVar.valueAt(i10))) {
                fVar.removeAt(i10);
                i10--;
                size--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        f fVar = this.f96792b;
        int size = fVar.size();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            if (!collection.contains(fVar.valueAt(i10))) {
                fVar.removeAt(i10);
                i10--;
                size--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public int size() {
        return this.f96792b.size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        f fVar = this.f96792b;
        int size = fVar.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = fVar.valueAt(i10);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        for (int i10 = 0; i10 < size; i10++) {
            tArr[i10] = this.f96792b.valueAt(i10);
        }
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }
}
