package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.activity.cm;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.se;
import com.bytedance.sdk.openadsdk.core.widget.opi;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz {

    /* renamed from: au, reason: collision with root package name */
    protected boolean f19982au;
    protected FrameLayout hna;

    /* renamed from: if, reason: not valid java name */
    protected boolean f109if;

    /* renamed from: jd, reason: collision with root package name */
    private cm.jj f19983jd;
    private opi jpo;

    /* renamed from: ju, reason: collision with root package name */
    protected final jpo f19984ju;
    protected AtomicBoolean opi = new AtomicBoolean(false);
    protected boolean oya;
    protected boolean prr;

    /* renamed from: qk, reason: collision with root package name */
    protected volatile boolean f19985qk;

    /* renamed from: sq, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.nmd.jpo.jpo f19986sq;
    private boolean wqx;
    protected final Activity xyk;

    /* renamed from: yd, reason: collision with root package name */
    protected final String f19987yd;
    protected final dt zz;

    public zz(jpo jpoVar) {
        this.f19984ju = jpoVar;
        this.xyk = jpoVar.vrc;
        this.f19987yd = jpoVar.my;
        dt dtVar = jpoVar.f19914jd;
        this.zz = dtVar;
        this.f19982au = rv.my(dtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm(boolean z10) {
        com.bytedance.sdk.openadsdk.activity.jd jdVarXk;
        jpo jpoVar = this.f19984ju;
        if (!jpoVar.f19927tl) {
            if (this instanceof qk) {
                jpo(0L);
            } else {
                cm.jj jjVar = this.f19983jd;
                if (jjVar != null) {
                    jjVar.wqx();
                }
            }
            this.wqx = false;
            return;
        }
        com.bytedance.sdk.openadsdk.activity.xyk xykVar = jpoVar.ux;
        if (xykVar == null || (jdVarXk = xykVar.xk()) == null) {
            return;
        }
        if (z10) {
            jdVarXk.se();
        }
        jdVarXk.jpo(1);
    }

    private void hna() {
        if (this.f19984ju.f19914jd.by()) {
            opi opiVar = new opi(this.f19984ju, new opi.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.zz.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.opi.jpo
                public int cm() {
                    zz zzVar = zz.this;
                    return zzVar.f19984ju.f19927tl ? zzVar.m443if() : zzVar.xyk();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.opi.jpo
                public void jd() {
                    ef efVarQk = zz.this.f19986sq.qk();
                    if (efVarQk != null) {
                        efVarQk.jpo("popupDidDismiss", (JSONObject) null);
                    }
                    zz.this.cm(true);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.opi.jpo
                public void jj() {
                    zz.this.cm(false);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.opi.jpo
                public void jpo() {
                    zz.this.f19984ju.roc.jpo("skipToNextAd", (JSONObject) null);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.opi.jpo
                public void my() {
                    zz.this.sq();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.opi.jpo
                public void wqx() {
                    com.bytedance.sdk.openadsdk.activity.xyk xykVar;
                    com.bytedance.sdk.openadsdk.activity.jd jdVarXk;
                    ef efVarQk = zz.this.f19986sq.qk();
                    if (efVarQk != null) {
                        efVarQk.jpo("popupDidShow", (JSONObject) null);
                    }
                    jpo jpoVar = zz.this.f19984ju;
                    if (!jpoVar.f19927tl || (xykVar = jpoVar.ux) == null || (jdVarXk = xykVar.xk()) == null) {
                        return;
                    }
                    jdVarXk.hx();
                }
            });
            this.jpo = opiVar;
            opiVar.jpo(this.f19984ju.f19930va);
            ef efVarQk = this.f19986sq.qk();
            if (efVarQk != null) {
                efVarQk.jpo(new se() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.zz.2
                    @Override // com.bytedance.sdk.openadsdk.core.se
                    public void k_() throws JSONException {
                        if (zz.this.jpo != null) {
                            zz.this.jpo.jpo(zz.this.f19984ju.vrc);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.se
                    public void l_() {
                        if (zz.this.jpo != null) {
                            zz.this.jpo.l_();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.se
                    public int m_() {
                        zz zzVar = zz.this;
                        return zzVar.f19984ju.f19927tl ? zzVar.m443if() : zzVar.xyk();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.se
                    public void n_() {
                        zz.this.sq();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.se
                    public void o_() {
                        zz.this.cm(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.se
                    public void p_() {
                    }
                });
            }
        }
    }

    private void opi() {
        int iGdx = this.zz.gdx();
        if (iGdx == -1) {
            if (rv.qk(this.zz)) {
                com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.f19986sq;
                if (jpoVar == null || !jpoVar.my()) {
                    this.f19984ju.ree.dt();
                    return;
                } else {
                    this.f19984ju.f19916jr.set(true);
                    this.f19984ju.ree.prr();
                }
            } else {
                this.f19984ju.f19916jr.set(true);
                this.f19984ju.ree.prr();
            }
        } else {
            if (iGdx < 0) {
                return;
            }
            this.f19984ju.duq.cm(false);
            if (rv.qk(this.zz)) {
                com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar2 = this.f19986sq;
                if (jpoVar2 == null || !jpoVar2.my()) {
                    cm.jj jjVar = new cm.jj(iGdx) { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.zz.5
                        @Override // com.bytedance.sdk.openadsdk.activity.cm.jj
                        public void jpo() {
                            zz.this.f19984ju.xk.sendEmptyMessage(1);
                        }
                    };
                    this.f19983jd = jjVar;
                    jjVar.my();
                    return;
                } else {
                    cm.jj jjVar2 = new cm.jj(iGdx) { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.zz.4
                        @Override // com.bytedance.sdk.openadsdk.activity.cm.jj
                        public void jpo() {
                            zz.this.f19984ju.xk.sendEmptyMessage(600);
                        }
                    };
                    this.f19983jd = jjVar2;
                    jjVar2.my();
                }
            } else {
                cm.jj jjVar3 = new cm.jj(iGdx) { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.zz.6
                    @Override // com.bytedance.sdk.openadsdk.activity.cm.jj
                    public void jpo() {
                        zz.this.f19984ju.xk.sendEmptyMessage(600);
                    }
                };
                this.f19983jd = jjVar3;
                jjVar3.my();
            }
        }
        jpo jpoVar3 = this.f19984ju;
        if (jpoVar3.aix == null || !jpoVar3.cm()) {
            return;
        }
        this.f19984ju.aix.jpo(iGdx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sq() {
        com.bytedance.sdk.openadsdk.activity.jd jdVarXk;
        jpo jpoVar = this.f19984ju;
        if (jpoVar.f19927tl) {
            com.bytedance.sdk.openadsdk.activity.xyk xykVar = jpoVar.ux;
            if (xykVar == null || (jdVarXk = xykVar.xk()) == null) {
                return;
            }
            jdVarXk.jpo(2);
            return;
        }
        if (this instanceof qk) {
            zz();
        } else {
            cm.jj jjVar = this.f19983jd;
            if (jjVar != null) {
                jjVar.jd();
            }
        }
        this.wqx = true;
    }

    public boolean au() {
        return this.f19985qk;
    }

    /* renamed from: if, reason: not valid java name */
    public int m443if() {
        com.bytedance.sdk.openadsdk.activity.jd jdVarXk;
        com.bytedance.sdk.openadsdk.activity.xyk xykVar = this.f19984ju.ux;
        if (xykVar == null || (jdVarXk = xykVar.xk()) == null) {
            return 0;
        }
        return jdVarXk.pdm();
    }

    public void jj() {
        if (this.f19982au && !this.prr) {
            this.prr = true;
            com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.f19986sq;
            if (jpoVar != null) {
                jpoVar.cm();
            }
            FrameLayout frameLayout = this.hna;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            opi opiVar = this.jpo;
            if (opiVar != null) {
                opiVar.zz();
                this.jpo = null;
            }
            cm.jj jjVar = this.f19983jd;
            if (jjVar != null) {
                jjVar.cm();
                this.f19983jd = null;
            }
        }
    }

    public void jpo(int i10) {
    }

    public boolean ju() {
        return !this.wqx;
    }

    public void my() {
        if (!this.f19982au || this.opi.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.f19986sq;
        if (jpoVar != null) {
            jpoVar.wqx();
        }
        cm.jj jjVar = this.f19983jd;
        if (jjVar != null) {
            jjVar.jd();
        }
    }

    public void oya() throws JSONException {
        if (!this.opi.compareAndSet(false, true)) {
            this.f19984ju.f19909ef.qk();
            return;
        }
        com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.f19986sq;
        if (jpoVar != null) {
            jpoVar.jpo(true);
        }
        this.f19984ju.f19909ef.qk(true);
        jpo jpoVar2 = this.f19984ju;
        jpoVar2.f19906dm.jpo(true, jpoVar2.ree);
        if (this.f19984ju.f19906dm.my()) {
            this.f19984ju.aix.jpo(r0.xyk);
            return;
        }
        jpo jpoVar3 = this.f19984ju;
        jpoVar3.f19909ef.jpo(jpoVar3.huv, true);
        this.f19984ju.f19909ef.wqx(true);
        this.f19984ju.f19909ef.jd(true);
        this.f19984ju.xk.removeMessages(600);
    }

    public boolean prr() {
        opi opiVar = this.jpo;
        if (opiVar != null) {
            return opiVar.yd();
        }
        return false;
    }

    public int qk() {
        return 0;
    }

    public void wqx() {
        if (this.f19982au) {
            this.f19985qk = true;
            wqx(this.f19984ju.huv);
            this.f19986sq.jpo();
            opi();
            if (rv.xyk(this.zz)) {
                this.f19984ju.f19909ef.jj();
            }
        }
    }

    public int xyk() {
        cm.jj jjVar = this.f19983jd;
        if (jjVar != null) {
            return (int) (jjVar.jj() / 1000);
        }
        return 0;
    }

    public boolean yd() {
        return false;
    }

    public void zz() {
        cm.jj jjVar = this.f19983jd;
        if (jjVar != null) {
            jjVar.jd();
        }
    }

    public void jd(boolean z10) {
        if (this.f19982au) {
            jpo jpoVar = this.f19984ju;
            if (jpoVar.f19912ic) {
                this.hna = (FrameLayout) jpoVar.f19930va.findViewById(com.bytedance.sdk.openadsdk.utils.hna.zuz);
                jpo(z10);
                hna();
            }
        }
    }

    public void jpo() {
        if (this.f19982au && !this.f109if) {
            this.f109if = true;
        }
    }

    public com.bytedance.sdk.openadsdk.p001if.jj jd() {
        return new com.bytedance.sdk.openadsdk.p001if.jj() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.zz.3
            @Override // com.bytedance.sdk.openadsdk.p001if.jj
            public void jpo() {
                zz.this.f19984ju.roc.jd(false);
            }
        };
    }

    public void jpo(boolean z10) {
        FrameLayout frameLayout = this.hna;
        if (frameLayout != null) {
            jpo jpoVar = this.f19984ju;
            Context context = jpoVar.f19920pe;
            dt dtVar = this.zz;
            int i10 = jpoVar.sbx;
            com.bytedance.sdk.openadsdk.activity.xyk xykVar = jpoVar.ux;
            com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar2 = new com.bytedance.sdk.openadsdk.nmd.jpo.jpo(context, dtVar, i10, z10, frameLayout, false, xykVar != null ? xykVar.pe() : 0);
            this.f19986sq = jpoVar2;
            jpoVar2.jpo(this.f19984ju.roc);
            this.f19986sq.jpo(true, jd());
        }
    }

    public void wqx(boolean z10) {
        if (this.f19982au && this.f19986sq != null && this.f19985qk) {
            this.f19986sq.jpo(z10);
        }
    }

    public void cm() {
        if (!this.f19982au || this.opi.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar = this.f19986sq;
        if (jpoVar != null) {
            jpoVar.jd();
        }
        if (this.f19983jd == null || !ju()) {
            return;
        }
        this.f19983jd.wqx();
    }

    public void jpo(long j10) {
        cm.jj jjVar = this.f19983jd;
        if (jjVar != null) {
            jjVar.wqx();
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.wqx.my myVar) {
        com.bytedance.sdk.openadsdk.nmd.jpo.jpo jpoVar;
        if (this.f19982au && (jpoVar = this.f19986sq) != null) {
            jpoVar.jpo(myVar);
        }
    }
}
