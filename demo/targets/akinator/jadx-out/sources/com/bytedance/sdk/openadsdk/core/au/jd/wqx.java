package com.bytedance.sdk.openadsdk.core.au.jd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bykv.vk.openvk.jpo.jpo.jpo.jpo;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.component.utils.se;
import com.bytedance.sdk.component.utils.zz;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.cm.my.jd.prr;
import com.bytedance.sdk.openadsdk.cm.qk;
import com.bytedance.sdk.openadsdk.core.au.jd.jj;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz.hmu;
import com.bytedance.sdk.openadsdk.oya.au;
import com.bytedance.sdk.openadsdk.oya.oya;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends com.bytedance.sdk.openadsdk.core.au.jpo.jpo {
    private final se.jpo cgn;

    /* renamed from: dm, reason: collision with root package name */
    private final boolean f20194dm;

    /* renamed from: dn, reason: collision with root package name */
    private final jpo.InterfaceC0053jpo f20195dn;
    private long duq;
    private int fy;
    private int hks;
    private qk huv;

    /* renamed from: ic, reason: collision with root package name */
    private int f20196ic;
    private final Runnable jkt;
    private long nzb;

    /* renamed from: pe, reason: collision with root package name */
    private WeakReference<wqx.cm> f20197pe;
    private boolean roc;
    private boolean rxq;
    private int sbx;
    private final String tic;

    /* renamed from: va, reason: collision with root package name */
    private final boolean f20198va;
    private final boolean vrc;
    private int wcn;
    private WeakReference<jpo> xk;

    /* renamed from: ya, reason: collision with root package name */
    private jd f20199ya;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jj();

        void jpo(int i10);
    }

    public wqx(Context context, ViewGroup viewGroup, dt dtVar, String str, boolean z10, boolean z11, boolean z12, qk qkVar) {
        super(context, dtVar, viewGroup);
        this.nzb = 0L;
        this.duq = 0L;
        this.roc = true;
        this.f20196ic = 0;
        this.fy = 0;
        this.f20195dn = new jpo.InterfaceC0053jpo() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.1
            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
            public void cm(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
                com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
                com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk.kc();
                if (cmVarKc != null && (cmVarJpo = cmVarKc.jpo()) != null) {
                    cmVarJpo.jd(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).zz);
                }
                com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk, 3);
                if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv != null) {
                    ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv.jpo(0);
                }
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
            public void jd(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, int i10) {
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
            public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
                com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk, 5);
                            com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk, 5);
                            if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv != null) {
                                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv.jpo(9);
                            }
                        } catch (Exception unused) {
                        }
                        wqx.this.vrc();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk.kc();
                if (cmVarKc == null || (cmVarJpo = cmVarKc.jpo()) == null) {
                    return;
                }
                cmVarJpo.cm(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).zz);
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
            public void my(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
                com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
                com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk.kc();
                if (cmVarKc != null && (cmVarJpo = cmVarKc.jpo()) != null) {
                    cmVarJpo.wqx(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).zz);
                }
                if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv != null) {
                    ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv.jpo(1);
                }
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
            public void jd(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).wqx.removeCallbacks(wqx.this.jkt);
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (wqx.this.f20197pe != null && wqx.this.f20197pe.get() != null) {
                            wqx.this.f20197pe.get();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk != null) {
                            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk.jd();
                        }
                    }
                });
                if (wqx.this.f20194dm) {
                    return;
                }
                wqx wqxVar = wqx.this;
                wqxVar.jpo(wqxVar.huv);
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
            public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, long j10) {
                if (!((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20218rq.get()) {
                    wqx.this.pdm();
                }
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20216nq = false;
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).wqx.removeCallbacks(wqx.this.jkt);
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk != null) {
                            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk.jd();
                        }
                        if (!((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).prr || wqx.this.xk == null || wqx.this.xk.get() == null) {
                            return;
                        }
                        ((jpo) wqx.this.xk.get()).jj();
                    }
                });
                wqx.this.nzb();
                com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk, 0);
                if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv != null) {
                    ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv.wqx();
                }
                wqx wqxVar = wqx.this;
                wqxVar.jpo(wqxVar.huv);
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
            public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, final com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo jpoVar2) {
                com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
                if (dt.jj(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk)) {
                    com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.1.5
                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                            com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar3 = new com.bytedance.sdk.openadsdk.sq.jd.jpo();
                            try {
                                jpoVar3.jd("video_player");
                                jpoVar3.cm(tic.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk));
                                jpoVar3.jpo(BuildConfig.VERSION_NAME);
                            } catch (Throwable unused) {
                            }
                            return jpoVar3;
                        }
                    });
                }
                String unused = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).jpo;
                jpoVar2.jpo();
                jpoVar2.jd();
                jpoVar2.wqx();
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        int iJpo = jpoVar2.jpo();
                        int iJd = jpoVar2.jd();
                        if (!wqx.this.hx() || iJd == -1004) {
                            if (wqx.this.cm(iJpo, iJd)) {
                                String unused2 = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).jpo;
                                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk, (WeakReference<Context>) null, false);
                                wqx.this.jd(true);
                                wqx.this.my();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk != null) {
                                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk.jd();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).pdm != null) {
                                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).pdm.jd(wqx.this.duq, com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).zz, ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).kln));
                            }
                            if (wqx.this.f20197pe == null || wqx.this.f20197pe.get() == null || wqx.this.hx()) {
                                return;
                            }
                            ((wqx.cm) wqx.this.f20197pe.get()).jpo(iJpo, iJd);
                        }
                    }
                });
                wqx.this.jpo(jpoVar2);
                com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk.kc();
                if (cmVarKc != null && (cmVarJpo = cmVarKc.jpo()) != null) {
                    cmVarJpo.jpo(com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk, 6);
                com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jd(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk);
                if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv != null) {
                    ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv.jpo(14);
                }
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
            public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, boolean z13) {
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk != null) {
                            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk.jd();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
            public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, int i10, int i11) {
                zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        wqx.this.pe();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
            public void wqx(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
            public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, int i10, int i11, int i12) {
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20216nq = true;
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk != null) {
                            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk.sq();
                            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).wqx.postDelayed(wqx.this.jkt, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk, 2);
                if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv != null) {
                    ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv.jpo(4);
                }
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
            public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, int i10) {
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20216nq = false;
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).wqx.removeCallbacks(wqx.this.jkt);
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.1.10
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk.jd();
                    }
                });
                com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk, 0);
                if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv != null) {
                    ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20219rv.jpo(5);
                }
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
            public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, final long j10, final long j11) {
                if (Math.abs(j10 - ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).zz) < 50) {
                    return;
                }
                if (!((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20218rq.get()) {
                    wqx.this.pdm();
                }
                wqx wqxVar = wqx.this;
                wqxVar.jpo(wqxVar.huv);
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        wqx.this.jpo(j10, j11);
                        wqx.this.jd(j10, j11);
                    }
                });
            }
        };
        this.sbx = 0;
        this.jkt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk != null) {
                    ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).xyk, (WeakReference<Context>) null, false);
                    ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk.jd();
                    wqx.this.jd(true);
                    String unused = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).jpo;
                }
            }
        };
        this.cgn = new se.jpo() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.6
            @Override // com.bytedance.sdk.component.utils.se.jpo
            public void jpo(Context context2, Intent intent, boolean z13, final int i10) {
                duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        wqx.this.jj(i10);
                    }
                });
            }
        };
        this.rxq = false;
        this.hks = opi.wqx(context);
        jpo(z10);
        this.tic = str;
        try {
            this.f20196ic = viewGroup.getWidth();
            this.fy = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        jpo(context);
        this.f20194dm = true;
        this.f20198va = z11;
        this.vrc = z12;
        if (qkVar != null) {
            this.huv = qkVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean cm(int i10, int i11) {
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pe() {
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar;
        int i10;
        int i11;
        try {
            if (xk() != null && (wqxVar = this.f20213jj) != null && this.f20220se != null) {
                int iCm = wqxVar.cm();
                int iMy = this.f20213jj.my();
                final int width = this.f20220se.getWidth();
                final int height = this.f20220se.getHeight();
                if (width > 0 && height > 0 && iMy > 0 && iCm > 0) {
                    if (iCm == iMy) {
                        i11 = width > height ? height : width;
                        i10 = i11;
                    } else if (iCm > iMy) {
                        i11 = (int) ((width * 1.0d) / ((iCm * 1.0f) / iMy));
                        i10 = width;
                    } else {
                        i10 = (int) ((height * 1.0d) / ((iMy * 1.0f) / iCm));
                        i11 = height;
                    }
                    if (i11 <= height && i11 > 0) {
                        height = i11;
                    }
                    if (i10 <= width && i10 > 0) {
                        width = i10;
                    }
                    this.wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (wqx.this.xk() instanceof TextureView) {
                                    ((TextureView) wqx.this.xk()).setLayoutParams(layoutParams);
                                    String unused = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).jpo;
                                } else if (wqx.this.xk() instanceof SurfaceView) {
                                    ((SurfaceView) wqx.this.xk()).setLayoutParams(layoutParams);
                                    String unused2 = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).jpo;
                                }
                            } catch (Throwable unused3) {
                                String unused4 = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).jpo;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            Objects.toString(this.f20215ju);
            Objects.toString(xk());
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    private void roc() {
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar != null) {
            if (!wqxVar.qk()) {
                this.f20213jj.jpo(false, this.zz, this.hna);
            } else if (this.f20206au) {
                nmd();
            } else {
                jd(this.f20210ef);
            }
        }
        if (this.nmd.get()) {
            rv();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vrc() {
        this.sbx++;
        my myVar = this.f20217qk;
        if (myVar == null) {
            return;
        }
        myVar.jd();
        wqx.jpo jpoVar = this.pdm;
        if (jpoVar != null) {
            jpoVar.jpo(this.duq, com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo(this.zz, this.kln));
        }
        this.duq = System.currentTimeMillis() - this.nzb;
        if (this.roc) {
            this.f20217qk.jpo(this.xyk, (WeakReference<Context>) null, true);
        }
        if (!this.f20222tu) {
            this.f20222tu = true;
            long j10 = this.kln;
            jd(j10, j10);
            long j11 = this.kln;
            this.zz = j11;
            this.f20225yd = j11;
            jd(this.huv);
        }
        if (!this.prr && this.f20214jr) {
            my(this.f20217qk, null);
        }
        this.oya = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd xk() {
        my myVar;
        if (this.f20215ju.getResources().getConfiguration().orientation != 1 || (myVar = this.f20217qk) == null) {
            return null;
        }
        return myVar.au();
    }

    public void dm() {
        com.bytedance.sdk.openadsdk.core.p000if.jj jjVar = this.f20219rv;
        if (jjVar != null) {
            jjVar.jpo(13);
        }
    }

    public void duq() {
        if (this.rxq && this.f20209dt) {
            this.rxq = false;
            se.jpo(this.cgn);
        }
    }

    public void hna() {
        if (this.rxq || !this.f20209dt) {
            return;
        }
        Context applicationContext = sq.jpo().getApplicationContext();
        this.rxq = true;
        se.jpo(this.cgn, applicationContext);
    }

    public void jj(boolean z10) {
        this.roc = z10;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void my() {
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar != null) {
            wqxVar.m372if();
            this.f20213jj = null;
        }
        if (this.roc) {
            if ("embeded_ad".equals(this.tic)) {
                this.f20217qk.nmd();
            } else {
                this.f20217qk.jpo(this.xyk, (WeakReference<Context>) null, true);
            }
            this.wqx.removeCallbacksAndMessages(null);
            this.f115if.clear();
            if (this.prr) {
                duq();
            }
        }
    }

    public void qk(boolean z10) {
        my myVar = this.f20217qk;
        if (myVar != null) {
            myVar.jpo();
        }
        my myVar2 = this.f20217qk;
        if (myVar2 != null && z10) {
            myVar2.opi();
        }
        roc();
    }

    public void tic() {
        if (this.f20213jj != null) {
            jd(false);
            sz();
            this.nmd.set(false);
            this.f20222tu = false;
            jpo(this.huv);
            this.f20213jj.zz();
        }
    }

    public int va() {
        return this.wcn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jj(int i10) {
        my(i10);
        if (i10 == 4) {
            this.f20221sq = false;
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void cm() {
        jpo(true, 3);
    }

    private void wqx(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        wqxVar.cm(0);
        this.f20213jj.jpo(wqxVar);
        this.nzb = System.currentTimeMillis();
        this.f20217qk.wqx(8);
        this.f20217qk.wqx(0);
        jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20213jj == null) {
                    return;
                }
                wqx.this.nzb = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20217qk.cm(0);
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).f20213jj.jpo(true, ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).zz, ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) wqx.this).hna);
            }
        });
        if (this.prr) {
            hna();
        }
    }

    public void cm(int i10) {
        this.wcn = i10;
    }

    public void jd(int i10, int i11) {
        jpo(i10, i11);
        my myVar = this.f20217qk;
        if (myVar == null || i10 <= 0 || i11 <= 0) {
            return;
        }
        myVar.wqx(i10, i11);
        this.f20217qk.jpo(i10, i11);
        pe();
    }

    public void jpo(final jj.jpo jpoVar) {
        my myVar;
        if (!this.prr || (myVar = this.f20217qk) == null) {
            return;
        }
        myVar.jpo(new jj.jpo() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.wqx.2
            @Override // com.bytedance.sdk.openadsdk.core.au.jd.jj.jpo
            public void jpo(View view, int i10) {
                jj.jpo jpoVar2 = jpoVar;
                if (jpoVar2 != null) {
                    jpoVar2.jpo(view, i10);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(long j10, long j11) {
        com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
        this.xyk.wqx(j10);
        this.zz = j10;
        this.kln = j11;
        this.f20217qk.jpo(j10, j11);
        this.f20217qk.jpo(com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo(j10, j11));
        try {
            wqx.jpo jpoVar = this.pdm;
            if (jpoVar != null) {
                jpoVar.jpo(j10, j11);
            }
        } catch (Throwable th2) {
            nmd.jpo(this.jpo, "onProgressUpdate error: ", th2);
        }
        com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = this.xyk.kc();
        if (cmVarKc == null || (cmVarJpo = cmVarKc.jpo()) == null) {
            return;
        }
        cmVarJpo.jpo(j10, j11, this.f20219rv);
    }

    public void jpo(PAGNativeAd pAGNativeAd) {
        my myVar;
        if (!this.prr || (myVar = this.f20217qk) == null) {
            return;
        }
        myVar.jpo(pAGNativeAd);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void wqx() {
        my myVar = this.f20217qk;
        if (myVar != null) {
            myVar.jpo();
        }
        my myVar2 = this.f20217qk;
        if (myVar2 != null) {
            myVar2.opi();
        }
        roc();
    }

    private void my(int i10) {
        if (this.hks == i10) {
            return;
        }
        this.hks = i10;
        if (i10 != 4 && i10 != 0) {
            this.opi = false;
        }
        if (!this.opi && !au() && this.f20198va) {
            wqx(2, i10);
        }
        WeakReference<jpo> weakReference = this.xk;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.xk.get().jpo(this.hks);
    }

    public void jpo(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        this.f20196ic = i10;
        this.fy = i11;
    }

    public void jpo(jd jdVar) {
        this.f20199ya = jdVar;
    }

    private void jpo(Context context) {
        ViewGroup auVar;
        wqx wqxVar;
        if (this.prr) {
            auVar = new oya(context);
        } else {
            auVar = new au(context);
        }
        ViewGroup viewGroup = auVar;
        if (this.prr) {
            wqxVar = this;
            wqxVar.f20217qk = new my(context, viewGroup, true, 17, this.xyk, wqxVar, tu());
        } else {
            wqxVar = this;
            wqxVar.f20217qk = new cm(context, viewGroup, true, 17, wqxVar.xyk, wqxVar, false);
        }
        wqxVar.f20217qk.jpo(this);
    }

    private boolean wqx(int i10, int i11) {
        if (i11 == 0) {
            jd();
            this.f20221sq = true;
            my myVar = this.f20217qk;
            if (myVar != null) {
                myVar.jpo(this.xyk, (WeakReference<Context>) null, false);
            }
        }
        if (i11 != 4 && i11 != 0) {
            my myVar2 = this.f20217qk;
            if (myVar2 != null) {
                myVar2.jpo();
            }
            jd();
            this.f20221sq = true;
            this.opi = false;
            my myVar3 = this.f20217qk;
            if (myVar3 != null) {
                return myVar3.jpo(i10, this.xyk.ww(), this.vrc);
            }
        } else if (i11 == 4) {
            this.f20221sq = false;
            my myVar4 = this.f20217qk;
            if (myVar4 != null) {
                myVar4.prr();
            }
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.core.p000if.jj jpo(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.xyk.pez()) {
            return null;
        }
        if (this.f20219rv == null) {
            this.f20219rv = com.bytedance.sdk.openadsdk.core.p000if.jj.jpo();
        }
        this.f20219rv.jpo(view, this.xyk);
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.f20219rv.jpo((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.f20219rv;
    }

    public void wqx(int i10) {
        my(i10);
        if (i10 == 4) {
            this.f20221sq = false;
            wqx();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jpo.jpo
    public void jpo(wqx.cm cmVar) {
        this.f20197pe = new WeakReference<>(cmVar);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void jpo() {
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar != null) {
            wqxVar.zz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jpo.jpo, com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public boolean jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        super.jpo(wqxVar);
        if (this.f20213jj != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(wqxVar.hna())) {
            return false;
        }
        jd(false);
        wqxVar.hna();
        wqxVar.jd(com.bytedance.sdk.openadsdk.rq.jpo.jpo("player_force_raw_url", 0) == 1);
        int i10 = this.wcn + 1;
        this.wcn = i10;
        wqxVar.my = i10;
        jd(wqxVar);
        sz();
        com.bytedance.sdk.openadsdk.core.p000if.jj jjVar = this.f20219rv;
        if (jjVar != null) {
            jjVar.jpo(false, 0.0f);
        }
        if (!hmu.jd(this.tic) || this.zz <= 0) {
            this.zz = wqxVar.yd();
        }
        if (hmu.jd(this.tic) && this.zz == this.kln) {
            this.zz = 0L;
        }
        if (wqxVar.yd() <= 0) {
            this.f20222tu = false;
            this.nmd.set(false);
        } else {
            long jYd = wqxVar.yd();
            this.zz = jYd;
            this.f20225yd = Math.max(this.f20225yd, jYd);
        }
        my myVar = this.f20217qk;
        if (myVar != null) {
            myVar.jpo();
            if (this.sbx == 0) {
                this.f20217qk.qk();
            }
            this.f20217qk.wqx(wqxVar.xyk(), wqxVar.zz());
            this.f20217qk.wqx(this.f20220se);
            this.f20217qk.jpo(wqxVar.xyk(), wqxVar.zz());
        }
        if (this.f20213jj == null) {
            com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar2 = new com.bytedance.sdk.openadsdk.core.au.cm.wqx();
            this.f20213jj = wqxVar2;
            wqxVar2.jpo(this.f20195dn);
        }
        opi();
        this.duq = 0L;
        try {
            wqx(wqxVar);
            return true;
        } catch (Exception e10) {
            jpo(new com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo(-10, 0, e10.getMessage()));
            nmd.wqx(this.jpo, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e10)));
            return false;
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void jpo(boolean z10, int i10) {
        if (!this.f20222tu && this.nmd.get()) {
            if (z10) {
                jpo(i10, false);
                this.f20222tu = false;
            } else {
                uu();
            }
        }
        my();
        com.bytedance.sdk.openadsdk.core.p000if.jj jjVar = this.f20219rv;
        if (jjVar != null) {
            jjVar.cm();
        }
    }

    public final void jpo(int i10, boolean z10) {
        if (z10 || this.sz) {
            if (z10) {
                this.sz = false;
            }
            if (this.f20222tu || !this.nmd.get()) {
                return;
            }
            prr.jpo jpoVar = new prr.jpo();
            jpoVar.jd(jj());
            jpoVar.cm(zz());
            jpoVar.wqx(qk());
            jpoVar.wqx(i10);
            jpoVar.cm(xyk());
            com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(this.f20217qk, jpoVar, this.huv);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, View view) {
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar == null) {
            return;
        }
        if (wqxVar.jj()) {
            jd();
            this.f20217qk.jd(true, false);
            this.f20217qk.jj();
            return;
        }
        if (!this.f20213jj.qk()) {
            my myVar = this.f20217qk;
            if (myVar != null) {
                myVar.wqx(this.f20220se);
            }
            my(this.zz);
            my myVar2 = this.f20217qk;
            if (myVar2 != null) {
                myVar2.jd(false, false);
                return;
            }
            return;
        }
        qk(false);
        my myVar3 = this.f20217qk;
        if (myVar3 != null) {
            myVar3.jd(false, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jpo.jpo
    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, View view, boolean z10) {
        wqx(!this.f20214jr);
        if (this.f20215ju instanceof Activity) {
            my myVar = this.f20217qk;
            if (myVar != null) {
                myVar.jd(this.f20220se);
                this.f20217qk.wqx(false);
            }
            jpo(1);
            WeakReference<wqx.jd> weakReference = this.f20211hx;
            wqx.jd jdVar2 = weakReference != null ? weakReference.get() : null;
            if (jdVar2 != null) {
                jdVar2.jpo(this.f20214jr);
            }
        }
    }

    public void jpo(jpo jpoVar) {
        this.xk = new WeakReference<>(jpoVar);
    }
}
