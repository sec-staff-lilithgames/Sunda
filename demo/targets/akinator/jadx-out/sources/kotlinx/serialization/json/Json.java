package kotlinx.serialization.json;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KType;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToStringWriter;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringJsonLexerKt;
import kotlinx.serialization.json.internal.TreeJsonDecoderKt;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class Json implements StringFormat {
    public static final Default Default = new Default(null);
    private final DescriptorSchemaCache _schemaCache;
    private final JsonConfiguration configuration;
    private final SerializersModule serializersModule;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Default extends Json {
        public /* synthetic */ Default(u uVar) {
            this();
        }

        private Default() {
            super(new JsonConfiguration(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), SerializersModuleBuildersKt.EmptySerializersModule(), null);
        }
    }

    public /* synthetic */ Json(JsonConfiguration jsonConfiguration, SerializersModule serializersModule, u uVar) {
        this(jsonConfiguration, serializersModule);
    }

    public final <T> T decodeFromJsonElement(DeserializationStrategy<? extends T> deserializer, JsonElement element) {
        e0.checkNotNullParameter(deserializer, "deserializer");
        e0.checkNotNullParameter(element, "element");
        return (T) TreeJsonDecoderKt.readJson(this, element, deserializer);
    }

    public final /* synthetic */ <T> T decodeFromString(String string) {
        e0.checkNotNullParameter(string, "string");
        SerializersModule serializersModule = getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromString(SerializersKt.serializer(serializersModule, (KType) null), string);
    }

    public final <T> JsonElement encodeToJsonElement(SerializationStrategy<? super T> serializer, T t10) {
        e0.checkNotNullParameter(serializer, "serializer");
        return TreeJsonEncoderKt.writeJson(this, t10, serializer);
    }

    @Override // kotlinx.serialization.StringFormat
    public final <T> String encodeToString(SerializationStrategy<? super T> serializer, T t10) {
        e0.checkNotNullParameter(serializer, "serializer");
        JsonToStringWriter jsonToStringWriter = new JsonToStringWriter();
        try {
            JsonStreamsKt.encodeByWriter(this, jsonToStringWriter, serializer, t10);
            return jsonToStringWriter.toString();
        } finally {
            jsonToStringWriter.release();
        }
    }

    public final JsonConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // kotlinx.serialization.SerialFormat
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    public final DescriptorSchemaCache get_schemaCache$kotlinx_serialization_json() {
        return this._schemaCache;
    }

    public final JsonElement parseToJsonElement(String string) {
        e0.checkNotNullParameter(string, "string");
        return (JsonElement) decodeFromString(JsonElementSerializer.INSTANCE, string);
    }

    private Json(JsonConfiguration jsonConfiguration, SerializersModule serializersModule) {
        this.configuration = jsonConfiguration;
        this.serializersModule = serializersModule;
        this._schemaCache = new DescriptorSchemaCache();
    }

    @Override // kotlinx.serialization.StringFormat
    public final <T> T decodeFromString(DeserializationStrategy<? extends T> deserializer, String string) {
        e0.checkNotNullParameter(deserializer, "deserializer");
        e0.checkNotNullParameter(string, "string");
        StringJsonLexer StringJsonLexer = StringJsonLexerKt.StringJsonLexer(this, string);
        T t10 = (T) new StreamingJsonDecoder(this, WriteMode.OBJ, StringJsonLexer, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
        StringJsonLexer.expectEof();
        return t10;
    }

    @f
    public static /* synthetic */ void get_schemaCache$kotlinx_serialization_json$annotations() {
    }
}
