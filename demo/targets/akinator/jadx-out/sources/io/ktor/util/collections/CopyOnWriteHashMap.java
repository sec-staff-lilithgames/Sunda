package io.ktor.util.collections;

import io.ktor.util.InternalAPI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kv.l;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@InternalAPI
/* loaded from: classes8.dex */
public final class CopyOnWriteHashMap<K, V> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater current$FU = AtomicReferenceFieldUpdater.newUpdater(CopyOnWriteHashMap.class, Object.class, "current");
    private volatile /* synthetic */ Object current = p1.emptyMap();

    public final V computeIfAbsent(K key, l producer) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(producer, "producer");
        while (true) {
            Map map = (Map) this.current;
            V v10 = (V) map.get(key);
            if (v10 != null) {
                return v10;
            }
            HashMap map2 = new HashMap(map);
            V v11 = (V) producer.invoke(key);
            map2.put(key, v11);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = current$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, map, map2)) {
                if (atomicReferenceFieldUpdater.get(this) != map) {
                    break;
                }
            }
            return v11;
        }
    }

    public final V get(K key) {
        e0.checkNotNullParameter(key, "key");
        return (V) ((Map) this.current).get(key);
    }

    public final V put(K key, V value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        while (true) {
            Map map = (Map) this.current;
            if (map.get(key) == value) {
                return value;
            }
            HashMap map2 = new HashMap(map);
            V v10 = (V) map2.put(key, value);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = current$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, map, map2)) {
                if (atomicReferenceFieldUpdater.get(this) != map) {
                    break;
                }
            }
            return v10;
        }
    }

    public final V remove(K key) {
        e0.checkNotNullParameter(key, "key");
        while (true) {
            Map map = (Map) this.current;
            if (map.get(key) == null) {
                return null;
            }
            HashMap map2 = new HashMap(map);
            V v10 = (V) map2.remove(key);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = current$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, map, map2)) {
                if (atomicReferenceFieldUpdater.get(this) != map) {
                    break;
                }
            }
            return v10;
        }
    }

    public final void set(K key, V value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        put(key, value);
    }
}
