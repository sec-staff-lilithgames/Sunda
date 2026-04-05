package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.ju;
import com.bytedance.sdk.openadsdk.core.dt;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.pdm;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.core.widget.jd;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.nq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.inmobi.commons.core.configs.CrashConfig;
import com.ironsource.Q6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String hna;

    /* renamed from: jr, reason: collision with root package name */
    private static String f19238jr;
    private static String opi;
    private static String prr;

    /* renamed from: sq, reason: collision with root package name */
    private static String f19239sq;

    /* renamed from: tu, reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.jpo.my.jpo f19240tu;

    /* renamed from: au, reason: collision with root package name */
    protected int f19241au;

    /* renamed from: dt, reason: collision with root package name */
    private final AtomicBoolean f19242dt = new AtomicBoolean(false);
    private int hmu = -1;

    /* renamed from: if, reason: not valid java name */
    protected int f89if;
    private String nmd;

    /* renamed from: nq, reason: collision with root package name */
    private boolean f19243nq;
    protected com.bytedance.sdk.openadsdk.jpo.my.jpo oya;

    /* renamed from: rq, reason: collision with root package name */
    private String f19244rq;

    private JSONObject kln() {
        JSONObject jSONObject = new JSONObject();
        int iSe = (int) this.f19172jd.hmu.se();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.f19172jd.f19914jd.et());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.f19172jd.f19914jd.ii());
            jSONObject.put("network", opi.wqx(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int iNp = this.f19172jd.f19914jd.np();
            String strCm = "unKnow";
            if (iNp == 2) {
                strCm = tic.jd();
            } else if (iNp == 1) {
                strCm = tic.cm();
            }
            jSONObject.put("user_agent", strCm);
            JSONObject jSONObjectEb = this.f19172jd.f19914jd.eb();
            jSONObjectEb.put(Q6.U0, com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jd());
            jSONObject.put("extra", jSONObjectEb);
            jSONObject.put("media_extra", this.nmd);
            jSONObject.put("video_duration", this.f19172jd.f19914jd.ww().jj());
            jSONObject.put("play_start_ts", this.f89if);
            jSONObject.put("play_end_ts", this.f19241au);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, iSe);
            jSONObject.put("user_id", this.f19244rq);
            jSONObject.put("trans_id", nq.jpo().replace("-", ""));
            return jSONObject;
        } catch (Throwable th2) {
            nmd.jpo("TTAD.RVA", "", th2);
            return null;
        }
    }

    private void nzb() {
        ju juVar;
        if (this.f19175qk) {
            return;
        }
        this.f19175qk = true;
        nmd.jpo("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        if (jpoVar != null && (juVar = jpoVar.f19932wu) != null) {
            juVar.cm();
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.jpo.my.jpo jpoVar2 = this.oya;
        if (jpoVar2 != null) {
            jpoVar2.jd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sz() {
        nmd.jpo("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.jpo.my.jpo jpoVar = this.oya;
        if (jpoVar != null) {
            jpoVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uu() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.cm.my.jd.prr$jpo r0 = new com.bytedance.sdk.openadsdk.cm.my.jd.prr$jpo
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.f19172jd
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            long r1 = r1.m442if()
            r0.jd(r1)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.f19172jd
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            long r1 = r1.nq()
            r0.cm(r1)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.f19172jd
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            long r1 = r1.hna()
            r0.wqx(r1)
            r1 = 3
            r0.wqx(r1)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.f19172jd
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            int r1 = r1.hmu()
            r0.cm(r1)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.f19172jd
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            long r1 = r1.jd()
            r0.jpo(r1)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.f19172jd
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo r1 = r1.xyk()
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r2 = r3.f19172jd
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r2 = r2.hmu
            com.bytedance.sdk.openadsdk.cm.qk r2 = r2.my()
            com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.f19172jd
            int r0 = r0.f19915jj
            com.bytedance.sdk.openadsdk.core.hx.wqx(r0)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.f19172jd
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r0 = r0.hmu
            java.lang.String r1 = "skip"
            r2 = 0
            r0.jpo(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.f19172jd
            boolean r1 = r0.wqx
            if (r1 == 0) goto La1
            com.bytedance.sdk.openadsdk.core.model.dt r0 = r0.f19914jd
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.nmd.wqx(r0)
            r1 = 4
            r2 = 1
            if (r0 == 0) goto L8a
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.f19172jd
            com.bytedance.sdk.openadsdk.component.reward.view.yd r0 = r0.f19911hx
            com.bytedance.sdk.openadsdk.component.reward.view.cm r0 = r0.jpo()
            if (r0 == 0) goto L86
            int r0 = r0.f20015cm
            if (r0 != 0) goto L86
            r3.finish()
            goto L8d
        L86:
            r3.jpo(r2, r1)
            goto L8d
        L8a:
            r3.jpo(r2, r1)
        L8d:
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.f19172jd
            com.bytedance.sdk.openadsdk.core.model.dt r0 = r0.f19914jd
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.nmd.jpo(r0)
            if (r0 == 0) goto La4
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.f19172jd
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.hna
            boolean r0 = r0.get()
            if (r0 != 0) goto La4
        La1:
            r3.finish()
        La4:
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.f19172jd
            com.bytedance.sdk.openadsdk.core.model.dt r0 = r0.f19914jd
            com.bytedance.sdk.openadsdk.core.model.cm r0 = r0.kc()
            if (r0 == 0) goto Lc2
            com.bytedance.sdk.openadsdk.core.if.cm r0 = r0.jpo()
            if (r0 == 0) goto Lc2
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.f19172jd
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            long r1 = r1.m442if()
            r0.jj(r1)
            r0.my(r1)
        Lc2:
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.f19172jd
            com.bytedance.sdk.openadsdk.core.model.dt r0 = r0.f19914jd
            r1 = 5
            com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.uu():void");
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void dm() {
        sz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void et() {
        sz();
        this.f19172jd.f19914jd.ky();
        this.f19172jd.f19914jd.wqx(true);
        if (dt.my(this.f19172jd.f19914jd)) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
            dt dtVar = jpoVar.f19914jd;
            com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar, jpoVar.my, dtVar.qzp());
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        f19240tu = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.f19172jd != null) {
            com.bytedance.sdk.openadsdk.jj.jd.jpo().jpo("videoForceBreak", this.f19172jd.f19914jd);
        }
        nzb();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void hmu() {
        rv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void jr() {
        final View viewYd = this.f19172jd.tic.yd();
        if (viewYd != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTRewardVideoActivity.this.f19172jd.f19909ef.nmd() && TTRewardVideoActivity.this.f19172jd.f19934yd.get()) {
                        boolean zAu = TTRewardVideoActivity.this.f19172jd.nzb.au();
                        TTRewardVideoActivity.this.f19172jd.f19909ef.jj(zAu);
                        TTRewardVideoActivity.this.f19172jd.tic.jj(8);
                        View view2 = viewYd;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.jj.cm) {
                            ((com.bytedance.sdk.openadsdk.core.jj.cm) view2).setImageResource(com.bytedance.sdk.component.utils.dt.cm(TTRewardVideoActivity.this.f19172jd.f19920pe, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.f19172jd.xk.sendEmptyMessageDelayed(600, 5000L);
                        if (!dt.wqx(TTRewardVideoActivity.this.f19172jd.f19914jd)) {
                            return;
                        }
                        if (dt.wqx(TTRewardVideoActivity.this.f19172jd.f19914jd) && zAu) {
                            return;
                        }
                    }
                    TTRewardVideoActivity.this.f19172jd.f19909ef.rq();
                    TTRewardVideoActivity.this.f19172jd.nzb.ju();
                    TTRewardVideoActivity.this.f19172jd.f19923rv.jj();
                    if (rv.cm(TTRewardVideoActivity.this.f19172jd.f19914jd)) {
                        TTRewardVideoActivity.this.jd(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            viewYd.setOnClickListener(onClickListener);
            viewYd.setTag(viewYd.getId(), onClickListener);
        }
        this.f19172jd.duq.jpo(new com.bytedance.sdk.openadsdk.component.reward.top.jd() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jd(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.f19172jd.sz.jpo(tTRewardVideoActivity.wqx);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jpo(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.jd(rv.wqx(tTRewardVideoActivity.f19172jd.f19914jd), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void wqx(View view) {
                View view2 = viewYd;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jpo(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.cm cmVarKc;
                com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
                com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = TTRewardVideoActivity.this.wqx;
                if (jdVar != null && jdVar.cm() != null) {
                    TTRewardVideoActivity.this.wqx.cm().jpo(TTRewardVideoActivity.this.f19172jd.huv);
                }
                TTRewardVideoActivity.this.f19172jd.huv = !r3.huv;
                StringBuilder sb2 = new StringBuilder("will set is Mute ");
                sb2.append(TTRewardVideoActivity.this.f19172jd.huv);
                sb2.append(" mLastVolume=");
                sb2.append(TTRewardVideoActivity.this.f19172jd.kln.jpo());
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = TTRewardVideoActivity.this.f19172jd;
                jpoVar.hmu.jpo(jpoVar.huv, str);
                if (!rv.prr(TTRewardVideoActivity.this.f19172jd.f19914jd) || TTRewardVideoActivity.this.f19172jd.f19934yd.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = TTRewardVideoActivity.this.f19172jd;
                    jpoVar2.f19909ef.my(jpoVar2.huv);
                    com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = TTRewardVideoActivity.this.f19172jd;
                    jpoVar3.f19924se.jd(jpoVar3.huv);
                    dt dtVar = TTRewardVideoActivity.this.f19172jd.f19914jd;
                    if (dtVar == null || (cmVarKc = dtVar.kc()) == null || (cmVarJpo = cmVarKc.jpo()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar4 = TTRewardVideoActivity.this.f19172jd;
                    if (jpoVar4.huv) {
                        cmVarJpo.xyk(jpoVar4.hmu.m442if());
                    } else {
                        cmVarJpo.zz(jpoVar4.hmu.m442if());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void cm(View view) {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean nmd() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void nq() {
        this.f19241au = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar;
        dt dtVar;
        super.onCreate(bundle);
        try {
            if (prr == null) {
                prr = com.bytedance.sdk.component.utils.dt.jpo(this, "tt_reward_msg");
                hna = com.bytedance.sdk.component.utils.dt.jpo(this, "tt_msgPlayable");
                f19239sq = com.bytedance.sdk.component.utils.dt.jpo(this, "tt_negtiveBtnBtnText");
                opi = com.bytedance.sdk.component.utils.dt.jpo(this, "tt_postiveBtnText");
                f19238jr = com.bytedance.sdk.component.utils.dt.jpo(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            nmd.wqx("TTAD.RVA", th2.getMessage());
        }
        if (bundle == null || (jpoVar = this.f19172jd) == null || (dtVar = jpoVar.f19914jd) == null || !dtVar.duq()) {
            return;
        }
        this.f19242dt.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        nzb();
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("recycleRes");
        }
        this.oya = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        ju juVar;
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        if (jpoVar == null || (juVar = jpoVar.f19932wu) == null) {
            return;
        }
        juVar.jpo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        ju juVar;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        if (jpoVar == null || (juVar = jpoVar.f19932wu) == null) {
            return;
        }
        juVar.jd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar;
        if (bundle == null) {
            bundle = new Bundle();
        }
        f19240tu = this.oya;
        if (this.f19242dt.get() && (jpoVar = this.f19172jd) != null) {
            jpoVar.f19914jd.nzb();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void opi() {
        rv();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean rq() {
        return false;
    }

    public void rv() {
        wqx(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout se() {
        return this.f19172jd.tic.jj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void tic() {
        wqx(2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void xyk() {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.jpo.my.jpo jpoVar = this.oya;
            if (jpoVar != null) {
                jpoVar.jpo();
            }
        }
        if (tu()) {
            this.f19172jd.f19911hx.au();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void yd() {
        com.bytedance.sdk.openadsdk.component.reward.view.cm cmVarJpo;
        super.yd();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        if (jpoVar == null || (cmVarJpo = jpoVar.f19911hx.jpo()) == null) {
            return;
        }
        cmVarJpo.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.my() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.my
            public void jpo() {
                TTRewardVideoActivity.this.sz();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(final boolean z10, boolean z11) {
        if (!z11 && this.f19243nq && this.f19172jd.f19934yd.get() && rv.xyk(this.f19172jd.f19914jd)) {
            this.f19172jd.f19924se.xyk();
            return;
        }
        if (!sq.cm().qk(String.valueOf(this.f19172jd.f19915jj))) {
            if (!z11 && this.f19172jd.f19934yd.get() && rv.xyk(this.f19172jd.f19914jd)) {
                this.f19172jd.f19924se.xyk();
                return;
            } else if (z10) {
                finish();
                return;
            } else {
                uu();
                return;
            }
        }
        if (this.f19242dt.get()) {
            if (this.f19172jd.f19934yd.get() && rv.xyk(this.f19172jd.f19914jd)) {
                this.f19172jd.f19924se.xyk();
                return;
            } else if (z10) {
                finish();
                return;
            } else {
                uu();
                return;
            }
        }
        if (rv.xyk(this.f19172jd.f19914jd) && this.f19172jd.f19909ef.xyk().getVisibility() == 0) {
            this.f19172jd.f19924se.xyk();
            return;
        }
        this.f19172jd.nmd.set(true);
        this.f19172jd.hmu.rq();
        if (z10) {
            this.f19172jd.f19924se.my();
        }
        final com.bytedance.sdk.openadsdk.core.widget.jd jdVar = new com.bytedance.sdk.openadsdk.core.widget.jd(this);
        this.wqx.f19839au = jdVar;
        if (z10) {
            jdVar.jpo(hna).jd(f19238jr).wqx(f19239sq);
        } else {
            jdVar.jpo(prr).jd(opi).wqx(f19239sq);
        }
        this.wqx.f19839au.jpo(new jd.InterfaceC0134jd() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.jd.InterfaceC0134jd
            public void jd() {
                jdVar.dismiss();
                TTRewardVideoActivity.this.f19243nq = true;
                TTRewardVideoActivity.this.f19172jd.nmd.set(false);
                TTRewardVideoActivity.this.f19172jd.f19924se.wqx(Integer.MAX_VALUE);
                if (!z10 || !rv.jj(TTRewardVideoActivity.this.f19172jd.f19914jd)) {
                    TTRewardVideoActivity.this.uu();
                } else if (rv.xyk(TTRewardVideoActivity.this.f19172jd.f19914jd)) {
                    TTRewardVideoActivity.this.f19172jd.f19924se.xyk();
                } else {
                    TTRewardVideoActivity.this.f19172jd.f19923rv.jj();
                    TTRewardVideoActivity.this.finish();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jd.InterfaceC0134jd
            public void jpo() {
                TTRewardVideoActivity.this.f19172jd.hmu.nmd();
                if (z10) {
                    TTRewardVideoActivity.this.f19172jd.f19924se.jd(1000);
                }
                jdVar.dismiss();
                TTRewardVideoActivity.this.f19172jd.nmd.set(false);
            }
        }).show();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void cm() {
        this.f19172jd.duq.jpo(null, TTAdDislikeToast.getSkipText());
        this.f19172jd.duq.my(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void wqx() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar;
        super.wqx();
        if (this.f19242dt.get() || (jpoVar = this.f19172jd) == null) {
            return;
        }
        jpoVar.f19932wu = new ju(new ju.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.ju.jpo
            public void jpo() {
                if (TTRewardVideoActivity.this.f19242dt.get() || TTRewardVideoActivity.this.f19243nq) {
                    return;
                }
                TTRewardVideoActivity.this.wqx(1);
            }
        });
    }

    public void wqx(final int i10) {
        if (this.f19242dt.get() || this.f19243nq) {
            return;
        }
        this.f19242dt.set(true);
        ju juVar = this.f19172jd.f19932wu;
        if (juVar != null) {
            juVar.wqx();
        }
        if (sq.cm().prr(String.valueOf(this.f19172jd.f19915jj))) {
            jpo(true, this.f19172jd.f19914jd.ii(), this.f19172jd.f19914jd.et(), 0, "", i10);
        } else {
            sq.wqx().jpo(kln(), new tu.jd() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.tu.jd
                public void jpo(int i11, String str) {
                    TTRewardVideoActivity.this.jpo(false, 0, "", i11, str, i10);
                }

                @Override // com.bytedance.sdk.openadsdk.core.tu.jd
                public void jpo(dt.jd jdVar) {
                    boolean z10 = jdVar.f20303jd;
                    TTRewardVideoActivity.this.jpo(jdVar.f20303jd, jdVar.wqx.jpo(), jdVar.wqx.jd(), 0, "", i10);
                }
            });
        }
    }

    public void jpo(String str) {
        jpo(str, false, 0, "", 0, "");
    }

    private void jpo(final String str, final boolean z10, final int i10, final String str2, final int i11, final String str3) {
        duq.wqx(new com.bytedance.sdk.component.xyk.xyk("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTRewardVideoActivity.this.jpo(0).executeRewardVideoCallback(TTRewardVideoActivity.this.f19172jd.fy, str, z10, i10, str2, i11, str3);
                } catch (Throwable th2) {
                    nmd.wqx("TTAD.RVA", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            this.oya = pdm.jpo().jd();
        }
        if (this.oya != null || bundle == null) {
            return;
        }
        this.oya = f19240tu;
        f19240tu = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void jpo(Intent intent) {
        super.jpo(intent);
        this.nmd = intent.getStringExtra("media_extra");
        this.f19244rq = intent.getStringExtra("user_id");
    }

    public void wqx(long j10, long j11) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        boolean z10 = false;
        if (jpoVar != null) {
            if (jpoVar.f19914jd.ota() >= 0 && this.f19172jd.f19914jd.yzt() >= 0) {
                z10 = true;
            }
            if (z10) {
                j11 = this.f19172jd.f19914jd.yzt();
            }
        }
        long j12 = (this.f19172jd.wcn * 1000) + j10;
        if (z10) {
            jd(j12, j11);
            return;
        }
        if (this.hmu == -1) {
            this.hmu = sq.cm().nq(String.valueOf(this.f19172jd.f19915jj)).f20868jj;
        }
        if (j11 <= 0) {
            return;
        }
        if (j11 >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL && j12 >= 27000) {
            rv();
        } else if ((j12 * 100) / j11 >= this.hmu) {
            rv();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void jpo(long j10, long j11) {
        int i10 = (int) (j10 / 1000);
        int iHf = this.f19172jd.f19914jd.hf();
        boolean z10 = iHf >= 0;
        wqx(j10, j11);
        if (this.f19173jj > 0) {
            this.f19172jd.duq.cm(true);
            if (z10 && i10 >= iHf) {
                this.f19172jd.jpo(true);
                this.f19172jd.duq.jpo(String.valueOf(this.f19173jj), TTAdDislikeToast.getSkipText());
                this.f19172jd.duq.my(true);
                return;
            }
            this.f19172jd.duq.jpo(String.valueOf(this.f19173jj), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void jpo(boolean z10, boolean z11) {
        this.f89if = (int) (System.currentTimeMillis() / 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final boolean z10, final int i10, final String str, final int i11, final String str2, final int i12) {
        nmd.jpo("BVA", "invoke callback onRewardVerify: " + z10 + ", " + i10 + ", " + str + ", " + i11 + ", " + str2 + "; " + this);
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("onRewardVerify", z10, i10, str, i11, str2);
            ju.jpo(this.f19172jd.f19914jd, z10, i12);
        } else {
            duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.jpo.my.jpo jpoVar = TTRewardVideoActivity.this.oya;
                    if (jpoVar != null) {
                        jpoVar.jpo(z10, i10, str, i11, str2);
                        ju.jpo(TTRewardVideoActivity.this.f19172jd.f19914jd, z10, i12);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jd(int i10) {
        if (i10 == 10000) {
            rv();
        }
    }

    public void jd(long j10, long j11) {
        if (j11 <= 0) {
            return;
        }
        if (this.hmu == -1) {
            this.hmu = Math.min(100, this.f19172jd.f19914jd.ota());
        }
        if (((j10 / 1000.0f) / j11) * 100.0f >= this.hmu) {
            rv();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jd(boolean z10) {
        if (z10) {
            rv();
            return;
        }
        if ((1.0d - (this.f19173jj / this.f19172jd.hmu.duq())) * 100.0d >= sq.cm().nq(String.valueOf(this.f19172jd.f19915jj)).f20868jj) {
            rv();
        }
    }
}
