package nh;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class kd extends e0 implements sf, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final Map f76425h;

    public kd(Map map) {
        this.f76425h = (Map) mh.p1.checkNotNull(map);
    }

    @Override // nh.e0
    public final Map a() {
        return new ad(this);
    }

    @Override // nh.e0
    public final Collection b() {
        throw new AssertionError("unreachable");
    }

    @Override // nh.e0
    public final Set c() {
        return this.f76425h.keySet();
    }

    @Override // nh.e0, nh.fc
    public void clear() {
        this.f76425h.clear();
    }

    @Override // nh.e0, nh.fc
    public boolean containsEntry(Object obj, Object obj2) {
        return this.f76425h.entrySet().contains(ec.immutableEntry(obj, obj2));
    }

    @Override // nh.e0, nh.fc
    public boolean containsKey(Object obj) {
        return this.f76425h.containsKey(obj);
    }

    @Override // nh.e0, nh.fc
    public boolean containsValue(Object obj) {
        return this.f76425h.containsValue(obj);
    }

    @Override // nh.e0
    public final ud d() {
        return new hd(this);
    }

    @Override // nh.e0
    public final Collection e() {
        return this.f76425h.values();
    }

    @Override // nh.e0
    public final Iterator f() {
        return this.f76425h.entrySet().iterator();
    }

    @Override // nh.e0, nh.fc
    public int hashCode() {
        return this.f76425h.hashCode();
    }

    @Override // nh.e0, nh.fc, nh.c8
    public boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e0, nh.fc
    public boolean putAll(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e0, nh.fc
    public boolean remove(Object obj, Object obj2) {
        return this.f76425h.entrySet().remove(ec.immutableEntry(obj, obj2));
    }

    @Override // nh.e0, nh.fc, nh.c8
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.e0, nh.fc
    public int size() {
        return this.f76425h.size();
    }

    @Override // nh.e0, nh.fc
    public Set<Map.Entry<Object, Object>> entries() {
        return this.f76425h.entrySet();
    }

    @Override // nh.e0, nh.fc, nh.c8
    public Set<Object> get(Object obj) {
        return new jd(this, obj);
    }

    @Override // nh.e0, nh.fc
    public boolean putAll(fc fcVar) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e0, nh.fc, nh.c8
    public Set<Object> removeAll(Object obj) {
        HashSet hashSet = new HashSet(2);
        Map map = this.f76425h;
        if (!map.containsKey(obj)) {
            return hashSet;
        }
        hashSet.add(map.remove(obj));
        return hashSet;
    }

    @Override // nh.e0, nh.fc, nh.c8
    public Set<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }
}
