package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: cm, reason: collision with root package name */
    private String f20688cm;

    /* renamed from: jd, reason: collision with root package name */
    private String f20689jd;
    private String jpo;
    private boolean my;
    private String wqx;

    public String cm() {
        return this.f20688cm;
    }

    public String jd() {
        return this.f20689jd;
    }

    public JSONObject jj() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PRIVACY_URL, this.wqx);
            jSONObject.put("privacy_title", this.f20688cm);
            jSONObject.put("text", this.f20689jd);
            jSONObject.put("icon", this.jpo);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.jpo = jSONObject.optString("icon");
        this.f20689jd = jSONObject.optString("text");
        this.wqx = jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL);
        this.f20688cm = jSONObject.optString("privacy_title");
    }

    public boolean my() {
        return this.my;
    }

    public String wqx() {
        return this.wqx;
    }

    public String jpo() {
        return this.jpo;
    }

    public void jpo(boolean z10) {
        this.my = z10;
    }
}
