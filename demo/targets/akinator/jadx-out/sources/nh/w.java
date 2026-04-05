package nh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class w extends e0 implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final transient Map f76726h;

    /* renamed from: i, reason: collision with root package name */
    public transient int f76727i;

    public w(Map map) {
        mh.p1.checkArgument(map.isEmpty());
        this.f76726h = map;
    }

    @Override // nh.e0
    public Map a() {
        Map map = this.f76726h;
        return map instanceof NavigableMap ? new k(this, (NavigableMap) map) : map instanceof SortedMap ? new n(this, (SortedMap) map) : new g(this, map);
    }

    @Override // nh.e0
    public final Collection b() {
        return this instanceof sf ? new c0(this) : new b0(this);
    }

    @Override // nh.e0
    public Set c() {
        Map map = this.f76726h;
        return map instanceof NavigableMap ? new l(this, (NavigableMap) map) : map instanceof SortedMap ? new o(this, (SortedMap) map) : new j(this, map);
    }

    @Override // nh.e0, nh.fc
    public void clear() {
        Map map = this.f76726h;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f76727i = 0;
    }

    @Override // nh.e0, nh.fc
    public boolean containsKey(Object obj) {
        return this.f76726h.containsKey(obj);
    }

    @Override // nh.e0
    public final ud d() {
        return new hd(this);
    }

    @Override // nh.e0
    public final Collection e() {
        return new d0(this);
    }

    @Override // nh.e0, nh.fc
    public Collection<Map.Entry<Object, Object>> entries() {
        return super.entries();
    }

    @Override // nh.e0
    public final Iterator f() {
        return new d(this, 1);
    }

    public abstract Collection g();

    @Override // nh.e0, nh.fc, nh.c8
    public Collection<Object> get(Object obj) {
        Collection collectionG = (Collection) this.f76726h.get(obj);
        if (collectionG == null) {
            collectionG = g();
        }
        return j(obj, collectionG);
    }

    public Collection h() {
        return i(g());
    }

    public abstract Collection i(Collection collection);

    public abstract Collection j(Object obj, Collection collection);

    @Override // nh.e0, nh.fc, nh.c8
    public boolean put(Object obj, Object obj2) {
        Map map = this.f76726h;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f76727i++;
            return true;
        }
        Collection collectionG = g();
        if (!collectionG.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f76727i++;
        map.put(obj, collectionG);
        return true;
    }

    @Override // nh.e0, nh.fc, nh.c8
    public Collection<Object> removeAll(Object obj) {
        Collection collection = (Collection) this.f76726h.remove(obj);
        if (collection == null) {
            return h();
        }
        Collection collectionG = g();
        collectionG.addAll(collection);
        this.f76727i -= collection.size();
        collection.clear();
        return i(collectionG);
    }

    @Override // nh.e0, nh.fc, nh.c8
    public Collection<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(obj);
        }
        Map map = this.f76726h;
        Collection collectionG = (Collection) map.get(obj);
        if (collectionG == null) {
            collectionG = g();
            map.put(obj, collectionG);
        }
        Collection collectionG2 = g();
        collectionG2.addAll(collectionG);
        this.f76727i -= collectionG.size();
        collectionG.clear();
        while (it.hasNext()) {
            if (collectionG.add(it.next())) {
                this.f76727i++;
            }
        }
        return i(collectionG2);
    }

    @Override // nh.e0, nh.fc
    public int size() {
        return this.f76727i;
    }

    @Override // nh.e0, nh.fc
    public Collection<Object> values() {
        return super.values();
    }
}
