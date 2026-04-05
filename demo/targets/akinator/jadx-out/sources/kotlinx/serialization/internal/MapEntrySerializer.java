package kotlinx.serialization.internal;

import com.ironsource.C3191e4;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class MapEntrySerializer<K, V> extends KeyValueSerializer<K, V, Map.Entry<? extends K, ? extends V>> {
    private final SerialDescriptor descriptor;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MapEntry<K, V> implements Map.Entry<K, V>, lv.a {
        private final K key;
        private final V value;

        public MapEntry(K k10, V v10) {
            this.key = k10;
            this.value = v10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MapEntry copy$default(MapEntry mapEntry, Object obj, Object obj2, int i10, Object obj3) {
            if ((i10 & 1) != 0) {
                obj = mapEntry.key;
            }
            if ((i10 & 2) != 0) {
                obj2 = mapEntry.value;
            }
            return mapEntry.copy(obj, obj2);
        }

        public final K component1() {
            return this.key;
        }

        public final V component2() {
            return this.value;
        }

        public final MapEntry<K, V> copy(K k10, V v10) {
            return new MapEntry<>(k10, v10);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MapEntry)) {
                return false;
            }
            MapEntry mapEntry = (MapEntry) obj;
            return e0.areEqual(this.key, mapEntry.key) && e0.areEqual(this.value, mapEntry.value);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.key;
            int iHashCode = (k10 == null ? 0 : k10.hashCode()) * 31;
            V v10 = this.value;
            return iHashCode + (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.key + ", value=" + this.value + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        e0.checkNotNullParameter(keySerializer, "keySerializer");
        e0.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.descriptor = SerialDescriptorsKt.buildSerialDescriptor("kotlin.collections.Map.Entry", StructureKind.MAP.INSTANCE, new SerialDescriptor[0], new a(keySerializer, valueSerializer, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 descriptor$lambda$0(KSerializer kSerializer, KSerializer kSerializer2, ClassSerialDescriptorBuilder buildSerialDescriptor) {
        e0.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, C3191e4.h.W, kSerializer.getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "value", kSerializer2.getDescriptor(), null, false, 12, null);
        return x0.f87415a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public /* bridge */ /* synthetic */ Object toResult(Object obj, Object obj2) {
        return toResult((MapEntrySerializer<K, V>) obj, obj2);
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public K getKey(Map.Entry<? extends K, ? extends V> entry) {
        e0.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public V getValue(Map.Entry<? extends K, ? extends V> entry) {
        e0.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public Map.Entry<K, V> toResult(K k10, V v10) {
        return new MapEntry(k10, v10);
    }
}
