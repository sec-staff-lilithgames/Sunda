package kotlinx.serialization;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface KSerializer<T> extends SerializationStrategy<T>, DeserializationStrategy<T> {
    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    SerialDescriptor getDescriptor();
}
