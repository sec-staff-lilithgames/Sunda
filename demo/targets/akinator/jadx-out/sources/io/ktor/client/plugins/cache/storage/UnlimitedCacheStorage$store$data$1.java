package io.ktor.client.plugins.cache.storage;

import io.ktor.client.plugins.cache.HttpCacheEntry;
import io.ktor.util.collections.ConcurrentSetKt;
import java.util.Set;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UnlimitedCacheStorage$store$data$1 extends f0 implements a {
    public static final UnlimitedCacheStorage$store$data$1 INSTANCE = new UnlimitedCacheStorage$store$data$1();

    public UnlimitedCacheStorage$store$data$1() {
        super(0);
    }

    @Override // kv.a
    public final Set<HttpCacheEntry> invoke() {
        return ConcurrentSetKt.ConcurrentSet();
    }
}
