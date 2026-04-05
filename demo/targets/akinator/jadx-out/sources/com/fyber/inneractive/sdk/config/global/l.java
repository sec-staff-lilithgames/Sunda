package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C3500ve;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23303a = new HashMap();

    public static l a(JSONObject jSONObject) throws JSONException {
        l lVar = new l();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("features");
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
            q qVar = new q();
            qVar.f23306b = jSONObject2.getString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("params");
            if (jSONObjectOptJSONObject != null) {
                qVar.f23305a = new o(jSONObjectOptJSONObject);
            } else {
                IAlog.a("RemoteFeature fromJson. feature %s has no params!", qVar.f23306b);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(C3500ve.f39133d);
            if (jSONArrayOptJSONArray2 != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i11);
                    b bVar = new b();
                    bVar.f23277a = jSONObject3.getString("id");
                    bVar.f23278b = jSONObject3.optInt("perc", 10);
                    JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i12);
                        k kVar = new k();
                        kVar.f23301b = jSONObject4.getString("id");
                        kVar.f23302c = jSONObject4.getInt("perc");
                        JSONObject jSONObjectOptJSONObject2 = jSONObject4.optJSONObject("params");
                        if (jSONObjectOptJSONObject2 != null) {
                            kVar.f23305a = new o(jSONObjectOptJSONObject2);
                        }
                        bVar.f23279c.add(kVar);
                    }
                    b.a(bVar, jSONObject3.optJSONObject("include"), true);
                    b.a(bVar, jSONObject3.optJSONObject("exclude"), false);
                    qVar.f23307c.put(bVar.f23277a, bVar);
                }
            }
            lVar.f23303a.put(qVar.f23306b, qVar);
        }
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f23303a.equals(((l) obj).f23303a);
    }

    public final int hashCode() {
        return this.f23303a.hashCode();
    }

    public final String toString() {
        return String.format("remoteConfig - features: %s", this.f23303a.values());
    }
}
