package com.bytedance.sdk.component.adexpress.dynamic.my;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    public static JSONObject jpo(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2 == null || jSONObject2.length() <= 0 || jSONObject == null) {
            return jSONObject;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                Object objOpt2 = jSONObject2.opt(next);
                if (objOpt2 == null || objOpt2 == JSONObject.NULL) {
                    jSONObject3.put(next, objOpt);
                } else if ((objOpt instanceof JSONObject) && (objOpt2 instanceof JSONObject)) {
                    jSONObject3.put(next, jpo((JSONObject) objOpt, (JSONObject) objOpt2));
                } else if ((objOpt instanceof JSONArray) && (objOpt2 instanceof JSONArray)) {
                    jSONObject3.put(next, jpo((JSONArray) objOpt, (JSONArray) objOpt2));
                } else {
                    jSONObject3.put(next, objOpt2);
                }
            }
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (!jSONObject.has(next2)) {
                    jSONObject3.put(next2, jSONObject2.opt(next2));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject3;
    }

    private static JSONArray jpo(JSONArray jSONArray, JSONArray jSONArray2) throws JSONException {
        if (jSONArray2 == null || jSONArray2.length() <= 0) {
            return jSONArray;
        }
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        JSONArray jSONArray3 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                Object objOpt = jSONArray.opt(i10);
                Object objOpt2 = jSONArray2.opt(i10);
                if (objOpt2 != null && objOpt2 != JSONObject.NULL) {
                    if ((objOpt instanceof JSONObject) && (objOpt2 instanceof JSONObject)) {
                        jSONArray3.put(i10, jpo((JSONObject) objOpt, (JSONObject) objOpt2));
                    } else if ((objOpt instanceof JSONArray) && (objOpt2 instanceof JSONArray)) {
                        jSONArray3.put(i10, jpo((JSONArray) objOpt, (JSONArray) objOpt2));
                    } else {
                        jSONArray3.put(i10, objOpt2);
                    }
                } else {
                    jSONArray3.put(i10, objOpt);
                }
            } catch (JSONException unused) {
            }
        }
        return jSONArray3;
    }
}
