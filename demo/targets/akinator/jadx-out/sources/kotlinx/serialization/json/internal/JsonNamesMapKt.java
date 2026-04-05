package kotlinx.serialization.json.internal;

import androidx.lifecycle.x0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import kv.l;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonNamesMapKt {
    private static final DescriptorSchemaCache.Key<Map<String, Integer>> JsonDeserializationNamesKey = new DescriptorSchemaCache.Key<>();
    private static final DescriptorSchemaCache.Key<String[]> JsonSerializationNamesKey = new DescriptorSchemaCache.Key<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Integer> buildDeserializationNamesMap(SerialDescriptor serialDescriptor, Json json) {
        String strSerialNameForJson;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zDecodeCaseInsensitive = decodeCaseInsensitive(json, serialDescriptor);
        JsonNamingStrategy jsonNamingStrategyNamingStrategy = namingStrategy(serialDescriptor, json);
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            List<Annotation> elementAnnotations = serialDescriptor.getElementAnnotations(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : elementAnnotations) {
                if (obj instanceof JsonNames) {
                    arrayList.add(obj);
                }
            }
            JsonNames jsonNames = (JsonNames) y0.singleOrNull((List) arrayList);
            if (jsonNames != null && (strArrNames = jsonNames.names()) != null) {
                for (String lowerCase : strArrNames) {
                    if (zDecodeCaseInsensitive) {
                        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                        e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    }
                    buildDeserializationNamesMap$putOrThrow(linkedHashMap, serialDescriptor, lowerCase, i10);
                }
            }
            if (zDecodeCaseInsensitive) {
                strSerialNameForJson = serialDescriptor.getElementName(i10).toLowerCase(Locale.ROOT);
                e0.checkNotNullExpressionValue(strSerialNameForJson, "toLowerCase(...)");
            } else {
                strSerialNameForJson = jsonNamingStrategyNamingStrategy != null ? jsonNamingStrategyNamingStrategy.serialNameForJson(serialDescriptor, i10, serialDescriptor.getElementName(i10)) : null;
            }
            if (strSerialNameForJson != null) {
                buildDeserializationNamesMap$putOrThrow(linkedHashMap, serialDescriptor, strSerialNameForJson, i10);
            }
        }
        return linkedHashMap.isEmpty() ? p1.emptyMap() : linkedHashMap;
    }

    private static final void buildDeserializationNamesMap$putOrThrow(Map<String, Integer> map, SerialDescriptor serialDescriptor, String str, int i10) {
        String str2 = e0.areEqual(serialDescriptor.getKind(), SerialKind.ENUM.INSTANCE) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.getElementName(i10) + " is already one of the names for " + str2 + ' ' + serialDescriptor.getElementName(((Number) p1.getValue(map, str)).intValue()) + " in " + serialDescriptor);
    }

    private static final boolean decodeCaseInsensitive(Json json, SerialDescriptor serialDescriptor) {
        return json.getConfiguration().getDecodeEnumsCaseInsensitive() && e0.areEqual(serialDescriptor.getKind(), SerialKind.ENUM.INSTANCE);
    }

    public static final Map<String, Integer> deserializationNamesMap(Json json, SerialDescriptor descriptor) {
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(descriptor, "descriptor");
        return (Map) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(descriptor, JsonDeserializationNamesKey, new x0(14, descriptor, json));
    }

    public static final DescriptorSchemaCache.Key<Map<String, Integer>> getJsonDeserializationNamesKey() {
        return JsonDeserializationNamesKey;
    }

    public static final String getJsonElementName(SerialDescriptor serialDescriptor, Json json, int i10) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        e0.checkNotNullParameter(json, "json");
        JsonNamingStrategy jsonNamingStrategyNamingStrategy = namingStrategy(serialDescriptor, json);
        return jsonNamingStrategyNamingStrategy == null ? serialDescriptor.getElementName(i10) : serializationNamesIndices(serialDescriptor, json, jsonNamingStrategyNamingStrategy)[i10];
    }

    public static final int getJsonNameIndex(SerialDescriptor serialDescriptor, Json json, String name) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(name, "name");
        if (decodeCaseInsensitive(json, serialDescriptor)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return getJsonNameIndexSlowPath(serialDescriptor, json, lowerCase);
        }
        if (namingStrategy(serialDescriptor, json) != null) {
            return getJsonNameIndexSlowPath(serialDescriptor, json, name);
        }
        int elementIndex = serialDescriptor.getElementIndex(name);
        return (elementIndex == -3 && json.getConfiguration().getUseAlternativeNames()) ? getJsonNameIndexSlowPath(serialDescriptor, json, name) : elementIndex;
    }

    public static final int getJsonNameIndexOrThrow(SerialDescriptor serialDescriptor, Json json, String name, String suffix) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(suffix, "suffix");
        int jsonNameIndex = getJsonNameIndex(serialDescriptor, json, name);
        if (jsonNameIndex != -3) {
            return jsonNameIndex;
        }
        throw new SerializationException(serialDescriptor.getSerialName() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int getJsonNameIndexOrThrow$default(SerialDescriptor serialDescriptor, Json json, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return getJsonNameIndexOrThrow(serialDescriptor, json, str, str2);
    }

    private static final int getJsonNameIndexSlowPath(SerialDescriptor serialDescriptor, Json json, String str) {
        Integer num = deserializationNamesMap(json, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final DescriptorSchemaCache.Key<String[]> getJsonSerializationNamesKey() {
        return JsonSerializationNamesKey;
    }

    public static final JsonNamingStrategy namingStrategy(SerialDescriptor serialDescriptor, Json json) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        e0.checkNotNullParameter(json, "json");
        if (e0.areEqual(serialDescriptor.getKind(), StructureKind.CLASS.INSTANCE)) {
            return json.getConfiguration().getNamingStrategy();
        }
        return null;
    }

    public static final String[] serializationNamesIndices(SerialDescriptor serialDescriptor, Json json, JsonNamingStrategy strategy) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(strategy, "strategy");
        return (String[]) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(serialDescriptor, JsonSerializationNamesKey, new x0(15, serialDescriptor, strategy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] serializationNamesIndices$lambda$4(SerialDescriptor serialDescriptor, JsonNamingStrategy jsonNamingStrategy) {
        int elementsCount = serialDescriptor.getElementsCount();
        String[] strArr = new String[elementsCount];
        for (int i10 = 0; i10 < elementsCount; i10++) {
            strArr[i10] = jsonNamingStrategy.serialNameForJson(serialDescriptor, i10, serialDescriptor.getElementName(i10));
        }
        return strArr;
    }

    public static final boolean tryCoerceValue(Json json, SerialDescriptor descriptor, int i10, l peekNull, kv.a peekString, kv.a onEnumCoercing) {
        String str;
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(descriptor, "descriptor");
        e0.checkNotNullParameter(peekNull, "peekNull");
        e0.checkNotNullParameter(peekString, "peekString");
        e0.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        boolean zIsElementOptional = descriptor.isElementOptional(i10);
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i10);
        if (zIsElementOptional && !elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(Boolean.TRUE)).booleanValue()) {
            return true;
        }
        if (!e0.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(Boolean.FALSE)).booleanValue()) || (str = (String) peekString.invoke()) == null)) {
            return false;
        }
        int jsonNameIndex = getJsonNameIndex(elementDescriptor, json, str);
        boolean z10 = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
        if (jsonNameIndex == -3 && (zIsElementOptional || z10)) {
            onEnumCoercing.invoke();
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean tryCoerceValue$default(Json json, SerialDescriptor descriptor, int i10, l peekNull, kv.a peekString, kv.a onEnumCoercing, int i11, Object obj) {
        String str;
        if ((i11 & 16) != 0) {
            onEnumCoercing = new kv.a() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt.tryCoerceValue.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m5252invoke() {
                }

                @Override // kv.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m5252invoke();
                    return tu.x0.f87415a;
                }
            };
        }
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(descriptor, "descriptor");
        e0.checkNotNullParameter(peekNull, "peekNull");
        e0.checkNotNullParameter(peekString, "peekString");
        e0.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        boolean zIsElementOptional = descriptor.isElementOptional(i10);
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i10);
        if (zIsElementOptional && !elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(Boolean.TRUE)).booleanValue()) {
            return true;
        }
        if (!e0.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(Boolean.FALSE)).booleanValue()) || (str = (String) peekString.invoke()) == null)) {
            return false;
        }
        int jsonNameIndex = getJsonNameIndex(elementDescriptor, json, str);
        boolean z10 = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
        if (jsonNameIndex == -3 && (zIsElementOptional || z10)) {
            onEnumCoercing.invoke();
            return true;
        }
        return false;
    }
}
