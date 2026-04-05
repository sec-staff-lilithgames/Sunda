package com.moloco.sdk.internal.publisher.nativead.parser;

import androidx.core.app.NotificationCompat;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DtbDeviceRegistration;
import com.moloco.sdk.internal.publisher.nativead.model.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tu.a0;
import tu.z;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {
    public final Object a(String nativeOrtbString) {
        e0.checkNotNullParameter(nativeOrtbString, "nativeOrtbString");
        try {
            JSONObject jSONObject = new JSONObject(nativeOrtbString);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("native");
            if (jSONObjectOptJSONObject != null) {
                jSONObject = jSONObjectOptJSONObject;
            }
            int i10 = z.f87419c;
            return z.m7131constructorimpl(new com.moloco.sdk.internal.publisher.nativead.model.a(jSONObject.has("ver") ? jSONObject.getString("ver") : null, a(jSONObject.optJSONArray("assets")), a(jSONObject.optJSONObject("link")), c(jSONObject.optJSONArray("imptrackers")), b(jSONObject.optJSONArray("eventtrackers")), jSONObject.has(DtbDeviceRegistration.CONFIG_PRIVACY_KEY) ? jSONObject.getString(DtbDeviceRegistration.CONFIG_PRIVACY_KEY) : null));
        } catch (Exception e10) {
            int i11 = z.f87419c;
            return z.m7131constructorimpl(a0.createFailure(e10));
        }
    }

    public final a.AbstractC0378a.b b(JSONObject jSONObject, int i10, boolean z10) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Integer numValueOf = jSONObject.has("type") ? Integer.valueOf(jSONObject.getInt("type")) : null;
        String string = jSONObject.getString("url");
        e0.checkNotNullExpressionValue(string, "getString(...)");
        return new a.AbstractC0378a.b(i10, z10, numValueOf, string, jSONObject.has("w") ? Integer.valueOf(jSONObject.getInt("w")) : null, jSONObject.has(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME) ? Integer.valueOf(jSONObject.getInt(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME)) : null);
    }

    public final a.AbstractC0378a.c c(JSONObject jSONObject, int i10, boolean z10) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("text");
        e0.checkNotNullExpressionValue(string, "getString(...)");
        return new a.AbstractC0378a.c(i10, z10, string, jSONObject.has("len") ? Integer.valueOf(jSONObject.getInt("len")) : null);
    }

    public final a.AbstractC0378a.d d(JSONObject jSONObject, int i10, boolean z10) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("vasttag");
        e0.checkNotNullExpressionValue(string, "getString(...)");
        return new a.AbstractC0378a.d(i10, z10, string);
    }

    public final List<String> c(JSONArray jSONArray) {
        if (jSONArray == null) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return arrayList;
    }

    public final List<a.b> b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            arrayList.add(new a.b(jSONObject.getInt(NotificationCompat.CATEGORY_EVENT), jSONObject.getInt("method"), jSONObject.has("url") ? jSONObject.getString("url") : null));
        }
        return arrayList;
    }

    public final List<a.AbstractC0378a> a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            if (jSONObject.has("id")) {
                int i11 = jSONObject.getInt("id");
                boolean z10 = jSONObject.optInt("required", 0) == 1;
                Object objC = c(jSONObject.optJSONObject("title"), i11, z10);
                if (objC == null && (objC = b(jSONObject.optJSONObject("img"), i11, z10)) == null && (objC = d(jSONObject.optJSONObject("video"), i11, z10)) == null) {
                    objC = a(jSONObject.optJSONObject("data"), i11, z10);
                }
                if (objC != null) {
                    arrayList.add(objC);
                }
            }
        }
        return arrayList;
    }

    public final a.AbstractC0378a.C0379a a(JSONObject jSONObject, int i10, boolean z10) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Integer numValueOf = jSONObject.has("type") ? Integer.valueOf(jSONObject.getInt("type")) : null;
        Integer numValueOf2 = jSONObject.has("len") ? Integer.valueOf(jSONObject.getInt("len")) : null;
        String string = jSONObject.getString("value");
        e0.checkNotNullExpressionValue(string, "getString(...)");
        return new a.AbstractC0378a.C0379a(i10, z10, numValueOf, numValueOf2, string);
    }

    public final a.c a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("url");
        String string2 = jSONObject.has("fallback") ? jSONObject.getString("fallback") : null;
        List<String> listC = c(jSONObject.optJSONArray("clicktrackers"));
        e0.checkNotNull(string);
        return new a.c(string, listC, string2);
    }
}
