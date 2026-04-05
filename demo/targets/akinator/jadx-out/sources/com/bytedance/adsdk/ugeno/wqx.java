package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.Cif;
import com.bytedance.adsdk.ugeno.qk.xyk;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes2.dex */
public class wqx extends com.bytedance.adsdk.ugeno.jd.jpo<com.bytedance.adsdk.ugeno.jj.jd> {

    /* renamed from: as, reason: collision with root package name */
    private int f17960as;
    private int czp;
    private boolean ez;
    private com.bytedance.adsdk.ugeno.jd.wqx fgt;

    /* renamed from: gf, reason: collision with root package name */
    private String f17961gf;

    /* renamed from: hk, reason: collision with root package name */
    private float f17962hk;
    private float jrx;
    private boolean kgu;

    /* renamed from: lq, reason: collision with root package name */
    private float f17963lq;
    private float pzk;

    /* renamed from: sn, reason: collision with root package name */
    private JSONArray f17964sn;
    private String uhu;

    /* renamed from: ww, reason: collision with root package name */
    private boolean f17965ww;
    private float zmh;
    private float zrw;

    public wqx(Context context) {
        super(context);
        this.ez = true;
        this.kgu = true;
        this.jrx = 0.0f;
        this.f17963lq = 2000.0f;
        this.uhu = "normal";
        this.f17965ww = true;
        this.f17960as = Color.parseColor("#666666");
        this.czp = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo, com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException {
        super.jd();
        JSONArray jSONArray = this.f17964sn;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.jj.jd) this.my).qk((int) this.zrw).xyk((int) this.f17962hk).zz((int) this.zmh).wqx(this.f17965ww).my(this.czp).jj(this.f17960as).wqx(this.uhu).cm(this.ez).my(this.pzk).jpo(this.kgu).cm((int) this.f17963lq).wqx(this.f17965ww);
        for (int i10 = 0; i10 < this.f17964sn.length(); i10++) {
            Cif cif = new Cif(this.f17811jd);
            cif.jpo(this.f17841yq);
            com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVarJd = cif.jd(this.fgt.uu(), (com.bytedance.adsdk.ugeno.jd.wqx<View>) null);
            cif.jd(this.f17964sn.optJSONObject(i10));
            ((com.bytedance.adsdk.ugeno.jj.jd) this.my).jpo((com.bytedance.adsdk.ugeno.jj.jd) wqxVarJd);
        }
        if (this.kgu) {
            ((com.bytedance.adsdk.ugeno.jj.jd) this.my).wqx();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jpo(JSONObject jSONObject) {
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public View jpo() {
        com.bytedance.adsdk.ugeno.jj.jd jdVar = new com.bytedance.adsdk.ugeno.jj.jd(this.f17811jd);
        this.my = jdVar;
        jdVar.jpo((cm) this);
        return this.my;
    }

    public void jpo(com.bytedance.adsdk.ugeno.jj.wqx wqxVar) {
        T t10 = this.my;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.jj.jd) t10).setOnPageChangeListener(wqxVar);
        }
    }

    public void jpo(int i10) {
        T t10 = this.my;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.jj.jd) t10).au(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo
    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        this.fgt = wqxVar;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jpo(String str, String str2) {
        super.jpo(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1657957217:
                if (str.equals("delayStart")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1575751020:
                if (str.equals("indicatorColor")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1453344127:
                if (str.equals("nextMargin")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1306084975:
                if (str.equals("effect")) {
                    c10 = 3;
                    break;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    c10 = 4;
                    break;
                }
                break;
            case -711999985:
                if (str.equals(PtLatqAYjEFT.nnFI)) {
                    c10 = 5;
                    break;
                }
                break;
            case -202057851:
                if (str.equals("previousMargin")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    c10 = 7;
                    break;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 857882560:
                if (str.equals("pageCount")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1097821469:
                if (str.equals("pageMargin")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1196931001:
                if (str.equals("indicatorSelectedColor")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1788817256:
                if (str.equals("dataList")) {
                    c10 = '\r';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.jrx = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case 1:
                this.f17960as = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2);
                break;
            case 2:
                this.zmh = xyk.jpo(this.f17811jd, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f));
                break;
            case 3:
                this.uhu = str2;
                break;
            case 4:
                this.f17961gf = str2;
                break;
            case 5:
                this.f17965ww = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, true);
                break;
            case 6:
                this.f17962hk = xyk.jpo(this.f17811jd, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f));
                break;
            case 7:
                this.ez = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, true);
                break;
            case '\b':
                this.f17963lq = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 500.0f);
                break;
            case '\t':
                this.pzk = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 1.0f);
                break;
            case '\n':
                this.zrw = xyk.jpo(this.f17811jd, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f));
                break;
            case 11:
                this.czp = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2);
                break;
            case '\f':
                this.kgu = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, true);
                break;
            case '\r':
                this.f17964sn = com.bytedance.adsdk.ugeno.qk.jd.jpo(str2, (JSONArray) null);
                break;
        }
    }
}
