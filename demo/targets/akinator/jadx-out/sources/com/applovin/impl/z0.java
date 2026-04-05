package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class z0 {
    public static List a(com.applovin.impl.sdk.k kVar) {
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("ConsentFlowStateProvider", "Generating consent flow states...");
        }
        String strA = k7.a(R.raw.applovin_consent_flow_unified_cmp, com.applovin.impl.sdk.k.o(), kVar);
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strA, null);
        if (jSONObjectJsonObjectFromJsonString == null) {
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONArray jSONArrayT = b0.e2.t(jSONObjectJsonObjectFromJsonString, "states");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            arrayList.add(u0.a(JsonUtils.getJSONObject(jSONArrayT, i10, new JSONObject()), kVar));
        }
        return arrayList;
    }
}
