package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;
import tu.x0;
import uu.c2;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DisabledStorage implements CacheStorage {
    public static final DisabledStorage INSTANCE = new DisabledStorage();

    private DisabledStorage() {
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object find(Url url, Map<String, String> map, d<? super CachedResponseData> dVar) {
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object findAll(Url url, d<? super Set<CachedResponseData>> dVar) {
        return c2.emptySet();
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object store(Url url, CachedResponseData cachedResponseData, d<? super x0> dVar) {
        return x0.f87415a;
    }
}
