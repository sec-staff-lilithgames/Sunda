package io.ktor.client.plugins.cache.storage;

import io.ktor.client.plugins.cache.HttpCacheEntry;
import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class DisabledCacheStorage extends HttpCacheStorage {
    public static final DisabledCacheStorage INSTANCE = new DisabledCacheStorage();

    private DisabledCacheStorage() {
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public HttpCacheEntry find(Url url, Map<String, String> varyKeys) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(varyKeys, "varyKeys");
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public Set<HttpCacheEntry> findByUrl(Url url) {
        e0.checkNotNullParameter(url, "url");
        return c2.emptySet();
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public void store(Url url, HttpCacheEntry value) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(value, "value");
    }
}
