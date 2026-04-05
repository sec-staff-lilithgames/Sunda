package io.ktor.client.plugins.cache.storage;

import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;
import kv.a;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface CacheStorage {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final a Unlimited = CacheStorage$Companion$Unlimited$1.INSTANCE;
        private static final CacheStorage Disabled = DisabledStorage.INSTANCE;

        private Companion() {
        }

        public final CacheStorage getDisabled() {
            return Disabled;
        }

        public final a getUnlimited() {
            return Unlimited;
        }
    }

    Object find(Url url, Map<String, String> map, d<? super CachedResponseData> dVar);

    Object findAll(Url url, d<? super Set<CachedResponseData>> dVar);

    Object store(Url url, CachedResponseData cachedResponseData, d<? super x0> dVar);
}
