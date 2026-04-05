package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final String f14880a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14881b;

    /* renamed from: c, reason: collision with root package name */
    private final h8 f14882c;

    /* renamed from: d, reason: collision with root package name */
    private final List f14883d;

    /* renamed from: e, reason: collision with root package name */
    private final List f14884e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14885f = false;

    public List a() {
        return this.f14883d;
    }

    public String b() {
        return this.f14881b;
    }

    public String c() {
        return this.f14880a;
    }

    public h8 d() {
        return this.f14882c;
    }

    public List e() {
        return this.f14884e;
    }

    public boolean f() {
        return this.f14885f;
    }

    private h8 a(JSONObject jSONObject) {
        return new h8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    public o(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        this.f14880a = JsonUtils.getString(jSONObject, "name", "");
        this.f14881b = JsonUtils.getString(jSONObject, PtLatqAYjEFT.ctdnpnjFNmb, null);
        this.f14882c = a(jSONObject);
        this.f14883d = a("bidders", jSONObject, map, maxAdFormat, kVar);
        this.f14884e = a(com.ironsource.mediationsdk.d.f37321h, jSONObject, map, maxAdFormat, kVar);
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        b3 b3Var;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayT = b0.e2.t(jSONObject, str);
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayT, i10, (JSONObject) null);
            if (jSONObject2 != null && (b3Var = (b3) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (b3Var.D()) {
                    this.f14885f = true;
                }
                arrayList.add(new f8(jSONObject2, maxAdFormat, b3Var, kVar));
            }
        }
        return arrayList;
    }
}
