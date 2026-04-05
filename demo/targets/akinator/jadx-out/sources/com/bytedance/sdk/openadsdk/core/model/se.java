package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class se {

    /* renamed from: cm, reason: collision with root package name */
    private String f20785cm = "Next Ad";

    /* renamed from: jd, reason: collision with root package name */
    private int f20786jd;
    private int jpo;
    private int wqx;

    public int cm() {
        return this.jpo;
    }

    public int jd() {
        return this.f20786jd;
    }

    public int jpo() {
        return this.wqx;
    }

    public JSONObject my() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.jpo;
            if (i10 != -1) {
                jSONObject.put("endcard_show_time", i10);
            }
            jSONObject.put("is_allow_pause", this.f20786jd);
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, this.wqx);
            if (!TextUtils.isEmpty(this.f20785cm)) {
                jSONObject.put("endcard_next_ad_text", this.f20785cm);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String wqx() {
        return this.f20785cm;
    }

    public void jd(int i10) {
        this.f20786jd = i10;
    }

    public void jpo(int i10) {
        this.wqx = i10;
    }

    public void wqx(int i10) {
        this.jpo = i10;
    }

    public void jpo(String str) {
        this.f20785cm = str;
    }

    public static se jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        se seVar = new se();
        try {
            int iMax = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int iOptInt = jSONObject.optInt("is_allow_pause", 0);
            int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_KEY_LANDING_TYPE, 0);
            String strOptString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            seVar.wqx(iMax);
            seVar.jd(iOptInt);
            seVar.jpo(strOptString);
            seVar.jpo(iOptInt2);
        } catch (Throwable unused) {
        }
        return seVar;
    }
}
