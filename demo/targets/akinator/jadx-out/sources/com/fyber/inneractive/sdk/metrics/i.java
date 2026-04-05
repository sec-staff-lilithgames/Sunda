package com.fyber.inneractive.sdk.metrics;

import com.amazon.device.ads.DTBMetricReport;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f24061a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f24062b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public long f24063c;

    /* renamed from: d, reason: collision with root package name */
    public long f24064d;

    public static JSONArray a(LinkedHashMap linkedHashMap) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (h hVar : linkedHashMap.keySet()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("outcome", hVar.f24060b);
                jSONObject.putOpt(DTBMetricReport.TIME, linkedHashMap.get(hVar));
                jSONObject.putOpt("idx", Integer.valueOf(jSONArray.length()));
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
