package com.ironsource;

import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.pa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3395pa {

    /* renamed from: a, reason: collision with root package name */
    private String f38164a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f38165b;

    /* renamed from: c, reason: collision with root package name */
    private String f38166c;

    /* renamed from: d, reason: collision with root package name */
    private String f38167d;

    public C3395pa(JSONObject jSONObject) {
        this.f38164a = jSONObject.optString(C3191e4.f.f36436b);
        this.f38165b = jSONObject.optJSONObject(C3191e4.f.f36437c);
        this.f38166c = jSONObject.optString("success");
        this.f38167d = jSONObject.optString(C3191e4.f.f36439e);
    }

    public String a() {
        return this.f38167d;
    }

    public String b() {
        return this.f38164a;
    }

    public JSONObject c() {
        return this.f38165b;
    }

    public String d() {
        return this.f38166c;
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C3191e4.f.f36436b, this.f38164a);
            jSONObject.put(C3191e4.f.f36437c, this.f38165b);
            jSONObject.put("success", this.f38166c);
            jSONObject.put(C3191e4.f.f36439e, this.f38167d);
            return jSONObject;
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }
}
