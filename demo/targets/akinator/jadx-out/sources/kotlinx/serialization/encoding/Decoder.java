package kotlinx.serialization.encoding;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface Decoder {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        @ExperimentalSerializationApi
        public static <T> T decodeNullableSerializableValue(Decoder decoder, DeserializationStrategy<? extends T> deserializer) {
            e0.checkNotNullParameter(deserializer, "deserializer");
            return (deserializer.getDescriptor().isNullable() || decoder.decodeNotNullMark()) ? (T) decoder.decodeSerializableValue(deserializer) : (T) decoder.decodeNull();
        }

        public static <T> T decodeSerializableValue(Decoder decoder, DeserializationStrategy<? extends T> deserializer) {
            e0.checkNotNullParameter(deserializer, "deserializer");
            return deserializer.deserialize(decoder);
        }
    }

    CompositeDecoder beginStructure(SerialDescriptor serialDescriptor);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(SerialDescriptor serialDescriptor);

    float decodeFloat();

    Decoder decodeInline(SerialDescriptor serialDescriptor);

    int decodeInt();

    long decodeLong();

    @ExperimentalSerializationApi
    boolean decodeNotNullMark();

    @ExperimentalSerializationApi
    Void decodeNull();

    @ExperimentalSerializationApi
    <T> T decodeNullableSerializableValue(DeserializationStrategy<? extends T> deserializationStrategy);

    <T> T decodeSerializableValue(DeserializationStrategy<? extends T> deserializationStrategy);

    short decodeShort();

    String decodeString();

    SerializersModule getSerializersModule();
}
