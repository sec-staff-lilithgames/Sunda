package com.explorestack.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c9 extends LinkedHashMap {

    /* renamed from: c, reason: collision with root package name */
    public static final c9 f22031c;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22032b = true;

    static {
        c9 c9Var = new c9();
        f22031c = c9Var;
        c9Var.makeImmutable();
    }

    public static int a(Map map) {
        int iHashCode;
        int iHashCode2;
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof byte[]) {
                iHashCode = x7.hashCode((byte[]) key);
            } else {
                if (key instanceof o7) {
                    throw new UnsupportedOperationException();
                }
                iHashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                iHashCode2 = x7.hashCode((byte[]) value);
            } else {
                if (value instanceof o7) {
                    throw new UnsupportedOperationException();
                }
                iHashCode2 = value.hashCode();
            }
            i10 += iHashCode2 ^ iHashCode;
        }
        return i10;
    }

    public static LinkedHashMap b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                value = Arrays.copyOf(bArr, bArr.length);
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public static boolean d(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj = map2.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj) : value.equals(obj))) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> c9 emptyMapField() {
        return f22031c;
    }

    public final void c() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        c();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && d(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean isMutable() {
        return this.f22032b;
    }

    public void makeImmutable() {
        this.f22032b = false;
    }

    public void mergeFrom(c9 c9Var) {
        c();
        if (c9Var.isEmpty()) {
            return;
        }
        putAll(c9Var);
    }

    public c9 mutableCopy() {
        if (isEmpty()) {
            return new c9();
        }
        c9 c9Var = new c9(this);
        c9Var.f22032b = true;
        return c9Var;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        c();
        Charset charset = x7.f22881a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<Object, Object> map) {
        c();
        for (Object obj : map.keySet()) {
            Charset charset = x7.f22881a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        c();
        return super.remove(obj);
    }

    public Object put(Map.Entry<Object, Object> entry) {
        return put(entry.getKey(), entry.getValue());
    }
}
