package com.vungle.ads.internal.util;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class JsonUtil {
    public static final JsonUtil INSTANCE = new JsonUtil();

    private JsonUtil() {
    }

    public final String getContentStringValue(JsonObject json, String key) {
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(key, "key");
        try {
            return JsonElementKt.getJsonPrimitive((JsonElement) p1.getValue(json, key)).getContent();
        } catch (Exception unused) {
            return null;
        }
    }
}
