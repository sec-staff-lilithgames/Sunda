package kotlinx.serialization.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class HashMapSerializer<K, V> extends MapLikeSerializer<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    private final SerialDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashMapSerializer(KSerializer<K> kSerializer, KSerializer<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        e0.checkNotNullParameter(kSerializer, "kSerializer");
        e0.checkNotNullParameter(vSerializer, "vSerializer");
        this.descriptor = new HashMapClassDesc(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(HashMap<K, V> map, int i10) {
        e0.checkNotNullParameter(map, "<this>");
    }

    @Override // kotlinx.serialization.internal.MapLikeSerializer, kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.MapLikeSerializer
    public /* bridge */ /* synthetic */ void insertKeyValuePair(Map map, int i10, Object obj, Object obj2) {
        insertKeyValuePair((HashMap<int, Object>) map, i10, (int) obj, obj2);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Map<K, V> toResult(HashMap<K, V> map) {
        e0.checkNotNullParameter(map, "<this>");
        return map;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public HashMap<K, V> builder() {
        return new HashMap<>();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(HashMap<K, V> map) {
        e0.checkNotNullParameter(map, "<this>");
        return map.size() * 2;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Iterator<Map.Entry<K, V>> collectionIterator(Map<K, ? extends V> map) {
        e0.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(Map<K, ? extends V> map) {
        e0.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    public void insertKeyValuePair(HashMap<K, V> map, int i10, K k10, V v10) {
        e0.checkNotNullParameter(map, "<this>");
        map.put(k10, v10);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public HashMap<K, V> toBuilder(Map<K, ? extends V> map) {
        e0.checkNotNullParameter(map, "<this>");
        HashMap<K, V> map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap<>(map) : map2;
    }
}
