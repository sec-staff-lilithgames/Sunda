package vw;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l4 implements Map {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f89967b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f89968c;

    public l4() {
        this(true);
    }

    @Override // java.util.Map
    public void clear() {
        this.f89967b.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f89967b.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f89967b.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return this.f89967b.entrySet();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f89967b.get(obj);
    }

    public Map getMap() {
        return this.f89967b;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f89967b.isEmpty();
    }

    public boolean isStrict() {
        return this.f89968c;
    }

    @Override // java.util.Map
    public Set keySet() {
        return this.f89967b.keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.f89967b.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        this.f89967b.putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.f89967b.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f89967b.size();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.f89967b.values();
    }

    public l4(boolean z10) {
        this.f89967b = new HashMap();
        this.f89968c = z10;
    }
}
