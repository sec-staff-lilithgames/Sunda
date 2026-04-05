package com.bytedance.sdk.openadsdk.component.zz;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bytedance.sdk.component.adexpress.jd.au;
import com.bytedance.sdk.component.adexpress.jd.oya;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz.hmu;
import com.bytedance.sdk.openadsdk.core.zz.nmd;
import com.bytedance.sdk.openadsdk.core.zz.prr;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.va;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends nmd {

    /* renamed from: cm, reason: collision with root package name */
    float f20106cm;

    /* renamed from: jd, reason: collision with root package name */
    boolean f20107jd;

    /* renamed from: jj, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.jj.jd f20108jj;
    boolean jpo;
    private final com.bytedance.sdk.openadsdk.component.jpo my;

    /* renamed from: qk, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.xyk.jpo f20109qk;

    /* renamed from: rv, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.jj.jpo f20110rv;
    private wqx.jpo sz;

    /* renamed from: uu, reason: collision with root package name */
    private FrameLayout f20111uu;
    int wqx;
    private com.bytedance.sdk.openadsdk.component.xyk.wqx xyk;

    public jd(Context context, dt dtVar, AdSlot adSlot, String str, com.bytedance.sdk.openadsdk.component.jpo jpoVar, com.bytedance.sdk.openadsdk.component.jj.jd jdVar, com.bytedance.sdk.openadsdk.component.xyk.jpo jpoVar2) {
        super(context, dtVar, adSlot, str, true, true);
        this.jpo = true;
        this.f20107jd = false;
        this.wqx = 0;
        this.f20106cm = 1.0f;
        this.my = jpoVar;
        this.f20108jj = jdVar;
        this.f20109qk = jpoVar2;
        if (dtVar == null || dtVar.fmg() == null) {
            return;
        }
        this.wqx = dtVar.fmg().jd();
        this.f20106cm = dtVar.fmg().jpo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx(oya oyaVar) {
        if (oyaVar == null) {
            return;
        }
        if (oyaVar.jpo() != null) {
            if (this.jpo) {
                oyaVar.jpo().setTag(com.bytedance.sdk.component.adexpress.dynamic.jpo.f18269jj, 1);
                ((FrameLayout) oyaVar.jpo()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) oyaVar.jpo();
                this.f20111uu = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.jpo = false;
                return;
            }
            return;
        }
        double dMy = oyaVar.my();
        double dJj = oyaVar.jj();
        double dQk = oyaVar.qk();
        double dXyk = oyaVar.xyk();
        int iJd = va.jd(this.zz, (float) dMy);
        int iJd2 = va.jd(this.zz, (float) dJj);
        int iJd3 = va.jd(this.zz, (float) dQk);
        int iJd4 = va.jd(this.zz, (float) dXyk);
        if ((dXyk != 0.0d && dQk != 0.0d) || this.pdm.wqx() == 7 || this.pdm.wqx() == 10) {
            if ((this.pdm.wqx() == 7 || this.pdm.wqx() == 10) && (oyaVar instanceof com.bytedance.sdk.openadsdk.core.ju.jj.jd)) {
                FrameLayout frameLayoutPrr = ((com.bytedance.sdk.openadsdk.core.ju.jj.jd) oyaVar).prr();
                if (frameLayoutPrr != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    frameLayoutPrr.addView(this.f20111uu, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f20111uu.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iJd3, iJd4);
            }
            layoutParams2.width = iJd3;
            layoutParams2.height = iJd4;
            layoutParams2.topMargin = iJd2;
            layoutParams2.leftMargin = iJd;
            layoutParams2.setMarginStart(iJd);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.f20111uu.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public long cm() {
        return this.f20109qk.wqx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
    public int getDynamicShowType() {
        if (this.pdm == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.qk.jpo.jpo(this.f150if, sq.cm().jj(String.valueOf(this.f150if.jl())));
    }

    public FrameLayout getVideoFrameLayout() {
        return this.f20111uu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jd() {
        super.jd();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jj() {
        com.bytedance.sdk.openadsdk.component.jj.jpo jpoVar = this.f20110rv;
        if (jpoVar != null) {
            jpoVar.jd(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(int i10, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public int my() {
        com.bytedance.sdk.openadsdk.component.xyk.wqx wqxVar = this.xyk;
        if (wqxVar != null && wqxVar.qk()) {
            return 1;
        }
        com.bytedance.sdk.openadsdk.component.xyk.wqx wqxVar2 = this.xyk;
        if (wqxVar2 != null && wqxVar2.jj()) {
            return 3;
        }
        com.bytedance.sdk.openadsdk.component.xyk.wqx wqxVar3 = this.xyk;
        if (wqxVar3 != null && wqxVar3.my()) {
            return 2;
        }
        com.bytedance.sdk.openadsdk.component.xyk.wqx wqxVar4 = this.xyk;
        if (wqxVar4 == null || !wqxVar4.wqx()) {
            com.bytedance.sdk.openadsdk.component.xyk.wqx wqxVar5 = this.xyk;
            return (wqxVar5 == null || !wqxVar5.cm()) ? 3 : 5;
        }
        qk(4);
        return 4;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
    public void qk() {
        this.prr = true;
        this.f20111uu = new FrameLayout(this.zz);
        if (!com.bytedance.sdk.openadsdk.core.ju.cm.jpo(this.f150if) && !com.bytedance.sdk.openadsdk.core.ju.cm.jd(this.f150if)) {
            addView(this.f20111uu, new FrameLayout.LayoutParams(-1, -1));
        }
        super.qk();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.p001if.qk() { // from class: com.bytedance.sdk.openadsdk.component.zz.jd.1
            @Override // com.bytedance.sdk.openadsdk.p001if.qk
            public void jpo(oya oyaVar) {
                jd.this.jpo(oyaVar);
            }
        });
    }

    public void setExpressVideoListenerProxy(wqx.jpo jpoVar) {
        this.sz = jpoVar;
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.jj.jpo jpoVar) {
        this.f20110rv = jpoVar;
    }

    public void setVideoManager(com.bytedance.sdk.openadsdk.component.xyk.wqx wqxVar) {
        this.xyk = wqxVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.component.adexpress.jd.prr
    public void jpo(com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar, oya oyaVar) {
        this.pdm = cmVar;
        if (cmVar instanceof hmu) {
            hmu hmuVar = (hmu) cmVar;
            if (hmuVar.hna() != null) {
                hmuVar.hna().jpo((prr) this);
            }
        }
        if (oyaVar != null && oyaVar.jd()) {
            jpo(oyaVar);
        }
        super.jpo(cmVar, oyaVar);
    }

    public void jpo(final oya oyaVar) {
        if (oyaVar == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.zz.jd.2
            @Override // java.lang.Runnable
            public void run() {
                jd.this.wqx(oyaVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo() {
        com.bytedance.sdk.openadsdk.component.jj.jpo jpoVar = this.f20110rv;
        if (jpoVar != null) {
            jpoVar.jpo(this);
        }
    }

    public void jpo(long j10, long j11) {
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if (cmVar instanceof com.bytedance.sdk.openadsdk.core.ju.jj.cm) {
            ((com.bytedance.sdk.openadsdk.core.ju.jj.cm) cmVar).jpo(j10, j11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public boolean jpo(JSONObject jSONObject) {
        dt dtVar;
        if (jSONObject == null) {
            this.f20107jd = false;
            return false;
        }
        int i10 = this.wqx;
        if (i10 != 1 && i10 != 2) {
            this.f20107jd = false;
            return false;
        }
        int iOptInt = jSONObject.optInt("switch", 0);
        float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.f20106cm = fOptDouble;
        if (fOptDouble <= 0.0f && (dtVar = this.f150if) != null && dtVar.fmg() != null) {
            this.f20106cm = this.f150if.fmg().jpo();
        }
        boolean z10 = iOptInt == 1;
        this.f20107jd = z10;
        com.bytedance.sdk.openadsdk.component.jj.jd jdVar = this.f20108jj;
        if (jdVar != null) {
            jdVar.jpo(this.wqx, this.f20106cm, z10);
            com.bytedance.sdk.openadsdk.component.xyk.wqx wqxVar = this.xyk;
            if (wqxVar != null && wqxVar.jd() != null && this.f20109qk != null) {
                this.xyk.jd().jpo(this.f20109qk.jpo());
                com.bytedance.sdk.component.utils.nmd.jpo("PAGAppOpenAdExpressView", "isAccelerate =" + this.f20107jd + ",total duration = " + this.xyk.jd().sq());
            }
        }
        if (this.wqx == 1) {
            return true;
        }
        if (!this.f20107jd) {
            this.f20106cm = 1.0f;
        }
        com.bytedance.sdk.openadsdk.component.xyk.wqx wqxVar2 = this.xyk;
        if (wqxVar2 != null) {
            return wqxVar2.jpo(this.f20106cm);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public long wqx() {
        return this.f20109qk.wqx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(int i10) {
        com.bytedance.sdk.openadsdk.component.xyk.wqx wqxVar = this.xyk;
        if (wqxVar == null) {
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                wqxVar.xyk();
                this.f20108jj.cm();
                return;
            } else if (i10 == 3) {
                wqxVar.zz();
                this.f20108jj.wqx();
                return;
            } else if (i10 == 4) {
                wqxVar.yd();
                return;
            } else if (i10 != 5) {
                return;
            }
        }
        if (wqxVar.my() || this.xyk.jj()) {
            return;
        }
        this.xyk.jpo(getVideoFrameLayout(), this.my, this.f150if);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
    public void wqx(JSONObject jSONObject) throws JSONException {
        dt dtVar = this.f150if;
        boolean z10 = dtVar != null && dtVar.tl() == 0;
        dt dtVar2 = this.f150if;
        com.bytedance.sdk.openadsdk.component.qk.jpo.jpo(jSONObject, dtVar2 != null ? dtVar2.jl() : 0, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.component.adexpress.jd.xyk
    public void jpo(View view, int i10, com.bytedance.sdk.component.adexpress.wqx wqxVar) {
        if (i10 != -1 && wqxVar != null && i10 == 3) {
            jj();
        } else {
            super.jpo(view, i10, wqxVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
    public void jpo(au.jpo jpoVar) {
        jpoVar.my(com.bytedance.sdk.openadsdk.component.qk.jpo.jpo());
    }
}
