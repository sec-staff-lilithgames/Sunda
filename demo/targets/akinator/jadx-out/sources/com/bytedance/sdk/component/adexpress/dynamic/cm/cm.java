package com.bytedance.sdk.component.adexpress.dynamic.cm;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {

    /* renamed from: cm, reason: collision with root package name */
    public String f18129cm;

    /* renamed from: jd, reason: collision with root package name */
    public String f18130jd;
    public List<jpo> jpo;
    public String wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        public JSONObject f18131jd;
        public int jpo;
    }

    public static cm jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        cm cmVar = new cm();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    jpo jpoVar = new jpo();
                    jpoVar.jpo = jSONObjectOptJSONObject.optInt("id");
                    jpoVar.f18131jd = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(jpoVar);
                }
            }
        } catch (JSONException unused) {
        }
        cmVar.jpo = arrayList;
        cmVar.f18130jd = jSONObject.optString("diff_data");
        cmVar.wqx = jSONObject.optString("style_diff");
        cmVar.f18129cm = jSONObject.optString("tag_diff");
        return cmVar;
    }
}
