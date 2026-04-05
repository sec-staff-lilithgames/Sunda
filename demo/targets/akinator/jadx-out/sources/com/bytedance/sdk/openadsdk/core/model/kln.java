package com.bytedance.sdk.openadsdk.core.model;

import io.ktor.http.LinkHeader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class kln {

    /* renamed from: cm, reason: collision with root package name */
    private String f20708cm;

    /* renamed from: jd, reason: collision with root package name */
    private String f20709jd;

    /* renamed from: jj, reason: collision with root package name */
    private jpo f20710jj;
    private String jpo;
    private JSONObject my;
    private String wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        private JSONArray f20711jd;
        private JSONArray jpo;
        private JSONArray wqx;

        public JSONObject cm() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("image", this.jpo);
                jSONObject.put("fetch", this.f20711jd);
                jSONObject.put("script", this.wqx);
                return jSONObject;
            } catch (JSONException e10) {
                e10.getMessage();
                return jSONObject;
            }
        }

        public JSONArray jd() {
            return this.f20711jd;
        }

        public JSONArray jpo() {
            return this.jpo;
        }

        public JSONArray wqx() {
            return this.wqx;
        }

        public void jd(JSONArray jSONArray) {
            this.f20711jd = jSONArray;
        }

        public void jpo(JSONArray jSONArray) {
            this.jpo = jSONArray;
        }

        public void wqx(JSONArray jSONArray) {
            this.wqx = jSONArray;
        }

        public static jpo jpo(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            jpo jpoVar = new jpo();
            jpoVar.jpo(jSONArrayOptJSONArray);
            jpoVar.jd(jSONObject.optJSONArray("fetch"));
            jpoVar.wqx(jSONObject.optJSONArray("script"));
            return jpoVar;
        }
    }

    public String cm() {
        return this.f20708cm;
    }

    public String jd() {
        return this.f20709jd;
    }

    public jpo jj() {
        return this.f20710jj;
    }

    public String jpo() {
        return this.jpo;
    }

    public JSONObject my() {
        return this.my;
    }

    public JSONObject qk() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.jpo);
            jSONObject.put("md5", this.f20709jd);
            jSONObject.put("url", this.wqx);
            jSONObject.put("data", this.f20708cm);
            jSONObject.put("custom_components", this.my);
            jpo jpoVar = this.f20710jj;
            if (jpoVar != null) {
                jSONObject.put(LinkHeader.Rel.PreLoad, jpoVar.cm());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String wqx() {
        return this.wqx;
    }

    public static kln jpo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        kln klnVar = new kln();
        klnVar.jpo = jSONObject.optString("id");
        klnVar.f20708cm = jSONObject.optString("data");
        klnVar.wqx = jSONObject.optString("url");
        klnVar.f20709jd = jSONObject.optString("md5");
        klnVar.my = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(LinkHeader.Rel.PreLoad);
        if (jSONObjectOptJSONObject != null) {
            klnVar.f20710jj = jpo.jpo(jSONObjectOptJSONObject);
        }
        return klnVar;
    }
}
