package com.bytedance.sdk.openadsdk.core.zz;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.rv;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.zz.my;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.va;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.jd.prr f21141cm;

    /* renamed from: jd, reason: collision with root package name */
    private final Context f21142jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f21143jj;
    com.bytedance.sdk.openadsdk.core.model.dt jpo;
    private nmd my;

    /* renamed from: qk, reason: collision with root package name */
    private int f21144qk;
    private jpo wqx;
    private ScheduledFuture<?> xyk;
    private int zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd implements Runnable {
        InterfaceC0140wqx jpo;

        public jd(InterfaceC0140wqx interfaceC0140wqx) {
            this.jpo = interfaceC0140wqx;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0140wqx interfaceC0140wqx = this.jpo;
            if (interfaceC0140wqx != null) {
                interfaceC0140wqx.jpo(107, 107);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements com.bytedance.sdk.component.adexpress.jd.cm<View>, my.jd {

        /* renamed from: au, reason: collision with root package name */
        private int f21145au;

        /* renamed from: cm, reason: collision with root package name */
        private String f21146cm;

        /* renamed from: if, reason: not valid java name */
        private my f151if;

        /* renamed from: jd, reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.wqx.wqx f21147jd;

        /* renamed from: jj, reason: collision with root package name */
        private final int f21148jj;
        AtomicBoolean jpo = new AtomicBoolean(false);

        /* renamed from: ju, reason: collision with root package name */
        private String f21149ju;
        private final Context my;
        private com.bytedance.sdk.component.adexpress.jd.qk oya;
        private PAGExpressAdWrapperListener prr;

        /* renamed from: qk, reason: collision with root package name */
        private final int f21150qk;
        private TTDislikeDialogAbstract wqx;
        private FrameLayout xyk;

        /* renamed from: yd, reason: collision with root package name */
        private final int f21151yd;
        private com.bytedance.sdk.openadsdk.core.model.dt zz;

        public jpo(Context context, com.bytedance.sdk.openadsdk.core.model.dt dtVar, int i10, int i11, String str, int i12) {
            this.f21149ju = str;
            if (dtVar != null && dtVar.aul()) {
                this.f21149ju = "fullscreen_interstitial_ad";
            }
            this.my = context;
            this.f21148jj = i10;
            this.f21150qk = i11;
            this.zz = dtVar;
            this.f21151yd = va.jd(context, 3.0f);
            this.f21145au = i12;
            jj();
        }

        private void jj() {
            FrameLayout frameLayout = new FrameLayout(this.my);
            this.xyk = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.f21148jj, this.f21150qk);
            }
            layoutParams.width = this.f21148jj;
            layoutParams.height = this.f21150qk;
            layoutParams.gravity = 17;
            this.xyk.setLayoutParams(layoutParams);
            my myVarXyk = xyk();
            this.xyk.addView(myVarXyk);
            View viewQk = qk();
            this.xyk.addView(viewQk);
            com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.zz;
            if (dtVar != null && dtVar.aul()) {
                myVarXyk.setBackgroundColor(-16777216);
                myVarXyk.jpo(((Activity) this.my).findViewById(com.bytedance.sdk.openadsdk.utils.hna.bl), FriendlyObstructionPurpose.OTHER);
            }
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            myVarXyk.jpo(viewQk, friendlyObstructionPurpose);
            Context context = this.my;
            if (context == null || !(context instanceof Activity)) {
                return;
            }
            View viewFindViewById = ((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21528ig);
            if (viewFindViewById != null) {
                myVarXyk.jpo(viewFindViewById, friendlyObstructionPurpose);
            }
            View viewFindViewById2 = ((Activity) this.my).findViewById(com.bytedance.sdk.openadsdk.utils.hna.pve);
            if (viewFindViewById2 != null) {
                myVarXyk.jpo(viewFindViewById2, friendlyObstructionPurpose);
            }
        }

        private View qk() {
            PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.my, this.zz);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.zz;
            if (dtVar == null || !dtVar.aul()) {
                int i10 = this.f21151yd;
                layoutParams.topMargin = i10;
                layoutParams.leftMargin = i10;
            } else {
                layoutParams.leftMargin = va.jd(this.my, 20.0f);
                layoutParams.bottomMargin = va.jd(this.my, 20.0f);
                layoutParams.gravity = 8388691;
            }
            pAGLogoViewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams);
            pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.zz.wqx.jpo.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.jpo(jpo.this.my, jpo.this.zz, jpo.this.f21149ju);
                }
            });
            return pAGLogoViewCreatePAGLogoViewByMaterial;
        }

        private my xyk() {
            my myVarJd = cm.jpo().jd();
            this.f151if = myVarJd;
            if (myVarJd == null) {
                this.f151if = new my(this.my);
            }
            cm.jpo().wqx(this.f151if);
            this.f151if.jpo(this.zz, this, this.f21149ju);
            this.f151if.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.f151if;
        }

        @Override // com.bytedance.sdk.component.adexpress.jd.cm
        public View my() {
            return this.xyk;
        }

        @Override // com.bytedance.sdk.component.adexpress.jd.cm
        public int wqx() {
            return 5;
        }

        public void cm() {
            this.xyk = null;
            this.f21147jd = null;
            this.wqx = null;
            this.oya = null;
            this.zz = null;
            my myVar = this.f151if;
            if (myVar != null) {
                myVar.hna();
                cm.jpo().jpo(this.f151if);
            }
            this.jpo.set(true);
        }

        @Override // com.bytedance.sdk.openadsdk.core.zz.my.jd
        public void jd() {
            if (this.oya != null) {
                com.bytedance.sdk.component.adexpress.jd.oya oyaVar = new com.bytedance.sdk.component.adexpress.jd.oya();
                oyaVar.jpo(true);
                oyaVar.jpo(va.wqx(this.my, this.f21148jj));
                oyaVar.jd(va.wqx(this.my, this.f21150qk));
                this.oya.jpo(this.xyk, oyaVar);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.jd.cm
        public void jpo(com.bytedance.sdk.component.adexpress.jd.qk qkVar) {
            com.bytedance.sdk.openadsdk.core.model.dt dtVar;
            if (this.jpo.get()) {
                return;
            }
            if (this.my == null || (dtVar = this.zz) == null) {
                qkVar.jpo(106, "material null");
                return;
            }
            this.oya = qkVar;
            if (TextUtils.isEmpty(dtVar.nes())) {
                qkVar.jpo(106, "dsp data is null");
            } else {
                this.f151if.nmd();
            }
        }

        public void jpo(rv rvVar) {
            if (rvVar instanceof com.bytedance.sdk.openadsdk.wqx.wqx) {
                this.f21147jd = (com.bytedance.sdk.openadsdk.wqx.wqx) rvVar;
            }
        }

        public void jpo(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.model.dt dtVar;
            if (tTDislikeDialogAbstract != null && (dtVar = this.zz) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(dtVar.fxd(), this.zz.pve());
            }
            this.wqx = tTDislikeDialogAbstract;
        }

        public void jpo(String str) {
            this.f21146cm = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.zz.my.jd
        public View jpo() {
            FrameLayout frameLayout = this.xyk;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.openadsdk.core.zz.my.jd
        public void jpo(View view, int i10) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.prr;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.zz.my.jd
        public void jpo(int i10, int i11) {
            com.bytedance.sdk.component.adexpress.jd.qk qkVar = this.oya;
            if (qkVar != null) {
                qkVar.jpo(i10, "render fail");
            }
        }

        public void jpo(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.prr = pAGExpressAdWrapperListener;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.zz.wqx$wqx, reason: collision with other inner class name */
    public interface InterfaceC0140wqx {
        void jd(String str);

        void jpo();

        void jpo(int i10, int i11);

        void jpo(String str);
    }

    public wqx(Context context, nmd nmdVar, com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str) {
        this.jpo = dtVar;
        this.f21142jd = context;
        this.my = nmdVar;
        jpo(nmdVar);
        this.wqx = new jpo(context, dtVar, this.f21143jj, this.f21144qk, str, this.zz);
    }

    private void jpo(nmd nmdVar) {
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.jpo;
        if (dtVar != null && dtVar.aul()) {
            this.f21143jj = -1;
            this.f21144qk = -1;
            return;
        }
        opi opiVarJpo = com.bytedance.sdk.openadsdk.core.cm.jd.jpo(nmdVar.getExpectExpressWidth(), nmdVar.getExpectExpressHeight());
        this.zz = opiVarJpo.jpo;
        if (nmdVar.getExpectExpressWidth() <= 0 || nmdVar.getExpectExpressHeight() <= 0) {
            int iWqx = va.wqx(this.f21142jd);
            this.f21143jj = iWqx;
            this.f21144qk = Float.valueOf(iWqx / opiVarJpo.f21124jd).intValue();
        } else {
            this.f21143jj = va.jd(this.f21142jd, nmdVar.getExpectExpressWidth());
            this.f21144qk = va.jd(this.f21142jd, nmdVar.getExpectExpressHeight());
        }
        int i10 = this.f21143jj;
        if (i10 <= 0 || i10 <= va.wqx(this.f21142jd)) {
            return;
        }
        this.f21143jj = va.wqx(this.f21142jd);
        this.f21144qk = Float.valueOf(this.f21144qk * (va.wqx(this.f21142jd) / this.f21143jj)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx() {
        try {
            ScheduledFuture<?> scheduledFuture = this.xyk;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.xyk.cancel(false);
            this.xyk = null;
        } catch (Throwable unused) {
        }
    }

    public void jd() {
        jpo jpoVar = this.wqx;
        if (jpoVar != null) {
            jpoVar.cm();
            this.wqx = null;
        }
        wqx();
        this.f21141cm = null;
        this.my = null;
    }

    public void jpo(com.bytedance.sdk.component.adexpress.jd.prr prrVar) {
        this.f21141cm = prrVar;
    }

    public void jpo() {
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.jpo;
        if (dtVar != null && dtVar.aul()) {
            this.xyk = duq.jpo().schedule(new jd(this.wqx.f151if), com.bytedance.sdk.openadsdk.core.sq.cm().dt(), TimeUnit.MILLISECONDS);
        }
        jpo jpoVar = this.wqx;
        if (jpoVar != null) {
            jpoVar.jpo(new com.bytedance.sdk.component.adexpress.jd.qk() { // from class: com.bytedance.sdk.openadsdk.core.zz.wqx.1
                @Override // com.bytedance.sdk.component.adexpress.jd.qk
                public void jpo(View view, com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
                    if (wqx.this.my == null || view == null) {
                        if (wqx.this.f21141cm != null) {
                            wqx.this.f21141cm.a_(106);
                        }
                    } else if (wqx.this.f21141cm != null) {
                        wqx.this.f21141cm.jpo(wqx.this.wqx, oyaVar);
                    }
                    wqx.this.wqx();
                }

                @Override // com.bytedance.sdk.component.adexpress.jd.qk
                public void jpo(int i10, String str) {
                    if (wqx.this.f21141cm != null) {
                        wqx.this.f21141cm.a_(106);
                    }
                    wqx.this.wqx();
                }
            });
            View viewMy = this.wqx.my();
            this.my.removeView(viewMy);
            if (viewMy.getParent() != null) {
                ((ViewGroup) viewMy.getParent()).removeView(viewMy);
            }
            this.my.addView(viewMy, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.jd.prr prrVar = this.f21141cm;
        if (prrVar != null) {
            prrVar.a_(106);
        }
    }

    public void jpo(rv rvVar) {
        jpo jpoVar = this.wqx;
        if (jpoVar != null) {
            jpoVar.jpo(rvVar);
        }
    }

    public void jpo(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        jpo jpoVar = this.wqx;
        if (jpoVar != null) {
            jpoVar.jpo(tTDislikeDialogAbstract);
        }
    }

    public void jpo(String str) {
        jpo jpoVar = this.wqx;
        if (jpoVar != null) {
            jpoVar.jpo(str);
        }
    }

    public void jpo(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        jpo jpoVar = this.wqx;
        if (jpoVar != null) {
            jpoVar.jpo(pAGExpressAdWrapperListener);
        }
    }
}
