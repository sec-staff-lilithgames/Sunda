package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.cm.my.jd.prr;
import com.bytedance.sdk.openadsdk.core.hx;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.pdm;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.duq;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {

    /* renamed from: au, reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.jpo.wqx.jd f19189au;

    /* renamed from: if, reason: not valid java name */
    private com.bytedance.sdk.openadsdk.jpo.wqx.jd f86if;
    private boolean oya;

    /* JADX INFO: Access modifiers changed from: private */
    public void rv() {
        nmd.jpo("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.jpo.wqx.jd jdVar = this.f86if;
        if (jdVar != null) {
            jdVar.onAdClicked();
        }
    }

    private void uu() {
        if (this.f19175qk) {
            return;
        }
        this.f19175qk = true;
        nmd.jpo("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.jpo.wqx.jd jdVar = this.f86if;
        if (jdVar != null) {
            jdVar.jd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void cm() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.f19172jd
            com.bytedance.sdk.openadsdk.core.model.dt r0 = r0.f19914jd
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.dt.my(r0)
            r1 = 0
            if (r0 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.f19172jd
            boolean r2 = r0.wqx
            if (r2 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.jpo.if r0 = r0.duq
            java.lang.String r2 = "X"
            r0.jpo(r1, r2)
            goto L24
        L19:
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.f19172jd
            com.bytedance.sdk.openadsdk.component.reward.jpo.if r0 = r0.duq
            java.lang.String r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText()
            r0.jpo(r1, r2)
        L24:
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.f19172jd
            com.bytedance.sdk.openadsdk.component.reward.jpo.if r0 = r0.duq
            r1 = 1
            r0.my(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.cm():void");
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void dm() {
        if (this.f19172jd.f19914jd.sy() != 100.0f) {
            this.oya = true;
        }
        rv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void et() {
        rv();
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
        f19189au = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.f19172jd != null) {
            com.bytedance.sdk.openadsdk.jj.jd.jpo().jpo("videoForceBreak", this.f19172jd.f19914jd);
        }
        try {
            uu();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jd(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void jr() {
        final View viewYd = this.f19172jd.tic.yd();
        if (viewYd != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTFullScreenVideoActivity.this.f19172jd.f19909ef.nmd() && TTFullScreenVideoActivity.this.f19172jd.f19934yd.get()) {
                        boolean zAu = TTFullScreenVideoActivity.this.f19172jd.nzb.au();
                        TTFullScreenVideoActivity.this.f19172jd.f19909ef.jj(zAu);
                        TTFullScreenVideoActivity.this.f19172jd.tic.jj(8);
                        View view2 = viewYd;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.jj.cm) {
                            ((com.bytedance.sdk.openadsdk.core.jj.cm) view2).setImageResource(com.bytedance.sdk.component.utils.dt.cm(TTFullScreenVideoActivity.this.f19172jd.f19920pe, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.f19172jd.xk.sendEmptyMessageDelayed(600, 5000L);
                        if (!dt.wqx(TTFullScreenVideoActivity.this.f19172jd.f19914jd)) {
                            return;
                        }
                        if (dt.wqx(TTFullScreenVideoActivity.this.f19172jd.f19914jd) && zAu) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.f19172jd.f19909ef.rq();
                    TTFullScreenVideoActivity.this.f19172jd.nzb.ju();
                    TTFullScreenVideoActivity.this.f19172jd.f19923rv.jj();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            viewYd.setOnClickListener(onClickListener);
            viewYd.setTag(viewYd.getId(), onClickListener);
        }
        this.f19172jd.duq.jpo(new com.bytedance.sdk.openadsdk.component.reward.top.jd() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jd(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.f19172jd.sz.jpo(tTFullScreenVideoActivity.wqx);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jpo(View view) {
                com.bytedance.sdk.openadsdk.core.model.cm cmVarKc;
                com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
                com.bytedance.sdk.openadsdk.component.reward.view.cm cmVarJpo2;
                if (rv.jj(TTFullScreenVideoActivity.this.f19172jd.f19914jd) || (rv.my(TTFullScreenVideoActivity.this.f19172jd.f19914jd) && TTFullScreenVideoActivity.this.f19172jd.f19924se.my(com.bytedance.sdk.openadsdk.component.reward.jpo.xyk.f19977jd))) {
                    if (rv.xyk(TTFullScreenVideoActivity.this.f19172jd.f19914jd)) {
                        TTFullScreenVideoActivity.this.f19172jd.f19924se.xyk();
                        return;
                    }
                    View view2 = viewYd;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.nmd.jpo(TTFullScreenVideoActivity.this.f19172jd.f19914jd) && !TTFullScreenVideoActivity.this.f19172jd.hna.get()) {
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                prr.jpo jpoVar = new prr.jpo();
                jpoVar.jd(TTFullScreenVideoActivity.this.f19172jd.hmu.m442if());
                jpoVar.cm(TTFullScreenVideoActivity.this.f19172jd.hmu.nq());
                jpoVar.wqx(TTFullScreenVideoActivity.this.f19172jd.hmu.hna());
                jpoVar.wqx(3);
                jpoVar.cm(TTFullScreenVideoActivity.this.f19172jd.hmu.hmu());
                jpoVar.jpo(TTFullScreenVideoActivity.this.f19172jd.hmu.jd());
                com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(TTFullScreenVideoActivity.this.f19172jd.hmu.xyk(), jpoVar, TTFullScreenVideoActivity.this.f19172jd.hmu.my());
                hx.wqx(TTFullScreenVideoActivity.this.f19172jd.f19915jj);
                TTFullScreenVideoActivity.this.f19172jd.hmu.jpo("skip", false);
                TTFullScreenVideoActivity.this.f19172jd.duq.cm(false);
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = TTFullScreenVideoActivity.this.f19172jd;
                if (!jpoVar2.wqx || (com.bytedance.sdk.openadsdk.core.model.nmd.wqx(jpoVar2.f19914jd) && (cmVarJpo2 = TTFullScreenVideoActivity.this.f19172jd.f19911hx.jpo()) != null && cmVarJpo2.f20015cm == 0)) {
                    TTFullScreenVideoActivity.this.finish();
                } else {
                    TTFullScreenVideoActivity.this.jpo(true, 4);
                }
                dt dtVar = TTFullScreenVideoActivity.this.f19172jd.f19914jd;
                if (dtVar != null && (cmVarKc = dtVar.kc()) != null && (cmVarJpo = cmVarKc.jpo()) != null) {
                    cmVarJpo.jj(TTFullScreenVideoActivity.this.f19172jd.hmu.m442if());
                    cmVarJpo.my(TTFullScreenVideoActivity.this.f19172jd.hmu.m442if());
                }
                com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(TTFullScreenVideoActivity.this.f19172jd.f19914jd, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void wqx(View view) {
                View view2 = viewYd;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void cm(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jpo(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.cm cmVarKc;
                com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.f19172jd.huv = !r0.huv;
                com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = tTFullScreenVideoActivity.wqx;
                if (jdVar != null && jdVar.cm() != null) {
                    TTFullScreenVideoActivity.this.wqx.cm().jpo(TTFullScreenVideoActivity.this.f19172jd.huv);
                }
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = TTFullScreenVideoActivity.this.f19172jd;
                jpoVar.hmu.jpo(jpoVar.huv, str);
                if (!rv.prr(TTFullScreenVideoActivity.this.f19172jd.f19914jd) || TTFullScreenVideoActivity.this.f19172jd.f19934yd.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = TTFullScreenVideoActivity.this.f19172jd;
                    jpoVar2.f19909ef.my(jpoVar2.huv);
                    com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = TTFullScreenVideoActivity.this.f19172jd;
                    jpoVar3.f19924se.jd(jpoVar3.huv);
                    dt dtVar = TTFullScreenVideoActivity.this.f19172jd.f19914jd;
                    if (dtVar == null || (cmVarKc = dtVar.kc()) == null || (cmVarJpo = cmVarKc.jpo()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar4 = TTFullScreenVideoActivity.this.f19172jd;
                    if (jpoVar4.huv) {
                        cmVarJpo.xyk(jpoVar4.hmu.m442if());
                    } else {
                        cmVarJpo.zz(jpoVar4.hmu.m442if());
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean nmd() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        if (jpoVar == null || dt.my(jpoVar.f19914jd)) {
            return;
        }
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarWw = this.f19172jd.f19914jd.ww();
        if (jdVarWw == null) {
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVar = new com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd();
            jdVar.jpo(10.0d);
            this.f19172jd.f19914jd.jpo(jdVar);
        } else if (jdVarWw.jj() <= 0.0d) {
            jdVarWw.jpo(10.0d);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        uu();
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("recycleRes");
        }
        this.f86if = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        f19189au = this.f86if;
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
        if (jpoVar == null || !jd(jpoVar.f19914jd) || jpo(this.f19172jd.f19914jd)) {
            return;
        }
        if (this.oya) {
            this.oya = false;
            finish();
        } else if (this.f19172jd.f19909ef.hx()) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean rq() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout se() {
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        return (jdVar == null || !(jdVar instanceof com.bytedance.sdk.openadsdk.component.reward.jd.xyk)) ? this.f19172jd.tic.jj() : ((com.bytedance.sdk.openadsdk.component.reward.jd.xyk) jdVar).rv();
    }

    public void wqx(int i10) {
        int iRc = this.f19172jd.f19914jd.rc();
        if (!sq.cm().my(String.valueOf(this.f19172jd.f19915jj)) || (!dt.my(this.f19172jd.f19914jd) && !this.f19172jd.wqx)) {
            if (i10 >= iRc) {
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.f19172jd;
                if (!jpoVar.f19910et) {
                    jpoVar.jpo(true);
                }
                cm();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.f19172jd;
        if (!jpoVar2.f19910et) {
            jpoVar2.jpo(true);
        }
        if (i10 > iRc) {
            cm();
        } else {
            cm(iRc - i10);
            this.f19172jd.duq.my(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void xyk() {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.jpo.wqx.jd jdVar = this.f86if;
            if (jdVar != null) {
                jdVar.jpo();
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
        cmVarJpo.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.my() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.my
            public void jpo() {
                TTFullScreenVideoActivity.this.rv();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jd(boolean z10) {
    }

    private boolean jd(dt dtVar) {
        if (dtVar == null) {
            return false;
        }
        return sq.cm().jr(String.valueOf(this.f19172jd.f19915jj));
    }

    private void jpo(final String str) {
        duq.wqx(new com.bytedance.sdk.component.xyk.xyk("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.jpo(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.f19172jd.fy, str);
                } catch (Throwable th2) {
                    nmd.wqx("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void jpo(Intent intent) {
        super.jpo(intent);
        this.f19172jd.f19913ii = intent.getBooleanExtra("is_verity_playable", false);
    }

    private void cm(int i10) {
        this.f19172jd.duq.jpo(null, String.format(com.bytedance.sdk.component.utils.dt.jpo(sq.jpo(), "tt_skip_ad_time_text"), Integer.valueOf(i10)));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            this.f86if = pdm.jpo().wqx();
        }
        if (this.f86if != null || bundle == null) {
            return;
        }
        this.f86if = f19189au;
        f19189au = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void jpo(long j10, long j11) {
        wqx((int) (j10 / 1000));
        int i10 = this.f19173jj;
        if (i10 >= 0) {
            this.f19172jd.duq.jpo(String.valueOf(i10), null);
        }
    }

    private boolean jpo(dt dtVar) {
        return dtVar == null || dtVar.sy() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void tic() {
    }
}
