package kotlinx.serialization.json.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CreateMapForCacheKt {
    public static final <K, V> Map<K, V> createMapForCache(int i10) {
        return new ConcurrentHashMap(i10);
    }
}
