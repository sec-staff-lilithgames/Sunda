package com.fyber.inneractive.sdk.response.nativead.parser;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.response.nativead.g;
import com.fyber.inneractive.sdk.util.v;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a {
    public static ArrayList a(JSONArray jSONArray) {
        g gVar;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.names() == null) {
                    gVar = null;
                } else {
                    gVar = new g();
                    gVar.f26669a = jSONObjectOptJSONObject.optInt(NotificationCompat.CATEGORY_EVENT);
                    gVar.f26670b = jSONObjectOptJSONObject.optInt("method");
                    gVar.f26671c = v.a(jSONObjectOptJSONObject, "url");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("customdata");
                    HashMap map = gVar.f26672d;
                    HashMap map2 = new HashMap();
                    if (jSONObjectOptJSONObject2 != null) {
                        HashMap map3 = new HashMap();
                        JSONArray jSONArrayNames = jSONObjectOptJSONObject2.names();
                        if (jSONArrayNames != null && jSONArrayNames.length() != 0) {
                            for (int i11 = 0; i11 < jSONArrayNames.length(); i11++) {
                                String strOptString = jSONArrayNames.optString(i11);
                                if (strOptString != null && !strOptString.isEmpty() && !jSONObjectOptJSONObject2.isNull(strOptString)) {
                                    String strOptString2 = jSONObjectOptJSONObject2.optString(strOptString);
                                    if (!strOptString2.isEmpty()) {
                                        map3.put(strOptString, strOptString2);
                                    }
                                }
                            }
                        }
                        map2.putAll(map3);
                    }
                    map.putAll(map2);
                }
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
        }
        return arrayList;
    }
}
