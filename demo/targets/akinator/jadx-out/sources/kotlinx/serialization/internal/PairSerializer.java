package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import tu.v;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PairSerializer<K, V> extends KeyValueSerializer<K, V, v> {
    private final SerialDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairSerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        e0.checkNotNullParameter(keySerializer, "keySerializer");
        e0.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Pair", new SerialDescriptor[0], new a(keySerializer, valueSerializer, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 descriptor$lambda$0(KSerializer kSerializer, KSerializer kSerializer2, ClassSerialDescriptorBuilder buildClassSerialDescriptor) {
        e0.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "first", kSerializer.getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(buildClassSerialDescriptor, "second", kSerializer2.getDescriptor(), null, false, 12, null);
        return x0.f87415a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public /* bridge */ /* synthetic */ v toResult(Object obj, Object obj2) {
        return toResult2((PairSerializer<K, V>) obj, obj2);
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public K getKey(v vVar) {
        e0.checkNotNullParameter(vVar, "<this>");
        return (K) vVar.getFirst();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public V getValue(v vVar) {
        e0.checkNotNullParameter(vVar, "<this>");
        return (V) vVar.getSecond();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    /* renamed from: toResult, reason: avoid collision after fix types in other method */
    public v toResult2(K k10, V v10) {
        return tu.e0.to(k10, v10);
    }
}
