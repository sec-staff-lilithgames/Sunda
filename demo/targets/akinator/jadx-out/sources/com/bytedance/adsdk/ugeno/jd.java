package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.cm.jj;
import com.bytedance.adsdk.ugeno.cm.zz;
import com.bytedance.adsdk.ugeno.core.Cif;
import com.bytedance.adsdk.ugeno.qk.xyk;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends com.bytedance.adsdk.ugeno.jd.jpo<com.bytedance.adsdk.ugeno.jj.jd> implements com.bytedance.adsdk.ugeno.jj.wqx {

    /* renamed from: as, reason: collision with root package name */
    private float f17770as;
    private boolean clt;
    private float czp;
    private boolean ez;
    private boolean fgt;

    /* renamed from: fp, reason: collision with root package name */
    private int f17771fp;
    private float fri;

    /* renamed from: gf, reason: collision with root package name */
    private int f17772gf;

    /* renamed from: hk, reason: collision with root package name */
    private int f17773hk;
    private float iwg;
    private float jrx;
    private boolean kgu;
    private JSONArray kye;

    /* renamed from: lq, reason: collision with root package name */
    private float f17774lq;

    /* renamed from: mg, reason: collision with root package name */
    private int f17775mg;

    /* renamed from: ou, reason: collision with root package name */
    private float f17776ou;
    private boolean ozw;
    private float pzk;

    /* renamed from: ql, reason: collision with root package name */
    private int f17777ql;

    /* renamed from: sn, reason: collision with root package name */
    private float f17778sn;
    private boolean ted;
    private String uhu;

    /* renamed from: ww, reason: collision with root package name */
    private String f17779ww;

    /* renamed from: xp, reason: collision with root package name */
    private boolean f17780xp;
    private String zmh;

    /* renamed from: zq, reason: collision with root package name */
    private float f17781zq;
    private int zrw;

    public jd(Context context) {
        super(context);
        this.f17772gf = 0;
        this.ez = true;
        this.kgu = true;
        this.jrx = 500.0f;
        this.f17774lq = 2000.0f;
        this.uhu = "slide";
        this.f17779ww = "dot";
        this.f17770as = 8.0f;
        this.czp = 8.0f;
        this.pzk = 50.0f;
        this.f17778sn = 90.0f;
        this.fgt = false;
        this.zrw = Color.parseColor("#666666");
        this.f17773hk = Color.parseColor("#ffffff");
        this.zmh = "row";
        this.f17776ou = 1.0f;
        this.iwg = 0.0f;
        this.fri = 0.0f;
        this.f17781zq = 0.0f;
        this.f17771fp = 0;
        this.f17775mg = 0;
        this.ted = true;
        this.ozw = false;
        this.f17780xp = true;
        float fJpo = xyk.jpo(this.f17811jd, 8.0f);
        this.f17770as = fJpo;
        this.czp = fJpo;
    }

    private int cgn() {
        if (this.f17771fp == 1) {
            List<com.bytedance.adsdk.ugeno.jd.wqx<View>> list = ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        JSONArray jSONArray = this.kye;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    private void jkt() throws JSONException {
        for (int i10 = 0; i10 < ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo.size(); i10++) {
            com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar = ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo.get(i10);
            if (wqxVar != null) {
                Cif cif = new Cif(this.f17811jd);
                jpo(cif);
                cif.jpo(this.f17841yq);
                ((com.bytedance.adsdk.ugeno.jj.jd) this.my).jpo((com.bytedance.adsdk.ugeno.jj.jd) cif.jpo(wqxVar.uu(), this.f17797cm, (JSONObject) null));
            }
        }
    }

    private void qk(int i10) {
        if (this.vzb == null) {
            return;
        }
        if (this.f17777ql == 0 && i10 == cgn() - 1) {
            this.vzb.jpo("SwiperView://reloop", 1);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor FIRST_TO_LAST");
        }
        if (this.f17777ql == cgn() - 1 && i10 == 0) {
            this.vzb.jpo("SwiperView://reloop", 0);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor LAST_TO_FIRST");
        }
    }

    private void sbx() {
        List<com.bytedance.adsdk.ugeno.jd.wqx<View>> list = ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar = ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo.get(0);
        if (this.kye == null) {
            return;
        }
        for (int i10 = 0; i10 < this.kye.length(); i10++) {
            Cif cif = new Cif(this.f17811jd);
            jpo(cif);
            cif.jpo(this.f17841yq);
            try {
                JSONObject jSONObjectOptJSONObject = this.kye.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.f17797cm.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.f17797cm.put("$item", jSONObjectOptJSONObject);
                    }
                    ((com.bytedance.adsdk.ugeno.jj.jd) this.my).jpo((com.bytedance.adsdk.ugeno.jj.jd) cif.jpo(wqxVar.uu(), this.f17797cm, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void xyk(int i10) {
        zz zzVar = this.vzb;
        if (zzVar == null) {
            return;
        }
        zzVar.jpo("SwiperView://slide", Integer.valueOf(this.f17777ql), Integer.valueOf(i10), Integer.valueOf(!this.clt ? 1 : 0));
    }

    public void cm() throws Resources.NotFoundException {
        ((com.bytedance.adsdk.ugeno.jj.jd) this.my).au(((com.bytedance.adsdk.ugeno.jj.jd) this.my).getCurrentItem() - 1);
    }

    public void wqx() throws Resources.NotFoundException {
        ((com.bytedance.adsdk.ugeno.jj.jd) this.my).au(((com.bytedance.adsdk.ugeno.jj.jd) this.my).getCurrentItem() + 1);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo, com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException, Resources.NotFoundException {
        super.jd();
        ((com.bytedance.adsdk.ugeno.jj.jd) this.my).wqx((int) this.jrx).my(this.ozw).jpo(this.f17779ww).jpo(this.f17770as).jd(this.czp).wqx(this.pzk).cm(this.f17778sn).jd(this.zmh).jpo(this.f17772gf).jd().cm(this.ez).jpo(this.kgu).jd((int) this.jrx).cm((int) this.f17774lq).jd(this.ted).wqx(this.fgt).jj(this.zrw).my(this.f17773hk).xyk((int) this.fri).zz((int) this.f17781zq).qk((int) this.iwg).my(this.f17776ou).wqx(this.uhu).au(this.f17775mg);
        ((com.bytedance.adsdk.ugeno.jj.jd) this.my).setOnPageChangeListener(this);
        if (this.f17771fp == 1) {
            jkt();
        } else {
            sbx();
        }
        ((com.bytedance.adsdk.ugeno.jj.jd) this.my).wqx();
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public View jpo() {
        com.bytedance.adsdk.ugeno.jj.jd jdVar = new com.bytedance.adsdk.ugeno.jj.jd(this.f17811jd);
        this.my = jdVar;
        jdVar.jpo((cm) this);
        return this.my;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo
    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        if (wqxVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo.add(wqxVar);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo
    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, ViewGroup.LayoutParams layoutParams) {
        if (wqxVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo.add(wqxVar);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jpo(String str, String str2) {
        super.jpo(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "startIndex":
                this.f17775mg = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0);
                break;
            case "indicatorColor":
                this.zrw = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2, this.zrw);
                break;
            case "indicatorStyle":
                this.f17779ww = str2;
                break;
            case "indicatorWidth":
                this.f17770as = xyk.jpo(this.f17811jd, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 8.0f));
                break;
            case "indicatorHeight":
                this.czp = xyk.jpo(this.f17811jd, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 8.0f));
                break;
            case "nextMargin":
                this.f17781zq = xyk.jpo(this.f17811jd, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f));
                break;
            case "driveMode":
                this.f17771fp = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0);
                break;
            case "effect":
                this.uhu = str2;
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.f17772gf = 1;
                    break;
                } else {
                    this.f17772gf = 0;
                    break;
                }
            case "disableOnInteraction":
                this.ozw = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, false);
                break;
            case "indicator":
                this.fgt = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, false);
                break;
            case "indicatorX":
                this.pzk = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 50.0f);
                break;
            case "indicatorY":
                this.f17778sn = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 90.0f);
                break;
            case "previousMargin":
                this.fri = xyk.jpo(this.f17811jd, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f));
                break;
            case "loop":
                this.ez = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, true);
                break;
            case "delay":
                this.f17774lq = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 2000.0f);
                break;
            case "speed":
                this.jrx = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 500.0f);
                break;
            case "indicatorDirection":
                this.zmh = str2;
                break;
            case "allowTouchMove":
                this.ted = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, true);
                break;
            case "pageCount":
                this.f17776ou = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 1.0f);
                break;
            case "pageMargin":
                this.iwg = xyk.jpo(this.f17811jd, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.f17773hk = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2, this.f17773hk);
                break;
            case "autoplay":
                this.kgu = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, true);
                break;
            case "dataList":
                this.kye = com.bytedance.adsdk.ugeno.qk.jd.jpo(str2, (JSONArray) null);
                break;
        }
    }

    public void jpo(int i10) throws Resources.NotFoundException {
        if (((com.bytedance.adsdk.ugeno.jj.jd) this.my).getCurrentItem() != i10) {
            ((com.bytedance.adsdk.ugeno.jj.jd) this.my).au(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jj.wqx
    public void jpo(boolean z10, int i10, float f10, int i11) {
        Log.d("BaseSwiper", "onPageScrolled: loop=" + z10 + "; position=" + i10 + "; positionOffset=" + f10 + "; positionOffsetPixels=" + i11);
        jpo(z10, i10, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.jj.wqx
    public void jpo(boolean z10, int i10, int i11, boolean z11, boolean z12) {
        if (this.f17777ql != i10) {
            qk(i10);
            xyk(i10);
            this.f17777ql = i10;
        }
        Log.d("BaseSwiper", "onPageSelected: loop=" + z10 + "; position=" + i10 + "; loopPosition=" + i11 + "; isFirst=" + z11 + "; isLast=" + z12);
    }

    @Override // com.bytedance.adsdk.ugeno.jj.wqx
    public void jpo(boolean z10, int i10) {
        if (i10 == 0) {
            if (!z10) {
                this.f17780xp = true;
            }
            this.clt = false;
        } else if (i10 == 1) {
            this.clt = true;
        }
        Log.d("BaseSwiper", "onPageScrollStateChanged: loop=" + z10 + "; state=" + i10);
    }

    private void jpo(boolean z10, int i10, float f10) {
        if (this.vzb != null && !z10 && i10 == cgn() - 1 && f10 == 0.0f && this.f17780xp) {
            this.vzb.jpo("SwiperView://finish", new Object[0]);
            Log.d("BaseSwiper", "onPageScrolled: finish monitor");
            this.f17780xp = false;
        }
    }

    private void jpo(Cif cif) {
        if (this.ozw) {
            cif.jpo(new com.bytedance.adsdk.ugeno.core.my() { // from class: com.bytedance.adsdk.ugeno.jd.1
                @Override // com.bytedance.adsdk.ugeno.core.my
                public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, String str, List<jj.jpo> list) {
                    if ((TextUtils.equals(str, "tap") || TextUtils.equals(str, "slide") || TextUtils.equals(str, "touchStart") || TextUtils.equals(str, "touchEnd")) && ((com.bytedance.adsdk.ugeno.jd.wqx) jd.this).my != null) {
                        ((com.bytedance.adsdk.ugeno.jj.jd) ((com.bytedance.adsdk.ugeno.jd.wqx) jd.this).my).jj();
                    }
                }
            });
        }
    }
}
