package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nq {

    /* renamed from: au, reason: collision with root package name */
    private int f20753au;

    /* renamed from: cm, reason: collision with root package name */
    private int f20754cm;

    /* renamed from: if, reason: not valid java name */
    private JSONObject f135if;

    /* renamed from: jj, reason: collision with root package name */
    private int f20756jj;
    private int jpo;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f20757ju;
    private int my;
    private kln opi;
    private int oya;

    /* renamed from: qk, reason: collision with root package name */
    private JSONObject f20758qk;
    private int wqx;
    private String zz;

    /* renamed from: jd, reason: collision with root package name */
    private int f20755jd = 10;
    private int xyk = 1;

    /* renamed from: yd, reason: collision with root package name */
    private jpo f20760yd = new jpo();
    private int prr = 1;
    private String hna = "Next Ad";

    /* renamed from: sq, reason: collision with root package name */
    private String f20759sq = "Next ad in %1$ds";

    public static nq jpo(String str) {
        nq nqVar = new nq();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                nqVar.jpo = jSONObject.optInt("auto_switch");
                nqVar.f20755jd = jSONObject.optInt("playable_preload_count");
                nqVar.wqx = jSONObject.optInt("disable_on_interaction");
                nqVar.f20754cm = jSONObject.optInt("ceiling_type");
                nqVar.my = jSONObject.optInt("can_loop");
                nqVar.f20756jj = jSONObject.optInt("multi_skip_time", -1);
                nqVar.xyk = jSONObject.optInt("load_more_strategy");
                nqVar.prr = jSONObject.optInt("report_show_by_percent", 1);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gesture_tpl_info");
                nqVar.f20758qk = jSONObjectOptJSONObject;
                if (jSONObjectOptJSONObject != null) {
                    kln klnVarJpo = kln.jpo(jSONObjectOptJSONObject);
                    nqVar.opi = klnVarJpo;
                    if (klnVarJpo != null && !TextUtils.isEmpty(klnVarJpo.wqx())) {
                        com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo().jpo(new com.bytedance.sdk.openadsdk.core.ju.xyk.jpo().jpo(nqVar.opi.jpo()).jd(nqVar.opi.jd()).wqx(nqVar.opi.wqx()).cm(nqVar.opi.cm()), "guide");
                    }
                    int iOptInt = nqVar.f20758qk.optInt("delay_show_time", 5);
                    nqVar.f20753au = iOptInt;
                    if (iOptInt < 0) {
                        nqVar.f20753au = 5;
                    }
                    int iOptInt2 = nqVar.f20758qk.optInt("dismiss_after_idle_time", 3);
                    nqVar.oya = iOptInt2;
                    if (iOptInt2 <= 0) {
                        nqVar.oya = 3;
                    }
                }
                nqVar.zz = jSONObject.optString("agg_endcard_url");
                nqVar.f20757ju = jSONObject.optBoolean("has_more");
                nqVar.f135if = jSONObject.optJSONObject("session_params");
                nqVar.f20760yd = jpo.jpo(jSONObject.optJSONObject("layout_config"));
            } catch (JSONException unused) {
            }
        }
        return nqVar;
    }

    public boolean au() {
        return this.f20757ju;
    }

    public int cm() {
        return this.f20753au;
    }

    public int hna() {
        return this.f20755jd;
    }

    /* renamed from: if, reason: not valid java name */
    public JSONObject m476if() {
        return this.f135if;
    }

    public JSONObject jd() {
        kln klnVar = this.opi;
        if (klnVar == null) {
            return null;
        }
        try {
            String strCm = klnVar.cm();
            if (!TextUtils.isEmpty(strCm)) {
                return new JSONObject(strCm);
            }
            String strJpo = com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo().jpo("guide", this.opi.jpo(), this.opi.jd());
            if (TextUtils.isEmpty(strJpo)) {
                return null;
            }
            return new JSONObject(strJpo);
        } catch (JSONException unused) {
            return null;
        }
    }

    public jpo jj() {
        return this.f20760yd;
    }

    public boolean ju() {
        return this.f20754cm == 1;
    }

    public int my() {
        return this.oya;
    }

    public boolean oya() {
        return this.wqx == 1;
    }

    public boolean prr() {
        return this.jpo == 1;
    }

    public String qk() {
        return this.zz;
    }

    public JSONObject sq() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auto_switch", this.jpo);
            jSONObject.put("playable_preload_count", this.f20755jd);
            jSONObject.put("disable_on_interaction", this.wqx);
            jSONObject.put("ceiling_type", this.f20754cm);
            jSONObject.put("can_loop", this.my);
            jSONObject.put("multi_skip_time", this.f20756jj);
            jSONObject.put("load_more_strategy", this.xyk);
            jSONObject.put("report_show_by_percent", this.prr);
            jSONObject.put("gesture_tpl_info", this.f20758qk);
            jSONObject.put("agg_endcard_url", this.zz);
            jSONObject.put("layoutConfig", this.f20760yd.jj());
            jSONObject.put("has_more", this.f20757ju);
            jSONObject.put("session_params", this.f135if);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONObject wqx() {
        kln klnVar = this.opi;
        if (klnVar == null) {
            return null;
        }
        return klnVar.my();
    }

    public int xyk() {
        return this.xyk;
    }

    public boolean yd() {
        return this.my == 1;
    }

    public int zz() {
        return this.f20756jj;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        private int f20761cm;

        /* renamed from: jd, reason: collision with root package name */
        private int f20762jd;
        private int jpo;
        private int my;
        private int wqx;

        public static jpo jpo(JSONObject jSONObject) {
            jpo jpoVar = new jpo();
            if (jSONObject == null) {
                return jpoVar;
            }
            jpoVar.jpo = Math.max(0, jSONObject.optInt("padding_left", 0));
            jpoVar.f20762jd = Math.max(0, jSONObject.optInt("padding_right", 0));
            jpoVar.wqx = Math.max(0, jSONObject.optInt("padding_top", 0));
            jpoVar.f20761cm = Math.max(0, jSONObject.optInt("padding_bottom", 0));
            jpoVar.my = Math.max(0, jSONObject.optInt("card_spacing", 0));
            return jpoVar;
        }

        public int cm() {
            return this.f20762jd;
        }

        public int jd() {
            return this.wqx;
        }

        public JSONObject jj() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("padding_left", this.jpo);
                jSONObject.put("padding_right", this.f20762jd);
                jSONObject.put("padding_top", this.wqx);
                jSONObject.put("padding_bottom", this.f20761cm);
                jSONObject.put("card_spacing", this.my);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public int my() {
            return this.my;
        }

        public int wqx() {
            return this.jpo;
        }

        public int jpo() {
            return this.f20761cm;
        }
    }

    public boolean jpo() {
        return this.prr == 1;
    }
}
