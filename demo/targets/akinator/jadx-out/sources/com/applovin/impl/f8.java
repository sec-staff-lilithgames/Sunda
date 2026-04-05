package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.C3465td;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f8 {

    /* renamed from: a, reason: collision with root package name */
    private final r2 f13982a;

    /* renamed from: b, reason: collision with root package name */
    private final x3 f13983b;

    /* renamed from: c, reason: collision with root package name */
    private final List f13984c;

    public f8(JSONObject jSONObject, MaxAdFormat maxAdFormat, b3 b3Var, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f13983b = new x3(jSONObject2, kVar);
        } else {
            this.f13983b = null;
        }
        this.f13982a = new r2(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, b3Var);
        JSONArray jSONArrayT = b0.e2.t(jSONObject, C3465td.f38951c);
        this.f13984c = new ArrayList(jSONArrayT.length());
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayT, i10, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f13984c.add(new x3(jSONObject3, kVar));
            }
        }
    }

    public x3 a() {
        return this.f13983b;
    }

    public r2 b() {
        return this.f13982a;
    }

    public List c() {
        return this.f13984c;
    }

    public boolean d() {
        return this.f13983b != null;
    }
}
