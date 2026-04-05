package kotlinx.serialization.json;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface JsonDecoder extends Decoder, CompositeDecoder {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static int decodeCollectionSize(JsonDecoder jsonDecoder, SerialDescriptor descriptor) {
            e0.checkNotNullParameter(descriptor, "descriptor");
            return CompositeDecoder.DefaultImpls.decodeCollectionSize(jsonDecoder, descriptor);
        }

        @ExperimentalSerializationApi
        public static <T> T decodeNullableSerializableValue(JsonDecoder jsonDecoder, DeserializationStrategy<? extends T> deserializer) {
            e0.checkNotNullParameter(deserializer, "deserializer");
            return (T) Decoder.DefaultImpls.decodeNullableSerializableValue(jsonDecoder, deserializer);
        }

        @ExperimentalSerializationApi
        public static boolean decodeSequentially(JsonDecoder jsonDecoder) {
            return CompositeDecoder.DefaultImpls.decodeSequentially(jsonDecoder);
        }

        public static <T> T decodeSerializableValue(JsonDecoder jsonDecoder, DeserializationStrategy<? extends T> deserializer) {
            e0.checkNotNullParameter(deserializer, "deserializer");
            return (T) Decoder.DefaultImpls.decodeSerializableValue(jsonDecoder, deserializer);
        }
    }

    JsonElement decodeJsonElement();

    Json getJson();
}
