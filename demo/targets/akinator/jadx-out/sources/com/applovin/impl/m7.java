package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class m7 implements n4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14451a;

    /* renamed from: b, reason: collision with root package name */
    private final List f14452b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14453c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f14454d;

    private m7(String str, List list, String str2, Set set) {
        this.f14451a = str;
        this.f14452b = list;
        this.f14453c = str2;
        this.f14454d = set;
    }

    public static m7 a(m8 m8Var, p7 p7Var, com.applovin.impl.sdk.k kVar) {
        try {
            String str = (String) m8Var.a().get("vendor");
            m8 m8VarB = m8Var.b("VerificationParameters");
            String strD = m8VarB != null ? m8VarB.d() : null;
            List listA = m8Var.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                s7 s7VarA = s7.a((m8) it.next(), kVar);
                if (s7VarA != null) {
                    arrayList.add(s7VarA);
                }
            }
            HashMap map = new HashMap();
            x7.a(m8Var, map, p7Var, kVar);
            return new m7(str, arrayList, strD, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th2) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerification", "Error occurred while initializing", th2);
            }
            kVar.E().a("VastAdVerification", th2);
            return null;
        }
    }

    public Set b() {
        return this.f14454d;
    }

    public List c() {
        return this.f14452b;
    }

    public String d() {
        return this.f14451a;
    }

    public String e() {
        return this.f14453c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            m7 m7Var = (m7) obj;
            String str = this.f14451a;
            if (str == null ? m7Var.f14451a != null : !str.equals(m7Var.f14451a)) {
                return false;
            }
            List list = this.f14452b;
            if (list == null ? m7Var.f14452b != null : !list.equals(m7Var.f14452b)) {
                return false;
            }
            String str2 = this.f14453c;
            if (str2 == null ? m7Var.f14453c != null : !str2.equals(m7Var.f14453c)) {
                return false;
            }
            Set set = this.f14454d;
            Set set2 = m7Var.f14454d;
            if (set != null) {
                return set.equals(set2);
            }
            if (set2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f14451a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f14452b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f14453c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f14454d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f14451a + "'javascriptResources='" + this.f14452b + "'verificationParameters='" + this.f14453c + "'errorEventTrackers='" + this.f14454d + "'}";
    }

    public static m7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArrayT = b0.e2.t(jSONObject, "javascript_resources");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            s7 s7VarA = s7.a(JsonUtils.getJSONObject(jSONArrayT, i10, (JSONObject) null), kVar);
            if (s7VarA != null) {
                arrayList.add(s7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArrayT2 = b0.e2.t(jSONObject, "error_event_trackers");
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < jSONArrayT2.length(); i11++) {
            v7 v7VarA = v7.a(JsonUtils.getJSONObject(jSONArrayT2, i11, (JSONObject) null), kVar);
            if (v7VarA != null) {
                hashSet.add(v7VarA);
            }
        }
        return new m7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.n4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f14451a);
        if (this.f14452b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f14452b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((s7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.f14453c);
        if (this.f14454d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f14454d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((v7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}
