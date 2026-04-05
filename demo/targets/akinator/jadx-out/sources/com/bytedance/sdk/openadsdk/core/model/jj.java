package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {

    /* renamed from: qk, reason: collision with root package name */
    private int f20693qk;
    private String jpo = "";

    /* renamed from: jd, reason: collision with root package name */
    private String f20691jd = "";
    private String wqx = "";

    /* renamed from: cm, reason: collision with root package name */
    private String f20690cm = "";
    private double my = -1.0d;

    /* renamed from: jj, reason: collision with root package name */
    private int f20692jj = -1;

    public double cm() {
        return this.my;
    }

    public String jd() {
        return this.f20691jd;
    }

    public int jj() {
        return this.f20693qk;
    }

    public String jpo() {
        return this.jpo;
    }

    public int my() {
        return this.f20692jj;
    }

    public String qk() {
        return this.f20690cm;
    }

    public String wqx() {
        return this.wqx;
    }

    public JSONObject xyk() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", jd());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, jj());
            jSONObject.put("comment_num", my());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, jpo());
            jSONObject.put("package_name", wqx());
            jSONObject.put("score", cm());
            jSONObject.put("app_category", qk());
            return jSONObject;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.wqx(e10.toString(), new Object[0]);
            return jSONObject;
        }
    }

    public void cm(String str) {
        this.f20690cm = str;
    }

    public void jd(String str) {
        this.f20691jd = str;
    }

    public void jpo(String str) {
        this.jpo = str;
    }

    public void wqx(String str) {
        this.wqx = str;
    }

    public void jd(int i10) {
        this.f20693qk = i10;
    }

    public void jpo(double d10) {
        if (d10 >= 1.0d && d10 <= 5.0d) {
            this.my = d10;
        } else {
            this.my = -1.0d;
        }
    }

    public void jpo(int i10) {
        if (i10 <= 0) {
            this.f20692jj = -1;
        } else {
            this.f20692jj = i10;
        }
    }
}
