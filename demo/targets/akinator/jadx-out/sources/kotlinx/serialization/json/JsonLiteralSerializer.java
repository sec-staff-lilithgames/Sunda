package kotlinx.serialization.json;

import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonExceptionsKt;
import sv.i0;
import sv.j0;
import sv.n0;
import sv.r0;
import tu.o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonLiteralSerializer implements KSerializer<JsonLiteral> {
    public static final JsonLiteralSerializer INSTANCE = new JsonLiteralSerializer();
    private static final SerialDescriptor descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor("kotlinx.serialization.json.JsonLiteral", PrimitiveKind.STRING.INSTANCE);

    private JsonLiteralSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public JsonLiteral deserialize(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        JsonElement jsonElementDecodeJsonElement = JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
        if (jsonElementDecodeJsonElement instanceof JsonLiteral) {
            return (JsonLiteral) jsonElementDecodeJsonElement;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected JSON element, expected JsonLiteral, had " + c1.getOrCreateKotlinClass(jsonElementDecodeJsonElement.getClass()), jsonElementDecodeJsonElement.toString());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, JsonLiteral value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        JsonElementSerializersKt.verify(encoder);
        if (value.isString()) {
            encoder.encodeString(value.getContent());
            return;
        }
        if (value.getCoerceToInlineType$kotlinx_serialization_json() != null) {
            encoder.encodeInline(value.getCoerceToInlineType$kotlinx_serialization_json()).encodeString(value.getContent());
            return;
        }
        Long longOrNull = j0.toLongOrNull(value.getContent());
        if (longOrNull != null) {
            encoder.encodeLong(longOrNull.longValue());
            return;
        }
        o0 uLongOrNull = r0.toULongOrNull(value.getContent());
        if (uLongOrNull != null) {
            encoder.encodeInline(BuiltinSerializersKt.serializer(o0.f87397c).getDescriptor()).encodeLong(uLongOrNull.m7086unboximpl());
            return;
        }
        Double doubleOrNull = i0.toDoubleOrNull(value.getContent());
        if (doubleOrNull != null) {
            encoder.encodeDouble(doubleOrNull.doubleValue());
            return;
        }
        Boolean booleanStrictOrNull = n0.toBooleanStrictOrNull(value.getContent());
        if (booleanStrictOrNull != null) {
            encoder.encodeBoolean(booleanStrictOrNull.booleanValue());
        } else {
            encoder.encodeString(value.getContent());
        }
    }
}
