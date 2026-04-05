package com.bykv.vk.openvk.jpo.jpo.jpo.wqx;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.ktor.http.ContentDisposition;
import org.json.JSONException;
import org.json.JSONObject;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jd {

    /* renamed from: au, reason: collision with root package name */
    private int f16746au;

    /* renamed from: cm, reason: collision with root package name */
    private double f16747cm;

    /* renamed from: if, reason: not valid java name */
    private int f2if;

    /* renamed from: jd, reason: collision with root package name */
    private int f16748jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f16749jj;
    private int jpo;

    /* renamed from: ju, reason: collision with root package name */
    private double f16751ju;
    private String my;

    /* renamed from: qk, reason: collision with root package name */
    private String f16752qk;
    private long wqx;
    private String xyk;

    /* renamed from: yd, reason: collision with root package name */
    private String f16754yd;
    private String zz;
    private float oya = -1.0f;
    private int prr = 0;
    private int hna = 0;

    /* renamed from: sq, reason: collision with root package name */
    private int f16753sq = 0;
    private int opi = 0;

    /* renamed from: jr, reason: collision with root package name */
    private int f16750jr = 307200;
    private int nmd = 1;

    public String au() {
        return this.zz;
    }

    public int cm() {
        return this.f16746au;
    }

    public int hna() {
        return this.f16753sq;
    }

    /* renamed from: if, reason: not valid java name */
    public String m375if() {
        return this.xyk;
    }

    public int jd() {
        return this.jpo;
    }

    public double jj() {
        return this.f16747cm;
    }

    public int jpo() {
        return this.f2if;
    }

    public int jr() {
        return this.prr;
    }

    public String ju() {
        return this.f16752qk;
    }

    public long my() {
        return this.wqx;
    }

    public int nmd() {
        return this.hna;
    }

    public String oya() {
        if (TextUtils.isEmpty(this.f16754yd)) {
            this.f16754yd = com.bykv.vk.openvk.jpo.jpo.jpo.qk.jd.jpo(this.f16752qk);
        }
        return this.f16754yd;
    }

    public int prr() {
        if (this.f16750jr < 0) {
            this.f16750jr = 307200;
        }
        long j10 = this.f16750jr;
        long j11 = this.wqx;
        if (j10 > j11) {
            this.f16750jr = (int) j11;
        }
        return this.f16750jr;
    }

    public double qk() {
        return this.f16751ju;
    }

    public boolean rq() {
        return this.f16753sq == 0;
    }

    public int sq() {
        return this.opi;
    }

    public int tu() {
        return this.nmd;
    }

    public int wqx() {
        return this.f16748jd;
    }

    public float xyk() {
        return this.oya;
    }

    public String yd() {
        return this.f16749jj;
    }

    public String zz() {
        return this.my;
    }

    public void cm(int i10) {
        this.f16746au = i10;
    }

    public void jd(int i10) {
        this.jpo = i10;
    }

    public void jj(String str) {
        this.f16754yd = str;
    }

    public void jpo(int i10) {
        this.f2if = i10;
    }

    public void my(String str) {
        this.zz = str;
    }

    public JSONObject opi() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", jd());
            jSONObject.put("cover_url", yd());
            jSONObject.put("cover_width", wqx());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, m375if());
            jSONObject.put("file_hash", oya());
            jSONObject.put("resolution", zz());
            jSONObject.put(ContentDisposition.Parameters.Size, my());
            jSONObject.put("video_duration", jj());
            jSONObject.put("video_url", ju());
            jSONObject.put("playable_download_url", au());
            jSONObject.put("if_playable_loading_show", jr());
            jSONObject.put("remove_loading_page_type", nmd());
            jSONObject.put("fallback_endcard_judge", jpo());
            jSONObject.put("video_preload_size", prr());
            jSONObject.put(VPCjETNfjxu.UvgnplQjXxLoOlS, hna());
            jSONObject.put("execute_cached_type", sq());
            jSONObject.put("endcard_render", cm());
            jSONObject.put("replay_time", tu());
            jSONObject.put("play_speed_ratio", xyk());
            if (qk() > 0.0d) {
                jSONObject.put("start", qk());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void qk(int i10) {
        this.opi = i10;
    }

    public void wqx(int i10) {
        this.f16748jd = i10;
    }

    public void xyk(int i10) {
        this.prr = i10;
    }

    public void yd(int i10) {
        this.nmd = Math.min(4, Math.max(1, i10));
    }

    public void zz(int i10) {
        this.hna = i10;
    }

    public void cm(String str) {
        this.xyk = str;
    }

    public void jd(String str) {
        this.f16749jj = str;
    }

    public void jj(int i10) {
        this.f16753sq = i10;
    }

    public void jpo(long j10) {
        this.wqx = j10;
    }

    public void my(int i10) {
        this.f16750jr = i10;
    }

    public void wqx(String str) {
        this.f16752qk = str;
    }

    public void jpo(double d10) {
        this.f16747cm = d10;
    }

    public void jpo(String str) {
        this.my = str;
    }
}
