package nh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class pd extends i4 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final fc f76561b;

    /* renamed from: c, reason: collision with root package name */
    public transient yb f76562c;

    /* renamed from: e, reason: collision with root package name */
    public transient ud f76563e;

    /* renamed from: f, reason: collision with root package name */
    public transient Set f76564f;

    /* renamed from: g, reason: collision with root package name */
    public transient Collection f76565g;

    /* renamed from: h, reason: collision with root package name */
    public transient Map f76566h;

    public pd(fc fcVar) {
        this.f76561b = (fc) mh.p1.checkNotNull(fcVar);
    }

    @Override // nh.i4, nh.fc, nh.c8
    public Map<Object, Collection<Object>> asMap() {
        Map<Object, Collection<Object>> map = this.f76566h;
        if (map != null) {
            return map;
        }
        Map<Object, Collection<Object>> mapUnmodifiableMap = Collections.unmodifiableMap(ec.transformValues(this.f76561b.asMap(), new in.c(10)));
        this.f76566h = mapUnmodifiableMap;
        return mapUnmodifiableMap;
    }

    @Override // nh.i4, nh.fc
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // nh.i4, nh.l4
    public fc delegate() {
        return this.f76561b;
    }

    @Override // nh.i4, nh.fc
    public Collection<Map.Entry<Object, Object>> entries() {
        yb ybVar = this.f76562c;
        if (ybVar != null) {
            return ybVar;
        }
        Collection<Map.Entry<Object, Object>> collectionEntries = this.f76561b.entries();
        yb zbVar = collectionEntries instanceof Set ? new zb(Collections.unmodifiableSet((Set) collectionEntries)) : new yb(Collections.unmodifiableCollection(collectionEntries));
        this.f76562c = zbVar;
        return zbVar;
    }

    @Override // nh.i4, nh.fc, nh.c8
    public Collection<Object> get(Object obj) {
        return sd.a(this.f76561b.get(obj));
    }

    @Override // nh.i4, nh.fc
    public Set<Object> keySet() {
        Set<Object> set = this.f76564f;
        if (set != null) {
            return set;
        }
        Set<Object> setUnmodifiableSet = Collections.unmodifiableSet(this.f76561b.keySet());
        this.f76564f = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @Override // nh.i4, nh.fc
    public ud keys() {
        ud udVar = this.f76563e;
        if (udVar != null) {
            return udVar;
        }
        ud udVarUnmodifiableMultiset = le.unmodifiableMultiset(this.f76561b.keys());
        this.f76563e = udVarUnmodifiableMultiset;
        return udVarUnmodifiableMultiset;
    }

    @Override // nh.i4, nh.fc, nh.c8
    public boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.i4, nh.fc
    public boolean putAll(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.i4, nh.fc
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.i4, nh.fc, nh.c8
    public Collection<Object> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.i4, nh.fc, nh.c8
    public Collection<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.i4, nh.fc
    public Collection<Object> values() {
        Collection<Object> collection = this.f76565g;
        if (collection != null) {
            return collection;
        }
        Collection<Object> collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f76561b.values());
        this.f76565g = collectionUnmodifiableCollection;
        return collectionUnmodifiableCollection;
    }

    @Override // nh.i4, nh.fc
    public boolean putAll(fc fcVar) {
        throw new UnsupportedOperationException();
    }
}
