package io.ktor.util;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CacheKt {
    private static final int CACHE_INITIAL_CAPACITY = 10;
    private static final float CACHE_LOAD_FACTOR = 0.75f;

    @InternalAPI
    public static final <K, V> Map<K, V> createLRUCache(l supplier, l close, int i10) {
        e0.checkNotNullParameter(supplier, "supplier");
        e0.checkNotNullParameter(close, "close");
        Map<K, V> mapSynchronizedMap = Collections.synchronizedMap(new LRUCache(supplier, close, i10));
        e0.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(LRUCache…upplier, close, maxSize))");
        return mapSynchronizedMap;
    }
}
