package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class hd extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public final e0 f76331e;

    public hd(e0 e0Var) {
        this.f76331e = e0Var;
    }

    @Override // nh.h0, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f76331e.clear();
    }

    @Override // nh.h0, java.util.AbstractCollection, java.util.Collection, nh.ud
    public boolean contains(Object obj) {
        return this.f76331e.containsKey(obj);
    }

    @Override // nh.h0, nh.ud
    public int count(Object obj) {
        Collection<Object> collection;
        Map<Object, Collection<Object>> mapAsMap = this.f76331e.asMap();
        mh.p1.checkNotNull(mapAsMap);
        try {
            collection = mapAsMap.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection<Object> collection2 = collection;
        if (collection2 == null) {
            return 0;
        }
        return collection2.size();
    }

    @Override // nh.h0
    public final int e() {
        return this.f76331e.asMap().size();
    }

    @Override // nh.h0, nh.ud
    public Set<Object> elementSet() {
        return this.f76331e.keySet();
    }

    @Override // nh.h0
    public final Iterator f() {
        throw new AssertionError("should never be called");
    }

    @Override // nh.h0
    public final Iterator g() {
        return new ha(2, this.f76331e.asMap().entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, nh.ud, nh.qg, java.util.Set, java.util.NavigableSet
    public Iterator<Object> iterator() {
        return new ha(0, this.f76331e.entries().iterator());
    }

    @Override // nh.h0, nh.ud
    public int remove(Object obj, int i10) {
        Collection<Object> collection;
        jh.i.o(i10, "occurrences");
        if (i10 == 0) {
            return count(obj);
        }
        Map<Object, Collection<Object>> mapAsMap = this.f76331e.asMap();
        mh.p1.checkNotNull(mapAsMap);
        try {
            collection = mapAsMap.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection<Object> collection2 = collection;
        if (collection2 == null) {
            return 0;
        }
        int size = collection2.size();
        if (i10 >= size) {
            collection2.clear();
            return size;
        }
        Iterator<Object> it = collection2.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            it.next();
            it.remove();
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, nh.ud
    public int size() {
        return this.f76331e.size();
    }
}
