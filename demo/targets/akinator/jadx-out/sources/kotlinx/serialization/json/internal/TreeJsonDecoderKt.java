package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class TreeJsonDecoderKt {
    @JsonFriendModuleApi
    public static final <T> T readJson(Json json, JsonElement element, DeserializationStrategy<? extends T> deserializer) {
        Decoder jsonPrimitiveDecoder;
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(element, "element");
        e0.checkNotNullParameter(deserializer, "deserializer");
        if (element instanceof JsonObject) {
            jsonPrimitiveDecoder = new JsonTreeDecoder(json, (JsonObject) element, null, null, 12, null);
        } else if (element instanceof JsonArray) {
            jsonPrimitiveDecoder = new JsonTreeListDecoder(json, (JsonArray) element);
        } else {
            if (!(element instanceof JsonLiteral) && !e0.areEqual(element, JsonNull.INSTANCE)) {
                throw new t();
            }
            jsonPrimitiveDecoder = new JsonPrimitiveDecoder(json, (JsonPrimitive) element, null, 4, null);
        }
        return (T) jsonPrimitiveDecoder.decodeSerializableValue(deserializer);
    }

    public static final <T> T readPolymorphicJson(Json json, String discriminator, JsonObject element, DeserializationStrategy<? extends T> deserializer) {
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(discriminator, "discriminator");
        e0.checkNotNullParameter(element, "element");
        e0.checkNotNullParameter(deserializer, "deserializer");
        return (T) new JsonTreeDecoder(json, element, discriminator, deserializer.getDescriptor()).decodeSerializableValue(deserializer);
    }
}
