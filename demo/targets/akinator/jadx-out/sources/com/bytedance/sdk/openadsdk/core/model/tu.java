package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class tu {
    private String jpo = "horizontal";

    /* renamed from: jd, reason: collision with root package name */
    private int f20797jd = 1;
    private int wqx = 1;

    /* renamed from: cm, reason: collision with root package name */
    private int f20796cm = 0;
    private int my = 0;

    /* renamed from: jj, reason: collision with root package name */
    private int f20798jj = 0;

    /* renamed from: qk, reason: collision with root package name */
    private int f20799qk = 0;
    private int xyk = 5000;
    private int zz = 500;

    /* renamed from: yd, reason: collision with root package name */
    private int f20800yd = 0;

    public int cm() {
        return this.f20796cm;
    }

    public int jd() {
        return this.f20797jd;
    }

    public int jj() {
        return this.f20798jj;
    }

    public String jpo() {
        return this.jpo;
    }

    public int my() {
        return this.my;
    }

    public int qk() {
        return this.f20799qk;
    }

    public int wqx() {
        return this.wqx;
    }

    public int xyk() {
        return this.xyk;
    }

    public int yd() {
        return this.f20800yd;
    }

    public int zz() {
        return this.zz;
    }

    public static tu jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new tu();
        }
        tu tuVar = new tu();
        tuVar.jpo = jSONObject.optString("direction", "horizontal");
        tuVar.f20797jd = jSONObject.optInt("auto_loop", 1);
        tuVar.wqx = jSONObject.optInt("allow_manual_loop", 1);
        tuVar.f20796cm = jSONObject.optInt("unlimited_loop", 0);
        tuVar.my = jSONObject.optInt("left_margin", 0);
        tuVar.f20798jj = jSONObject.optInt("right_margin", 0);
        tuVar.f20799qk = jSONObject.optInt("ad_margin", 0);
        tuVar.xyk = jSONObject.optInt("loop_interval_time", 5000);
        tuVar.zz = jSONObject.optInt("flip_speed", 500);
        tuVar.f20800yd = jSONObject.optInt("stop_auto_loop", 0);
        return tuVar;
    }

    public JSONObject ju() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("direction", this.jpo);
            jSONObject.put("auto_loop", this.f20797jd);
            jSONObject.put(GalEuEfxjome.KQyWxFtZSk, this.wqx);
            jSONObject.put("unlimited_loop", this.f20796cm);
            jSONObject.put("left_margin", this.my);
            jSONObject.put("right_margin", this.f20798jj);
            jSONObject.put("ad_margin", this.f20799qk);
            jSONObject.put("loop_interval_time", this.xyk);
            jSONObject.put("flip_speed", this.zz);
            jSONObject.put("stop_auto_loop", this.f20800yd);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
