package com.bytedance.sdk.openadsdk.core.ju.jj;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.Cif;
import com.bytedance.adsdk.ugeno.core.hna;
import com.bytedance.adsdk.ugeno.core.ju;
import com.bytedance.adsdk.ugeno.core.prr;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.kln;
import com.ironsource.C3352n2;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends cm {

    /* renamed from: hx, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.my f20529hx;

    /* renamed from: nq, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.jd.wqx f20530nq;
    private boolean pdm;

    /* renamed from: se, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.jd.wqx f20531se;

    public qk(Context context, dt dtVar, boolean z10, jpo jpoVar, ViewGroup viewGroup) {
        super(context, dtVar, z10, jpoVar, viewGroup);
        this.pdm = false;
    }

    private void au() {
        ju juVar = new ju();
        HashMap map = new HashMap();
        map.put("image_info", this.f20506jj.ju());
        map.put("cache_dir", this.f20506jj.oya());
        juVar.jpo(map);
        juVar.jpo(this.f20505jd);
        juVar.jpo(this.f20501cm);
        juVar.jd(this.hmu);
        this.jpo.jpo("ad", juVar);
    }

    /* renamed from: if, reason: not valid java name */
    private void m463if() {
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.f20530nq;
        if (wqxVar != null) {
            wqxVar.wqx(8);
        }
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar2 = this.f20531se;
        if (wqxVar2 != null) {
            wqxVar2.wqx(8);
        }
    }

    private int oya() {
        au();
        try {
            this.jpo.jpo(this.hmu, this.wqx);
            if (this.wqx != null) {
                if (TextUtils.equals(this.f20513tu, "rewarded_video")) {
                    this.f20530nq = this.wqx.my("RVCountdown");
                    this.f20531se = this.wqx.my("RVSkipView");
                } else {
                    this.f20530nq = this.wqx.my("FVCountdown");
                    this.f20531se = this.wqx.my("FVSkipView");
                }
                m463if();
            }
            this.f20506jj.kln().jd();
            this.f20506jj.kln().wqx();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return 139;
        } catch (Throwable unused3) {
            return 141;
        }
    }

    private boolean prr() {
        dt dtVar = this.my;
        return dtVar != null && dtVar.ez() == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.jj.cm
    public int cm() {
        if (!this.f20506jj.ef()) {
            return zz();
        }
        nmd.jpo("UGenRender", "renderWidget: only update data");
        return oya();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.jj.cm
    public JSONObject jd() {
        return this.f20506jj.wqx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.jj.cm
    public JSONObject jpo() {
        JSONObject jSONObjectWqx = this.f20506jj.wqx();
        if (jSONObjectWqx != null) {
            return jSONObjectWqx.optJSONObject("xTemplate");
        }
        return null;
    }

    public void ju() {
        Cif cif = this.jpo;
        if (cif != null) {
            cif.jpo(this.wqx, C3352n2.f37928v, new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.jj.cm
    public com.bytedance.adsdk.ugeno.jd.wqx qk() {
        com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar = this.wqx;
        if (wqxVar == null) {
            return null;
        }
        return wqxVar.my("Playable");
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.jj.cm, com.bytedance.sdk.component.adexpress.dynamic.cm
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) throws NumberFormatException {
        if (this.wqx == null) {
            return;
        }
        boolean z11 = i10 == 1;
        jpo(charSequence, z11, i11, z10);
        jd(charSequence, z11, i11, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.jj.cm
    public com.bytedance.adsdk.ugeno.jd.wqx xyk() {
        com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar = this.wqx;
        if (wqxVar == null) {
            return null;
        }
        return wqxVar.my("VideoV3");
    }

    public void yd() {
        Cif cif = this.jpo;
        if (cif != null) {
            cif.jpo(this.wqx, "videoFail", new Object[0]);
        }
    }

    public int zz() {
        au();
        this.jpo.jpo((prr) this);
        this.jpo.jpo((hna) this);
        if (prr()) {
            this.jpo.jpo(new wqx());
        }
        kln klnVarJrx = this.my.jrx();
        try {
            if (klnVarJrx != null) {
                this.wqx = this.jpo.jpo(this.f20501cm, this.hmu, klnVarJrx.my());
            } else {
                this.wqx = this.jpo.jpo(this.f20501cm, this.hmu, (JSONObject) null);
            }
            if (this.wqx != null) {
                if (TextUtils.equals(this.f20513tu, "rewarded_video")) {
                    this.f20530nq = this.wqx.my("RVCountdown");
                    this.f20531se = this.wqx.my("RVSkipView");
                } else {
                    this.f20530nq = this.wqx.my("FVCountdown");
                    this.f20531se = this.wqx.my("FVSkipView");
                }
                m463if();
            }
            this.f20506jj.kln().jd();
            this.f20506jj.kln().wqx();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return 139;
        } catch (Throwable unused3) {
            return 141;
        }
    }

    private void jd(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.f20531se;
        if (wqxVar != null && (wqxVar instanceof com.bytedance.sdk.openadsdk.core.ju.jd.jj)) {
            int i11 = 0;
            if (!z10 && !z11) {
                i11 = 8;
            }
            wqxVar.wqx(i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.jj.cm
    public void jpo(com.bytedance.sdk.openadsdk.core.widget.my myVar) {
        this.f20529hx = myVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.bytedance.sdk.openadsdk.core.ju.jj.cm, com.bytedance.adsdk.ugeno.core.prr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx r13, java.lang.String r14, com.bytedance.adsdk.ugeno.cm.jj.jpo r15) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ju.jj.qk.jpo(com.bytedance.adsdk.ugeno.jd.wqx, java.lang.String, com.bytedance.adsdk.ugeno.cm.jj$jpo):void");
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.jj.cm, com.bytedance.sdk.component.adexpress.dynamic.cm
    public void setSoundMute(boolean z10) {
    }

    private void jpo(CharSequence charSequence, boolean z10, int i10, boolean z11) throws NumberFormatException {
        int i11;
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.f20530nq;
        if (wqxVar != null && (wqxVar instanceof com.bytedance.sdk.openadsdk.core.ju.jd.jd)) {
            try {
                i11 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                nmd.wqx("UGenRender", "parse duration exception", charSequence);
                i11 = 0;
            }
            if (!z11 && i11 > 0 && !this.pdm) {
                this.f20530nq.wqx(0);
                if (!z10 && this.f20506jj.jpo() && com.bytedance.sdk.component.adexpress.cm.jj.jd(this.f20506jj.cm())) {
                    ((com.bytedance.sdk.openadsdk.core.ju.jd.jd) this.f20530nq).ju(String.valueOf(i10));
                    return;
                } else if (!"open_ad".equals(this.f20506jj.cm()) && this.f20506jj.jpo()) {
                    this.pdm = true;
                    this.f20530nq.wqx(8);
                    return;
                } else {
                    ((com.bytedance.sdk.openadsdk.core.ju.jd.jd) this.f20530nq).ju(String.valueOf(charSequence));
                    return;
                }
            }
            this.f20530nq.wqx(8);
        }
    }

    private Context jpo(View view) {
        Activity activityJpo = view != null ? com.bytedance.sdk.component.utils.jd.jpo(view) : null;
        return activityJpo == null ? this.f20505jd : activityJpo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.jj.cm
    public void jpo(long j10, long j11) {
        super.jpo(j10, j11);
        Cif cif = this.jpo;
        if (cif != null) {
            cif.jpo(this.wqx, "videoProgress", Long.valueOf(j10), Long.valueOf(j11));
        }
    }
}
