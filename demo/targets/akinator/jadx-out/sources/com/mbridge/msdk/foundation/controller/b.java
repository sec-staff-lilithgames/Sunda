package com.mbridge.msdk.foundation.controller;

import android.util.Log;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, com.mbridge.msdk.foundation.cache.d> f40408a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.foundation.controller.b$b, reason: collision with other inner class name */
    public static class C0265b {

        /* renamed from: a, reason: collision with root package name */
        static b f40409a = new b();
    }

    public static b a() {
        return C0265b.f40409a;
    }

    public com.mbridge.msdk.foundation.cache.d b(String str, JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2;
        Exception e10;
        if (this.f40408a == null) {
            this.f40408a = new HashMap<>();
        }
        if (this.f40408a.containsKey(str)) {
            return this.f40408a.get(str);
        }
        if (jSONArray == null) {
            try {
                jSONArray2 = new JSONArray();
            } catch (Exception e11) {
                jSONArray2 = jSONArray;
                e10 = e11;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("c_cb", 0);
                jSONObject.put("t_disc", 0.95d);
                jSONObject.put("u_disc", 0.95d);
                jSONObject.put("max_ecppv_diff", 0);
                jSONObject.put("max_cache_num", 20);
                jSONObject.put("max_usage_limit", 10);
                jSONObject.put("time_interval", 7200);
                jSONArray2.put(jSONObject);
            } catch (Exception e12) {
                e10 = e12;
                Log.e("CandidateController", e10.getMessage());
                jSONArray = jSONArray2;
                return a(str, jSONArray);
            }
            jSONArray = jSONArray2;
        }
        return a(str, jSONArray);
    }

    private b() {
        this.f40408a = new HashMap<>();
    }

    public com.mbridge.msdk.foundation.cache.d a(String str, JSONArray jSONArray) {
        if (this.f40408a == null) {
            this.f40408a = new HashMap<>();
        }
        if (this.f40408a.containsKey(str)) {
            return this.f40408a.get(str);
        }
        com.mbridge.msdk.foundation.cache.d dVar = new com.mbridge.msdk.foundation.cache.d(str, jSONArray);
        this.f40408a.put(str, dVar);
        return dVar;
    }
}
