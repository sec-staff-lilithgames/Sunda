package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ConcurrentHashMapCache<T> implements SerializerCache<T> {
    private final ConcurrentHashMap<Class<?>, CacheEntry<T>> cache;
    private final l compute;

    public ConcurrentHashMapCache(l compute) {
        e0.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public KSerializer<T> get(KClass<Object> key) {
        CacheEntry<T> cacheEntryPutIfAbsent;
        e0.checkNotNullParameter(key, "key");
        ConcurrentHashMap<Class<?>, CacheEntry<T>> concurrentHashMap = this.cache;
        Class<?> javaClass = jv.a.getJavaClass((KClass) key);
        CacheEntry<T> cacheEntry = concurrentHashMap.get(javaClass);
        if (cacheEntry == null && (cacheEntryPutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (cacheEntry = new CacheEntry<>((KSerializer) this.compute.invoke(key))))) != null) {
            cacheEntry = cacheEntryPutIfAbsent;
        }
        return cacheEntry.serializer;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public boolean isStored(KClass<?> key) {
        e0.checkNotNullParameter(key, "key");
        return this.cache.containsKey(jv.a.getJavaClass((KClass) key));
    }
}
