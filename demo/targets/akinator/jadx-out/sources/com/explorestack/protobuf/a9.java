package com.explorestack.protobuf;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a9 implements Map {

    /* renamed from: b, reason: collision with root package name */
    public final b9 f21851b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f21852c;

    public a9(b9 b9Var, Map map) {
        this.f21851b = b9Var;
        this.f21852c = map;
    }

    @Override // java.util.Map
    public void clear() {
        this.f21851b.ensureMutable();
        this.f21852c.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f21852c.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f21852c.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        return new z8(this.f21851b, this.f21852c.entrySet());
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.f21852c.equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f21852c.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f21852c.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f21852c.isEmpty();
    }

    @Override // java.util.Map
    public Set<Object> keySet() {
        return new z8(this.f21851b, this.f21852c.keySet());
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f21851b.ensureMutable();
        Charset charset = x7.f22881a;
        obj.getClass();
        obj2.getClass();
        return this.f21852c.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        this.f21851b.ensureMutable();
        for (Object obj : map.keySet()) {
            Charset charset = x7.f22881a;
            obj.getClass();
            map.get(obj).getClass();
        }
        this.f21852c.putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        this.f21851b.ensureMutable();
        return this.f21852c.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f21852c.size();
    }

    public String toString() {
        return this.f21852c.toString();
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return new x8(this.f21851b, this.f21852c.values());
    }
}
