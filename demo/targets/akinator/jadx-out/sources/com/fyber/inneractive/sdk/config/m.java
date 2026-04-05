package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23333a = new HashMap();

    public m() {
    }

    public m(JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        JSONArray jSONArrayNames2 = jSONObject.names();
        for (int i10 = 0; i10 < jSONArrayNames2.length(); i10++) {
            String strOptString = jSONArrayNames2.optString(i10, null);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strOptString);
            l lVar = new l();
            if (jSONObjectOptJSONObject != null && (jSONArrayNames = jSONObjectOptJSONObject.names()) != null) {
                for (int i11 = 0; i11 < jSONArrayNames.length(); i11++) {
                    String strOptString2 = jSONArrayNames.optString(i11, null);
                    String strOptString3 = jSONObjectOptJSONObject.optString(strOptString2, null);
                    if (strOptString2 != null && strOptString3 != null) {
                        lVar.f23328a.put(strOptString2, strOptString3);
                    }
                }
            }
            this.f23333a.put(strOptString, lVar);
        }
    }
}
