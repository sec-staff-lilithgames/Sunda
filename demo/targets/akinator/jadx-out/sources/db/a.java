package db;

import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class a {
    public static xa.a a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        String str = "";
        boolean z10 = false;
        try {
            if (jSONObject.has("data") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                String strOptString = jSONObjectOptJSONObject.optString("igniteVersion", "");
                try {
                    if (!jSONObjectOptJSONObject.has("features") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("features")) == null) {
                        str = strOptString;
                    } else {
                        for (int length = jSONArrayOptJSONArray.length() - 1; length >= 0; length--) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(length);
                            if (jSONObjectOptJSONObject2.has("type") && "GET_PROPERTY".equalsIgnoreCase(jSONObjectOptJSONObject2.optString("type", ""))) {
                                str = strOptString;
                                z10 = true;
                                break;
                            }
                        }
                        str = strOptString;
                    }
                } catch (Exception e10) {
                    e = e10;
                    str = strOptString;
                    cb.b.b("IgniteVersionParser: exception on parse: %s", e.getMessage());
                    return new xa.a(z10, str);
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return new xa.a(z10, str);
    }
}
