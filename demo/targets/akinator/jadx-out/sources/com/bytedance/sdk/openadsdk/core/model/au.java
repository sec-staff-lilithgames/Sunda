package com.bytedance.sdk.openadsdk.core.model;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au {

    /* renamed from: jd, reason: collision with root package name */
    private String f20573jd;
    private String jpo;
    private int wqx;

    public JSONObject cm() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_URL, this.jpo);
            jSONObject.put("ft", this.wqx);
            jSONObject.put("fu", this.f20573jd);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String jd() {
        return this.f20573jd;
    }

    public String jpo() {
        return this.jpo;
    }

    public int wqx() {
        return this.wqx;
    }

    public void jd(String str) {
        this.f20573jd = str;
    }

    public void jpo(String str) {
        this.jpo = str;
    }

    public void jpo(int i10) {
        this.wqx = i10;
    }
}
