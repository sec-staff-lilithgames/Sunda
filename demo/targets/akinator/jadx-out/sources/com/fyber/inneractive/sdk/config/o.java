package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23336a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f23337b = new HashMap();

    public final String a(String str, String str2) {
        return this.f23336a.containsKey(str) ? (String) this.f23336a.get(str) : str2;
    }

    public final int b(String str, int i10, int i11) {
        int i12;
        try {
            i12 = Integer.parseInt(a(str, Integer.toString(i10)));
        } catch (Throwable unused) {
            i12 = i10;
        }
        return (i12 < i11 || i12 > 30) ? i10 : i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f23336a.equals(oVar.f23336a) && this.f23337b.equals(oVar.f23337b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23336a.hashCode();
    }

    public static o a(JSONObject jSONObject) {
        o oVar = new o();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("overrides");
        JSONArray jSONArrayNames = jSONObjectOptJSONObject.names();
        for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
            String strOptString = jSONArrayNames.optString(i10, null);
            String strOptString2 = jSONObjectOptJSONObject.optString(strOptString, null);
            if (strOptString != null && strOptString2 != null) {
                oVar.f23336a.put(strOptString, strOptString2);
            }
        }
        if (jSONObjectOptJSONObject2 != null) {
            JSONArray jSONArrayNames2 = jSONObjectOptJSONObject2.names();
            for (int i11 = 0; i11 < jSONArrayNames2.length(); i11++) {
                String strOptString3 = jSONArrayNames2.optString(i11, null);
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(strOptString3);
                if (strOptString3 != null && jSONObjectOptJSONObject3 != null) {
                    oVar.f23337b.put(strOptString3, new m(jSONObjectOptJSONObject3));
                }
            }
        }
        return oVar;
    }

    public final int a(String str, int i10, int i11) {
        try {
            i10 = Integer.parseInt(a(str, Integer.toString(i10)));
        } catch (Throwable unused) {
        }
        return Math.max(i10, i11);
    }

    public final boolean a(boolean z10, String str) {
        try {
            return Boolean.parseBoolean(a(str, Boolean.toString(z10)));
        } catch (Throwable unused) {
            return z10;
        }
    }

    public final l a(String str) {
        m mVar;
        String str2 = IAConfigManager.O.f23209d;
        if (this.f23337b.containsKey(str2)) {
            mVar = (m) this.f23337b.get(str2);
        } else {
            mVar = new m();
        }
        mVar.getClass();
        return mVar.f23333a.containsKey(str) ? (l) mVar.f23333a.get(str) : new l();
    }
}
