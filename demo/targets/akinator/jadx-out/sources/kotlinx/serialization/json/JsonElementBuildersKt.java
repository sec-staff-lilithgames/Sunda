package kotlinx.serialization.json;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;
import kv.l;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonElementBuildersKt {
    public static final boolean add(JsonArrayBuilder jsonArrayBuilder, Boolean bool) {
        e0.checkNotNullParameter(jsonArrayBuilder, "<this>");
        return jsonArrayBuilder.add(JsonElementKt.JsonPrimitive(bool));
    }

    @ExperimentalSerializationApi
    public static final boolean addAllBooleans(JsonArrayBuilder jsonArrayBuilder, Collection<Boolean> values) {
        e0.checkNotNullParameter(jsonArrayBuilder, "<this>");
        e0.checkNotNullParameter(values, "values");
        Collection<Boolean> collection = values;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(JsonElementKt.JsonPrimitive((Boolean) it.next()));
        }
        return jsonArrayBuilder.addAll(arrayList);
    }

    @ExperimentalSerializationApi
    public static final boolean addAllNumbers(JsonArrayBuilder jsonArrayBuilder, Collection<? extends Number> values) {
        e0.checkNotNullParameter(jsonArrayBuilder, "<this>");
        e0.checkNotNullParameter(values, "values");
        Collection<? extends Number> collection = values;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(JsonElementKt.JsonPrimitive((Number) it.next()));
        }
        return jsonArrayBuilder.addAll(arrayList);
    }

    @ExperimentalSerializationApi
    public static final boolean addAllStrings(JsonArrayBuilder jsonArrayBuilder, Collection<String> values) {
        e0.checkNotNullParameter(jsonArrayBuilder, "<this>");
        e0.checkNotNullParameter(values, "values");
        Collection<String> collection = values;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(JsonElementKt.JsonPrimitive((String) it.next()));
        }
        return jsonArrayBuilder.addAll(arrayList);
    }

    public static final boolean addJsonArray(JsonArrayBuilder jsonArrayBuilder, l builderAction) {
        e0.checkNotNullParameter(jsonArrayBuilder, "<this>");
        e0.checkNotNullParameter(builderAction, "builderAction");
        JsonArrayBuilder jsonArrayBuilder2 = new JsonArrayBuilder();
        builderAction.invoke(jsonArrayBuilder2);
        return jsonArrayBuilder.add(jsonArrayBuilder2.build());
    }

    public static final boolean addJsonObject(JsonArrayBuilder jsonArrayBuilder, l builderAction) {
        e0.checkNotNullParameter(jsonArrayBuilder, "<this>");
        e0.checkNotNullParameter(builderAction, "builderAction");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        builderAction.invoke(jsonObjectBuilder);
        return jsonArrayBuilder.add(jsonObjectBuilder.build());
    }

    public static final JsonArray buildJsonArray(l builderAction) {
        e0.checkNotNullParameter(builderAction, "builderAction");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        builderAction.invoke(jsonArrayBuilder);
        return jsonArrayBuilder.build();
    }

    public static final JsonObject buildJsonObject(l builderAction) {
        e0.checkNotNullParameter(builderAction, "builderAction");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        builderAction.invoke(jsonObjectBuilder);
        return jsonObjectBuilder.build();
    }

    public static final JsonElement put(JsonObjectBuilder jsonObjectBuilder, String key, Boolean bool) {
        e0.checkNotNullParameter(jsonObjectBuilder, "<this>");
        e0.checkNotNullParameter(key, "key");
        return jsonObjectBuilder.put(key, JsonElementKt.JsonPrimitive(bool));
    }

    public static final JsonElement putJsonArray(JsonObjectBuilder jsonObjectBuilder, String key, l builderAction) {
        e0.checkNotNullParameter(jsonObjectBuilder, "<this>");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(builderAction, "builderAction");
        JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
        builderAction.invoke(jsonArrayBuilder);
        return jsonObjectBuilder.put(key, jsonArrayBuilder.build());
    }

    public static final JsonElement putJsonObject(JsonObjectBuilder jsonObjectBuilder, String key, l builderAction) {
        e0.checkNotNullParameter(jsonObjectBuilder, "<this>");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(builderAction, "builderAction");
        JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
        builderAction.invoke(jsonObjectBuilder2);
        return jsonObjectBuilder.put(key, jsonObjectBuilder2.build());
    }

    public static final boolean add(JsonArrayBuilder jsonArrayBuilder, Number number) {
        e0.checkNotNullParameter(jsonArrayBuilder, "<this>");
        return jsonArrayBuilder.add(JsonElementKt.JsonPrimitive(number));
    }

    public static final JsonElement put(JsonObjectBuilder jsonObjectBuilder, String key, Number number) {
        e0.checkNotNullParameter(jsonObjectBuilder, "<this>");
        e0.checkNotNullParameter(key, "key");
        return jsonObjectBuilder.put(key, JsonElementKt.JsonPrimitive(number));
    }

    public static final boolean add(JsonArrayBuilder jsonArrayBuilder, String str) {
        e0.checkNotNullParameter(jsonArrayBuilder, "<this>");
        return jsonArrayBuilder.add(JsonElementKt.JsonPrimitive(str));
    }

    public static final JsonElement put(JsonObjectBuilder jsonObjectBuilder, String key, String str) {
        e0.checkNotNullParameter(jsonObjectBuilder, "<this>");
        e0.checkNotNullParameter(key, "key");
        return jsonObjectBuilder.put(key, JsonElementKt.JsonPrimitive(str));
    }

    @ExperimentalSerializationApi
    public static final boolean add(JsonArrayBuilder jsonArrayBuilder, Void r12) {
        e0.checkNotNullParameter(jsonArrayBuilder, "<this>");
        return jsonArrayBuilder.add(JsonNull.INSTANCE);
    }

    @ExperimentalSerializationApi
    public static final JsonElement put(JsonObjectBuilder jsonObjectBuilder, String key, Void r22) {
        e0.checkNotNullParameter(jsonObjectBuilder, "<this>");
        e0.checkNotNullParameter(key, "key");
        return jsonObjectBuilder.put(key, JsonNull.INSTANCE);
    }
}
