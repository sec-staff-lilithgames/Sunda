package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e0 implements fc {

    /* renamed from: b, reason: collision with root package name */
    public transient Collection f76197b;

    /* renamed from: c, reason: collision with root package name */
    public transient Set f76198c;

    /* renamed from: e, reason: collision with root package name */
    public transient ud f76199e;

    /* renamed from: f, reason: collision with root package name */
    public transient Collection f76200f;

    /* renamed from: g, reason: collision with root package name */
    public transient Map f76201g;

    public abstract Map a();

    @Override // nh.fc, nh.c8
    public Map<Object, Collection<Object>> asMap() {
        Map<Object, Collection<Object>> map = this.f76201g;
        if (map != null) {
            return map;
        }
        Map<Object, Collection<Object>> mapA = a();
        this.f76201g = mapA;
        return mapA;
    }

    public abstract Collection b();

    public abstract Set c();

    @Override // nh.fc
    public abstract /* synthetic */ void clear();

    @Override // nh.fc
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<Object> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // nh.fc
    public abstract /* synthetic */ boolean containsKey(Object obj);

    @Override // nh.fc
    public boolean containsValue(Object obj) {
        Iterator<Collection<Object>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract ud d();

    public abstract Collection e();

    @Override // nh.fc
    public Collection<Map.Entry<Object, Object>> entries() {
        Collection<Map.Entry<Object, Object>> collection = this.f76197b;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<Object, Object>> collectionB = b();
        this.f76197b = collectionB;
        return collectionB;
    }

    @Override // nh.fc, nh.c8
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fc) {
            return asMap().equals(((fc) obj).asMap());
        }
        return false;
    }

    public abstract Iterator f();

    @Override // nh.fc, nh.c8
    public abstract /* synthetic */ Collection get(Object obj);

    @Override // nh.fc
    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // nh.fc
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // nh.fc
    public Set<Object> keySet() {
        Set<Object> set = this.f76198c;
        if (set != null) {
            return set;
        }
        Set<Object> setC = c();
        this.f76198c = setC;
        return setC;
    }

    @Override // nh.fc
    public ud keys() {
        ud udVar = this.f76199e;
        if (udVar != null) {
            return udVar;
        }
        ud udVarD = d();
        this.f76199e = udVarD;
        return udVarD;
    }

    @Override // nh.fc, nh.c8
    public boolean put(Object obj, Object obj2) {
        return get(obj).add(obj2);
    }

    @Override // nh.fc
    public boolean putAll(Object obj, Iterable<Object> iterable) {
        mh.p1.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return !collection.isEmpty() && get(obj).addAll(collection);
        }
        Iterator<Object> it = iterable.iterator();
        return it.hasNext() && z7.addAll(get(obj), it);
    }

    @Override // nh.fc
    public boolean remove(Object obj, Object obj2) {
        Collection<Object> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // nh.fc, nh.c8
    public abstract /* synthetic */ Collection removeAll(Object obj);

    @Override // nh.fc, nh.c8
    public Collection<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        mh.p1.checkNotNull(iterable);
        Collection<Object> collectionRemoveAll = removeAll(obj);
        putAll(obj, iterable);
        return collectionRemoveAll;
    }

    @Override // nh.fc
    public abstract /* synthetic */ int size();

    public String toString() {
        return asMap().toString();
    }

    @Override // nh.fc
    public Collection<Object> values() {
        Collection<Object> collection = this.f76200f;
        if (collection != null) {
            return collection;
        }
        Collection<Object> collectionE = e();
        this.f76200f = collectionE;
        return collectionE;
    }

    @Override // nh.fc
    public boolean putAll(fc fcVar) {
        boolean zPut = false;
        for (Map.Entry<Object, Object> entry : fcVar.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }
}
