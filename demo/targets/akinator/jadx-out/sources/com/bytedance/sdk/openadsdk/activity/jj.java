package com.bytedance.sdk.openadsdk.activity;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.cm.my.jd.prr;
import com.bytedance.sdk.openadsdk.component.reward.view.Cif;
import com.bytedance.sdk.openadsdk.component.reward.view.yd;
import com.bytedance.sdk.openadsdk.core.hx;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.sq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends jpo {
    private boolean nmd;

    public jj(jd jdVar, dt dtVar, int i10, int i11, boolean z10) {
        super(jdVar, dtVar, i10, i11, z10);
    }

    private boolean jpo(dt dtVar) {
        return dtVar == null || dtVar.sy() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public boolean a_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public String b_() {
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void c_() {
        this.zz.sz.jpo(((jpo) this).f19380jd);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpo, com.bytedance.sdk.openadsdk.activity.xyk
    public void cm() {
        super.cm();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        if (jpoVar == null || !jd(jpoVar.f19914jd) || jpo(this.zz.f19914jd)) {
            return;
        }
        if (this.nmd) {
            this.nmd = false;
            fy();
        } else if (this.zz.f19909ef.hx()) {
            fy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public boolean d_() {
        return this.zz.huv;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk, com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void dm() {
        if (this.zz.f19914jd.sy() != 100.0f) {
            this.nmd = true;
        }
        super.dm();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.jpo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jd() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.zz
            com.bytedance.sdk.openadsdk.core.model.dt r0 = r0.f19914jd
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.dt.my(r0)
            r1 = 0
            if (r0 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.zz
            boolean r2 = r0.wqx
            if (r2 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.jpo.if r0 = r0.duq
            java.lang.String r2 = "X"
            r0.jpo(r1, r2)
            goto L24
        L19:
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.jpo.if r0 = r0.duq
            java.lang.String r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText()
            r0.jpo(r1, r2)
        L24:
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r3.zz
            com.bytedance.sdk.openadsdk.component.reward.jpo.if r0 = r0.duq
            r1 = 1
            r0.my(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.jj.jd():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.jpo
    public void my() {
        final View viewYd = this.zz.tic.yd();
        if (viewYd != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.jj.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (jj.this.zz.f19909ef.nmd() && jj.this.zz.f19934yd.get()) {
                        boolean zAu = jj.this.zz.nzb.au();
                        jj.this.zz.f19909ef.jj(zAu);
                        jj.this.zz.tic.jj(8);
                        jj.this.zz.xk.sendEmptyMessageDelayed(600, 5000L);
                        if (!dt.wqx(jj.this.zz.f19914jd)) {
                            return;
                        }
                        if (dt.wqx(jj.this.zz.f19914jd) && zAu) {
                            return;
                        }
                    }
                    jj.this.zz.f19909ef.rq();
                    jj.this.zz.nzb.ju();
                    jj.this.zz.f19923rv.jj();
                    jj.this.fy();
                }
            };
            viewYd.setOnClickListener(onClickListener);
            viewYd.setTag(viewYd.getId(), onClickListener);
        }
        this.zz.duq.jpo(new com.bytedance.sdk.openadsdk.component.reward.top.jd() { // from class: com.bytedance.sdk.openadsdk.activity.jj.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void cm(View view) {
                jj jjVar = jj.this;
                jjVar.jpo(jjVar.zz);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jd(View view) {
                jj.this.c_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.jd
            public void jpo(View view) {
                com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
                if (nmd.jpo(jj.this.zz.f19914jd) && !jj.this.zz.hna.get()) {
                    jj.this.fy();
                    return;
                }
                jj.this.zz.hmu.uu();
                prr.jpo jpoVar = new prr.jpo();
                jpoVar.jd(jj.this.zz.hmu.m442if());
                jpoVar.cm(jj.this.zz.hmu.nq());
                jpoVar.wqx(jj.this.zz.hmu.hna());
                jpoVar.wqx(3);
                jpoVar.cm(jj.this.zz.hmu.hmu());
                jpoVar.jpo(jj.this.zz.hmu.jd());
                com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(jj.this.zz.hmu.xyk(), jpoVar, jj.this.zz.hmu.my());
                hx.wqx(jj.this.zz.f19915jj);
                jj.this.zz.hmu.jpo("skip", false);
                jj.this.zz.duq.cm(false);
                jj jjVar = jj.this;
                if (jjVar.zz.wqx) {
                    jjVar.jpo(true, 4);
                } else {
                    jjVar.fy();
                }
                dt dtVar = jj.this.zz.f19914jd;
                if (dtVar != null && dtVar.kc() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = jj.this.zz;
                    if (jpoVar2.hmu != null && (cmVarJpo = jpoVar2.f19914jd.kc().jpo()) != null) {
                        cmVarJpo.jj(jj.this.zz.hmu.m442if());
                        cmVarJpo.my(jj.this.zz.hmu.m442if());
                    }
                }
                com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(jj.this.zz.f19914jd, 5);
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
                jj.this.jpo(str);
            }
        });
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
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar;
        if (!this.f19412jj.jj()) {
            com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = ((jpo) this).f19380jd;
            if (jdVar != null && (jdVar instanceof com.bytedance.sdk.openadsdk.component.reward.jd.xyk)) {
                return ((com.bytedance.sdk.openadsdk.component.reward.jd.xyk) jdVar).rv();
            }
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.zz;
            if (jpoVar2 == null || (cif = jpoVar2.tic) == null) {
                return null;
            }
            return cif.jj();
        }
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar2 = ((jpo) this).f19380jd;
        if (jdVar2 != null && (jdVar2 instanceof com.bytedance.sdk.openadsdk.component.reward.jd.xyk) && (jpoVar = this.zz) != null && !jpoVar.f19907dn) {
            return ((com.bytedance.sdk.openadsdk.component.reward.jd.xyk) jdVar2).rv();
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = this.zz;
        if (jpoVar3 == null || (ydVar = jpoVar3.f19911hx) == null) {
            return null;
        }
        return ydVar.jd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk
    public void jpo(String str) {
        com.bytedance.sdk.openadsdk.core.model.cm cmVarKc;
        com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.zz;
        jpoVar.huv = !jpoVar.huv;
        yd ydVar = jpoVar.f19911hx;
        if (ydVar != null && ydVar.jpo() != null) {
            this.zz.f19911hx.jpo().setSoundMute(this.zz.huv);
        }
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = ((jpo) this).f19380jd;
        if (jdVar != null && jdVar.cm() != null) {
            ((jpo) this).f19380jd.cm().jpo(this.zz.huv);
        }
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

    private boolean jd(dt dtVar) {
        if (dtVar == null) {
            return false;
        }
        return sq.cm().jr(String.valueOf(this.zz.f19915jj));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xyk, com.bytedance.sdk.openadsdk.core.au.cm.jd
    public void tic() {
    }
}
