package nh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g4 extends l4 implements Map {
    public abstract Map c();

    @Override // java.util.Map
    public void clear() {
        c().clear();
    }

    public boolean containsKey(Object obj) {
        return c().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return c().containsValue(obj);
    }

    public Set<Map.Entry<Object, Object>> entrySet() {
        return c().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    public Object get(Object obj) {
        return c().get(obj);
    }

    public int hashCode() {
        return c().hashCode();
    }

    public boolean isEmpty() {
        return c().isEmpty();
    }

    public Set<Object> keySet() {
        return c().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return c().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        c().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return c().remove(obj);
    }

    public int size() {
        return c().size();
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return c().values();
    }
}
