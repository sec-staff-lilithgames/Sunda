package com.bytedance.sdk.openadsdk.core.ju.xyk;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    private String f20566cm;

    /* renamed from: jd, reason: collision with root package name */
    private String f20567jd;
    private String jpo;
    private String my;
    private String wqx;

    public String cm() {
        return this.f20566cm;
    }

    public String jd() {
        return this.f20567jd;
    }

    public String jpo() {
        return this.jpo;
    }

    public String my() {
        return this.my;
    }

    public String wqx() {
        return this.wqx;
    }

    public jpo cm(String str) {
        this.f20566cm = str;
        return this;
    }

    public jpo jd(String str) {
        this.f20567jd = str;
        return this;
    }

    public jpo jpo(String str) {
        this.jpo = str;
        return this;
    }

    public jpo my(String str) {
        this.my = str;
        return this;
    }

    public jpo wqx(String str) {
        this.wqx = str;
        return this;
    }

    public JSONObject jpo(jpo jpoVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.jpo);
            jSONObject.put("md5", this.f20567jd);
            jSONObject.put("url", this.wqx);
            if (jpoVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", jpoVar.jpo());
                jSONObject2.put("md5", jpoVar.jd());
                jSONObject2.put("url", jpoVar.wqx());
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
