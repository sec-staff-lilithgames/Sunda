package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class u7 implements n4 {

    /* renamed from: a, reason: collision with root package name */
    private String f15812a;

    /* renamed from: b, reason: collision with root package name */
    private String f15813b;

    private u7() {
    }

    public static u7 a(m8 m8Var, u7 u7Var, com.applovin.impl.sdk.k kVar) {
        if (m8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (u7Var == null) {
            try {
                u7Var = new u7();
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastSystemInfo", "Error occurred while initializing", th2);
                }
                kVar.E().a("VastSystemInfo", th2);
                return null;
            }
        }
        if (!StringUtils.isValidString(u7Var.f15812a)) {
            String strD = m8Var.d();
            if (StringUtils.isValidString(strD)) {
                u7Var.f15812a = strD;
            }
        }
        if (!StringUtils.isValidString(u7Var.f15813b)) {
            String str = (String) m8Var.a().get("version");
            if (StringUtils.isValidString(str)) {
                u7Var.f15813b = str;
            }
        }
        return u7Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7)) {
            return false;
        }
        u7 u7Var = (u7) obj;
        String str = this.f15812a;
        if (str == null ? u7Var.f15812a != null : !str.equals(u7Var.f15812a)) {
            return false;
        }
        String str2 = this.f15813b;
        String str3 = u7Var.f15813b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f15812a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15813b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastSystemInfo{name='");
        sb2.append(this.f15812a);
        sb2.append("', version='");
        return j1.o2.o(sb2, this.f15813b, "'}");
    }

    public static u7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        u7 u7Var = new u7();
        u7Var.f15812a = JsonUtils.getString(jSONObject, "name", null);
        u7Var.f15813b = JsonUtils.getString(jSONObject, "version", null);
        return u7Var;
    }

    @Override // com.applovin.impl.n4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", this.f15812a);
        JsonUtils.putString(jSONObject, "version", this.f15813b);
        return jSONObject;
    }
}
