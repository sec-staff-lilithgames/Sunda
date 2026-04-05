package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au {

    /* renamed from: au, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.jd.wqx f19857au;

    /* renamed from: jd, reason: collision with root package name */
    private final jpo f19859jd;

    /* renamed from: jj, reason: collision with root package name */
    private volatile long f19860jj;
    final dt jpo;
    private com.bytedance.adsdk.ugeno.jd.wqx oya;

    /* renamed from: qk, reason: collision with root package name */
    private volatile long f19862qk;

    /* renamed from: sq, reason: collision with root package name */
    private boolean f19863sq;
    private FrameLayout wqx;
    private volatile long xyk;
    private String zz;

    /* renamed from: cm, reason: collision with root package name */
    private final AtomicBoolean f19858cm = new AtomicBoolean(false);
    private final AtomicBoolean my = new AtomicBoolean(false);

    /* renamed from: yd, reason: collision with root package name */
    private final AtomicBoolean f19864yd = new AtomicBoolean(false);

    /* renamed from: ju, reason: collision with root package name */
    private long f19861ju = 0;

    /* renamed from: if, reason: not valid java name */
    private long f105if = 0;
    private String prr = null;
    private boolean hna = false;

    public au(jpo jpoVar) {
        this.f19859jd = jpoVar;
        this.jpo = jpoVar.f19914jd;
        this.zz = jpoVar.my;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oya() {
        com.bytedance.sdk.openadsdk.core.ju.xyk.jpo jpoVarUu;
        dt dtVar = this.jpo;
        if (dtVar == null || (jpoVarUu = dtVar.uu()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ju.cm.jd jdVar = new com.bytedance.sdk.openadsdk.core.ju.cm.jd(this.f19859jd.vrc, this.jpo, jpoVarUu, this.zz, new com.bytedance.sdk.openadsdk.core.ju.qk.jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.au.3
            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.wqx
            public void jd(String str) {
                au auVar = au.this;
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(auVar.jpo, true, auVar.zz, "success", SystemClock.elapsedRealtime() - au.this.f105if, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.jd
            public void jpo() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.wqx
            public void jpo(String str) {
                au.this.f105if = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.wqx
            public void jpo(int i10, String str, String str2) {
                au.this.my.set(false);
                au auVar = au.this;
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(auVar.jpo, true, auVar.zz, C3191e4.f.f36439e, SystemClock.elapsedRealtime() - au.this.f105if, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.jd
            public void jpo(int i10, String str) {
                au.this.my.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.jd
            public void jpo(com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar) {
                au.this.oya = wqxVar;
                au.this.my.set(true);
            }
        });
        jdVar.jpo(new com.bytedance.sdk.openadsdk.core.ju.qk.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.au.4
            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.jpo
            public void jd() {
                au.this.hna = true;
                au.this.f19859jd.tic.yd().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.jpo
            public String jpo() {
                return "overlay";
            }
        });
        jdVar.jpo();
        jdVar.jpo(this.f19859jd.tic.yd());
    }

    public boolean au() {
        return this.my.get();
    }

    /* renamed from: if, reason: not valid java name */
    public boolean m439if() {
        return this.f19858cm.get();
    }

    public void ju() {
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(SystemClock.elapsedRealtime() - this.xyk, this.jpo, this.zz);
    }

    public void yd() {
        com.bytedance.sdk.openadsdk.cm.wqx.wqx(this.jpo, this.zz);
    }

    public boolean cm() {
        return this.hna;
    }

    public void jj() {
        this.xyk = SystemClock.elapsedRealtime();
    }

    public void my() {
        this.f19860jj = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(this.jpo, this.zz);
    }

    public void qk() {
        yd();
        zz();
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.f19857au;
        if (wqxVar != null) {
            this.wqx.addView(wqxVar.ju(), new FrameLayout.LayoutParams(this.f19857au.duq(), this.f19857au.dm()));
        }
    }

    public void xyk() {
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.oya;
        if (wqxVar != null) {
            this.wqx.addView(wqxVar.ju(), new FrameLayout.LayoutParams(this.oya.duq(), this.oya.dm()));
        }
    }

    public void zz() {
        if (this.xyk <= 0 || this.f19862qk <= 0 || this.f19864yd.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f19862qk - this.xyk, this.jpo, this.zz, this.prr);
    }

    public void wqx() {
        com.bytedance.sdk.openadsdk.core.ju.xyk.jpo jpoVarRv;
        dt dtVar = this.jpo;
        if (dtVar == null || (jpoVarRv = dtVar.rv()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ju.cm.jd jdVar = new com.bytedance.sdk.openadsdk.core.ju.cm.jd(this.f19859jd.vrc, this.jpo, jpoVarRv, this.zz, new com.bytedance.sdk.openadsdk.core.ju.qk.jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.au.1
            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.wqx
            public void jd(String str) {
                au.this.prr = str;
                au auVar = au.this;
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(auVar.jpo, false, auVar.zz, "success", SystemClock.elapsedRealtime() - au.this.f19861ju, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.wqx
            public void jpo(String str) {
                au.this.f19861ju = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.wqx
            public void jpo(int i10, String str, String str2) {
                au.this.prr = str2;
                au.this.f19858cm.set(false);
                au auVar = au.this;
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(auVar.jpo, false, auVar.zz, C3191e4.f.f36439e, SystemClock.elapsedRealtime() - au.this.f19861ju, str2, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.jd
            public void jpo() {
                au.this.my();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.jd
            public void jpo(int i10, String str) {
                au.this.f19858cm.set(false);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                au auVar = au.this;
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(auVar.jpo, auVar.zz, jElapsedRealtime - au.this.f19860jj, i10, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ju.qk.jd
            public void jpo(com.bytedance.adsdk.ugeno.jd.wqx<View> wqxVar) {
                au.this.f19857au = wqxVar;
                au.this.f19858cm.set(true);
                au.this.f19862qk = SystemClock.elapsedRealtime();
                if (au.this.f19859jd.f19909ef.nmd()) {
                    View viewYd = au.this.f19859jd.tic.yd();
                    if (viewYd instanceof com.bytedance.sdk.openadsdk.core.jj.cm) {
                        ((com.bytedance.sdk.openadsdk.core.jj.cm) viewYd).setImageResource(com.bytedance.sdk.component.utils.dt.cm(au.this.f19859jd.f19920pe, "tt_skip_btn"));
                    }
                }
                au.this.oya();
                au.this.zz();
                au auVar = au.this;
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(auVar.jpo, auVar.zz, au.this.f19862qk - au.this.f19860jj);
            }
        });
        if (this.jpo.uu() != null) {
            jdVar.jpo(new com.bytedance.sdk.openadsdk.core.ju.qk.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.au.2
                @Override // com.bytedance.sdk.openadsdk.core.ju.qk.jpo
                public String jpo() {
                    return "normal";
                }

                @Override // com.bytedance.sdk.openadsdk.core.ju.qk.jpo
                public void jd() {
                }
            });
        }
        jdVar.jpo();
        jdVar.jpo(this.f19859jd.tic.yd());
    }

    public void jd() {
        this.wqx = (FrameLayout) this.f19859jd.f19930va.findViewById(com.bytedance.sdk.openadsdk.utils.hna.prr);
    }

    public void jpo() {
        if (this.f19863sq) {
            return;
        }
        this.f19863sq = true;
        jd();
    }

    public void jpo(int i10) {
        va.jpo((View) this.wqx, i10);
    }
}
