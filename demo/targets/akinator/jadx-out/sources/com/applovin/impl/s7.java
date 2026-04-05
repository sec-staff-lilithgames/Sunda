package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class s7 implements n4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15226a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15227b;

    private s7(String str, String str2) {
        this.f15226a = str;
        this.f15227b = str2;
    }

    public static s7 a(m8 m8Var, com.applovin.impl.sdk.k kVar) {
        if (m8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new s7((String) m8Var.a().get("apiFramework"), m8Var.d());
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastJavaScriptResource", "Error occurred while initializing", th2);
            }
            kVar.E().a("VastJavaScriptResource", th2);
            return null;
        }
    }

    public String b() {
        return this.f15226a;
    }

    public String c() {
        return this.f15227b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            s7 s7Var = (s7) obj;
            String str = this.f15226a;
            if (str == null ? s7Var.f15226a != null : !str.equals(s7Var.f15226a)) {
                return false;
            }
            String str2 = this.f15227b;
            String str3 = s7Var.f15227b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15226a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15227b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastJavaScriptResource{apiFramework='");
        sb2.append(this.f15226a);
        sb2.append("', javascriptResourceUrl='");
        return j1.o2.o(sb2, this.f15227b, "'}");
    }

    public static s7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        return new s7(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.n4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.f15226a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.f15227b);
        return jSONObject;
    }
}
