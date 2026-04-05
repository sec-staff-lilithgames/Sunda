package io.ktor.util;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final l close;
    private final int maxSize;
    private final l supplier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LRUCache(l supplier, l close, int i10) {
        super(10, 0.75f, true);
        e0.checkNotNullParameter(supplier, "supplier");
        e0.checkNotNullParameter(close, "close");
        this.supplier = supplier;
        this.close = close;
        this.maxSize = i10;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) getEntries();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (this.maxSize == 0) {
            return (V) this.supplier.invoke(obj);
        }
        synchronized (this) {
            V v10 = (V) super.get(obj);
            if (v10 != null) {
                return v10;
            }
            V v11 = (V) this.supplier.invoke(obj);
            put(obj, v11);
            return v11;
        }
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) getKeys();
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<? extends K, ? extends V> eldest) {
        e0.checkNotNullParameter(eldest, "eldest");
        boolean z10 = size() > this.maxSize;
        if (z10) {
            this.close.invoke(eldest.getValue());
        }
        return z10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) getValues();
    }
}
