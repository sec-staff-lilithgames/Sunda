package io.ktor.client.plugins.cache.storage;

import io.ktor.client.plugins.cache.HttpCacheEntry;
import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UnlimitedCacheStorage extends HttpCacheStorage {
    private final ConcurrentMap<Url, Set<HttpCacheEntry>> store = new ConcurrentMap<>(0, 1, null);

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public HttpCacheEntry find(Url url, Map<String, String> varyKeys) {
        Object next;
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(varyKeys, "varyKeys");
        Iterator<T> it = this.store.computeIfAbsent((ConcurrentMap<Url, Set<HttpCacheEntry>>) url, UnlimitedCacheStorage$find$data$1.INSTANCE).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            HttpCacheEntry httpCacheEntry = (HttpCacheEntry) next;
            if (!varyKeys.isEmpty()) {
                for (Map.Entry<String, String> entry : varyKeys.entrySet()) {
                    String key = entry.getKey();
                    if (!e0.areEqual(httpCacheEntry.getVaryKeys().get(key), entry.getValue())) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return (HttpCacheEntry) next;
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public Set<HttpCacheEntry> findByUrl(Url url) {
        e0.checkNotNullParameter(url, "url");
        Set<HttpCacheEntry> set = this.store.get(url);
        return set == null ? c2.emptySet() : set;
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public void store(Url url, HttpCacheEntry value) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(value, "value");
        Set<HttpCacheEntry> setComputeIfAbsent = this.store.computeIfAbsent((ConcurrentMap<Url, Set<HttpCacheEntry>>) url, UnlimitedCacheStorage$store$data$1.INSTANCE);
        if (setComputeIfAbsent.add(value)) {
            return;
        }
        setComputeIfAbsent.remove(value);
        setComputeIfAbsent.add(value);
    }
}
