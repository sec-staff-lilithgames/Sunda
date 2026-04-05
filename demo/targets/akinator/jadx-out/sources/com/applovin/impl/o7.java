package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class o7 implements n4 {

    /* renamed from: a, reason: collision with root package name */
    private int f14987a;

    /* renamed from: b, reason: collision with root package name */
    private int f14988b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f14989c;

    /* renamed from: d, reason: collision with root package name */
    private t7 f14990d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f14991e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Map f14992f = new HashMap();

    private o7() {
    }

    public static o7 a(m8 m8Var, o7 o7Var, p7 p7Var, com.applovin.impl.sdk.k kVar) {
        m8 m8VarC;
        if (m8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (o7Var == null) {
            try {
                o7Var = new o7();
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastCompanionAd", "Error occurred while initializing", th2);
                }
                kVar.E().a("VastCompanionAd", th2);
                return null;
            }
        }
        if (o7Var.f14987a == 0 && o7Var.f14988b == 0) {
            int i10 = StringUtils.parseInt((String) m8Var.a().get("width"));
            int i11 = StringUtils.parseInt((String) m8Var.a().get("height"));
            if (i10 > 0 && i11 > 0) {
                o7Var.f14987a = i10;
                o7Var.f14988b = i11;
            }
        }
        o7Var.f14990d = t7.a(m8Var, o7Var.f14990d, kVar);
        if (o7Var.f14989c == null && (m8VarC = m8Var.c("CompanionClickThrough")) != null) {
            String strD = m8VarC.d();
            if (StringUtils.isValidString(strD)) {
                o7Var.f14989c = Uri.parse(strD);
            }
        }
        x7.a(m8Var.a("CompanionClickTracking"), o7Var.f14991e, p7Var, kVar);
        x7.a(m8Var, o7Var.f14992f, p7Var, kVar);
        return o7Var;
    }

    public Set b() {
        return this.f14991e;
    }

    public Uri c() {
        return this.f14989c;
    }

    public Map d() {
        return this.f14992f;
    }

    public t7 e() {
        return this.f14990d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        if (this.f14987a != o7Var.f14987a || this.f14988b != o7Var.f14988b) {
            return false;
        }
        Uri uri = this.f14989c;
        if (uri == null ? o7Var.f14989c != null : !uri.equals(o7Var.f14989c)) {
            return false;
        }
        t7 t7Var = this.f14990d;
        if (t7Var == null ? o7Var.f14990d != null : !t7Var.equals(o7Var.f14990d)) {
            return false;
        }
        Set set = this.f14991e;
        if (set == null ? o7Var.f14991e != null : !set.equals(o7Var.f14991e)) {
            return false;
        }
        Map map = this.f14992f;
        Map map2 = o7Var.f14992f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i10 = ((this.f14987a * 31) + this.f14988b) * 31;
        Uri uri = this.f14989c;
        int iHashCode = (i10 + (uri != null ? uri.hashCode() : 0)) * 31;
        t7 t7Var = this.f14990d;
        int iHashCode2 = (iHashCode + (t7Var != null ? t7Var.hashCode() : 0)) * 31;
        Set set = this.f14991e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f14992f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastCompanionAd{width=");
        sb2.append(this.f14987a);
        sb2.append(", height=");
        sb2.append(this.f14988b);
        sb2.append(", destinationUri=");
        sb2.append(this.f14989c);
        sb2.append(", nonVideoResource=");
        sb2.append(this.f14990d);
        sb2.append(", clickTrackers=");
        sb2.append(this.f14991e);
        sb2.append(", eventTrackers=");
        return j1.o2.q(sb2, this.f14992f, AbstractJsonLexerKt.END_OBJ);
    }

    public static o7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        int i10 = JsonUtils.getInt(jSONObject, "width", 0);
        int i11 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        t7 t7VarA = t7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), kVar);
        JSONArray jSONArrayT = b0.e2.t(jSONObject, "click_trackers");
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < jSONArrayT.length(); i12++) {
            v7 v7VarA = v7.a(JsonUtils.getJSONObject(jSONArrayT, i12, (JSONObject) null), kVar);
            if (v7VarA != null) {
                hashSet.add(v7VarA);
            }
        }
        o7 o7Var = new o7();
        o7Var.f14987a = i10;
        o7Var.f14988b = i11;
        o7Var.f14989c = uri;
        o7Var.f14990d = t7VarA;
        o7Var.f14991e.addAll(hashSet);
        return o7Var;
    }

    @Override // com.applovin.impl.n4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.f14987a);
        JsonUtils.putInt(jSONObject, "height", this.f14988b);
        Uri uri = this.f14989c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        t7 t7Var = this.f14990d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", t7Var != null ? t7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f14991e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((v7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
