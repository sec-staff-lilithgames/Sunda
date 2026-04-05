package com.apm.insight.runtime;

import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, d> f13293a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f13294b = null;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f13295c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13296d = false;

    /* renamed from: e, reason: collision with root package name */
    private String f13297e;

    private d(JSONObject jSONObject, String str) {
        this.f13297e = str;
        a(jSONObject);
        f13293a.put(this.f13297e, this);
        com.apm.insight.a.a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f13294b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f13296d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    public static JSONObject b(String str) {
        d dVar = f13293a.get(str);
        if (dVar != null) {
            return dVar.f13294b;
        }
        return null;
    }

    public static d c(String str) {
        return f13293a.get(str);
    }

    public static long d(String str) {
        d dVar = f13293a.get(str);
        if (dVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.a.a(dVar.f13294b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean e(String str) {
        JSONObject jSONObject;
        d dVar = f13293a.get(str);
        return (dVar == null || (jSONObject = dVar.f13294b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean f(String str) {
        JSONObject jSONObject;
        d dVar = f13293a.get(str);
        return (dVar == null || (jSONObject = dVar.f13294b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean g(String str) {
        JSONObject jSONObject;
        d dVar = f13293a.get(str);
        return (dVar == null || (jSONObject = dVar.f13294b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public final boolean a() {
        if (this.f13294b == null) {
            return false;
        }
        return this.f13296d;
    }

    public static boolean a(String str) {
        return f13293a.get(str) != null;
    }

    public static void a(String str, JSONObject jSONObject) {
        d dVar = f13293a.get(str);
        if (dVar != null) {
            dVar.a(jSONObject);
        } else {
            new d(jSONObject, str);
        }
    }
}
