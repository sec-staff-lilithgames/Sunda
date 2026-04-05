package kotlinx.serialization.json;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface JsonEncoder extends Encoder, CompositeEncoder {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static CompositeEncoder beginCollection(JsonEncoder jsonEncoder, SerialDescriptor descriptor, int i10) {
            e0.checkNotNullParameter(descriptor, "descriptor");
            return Encoder.DefaultImpls.beginCollection(jsonEncoder, descriptor, i10);
        }

        @ExperimentalSerializationApi
        public static void encodeNotNullMark(JsonEncoder jsonEncoder) {
            Encoder.DefaultImpls.encodeNotNullMark(jsonEncoder);
        }

        @ExperimentalSerializationApi
        public static <T> void encodeNullableSerializableValue(JsonEncoder jsonEncoder, SerializationStrategy<? super T> serializer, T t10) {
            e0.checkNotNullParameter(serializer, "serializer");
            Encoder.DefaultImpls.encodeNullableSerializableValue(jsonEncoder, serializer, t10);
        }

        public static <T> void encodeSerializableValue(JsonEncoder jsonEncoder, SerializationStrategy<? super T> serializer, T t10) {
            e0.checkNotNullParameter(serializer, "serializer");
            Encoder.DefaultImpls.encodeSerializableValue(jsonEncoder, serializer, t10);
        }

        @ExperimentalSerializationApi
        public static boolean shouldEncodeElementDefault(JsonEncoder jsonEncoder, SerialDescriptor descriptor, int i10) {
            e0.checkNotNullParameter(descriptor, "descriptor");
            return CompositeEncoder.DefaultImpls.shouldEncodeElementDefault(jsonEncoder, descriptor, i10);
        }
    }

    void encodeJsonElement(JsonElement jsonElement);

    Json getJson();
}
