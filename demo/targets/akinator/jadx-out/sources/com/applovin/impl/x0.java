package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class x0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    private Map f16166c;

    public x0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }

    public Map d() {
        return this.f16166c;
    }

    public String e() {
        return JsonUtils.getString(this.f15774b, "name", null);
    }

    @Override // com.applovin.impl.u0
    public String toString() {
        return "ConsentFlowState{id=" + b() + ", type=" + c() + ", name=" + e() + "}";
    }
}
