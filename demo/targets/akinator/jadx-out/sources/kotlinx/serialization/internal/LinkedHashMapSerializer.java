package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class LinkedHashMapSerializer<K, V> extends MapLikeSerializer<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    private final SerialDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedHashMapSerializer(KSerializer<K> kSerializer, KSerializer<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        e0.checkNotNullParameter(kSerializer, "kSerializer");
        e0.checkNotNullParameter(vSerializer, "vSerializer");
        this.descriptor = new LinkedHashMapClassDesc(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(LinkedHashMap<K, V> linkedHashMap, int i10) {
        e0.checkNotNullParameter(linkedHashMap, "<this>");
    }

    @Override // kotlinx.serialization.internal.MapLikeSerializer, kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.MapLikeSerializer
    public /* bridge */ /* synthetic */ void insertKeyValuePair(Map map, int i10, Object obj, Object obj2) {
        insertKeyValuePair((LinkedHashMap<int, Object>) map, i10, (int) obj, obj2);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Map<K, V> toResult(LinkedHashMap<K, V> linkedHashMap) {
        e0.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public LinkedHashMap<K, V> builder() {
        return new LinkedHashMap<>();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(LinkedHashMap<K, V> linkedHashMap) {
        e0.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
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

    public void insertKeyValuePair(LinkedHashMap<K, V> linkedHashMap, int i10, K k10, V v10) {
        e0.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put(k10, v10);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public LinkedHashMap<K, V> toBuilder(Map<K, ? extends V> map) {
        e0.checkNotNullParameter(map, "<this>");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }
}
