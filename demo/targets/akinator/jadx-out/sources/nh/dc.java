package nh;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class dc extends AbstractMap {

    /* renamed from: b, reason: collision with root package name */
    public transient Set f76184b;

    /* renamed from: c, reason: collision with root package name */
    public transient Set f76185c;

    /* renamed from: e, reason: collision with root package name */
    public transient Collection f76186e;

    public abstract Set a();

    public Collection b() {
        return new cc(this);
    }

    public Set createKeySet() {
        return new nb(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        Set<Map.Entry<Object, Object>> set = this.f76184b;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<Object, Object>> setA = a();
        this.f76184b = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        Set<Object> set = this.f76185c;
        if (set != null) {
            return set;
        }
        Set<Object> setCreateKeySet = createKeySet();
        this.f76185c = setCreateKeySet;
        return setCreateKeySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> values() {
        Collection<Object> collection = this.f76186e;
        if (collection != null) {
            return collection;
        }
        Collection<Object> collectionB = b();
        this.f76186e = collectionB;
        return collectionB;
    }
}
