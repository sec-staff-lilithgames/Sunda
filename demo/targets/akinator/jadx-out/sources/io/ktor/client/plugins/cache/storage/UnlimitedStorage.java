package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import tu.x0;
import uu.c2;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UnlimitedStorage implements CacheStorage {
    private final ConcurrentMap<Url, Set<CachedResponseData>> store = new ConcurrentMap<>(0, 1, null);

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object find(Url url, Map<String, String> map, d<? super CachedResponseData> dVar) {
        for (Object obj : this.store.computeIfAbsent((ConcurrentMap<Url, Set<CachedResponseData>>) url, UnlimitedStorage$find$data$1.INSTANCE)) {
            CachedResponseData cachedResponseData = (CachedResponseData) obj;
            if (map.isEmpty()) {
                return obj;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!e0.areEqual(cachedResponseData.getVaryKeys().get(key), entry.getValue())) {
                    break;
                }
            }
            return obj;
        }
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object findAll(Url url, d<? super Set<CachedResponseData>> dVar) {
        Set<CachedResponseData> set = this.store.get(url);
        return set == null ? c2.emptySet() : set;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object store(Url url, CachedResponseData cachedResponseData, d<? super x0> dVar) {
        Set<CachedResponseData> setComputeIfAbsent = this.store.computeIfAbsent((ConcurrentMap<Url, Set<CachedResponseData>>) url, UnlimitedStorage$store$cache$1.INSTANCE);
        if (!setComputeIfAbsent.add(cachedResponseData)) {
            setComputeIfAbsent.remove(cachedResponseData);
            setComputeIfAbsent.add(cachedResponseData);
        }
        return x0.f87415a;
    }
}
