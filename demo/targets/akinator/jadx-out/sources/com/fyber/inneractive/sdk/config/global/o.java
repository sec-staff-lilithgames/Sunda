package com.fyber.inneractive.sdk.config.global;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f23304a;

    public o(JSONObject jSONObject) {
        this.f23304a = jSONObject;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final Integer a(String str) {
        if (this.f23304a.has(str)) {
            try {
                return Integer.valueOf(this.f23304a.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final String b(String str) {
        if (this.f23304a.has(str)) {
            try {
                return this.f23304a.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final Boolean c(String str) {
        if (this.f23304a.has(str)) {
            try {
                return Boolean.valueOf(this.f23304a.getBoolean(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String toString() {
        JSONObject jSONObject = this.f23304a;
        return jSONObject != null ? jSONObject.toString() : "no params";
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final String a(String str, String str2) {
        return this.f23304a.optString(str, str2);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final Map a() {
        HashMap map = new HashMap();
        Iterator<String> itKeys = this.f23304a.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                map.put(next, this.f23304a.get(next));
            } catch (Exception unused) {
            }
        }
        return map;
    }
}
