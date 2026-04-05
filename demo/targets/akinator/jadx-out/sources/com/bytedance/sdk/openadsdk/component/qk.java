package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.jj;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.sz;
import com.bytedance.sdk.openadsdk.core.nmd;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.rq;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.core.xyk;
import com.bytedance.sdk.openadsdk.utils.dm;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk implements hx.jpo {

    /* renamed from: jd, reason: collision with root package name */
    private final tu<com.bytedance.sdk.openadsdk.cm.jpo> f19803jd;

    /* renamed from: jj, reason: collision with root package name */
    private AdSlot f19804jj;
    private final Context jpo;

    /* renamed from: qk, reason: collision with root package name */
    private PAGAppOpenAdLoadListener f19805qk;
    private final jj wqx;
    private int xyk;

    /* renamed from: cm, reason: collision with root package name */
    private final AtomicBoolean f19802cm = new AtomicBoolean(false);
    private int my = 0;
    private volatile int zz = 0;

    /* renamed from: yd, reason: collision with root package name */
    private final sz f19806yd = new sz();

    public qk(Context context) {
        if (context != null) {
            this.jpo = context.getApplicationContext();
        } else {
            this.jpo = sq.jpo();
        }
        this.f19803jd = sq.wqx();
        this.wqx = jj.jpo(this.jpo);
    }

    private void cm(final AdSlot adSlot) {
        final dm dmVarJd = dm.jd();
        com.bytedance.sdk.openadsdk.core.model.hx hxVar = new com.bytedance.sdk.openadsdk.core.model.hx();
        hxVar.f20668ju = this.f19806yd;
        hxVar.f20665cm = 1;
        hxVar.zz = 2;
        this.f19803jd.jpo(adSlot, hxVar, 3, new tu.jpo() { // from class: com.bytedance.sdk.openadsdk.component.qk.2
            @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(int i10, String str) throws JSONException {
                qk.this.zz = 3;
                qk.this.jpo(new com.bytedance.sdk.openadsdk.component.my.jd(2, 100, i10, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) throws JSONException {
                qk.this.jpo(jpoVar, wqxVar, adSlot, dmVarJd);
            }
        });
    }

    private void jd(AdSlot adSlot) {
        this.zz = 1;
        if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
            wqx(adSlot);
        } else {
            cm(adSlot);
        }
    }

    private void wqx(final AdSlot adSlot) {
        final dm dmVarJd = dm.jd();
        com.bytedance.sdk.openadsdk.core.model.hx hxVar = new com.bytedance.sdk.openadsdk.core.model.hx();
        hxVar.f20668ju = this.f19806yd;
        hxVar.f20665cm = 1;
        hxVar.zz = 2;
        this.f19803jd.jpo(adSlot, hxVar, 3, (nmd) new rq() { // from class: com.bytedance.sdk.openadsdk.component.qk.1
            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(int i10, String str) throws JSONException {
                qk.this.zz = 3;
                qk.this.jpo(new com.bytedance.sdk.openadsdk.component.my.jd(2, 100, i10, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) throws JSONException {
                qk.this.jpo(jpoVar, wqxVar, adSlot, dmVarJd);
            }
        });
    }

    public static qk jpo(Context context) {
        return new qk(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd() {
        final dm dmVarJd = dm.jd();
        com.bytedance.sdk.openadsdk.core.model.hx hxVar = new com.bytedance.sdk.openadsdk.core.model.hx();
        hxVar.f20668ju = this.f19806yd;
        hxVar.f20665cm = 1;
        hxVar.zz = 2;
        this.zz = 1;
        this.f19803jd.jpo(this.f19804jj, hxVar, 3, (nmd) new rq() { // from class: com.bytedance.sdk.openadsdk.component.qk.5
            boolean jpo = false;

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.nmd
            public String jpo() {
                return qk.this.wqx.wqx(qk.this.my);
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.nmd
            public boolean jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) throws Throwable {
                dt dtVarJj;
                if (jpoVar != null && jpoVar.my() && (dtVarJj = jpoVar.jj()) != null) {
                    boolean zMy = dt.my(dtVarJj);
                    if (!dtVarJj.se() && zMy && TextUtils.isEmpty(qk.this.wqx.jpo(dtVarJj))) {
                        this.jpo = false;
                        com.bytedance.sdk.openadsdk.component.cm.jpo.jd(jpoVar.jj());
                    } else {
                        this.jpo = true;
                    }
                    com.bytedance.sdk.openadsdk.core.p000if.wqx.cm.jpo(dtVarJj);
                }
                return this.jpo;
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(int i10, String str) throws JSONException {
                qk.this.zz = 3;
                qk.this.jpo(new com.bytedance.sdk.openadsdk.component.my.jd(2, 100, i10, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
            public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) throws JSONException {
                if (this.jpo) {
                    qk.this.jpo(new com.bytedance.sdk.openadsdk.component.my.jd(1, 101, jpoVar.jj(), (com.bytedance.sdk.openadsdk.core.model.jpo) null));
                } else {
                    qk qkVar = qk.this;
                    qkVar.jpo(jpoVar, wqxVar, qkVar.f19804jj, dmVarJd);
                }
            }
        });
    }

    public void jpo(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.jj jjVar, int i10) {
        if (jjVar == null) {
            return;
        }
        if (i10 <= 0) {
            i10 = 3500;
        }
        this.f19804jj = adSlot;
        this.f19806yd.jpo = !TextUtils.isEmpty(adSlot.getBidAdm());
        if (jjVar instanceof PAGAppOpenAdLoadListener) {
            this.f19805qk = (PAGAppOpenAdLoadListener) jjVar;
        }
        this.my = jpo(this.f19804jj);
        this.xyk = i10;
        this.f19806yd.jpo(dm.jd());
        this.f19806yd.jd(com.bytedance.sdk.openadsdk.component.qk.jpo.jd());
        this.f19806yd.jd(com.bytedance.sdk.openadsdk.component.qk.jpo.wqx());
        if (this.f19806yd.jpo) {
            jd(this.f19804jj);
        } else {
            new hx(oya.jd().getLooper(), this).sendEmptyMessageDelayed(1, i10);
            jpo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx() throws Throwable {
        dt dtVarCm = this.wqx.cm(this.my);
        if (dtVarCm != null) {
            if (dtVarCm.gmx() == null) {
                dtVarCm.jpo(this.f19804jj);
            }
            com.bytedance.sdk.openadsdk.core.p000if.wqx.cm.jpo(dtVarCm);
            boolean zMy = dt.my(dtVarCm);
            if (!dtVarCm.se() && zMy) {
                if (TextUtils.isEmpty(this.wqx.jpo(dtVarCm))) {
                    jpo(false);
                    com.bytedance.sdk.openadsdk.component.cm.jpo.jd(dtVarCm);
                    return;
                } else {
                    jpo(new com.bytedance.sdk.openadsdk.component.my.jd(1, 101, dtVarCm, (com.bytedance.sdk.openadsdk.core.model.jpo) null));
                    return;
                }
            }
            jpo(new com.bytedance.sdk.openadsdk.component.my.jd(1, 101, dtVarCm, (com.bytedance.sdk.openadsdk.core.model.jpo) null));
            return;
        }
        jpo(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar, AdSlot adSlot, dm dmVar) throws JSONException {
        this.zz = 2;
        if (jpoVar != null && jpoVar.cm() != null && jpoVar.cm().size() != 0) {
            final dt dtVar = jpoVar.cm().get(0);
            long jDn = dtVar.dn();
            this.f19806yd.f20791jd = jDn;
            boolean zQk = dt.qk(dtVar);
            if (dtVar.se()) {
                jpo(new com.bytedance.sdk.openadsdk.component.my.jd(1, 100, dtVar, jpoVar));
                return;
            }
            if (!zQk && !dtVar.rf()) {
                if (dt.my(dtVar)) {
                    int iYd = sq.cm().yd();
                    if (iYd != 1 && iYd != 3) {
                        jpo(dtVar, adSlot, !this.f19806yd.jpo, jpoVar);
                        if (this.f19806yd.jpo) {
                            com.bytedance.sdk.openadsdk.prr.wqx.jpo(dtVar, dmVar.cm());
                            if (jDn == 0) {
                                this.f19806yd.jpo(2);
                                jpo(new com.bytedance.sdk.openadsdk.component.my.jd(1, 100, dtVar, jpoVar));
                                return;
                            } else {
                                oya.jd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.qk.3
                                    @Override // java.lang.Runnable
                                    public void run() throws JSONException {
                                        qk.this.f19806yd.jpo(2);
                                        qk.this.jpo(new com.bytedance.sdk.openadsdk.component.my.jd(1, 100, dtVar, jpoVar));
                                    }
                                }, jDn);
                                return;
                            }
                        }
                        return;
                    }
                    sz szVar = this.f19806yd;
                    szVar.f20791jd = -1L;
                    szVar.jpo(3);
                    jpo(new com.bytedance.sdk.openadsdk.component.my.jd(1, 100, dtVar, jpoVar));
                    jpo(dtVar, adSlot, false, jpoVar);
                    return;
                }
                sz szVar2 = this.f19806yd;
                szVar2.f20791jd = -1L;
                szVar2.jpo(3);
                jpo(new com.bytedance.sdk.openadsdk.component.my.jd(1, 100, dtVar, jpoVar));
                jpo(dtVar, false, jpoVar);
                return;
            }
            jpo(new com.bytedance.sdk.openadsdk.component.my.jd(1, 100, dtVar, jpoVar));
            if (dt.my(dtVar)) {
                jpo(dtVar, adSlot, false, jpoVar);
                return;
            } else {
                jpo(dtVar, false, jpoVar);
                return;
            }
        }
        this.zz = 3;
        jpo(new com.bytedance.sdk.openadsdk.component.my.jd(2, 100, Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE, xyk.jpo(Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE)));
        wqxVar.jpo(-3);
        wqxVar.wqx(3);
        com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
    }

    private void jpo() {
        duq.jd(new com.bytedance.sdk.component.xyk.xyk("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.qk.4
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
                    qk.this.jd();
                } else {
                    qk.this.wqx();
                }
            }
        });
    }

    private void jpo(boolean z10) {
        if (z10) {
            this.wqx.jj(this.my);
        }
        jd(this.f19804jj);
    }

    private void jpo(final dt dtVar, AdSlot adSlot, final boolean z10, final com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        this.wqx.jpo(dtVar, adSlot, this.f19806yd, new jj.jd() { // from class: com.bytedance.sdk.openadsdk.component.qk.6
            @Override // com.bytedance.sdk.openadsdk.component.jj.jd
            public void jpo() throws JSONException {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: video load success");
                if (z10) {
                    qk.this.zz = 4;
                    com.bytedance.sdk.openadsdk.component.my.jd jdVar = new com.bytedance.sdk.openadsdk.component.my.jd(1, 100, dtVar, jpoVar);
                    jdVar.jpo(true);
                    qk.this.jpo(jdVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.jj.jd
            public void jpo(int i10, String str) throws JSONException {
                if (z10) {
                    qk.this.zz = 5;
                    qk.this.jpo(new com.bytedance.sdk.openadsdk.component.my.jd(2, 100, 10003, xyk.jpo(10003)));
                }
            }
        });
    }

    private void jpo(final dt dtVar, final boolean z10, final com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        this.wqx.jpo(dtVar, this.f19806yd, new jj.jpo() { // from class: com.bytedance.sdk.openadsdk.component.qk.7
            @Override // com.bytedance.sdk.openadsdk.component.jj.jpo
            public void jpo(com.bytedance.sdk.openadsdk.opi.jpo.jd jdVar) throws JSONException {
                Log.d("TTAppOpenAdLoadManager", "preLoadSuccess: image load success");
                if (z10) {
                    qk.this.zz = 4;
                    com.bytedance.sdk.openadsdk.component.my.jd jdVar2 = new com.bytedance.sdk.openadsdk.component.my.jd(1, 100, dtVar, jpoVar);
                    jdVar2.jpo(true);
                    qk.this.jpo(jdVar2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.jj.jpo
            public void jpo() throws JSONException {
                Log.d("TTAppOpenAdLoadManager", "preLoadFail: image load fail");
                if (z10) {
                    qk.this.zz = 5;
                    qk.this.jpo(new com.bytedance.sdk.openadsdk.component.my.jd(2, 100, 10003, xyk.jpo(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.openadsdk.component.my.jd jdVar) throws JSONException {
        int iJd = jdVar.jd();
        int iWqx = jdVar.wqx();
        com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(this.f19806yd, iWqx, iJd);
        if (this.f19802cm.get()) {
            return;
        }
        if (iJd != 1) {
            if (iJd == 2 || iJd == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.f19805qk;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(jdVar.my(), jdVar.jj());
                }
                this.f19802cm.set(true);
                if (iJd == 3) {
                    com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(this.zz, this.xyk);
                    return;
                }
                return;
            }
            return;
        }
        if (iWqx == 100 && !this.f19806yd.jpo) {
            this.wqx.jpo(new com.bytedance.sdk.openadsdk.component.my.jpo(this.my, jdVar.cm(), jdVar.jpo()));
        }
        if (this.f19805qk != null) {
            this.f19805qk.onAdLoaded(new cm(this.jpo, jdVar.cm(), iWqx == 101, this.f19804jj));
        }
        this.f19802cm.set(true);
        if (iWqx == 101) {
            com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(jdVar.cm(), this.f19806yd.jpo().cm());
        } else if (iWqx == 100) {
            com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(jdVar.cm(), 0, this.f19806yd);
        }
    }

    public int jpo(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) throws JSONException {
        if (message.what != 1 || this.f19802cm.get()) {
            return;
        }
        jpo(new com.bytedance.sdk.openadsdk.component.my.jd(3, 102, Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE, xyk.jpo(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE)));
    }
}
