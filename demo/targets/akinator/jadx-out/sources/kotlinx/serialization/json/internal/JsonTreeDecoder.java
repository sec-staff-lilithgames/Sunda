package kotlinx.serialization.json.internal;

import j1.o2;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import uu.c2;
import uu.d2;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
class JsonTreeDecoder extends AbstractJsonTreeDecoder {
    private boolean forceNull;
    private final SerialDescriptor polyDescriptor;
    private int position;
    private final JsonObject value;

    public /* synthetic */ JsonTreeDecoder(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i10, u uVar) {
        this(json, jsonObject, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : serialDescriptor);
    }

    private final boolean absenceIsNull(SerialDescriptor serialDescriptor, int i10) {
        boolean z10 = (getJson().getConfiguration().getExplicitNulls() || serialDescriptor.isElementOptional(i10) || !serialDescriptor.getElementDescriptor(i10).isNullable()) ? false : true;
        this.forceNull = z10;
        return z10;
    }

    private final boolean coerceInputValue(SerialDescriptor serialDescriptor, int i10, String str) {
        Json json = getJson();
        boolean zIsElementOptional = serialDescriptor.isElementOptional(i10);
        SerialDescriptor elementDescriptor = serialDescriptor.getElementDescriptor(i10);
        if (zIsElementOptional && !elementDescriptor.isNullable() && (currentElement(str) instanceof JsonNull)) {
            return true;
        }
        if (!e0.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || (elementDescriptor.isNullable() && (currentElement(str) instanceof JsonNull))) {
            return false;
        }
        JsonElement jsonElementCurrentElement = currentElement(str);
        JsonPrimitive jsonPrimitive = jsonElementCurrentElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElementCurrentElement : null;
        String contentOrNull = jsonPrimitive != null ? JsonElementKt.getContentOrNull(jsonPrimitive) : null;
        if (contentOrNull == null) {
            return false;
        }
        return JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, contentOrNull) == -3 && (zIsElementOptional || (!json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable()));
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor != this.polyDescriptor) {
            return super.beginStructure(descriptor);
        }
        Json json = getJson();
        JsonElement jsonElementCurrentObject = currentObject();
        String serialName = this.polyDescriptor.getSerialName();
        if (jsonElementCurrentObject instanceof JsonObject) {
            return new JsonTreeDecoder(json, (JsonObject) jsonElementCurrentObject, getPolymorphicDiscriminator(), this.polyDescriptor);
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        o2.y(JsonObject.class, sb2, ", but had ", jsonElementCurrentObject, " as the serialized body of ");
        sb2.append(serialName);
        sb2.append(" at element: ");
        sb2.append(renderTagStack());
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementCurrentObject.toString());
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonElement currentElement(String tag) {
        e0.checkNotNullParameter(tag, "tag");
        return (JsonElement) p1.getValue(getValue(), tag);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        while (this.position < descriptor.getElementsCount()) {
            int i10 = this.position;
            this.position = i10 + 1;
            String tag = getTag(descriptor, i10);
            int i11 = this.position - 1;
            this.forceNull = false;
            if (getValue().containsKey((Object) tag) || absenceIsNull(descriptor, i11)) {
                if (!this.configuration.getCoerceInputValues() || !coerceInputValue(descriptor, i11, tag)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !this.forceNull && super.decodeNotNullMark();
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public String elementName(SerialDescriptor descriptor, int i10) {
        Object next;
        e0.checkNotNullParameter(descriptor, "descriptor");
        JsonNamingStrategy jsonNamingStrategyNamingStrategy = JsonNamesMapKt.namingStrategy(descriptor, getJson());
        String elementName = descriptor.getElementName(i10);
        if (jsonNamingStrategyNamingStrategy != null || (this.configuration.getUseAlternativeNames() && !getValue().keySet().contains(elementName))) {
            Map<String, Integer> mapDeserializationNamesMap = JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor);
            Iterator<T> it = getValue().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = mapDeserializationNamesMap.get((String) next);
                if (num != null && num.intValue() == i10) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
            String strSerialNameForJson = jsonNamingStrategyNamingStrategy != null ? jsonNamingStrategyNamingStrategy.serialNameForJson(descriptor, i10, elementName) : null;
            if (strSerialNameForJson != null) {
                return strSerialNameForJson;
            }
        }
        return elementName;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Set<String> setPlus;
        e0.checkNotNullParameter(descriptor, "descriptor");
        if (this.configuration.getIgnoreUnknownKeys() || (descriptor.getKind() instanceof PolymorphicKind)) {
            return;
        }
        JsonNamingStrategy jsonNamingStrategyNamingStrategy = JsonNamesMapKt.namingStrategy(descriptor, getJson());
        if (jsonNamingStrategyNamingStrategy == null && !this.configuration.getUseAlternativeNames()) {
            setPlus = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
        } else if (jsonNamingStrategyNamingStrategy != null) {
            setPlus = JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor).keySet();
        } else {
            Set<String> setJsonCachedSerialNames = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
            Map map = (Map) JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, JsonNamesMapKt.getJsonDeserializationNamesKey());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = c2.emptySet();
            }
            setPlus = d2.plus((Set) setJsonCachedSerialNames, (Iterable) setKeySet);
        }
        for (String str : getValue().keySet()) {
            if (!setPlus.contains(str) && !e0.areEqual(str, getPolymorphicDiscriminator())) {
                throw JsonExceptionsKt.UnknownKeyException(str, getValue().toString());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeDecoder(Json json, JsonObject value, String str, SerialDescriptor serialDescriptor) {
        super(json, value, str, null);
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(value, "value");
        this.value = value;
        this.polyDescriptor = serialDescriptor;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonObject getValue() {
        return this.value;
    }
}
