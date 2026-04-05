package com.bytedance.sdk.openadsdk.core.au.cm;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bytedance.sdk.component.utils.zz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.cm.qk;
import com.bytedance.sdk.openadsdk.core.au.cm.wqx;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.p000if.cm;
import com.bytedance.sdk.openadsdk.core.p000if.jj;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.hmu.jd.my;
import com.bytedance.sdk.openadsdk.oya.oya;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import com.bytedance.sdk.openadsdk.utils.vrc;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends com.bytedance.sdk.openadsdk.core.au.jpo.jpo {

    /* renamed from: dm, reason: collision with root package name */
    final wqx.jd f20124dm;
    protected boolean duq;
    private InterfaceC0111jpo fy;

    /* renamed from: ic, reason: collision with root package name */
    private final Runnable f20125ic;
    protected long nzb;

    /* renamed from: pe, reason: collision with root package name */
    private final int f20126pe;
    private boolean roc;
    private final qk tic;

    /* renamed from: va, reason: collision with root package name */
    private long f20127va;
    private long vrc;
    private final AtomicBoolean xk;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.au.cm.jpo$1, reason: invalid class name */
    public class AnonymousClass1 implements wqx.jd {

        /* renamed from: jd, reason: collision with root package name */
        private boolean f20128jd = true;

        public AnonymousClass1() {
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void cm(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
            cm cmVarJpo;
            com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk.kc();
            if (cmVarKc != null && (cmVarJpo = cmVarKc.jpo()) != null) {
                cmVarJpo.jd(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).zz);
            }
            my.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk, 3);
            if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv != null) {
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv.jpo(0);
            }
            if (jpo.this.fy != null) {
                jpo.this.fy.jpo(2);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jd(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, int i10) {
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
            cm cmVarJpo;
            if (jpo.this.xk.compareAndSet(false, true)) {
                String unused = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).jpo;
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv != null) {
                            try {
                                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv.jpo(9);
                            } catch (Exception unused2) {
                            }
                        }
                        jpo.this.ic();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk.kc();
                if (cmVarKc != null && (cmVarJpo = cmVarKc.jpo()) != null) {
                    long jJj = jpo.this.jj();
                    cmVarJpo.cm(jJj);
                    cmVarJpo.my(jJj);
                }
                my.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk, 5);
                com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk, 5);
                if (jpo.this.fy != null) {
                    jpo.this.fy.jpo(3);
                }
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void my(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
            my.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk, 0);
            if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv != null) {
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv.jpo(1);
            }
            if (jpo.this.fy != null) {
                jpo.this.fy.jpo(1);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void wqx(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).jpo;
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jd(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).jpo;
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.removeCallbacks(jpo.this.f20125ic);
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.1.4
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk != null) {
                        ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk.jd();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, long j10) {
            String unused = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).jpo;
            if (!((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).nmd.get()) {
                jpo.this.pdm();
            }
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20216nq = false;
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.removeCallbacks(jpo.this.f20125ic);
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.1.3
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk != null) {
                        ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk.jd();
                    }
                }
            });
            if (!((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).nmd.get()) {
                jpo jpoVar2 = jpo.this;
                jpoVar2.nzb = j10;
                jpoVar2.jpo(jpoVar2.tic);
                jpo.this.nzb();
            }
            if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv != null) {
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv.wqx();
            }
            my.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk, 0);
            if (jpo.this.fy != null) {
                jpo.this.fy.jpo(1);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo jpoVar2) {
            cm cmVarJpo;
            String unused = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).jpo;
            jpoVar2.jpo();
            jpoVar2.jd();
            jpoVar2.wqx();
            if (dt.jj(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk)) {
                com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.1.5
                    @Override // com.bytedance.sdk.openadsdk.sq.cm
                    public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                        com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar3 = new com.bytedance.sdk.openadsdk.sq.jd.jpo();
                        try {
                            jpoVar3.jd("video_player");
                            jpoVar3.cm(tic.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk));
                            jpoVar3.jpo(BuildConfig.VERSION_NAME);
                        } catch (Throwable unused2) {
                        }
                        return jpoVar3;
                    }
                });
            }
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.removeCallbacks(jpo.this.f20125ic);
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.1.6
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk != null) {
                        ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk.jd();
                    }
                    if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).pdm != null) {
                        ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).pdm.jd(jpo.this.vrc, com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).zz, ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).kln));
                    }
                }
            });
            jpo.this.jpo(jpoVar2);
            my.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk, 6);
            com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jd(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk);
            if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv != null) {
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv.jpo(14);
            }
            if (jpo.this.fy != null) {
                jpo.this.fy.jpo(4);
            }
            com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk.kc();
            if (cmVarKc == null || (cmVarJpo = cmVarKc.jpo()) == null) {
                return;
            }
            cmVarJpo.jpo(com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.GENERAL_LINEAR_AD_ERROR);
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, boolean z10) {
            String unused = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).jpo;
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.removeCallbacks(jpo.this.f20125ic);
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.1.7
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk != null) {
                        ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk.jd();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, int i10, int i11) {
            String unused = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).jpo;
            zz.jpo().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.1.8
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20213jj == null) {
                        return;
                    }
                    try {
                        final float fCm = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20213jj.cm();
                        final float fMy = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20213jj.my();
                        if (fCm == 0.0f || fMy == 0.0f) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.1.8.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (!jpo.this.fy()) {
                                    jpo.this.jpo(fCm, fMy);
                                    return;
                                }
                                if (nmd.jd(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk) || ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).hmu.f20205jj == 4) {
                                    jpo.this.jpo(true, fCm, fMy);
                                    return;
                                }
                                if (nmd.wqx(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk)) {
                                    jpo.this.jpo(true, fCm, fMy);
                                    return;
                                }
                                if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk.kb() == 3) {
                                    jpo.this.jpo(true, fCm, fMy);
                                } else if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk.kb() == 0) {
                                    jpo.this.wqx(fCm, fMy);
                                } else {
                                    jpo.this.jd(fCm, fMy);
                                }
                            }
                        });
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.nmd.wqx(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).jpo, th2.getMessage());
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, int i10, int i11, int i12) {
            String unused = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).jpo;
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20216nq = true;
            jpo.this.xk();
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.1.9
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk != null) {
                        ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk.sq();
                    }
                }
            });
            my.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk, 3);
            if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv != null) {
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv.jpo(4);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, int i10) {
            String unused = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).jpo;
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20216nq = false;
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.removeCallbacks(jpo.this.f20125ic);
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.1.10
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk != null) {
                        ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk.jd();
                    }
                }
            });
            my.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk, 0);
            if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv != null) {
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv.jpo(5);
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo.InterfaceC0053jpo
        public void jpo(final com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar, long j10, long j11) {
            long j12;
            long j13;
            cm cmVarJpo;
            if (Math.abs(j10 - ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).zz) < 50) {
                return;
            }
            if (!((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).nmd.get()) {
                jpo.this.pdm();
            }
            jpo jpoVar2 = jpo.this;
            jpoVar2.jpo(jpoVar2.tic);
            jpo.this.jpo(j10, j11);
            jpo.this.jd(j10, j11);
            com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk.kc();
            if (cmVarKc == null || (cmVarJpo = cmVarKc.jpo()) == null) {
                j12 = j10;
                j13 = j11;
            } else {
                j12 = j10;
                j13 = j11;
                cmVarJpo.jpo(j12, j13, ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20219rv);
            }
            if (!this.f20128jd || j13 - j12 >= 500) {
                return;
            }
            this.f20128jd = false;
            ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).wqx.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.1.2
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1.this.jpo(jpoVar);
                }
            }, 1000L);
        }

        @Override // com.bytedance.sdk.openadsdk.core.au.cm.wqx.jd
        public void jpo(int i10, int i11) {
            jpo.this.roc();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.au.cm.jpo$jpo, reason: collision with other inner class name */
    public interface InterfaceC0111jpo {
        void jpo(int i10);
    }

    public jpo(Context context, ViewGroup viewGroup, dt dtVar, qk qkVar) {
        super(context, dtVar, viewGroup);
        this.f20127va = 0L;
        this.vrc = 0L;
        this.roc = false;
        this.nzb = 0L;
        this.duq = false;
        this.xk = new AtomicBoolean(false);
        this.f20124dm = new AnonymousClass1();
        this.f20125ic = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).pdm != null) {
                    jpo.this.hna();
                    ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).pdm.jpo();
                }
            }
        };
        this.tic = qkVar;
        this.f20126pe = dtVar.jl();
        if (dtVar.pez() && this.f20220se != null) {
            if (this.f20219rv == null) {
                this.f20219rv = jj.jpo();
            }
            this.f20219rv.jpo(this.f20220se, dtVar);
        }
        com.bytedance.sdk.openadsdk.core.au.jd.my myVar = new com.bytedance.sdk.openadsdk.core.au.jd.my(context.getApplicationContext(), new oya(context), true, 17, this.xyk, this);
        this.f20217qk = myVar;
        myVar.jpo(this);
    }

    public void hna() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jpo.jpo
    public boolean nq() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fy() {
        return this.xyk.sy() == 100.0f;
    }

    private boolean huv() {
        return tic() == null || this.f20213jj == null || (!com.bytedance.sdk.openadsdk.core.ju.cm.jpo(this.xyk.tl()) ? this.xyk.vzb() != null : this.xyk.jrx() != null) || this.xyk.wu() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ic() {
        if (this.f20217qk == null) {
            return;
        }
        this.wqx.removeCallbacks(this.f20125ic);
        this.f20217qk.jd();
        this.vrc = System.currentTimeMillis() - this.f20127va;
        if (!this.roc) {
            this.roc = true;
            long j10 = this.kln;
            jd(j10, j10);
            long j11 = this.kln;
            this.zz = j11;
            this.f20225yd = j11;
            jd(this.tic);
        }
        wqx.jpo jpoVar = this.pdm;
        if (jpoVar != null) {
            jpoVar.jpo(this.vrc, com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo(this.zz, this.kln));
        }
        this.oya = true;
    }

    private void pe() {
        this.f20213jj.wqx(kln());
        this.f20213jj.jpo(this.hmu);
        this.f20127va = System.currentTimeMillis();
        this.f20217qk.wqx(8);
        this.f20217qk.wqx(0);
        jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20213jj == null) {
                    return;
                }
                jpo.this.f20127va = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk.cm(0);
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20213jj.jpo(true, ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).zz, ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).hna);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void roc() {
        jd(this.tic);
        this.hmu.my = this.f20213jj.nmd();
        if (dt.jj(this.xyk)) {
            com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.2
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar = new com.bytedance.sdk.openadsdk.sq.jd.jpo();
                    try {
                        jpoVar.jd("video_player");
                        jpoVar.cm(tic.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).xyk));
                        jpoVar.jpo(BuildConfig.VERSION_NAME);
                    } catch (Throwable unused) {
                    }
                    return jpoVar;
                }
            });
        }
        sz();
        this.nmd.set(false);
        this.xk.set(false);
        jpo(this.tic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xk() {
        int i10 = this.hmu.f20205jj;
        int iDuq = (i10 == 2 || i10 == 1) ? sq.cm().duq() * 1000 : i10 == 4 ? sq.cm().xyk(String.valueOf(this.f20126pe)) : 5000;
        this.wqx.removeCallbacks(this.f20125ic);
        this.wqx.postDelayed(this.f20125ic, iDuq);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void cm() {
        wqx wqxVar = this.f20213jj;
        if (wqxVar == null) {
            return;
        }
        wqxVar.m372if();
        this.f20213jj = null;
        com.bytedance.sdk.openadsdk.core.au.jd.my myVar = this.f20217qk;
        if (myVar != null) {
            myVar.zz();
        }
        this.wqx.removeCallbacks(this.f20125ic);
        this.wqx.removeCallbacksAndMessages(null);
        jj jjVar = this.f20219rv;
        if (jjVar != null) {
            jjVar.cm();
        }
    }

    public void dm() {
        cm cmVarJpo;
        if (this.roc || !this.nmd.get()) {
            return;
        }
        rv();
        com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = this.xyk.kc();
        if (cmVarKc == null || (cmVarJpo = cmVarKc.jpo()) == null) {
            return;
        }
        cmVarJpo.wqx(jj());
    }

    public void duq() {
        this.f20124dm.jpo((com.bykv.vk.openvk.jpo.jpo.jpo.jpo) null, 0, 0);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void my() {
        cm();
    }

    public com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd tic() {
        com.bytedance.sdk.openadsdk.core.au.jd.my myVar = this.f20217qk;
        if (myVar != null) {
            return myVar.au();
        }
        return null;
    }

    public void va() {
        jj jjVar = this.f20219rv;
        if (jjVar != null) {
            jjVar.jpo(2);
        }
    }

    public void vrc() {
        jj jjVar = this.f20219rv;
        if (jjVar != null) {
            jjVar.jpo(13);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void wqx() {
        cm cmVarJpo;
        com.bytedance.sdk.openadsdk.core.au.jd.my myVar = this.f20217qk;
        if (myVar != null) {
            myVar.jpo();
            this.f20217qk.prr();
            this.f20217qk.opi();
        }
        wqx wqxVar = this.f20213jj;
        if (wqxVar != null) {
            if (wqxVar.qk()) {
                if (this.f20206au) {
                    if (com.bytedance.sdk.openadsdk.core.zz.tu()) {
                        this.f20213jj.jd(3);
                        wqx wqxVar2 = this.f20213jj;
                        wqxVar2.jpo(false, wqxVar2.sq(), this.hna);
                    } else {
                        nmd();
                    }
                } else {
                    jd(this.f20210ef);
                }
            } else {
                this.f20213jj.jpo(false, this.zz, this.hna);
            }
        }
        if (this.roc || !this.nmd.get()) {
            return;
        }
        rv();
        com.bytedance.sdk.openadsdk.core.model.cm cmVarKc = this.xyk.kc();
        if (cmVarKc == null || (cmVarJpo = cmVarKc.jpo()) == null) {
            return;
        }
        cmVarJpo.wqx(jj());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jd(float r12, float r13) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.au.cm.jpo.jd(float, float):void");
    }

    public void jpo(boolean z10, float f10, float f11) {
        try {
            Objects.toString(this.xyk.gmx());
            if (!huv() || z10) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) f11);
                layoutParams.addRule(13);
                if (tic() != null) {
                    if (tic() instanceof TextureView) {
                        ((TextureView) tic()).setLayoutParams(layoutParams);
                    } else if (tic() instanceof SurfaceView) {
                        ((SurfaceView) tic()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.f20220se.getLayoutParams();
                    if (this.f20220se.getHeight() > 0) {
                        float fMin = Math.min(this.f20220se.getWidth() / f10, this.f20220se.getHeight() / f11);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (f10 * fMin);
                            layoutParams.height = (int) (f11 * fMin);
                            if (tic() instanceof TextureView) {
                                ((TextureView) tic()).setLayoutParams(layoutParams);
                            } else if (tic() instanceof SurfaceView) {
                                ((SurfaceView) tic()).setLayoutParams(layoutParams);
                            }
                            if (this.hmu.f20205jj == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.f20220se.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.jpo(this.jpo, "changeSize error", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx(float f10, float f11) {
        try {
            if (tic() != null && this.f20213jj != null) {
                boolean z10 = this.xyk.ll() == 1;
                int[] iArrJd = va.jd(sq.jpo());
                jpo(iArrJd[0], iArrJd[1], f10, f11, z10);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(final long j10, final long j11) {
        this.xyk.wqx(j10);
        this.zz = j10;
        this.kln = j11;
        final int iJpo = com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo(j10, j11);
        this.wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.cm.jpo.5
            @Override // java.lang.Runnable
            public void run() {
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk.jpo(j10, j11);
                ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).f20217qk.jpo(iJpo);
                try {
                    if (((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).pdm != null) {
                        ((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).pdm.jpo(j10, j11);
                    }
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.nmd.jpo(((com.bytedance.sdk.openadsdk.core.au.jpo.jpo) jpo.this).jpo, "onProgressUpdate error: ", th2);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jpo.jpo, com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public boolean jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        int iRc;
        super.jpo(wqxVar);
        if (this.f20213jj != null) {
            return false;
        }
        wqxVar.hna();
        if (TextUtils.isEmpty(wqxVar.hna())) {
            return false;
        }
        wqxVar.jd(com.bytedance.sdk.openadsdk.rq.jpo.jpo("player_force_raw_url", 0) == 1);
        jd(wqxVar);
        wqxVar.cm(1);
        this.duq = !wqxVar.hna().startsWith("http");
        if (this.f20219rv != null) {
            if (this.hmu.f20205jj == 1) {
                iRc = this.xyk.hf();
            } else {
                iRc = this.xyk.rc();
            }
            if (this.f20220se != null) {
                try {
                    int iJp = this.xyk.jp();
                    if (iJp == 7 || iJp == 8) {
                        View viewJpo = vrc.jpo(this.f20220se, (Class<? extends View>) com.bytedance.sdk.openadsdk.component.reward.view.zz.class);
                        if (viewJpo != null) {
                            View viewFindViewById = viewJpo.findViewById(hna.f164if);
                            View viewFindViewById2 = viewJpo.findViewById(hna.f21528ig);
                            View viewFindViewById3 = viewJpo.findViewById(hna.pve);
                            jj jjVar = this.f20219rv;
                            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                            jjVar.jpo(viewFindViewById2, friendlyObstructionPurpose);
                            this.f20219rv.jpo(viewFindViewById, friendlyObstructionPurpose);
                            this.f20219rv.jpo(viewFindViewById3, friendlyObstructionPurpose);
                        }
                        Iterator<View> it = vrc.jpo(this.f20220se, 1).iterator();
                        while (it.hasNext()) {
                            this.f20219rv.jpo(it.next(), FriendlyObstructionPurpose.OTHER);
                        }
                    } else if (iJp == 3) {
                        Iterator<View> it2 = vrc.jpo(this.f20220se, 2).iterator();
                        while (it2.hasNext()) {
                            this.f20219rv.jpo(it2.next(), FriendlyObstructionPurpose.OTHER);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            this.f20219rv.jpo(iRc > 0, iRc / 1000.0f);
        }
        sz();
        if (wqxVar.yd() > 0) {
            long jYd = wqxVar.yd();
            this.zz = jYd;
            this.f20225yd = Math.max(this.f20225yd, jYd);
        }
        if (this.zz == this.kln) {
            this.zz = 0L;
        }
        com.bytedance.sdk.openadsdk.core.au.jd.my myVar = this.f20217qk;
        if (myVar != null) {
            myVar.jpo();
            this.f20217qk.qk();
            this.f20217qk.wqx(wqxVar.xyk(), wqxVar.zz());
            this.f20217qk.wqx(this.f20220se);
        }
        wqx wqxVar2 = new wqx();
        this.f20213jj = wqxVar2;
        wqxVar2.jpo(this.f20124dm);
        opi();
        this.vrc = 0L;
        pe();
        return true;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void jpo(boolean z10, int i10) {
        cm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(float f10, float f11) {
        ViewGroup viewGroup;
        try {
            if (tic() != null && this.f20213jj != null && (viewGroup = this.f20220se) != null) {
                float width = viewGroup.getWidth();
                float f12 = f10 / (width * 1.0f);
                float height = this.f20220se.getHeight();
                if (f12 <= f11 / (1.0f * height)) {
                    width = (height / f11) * f10;
                } else {
                    height = (width / f10) * f11;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) width, (int) height);
                layoutParams.addRule(13);
                if (tic() instanceof TextureView) {
                    ((TextureView) tic()).setLayoutParams(layoutParams);
                } else if (tic() instanceof SurfaceView) {
                    ((SurfaceView) tic()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.jpo(this.jpo, "changeVideoSizeSupportInteraction error", th2);
        }
    }

    private void jpo(float f10, float f11, float f12, float f13, boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        if (f12 <= 0.0f || f13 <= 0.0f) {
            try {
                f12 = this.xyk.ww().wqx();
                f13 = this.xyk.ww().jd();
            } catch (Throwable unused) {
                return;
            }
        }
        if (f13 > 0.0f && f12 > 0.0f) {
            if (z10) {
                if (f12 < f13) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) ((f13 * f10) / f12));
            } else if (f12 > f13) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f12 * f11) / f13), (int) f11);
            }
            layoutParams.addRule(13);
            if (tic() != null) {
                if (tic() instanceof TextureView) {
                    ((TextureView) tic()).setLayoutParams(layoutParams);
                } else if (tic() instanceof SurfaceView) {
                    ((SurfaceView) tic()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.f20220se.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.cm.jd.jpo(sq.jpo()) || this.f20220se.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.f20220se.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, View view) {
        wqx wqxVar = this.f20213jj;
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
            com.bytedance.sdk.openadsdk.core.au.jd.my myVar = this.f20217qk;
            if (myVar != null) {
                myVar.wqx(this.f20220se);
            }
            my(this.zz);
            com.bytedance.sdk.openadsdk.core.au.jd.my myVar2 = this.f20217qk;
            if (myVar2 != null) {
                myVar2.jd(false, false);
                return;
            }
            return;
        }
        wqx();
        com.bytedance.sdk.openadsdk.core.au.jd.my myVar3 = this.f20217qk;
        if (myVar3 != null) {
            myVar3.jd(false, false);
        }
    }

    public void jpo(InterfaceC0111jpo interfaceC0111jpo) {
        this.fy = interfaceC0111jpo;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void jpo() {
        if (this.f20213jj != null) {
            roc();
            this.f20213jj.zz();
        }
    }
}
