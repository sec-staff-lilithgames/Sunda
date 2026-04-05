package kotlinx.serialization.json.internal;

import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DescriptorSchemaCache {
    private final Map<SerialDescriptor, Map<Key<Object>, Object>> map = CreateMapForCacheKt.createMapForCache(16);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Key<T> {
    }

    public final <T> T getOrPut(SerialDescriptor descriptor, Key<T> key, kv.a defaultValue) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(defaultValue, "defaultValue");
        T t10 = (T) get(descriptor, key);
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) defaultValue.invoke();
        set(descriptor, key, t11);
        return t11;
    }

    public final <T> void set(SerialDescriptor descriptor, Key<T> key, T value) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        Map<SerialDescriptor, Map<Key<Object>, Object>> map = this.map;
        Map<Key<Object>, Object> mapCreateMapForCache = map.get(descriptor);
        if (mapCreateMapForCache == null) {
            mapCreateMapForCache = CreateMapForCacheKt.createMapForCache(2);
            map.put(descriptor, mapCreateMapForCache);
        }
        mapCreateMapForCache.put(key, value);
    }

    public final <T> T get(SerialDescriptor serialDescriptor, Key<T> key) {
        e0.checkNotNullParameter(serialDescriptor, QGjYBESwAiCc.uunsHUXC);
        e0.checkNotNullParameter(key, "key");
        Map<Key<Object>, Object> map = this.map.get(serialDescriptor);
        T t10 = map != null ? (T) map.get(key) : null;
        if (t10 == null) {
            return null;
        }
        return t10;
    }
}
