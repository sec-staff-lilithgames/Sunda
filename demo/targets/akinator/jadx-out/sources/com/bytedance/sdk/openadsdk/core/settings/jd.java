package com.bytedance.sdk.openadsdk.core.settings;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: au, reason: collision with root package name */
    public int f20863au;

    /* renamed from: cm, reason: collision with root package name */
    public int f20864cm;

    /* renamed from: dt, reason: collision with root package name */
    public List<String> f20865dt;
    public int hmu;
    public int hna;

    /* renamed from: hx, reason: collision with root package name */
    public int f20866hx;

    /* renamed from: if, reason: not valid java name */
    public int f140if;

    /* renamed from: jd, reason: collision with root package name */
    public int f20867jd;

    /* renamed from: jj, reason: collision with root package name */
    public int f20868jj;
    public String jpo;

    /* renamed from: jr, reason: collision with root package name */
    public int f20869jr;

    /* renamed from: ju, reason: collision with root package name */
    public int f20870ju;
    public JSONObject kln;
    public int my;
    public int nmd;

    /* renamed from: nq, reason: collision with root package name */
    public int f20871nq;
    public int opi;
    public int oya;
    public boolean pdm;
    public int prr;

    /* renamed from: qk, reason: collision with root package name */
    public int f20872qk;

    /* renamed from: rq, reason: collision with root package name */
    public boolean f20873rq;

    /* renamed from: rv, reason: collision with root package name */
    public boolean f20874rv;

    /* renamed from: se, reason: collision with root package name */
    public int f20875se;

    /* renamed from: sq, reason: collision with root package name */
    public int f20876sq;
    public int sz;

    /* renamed from: tu, reason: collision with root package name */
    public int f20877tu;

    /* renamed from: uu, reason: collision with root package name */
    public boolean f20878uu;
    public int wqx;
    public int xyk;

    /* renamed from: yd, reason: collision with root package name */
    public int f20879yd;
    public int zz;

    public jd(JSONObject jSONObject) {
        this.f20867jd = 1;
        this.wqx = 1;
        this.f20864cm = 2;
        this.my = 1;
        this.f20868jj = 100;
        this.f20872qk = 0;
        this.xyk = 2;
        this.zz = 1;
        this.f20879yd = 3;
        this.f20870ju = 30;
        this.f140if = 30;
        this.f20863au = 1;
        this.oya = 1;
        this.prr = 2;
        this.hna = 1500;
        this.f20876sq = 2;
        this.opi = 3500;
        this.f20869jr = 0;
        this.nmd = 5;
        this.f20873rq = false;
        this.f20877tu = 0;
        this.hmu = 2;
        this.f20871nq = 0;
        this.f20875se = 0;
        this.f20866hx = 5;
        this.pdm = true;
        this.f20874rv = false;
        this.f20878uu = false;
        this.sz = -1;
        new JSONObject();
        this.kln = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.jpo = jSONObject.optString("code_id");
        this.f20867jd = jSONObject.optInt("auto_play", 1);
        this.sz = jSONObject.optInt("endcard_close_time", -1);
        this.wqx = jSONObject.optInt("voice_control", 1);
        this.f20864cm = jSONObject.optInt("rv_preload", 2);
        this.my = jSONObject.optInt("nv_preload", 1);
        this.f20868jj = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.f20872qk = jSONObject.optInt("skip_time_displayed", 0);
        this.xyk = jSONObject.optInt("video_skip_result", 2);
        this.zz = jSONObject.optInt("reg_creative_control", 1);
        this.f20879yd = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.f20870ju = iOptInt;
        if (iOptInt < 0) {
            this.f20870ju = 30;
        }
        this.f20863au = jSONObject.optInt("voice_control", 2);
        this.oya = jSONObject.optInt("if_show_win", 1);
        this.prr = jSONObject.optInt("sp_preload", 2);
        this.hna = jSONObject.optInt("stop_time", 1500);
        this.f20876sq = jSONObject.optInt("native_playable_delay", 2);
        this.opi = jSONObject.optInt("time_out_control", -1);
        this.f20869jr = jSONObject.optInt("playable_reward_type", 0);
        this.f20877tu = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.nmd = iOptInt2;
        if (iOptInt2 < 0) {
            this.nmd = 5;
        }
        jpo(jSONObject.optJSONArray("parent_tpl_ids"));
        this.hmu = jSONObject.optInt("slot_type", 2);
        this.f20873rq = jSONObject.optBoolean("close_on_click", false);
        this.f20871nq = jSONObject.optInt("allow_system_back", 0);
        this.f20875se = jSONObject.optInt("splash_skip_time", 0);
        this.f20866hx = jSONObject.optInt("splash_image_count_down_time", 5);
        this.f20874rv = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.f20878uu = jSONObject.optBoolean("splash_close_on_click", false);
        this.pdm = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!jpo(this.wqx)) {
            this.wqx = 1;
        }
        if (!jpo(this.f20863au)) {
            this.f20863au = 1;
        }
        this.f140if = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean jpo(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public void jpo(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.f20865dt = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                this.f20865dt.add(jSONArray.get(i10).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public jd(String str, int i10) {
        this.f20867jd = 1;
        this.wqx = 1;
        this.f20864cm = 2;
        this.my = 1;
        this.f20868jj = 100;
        this.f20872qk = 0;
        this.xyk = 2;
        this.zz = 1;
        this.f20879yd = 3;
        this.f20870ju = 30;
        this.f140if = 30;
        this.f20863au = 1;
        this.oya = 1;
        this.prr = 2;
        this.hna = 1500;
        this.f20876sq = 2;
        this.opi = 3500;
        this.f20869jr = 0;
        this.nmd = 5;
        this.f20873rq = false;
        this.f20877tu = 0;
        this.hmu = 2;
        this.f20871nq = 0;
        this.f20875se = 0;
        this.f20866hx = 5;
        this.pdm = true;
        this.f20874rv = false;
        this.f20878uu = false;
        this.sz = -1;
        this.kln = new JSONObject();
        this.jpo = str;
        this.wqx = i10;
    }
}
