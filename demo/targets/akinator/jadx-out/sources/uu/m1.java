package uu;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m1 implements l1 {

    /* renamed from: b, reason: collision with root package name */
    public final Map f88774b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.l f88775c;

    public m1(Map<Object, Object> map, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "map");
        kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "default");
        this.f88774b = map;
        this.f88775c = lVar;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getMap().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return getMap().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return getMap().get(obj);
    }

    public Set<Map.Entry<Object, Object>> getEntries() {
        return getMap().entrySet();
    }

    public Set<Object> getKeys() {
        return getMap().keySet();
    }

    @Override // uu.l1
    public Map<Object, Object> getMap() {
        return this.f88774b;
    }

    @Override // uu.l1
    public Object getOrImplicitDefault(Object obj) {
        Map<Object, Object> map = getMap();
        Object obj2 = map.get(obj);
        return (obj2 != null || map.containsKey(obj)) ? obj2 : this.f88775c.invoke(obj);
    }

    public int getSize() {
        return getMap().size();
    }

    public Collection<Object> getValues() {
        return getMap().values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return getMap().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getMap().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return getMap().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
