package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.au.jd.jj;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jr extends nmd implements wqx.cm, wqx.InterfaceC0052wqx {

    /* renamed from: cm, reason: collision with root package name */
    boolean f21078cm;

    /* renamed from: ef, reason: collision with root package name */
    private boolean f21079ef;

    /* renamed from: jd, reason: collision with root package name */
    int f21080jd;

    /* renamed from: jj, reason: collision with root package name */
    boolean f21081jj;
    private hna jpo;
    private com.bytedance.sdk.openadsdk.jpo.jd.wqx kln;
    int my;
    private com.bytedance.sdk.openadsdk.core.au.jd.jj nzb;

    /* renamed from: qk, reason: collision with root package name */
    boolean f21082qk;

    /* renamed from: rv, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.multipro.jd.jpo f21083rv;
    private long sz;

    /* renamed from: uu, reason: collision with root package name */
    private long f21084uu;
    boolean wqx;
    int xyk;

    public jr(Context context, com.bytedance.sdk.openadsdk.core.model.dt dtVar, AdSlot adSlot, String str, boolean z10) {
        super(context, dtVar, adSlot, str, false, true);
        this.f21080jd = 1;
        this.wqx = false;
        this.f21078cm = true;
        this.f21081jj = true;
        this.f21082qk = true;
        this.xyk = -1;
        this.f21079ef = z10;
        oya();
    }

    private void nq() {
        try {
            this.f21083rv = new com.bytedance.sdk.openadsdk.multipro.jd.jpo();
            hna hnaVar = new hna(this.zz, this.f150if, this.f21121yd, this.f21109nq, this.f21079ef);
            this.jpo = hnaVar;
            hnaVar.setShouldCheckNetChange(false);
            this.jpo.setControllerStatusCallBack(new jj.jd() { // from class: com.bytedance.sdk.openadsdk.core.zz.jr.2
                @Override // com.bytedance.sdk.openadsdk.core.au.jd.jj.jd
                public void jpo(boolean z10, long j10, long j11, long j12, boolean z11) {
                    jr.this.f21083rv.jpo = z10;
                    jr.this.f21083rv.my = j10;
                    jr.this.f21083rv.f21287jj = j11;
                    jr.this.f21083rv.f21288qk = j12;
                    jr.this.f21083rv.f21285cm = z11;
                }
            });
            this.jpo.setVideoAdLoadListener(this);
            this.jpo.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.f21121yd)) {
                this.jpo.setIsAutoPlay(this.wqx ? this.f21108ju.isAutoPlay() : this.f21078cm);
            } else if ("open_ad".equals(this.f21121yd)) {
                this.jpo.setIsAutoPlay(true);
            } else {
                this.jpo.setIsAutoPlay(this.f21078cm);
            }
            if ("open_ad".equals(this.f21121yd)) {
                this.jpo.jpo(true, "initVideo");
            } else {
                boolean zJd = com.bytedance.sdk.openadsdk.core.sq.cm().jd(String.valueOf(this.my));
                this.f21117tu = zJd;
                this.jpo.jpo(zJd, "initVideo");
            }
            this.jpo.cm();
        } catch (Exception unused) {
            this.jpo = null;
        }
    }

    private void setShowAdInteractionView(boolean z10) {
        hna hnaVar = this.jpo;
        if (hnaVar != null) {
            hnaVar.setShowAdInteractionView(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx(com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
        if (jpo(oyaVar, false)) {
            this.f21095au.removeAllViews();
            if (this.jpo != null) {
                int i10 = this.xyk;
                if ((i10 == 7 || i10 == 10) && (oyaVar instanceof com.bytedance.sdk.openadsdk.core.ju.jj.jd)) {
                    FrameLayout frameLayoutPrr = ((com.bytedance.sdk.openadsdk.core.ju.jj.jd) oyaVar).prr();
                    if (frameLayoutPrr != null) {
                        frameLayoutPrr.removeAllViews();
                        if (this.xyk == 10) {
                            this.jpo.setClickable(false);
                        }
                        frameLayoutPrr.addView(this.jpo, new FrameLayout.LayoutParams(-1, -1));
                    }
                } else if (oyaVar.jpo() == null) {
                    this.f21095au.addView(this.jpo);
                } else if (this.f21082qk) {
                    oyaVar.jpo().setTag(com.bytedance.sdk.component.adexpress.dynamic.jpo.f18269jj, 1);
                    ((FrameLayout) oyaVar.jpo()).removeAllViews();
                    ((FrameLayout) oyaVar.jpo()).addView(this.jpo, new FrameLayout.LayoutParams(-1, -1));
                    this.f21082qk = false;
                }
                this.jpo.jpo(0L, true, false);
                cm(this.my);
                if (!com.bytedance.sdk.component.utils.opi.cm(this.zz) && !this.f21078cm && this.f21081jj) {
                    this.jpo.my();
                }
                if (TextUtils.equals("embeded_ad", this.f21121yd)) {
                    return;
                }
                setShowAdInteractionView(false);
            }
        }
    }

    public boolean au() {
        return this.f21079ef;
    }

    public void cm(int i10) {
        int iJd = com.bytedance.sdk.openadsdk.core.sq.cm().jd(i10);
        if (3 == iJd) {
            this.wqx = false;
            this.f21078cm = false;
        } else if (4 == iJd) {
            this.wqx = true;
        } else {
            int iWqx = com.bytedance.sdk.component.utils.opi.wqx(com.bytedance.sdk.openadsdk.core.sq.jpo());
            if (1 == iJd) {
                this.wqx = false;
                this.f21078cm = tic.cm(iWqx);
            } else if (2 == iJd) {
                if (tic.my(iWqx) || tic.cm(iWqx) || tic.jj(iWqx)) {
                    this.wqx = false;
                    this.f21078cm = true;
                }
            } else if (5 == iJd && (tic.cm(iWqx) || tic.jj(iWqx))) {
                this.wqx = false;
                this.f21078cm = true;
            }
        }
        if (this.f21078cm) {
            return;
        }
        this.f21080jd = 3;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void e_() {
        this.f21081jj = false;
        this.f21080jd = 2;
        com.bytedance.sdk.openadsdk.jpo.jd.wqx wqxVar = this.kln;
        if (wqxVar != null) {
            wqxVar.jpo(null);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void f_() {
        this.f21081jj = false;
        this.oya = true;
        this.f21080jd = 3;
        com.bytedance.sdk.openadsdk.jpo.jd.wqx wqxVar = this.kln;
        if (wqxVar != null) {
            wqxVar.jd(null);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void g_() {
        this.f21081jj = false;
        this.oya = false;
        this.f21080jd = 2;
    }

    public hna getExpressVideoView() {
        return this.jpo;
    }

    public com.bytedance.sdk.openadsdk.jpo.jd.wqx getVideoAdListener() {
        return this.kln;
    }

    public com.bytedance.sdk.openadsdk.core.au.jd.wqx getVideoController() {
        hna hnaVar = this.jpo;
        if (hnaVar != null) {
            return hnaVar.getNativeVideoController();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.multipro.jd.jpo getVideoModel() {
        return this.f21083rv;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void h_() {
        this.f21081jj = false;
        this.f21080jd = 5;
        com.bytedance.sdk.component.adexpress.jd.jd jdVar = this.f21102hx;
        if (jdVar != null && jdVar.jd() != null) {
            this.f21102hx.jd().onvideoComplate();
        }
        com.bytedance.sdk.openadsdk.jpo.jd.wqx wqxVar = this.kln;
        if (wqxVar != null) {
            wqxVar.wqx(null);
        }
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if (cmVar instanceof com.bytedance.sdk.openadsdk.core.ju.jj.cm) {
            ((com.bytedance.sdk.openadsdk.core.ju.jj.cm) cmVar).onvideoComplate();
        }
    }

    public void hna() {
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar = this.nzb;
        if (jjVar != null) {
            jjVar.prr();
            return;
        }
        hna hnaVar = this.jpo;
        if (hnaVar != null) {
            hnaVar.prr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jd() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public int my() {
        hna hnaVar;
        if (this.f21080jd == 3 && (hnaVar = this.jpo) != null) {
            hnaVar.cm();
        }
        hna hnaVar2 = this.jpo;
        if (hnaVar2 != null && hnaVar2.getNativeVideoController().oya()) {
            this.f21080jd = 1;
        }
        qk(this.f21080jd);
        return this.f21080jd;
    }

    public void oya() {
        this.f21095au = new FrameLayout(this.zz);
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f150if;
        int iJl = dtVar != null ? dtVar.jl() : 0;
        this.my = iJl;
        cm(iJl);
        nq();
        addView(this.f21095au, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.p001if.qk() { // from class: com.bytedance.sdk.openadsdk.core.zz.jr.1
            @Override // com.bytedance.sdk.openadsdk.p001if.qk
            public void jpo(final com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
                duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.jr.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        jr.this.jpo(oyaVar, true);
                    }
                });
            }
        });
    }

    public void prr() {
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar = this.nzb;
        if (jjVar != null) {
            jjVar.au();
            return;
        }
        hna hnaVar = this.jpo;
        if (hnaVar != null) {
            hnaVar.au();
        }
    }

    public void setBackupVideoView(com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar) {
        this.nzb = jjVar;
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.jpo.jd.wqx wqxVar) {
        this.kln = wqxVar;
    }

    public void sq() {
        com.bytedance.sdk.openadsdk.core.au.jd.wqx videoController = getVideoController();
        if (videoController != null) {
            videoController.jpo(3, true);
        }
    }

    private void jd(long j10, long j11) throws JSONException {
        int iAbs = (int) Math.abs(this.opi - j10);
        int i10 = this.opi;
        if (i10 < 0 || iAbs > 500 || i10 > j11 || iAbs >= 500 || this.nmd.contains(this.f21107jr)) {
            return;
        }
        if (this.opi > j10) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.jr.4
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    jr.this.jpo.setCanInterruptVideoPlay(true);
                    jr.this.jpo.performClick();
                    jr jrVar = jr.this;
                    jrVar.jd(jrVar.opi, jrVar.f21107jr);
                }
            }, iAbs);
        } else {
            this.jpo.setCanInterruptVideoPlay(true);
            this.jpo.performClick();
            jd(this.opi, this.f21107jr);
        }
        this.nmd.add(this.f21107jr);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.component.adexpress.jd.prr
    public void jpo(com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar, com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
        this.pdm = cmVar;
        this.xyk = cmVar.wqx();
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar2 = this.pdm;
        if ((cmVar2 instanceof hmu) && ((hmu) cmVar2).hna() != null) {
            ((hmu) this.pdm).hna().jpo((prr) this);
        }
        if (oyaVar != null && oyaVar.jd()) {
            jpo(oyaVar);
        }
        super.jpo(cmVar, oyaVar);
    }

    private void jpo(final com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
        if (oyaVar == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.jr.3
            @Override // java.lang.Runnable
            public void run() {
                jr.this.wqx(oyaVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jpo(com.bytedance.sdk.component.adexpress.jd.oya oyaVar, boolean z10) {
        int i10;
        double dMy = oyaVar.my();
        double dJj = oyaVar.jj();
        double dQk = oyaVar.qk();
        double dXyk = oyaVar.xyk();
        if ((dQk == 0.0d || dXyk == 0.0d) && (i10 = this.xyk) != 7 && i10 != 10 && i10 != 9) {
            return false;
        }
        int iJd = va.jd(this.zz, (float) dMy);
        int iJd2 = va.jd(this.zz, (float) dJj);
        int iJd3 = va.jd(this.zz, (float) dQk);
        int iJd4 = va.jd(this.zz, (float) dXyk);
        float fMin = Math.min(Math.min(va.jd(this.zz, oyaVar.ju()), va.jd(this.zz, oyaVar.m410if())), Math.min(va.jd(this.zz, oyaVar.au()), va.jd(this.zz, oyaVar.oya())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f21095au.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(iJd3, iJd4);
        }
        layoutParams.width = iJd3;
        layoutParams.height = iJd4;
        layoutParams.topMargin = iJd2;
        layoutParams.leftMargin = iJd;
        layoutParams.setMarginStart(iJd);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.f21095au.setLayoutParams(layoutParams);
        va.jd(this.f21095au, fMin);
        hna hnaVar = this.jpo;
        if (hnaVar == null || !z10) {
            return true;
        }
        hnaVar.jpo(iJd3, iJd4);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public long cm() {
        return this.f21084uu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jj() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public long wqx() {
        return this.f21084uu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(boolean z10, String str) {
        hna hnaVar;
        if (this.f150if.zc() || (hnaVar = this.jpo) == null) {
            return;
        }
        hnaVar.jpo(z10, str);
        setSoundMute(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(int i10) {
        hna hnaVar = this.jpo;
        if (hnaVar == null) {
            return;
        }
        if (i10 == 1) {
            hnaVar.jpo(0L, true, false);
            return;
        }
        if (i10 == 2 || i10 == 3) {
            hnaVar.setCanInterruptVideoPlay(true);
            this.jpo.performClick();
        } else if (i10 == 4) {
            hnaVar.getNativeVideoController().my();
        } else {
            if (i10 != 5) {
                return;
            }
            hnaVar.jpo(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.component.adexpress.jd.xyk
    public void jpo(View view, int i10, com.bytedance.sdk.component.adexpress.wqx wqxVar) {
        if (i10 == -1 || wqxVar == null) {
            return;
        }
        if (i10 == 11) {
            try {
                hna hnaVar = this.jpo;
                if (hnaVar != null) {
                    hnaVar.setCanInterruptVideoPlay(true);
                    this.jpo.performClick();
                    if (this.oya) {
                        this.jpo.findViewById(com.bytedance.sdk.openadsdk.utils.hna.fgt).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.jpo(view, i10, wqxVar);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.InterfaceC0052wqx
    public void jpo(long j10, long j11) throws JSONException {
        this.f21081jj = false;
        int i10 = this.f21080jd;
        if (i10 != 5 && i10 != 3 && j10 > this.f21084uu) {
            this.f21080jd = 2;
        }
        this.f21084uu = j10;
        this.sz = j11;
        com.bytedance.sdk.component.adexpress.jd.jd jdVar = this.f21102hx;
        if (jdVar != null && jdVar.jd() != null) {
            this.f21102hx.jd().setTimeUpdate(((int) (j11 - j10)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if (cmVar instanceof com.bytedance.sdk.openadsdk.core.ju.jj.cm) {
            ((com.bytedance.sdk.openadsdk.core.ju.jj.cm) cmVar).setTimeUpdate(((int) (j11 - j10)) / 1000);
            ((com.bytedance.sdk.openadsdk.core.ju.jj.cm) this.pdm).jpo(j10, j11);
        }
        jd(j10, j11);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.cm
    public void jpo(int i10, int i11) {
        this.f21084uu = this.sz;
        this.f21080jd = 4;
        com.bytedance.sdk.openadsdk.jpo.jd.wqx wqxVar = this.kln;
        if (wqxVar != null) {
            wqxVar.jpo(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.nmd, com.bytedance.sdk.openadsdk.core.zz.prr
    public void jpo(int i10, String str) {
        this.opi = i10;
        this.f21107jr = str;
    }
}
