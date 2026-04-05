package t0;

import b1.e0;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b extends uu.g implements s0.j {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f86219b = 0;

    @Override // java.util.Collection, java.util.List, s0.j, s0.h
    public abstract /* synthetic */ s0.h add(Object obj);

    @Override // java.util.List, s0.j
    public abstract /* synthetic */ s0.j add(int i10, Object obj);

    @Override // java.util.Collection, java.util.List, s0.j, s0.h
    public abstract /* synthetic */ s0.j add(Object obj);

    @Override // java.util.Collection, java.util.List, s0.j, s0.h
    public /* bridge */ /* synthetic */ s0.h addAll(Collection collection) {
        return addAll((Collection<Object>) collection);
    }

    @Override // s0.j, s0.h
    public abstract /* synthetic */ s0.g builder();

    @Override // s0.j, s0.h
    public abstract /* synthetic */ s0.i builder();

    @Override // uu.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // uu.a, java.util.Collection, java.util.List
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

    @Override // uu.g, uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return listIterator();
    }

    @Override // uu.g, java.util.List
    public ListIterator<Object> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, s0.j, s0.h
    public /* bridge */ /* synthetic */ s0.h removeAll(Collection collection) {
        return removeAll((Collection<Object>) collection);
    }

    @Override // s0.j, s0.h
    public abstract /* synthetic */ s0.h removeAll(kv.l lVar);

    @Override // s0.j, s0.h
    public abstract /* synthetic */ s0.j removeAll(kv.l lVar);

    @Override // s0.j
    public abstract /* synthetic */ s0.j removeAt(int i10);

    @Override // java.util.Collection, java.util.List, s0.j, s0.h
    public /* bridge */ /* synthetic */ s0.h retainAll(Collection collection) {
        return retainAll((Collection<Object>) collection);
    }

    @Override // uu.g, java.util.List, s0.j
    public abstract /* synthetic */ s0.j set(int i10, Object obj);

    @Override // java.util.Collection, java.util.List, s0.j, s0.h
    public s0.j addAll(Collection<Object> collection) {
        s0.i iVarBuilder = builder();
        iVarBuilder.addAll(collection);
        return iVarBuilder.build();
    }

    @Override // java.util.Collection, java.util.List, s0.j, s0.h
    public s0.j clear() {
        return l.persistentVectorOf();
    }

    @Override // java.util.Collection, java.util.List, s0.j, s0.h
    public s0.j remove(Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? removeAt(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, s0.j, s0.h
    public s0.j removeAll(Collection<Object> collection) {
        return removeAll((kv.l) new e0(4, collection));
    }

    @Override // java.util.Collection, java.util.List, s0.j, s0.h
    public s0.j retainAll(Collection<Object> collection) {
        return removeAll((kv.l) new e0(3, collection));
    }

    @Override // uu.g, java.util.List, s0.d
    public s0.d subList(int i10, int i11) {
        return super.subList(i10, i11);
    }

    @Override // java.util.List, s0.j
    public s0.j addAll(int i10, Collection<Object> collection) {
        s0.i iVarBuilder = builder();
        iVarBuilder.addAll(i10, collection);
        return iVarBuilder.build();
    }
}
