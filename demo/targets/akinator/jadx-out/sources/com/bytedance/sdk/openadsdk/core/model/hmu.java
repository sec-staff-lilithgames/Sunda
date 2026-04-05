package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hmu {

    /* renamed from: cm, reason: collision with root package name */
    private final int f20648cm;

    /* renamed from: jd, reason: collision with root package name */
    private final int f20649jd;
    private final int jpo;
    private final int wqx;

    public hmu(JSONObject jSONObject) {
        this.jpo = jSONObject.optInt("max_time", 0);
        this.f20649jd = jSONObject.optInt("auto_skip_time", -1);
        this.wqx = jSONObject.optInt("show_after_inactivity", 10);
        this.f20648cm = jSONObject.optInt("user_wait_time", 10);
    }

    public JSONObject cm() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("max_time", this.jpo);
            jSONObject.put("auto_skip_time", this.f20649jd);
            jSONObject.put("show_after_inactivity", this.wqx);
            jSONObject.put("user_wait_time", this.f20648cm);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public int jd() {
        return this.wqx;
    }

    public int jpo() {
        return this.jpo;
    }

    public int wqx() {
        return this.f20648cm;
    }
}
