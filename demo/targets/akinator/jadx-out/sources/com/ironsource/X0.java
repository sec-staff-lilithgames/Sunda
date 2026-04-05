package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class X0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f35700b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f35701c = "adUnits";

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f35702a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public X0(JSONObject configurations) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configurations, "configurations");
        this.f35702a = configurations.optJSONObject(f35701c);
    }

    public final <T> Map<String, T> a(kv.l valueExtractor) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(valueExtractor, "valueExtractor");
        JSONObject jSONObject = this.f35702a;
        if (jSONObject == null) {
            return uu.p1.emptyMap();
        }
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(itKeys, "adUnits.keys()");
        rv.t tVarAsSequence = rv.y.asSequence(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : tVarAsSequence) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) obj);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(obj, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
