package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class StringSerializer implements KSerializer<String> {
    public static final StringSerializer INSTANCE = new StringSerializer();
    private static final SerialDescriptor descriptor = new PrimitiveSerialDescriptor("kotlin.String", PrimitiveKind.STRING.INSTANCE);

    private StringSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public String deserialize(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        return decoder.decodeString();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, String value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        encoder.encodeString(value);
    }
}
