package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ad {

    /* renamed from: a, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, a> f33844a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, b> f33845a;

        public a(JSONObject adFormatProviderOrder) throws JSONException {
            kotlin.jvm.internal.e0.checkNotNullParameter(adFormatProviderOrder, "adFormatProviderOrder");
            List<String> listB = C3286ja.b(adFormatProviderOrder.names());
            listB = listB == null ? uu.p0.emptyList() : listB;
            LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(uu.o1.mapCapacity(uu.q0.collectionSizeOrDefault(listB, 10)), 16));
            for (Object obj : listB) {
                JSONArray jSONArrayOptJSONArray = adFormatProviderOrder.optJSONArray((String) obj);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                } else {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONArrayOptJSONArray, "adFormatProviderOrder.op…(adUnitId) ?: JSONArray()");
                }
                linkedHashMap.put(obj, new b(jSONArrayOptJSONArray));
            }
            this.f33845a = linkedHashMap;
        }

        public final Map<String, b> a() {
            return this.f33845a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f33846a;

        public b(JSONArray providerOrder) throws JSONException {
            kotlin.jvm.internal.e0.checkNotNullParameter(providerOrder, "providerOrder");
            List<String> listB = C3286ja.b(providerOrder);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(listB, "jsonArrayToStringList(providerOrder)");
            this.f33846a = listB;
        }

        public final List<String> a() {
            return this.f33846a;
        }
    }

    public Ad(JSONObject providerOrder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerOrder, "providerOrder");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(uu.o1.mapCapacity(adFormatArrValues.length), 16));
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = providerOrder.optJSONObject(C3518wf.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            } else {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectOptJSONObject, "providerOrder.optJSONObj…dFormat)) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new a(jSONObjectOptJSONObject));
        }
        this.f33844a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, a> a() {
        return this.f33844a;
    }
}
