package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.jd;
import com.bytedance.sdk.openadsdk.component.reward.ju;
import com.bytedance.sdk.openadsdk.core.dt;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.core.widget.opi;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.nq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.Q6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class xyk implements com.bytedance.sdk.openadsdk.core.au.cm.jd {

    /* renamed from: au, reason: collision with root package name */
    public boolean f19410au;

    /* renamed from: if, reason: not valid java name */
    public boolean f94if;

    /* renamed from: jd, reason: collision with root package name */
    private boolean f19411jd;

    /* renamed from: jj, reason: collision with root package name */
    protected dt f19412jj;
    private boolean jpo;

    /* renamed from: jr, reason: collision with root package name */
    protected boolean f19413jr;

    /* renamed from: ju, reason: collision with root package name */
    public int f19414ju;
    protected IListenerManager opi;
    public String oya;
    public String prr;

    /* renamed from: qk, reason: collision with root package name */
    protected final jd f19415qk;

    /* renamed from: sq, reason: collision with root package name */
    public boolean f19416sq;
    private opi wqx;

    /* renamed from: yd, reason: collision with root package name */
    public int f19417yd;
    protected com.bytedance.sdk.openadsdk.component.reward.jpo.jpo zz;
    protected final AtomicBoolean xyk = new AtomicBoolean(false);
    public boolean hna = false;

    public xyk(jd jdVar, dt dtVar, int i10, int i11, boolean z10) {
        this.f19415qk = jdVar;
        this.f19412jj = dtVar;
        this.f19417yd = i10;
        this.f19414ju = i11;
        this.f19416sq = z10;
    }

    public abstract boolean a_();

    public abstract String b_();

    public abstract void c_();

    public boolean cgn() {
        return this.f19411jd;
    }

    public void cm() {
    }

    public void cql() {
        if (roc() || se() == null || se().f19930va == null || !se().f19914jd.by()) {
            return;
        }
        opi opiVar = new opi(se(), new opi.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.xyk.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.opi.jpo
            public int cm() {
                jd jdVar = xyk.this.f19415qk;
                if (jdVar != null) {
                    return jdVar.pdm();
                }
                return 0;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.opi.jpo
            public void jd() {
                jd jdVar = xyk.this.f19415qk;
                if (jdVar != null) {
                    jdVar.se();
                }
                xyk.this.my(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.opi.jpo
            public void jj() {
                xyk.this.my(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.opi.jpo
            public void jpo() {
                xyk xykVar = xyk.this;
                xykVar.jd(xykVar.se());
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.opi.jpo
            public void my() {
                xyk.this.my(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.opi.jpo
            public void wqx() {
                jd jdVar = xyk.this.f19415qk;
                if (jdVar != null) {
                    jdVar.hx();
                }
                xyk.this.my(2);
            }
        });
        this.wqx = opiVar;
        opiVar.jpo(se().f19930va);
    }

    public abstract boolean d_();

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void dm() {
        wcn();
    }

    public void dn() {
        cm(0);
    }

    public abstract boolean dt();

    public boolean duq() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public final void et() {
        dt dtVar;
        wcn();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        if (jpoVar == null || (dtVar = jpoVar.f19914jd) == null) {
            return;
        }
        dtVar.ky();
        this.zz.f19914jd.wqx(true);
        if (dt.my(this.zz.f19914jd)) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.zz;
            dt dtVar2 = jpoVar2.f19914jd;
            com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar2, jpoVar2.my, dtVar2.qzp());
        }
    }

    public void fy() {
        if (this.f19412jj != null) {
            com.bytedance.sdk.openadsdk.jj.jd.jpo().jpo("videoForceBreak", this.f19412jj);
        }
        this.f19415qk.cm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public List<dt> hks() {
        return this.f19415qk.hmu();
    }

    public abstract String hmu();

    public void huv() {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jd("onAdClose");
        } else {
            this.f19415qk.ju();
        }
    }

    public boolean hx() {
        return false;
    }

    public Activity ic() {
        return this.f19415qk.my();
    }

    public boolean ii() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVarSe;
        opi opiVar;
        if (roc() || (jpoVarSe = se()) == null || !jpoVarSe.f19914jd.by() || (opiVar = this.wqx) == null) {
            return false;
        }
        return opiVar.jpo(jpoVarSe.vrc);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jd(int i10) {
    }

    public void jj(boolean z10) {
        this.f19413jr = z10;
    }

    public void jkt() {
        nmd.jpo("Scene", "tryPreloadVideo scene = " + this + ",index =" + this.f19417yd);
        com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = dt.jpo(CacheDirFactory.getICacheDir(this.f19412jj.ew()).jpo(), this.f19412jj);
        jdVarJpo.jpo("material_meta", this.f19412jj);
        jdVarJpo.jpo("ad_slot", this.f19412jj.gmx());
        com.bytedance.sdk.openadsdk.core.au.my.jpo.jpo(jdVarJpo, new com.bykv.vk.openvk.jpo.jpo.jpo.my.jd() { // from class: com.bytedance.sdk.openadsdk.activity.xyk.4
            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
            public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10) {
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
            public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10, String str) {
            }
        });
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.view.zz jpo();

    public void jpo(Activity activity) {
    }

    public abstract void jpo(Activity activity, jd.my myVar);

    public abstract void jpo(String str);

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void ju() {
        if (this.xyk.compareAndSet(false, true)) {
            nmd.jpo("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            ya();
        }
    }

    public void my(boolean z10) {
        this.f19411jd = z10;
    }

    public void nmd() {
        opi opiVar = this.wqx;
        if (opiVar != null) {
            opiVar.zz();
            this.wqx = null;
        }
        this.jpo = false;
    }

    public boolean nzb() {
        return false;
    }

    public int pe() {
        return this.f19414ju;
    }

    public boolean roc() {
        return this.f19416sq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void rxq() {
        jd jdVar = this.f19415qk;
        if (jdVar != null) {
            jdVar.jpo(this, true);
        }
    }

    public JSONObject sbx() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("media_extra", this.prr);
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("user_id", this.oya);
            jSONObject.put("trans_id", nq.jpo().replace("-", ""));
            if (se() != null) {
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVarSe = se();
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, (int) jpoVarSe.hmu.se());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, jpoVarSe.f19914jd.et());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, jpoVarSe.f19914jd.ii());
                jSONObject.put("network", com.bytedance.sdk.component.utils.opi.wqx(jpoVarSe.f19920pe));
                JSONObject jSONObjectEb = jpoVarSe.f19914jd.eb();
                jSONObjectEb.put(Q6.U0, com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jd());
                jSONObject.put("extra", jSONObjectEb);
                jSONObject.put("video_duration", jpoVarSe.f19914jd.ww().jj());
                String strCm = "unKnow";
                int iNp = jpoVarSe.f19914jd.np();
                if (iNp == 2) {
                    strCm = tic.jd();
                } else if (iNp == 1) {
                    strCm = tic.cm();
                }
                jSONObject.put("user_agent", strCm);
            }
            return jSONObject;
        } catch (Throwable th2) {
            nmd.jpo("Scene", "", th2);
            return null;
        }
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.jpo.jpo se();

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void tic() {
        cm(2);
    }

    public boolean vrc() {
        jd jdVar = this.f19415qk;
        return jdVar != null && jdVar.jpo(this, this.f19417yd);
    }

    public final void wcn() {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jd("onAdVideoBarClick");
        } else {
            this.f19415qk.yd();
        }
    }

    public void wqx() {
    }

    public abstract void wqx(boolean z10);

    public jd xk() {
        return this.f19415qk;
    }

    public void ya() {
        jd jdVar = this.f19415qk;
        if (jdVar == null || jdVar.prr()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jd("onAdShow");
        } else {
            this.f19415qk.m433if();
        }
        this.f19415qk.sq();
    }

    private void wqx(final String str) {
        duq.wqx(new com.bytedance.sdk.component.xyk.xyk("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.xyk.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    xyk.this.wqx(1).executeFullVideoCallback(xyk.this.hmu(), str);
                } catch (Throwable th2) {
                    nmd.wqx("Scene", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public void cm(final int i10) {
        if (!this.f19415qk.zz().getBoolean("reward_verify", false) && !this.f19415qk.au() && !this.f19415qk.zz().getBoolean("user_has_give_up_reward", false)) {
            this.f19415qk.zz().putBoolean("reward_verify", true);
            if (se() != null) {
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVarSe = se();
                if (sq.cm().prr(String.valueOf(jpoVarSe.f19915jj))) {
                    jpo(true, jpoVarSe.f19914jd.ii(), jpoVarSe.f19914jd.et(), 0, "", i10);
                } else {
                    sq.wqx().jpo(sbx(), new tu.jd() { // from class: com.bytedance.sdk.openadsdk.activity.xyk.3
                        @Override // com.bytedance.sdk.openadsdk.core.tu.jd
                        public void jpo(int i11, String str) {
                            xyk.this.jpo(false, 0, "", i11, str, i10);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.tu.jd
                        public void jpo(dt.jd jdVar) {
                            xyk.this.jpo(jdVar.f20303jd, jdVar.wqx.jpo(), jdVar.wqx.jd(), 0, "", i10);
                        }
                    });
                }
            }
        }
    }

    public final void jd(Activity activity, jd.my myVar) {
        if (this.jpo) {
            return;
        }
        this.jpo = true;
        jpo(activity, myVar);
    }

    public void jpo(Activity activity, Bundle bundle) {
    }

    public void my(int i10) {
        jd jdVar = this.f19415qk;
        if (jdVar != null) {
            jdVar.jpo(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(Bundle bundle) {
    }

    public final IListenerManager wqx(int i10) {
        if (this.opi == null) {
            this.opi = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo().jpo(i10));
        }
        return this.opi;
    }

    public void jpo(xyk xykVar, xyk xykVar2, jd.my myVar) {
    }

    public void jd(String str) {
        if (a_()) {
            jpo(str, false, 0, "", 0, "");
        } else {
            wqx(str);
        }
    }

    public void jpo(Map<String, Object> map, float f10, float f11) {
    }

    public void jpo(boolean z10, boolean z11, boolean z12, int i10) {
        this.f19415qk.jpo(this, z10, z11, z12, i10);
    }

    private void jpo(final String str, final boolean z10, final int i10, final String str2, final int i11, final String str3) {
        duq.wqx(new com.bytedance.sdk.component.xyk.xyk("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.xyk.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    xyk.this.wqx(0).executeRewardVideoCallback(xyk.this.hmu(), str, z10, i10, str2, i11, str3);
                } catch (Throwable th2) {
                    nmd.wqx("Scene", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public void jd(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        if (vrc()) {
            return;
        }
        jd.my myVar = new jd.my(8, jpoVar);
        myVar.f19374cm = jpoVar.huv;
        jd jdVar = this.f19415qk;
        if (jdVar != null) {
            jdVar.jd(this, myVar);
        }
    }

    public final void jpo(boolean z10, int i10, String str, int i11, String str2, int i12) {
        if (this.f19415qk.au()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("onRewardVerify", z10, i10, str, i11, str2);
        } else {
            this.f19415qk.jpo(this, z10, i10, str, i11, str2);
        }
        ju.jpo(this.f19412jj, z10, i12);
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, int i10, int i11) {
        this.f19412jj = dtVar;
        this.f19417yd = i10;
        this.f19414ju = i11;
    }

    public void jpo(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        if (jpoVar == null) {
            return;
        }
        try {
            int iPdm = this.f19415qk.pdm();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", Math.max(iPdm, 0));
            com.bytedance.sdk.openadsdk.cm.wqx.my(this.f19412jj, jpoVar.my, jSONObject);
        } catch (Throwable unused) {
        }
        jd(jpoVar);
    }

    public void au() {
    }

    public void oya() {
    }

    public void rq() {
    }

    public void uu() {
    }

    public void va() {
    }
}
