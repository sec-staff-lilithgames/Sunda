package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class n7 implements n4 {

    /* renamed from: a, reason: collision with root package name */
    private final List f14868a;

    private n7(List list) {
        this.f14868a = list;
    }

    public static n7 a(m8 m8Var, n7 n7Var, p7 p7Var, com.applovin.impl.sdk.k kVar) {
        try {
            List listB = n7Var != null ? n7Var.b() : new ArrayList();
            Iterator it = m8Var.a("Verification").iterator();
            while (it.hasNext()) {
                m7 m7VarA = m7.a((m8) it.next(), p7Var, kVar);
                if (m7VarA != null) {
                    listB.add(m7VarA);
                }
            }
            return new n7(listB);
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerifications", "Error occurred while initializing", th2);
            }
            kVar.E().a("VastAdVerifications", th2);
            return null;
        }
    }

    public List b() {
        return this.f14868a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n7) {
            return this.f14868a.equals(((n7) obj).f14868a);
        }
        return false;
    }

    public int hashCode() {
        return this.f14868a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f14868a + "'}";
    }

    public static n7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArrayT = b0.e2.t(jSONObject, "verifications");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            m7 m7VarA = m7.a(JsonUtils.getJSONObject(jSONArrayT, i10, (JSONObject) null), kVar);
            if (m7VarA != null) {
                arrayList.add(m7VarA);
            }
        }
        return new n7(arrayList);
    }

    @Override // com.applovin.impl.n4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        if (this.f14868a != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f14868a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((m7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }
}
