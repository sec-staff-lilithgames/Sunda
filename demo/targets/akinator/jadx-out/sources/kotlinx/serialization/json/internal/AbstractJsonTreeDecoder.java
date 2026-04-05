package kotlinx.serialization.json.internal;

import a.b;
import com.google.android.gms.ads.RequestConfiguration;
import e3.g;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;
import kv.l;
import sv.k0;
import sv.p0;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
abstract class AbstractJsonTreeDecoder extends NamedValueDecoder implements JsonDecoder {
    protected final JsonConfiguration configuration;
    private final Json json;
    private final String polymorphicDiscriminator;
    private final JsonElement value;

    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str, u uVar) {
        this(json, jsonElement, str);
    }

    private final Void unparsedPrimitive(JsonPrimitive jsonPrimitive, String str, String str2) {
        throw JsonExceptionsKt.JsonDecodingException(-1, "Failed to parse literal '" + jsonPrimitive + "' as " + b.k(k0.startsWith$default(str, "i", false, 2, null) ? "an " : "a ", str) + " value at element: " + renderTagStack(str2), currentObject().toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        JsonElement jsonElementCurrentObject = currentObject();
        SerialKind kind = descriptor.getKind();
        if (e0.areEqual(kind, StructureKind.LIST.INSTANCE) || (kind instanceof PolymorphicKind)) {
            Json json = getJson();
            String serialName = descriptor.getSerialName();
            if (jsonElementCurrentObject instanceof JsonArray) {
                return new JsonTreeListDecoder(json, (JsonArray) jsonElementCurrentObject);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            o2.y(JsonArray.class, sb2, ", but had ", jsonElementCurrentObject, " as the serialized body of ");
            sb2.append(serialName);
            sb2.append(" at element: ");
            sb2.append(renderTagStack());
            throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentObject.toString());
        }
        if (!e0.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            Json json2 = getJson();
            String serialName2 = descriptor.getSerialName();
            if (jsonElementCurrentObject instanceof JsonObject) {
                return new JsonTreeDecoder(json2, (JsonObject) jsonElementCurrentObject, this.polymorphicDiscriminator, null, 8, null);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            o2.y(JsonObject.class, sb3, ", but had ", jsonElementCurrentObject, " as the serialized body of ");
            sb3.append(serialName2);
            sb3.append(" at element: ");
            sb3.append(renderTagStack());
            throw JsonExceptionsKt.JsonDecodingException(-1, sb3.toString(), jsonElementCurrentObject.toString());
        }
        Json json3 = getJson();
        SerialDescriptor serialDescriptorCarrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json3.getSerializersModule());
        SerialKind kind2 = serialDescriptorCarrierDescriptor.getKind();
        if ((kind2 instanceof PrimitiveKind) || e0.areEqual(kind2, SerialKind.ENUM.INSTANCE)) {
            Json json4 = getJson();
            String serialName3 = descriptor.getSerialName();
            if (jsonElementCurrentObject instanceof JsonObject) {
                return new JsonTreeMapDecoder(json4, (JsonObject) jsonElementCurrentObject);
            }
            StringBuilder sb4 = new StringBuilder("Expected ");
            o2.y(JsonObject.class, sb4, ", but had ", jsonElementCurrentObject, " as the serialized body of ");
            sb4.append(serialName3);
            sb4.append(" at element: ");
            sb4.append(renderTagStack());
            throw JsonExceptionsKt.JsonDecodingException(-1, sb4.toString(), jsonElementCurrentObject.toString());
        }
        if (!json3.getConfiguration().getAllowStructuredMapKeys()) {
            throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
        }
        Json json5 = getJson();
        String serialName4 = descriptor.getSerialName();
        if (jsonElementCurrentObject instanceof JsonArray) {
            return new JsonTreeListDecoder(json5, (JsonArray) jsonElementCurrentObject);
        }
        StringBuilder sb5 = new StringBuilder("Expected ");
        o2.y(JsonArray.class, sb5, ", but had ", jsonElementCurrentObject, " as the serialized body of ");
        sb5.append(serialName4);
        sb5.append(" at element: ");
        sb5.append(renderTagStack());
        throw JsonExceptionsKt.JsonDecodingException(-1, sb5.toString(), jsonElementCurrentObject.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T extends JsonElement> T cast(JsonElement value, SerialDescriptor descriptor) {
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(descriptor, "descriptor");
        String serialName = descriptor.getSerialName();
        e0.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        if (value != 0) {
            return value;
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        o2.y(JsonElement.class, sb2, ", but had ", value, " as the serialized body of ");
        sb2.append(serialName);
        sb2.append(" at element: ");
        sb2.append(renderTagStack());
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), value.toString());
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public String composeName(String parentName, String childName) {
        e0.checkNotNullParameter(parentName, "parentName");
        e0.checkNotNullParameter(childName, "childName");
        return childName;
    }

    public abstract JsonElement currentElement(String str);

    public final JsonElement currentObject() {
        JsonElement jsonElementCurrentElement;
        String currentTagOrNull = getCurrentTagOrNull();
        return (currentTagOrNull == null || (jsonElementCurrentElement = currentElement(currentTagOrNull)) == null) ? getValue() : jsonElementCurrentElement;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        return getCurrentTagOrNull() != null ? super.decodeInline(descriptor) : new JsonPrimitiveDecoder(getJson(), getValue(), this.polymorphicDiscriminator).decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public JsonElement decodeJsonElement() {
        return currentObject();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(currentObject() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(DeserializationStrategy<? extends T> deserializer) {
        JsonPrimitive jsonPrimitive;
        e0.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractPolymorphicSerializer) || getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializer.deserialize(this);
        }
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) deserializer;
        String strClassDiscriminator = PolymorphicKt.classDiscriminator(abstractPolymorphicSerializer.getDescriptor(), getJson());
        JsonElement jsonElementDecodeJsonElement = decodeJsonElement();
        String serialName = abstractPolymorphicSerializer.getDescriptor().getSerialName();
        if (!(jsonElementDecodeJsonElement instanceof JsonObject)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            o2.y(JsonObject.class, sb2, ", but had ", jsonElementDecodeJsonElement, " as the serialized body of ");
            sb2.append(serialName);
            sb2.append(" at element: ");
            sb2.append(renderTagStack());
            throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementDecodeJsonElement.toString());
        }
        JsonObject jsonObject = (JsonObject) jsonElementDecodeJsonElement;
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) strClassDiscriminator);
        try {
            DeserializationStrategy deserializationStrategyFindPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer) deserializer, this, (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive));
            e0.checkNotNull(deserializationStrategyFindPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
            return (T) TreeJsonDecoderKt.readPolymorphicJson(getJson(), strClassDiscriminator, jsonObject, deserializationStrategyFindPolymorphicSerializer);
        } catch (SerializationException e10) {
            String message = e10.getMessage();
            e0.checkNotNull(message);
            throw JsonExceptionsKt.JsonDecodingException(-1, message, jsonObject.toString());
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public Void decodeTaggedNull(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        return null;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public Json getJson() {
        return this.json;
    }

    public final String getPolymorphicDiscriminator() {
        return this.polymorphicDiscriminator;
    }

    public final JsonPrimitive getPrimitiveValue(String tag, SerialDescriptor descriptor) {
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(descriptor, "descriptor");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        String serialName = descriptor.getSerialName();
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementCurrentElement;
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        o2.y(JsonPrimitive.class, sb2, ", but had ", jsonElementCurrentElement, " as the serialized body of ");
        sb2.append(serialName);
        sb2.append(" at element: ");
        sb2.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return getJson().getSerializersModule();
    }

    public JsonElement getValue() {
        return this.value;
    }

    public final String renderTagStack(String currentTag) {
        e0.checkNotNullParameter(currentTag, "currentTag");
        return renderTagStack() + '.' + currentTag;
    }

    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str, int i10, u uVar) {
        this(json, jsonElement, (i10 & 4) != 0 ? null : str, null);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public boolean decodeTaggedBoolean(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (!(jsonElementCurrentElement instanceof JsonPrimitive)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            o2.y(JsonPrimitive.class, sb2, ", but had ", jsonElementCurrentElement, " as the serialized body of boolean at element: ");
            sb2.append(renderTagStack(tag));
            throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentElement.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
        try {
            Boolean booleanOrNull = JsonElementKt.getBooleanOrNull(jsonPrimitive);
            if (booleanOrNull != null) {
                return booleanOrNull.booleanValue();
            }
            unparsedPrimitive(jsonPrimitive, "boolean", tag);
            throw new k();
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive(jsonPrimitive, "boolean", tag);
            throw new k();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public byte decodeTaggedByte(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (!(jsonElementCurrentElement instanceof JsonPrimitive)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            o2.y(JsonPrimitive.class, sb2, ", but had ", jsonElementCurrentElement, " as the serialized body of byte at element: ");
            sb2.append(renderTagStack(tag));
            throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentElement.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
        try {
            int i10 = JsonElementKt.getInt(jsonPrimitive);
            Byte bValueOf = (-128 > i10 || i10 > 127) ? null : Byte.valueOf((byte) i10);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            unparsedPrimitive(jsonPrimitive, "byte", tag);
            throw new k();
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive(jsonPrimitive, "byte", tag);
            throw new k();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public char decodeTaggedChar(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
            try {
                return p0.single(jsonPrimitive.getContent());
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "char", tag);
                throw new k();
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        o2.y(JsonPrimitive.class, sb2, ", but had ", jsonElementCurrentElement, " as the serialized body of char at element: ");
        sb2.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public double decodeTaggedDouble(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (!(jsonElementCurrentElement instanceof JsonPrimitive)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            o2.y(JsonPrimitive.class, sb2, ", but had ", jsonElementCurrentElement, " as the serialized body of double at element: ");
            sb2.append(renderTagStack(tag));
            throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentElement.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
        try {
            double d10 = JsonElementKt.getDouble(jsonPrimitive);
            if (getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                return d10;
            }
            if (Double.isInfinite(d10) || Double.isNaN(d10)) {
                throw JsonExceptionsKt.InvalidFloatingPointDecoded(Double.valueOf(d10), tag, currentObject().toString());
            }
            return d10;
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive(jsonPrimitive, "double", tag);
            throw new k();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedEnum(String tag, SerialDescriptor enumDescriptor) {
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Json json = getJson();
        JsonElement jsonElementCurrentElement = currentElement(tag);
        String serialName = enumDescriptor.getSerialName();
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            return JsonNamesMapKt.getJsonNameIndexOrThrow$default(enumDescriptor, json, ((JsonPrimitive) jsonElementCurrentElement).getContent(), null, 4, null);
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        o2.y(JsonPrimitive.class, sb2, ", but had ", jsonElementCurrentElement, " as the serialized body of ");
        sb2.append(serialName);
        sb2.append(" at element: ");
        sb2.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public float decodeTaggedFloat(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (!(jsonElementCurrentElement instanceof JsonPrimitive)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            o2.y(JsonPrimitive.class, sb2, ", but had ", jsonElementCurrentElement, " as the serialized body of float at element: ");
            sb2.append(renderTagStack(tag));
            throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentElement.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
        try {
            float f10 = JsonElementKt.getFloat(jsonPrimitive);
            if (getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                return f10;
            }
            if (Float.isInfinite(f10) || Float.isNaN(f10)) {
                throw JsonExceptionsKt.InvalidFloatingPointDecoded(Float.valueOf(f10), tag, currentObject().toString());
            }
            return f10;
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive(jsonPrimitive, "float", tag);
            throw new k();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public Decoder decodeTaggedInline(String tag, SerialDescriptor inlineDescriptor) {
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (!StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor)) {
            return super.decodeTaggedInline((AbstractJsonTreeDecoder) tag, inlineDescriptor);
        }
        Json json = getJson();
        JsonElement jsonElementCurrentElement = currentElement(tag);
        String serialName = inlineDescriptor.getSerialName();
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            return new JsonDecoderForUnsignedTypes(StringJsonLexerKt.StringJsonLexer(json, ((JsonPrimitive) jsonElementCurrentElement).getContent()), getJson());
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        o2.y(JsonPrimitive.class, sb2, ", but had ", jsonElementCurrentElement, " as the serialized body of ");
        sb2.append(serialName);
        sb2.append(" at element: ");
        sb2.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedInt(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
            try {
                return JsonElementKt.getInt(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "int", tag);
                throw new k();
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        o2.y(JsonPrimitive.class, sb2, ", but had ", jsonElementCurrentElement, " as the serialized body of int at element: ");
        sb2.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public long decodeTaggedLong(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
            try {
                return JsonElementKt.getLong(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "long", tag);
                throw new k();
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        o2.y(JsonPrimitive.class, sb2, ", but had ", jsonElementCurrentElement, " as the serialized body of long at element: ");
        sb2.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public boolean decodeTaggedNotNullMark(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        return currentElement(tag) != JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public short decodeTaggedShort(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (!(jsonElementCurrentElement instanceof JsonPrimitive)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            o2.y(JsonPrimitive.class, sb2, ", but had ", jsonElementCurrentElement, " as the serialized body of short at element: ");
            sb2.append(renderTagStack(tag));
            throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentElement.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
        try {
            int i10 = JsonElementKt.getInt(jsonPrimitive);
            Short shValueOf = (-32768 > i10 || i10 > 32767) ? null : Short.valueOf((short) i10);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            unparsedPrimitive(jsonPrimitive, "short", tag);
            throw new k();
        } catch (IllegalArgumentException unused) {
            unparsedPrimitive(jsonPrimitive, "short", tag);
            throw new k();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public String decodeTaggedString(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        JsonElement jsonElementCurrentElement = currentElement(tag);
        if (!(jsonElementCurrentElement instanceof JsonPrimitive)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            o2.y(JsonPrimitive.class, sb2, ", but had ", jsonElementCurrentElement, " as the serialized body of string at element: ");
            sb2.append(renderTagStack(tag));
            throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentElement.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
        if (!(jsonPrimitive instanceof JsonLiteral)) {
            StringBuilder sbO = g.o("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbO.append(renderTagStack(tag));
            throw JsonExceptionsKt.JsonDecodingException(-1, sbO.toString(), currentObject().toString());
        }
        JsonLiteral jsonLiteral = (JsonLiteral) jsonPrimitive;
        if (jsonLiteral.isString() || getJson().getConfiguration().isLenient()) {
            return jsonLiteral.getContent();
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, o2.o(g.o("String literal for key '", tag, "' should be quoted at element: "), renderTagStack(tag), ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON."), currentObject().toString());
    }

    private AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str) {
        this.json = json;
        this.value = jsonElement;
        this.polymorphicDiscriminator = str;
        this.configuration = getJson().getConfiguration();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T extends JsonElement> T cast(JsonElement value, String serialName, String tag) {
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(tag, "tag");
        e0.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        if (value != 0) {
            return value;
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        o2.y(JsonElement.class, sb2, ", but had ", value, " as the serialized body of ");
        sb2.append(serialName);
        sb2.append(" at element: ");
        sb2.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), value.toString());
    }

    private final <T> T getPrimitiveValue(String str, String str2, l lVar) {
        JsonElement jsonElementCurrentElement = currentElement(str);
        if (jsonElementCurrentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementCurrentElement;
            try {
                T t10 = (T) lVar.invoke(jsonPrimitive);
                if (t10 != null) {
                    return t10;
                }
                unparsedPrimitive(jsonPrimitive, str2, str);
                throw new k();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, str2, str);
                throw new k();
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        o2.y(JsonPrimitive.class, sb2, ", but had ", jsonElementCurrentElement, " as the serialized body of ");
        sb2.append(str2);
        sb2.append(" at element: ");
        sb2.append(renderTagStack(str));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentElement.toString());
    }
}
