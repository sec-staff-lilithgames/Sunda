package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class rv {

    /* renamed from: au, reason: collision with root package name */
    private int f20777au;

    /* renamed from: cm, reason: collision with root package name */
    private int f20778cm;
    private String hna;

    /* renamed from: if, reason: not valid java name */
    private int f136if;

    /* renamed from: jd, reason: collision with root package name */
    private int f20779jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f20780jj;
    private int jpo;

    /* renamed from: ju, reason: collision with root package name */
    private int f20781ju;
    private String my;
    private int oya;
    private String prr;

    /* renamed from: qk, reason: collision with root package name */
    private int f20782qk;

    /* renamed from: sq, reason: collision with root package name */
    private String f20783sq;
    private boolean wqx;
    private int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private boolean f20784yd;
    private int zz;

    public rv(JSONObject jSONObject) {
        this.f20781ju = 5;
        this.f136if = 5;
        this.f20777au = 10;
        this.oya = 20;
        this.prr = "Next Ad";
        this.hna = "Next ad in %1$ds";
        this.f20783sq = "Play Now";
        if (jSONObject == null) {
            return;
        }
        this.wqx = jSONObject.optBoolean("is_playable");
        this.f20778cm = jSONObject.optInt("playable_type", 0);
        this.my = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.f20780jj = jSONObjectOptJSONObject.optString("playable_url", "");
            this.f20782qk = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.f20779jd = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.jpo = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int iJpo = jpo(this.f20778cm);
            this.xyk = jSONObjectOptJSONObject.optInt("playable_webview_timeout", iJpo);
            this.zz = jSONObjectOptJSONObject.optInt("playable_js_timeout", iJpo);
            this.f20784yd = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
            this.f20781ju = jSONObjectOptJSONObject.optInt("wait_tips_time", 5);
            this.f136if = jSONObjectOptJSONObject.optInt("auto_to_next_time", 5);
            this.f20777au = jSONObjectOptJSONObject.optInt("next_ad_tips_show_time", 10);
            this.oya = jSONObjectOptJSONObject.optInt("max_show_time", 20);
            this.hna = jSONObjectOptJSONObject.optString("next_ad_in_xs");
            this.prr = jSONObjectOptJSONObject.optString("next_ad_text");
            this.f20783sq = jSONObjectOptJSONObject.optString("play_now_text");
        }
    }

    public static boolean au(dt dtVar) {
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarWw = dtVar.ww();
        return jdVarWw != null && jdVarWw.nmd() == 1;
    }

    public static String dt(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        if (rvVarHx == null) {
            return null;
        }
        return rvVarHx.jj();
    }

    public static int hmu(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        if (rvVarHx == null) {
            return 0;
        }
        return rvVarHx.jd();
    }

    public static long hna(dt dtVar) {
        return Math.max(sq(dtVar), opi(dtVar));
    }

    private static rv hx(dt dtVar) {
        if (dtVar == null) {
            return null;
        }
        return dtVar.sbx();
    }

    /* renamed from: if, reason: not valid java name */
    public static boolean m477if(dt dtVar) {
        return true;
    }

    private static int jpo(int i10) {
        return i10 == 1 ? 10 : 5;
    }

    public static boolean jr(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        return rvVarHx != null && rvVarHx.yd();
    }

    public static String ju(dt dtVar) {
        if (dtVar == null) {
            return null;
        }
        rv rvVarSbx = dtVar.sbx();
        if (rvVarSbx != null && rvVarSbx.wqx) {
            String str = rvVarSbx.f20780jj;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (dtVar.jkt() == 20) {
            return dtVar.iwg();
        }
        if (dtVar.ww() != null) {
            return dtVar.ww().m375if();
        }
        return null;
    }

    public static int nmd(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        if (rvVarHx == null) {
            return 0;
        }
        return rvVarHx.jpo();
    }

    public static int nq(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        if (rvVarHx == null) {
            return 0;
        }
        return rvVarHx.wqx();
    }

    public static long opi(dt dtVar) {
        if (hx(dtVar) == null) {
            return 5L;
        }
        return r2.zz();
    }

    public static int oya(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        if (rvVarHx == null) {
            return 0;
        }
        return rvVarHx.f20782qk;
    }

    private static int pdm(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        if (rvVarHx == null) {
            return 0;
        }
        return rvVarHx.f20778cm;
    }

    public static boolean prr(dt dtVar) {
        return false;
    }

    public static String rq(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        if (rvVarHx == null) {
            return null;
        }
        return rvVarHx.my();
    }

    public static int se(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        if (rvVarHx == null) {
            return 0;
        }
        return rvVarHx.cm();
    }

    public static long sq(dt dtVar) {
        if (hx(dtVar) == null) {
            return 5L;
        }
        return r2.xyk();
    }

    public static String tu(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        if (rvVarHx == null) {
            return null;
        }
        return rvVarHx.qk();
    }

    public static boolean xyk(dt dtVar) {
        rv rvVarSbx = dtVar.sbx();
        return rvVarSbx != null && dtVar.cgk() && rvVarSbx.wqx && rvVarSbx.f20779jd == 1;
    }

    public static String yd(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        if (rvVarHx == null) {
            return null;
        }
        return rvVarHx.f20780jj;
    }

    public static String zz(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        if (rvVarHx == null) {
            return null;
        }
        return rvVarHx.my;
    }

    public int cm() {
        return this.oya;
    }

    public int jd() {
        return this.f136if;
    }

    public String jj() {
        return this.hna;
    }

    public String my() {
        return this.prr;
    }

    public String qk() {
        return this.f20783sq;
    }

    public int wqx() {
        return this.f20777au;
    }

    public static boolean cm(dt dtVar) {
        return wqx(dtVar) && !qk(dtVar);
    }

    public static boolean jd(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        return (rvVarHx == null || !rvVarHx.wqx || TextUtils.isEmpty(ju(dtVar))) ? false : true;
    }

    public static boolean jj(dt dtVar) {
        return my(dtVar) && pdm(dtVar) == 1;
    }

    public static boolean my(dt dtVar) {
        rv rvVarHx = hx(dtVar);
        return rvVarHx != null && dtVar.cgk() && rvVarHx.wqx && !TextUtils.isEmpty(ju(dtVar));
    }

    public static boolean qk(dt dtVar) {
        rv rvVarSbx = dtVar.sbx();
        return rvVarSbx != null && rvVarSbx.wqx && rvVarSbx.f20779jd == 1;
    }

    public static boolean wqx(dt dtVar) {
        return jd(dtVar) && pdm(dtVar) == 1;
    }

    public int jpo() {
        return this.f20781ju;
    }

    public static int jpo(dt dtVar) {
        int i10;
        rv rvVarSbx = dtVar.sbx();
        if (rvVarSbx != null && (i10 = rvVarSbx.jpo) >= 0 && i10 <= 100) {
            return i10;
        }
        return 0;
    }

    public boolean yd() {
        return this.f20784yd;
    }

    public int zz() {
        return this.zz;
    }

    public int xyk() {
        return this.xyk;
    }

    public void jpo(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.wqx);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("PlayableModel", e10.getMessage());
        }
        if (!TextUtils.isEmpty(this.f20780jj)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.f20780jj);
                jSONObject2.put(QCmNMSGd.ZjEbGSuQoKjOc, this.f20782qk);
                jSONObject2.put("new_style", this.f20779jd);
                jSONObject2.put(TJzY.nidirEb, this.jpo);
                jSONObject2.put("playable_webview_timeout", this.xyk);
                jSONObject2.put("playable_js_timeout", this.zz);
                jSONObject2.put("playable_backup_enable", this.f20784yd ? 1 : 0);
                jSONObject2.put("wait_tips_time", this.f20781ju);
                jSONObject2.put("auto_to_next_time", this.f136if);
                jSONObject2.put("next_ad_tips_show_time", this.f20777au);
                jSONObject2.put("max_show_time", this.oya);
                jSONObject2.put("next_ad_in_xs", this.hna);
                jSONObject2.put("play_now_text", this.f20783sq);
                jSONObject2.put("next_ad_text", this.prr);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e11) {
                com.bytedance.sdk.component.utils.nmd.wqx("PlayableModel", e11.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", this.f20778cm);
        } catch (JSONException e12) {
            com.bytedance.sdk.component.utils.nmd.wqx("PlayableModel", e12.getMessage());
        }
        try {
            jSONObject.put("playable_style", this.my);
        } catch (JSONException e13) {
            com.bytedance.sdk.component.utils.nmd.wqx("PlayableModel", e13.getMessage());
        }
    }
}
