package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.jd.oya;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.zz.hmu;
import com.bytedance.sdk.openadsdk.core.zz.nmd;
import com.bytedance.sdk.openadsdk.core.zz.prr;
import com.bytedance.sdk.openadsdk.core.zz.sq;
import com.bytedance.sdk.openadsdk.hmu.jd.my;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.va;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends nmd {
    public static float jpo = 100.0f;

    /* renamed from: cm, reason: collision with root package name */
    public int f20015cm;

    /* renamed from: jd, reason: collision with root package name */
    prr f20016jd;

    /* renamed from: jj, reason: collision with root package name */
    private float f20017jj;
    private final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo my;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.nmd.jpo.jpo f20018qk;
    sq wqx;

    public cm(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar, AdSlot adSlot, String str) {
        super(jpoVar.vrc, jpoVar.f19914jd, adSlot, str, jpoVar.huv, !jpoVar.f19927tl);
        this.f20015cm = 1;
        this.f20017jj = -1.0f;
        this.my = jpoVar;
        setVideoBusiness(jpoVar.roc);
    }

    private void au() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.jd.wqx() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.cm.2
            @Override // com.bytedance.sdk.component.adexpress.jd.wqx
            public boolean jpo(ViewGroup viewGroup, int i10) {
                try {
                    ((nmd) viewGroup).nmd();
                    cm.this.wqx = new sq(viewGroup.getContext());
                    cm cmVar = cm.this;
                    cmVar.wqx.jpo(((nmd) cmVar).f150if, (nmd) viewGroup, cm.this.my.f19930va);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm(oya oyaVar) {
        if (oyaVar == null) {
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
                    frameLayoutPrr.addView(this.f21095au, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f21095au.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(iJd3, iJd4);
            }
            layoutParams2.width = iJd3;
            layoutParams2.height = iJd4;
            layoutParams2.topMargin = iJd2;
            layoutParams2.leftMargin = iJd;
            layoutParams2.setMarginStart(iJd);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.f21095au.setLayoutParams(layoutParams2);
        }
    }

    private void wqx(oya oyaVar) {
        FrameLayout frameLayoutHna;
        boolean z10;
        try {
            if (!(oyaVar instanceof com.bytedance.sdk.openadsdk.core.ju.jj.jd) || (frameLayoutHna = ((com.bytedance.sdk.openadsdk.core.ju.jj.jd) oyaVar).hna()) == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.activity.xyk xykVar = this.my.ux;
            boolean z11 = true;
            if (xykVar == null || xykVar.xk() == null) {
                z10 = false;
            } else {
                com.bytedance.sdk.openadsdk.activity.xyk xykVarXyk = this.my.ux.xk().xyk();
                com.bytedance.sdk.openadsdk.activity.xyk xykVar2 = this.my.ux;
                z10 = xykVarXyk == xykVar2;
                if (!xykVar2.xk().jr() && z10) {
                    z11 = false;
                }
            }
            boolean z12 = z11;
            com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = new com.bytedance.sdk.openadsdk.nmd.jpo.jpo(this.zz, this.f150if, this.my.sbx, z12, frameLayoutHna);
            this.f20018qk = jpoVar;
            jpoVar.jpo(this.my.roc);
            this.f20018qk.jpo(false, (com.bytedance.sdk.openadsdk.p001if.jj) null);
            this.f20018qk.jpo();
            com.bytedance.sdk.component.utils.nmd.jpo("TTAD.FRExpressView", "initPlayable success mute = " + this.my.huv + ",isCurrentScene->" + z10 + ",isMute = " + z12);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.model.nmd nmdVar;
        Cif cif = this.my.tic;
        if (cif != null && (nmdVar = cif.prr) != null && nmdVar.zz()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f20017jj = motionEvent.getY();
            } else if (action == 1) {
            }
            if (va.jpo(this.f20017jj, motionEvent.getY(), this.zz)) {
                nmdVar.jd(5);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getBackupContainerBackgroundView() {
        if (rq()) {
            return this.wqx.getBackupContainerBackgroundView();
        }
        return null;
    }

    public FrameLayout getVideoFrameLayout() {
        return rq() ? this.wqx.getVideoContainer() : this.f21095au;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
    /* renamed from: if, reason: not valid java name */
    public void mo446if() {
        try {
            com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.f20018qk;
            if (jpoVar != null) {
                jpoVar.cm();
            }
        } catch (Throwable unused) {
        }
        super.mo446if();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jj() {
        prr prrVar = this.f20016jd;
        if (prrVar != null) {
            prrVar.jj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
    public void ju() {
        super.ju();
        if (this.f20018qk != null) {
            com.bytedance.sdk.openadsdk.activity.xyk xykVar = this.my.ux;
            if (xykVar != null && xykVar.xk() != null) {
                this.f20018qk.jpo(true);
            }
            this.f20018qk.wqx();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public int my() {
        prr prrVar = this.f20016jd;
        if (prrVar == null) {
            return 0;
        }
        int iMy = prrVar.my();
        qk(iMy);
        return iMy;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
    public void qk() {
        this.prr = true;
        this.f21095au = new FrameLayout(this.zz);
        if (!com.bytedance.sdk.openadsdk.core.ju.cm.jpo(this.f150if) && !com.bytedance.sdk.openadsdk.core.ju.cm.jd(this.f150if)) {
            addView(this.f21095au, new FrameLayout.LayoutParams(-1, -1));
        }
        super.qk();
        com.bytedance.sdk.component.zz.jj webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        au();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.p001if.qk() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.cm.1
            @Override // com.bytedance.sdk.openadsdk.p001if.qk
            public void jpo(oya oyaVar) {
                cm.this.jpo(oyaVar);
            }
        });
    }

    public void setExpressVideoListenerProxy(prr prrVar) {
        this.f20016jd = prrVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.component.adexpress.dynamic.cm
    public void setSoundMute(boolean z10) {
        super.setSoundMute(z10);
        com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.f20018qk;
        if (jpoVar != null) {
            jpoVar.jpo(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
    public boolean xyk() {
        com.bytedance.sdk.openadsdk.activity.xyk xykVar = this.my.ux;
        if (xykVar == null || !xykVar.xk().tu()) {
            return true;
        }
        return this.my.f19933ya;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
    public void yd() {
        super.yd();
        if (this.f20018qk != null) {
            com.bytedance.sdk.openadsdk.activity.xyk xykVar = this.my.ux;
            if (xykVar != null && xykVar.xk() != null) {
                this.f20018qk.jpo(this.my.ux.xk().jr());
            }
            this.f20018qk.jd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
    public boolean zz() {
        com.bytedance.sdk.openadsdk.activity.xyk xykVar = this.my.ux;
        return xykVar == null || !xykVar.xk().tu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public boolean jd(JSONObject jSONObject) {
        return com.bytedance.sdk.openadsdk.component.reward.jpo.jpo(this.my);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jd() {
        prr prrVar = this.f20016jd;
        if (prrVar != null) {
            prrVar.jd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.component.adexpress.jd.prr
    public void jpo(com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar, oya oyaVar) {
        this.pdm = cmVar;
        dt dtVar = this.f150if;
        if (dtVar != null && dtVar.aul()) {
            super.jpo(cmVar, oyaVar);
            return;
        }
        if (cmVar instanceof hmu) {
            hmu hmuVar = (hmu) cmVar;
            if (hmuVar.hna() != null) {
                hmuVar.hna().jpo((prr) this);
            }
        }
        if (oyaVar != null && oyaVar.jd()) {
            jpo(oyaVar);
            int iWqx = cmVar.wqx();
            this.f20015cm = iWqx;
            if (iWqx == 10 && rv.wqx(this.f150if)) {
                wqx(oyaVar);
            }
        }
        super.jpo(cmVar, oyaVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jd(int i10) {
        prr prrVar = this.f20016jd;
        if (prrVar != null) {
            prrVar.jd(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public long wqx() {
        prr prrVar = this.f20016jd;
        if (prrVar != null) {
            return prrVar.wqx();
        }
        return 0L;
    }

    public void jpo(final oya oyaVar) {
        if (oyaVar == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.cm.3
            @Override // java.lang.Runnable
            public void run() {
                cm.this.cm(oyaVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
    public my.jpo wqx(int i10) {
        com.bytedance.sdk.openadsdk.activity.xyk xykVar;
        my.jpo jpoVarWqx = super.wqx(i10);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.my;
        if (jpoVar.f19927tl && (xykVar = jpoVar.ux) != null) {
            jpoVarWqx.f21162jd = xykVar.f19414ju;
        }
        return jpoVarWqx;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(String str, JSONObject jSONObject) {
        super.jpo(str, jSONObject);
        prr prrVar = this.f20016jd;
        if (prrVar != null) {
            prrVar.jpo(str, jSONObject);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(boolean z10, String str) {
        prr prrVar = this.f20016jd;
        if (prrVar != null) {
            prrVar.jpo(z10, str);
        }
        setSoundMute(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public boolean jpo(JSONObject jSONObject) {
        Objects.toString(jSONObject);
        prr prrVar = this.f20016jd;
        if (prrVar != null) {
            return prrVar.jpo(jSONObject);
        }
        return super.jpo(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public long cm() {
        prr prrVar = this.f20016jd;
        if (prrVar != null) {
            return prrVar.cm();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo() {
        prr prrVar = this.f20016jd;
        if (prrVar != null) {
            prrVar.jpo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(int i10) {
        prr prrVar = this.f20016jd;
        if (prrVar != null) {
            prrVar.jpo(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(int i10, oya oyaVar) {
        prr prrVar = this.f20016jd;
        if (prrVar != null) {
            prrVar.jpo(i10, oyaVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.component.adexpress.jd.xyk
    public void jpo(View view, int i10, com.bytedance.sdk.component.adexpress.wqx wqxVar) {
        if (i10 != -1 && wqxVar != null && i10 == 3) {
            jj();
        } else {
            super.jpo(view, i10, wqxVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(int i10, String str) {
        prr prrVar = this.f20016jd;
        if (prrVar != null) {
            prrVar.jpo(i10, str);
        }
    }

    public void jpo(long j10, long j11) {
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if (cmVar instanceof com.bytedance.sdk.openadsdk.core.ju.jj.cm) {
            ((com.bytedance.sdk.openadsdk.core.ju.jj.cm) cmVar).jpo(j10, j11);
        }
    }
}
