package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kv.l;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class StreamingJsonDecoderKt {
    @JsonFriendModuleApi
    public static final <T> JsonElement decodeStringToJsonTree(Json json, DeserializationStrategy<? extends T> deserializer, String source) {
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(deserializer, "deserializer");
        e0.checkNotNullParameter(source, "source");
        StringJsonLexer StringJsonLexer = StringJsonLexerKt.StringJsonLexer(json, source);
        JsonElement jsonElementDecodeJsonElement = new StreamingJsonDecoder(json, WriteMode.OBJ, StringJsonLexer, deserializer.getDescriptor(), null).decodeJsonElement();
        StringJsonLexer.expectEof();
        return jsonElementDecodeJsonElement;
    }

    private static final <T> T parseString(AbstractJsonLexer abstractJsonLexer, String str, l lVar) {
        String strConsumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            return (T) lVar.invoke(strConsumeStringLenient);
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type '" + str + "' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new k();
        }
    }
}
