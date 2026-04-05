package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.jd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.oya.ju;
import com.bytedance.sdk.openadsdk.utils.oya;
import com.bytedance.sdk.openadsdk.utils.va;
import com.bytedance.sdk.openadsdk.utils.zz;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends wqx {

    /* renamed from: au, reason: collision with root package name */
    private jd.AbstractC0099jd f19424au;
    private xyk hna;

    /* renamed from: if, reason: not valid java name */
    private com.bytedance.sdk.openadsdk.core.jj.xyk f95if;

    /* renamed from: jj, reason: collision with root package name */
    public oya f19425jj;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.wqx f19426ju;
    private boolean opi;
    private int oya;
    private my prr;

    /* renamed from: qk, reason: collision with root package name */
    private final List<xyk> f19427qk;

    /* renamed from: sq, reason: collision with root package name */
    private int f19428sq;
    private com.bytedance.sdk.openadsdk.component.reward.top.wqx xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.wqx f19429yd;
    private ju zz;

    public zz(Activity activity, dt dtVar, jd jdVar) {
        super(activity, dtVar, jdVar);
        this.f19427qk = new ArrayList();
        this.opi = false;
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(activity);
        this.f19429yd = wqxVar;
        if (Build.VERSION.SDK_INT >= 35) {
            wqxVar.setFitsSystemWindows(true);
        }
        activity.setContentView(this.f19429yd);
    }

    private void cm(xyk xykVar) {
        ju juVar = this.zz;
        if (juVar != null) {
            va.qk(juVar);
            this.zz = null;
        }
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar = this.xyk;
        if (wqxVar != null) {
            va.qk(wqxVar);
            va.qk(this.xyk.getITopLayout());
            this.xyk = null;
        }
        jd.AbstractC0099jd abstractC0099jd = this.f19424au;
        if (abstractC0099jd != null) {
            abstractC0099jd.wqx();
        }
        if (xykVar instanceof qk) {
            ((qk) xykVar).dn();
        }
        oya oyaVar = this.f19425jj;
        if (oyaVar != null) {
            oyaVar.wqx();
        }
    }

    private void dt() {
        this.f19425jj = com.bytedance.sdk.openadsdk.utils.zz.jpo(this.jpo, new zz.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.zz.1
            @Override // com.bytedance.sdk.openadsdk.utils.zz.jpo
            public void jd() {
                if (zz.this.xyk != null) {
                    zz.this.xyk.setSkipInvisiable();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.zz.jpo
            public View jpo() {
                if (zz.this.xyk != null) {
                    return zz.this.xyk.getCloseButton();
                }
                return null;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x011e A[PHI: r11
      0x011e: PHI (r11v3 int) = (r11v2 int), (r11v4 int), (r11v2 int), (r11v2 int) binds: [B:28:0x00b7, B:42:0x0108, B:32:0x00c7, B:33:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int jd(int r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.zz.jd(int, boolean):int");
    }

    private void tu() {
        boolean zAu = au.jrx().au(String.valueOf(this.f19409jd.jl()));
        int iJd = this.f19408cm.wqx() ? jd(0, zAu) : 0;
        if (this.f19427qk.isEmpty() && !rv.wqx(this.f19409jd)) {
            int i10 = iJd + 1;
            this.f19427qk.add(jpo(this.f19408cm, this.f19409jd, iJd, i10, true));
            iJd = i10;
        }
        jpo(iJd, zAu);
    }

    private void wqx(xyk xykVar) {
        try {
            this.f95if.setText(this.jpo.getString(com.bytedance.sdk.component.utils.dt.jd(sq.jpo(), "tt_multiple_ad_indicator"), Integer.valueOf(xykVar.f19414ju + 1), Integer.valueOf(this.oya)));
            this.f95if.setVisibility(0);
        } catch (Throwable th2) {
            nmd.jpo("SeqSwitchLayoutManager", "updateCurrentAdIndex: ", th2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public com.bytedance.sdk.openadsdk.component.reward.top.wqx au() {
        return this.xyk;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public List<dt> hna() {
        return this.f19409jd.dsh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    /* renamed from: if */
    public xyk mo432if() {
        return this.hna;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jr() {
        jd.AbstractC0099jd abstractC0099jd = this.f19424au;
        if (abstractC0099jd != null) {
            abstractC0099jd.xyk();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public int ju() {
        return this.f19428sq;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public boolean my() {
        if (this.f19427qk.isEmpty()) {
            return false;
        }
        xyk xykVar = (xyk) o2.g(1, this.f19427qk);
        return (xykVar instanceof my) && ((my) xykVar).jpo;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void nmd() {
        jd.AbstractC0099jd abstractC0099jd = this.f19424au;
        if (abstractC0099jd != null) {
            abstractC0099jd.zz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public xyk oya() {
        xyk xykVar = this.hna;
        if (xykVar == null) {
            return null;
        }
        int i10 = xykVar.f19417yd;
        while (true) {
            i10++;
            if (i10 >= this.f19427qk.size()) {
                return null;
            }
            xyk xykVar2 = this.f19427qk.get(i10);
            if (xykVar2 instanceof jpo) {
                return xykVar2;
            }
            if ((xykVar2 instanceof my) && rv.wqx(xykVar2.f19412jj) && xykVar2.hna) {
                return xykVar2;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public my prr() {
        my myVar = this.prr;
        if (myVar != null) {
            return myVar;
        }
        xyk xykVar = this.hna;
        int i10 = xykVar != null ? xykVar.f19417yd : -1;
        int size = this.f19427qk.size() - 1;
        while (true) {
            if (size <= i10) {
                break;
            }
            xyk xykVar2 = this.f19427qk.get(size);
            if (xykVar2 instanceof my) {
                my myVar2 = (my) xykVar2;
                if (myVar2.jpo) {
                    this.prr = myVar2;
                    break;
                }
            }
            size--;
        }
        return this.prr;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void qk() {
        super.qk();
        xyk xykVar = this.hna;
        if (xykVar != null) {
            xykVar.au();
        }
    }

    public int rq() {
        xyk xykVar = this.hna;
        if (xykVar != null) {
            return xykVar.f19417yd;
        }
        return -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void xyk() {
        super.xyk();
        xyk xykVar = this.hna;
        if (xykVar != null) {
            xykVar.cm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void yd() {
        super.yd();
        xyk xykVar = this.hna;
        if (xykVar != null) {
            xykVar.rq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public int zz() {
        jd.AbstractC0099jd abstractC0099jd = this.f19424au;
        if (abstractC0099jd != null) {
            return abstractC0099jd.jpo();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo() {
        super.jpo();
        tu();
    }

    private static xyk jpo(jd jdVar, dt dtVar, int i10, int i11, boolean z10) {
        boolean zJw = dtVar.jw();
        AdSlot adSlotGmx = dtVar.gmx();
        if (adSlotGmx != null) {
            zJw = adSlotGmx.getDurationSlotType() == 7;
        }
        if (zJw) {
            return new qk(jdVar, dtVar, i10, i11, z10);
        }
        return new jj(jdVar, dtVar, i10, i11, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void wqx() {
        super.wqx();
        xyk xykVar = this.hna;
        if (xykVar != null) {
            xykVar.oya();
        }
        jd.AbstractC0099jd abstractC0099jd = this.f19424au;
        if (abstractC0099jd != null) {
            abstractC0099jd.jpo(-1);
        }
        oya oyaVar = this.f19425jj;
        if (oyaVar != null) {
            oyaVar.jd();
        }
    }

    private void jpo(int i10, boolean z10) {
        if (prr() == null && this.f19408cm.wqx()) {
            dt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(Bundle bundle) {
        super.jpo(bundle);
        this.f19426ju = new com.bytedance.sdk.openadsdk.core.jj.wqx(this.jpo);
        this.f19429yd.addView(this.f19426ju, new FrameLayout.LayoutParams(-1, -1));
        this.zz = new ju(this.jpo);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, va.jd(this.jpo, 2.0f));
        layoutParams.gravity = 80;
        this.f19429yd.addView(this.zz, layoutParams);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(this.jpo);
        this.f95if = xykVar;
        xykVar.setTextColor(-1);
        this.f95if.setTextSize(15.0f);
        this.f95if.setShadowLayer(1.0f, 0.0f, 1.0f, -16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = va.jd(this.jpo, 60.0f);
        layoutParams2.rightMargin = va.jd(this.jpo, 16.0f);
        layoutParams2.gravity = 8388661;
        this.f19429yd.addView(this.f95if, layoutParams2);
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar = new com.bytedance.sdk.openadsdk.component.reward.top.wqx(this.jpo);
        this.xyk = wqxVar;
        this.f19429yd.addView(wqxVar, new FrameLayout.LayoutParams(-1, -2));
        this.xyk.jpo(this.f19409jd);
        this.xyk.setShowDislike(true);
        jpo(null, null, new jd.my(1, null));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void cm() {
        super.cm();
        xyk xykVar = this.hna;
        if (xykVar != null) {
            xykVar.huv();
        }
        int iRq = rq();
        for (xyk xykVar2 : this.f19427qk) {
            if (xykVar2.f19417yd >= iRq) {
                xykVar2.nmd();
            }
        }
        jd.AbstractC0099jd abstractC0099jd = this.f19424au;
        if (abstractC0099jd != null) {
            abstractC0099jd.wqx();
        }
        oya oyaVar = this.f19425jj;
        if (oyaVar != null) {
            oyaVar.wqx();
        }
        xyk xykVar3 = this.hna;
        if (xykVar3 != null && !xykVar3.dt() && !this.f19409jd.rf()) {
            com.bytedance.sdk.openadsdk.core.oya.jd().post(new jd.wqx(this.f19409jd));
        }
        this.hna = null;
    }

    private void jd(xyk xykVar, xyk xykVar2, jd.my myVar) {
        dt dtVar;
        if (this.f19424au == null) {
            if (xykVar2 instanceof jj) {
                this.f19424au = new jd.jpo(this.f19408cm, this.f19409jd, this.xyk);
            } else {
                this.f19424au = new jd.cm(this.f19408cm, this.f19409jd, this.xyk);
            }
        }
        this.f19424au.jd();
        int iJd = jd(xykVar2);
        boolean z10 = xykVar2 instanceof my;
        if (z10 && !((my) xykVar2).jpo && !xykVar2.hna && (dtVar = xykVar2.f19412jj) != null && dtVar.kp()) {
            this.f19424au.cm();
        } else {
            this.f19424au.jpo(iJd, xykVar2.f19412jj);
            boolean z11 = xykVar2 instanceof my;
            if (z11 && ((my) xykVar2).jpo) {
                cm(xykVar);
            } else if (xykVar2.f19412jj.by()) {
                boolean z12 = false;
                boolean z13 = (xykVar2 instanceof jpo) && com.bytedance.sdk.openadsdk.core.model.nmd.my(xykVar2.f19412jj);
                if (z11 && (xykVar2.hna || com.bytedance.sdk.openadsdk.core.model.nmd.jj(xykVar2.f19412jj))) {
                    z12 = true;
                }
                if (z13 || z12) {
                    this.f19424au.jpo(xykVar2);
                }
            } else if (xykVar2.hna) {
                this.f19424au.jpo(xykVar2.f19412jj, xykVar2.f19416sq);
            } else if (z11) {
                this.f19424au.wqx(xykVar2.f19412jj.zx().cm());
            }
        }
        oya oyaVar = this.f19425jj;
        if (oyaVar != null && xykVar == null) {
            oyaVar.jpo(iJd * 1000);
        }
        if (xykVar2 instanceof jpo) {
            this.f19428sq++;
            jpo(0.0f);
            if (com.bytedance.sdk.openadsdk.core.model.nmd.my(xykVar2.f19412jj)) {
                this.f95if.setVisibility(8);
                return;
            } else {
                wqx(xykVar2);
                return;
            }
        }
        if (z10) {
            if (((my) xykVar2).jpo) {
                this.f95if.setVisibility(8);
                return;
            }
            if (xykVar2.hna && rv.wqx(xykVar2.f19412jj)) {
                this.f19428sq++;
            }
            if (!xykVar2.hna && !com.bytedance.sdk.openadsdk.core.model.nmd.jj(xykVar2.f19412jj)) {
                wqx(xykVar2);
            } else {
                this.f95if.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(xyk xykVar, xyk xykVar2, jd.my myVar) {
        xyk xykVar3 = this.hna;
        if ((xykVar3 == null || xykVar3 == xykVar) && !com.bytedance.sdk.component.utils.jd.jpo(this.jpo)) {
            rq();
            if (xykVar2 == null) {
                xyk xykVar4 = this.hna;
                int i10 = xykVar4 != null ? xykVar4.f19417yd + 1 : 0;
                if (i10 < this.f19427qk.size()) {
                    xykVar2 = this.f19427qk.get(i10);
                }
                if (xykVar2 == null) {
                    this.f19408cm.cm();
                    return;
                }
            }
            xyk xykVar5 = this.hna;
            if (xykVar5 != null) {
                if (xykVar5 == xykVar2) {
                    return;
                }
                xykVar5.oya();
                this.hna.cm();
                com.bytedance.sdk.openadsdk.component.reward.view.zz zzVarJpo = this.hna.jpo();
                if (zzVarJpo != null) {
                    this.f19426ju.removeView(zzVarJpo);
                }
                this.hna.nmd();
                this.hna.f94if = false;
                if (this.f19408cm.jd()) {
                    xyk xykVar6 = this.hna;
                    if (xykVar6 instanceof jpo) {
                        int i11 = xykVar6.f19417yd + 1;
                        xyk xykVar7 = i11 < this.f19427qk.size() ? this.f19427qk.get(i11) : null;
                        if ((xykVar7 instanceof my) && xykVar7 != xykVar2) {
                            com.bytedance.sdk.openadsdk.component.reward.view.zz zzVarJpo2 = xykVar7.jpo();
                            if (zzVarJpo2 != null && zzVarJpo2.getParent() != null && (zzVarJpo2.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) zzVarJpo2.getParent()).removeView(zzVarJpo2);
                            }
                            xykVar7.nmd();
                        }
                    }
                }
            }
            if (com.bytedance.sdk.component.utils.jd.jpo(this.jpo)) {
                return;
            }
            xykVar2.f94if = true;
            xyk xykVar8 = this.hna;
            this.hna = xykVar2;
            jd(xykVar8, xykVar2, myVar);
            xykVar2.jd(this.jpo, myVar);
            com.bytedance.sdk.openadsdk.component.reward.view.zz zzVarJpo3 = xykVar2.jpo();
            if (zzVarJpo3 != null) {
                ViewParent parent = zzVarJpo3.getParent();
                if (parent != null) {
                    if (parent == this.f19426ju) {
                        zzVarJpo3.setVisibility(0);
                    } else if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(zzVarJpo3);
                    }
                }
                if (zzVarJpo3.getParent() == null) {
                    this.f19426ju.addView(zzVarJpo3, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            for (int i12 = xykVar8 != null ? xykVar8.f19417yd : 0; i12 < this.f19427qk.size(); i12++) {
                this.f19427qk.get(i12).jpo(xykVar8, this.hna, myVar);
            }
            this.f19408cm.jd(this.hna);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int jd(com.bytedance.sdk.openadsdk.activity.xyk r8) {
        /*
            r7 = this;
            int r8 = r8.f19417yd
            r0 = 0
        L3:
            java.util.List<com.bytedance.sdk.openadsdk.activity.xyk> r1 = r7.f19427qk
            int r1 = r1.size()
            if (r8 >= r1) goto L9c
            java.util.List<com.bytedance.sdk.openadsdk.activity.xyk> r1 = r7.f19427qk
            java.lang.Object r1 = r1.get(r8)
            com.bytedance.sdk.openadsdk.activity.xyk r1 = (com.bytedance.sdk.openadsdk.activity.xyk) r1
            boolean r2 = r1 instanceof com.bytedance.sdk.openadsdk.activity.my
            if (r2 == 0) goto L1e
            r2 = r1
            com.bytedance.sdk.openadsdk.activity.my r2 = (com.bytedance.sdk.openadsdk.activity.my) r2
            boolean r2 = r2.jpo
            if (r2 != 0) goto L9c
        L1e:
            boolean r2 = r1.hna
            com.bytedance.sdk.openadsdk.core.model.dt r3 = r1.f19412jj
            boolean r3 = com.bytedance.sdk.openadsdk.core.model.nmd.jj(r3)
            com.bytedance.sdk.openadsdk.core.model.dt r4 = r1.f19412jj
            boolean r4 = com.bytedance.sdk.openadsdk.core.model.nmd.my(r4)
            com.bytedance.sdk.openadsdk.core.model.dt r5 = r1.f19412jj
            com.bytedance.sdk.openadsdk.core.model.hmu r5 = r5.jpo()
            if (r5 == 0) goto L39
            int r5 = r5.wqx()
            goto L3b
        L39:
            r5 = 10
        L3b:
            boolean r6 = r1 instanceof com.bytedance.sdk.openadsdk.activity.jpo
            if (r6 == 0) goto L59
            if (r4 == 0) goto L43
        L41:
            int r0 = r0 + r5
            goto L98
        L43:
            com.bytedance.sdk.openadsdk.core.model.dt r1 = r1.f19412jj
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd r1 = r1.ww()
            if (r1 == 0) goto L53
            double r2 = (double) r0
            double r0 = r1.jj()
            double r0 = r0 + r2
            int r0 = (int) r0
            goto L98
        L53:
            long r0 = (long) r0
            r2 = 10
            long r0 = r0 + r2
            int r0 = (int) r0
            goto L98
        L59:
            boolean r4 = r1 instanceof com.bytedance.sdk.openadsdk.activity.my
            if (r4 == 0) goto L98
            if (r3 == 0) goto L60
            goto L41
        L60:
            if (r2 == 0) goto L7b
            com.bytedance.sdk.openadsdk.core.model.dt r2 = r1.f19412jj
            boolean r2 = r2.by()
            if (r2 == 0) goto L6b
            goto L41
        L6b:
            com.bytedance.sdk.openadsdk.core.model.dt r2 = r1.f19412jj
            int r2 = com.bytedance.sdk.openadsdk.core.model.rv.nmd(r2)
            com.bytedance.sdk.openadsdk.core.model.dt r1 = r1.f19412jj
            int r1 = com.bytedance.sdk.openadsdk.core.model.rv.hmu(r1)
            int r1 = r1 + r2
        L78:
            int r1 = r1 + r0
            r0 = r1
            goto L98
        L7b:
            com.bytedance.sdk.openadsdk.activity.jd r2 = r7.f19408cm
            boolean r2 = r2.jd()
            if (r2 == 0) goto L98
            com.bytedance.sdk.openadsdk.core.model.dt r2 = r1.f19412jj
            if (r2 == 0) goto L98
            boolean r2 = r2.kp()
            if (r2 != 0) goto L98
            com.bytedance.sdk.openadsdk.core.model.dt r1 = r1.f19412jj
            com.bytedance.sdk.openadsdk.core.model.se r1 = r1.zx()
            int r1 = r1.cm()
            goto L78
        L98:
            int r8 = r8 + 1
            goto L3
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.zz.jd(com.bytedance.sdk.openadsdk.activity.xyk):int");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(int i10, int i11) {
        super.jpo(i10, i11);
        if (i10 >= 0) {
            if (TextUtils.isEmpty(this.wqx)) {
                this.f95if.setText(this.jpo.getString(com.bytedance.sdk.component.utils.dt.jd(sq.jpo(), "tt_multiple_playable_wait_tips"), Integer.valueOf(i10)));
            } else {
                this.f95if.setText(String.format(this.wqx, Integer.valueOf(i10)));
            }
            this.f95if.setVisibility(0);
            return;
        }
        this.f95if.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jd() {
        super.jd();
        xyk xykVar = this.hna;
        if (xykVar != null) {
            xykVar.wqx();
        }
        jd.AbstractC0099jd abstractC0099jd = this.f19424au;
        if (abstractC0099jd != null) {
            abstractC0099jd.jd(-1);
        }
        oya oyaVar = this.f19425jj;
        if (oyaVar != null) {
            oyaVar.jpo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(float f10) {
        ju juVar = this.zz;
        if (juVar == null) {
            return;
        }
        juVar.setProgress(f10);
        if (f10 == 0.0f && this.zz.getVisibility() == 0) {
            this.zz.setVisibility(4);
        } else {
            if (f10 <= 0.0f || this.zz.getVisibility() == 0) {
                return;
            }
            this.zz.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jd(xyk xykVar, int i10) {
        jd.AbstractC0099jd abstractC0099jd = this.f19424au;
        if (abstractC0099jd == null) {
            return;
        }
        if (i10 == 2) {
            abstractC0099jd.jpo(i10);
            oya oyaVar = this.f19425jj;
            if (oyaVar != null) {
                oyaVar.jd();
                return;
            }
            return;
        }
        if (i10 == 1) {
            abstractC0099jd.jd(i10);
            oya oyaVar2 = this.f19425jj;
            if (oyaVar2 != null) {
                oyaVar2.jpo();
                return;
            }
            return;
        }
        if (i10 == 3 || i10 == 4) {
            try {
                this.hna.se().hmu.uu();
            } catch (Throwable th2) {
                nmd.wqx("SeqSwitchLayoutManager", th2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(int i10) {
        jd.AbstractC0099jd abstractC0099jd = this.f19424au;
        if (abstractC0099jd != null) {
            if (i10 == 2) {
                abstractC0099jd.jpo(2);
            } else if (i10 == 1) {
                abstractC0099jd.jd(1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(xyk xykVar, jd.my myVar) {
        xyk xykVar2 = this.hna;
        if (xykVar2 == null || xykVar2 == xykVar) {
            if (xykVar2 != null && (xykVar2 instanceof jpo)) {
                final long jAu = (xykVar2.se() == null || this.hna.se().hmu == null) ? 0L : this.hna.se().hmu.au();
                final int i10 = this.hna.f19414ju + 1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                xyk xykVar3 = this.hna;
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(jCurrentTimeMillis, xykVar3.f19412jj, xykVar3.b_(), "dislike_skip", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.zz.2
                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject jd() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(IronSourceConstants.EVENTS_DURATION, jAu);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject jpo() {
                        return com.bytedance.sdk.openadsdk.cm.wqx.jpo(i10);
                    }
                });
            }
            xyk xykVarOya = oya();
            if (xykVarOya == null) {
                xykVarOya = prr();
            }
            jpo(this.hna, xykVarOya, myVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(xyk xykVar, boolean z10, boolean z11, boolean z12, int i10) {
        my myVarPrr;
        xyk xykVar2 = this.hna;
        if ((xykVar2 == null || xykVar2 == xykVar) && (myVarPrr = prr()) != null) {
            jd.my myVar = new jd.my(i10, xykVar != null ? xykVar.se() : null);
            myVar.jpo.putBoolean("isSkip", z10);
            myVar.jpo.putBoolean("force", z11);
            myVar.jpo.putBoolean("isFromLandingPage", z12);
            jpo(this.hna, myVarPrr, myVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(jpo jpoVar, boolean z10) {
        jd.AbstractC0099jd abstractC0099jd;
        super.jpo(jpoVar, z10);
        if (jpoVar == null || jpoVar != this.hna || (abstractC0099jd = this.f19424au) == null) {
            return;
        }
        abstractC0099jd.jd(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(xyk xykVar) {
        jd.AbstractC0099jd abstractC0099jd;
        super.jpo(xykVar);
        if (xykVar == null) {
            return;
        }
        nmd.jpo("SeqSwitchLayoutManager", "onPlayableLoadingDismiss [scene=]" + xykVar + ",isActive=" + xykVar.f94if);
        if (xykVar.f94if && (abstractC0099jd = this.f19424au) != null) {
            abstractC0099jd.jj();
        }
        xyk xykVarOya = oya();
        if (xykVarOya instanceof jpo) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVarSe = xykVarOya.se();
            if (jpoVarSe == null || !com.bytedance.sdk.openadsdk.core.model.nmd.my(jpoVarSe.f19914jd)) {
                ((jpo) xykVarOya).tu();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(xyk xykVar, boolean z10) {
        jd.AbstractC0099jd abstractC0099jd;
        super.jpo(xykVar, z10);
        if (xykVar == null) {
            return;
        }
        nmd.jpo("SeqSwitchLayoutManager", "setIsHappenInteraction [scene=]" + xykVar + ",isActive=" + xykVar.f94if + ",isHappenInteraction=" + z10);
        if (!xykVar.f94if || (abstractC0099jd = this.f19424au) == null) {
            return;
        }
        abstractC0099jd.jpo(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(View view) {
        super.jpo(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.f19426ju.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(View view, boolean z10) {
        super.jpo(view, z10);
        if (view.getParent() == null && this.f19426ju != null) {
            view.setVisibility(4);
            int childCount = this.f19426ju.getChildCount();
            if (z10) {
                this.f19426ju.addView(view, 0);
            } else {
                this.f19426ju.addView(view, childCount - 1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public boolean jpo(xyk xykVar, int i10) {
        return i10 == this.f19427qk.size() - 1 && this.f19427qk.get(i10) != null && (this.f19427qk.get(i10) instanceof my);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(boolean z10) {
        super.jpo(z10);
        xyk xykVar = this.hna;
        if (xykVar != null) {
            xykVar.wqx(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.wqx
    public void jpo(Activity activity) {
        super.jpo(activity);
        xyk xykVar = this.hna;
        if (xykVar != null) {
            xykVar.jpo(activity);
        }
    }
}
