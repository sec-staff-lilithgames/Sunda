package com.bytedance.sdk.openadsdk.component.reward.jd;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.au;
import com.bytedance.sdk.openadsdk.component.reward.jpo.prr;
import com.bytedance.sdk.openadsdk.component.reward.view.Cif;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.yd;
import com.bytedance.sdk.openadsdk.component.reward.view.zz;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.model.opi;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.ju;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.oya;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jd extends com.bytedance.sdk.openadsdk.component.reward.jd.jpo {

    /* renamed from: au, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.widget.jd f19839au;

    /* renamed from: if, reason: not valid java name */
    protected com.bytedance.sdk.openadsdk.core.wqx.my f104if;

    /* renamed from: ju, reason: collision with root package name */
    protected String f19840ju;
    public LinearLayout oya;
    private com.bytedance.sdk.openadsdk.p001if.jj prr;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(boolean z10);
    }

    public jd(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        super(jpoVar);
    }

    public jpo cm() {
        return null;
    }

    public void dt() {
        this.jpo.duq.wqx();
        this.jpo.duq.my(true);
    }

    public void hmu() {
        this.f104if = this.jpo.f19923rv.wqx();
    }

    public void hna() {
        this.f19846yd.removeMessages(300);
    }

    public final void hx() {
        if (this.jpo.vrc.isFinishing()) {
            return;
        }
        this.jpo.f19909ef.yd();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        String str = jpoVar.f19905cm ? "reward_endcard" : "fullscreen_endcard";
        jpoVar.f19909ef.jpo(this.prr, str, jpoVar.roc);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.jpo;
        if (jpoVar2.f19925sg) {
            jpoVar2.f19924se.jpo(jpoVar2.huv);
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = this.jpo;
        jpoVar3.f19909ef.jpo(str, jpoVar3.roc);
        this.jpo.f19909ef.my();
    }

    /* renamed from: if, reason: not valid java name */
    public void m438if() {
        LinearLayout linearLayout = (LinearLayout) this.jpo.f19930va.findViewById(hna.f21514au);
        this.oya = linearLayout;
        va.jpo((View) linearLayout, 8);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        jpoVar.ota = new au(jpoVar.vrc, jpoVar.f19914jd, "landingpage_endcard");
        this.jpo.ota.wqx().setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.jd.jd.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jd.this.jpo.tic.yd().performClick();
            }
        });
        this.oya.addView(this.jpo.ota.my(), new LinearLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.jpo;
        jpoVar2.f19909ef.jpo(jpoVar2.ota);
    }

    public void jd(boolean z10) {
        yd ydVar = this.jpo.f19911hx;
        if (ydVar != null && !z10) {
            ydVar.jj();
        }
        Cif cif = this.jpo.tic;
        if (cif != null) {
            cif.oya();
        }
        this.jpo.hmu.kln();
        if (!my()) {
            this.jpo.f19934yd.get();
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.hna hnaVar = this.jpo.f19909ef;
        if (hnaVar != null) {
            hnaVar.ju();
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.xyk xykVar = this.jpo.f19924se;
        if (xykVar != null) {
            xykVar.cm(com.bytedance.sdk.openadsdk.component.reward.jpo.xyk.jpo);
        }
        Cif cif2 = this.jpo.tic;
        if (cif2 != null) {
            cif2.mo445if();
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.my myVar = this.jpo.f19906dm;
        if (myVar != null) {
            myVar.wqx();
        }
        oya oyaVar = this.jpo.aix;
        if (oyaVar != null) {
            oyaVar.wqx();
        }
    }

    public abstract boolean jj();

    public abstract void jpo(FrameLayout frameLayout);

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jpo
    public void jpo(com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar, hx hxVar) {
        super.jpo(jdVar, hxVar);
        if (this.jpo.f19914jd.jj()) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
            if (jpoVar.voc) {
                jpoVar.f19909ef.jpo(false);
            }
        }
    }

    public void jr() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        if (jpoVar == null) {
            return;
        }
        jpoVar.f19933ya = false;
        boolean z10 = jpoVar.huv;
        if (!jpoVar.f19917ju.get()) {
            this.jpo.hmu.prr();
        }
        hna();
        this.jpo.f19909ef.hna();
        this.jpo.f19924se.qk();
        this.jpo.f19928tu.set(true);
        if (this.jpo.f19934yd.get()) {
            this.jpo.f19922rq.set(true);
        }
        oya oyaVar = this.jpo.aix;
        if (oyaVar != null) {
            oyaVar.jd();
        }
        this.jpo.jd();
    }

    public void ju() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        jpoVar.pdm.jpo(jpoVar.f19905cm);
        this.jpo.tic.jd();
        this.jpo.f19906dm.jpo();
        if (!this.jpo.f19914jd.ig()) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.jpo;
            if (jpoVar2.f19921qk && TextUtils.isEmpty(dt.jpo(jpoVar2.f19920pe, this.f19843jd))) {
                m438if();
            }
            this.jpo.f19909ef.jpo();
            this.jpo.nzb.jpo();
        }
        this.jpo.f19924se.jj();
        this.jpo.duq.jpo();
        if (rv.jj(this.jpo.f19914jd)) {
            this.jpo.tic.cm();
            va.jpo((View) this.jpo.f19909ef.xyk(), 4);
        }
        if (nmd.cm(this.jpo.f19914jd) || nmd.jd(this.jpo.f19914jd) || nmd.qk(this.jpo.f19914jd)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = this.jpo;
        jpoVar3.tic.jpo(va.jd(jpoVar3.f19920pe, jpoVar3.cgn), va.jd(this.jpo.f19920pe, r2.hks));
        this.jpo.f19919nq.jpo();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar4 = this.jpo;
        if (jpoVar4.wad) {
            jpoVar4.tic.jpo(0);
        }
    }

    public abstract boolean my();

    public void nmd() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        if (jpoVar == null) {
            return;
        }
        Cif cif = jpoVar.tic;
        if (cif != null) {
            cif.hna();
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.jpo;
        boolean z10 = jpoVar2.huv;
        jpoVar2.kln.jpo();
        DeviceUtils.qk();
        this.jpo.f19909ef.prr();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = this.jpo;
        if (jpoVar3.huv) {
            jpoVar3.vrc.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jd.jd.2
                @Override // java.lang.Runnable
                public void run() {
                    if (jd.this.jpo.kln.jpo() > 0) {
                        jd.this.jpo.kln.jpo(false);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void nq() {
        /*
            r4 = this;
            boolean r0 = r4.jj()
            if (r0 != 0) goto L16
            boolean r0 = r4 instanceof com.bytedance.sdk.openadsdk.component.reward.jd.qk
            if (r0 != 0) goto Le
            boolean r0 = r4 instanceof com.bytedance.sdk.openadsdk.component.reward.jd.xyk
            if (r0 == 0) goto L16
        Le:
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r4.jpo
            com.bytedance.sdk.openadsdk.component.reward.jpo.yd r0 = r0.f19923rv
            r0.jd()
            return
        L16:
            com.bytedance.sdk.openadsdk.core.au.cm.jd r0 = r4.zz
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r1 = r4.my
            long r1 = r1.oya()
            r3 = 0
            boolean r0 = r0.jpo(r1, r3)
            if (r0 != 0) goto L4f
            com.bytedance.sdk.component.utils.hx r0 = r4.f19846yd
            r1 = 300(0x12c, float:4.2E-43)
            r0.removeMessages(r1)
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r4.jpo
            boolean r1 = r0.f19927tl
            if (r1 == 0) goto L3e
            com.bytedance.sdk.openadsdk.activity.xyk r0 = r0.ux
            boolean r1 = r0 instanceof com.bytedance.sdk.openadsdk.activity.jpo
            if (r1 == 0) goto L3e
            com.bytedance.sdk.openadsdk.activity.jpo r0 = (com.bytedance.sdk.openadsdk.activity.jpo) r0
            r0.nq()
            goto L4f
        L3e:
            int r0 = com.bytedance.sdk.openadsdk.cm.jd.C0101jd.jpo
            r4.jpo(r0)
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r0 = r4.my
            boolean r1 = r0.nzb()
            r1 = r1 ^ 1
            r2 = 4
            r0.jpo(r1, r2)
        L4f:
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r4.jpo
            if (r0 == 0) goto L6e
            com.bytedance.sdk.openadsdk.core.model.dt r1 = r0.f19914jd
            if (r1 == 0) goto L6e
            com.bytedance.sdk.openadsdk.utils.oya r0 = r0.aix
            if (r0 == 0) goto L6e
            boolean r0 = r1.aul()
            if (r0 == 0) goto L6e
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo r0 = r4.jpo
            com.bytedance.sdk.openadsdk.utils.oya r1 = r0.aix
            com.bytedance.sdk.openadsdk.component.reward.jpo.prr r0 = r0.hmu
            long r2 = r0.se()
            r1.jpo(r2)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.jd.jd.nq():void");
    }

    public void opi() {
        int i10;
        if (this.jpo.f19934yd.get()) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
            if (!jpoVar.f19921qk && jpoVar.f19922rq.getAndSet(false) && ((i10 = this.jpo.xyk) >= 0 || i10 == -1)) {
                Message messageObtain = Message.obtain();
                messageObtain.what = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.jpo;
                messageObtain.arg1 = jpoVar2.xyk;
                jpoVar2.xk.sendMessage(messageObtain);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar3 = this.jpo;
        if (jpoVar3.zz <= 0 || !jpoVar3.f19928tu.getAndSet(false)) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 900;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar4 = this.jpo;
        messageObtain2.arg1 = jpoVar4.zz;
        jpoVar4.xk.sendMessage(messageObtain2);
    }

    public void oya() {
        com.bytedance.sdk.openadsdk.core.widget.jd jdVar = this.f19839au;
        if (jdVar == null || !jdVar.isShowing()) {
            return;
        }
        this.f19839au.dismiss();
    }

    public boolean pdm() {
        return true;
    }

    public void prr() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        if (!jpoVar.f19921qk && jpoVar.cm()) {
            this.jpo.duq.my();
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.jpo;
            if (jpoVar2.f19927tl && (jpoVar2.ux instanceof com.bytedance.sdk.openadsdk.activity.jpo)) {
                return;
            }
            jpoVar2.tic.jj(0);
        }
    }

    public abstract void qk();

    public void rq() {
        jd(false);
    }

    public void se() {
        wqx();
        if (!this.jpo.f19914jd.ig() && pdm()) {
            hx();
        }
        if (pdm()) {
            this.jpo.f19906dm.jd();
        }
        if (nmd.cm(this.jpo.f19914jd) || nmd.qk(this.jpo.f19914jd)) {
            this.f19846yd.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        jpoVar.tic.jpo(jpoVar.jkt == 100.0f);
        hmu();
        qk();
    }

    public void sq() {
        if (this.jpo.ux != null || ((!rv.jd(this.f19843jd) && !rv.wqx(this.f19843jd)) || (rv.xyk(this.f19843jd) && this.jpo.f19909ef.rv() && !this.jpo.f19909ef.kln()))) {
            opi();
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        if (jpoVar == null) {
            return;
        }
        oya oyaVar = jpoVar.aix;
        if (oyaVar != null) {
            oyaVar.jpo();
        }
        this.jpo.jpo();
    }

    public void tu() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.xyk xykVar;
        com.bytedance.sdk.openadsdk.component.reward.jpo.Cif cif;
        if (!this.jpo.f19924se.yd() && sq.cm().nmd(String.valueOf(this.jpo.f19915jj)) == 1) {
            com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
            int iOw = jpoVar.f19905cm ? rv.wqx(jpoVar.f19914jd) ? this.jpo.f19914jd.ow() : this.jpo.f19914jd.hf() : rv.wqx(jpoVar.f19914jd) ? this.jpo.f19914jd.ow() : this.jpo.f19914jd.rc();
            Cif cif2 = this.jpo.tic;
            if (cif2 != null && cif2.zz()) {
                Cif cif3 = this.jpo.tic;
                if (cif3 != null) {
                    cif3.yd().performClick();
                    return;
                }
                return;
            }
            if ((!this.jpo.f19934yd.get() || rv.wqx(this.jpo.f19914jd)) && iOw != -1) {
                prr prrVar = this.jpo.hmu;
                if (((prrVar == null || prrVar.au() < iOw * 1000) && ((xykVar = this.jpo.f19924se) == null || !xykVar.jpo(iOw))) || (cif = this.jpo.duq) == null) {
                    return;
                }
                cif.cm();
            }
        }
    }

    public RFEndCardBackUpLayout xyk() {
        return new RFEndCardBackUpLayout(this.jpo.f19920pe);
    }

    public View yd() {
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar;
        if (this.f19843jd.wu() != 5) {
            qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(this.jpo.vrc);
            qkVar.setId(hna.pve);
        } else {
            qkVar = null;
        }
        Objects.toString(qkVar);
        return qkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View zz() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.jd.jd.zz():android.view.View");
    }

    public void jpo(zz zzVar) {
        jpo(zzVar, this.jpo);
    }

    public void jpo(boolean z10, boolean z11, boolean z12, int i10) {
        this.jpo.f19906dm.jpo(z10, z11, z12, this, i10);
    }

    public void jpo(int i10) {
        this.my.jr();
        jpo(false, true, false, i10);
        if (this.jpo.f19905cm) {
            this.zz.jd(10000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.jd.jd.jpo(android.os.Message):void");
    }

    public void au() {
    }

    private void jpo(long j10, long j11) {
        long j12 = j11 - j10;
        Activity activity = this.jpo.vrc;
        if (activity instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) activity).wqx(j12, j11);
        }
    }

    public static void jpo(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        final com.bytedance.sdk.openadsdk.core.jj.cm cmVar;
        Context context = frameLayout.getContext();
        if (jpoVar.voc) {
            com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
            wqxVar.setId(hna.f21562yd);
            frameLayout.addView(wqxVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayoutJpo = jpo(context);
            String strJpo = "";
            if (dt.my(jpoVar.f19914jd)) {
                com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarWw = jpoVar.f19914jd.ww();
                if (jdVarWw != null) {
                    strJpo = jdVarWw.yd();
                }
            } else {
                List<opi> listFri = jpoVar.f19914jd.fri();
                if (listFri != null && !listFri.isEmpty()) {
                    strJpo = listFri.get(0).jpo();
                }
            }
            if (TextUtils.isEmpty(strJpo)) {
                cmVar = null;
            } else {
                cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
                int i10 = hna.pez;
                cmVar.setId(i10);
                cmVar.setTag(i10, strJpo);
                cmVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                frameLayoutJpo.addView(cmVar);
            }
            wqxVar.addView(frameLayoutJpo);
            wqxVar.addView(new ju(context), new FrameLayout.LayoutParams(-1, -1));
            View myVar = new com.bytedance.sdk.openadsdk.component.reward.view.my(context);
            myVar.setId(hna.f164if);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(myVar, layoutParams);
            myVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.jd.jd.3
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View viewFindViewById = jpoVar.f19930va.findViewById(520093757);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View viewFindViewById2 = jpoVar.f19930va.findViewById(hna.afh);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View viewFindViewById3 = jpoVar.f19930va.findViewById(hna.cmw);
                    if (viewFindViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = viewFindViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.jj.cm cmVar2 = cmVar;
                    if (cmVar2 != null) {
                        ViewGroup.LayoutParams layoutParams5 = cmVar2.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            cmVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
            myVar2.setId(hna.f21514au);
            myVar2.setOrientation(1);
            myVar2.setVisibility(8);
            frameLayout.addView(myVar2, new FrameLayout.LayoutParams(-1, -1));
        }
        if (jpoVar.f19912ic) {
            View jjVar = new com.bytedance.sdk.component.zz.jj(context, true);
            jjVar.setId(hna.oya);
            jjVar.setLayerType(2, null);
            jjVar.setVisibility(4);
            if (!jpoVar.cz && nmd.jj(jpoVar.f19914jd)) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = va.jd(jpoVar.f19920pe, 58.0f);
                frameLayout.addView(jjVar, layoutParams2);
            } else {
                frameLayout.addView(jjVar, new FrameLayout.LayoutParams(-1, -1));
            }
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(hna.prr);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (rv.jd(jpoVar.f19914jd)) {
                View wqxVar2 = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
                wqxVar2.setId(hna.zuz);
                wqxVar2.setVisibility(4);
                frameLayout.addView(wqxVar2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public static FrameLayout jpo(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        wqxVar.setId(hna.f21533ju);
        wqxVar.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        wqxVar.setLayoutParams(layoutParams);
        return wqxVar;
    }
}
