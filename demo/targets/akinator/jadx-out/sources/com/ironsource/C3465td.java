package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.td, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3465td {

    /* renamed from: b, reason: collision with root package name */
    public static final a f38950b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f38951c = "placements";

    /* renamed from: d, reason: collision with root package name */
    public static final String f38952d = "placementName";

    /* renamed from: a, reason: collision with root package name */
    private final JSONArray f38953a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.td$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public C3465td(JSONObject configuration) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
        this.f38953a = configuration.optJSONArray(f38951c);
    }

    public final <T> Map<String, T> a(kv.l valueExtractor) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(valueExtractor, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f38953a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jsonObject = jSONArray.getJSONObject(i10);
                String key = jsonObject.optString("placementName");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(jsonObject, "jsonObject");
                Object objInvoke = valueExtractor.invoke(jsonObject);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, objInvoke);
            }
        }
        return linkedHashMap;
    }
}
