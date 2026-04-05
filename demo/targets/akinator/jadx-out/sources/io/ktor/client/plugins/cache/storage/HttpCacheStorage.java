package io.ktor.client.plugins.cache.storage;

import io.ktor.client.plugins.cache.HttpCacheEntry;
import io.ktor.http.Url;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.u;
import kv.a;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes7.dex */
public abstract class HttpCacheStorage {
    public static final Companion Companion = new Companion(null);
    private static final a Unlimited = HttpCacheStorage$Companion$Unlimited$1.INSTANCE;
    private static final HttpCacheStorage Disabled = DisabledCacheStorage.INSTANCE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final HttpCacheStorage getDisabled() {
            return HttpCacheStorage.Disabled;
        }

        public final a getUnlimited() {
            return HttpCacheStorage.Unlimited;
        }

        private Companion() {
        }
    }

    public abstract HttpCacheEntry find(Url url, Map<String, String> map);

    public abstract Set<HttpCacheEntry> findByUrl(Url url);

    public abstract void store(Url url, HttpCacheEntry httpCacheEntry);
}
