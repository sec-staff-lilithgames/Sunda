package kotlinx.serialization.json;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class JsonTransformingSerializer<T> implements KSerializer<T> {
    private final KSerializer<T> tSerializer;

    public JsonTransformingSerializer(KSerializer<T> tSerializer) {
        e0.checkNotNullParameter(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        JsonDecoder jsonDecoderAsJsonDecoder = JsonElementSerializersKt.asJsonDecoder(decoder);
        return (T) jsonDecoderAsJsonDecoder.getJson().decodeFromJsonElement(this.tSerializer, transformDeserialize(jsonDecoderAsJsonDecoder.decodeJsonElement()));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, T value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        JsonEncoder jsonEncoderAsJsonEncoder = JsonElementSerializersKt.asJsonEncoder(encoder);
        jsonEncoderAsJsonEncoder.encodeJsonElement(transformSerialize(TreeJsonEncoderKt.writeJson(jsonEncoderAsJsonEncoder.getJson(), value, this.tSerializer)));
    }

    public JsonElement transformDeserialize(JsonElement element) {
        e0.checkNotNullParameter(element, "element");
        return element;
    }

    public JsonElement transformSerialize(JsonElement element) {
        e0.checkNotNullParameter(element, "element");
        return element;
    }
}
