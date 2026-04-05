package com.bytedance.sdk.component.adexpress.dynamic.cm;

import android.graphics.Color;
import android.text.TextUtils;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.bytedance.sdk.component.adexpress.dynamic.my.ju;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {

    /* renamed from: cm, reason: collision with root package name */
    private jj f18196cm;

    /* renamed from: jd, reason: collision with root package name */
    public String f18197jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f18198jj;
    public int jpo;
    private my my;
    public JSONObject wqx;

    public qk(my myVar) {
        this.my = myVar;
        this.jpo = myVar.jpo();
        this.f18197jd = myVar.wqx();
        this.wqx = myVar.my().ree();
        this.f18198jj = myVar.cm();
        if (com.bytedance.sdk.component.adexpress.cm.wqx() == 1) {
            this.f18196cm = myVar.qk();
        } else {
            this.f18196cm = myVar.my();
        }
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            this.f18196cm = myVar.my();
        }
    }

    private boolean sg() {
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.f18197jd) && this.f18197jd.contains("adx:")) || ju.jd();
    }

    private boolean wu() {
        return (com.bytedance.sdk.component.adexpress.cm.jd() && (this.my.jd().contains("logo-union") || this.my.jd().contains("logounion") || this.my.jd().contains("logoad"))) || "logo-union".equals(this.my.jd()) || "logounion".equals(this.my.jd()) || "logoad".equals(this.my.jd());
    }

    public boolean aix() {
        return this.f18196cm.ykp();
    }

    public double au() throws NumberFormatException {
        if (this.jpo == 11) {
            try {
                return !com.bytedance.sdk.component.adexpress.cm.jd() ? (int) r0 : Double.parseDouble(this.f18197jd);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public boolean cgn() {
        return this.f18196cm.au();
    }

    public int cm() {
        return (int) this.f18196cm.hna();
    }

    public double cql() {
        return this.f18196cm.nzb();
    }

    public String dm() {
        return this.f18196cm.va();
    }

    public String dn() {
        return this.f18196cm.rv();
    }

    public int dt() {
        return this.f18196cm.xk();
    }

    public String duq() {
        return this.f18196cm.yd();
    }

    public int ef() {
        return this.f18196cm.cm();
    }

    public int erj() {
        return this.f18196cm.zw();
    }

    public int et() {
        return this.f18196cm.kln();
    }

    public int fy() {
        return this.f18196cm.zrw();
    }

    public boolean hks() {
        return this.f18196cm.sz();
    }

    public String hmu() {
        return this.f18196cm.tic();
    }

    public int hna() {
        return jpo(this.f18196cm.se());
    }

    public int huv() {
        return this.f18196cm.vzb();
    }

    public int hx() {
        String strTic = this.f18196cm.tic();
        if ("skip-with-time-skip-btn".equals(this.my.jd()) || "skip".equals(this.my.jd()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.my.jd())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.my.jd()) && !"skip-with-time".equals(this.my.jd())) {
            if (this.jpo == 10 && TextUtils.equals(this.f18196cm.va(), "click")) {
                return 5;
            }
            if (wu() && sg()) {
                return 0;
            }
            if (wu()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.my.jd())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strTic) && !strTic.equals("none")) {
                if (strTic.equals("video") || (this.my.jpo() == 7 && TextUtils.equals(strTic, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.cm.jd() && this.my.my() != null && this.my.my().fgt()) ? 11 : 4;
                }
                if (strTic.equals("normal")) {
                    return 1;
                }
                return (strTic.equals(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME) || "slide".equals(this.f18196cm.va())) ? 2 : 0;
            }
        }
        return 0;
    }

    public int ic() {
        return this.f18196cm.ww();
    }

    /* renamed from: if, reason: not valid java name */
    public String m405if() {
        return this.f18198jj;
    }

    public int ii() {
        return this.f18196cm.ef();
    }

    public int jd() {
        return (int) this.f18196cm.sq();
    }

    public String jj() {
        return this.jpo == 0 ? !TextUtils.isEmpty(this.f18197jd) ? this.f18197jd : this.wqx.optString(com.bytedance.sdk.component.adexpress.cm.qk.wqx(com.bytedance.sdk.component.adexpress.cm.jpo())) : "";
    }

    public String jkt() {
        return this.f18196cm.hk();
    }

    public int jpo() {
        return (int) this.f18196cm.oya();
    }

    public int jr() {
        return this.f18196cm.pzk();
    }

    public String ju() {
        return this.jpo == 1 ? this.f18197jd : "";
    }

    public boolean kb() {
        return this.f18196cm.gf();
    }

    public int kln() {
        return this.f18196cm.my();
    }

    public float my() {
        return this.f18196cm.opi();
    }

    public boolean nmd() {
        return this.f18196cm.czp();
    }

    public String nq() {
        return this.f18196cm.zq();
    }

    public int nzb() {
        return this.f18196cm.zz();
    }

    public int opi() {
        return this.f18196cm.as();
    }

    public double ota() {
        return this.f18196cm.duq();
    }

    public double oya() {
        return this.f18196cm.jr();
    }

    public int pdm() {
        return jpo(this.f18196cm.dt());
    }

    public boolean pe() {
        return this.f18196cm.np();
    }

    public float prr() {
        return this.f18196cm.ju();
    }

    public int qk() {
        return jpo(this.f18196cm.tu());
    }

    public String ree() {
        return this.f18196cm.kye();
    }

    public String roc() {
        return this.f18196cm.dm();
    }

    public String rq() {
        return this.f18196cm.hmu();
    }

    public double rv() {
        return this.f18196cm.xyk();
    }

    public String rxq() {
        return this.f18196cm.uu();
    }

    public String sbx() {
        return this.f18196cm.ez();
    }

    public long se() {
        return this.f18196cm.fp();
    }

    public float sq() {
        return this.f18196cm.m400if();
    }

    public int sz() {
        return this.f18196cm.jd();
    }

    public boolean tic() {
        return this.f18196cm.aix();
    }

    public int tl() {
        return this.f18196cm.eq();
    }

    public boolean tu() {
        return this.f18196cm.pe();
    }

    public int uu() {
        return this.f18196cm.wqx();
    }

    public String ux() {
        return this.f18196cm.nq();
    }

    public int va() {
        return this.f18196cm.erj();
    }

    public int vk() {
        return this.f18196cm.rzi();
    }

    public String voc() {
        return this.f18196cm.yq();
    }

    public int vrc() {
        return this.f18196cm.tl();
    }

    public int wad() {
        return this.f18196cm.kgu();
    }

    public boolean wcn() {
        return this.f18196cm.gf();
    }

    public int wqx() {
        return (int) this.f18196cm.prr();
    }

    public int xk() {
        return this.f18196cm.qk();
    }

    public int xyk() {
        String strRq = this.f18196cm.rq();
        if (TtmlNode.LEFT.equals(strRq)) {
            return 17;
        }
        if (TtmlNode.CENTER.equals(strRq)) {
            return 4;
        }
        return TtmlNode.RIGHT.equals(strRq) ? 3 : 2;
    }

    public int ya() {
        return this.f18196cm.umr();
    }

    public String yd() {
        int i10 = this.jpo;
        return (i10 == 2 || i10 == 13) ? this.f18197jd : "";
    }

    public int zz() {
        int iXyk = xyk();
        if (iXyk == 4) {
            return 17;
        }
        return iXyk == 3 ? 8388613 : 8388611;
    }

    public static float[] jd(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    public void jpo(float f10) {
        this.f18196cm.jpo(f10);
    }

    public static int jpo(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals(C3191e4.h.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return -16777216;
    }

    public boolean jpo(int i10) {
        my myVar = this.my;
        if (myVar == null) {
            return false;
        }
        if (i10 == 1) {
            this.f18196cm = myVar.qk();
        } else {
            this.f18196cm = myVar.my();
        }
        return this.f18196cm != null;
    }
}
