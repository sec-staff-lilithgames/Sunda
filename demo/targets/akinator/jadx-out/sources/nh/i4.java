package nh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i4 extends l4 implements fc {
    @Override // nh.fc, nh.c8
    public Map<Object, Collection<Object>> asMap() {
        return delegate().asMap();
    }

    @Override // nh.fc
    public void clear() {
        delegate().clear();
    }

    @Override // nh.fc
    public boolean containsEntry(Object obj, Object obj2) {
        return delegate().containsEntry(obj, obj2);
    }

    @Override // nh.fc
    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    @Override // nh.fc
    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // nh.l4
    public abstract fc delegate();

    @Override // nh.fc
    public Collection<Map.Entry<Object, Object>> entries() {
        return delegate().entries();
    }

    @Override // nh.fc, nh.c8
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // nh.fc, nh.c8
    public Collection<Object> get(Object obj) {
        return delegate().get(obj);
    }

    @Override // nh.fc
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // nh.fc
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // nh.fc
    public Set<Object> keySet() {
        return delegate().keySet();
    }

    @Override // nh.fc
    public ud keys() {
        return delegate().keys();
    }

    @Override // nh.fc, nh.c8
    public boolean put(Object obj, Object obj2) {
        return delegate().put(obj, obj2);
    }

    @Override // nh.fc
    public boolean putAll(Object obj, Iterable<Object> iterable) {
        return delegate().putAll(obj, iterable);
    }

    @Override // nh.fc
    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @Override // nh.fc, nh.c8
    public Collection<Object> removeAll(Object obj) {
        return delegate().removeAll(obj);
    }

    @Override // nh.fc, nh.c8
    public Collection<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return delegate().replaceValues(obj, iterable);
    }

    @Override // nh.fc
    public int size() {
        return delegate().size();
    }

    @Override // nh.fc
    public Collection<Object> values() {
        return delegate().values();
    }

    @Override // nh.fc
    public boolean putAll(fc fcVar) {
        return delegate().putAll(fcVar);
    }
}
