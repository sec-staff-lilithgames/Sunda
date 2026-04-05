package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class v0 extends u0 {
    public v0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }

    public List d() {
        w0 w0VarA;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f15774b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject != null && (w0VarA = w0.a(jSONObject, this.f15773a)) != null) {
                arrayList.add(w0VarA);
            }
        }
        return arrayList;
    }

    public String e() {
        return b(PglCryptUtils.KEY_MESSAGE);
    }

    public String f() {
        return b("title");
    }

    @Override // com.applovin.impl.u0
    public String toString() {
        return "ConsentFlowState{id=" + b() + wHkgq.JlMe + c() + ", title=" + f() + ", message=" + e() + ", actions=" + d() + "}";
    }
}
