package com.sfbx.appconsent.core.provider;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import uu.o1;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TimeoutProvider {
    public static final String KEY_TIMEOUT = "key_timeout";
    private final Json json;

    /* renamed from: sp, reason: collision with root package name */
    private final SharedPreferences f50534sp;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "TimeoutProvider";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public TimeoutProvider(SharedPreferences sp2, Json json) {
        e0.checkNotNullParameter(sp2, "sp");
        e0.checkNotNullParameter(json, "json");
        this.f50534sp = sp2;
        this.json = json;
    }

    public final void clear() {
        SharedPreferences.Editor editor = this.f50534sp.edit();
        e0.checkNotNullExpressionValue(editor, "editor");
        editor.remove(KEY_TIMEOUT).apply();
        editor.apply();
    }

    public final Map<String, Long> getTimeouts() {
        String string = this.f50534sp.getString(KEY_TIMEOUT, null);
        if (string == null) {
            string = "{}";
        }
        JsonObject jsonObject = JsonElementKt.getJsonObject(this.json.parseToJsonElement(string));
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(jsonObject.size()));
        Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), Long.valueOf(Long.parseLong(JsonElementKt.getJsonPrimitive((JsonElement) entry.getValue()).getContent())));
        }
        return linkedHashMap;
    }

    public final void remove(String key) {
        e0.checkNotNullParameter(key, "key");
        Map mutableMap = p1.toMutableMap(getTimeouts());
        mutableMap.remove(key);
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(mutableMap.size()));
        for (Map.Entry entry : mutableMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), JsonElementKt.JsonPrimitive((Number) entry.getValue()));
        }
        String string = new JsonObject(linkedHashMap).toString();
        SharedPreferences.Editor editor = this.f50534sp.edit();
        e0.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_TIMEOUT, string).apply();
        editor.apply();
    }

    public final void setTimeout(String key, long j10) {
        e0.checkNotNullParameter(key, "key");
        Map mutableMap = p1.toMutableMap(getTimeouts());
        mutableMap.put(key, Long.valueOf(j10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(mutableMap.size()));
        for (Map.Entry entry : mutableMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), JsonElementKt.JsonPrimitive((Number) entry.getValue()));
        }
        String string = new JsonObject(linkedHashMap).toString();
        SharedPreferences.Editor editor = this.f50534sp.edit();
        e0.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_TIMEOUT, string).apply();
        editor.apply();
    }
}
