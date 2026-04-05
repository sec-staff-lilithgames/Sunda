package com.bytedance.adsdk.ugeno.qk;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    public static void jpo(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException unused) {
            }
        }
    }

    public static JSONObject jpo(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static JSONArray jpo(String str, JSONArray jSONArray) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONArray(str);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    public static void jpo(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray2 == null || jSONArray2.length() <= 0) {
            return;
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
            Object objOpt = jSONArray2.opt(i10);
            if (objOpt != null) {
                jSONArray.put(objOpt);
            }
        }
    }
}
