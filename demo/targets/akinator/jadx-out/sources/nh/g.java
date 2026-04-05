package nh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g extends dc {

    /* renamed from: f, reason: collision with root package name */
    public final transient Map f76274f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f76275g;

    public g(w wVar, Map map) {
        this.f76275g = wVar;
        this.f76274f = map;
    }

    @Override // nh.dc
    public final Set a() {
        return new e(this);
    }

    public final Map.Entry c(Map.Entry entry) {
        Object key = entry.getKey();
        return ec.immutableEntry(key, this.f76275g.j(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        w wVar = this.f76275g;
        if (this.f76274f == wVar.f76726h) {
            wVar.clear();
            return;
        }
        f fVar = new f(this);
        mh.p1.checkNotNull(fVar);
        while (fVar.hasNext()) {
            fVar.next();
            fVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map map = this.f76274f;
        mh.p1.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return this == obj || this.f76274f.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return this.f76274f.hashCode();
    }

    @Override // nh.dc, java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        return this.f76275g.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f76274f.size();
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return this.f76274f.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> get(Object obj) {
        Object obj2;
        Map map = this.f76274f;
        mh.p1.checkNotNull(map);
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.f76275g.j(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> remove(Object obj) {
        Collection<? extends Object> collection = (Collection) this.f76274f.remove(obj);
        if (collection == null) {
            return null;
        }
        w wVar = this.f76275g;
        Collection<Object> collectionG = wVar.g();
        collectionG.addAll(collection);
        wVar.f76727i -= collection.size();
        collection.clear();
        return collectionG;
    }
}
