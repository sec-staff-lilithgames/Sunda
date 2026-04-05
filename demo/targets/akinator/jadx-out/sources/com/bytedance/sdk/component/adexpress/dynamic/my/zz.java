package com.bytedance.sdk.component.adexpress.dynamic.my;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz {
    public static String jd(String str, String str2) {
        if (!com.bytedance.sdk.component.adexpress.cm.jd()) {
            return jpo.jpo(str);
        }
        if (str.indexOf(46) < 0) {
            str = str.concat(".png");
        }
        return i.d(str2, "static/images/", str);
    }

    public static void jpo(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectTl = com.bytedance.sdk.component.adexpress.jd.tl(str);
        if (jSONObjectTl == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectTl.optJSONObject("values");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        jpo(jSONObjectOptJSONObject, jSONObject);
    }

    public static JSONObject jpo(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectTl = com.bytedance.sdk.component.adexpress.jd.tl(str);
        if (jSONObjectTl == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return jpo(jSONObject2, jSONObjectTl.optJSONObject("themeValues"), jSONObject);
    }

    private static void jpo(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static JSONObject jpo(JSONObject... jSONObjectArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String jpo(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectTl = com.bytedance.sdk.component.adexpress.jd.tl(str);
        if (jSONObjectTl == null || (jSONObjectOptJSONObject = jSONObjectTl.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("data");
    }

    public static String jpo(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectTl = com.bytedance.sdk.component.adexpress.jd.tl(str);
        if (jSONObjectTl == null || (jSONObjectOptJSONObject = jSONObjectTl.optJSONObject("values")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    public static JSONObject jpo(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("values");
    }
}
