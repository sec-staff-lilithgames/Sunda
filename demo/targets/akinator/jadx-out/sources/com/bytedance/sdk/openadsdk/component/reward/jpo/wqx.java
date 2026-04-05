package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.prr;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.common.prr f19975jd;
    private final jpo jpo;
    private TTAdDislikeToast wqx;

    public wqx(jpo jpoVar) {
        this.jpo = jpoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        TTAdDislikeToast tTAdDislikeToast = this.wqx;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean wqx() {
        return this.jpo.umr;
    }

    public void jd() {
        TTAdDislikeToast tTAdDislikeToast = this.wqx;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar) {
        com.bytedance.sdk.openadsdk.activity.xyk xykVar;
        if (this.jpo.vrc.isFinishing()) {
            return;
        }
        if (this.jpo.f107if.get() || ((xykVar = this.jpo.ux) != null && xykVar.xk().dt())) {
            if (this.wqx == null) {
                this.wqx = new TTAdDislikeToast(this.jpo.vrc);
                ((FrameLayout) this.jpo.vrc.findViewById(R.id.content)).addView(this.wqx);
            }
            this.wqx.show(TTAdDislikeToast.getDislikeTip());
            this.jpo.f107if.set(true);
            return;
        }
        if (this.f19975jd == null) {
            try {
                jd(jdVar);
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th2);
            }
        }
        com.bytedance.sdk.openadsdk.common.prr prrVar = this.f19975jd;
        if (prrVar != null) {
            prrVar.jpo();
        }
    }

    private void jd(final com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar) {
        if (this.f19975jd == null) {
            jpo jpoVar = this.jpo;
            com.bytedance.sdk.openadsdk.common.prr prrVar = new com.bytedance.sdk.openadsdk.common.prr(jpoVar.vrc, jpoVar.f19914jd);
            this.f19975jd = prrVar;
            prrVar.setCallback(new prr.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.wqx.1
                @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                public void jd(View view) {
                    wqx.this.jpo.f19917ju.set(false);
                    if (wqx.this.jpo.hmu.my) {
                        if (wqx.this.jpo.f19911hx != null) {
                            wqx.this.jpo.f19911hx.jpo(0, true);
                            return;
                        }
                        return;
                    }
                    wqx.this.jpo.hmu.jpo(jdVar);
                    if (wqx.this.jpo.hmu.zz()) {
                        wqx.this.jpo.hmu.nmd();
                    }
                    if (wqx.this.wqx()) {
                        wqx.this.jpo.ux.xk().jd(wqx.this.jpo.ux, 1);
                    }
                    com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(wqx.this.jpo.f19914jd, 4);
                    wqx.this.jpo.f19924se.jd(0);
                    wqx.this.jpo.f19924se.cm();
                    if (wqx.this.jpo.aix != null) {
                        wqx.this.jpo.aix.jpo();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                public void jpo(View view) {
                    wqx.this.jpo.f19917ju.set(true);
                    String str = "landing_page";
                    if (!nmd.jd(wqx.this.jpo.f19914jd) && !nmd.cm(wqx.this.jpo.f19914jd) && !nmd.jj(wqx.this.jpo.f19914jd) && !nmd.qk(wqx.this.jpo.f19914jd)) {
                        if (!wqx.this.jpo.f19934yd.get()) {
                            str = "video_player";
                        } else if (rv.jd(wqx.this.jpo.f19914jd)) {
                            str = "playable";
                        } else if (!wqx.this.jpo.f19914jd.eq()) {
                            str = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
                        }
                    }
                    wqx.this.f19975jd.setDislikeSource(str);
                    if (wqx.this.jpo.hmu.my) {
                        if (wqx.this.jpo.f19911hx != null) {
                            wqx.this.jpo.f19911hx.jpo(8, false);
                            return;
                        }
                        return;
                    }
                    jdVar.hna();
                    if (wqx.this.jpo.hmu.jj()) {
                        wqx.this.jpo.hmu.rq();
                    }
                    if (wqx.this.wqx()) {
                        wqx.this.jpo.ux.xk().jd(wqx.this.jpo.ux, 2);
                    }
                    com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(wqx.this.jpo.f19914jd, 8);
                    wqx.this.jpo.f19924se.my();
                    wqx.this.jpo.f19924se.qk();
                    if (wqx.this.jpo.aix != null) {
                        wqx.this.jpo.aix.jd();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                public void jpo(FilterWord filterWord) {
                    if (wqx.this.jpo.f107if.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    wqx.this.jpo.f107if.set(true);
                    if (wqx.this.jpo.ux != null) {
                        wqx.this.jpo.ux.xk().jd(true);
                    }
                    wqx.this.cm();
                }
            });
            ((FrameLayout) this.jpo.vrc.findViewById(R.id.content)).addView(this.f19975jd);
        }
        if (this.wqx == null) {
            this.wqx = new TTAdDislikeToast(this.jpo.vrc);
            ((FrameLayout) this.jpo.vrc.findViewById(R.id.content)).addView(this.wqx);
        }
    }

    public void jpo() {
        TTAdDislikeToast tTAdDislikeToast = this.wqx;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }
}
