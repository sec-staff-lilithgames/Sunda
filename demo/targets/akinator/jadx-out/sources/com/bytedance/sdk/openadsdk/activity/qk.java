package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.activity.jd;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.Cif;
import com.bytedance.sdk.openadsdk.component.reward.view.yd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.jd;
import org.json.JSONObject;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class qk extends jpo {

    /* renamed from: dt, reason: collision with root package name */
    private static String f19400dt;
    private static String hmu;
    private static String nmd;

    /* renamed from: rq, reason: collision with root package name */
    private static String f19401rq;

    /* renamed from: tu, reason: collision with root package name */
    private static String f19402tu;

    /* renamed from: nq, reason: collision with root package name */
    private int f19403nq;

    public qk(jd jdVar, dt dtVar, int i10, int i11, boolean z10) {
        super(jdVar, dtVar, i10, i11, z10);
        this.f19403nq = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ota() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r0 = r0.hmu
            r0.uu()
            com.bytedance.sdk.openadsdk.cm.my.jd.prr$jpo r0 = new com.bytedance.sdk.openadsdk.cm.my.jd.prr$jpo
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            long r1 = r1.m442if()
            r0.jd(r1)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            long r1 = r1.nq()
            r0.cm(r1)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            long r1 = r1.hna()
            r0.wqx(r1)
            r1 = 3
            r0.wqx(r1)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            int r1 = r1.hmu()
            r0.cm(r1)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            long r1 = r1.jd()
            r0.jpo(r1)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo r1 = r1.xyk()
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r2 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r2 = r2.hmu
            com.bytedance.sdk.openadsdk.cm.qk r2 = r2.my()
            com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.zz
            int r0 = r0.f19915jj
            com.bytedance.sdk.openadsdk.core.hx.wqx(r0)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r0 = r0.hmu
            java.lang.String r1 = "skip"
            r2 = 0
            r0.jpo(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.zz
            boolean r0 = r0.wqx
            if (r0 == 0) goto L8a
            r0 = 1
            r1 = 4
            r3.jpo(r0, r1)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.zz
            com.bytedance.sdk.openadsdk.core.model.dt r0 = r0.f19914jd
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.nmd.jpo(r0)
            if (r0 == 0) goto L8d
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.zz
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.hna
            boolean r0 = r0.get()
            if (r0 != 0) goto L8d
        L8a:
            r3.fy()
        L8d:
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.zz
            com.bytedance.sdk.openadsdk.core.model.dt r0 = r0.f19914jd
            com.bytedance.sdk.openadsdk.core.model.cm r0 = r0.kc()
            if (r0 == 0) goto Lab
            com.bytedance.sdk.openadsdk.core.if.cm r0 = r0.jpo()
            if (r0 == 0) goto Lab
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r1 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r1.hmu
            long r1 = r1.m442if()
            r0.jj(r1)
            r0.my(r1)
        Lab:
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.zz
            com.bytedance.sdk.openadsdk.core.model.dt r0 = r0.f19914jd
            r1 = 5
            com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.qk.ota():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public boolean a_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public String b_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void c_() {
        this.zz.sz.jpo(((jpo) this).f19380jd);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public boolean d_() {
        return this.zz.huv;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpo
    public void jd() {
        this.zz.duq.jpo(null, TTAdDislikeToast.getSkipText());
        this.zz.duq.my(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpo
    public void my() {
        final View viewYd = this.zz.tic.yd();
        if (viewYd != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.qk.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qk.this.zz.f19909ef.nmd() && qk.this.zz.f19934yd.get()) {
                        boolean zAu = qk.this.zz.nzb.au();
                        qk.this.zz.f19909ef.jj(zAu);
                        qk.this.zz.tic.jj(8);
                        qk.this.zz.xk.sendEmptyMessageDelayed(600, 5000L);
                        if (!dt.wqx(qk.this.zz.f19914jd)) {
                            return;
                        }
                        if (dt.wqx(qk.this.zz.f19914jd) && zAu) {
                            return;
                        }
                    }
                    qk.this.zz.f19909ef.rq();
                    qk.this.zz.nzb.ju();
                    qk.this.zz.f19923rv.jj();
                    if (rv.cm(qk.this.zz.f19914jd)) {
                        qk.this.jpo(true, true, (Runnable) null);
                    } else {
                        qk.this.fy();
                    }
                }
            };
            viewYd.setOnClickListener(onClickListener);
            viewYd.setTag(viewYd.getId(), onClickListener);
        }
        this.zz.duq.jpo(new com.bytedance.sdk.openadsdk.component.reward.top.jd() { // from class: com.bytedance.sdk.openadsdk.activity.qk.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void cm(View view) {
                qk qkVar = qk.this;
                qkVar.jpo(qkVar.zz);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jd(View view) {
                qk.this.c_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jpo(View view) {
                qk qkVar = qk.this;
                qkVar.jpo(rv.wqx(qkVar.zz.f19914jd), false, (Runnable) null);
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
                qk.this.jpo(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpo, com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void opi() {
        dn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void va() {
        super.va();
        this.my = false;
        this.zz.f19911hx.jd(false);
        this.zz.hmu.roc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpo
    public FrameLayout xyk() {
        Cif cif;
        yd ydVar;
        if (this.f19412jj.jj()) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
            if (jpoVar == null || (ydVar = jpoVar.f19911hx) == null) {
                return null;
            }
            return ydVar.jd();
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.zz;
        if (jpoVar2 == null || (cif = jpoVar2.tic) == null) {
            return null;
        }
        return cif.jj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk, com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jd(int i10) {
        if (i10 == 10000) {
            dn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpo, com.bytedance.sdk.openadsdk.activity.xyk
    public void jpo(Activity activity, jd.my myVar) {
        jd jdVar;
        super.jpo(activity, myVar);
        if (com.bytedance.sdk.component.utils.jd.jpo(activity)) {
            return;
        }
        Intent intent = activity.getIntent();
        this.prr = intent.getStringExtra("media_extra");
        this.oya = intent.getStringExtra("user_id");
        try {
            if (f19400dt == null) {
                f19400dt = com.bytedance.sdk.component.utils.dt.jpo(this.zz.f19920pe, "tt_reward_msg");
                nmd = com.bytedance.sdk.component.utils.dt.jpo(this.zz.f19920pe, GalEuEfxjome.ovCWumhbTXNNzO);
                f19402tu = com.bytedance.sdk.component.utils.dt.jpo(this.zz.f19920pe, "tt_negtiveBtnBtnText");
                hmu = com.bytedance.sdk.component.utils.dt.jpo(this.zz.f19920pe, "tt_postiveBtnText");
                f19401rq = com.bytedance.sdk.component.utils.dt.jpo(this.zz.f19920pe, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            nmd.wqx("TTAD.RewardAdScene", th2.getMessage());
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        if (jpoVar == null || (jdVar = this.f19415qk) == null) {
            return;
        }
        jpoVar.f19932wu = jdVar.jpo;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void jpo(String str) {
        com.bytedance.sdk.openadsdk.core.model.cm cmVarKc;
        com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = ((jpo) this).f19380jd;
        if (jdVar != null && jdVar.cm() != null) {
            ((jpo) this).f19380jd.cm().jpo(this.zz.huv);
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        jpoVar.huv = !jpoVar.huv;
        yd ydVar = jpoVar.f19911hx;
        if (ydVar != null && ydVar.jpo() != null) {
            this.zz.f19911hx.jpo().setSoundMute(this.zz.huv);
        }
        StringBuilder sb2 = new StringBuilder("will set is Mute ");
        sb2.append(this.zz.huv);
        sb2.append(" mLastVolume=");
        sb2.append(this.zz.kln.jpo());
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.zz;
        jpoVar2.hmu.jpo(jpoVar2.huv, str);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = this.zz;
        jpoVar3.f19909ef.my(jpoVar3.huv);
        dt dtVar = this.zz.f19914jd;
        if (dtVar == null || (cmVarKc = dtVar.kc()) == null || (cmVarJpo = cmVarKc.jpo()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar4 = this.zz;
        if (jpoVar4.huv) {
            cmVarJpo.xyk(jpoVar4.hmu.m442if());
        } else {
            cmVarJpo.zz(jpoVar4.hmu.m442if());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jpo(final boolean z10, boolean z11, final Runnable runnable) {
        if (!z11 && this.f19415qk.zz().getBoolean("user_has_give_up_reward", false) && runnable != null) {
            return false;
        }
        if (!sq.cm().qk(String.valueOf(this.zz.f19915jj))) {
            if (runnable == null) {
                if (z10) {
                    fy();
                    return false;
                }
                ota();
            }
            return false;
        }
        if (this.f19415qk.zz().getBoolean("reward_verify", false)) {
            if (runnable == null) {
                if (z10) {
                    fy();
                    return false;
                }
                ota();
            }
            return false;
        }
        this.zz.nmd.set(true);
        this.zz.hmu.rq();
        if (z10) {
            this.zz.f19924se.my();
        }
        final com.bytedance.sdk.openadsdk.core.widget.jd jdVar = new com.bytedance.sdk.openadsdk.core.widget.jd(ic());
        ((jpo) this).f19380jd.f19839au = jdVar;
        if (z10) {
            jdVar.jpo(nmd).jd(f19401rq).wqx(f19402tu);
        } else {
            jdVar.jpo(f19400dt).jd(hmu).wqx(f19402tu);
        }
        ((jpo) this).f19380jd.f19839au.jpo(new jd.InterfaceC0134jd() { // from class: com.bytedance.sdk.openadsdk.activity.qk.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.jd.InterfaceC0134jd
            public void jd() {
                jdVar.dismiss();
                qk.this.f19415qk.zz().putBoolean("user_has_give_up_reward", true);
                qk.this.zz.nmd.set(false);
                qk.this.zz.f19924se.wqx(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z10) {
                    qk.this.ota();
                } else {
                    qk.this.zz.f19923rv.jj();
                    qk.this.fy();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jd.InterfaceC0134jd
            public void jpo() {
                qk.this.zz.hmu.nmd();
                if (z10) {
                    qk.this.zz.f19924se.jd(1000);
                }
                jdVar.dismiss();
                qk.this.zz.nmd.set(false);
            }
        }).show();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpo, com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void jpo(final String str, final JSONObject jSONObject) {
        if ("skipToNextAd".equals(str) && this.zz.ux != null && this.f19415qk.rq() == null && jpo(rv.wqx(this.zz.f19914jd), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.qk.4
            @Override // java.lang.Runnable
            public void run() {
                qk.super.jpo(str, jSONObject);
            }
        })) {
            return;
        }
        super.jpo(str, jSONObject);
    }
}
