package com.bytedance.sdk.openadsdk.core.cm;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.cm.qk;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.qk;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.wqx.jd;
import com.bytedance.sdk.openadsdk.core.zz.jr;
import com.bytedance.sdk.openadsdk.core.zz.nmd;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.nq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import com.bytedance.sdk.openadsdk.utils.vrc;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    private dt f20255cm;

    /* renamed from: if, reason: not valid java name */
    private qk f116if;

    /* renamed from: jd, reason: collision with root package name */
    protected AdSlot f20256jd;

    /* renamed from: jj, reason: collision with root package name */
    private final Context f20257jj;
    protected cm jpo;

    /* renamed from: jr, reason: collision with root package name */
    private long f20258jr;

    /* renamed from: ju, reason: collision with root package name */
    private nmd f20259ju;
    private PAGBannerAdWrapperListener my;
    private boolean oya;
    private final boolean xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj f20262yd;
    private boolean zz;
    private String wqx = "banner_ad";

    /* renamed from: qk, reason: collision with root package name */
    private long f20260qk = 0;

    /* renamed from: au, reason: collision with root package name */
    private final AtomicBoolean f20254au = new AtomicBoolean(false);
    private final int prr = 1;
    private final int hna = 0;

    /* renamed from: sq, reason: collision with root package name */
    private int f20261sq = -1;
    private final View.OnAttachStateChangeListener opi = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.cm.jpo.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (jpo.this.f20261sq == 0 || jpo.this.zz) {
                return;
            }
            jpo jpoVar = jpo.this;
            jpoVar.jpo(jpoVar.jpo.getCurView(), jpo.this.f20255cm);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (jpo.this.oya) {
                jpo.this.f20261sq = 0;
            } else {
                jpo.this.jj();
            }
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.cm.jpo$jpo, reason: collision with other inner class name */
    public static class C0114jpo extends com.bytedance.sdk.component.xyk.xyk {

        /* renamed from: jd, reason: collision with root package name */
        dt f20269jd;
        boolean jpo;
        WeakReference<jpo> wqx;

        public C0114jpo(boolean z10, dt dtVar, jpo jpoVar) {
            super("ReportWindowFocusChangedAdShow");
            this.jpo = z10;
            this.f20269jd = dtVar;
            this.wqx = new WeakReference<>(jpoVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<jpo> weakReference = this.wqx;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.wqx.get().jd(this.jpo, this.f20269jd);
        }
    }

    public jpo(Context context, dt dtVar, AdSlot adSlot, qk qkVar, boolean z10) {
        this.oya = false;
        this.f20257jj = context;
        this.f20255cm = dtVar;
        this.f20256jd = adSlot;
        this.f116if = qkVar;
        this.oya = z10;
        jpo(context, dtVar, adSlot);
        this.xyk = false;
        this.zz = false;
    }

    /* renamed from: if, reason: not valid java name */
    private void m456if() {
        this.f20255cm.jpo(SystemClock.elapsedRealtime());
        this.jpo.my();
    }

    private qk.jpo ju() {
        return new qk.jpo() { // from class: com.bytedance.sdk.openadsdk.core.cm.jpo.7
            @Override // com.bytedance.sdk.openadsdk.core.cm.qk.jpo
            public void jpo() {
                int width = jpo.this.f20259ju.getWidth();
                int height = jpo.this.f20259ju.getHeight();
                View viewJpo = jpo(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                jpo.this.f20259ju.tu();
                jpo.this.f20259ju.removeAllViews();
                jpo.this.f20259ju.addView(viewJpo, new ViewGroup.LayoutParams(width, height));
                jpo.this.f20259ju.setClickCreativeListener(null);
                jpo.this.f20259ju.setClickListener(null);
                if (jpo.this.my != null) {
                    jpo.this.my.onAdDismissed();
                }
                jpo.this.zz = true;
            }

            private View jpo(boolean z10) {
                com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(jpo.this.f20257jj);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                wqxVar.setBackgroundColor(-1);
                wqxVar.setLayoutParams(layoutParams);
                View view = new View(jpo.this.f20257jj);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                wqxVar.addView(view, layoutParams2);
                com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar2 = new com.bytedance.sdk.openadsdk.core.jj.wqx(jpo.this.f20257jj);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z10) {
                    wqxVar2.setBackground(com.bytedance.sdk.component.utils.dt.wqx(jpo.this.f20257jj, "tt_ad_closed_background_300_250"));
                } else {
                    wqxVar2.setBackground(com.bytedance.sdk.component.utils.dt.wqx(jpo.this.f20257jj, "tt_ad_closed_background_320_50"));
                }
                wqxVar.addView(wqxVar2, layoutParams3);
                PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(jpo.this.f20257jj, jpo.this.f20255cm);
                pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z10) {
                    int iJd = va.jd(jpo.this.f20257jj, 16.0f);
                    layoutParams4.width = va.jd(jpo.this.f20257jj, 77.0f);
                    layoutParams4.height = va.jd(jpo.this.f20257jj, 14.0f);
                    layoutParams4.leftMargin = iJd;
                    layoutParams4.topMargin = iJd;
                } else {
                    int iJd2 = va.jd(jpo.this.f20257jj, 8.0f);
                    layoutParams4.width = va.jd(jpo.this.f20257jj, 45.0f);
                    layoutParams4.height = va.jd(jpo.this.f20257jj, 8.18f);
                    layoutParams4.leftMargin = iJd2;
                    layoutParams4.topMargin = iJd2;
                }
                wqxVar2.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams4);
                com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(jpo.this.f20257jj);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                xykVar.setAlpha(0.5f);
                xykVar.setLines(1);
                xykVar.setText(com.bytedance.sdk.component.utils.dt.jpo(jpo.this.f20257jj, "tt_ad_is_closed"));
                if (z10) {
                    xykVar.setTextSize(18.0f);
                } else {
                    xykVar.setTextSize(12.0f);
                }
                wqxVar2.addView(xykVar, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cm.jpo.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.jpo(jpo.this.f20257jj, jpo.this.f20255cm, jpo.this.wqx);
                    }
                };
                pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(onClickListener);
                xykVar.setOnClickListener(onClickListener);
                return wqxVar;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yd() {
        m456if();
    }

    public void cm() {
        jd(this.f20255cm);
        this.f20260qk = 0L;
    }

    public void jj() {
        this.f20261sq = 1;
        this.jpo.cm();
    }

    public void my() {
        this.f20260qk = System.currentTimeMillis();
    }

    public void qk() {
        if (this.jpo != null) {
            try {
                jj();
                this.jpo.removeOnAttachStateChangeListener(this.opi);
            } catch (Throwable unused) {
            }
        }
    }

    public com.bytedance.sdk.openadsdk.multipro.jd.jpo wqx() {
        cm cmVar = this.jpo;
        if (cmVar instanceof wqx) {
            return ((wqx) cmVar).getVideoModel();
        }
        return null;
    }

    public void xyk() {
        cm cmVar = this.jpo;
        if (cmVar instanceof wqx) {
            ((wqx) cmVar).jd();
        }
    }

    public void zz() {
        cm cmVar = this.jpo;
        if (cmVar instanceof wqx) {
            ((wqx) cmVar).jpo();
        }
    }

    public boolean jd() {
        return this.jpo instanceof wqx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(boolean z10, dt dtVar) {
        try {
            if (z10) {
                this.f20260qk = System.currentTimeMillis();
            } else {
                if (this.f20260qk <= 0 || this.f20259ju == null) {
                    return;
                }
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.f20260qk);
                this.f20260qk = 0L;
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(strValueOf, dtVar, this.wqx, this.f20259ju.getAdShowTime());
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("PAGBannerAdImpl", e10.getMessage());
        }
    }

    public void jpo(int i10) {
        cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.setCurrentIndex(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(dt dtVar) {
        if (this.f20260qk <= 0 || dtVar == null) {
            return;
        }
        try {
            if (this.f20259ju != null) {
                String strValueOf = String.valueOf(System.currentTimeMillis() - this.f20260qk);
                this.f20260qk = 0L;
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(strValueOf, dtVar, this.wqx, this.f20259ju.getAdShowTime());
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("PAGBannerAdImpl", e10.getMessage());
        }
    }

    public void jpo(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        xyk xykVar = new xyk(pAGBannerAdInteractionCallback);
        this.my = xykVar;
        this.jpo.setExpressInteractionListener(xykVar);
    }

    public void jpo(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        xyk xykVar = new xyk(pAGBannerAdInteractionListener);
        this.my = xykVar;
        this.jpo.setExpressInteractionListener(xykVar);
    }

    public View jpo() {
        com.bytedance.sdk.openadsdk.utils.jd.jpo(this.f20255cm);
        IPMiBroadcastReceiver.jpo(this.f20257jj, this.f20255cm);
        return this.jpo;
    }

    private void jpo(Context context, dt dtVar, AdSlot adSlot) {
        if (dtVar.ww() != null) {
            wqx wqxVar = new wqx(context, dtVar, adSlot, this.oya);
            this.jpo = wqxVar;
            wqxVar.addOnAttachStateChangeListener(this.opi);
        } else {
            cm cmVar = new cm(context, dtVar, adSlot, this.oya);
            this.jpo = cmVar;
            cmVar.addOnAttachStateChangeListener(this.opi);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(boolean z10, dt dtVar) {
        if (z10 && this.f20255cm.mc() && !this.f20255cm.dt()) {
            this.f20255cm.jj(true);
            dt dtVar2 = this.f20255cm;
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar2, this.wqx, dtVar2.sj());
        }
        duq.jd(new C0114jpo(z10, dtVar, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(View view, nmd nmdVar, dt dtVar, String str, qk.jpo jpoVar) throws JSONException {
        com.bytedance.sdk.openadsdk.core.zz.jd().jpo(str, jpoVar);
        this.f20260qk = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            if (nmdVar != null) {
                jSONObject.put("dynamic_show_type", nmdVar.getDynamicShowType());
                nmdVar.jpo(jSONObject, dtVar);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, this.wqx, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(dtVar);
        } catch (JSONException unused2) {
            com.bytedance.sdk.component.utils.nmd.wqx("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.my;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, dtVar.pzk());
        }
        if (dtVar.vt()) {
            tic.jpo(dtVar, view);
        }
    }

    private com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj jpo(dt dtVar) {
        if (dtVar.pzk() == 4) {
            return com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(this.f20257jj, this.wqx);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final nmd nmdVar, final dt dtVar) {
        jpo jpoVar;
        dt dtVar2;
        final nmd nmdVar2;
        com.bytedance.sdk.openadsdk.core.qk qkVar;
        if (nmdVar == null || dtVar == null) {
            return;
        }
        this.f20255cm = dtVar;
        this.f20262yd = jpo(dtVar);
        this.f20259ju = nmdVar;
        final String strJpo = nq.jpo();
        final qk.jpo jpoVarJu = ju();
        nmdVar.setClosedListenerKey(strJpo);
        nmdVar.setBannerClickClosedListener(jpoVarJu);
        nmdVar.setBackupListener(new com.bytedance.sdk.component.adexpress.jd.wqx() { // from class: com.bytedance.sdk.openadsdk.core.cm.jpo.2
            @Override // com.bytedance.sdk.component.adexpress.jd.wqx
            public boolean jpo(ViewGroup viewGroup, int i10) {
                try {
                    nmdVar.nmd();
                    if (!jpo.this.f20255cm.ig()) {
                        jd jdVar = new jd(nmdVar.getContext());
                        jdVar.setClosedListenerKey(strJpo);
                        jdVar.jpo(jpo.this.f20255cm, nmdVar, jpo.this.f20262yd);
                        jdVar.setAdInteractionListener(jpo.this.my);
                        return true;
                    }
                    zz zzVar = new zz(nmdVar.getContext());
                    zzVar.setClosedListenerKey(strJpo);
                    zzVar.jpo(jpo.this.f20255cm, nmdVar, jpo.this.f20262yd);
                    zzVar.setAdInteractionListener(jpo.this.my);
                    nmdVar.setVastVideoHelper(zzVar);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.xyk) {
            com.bytedance.sdk.openadsdk.core.qk qkVarJpo = jpo(nmdVar);
            if (qkVarJpo == null) {
                qkVarJpo = new com.bytedance.sdk.openadsdk.core.qk(this.f20257jj, nmdVar, this.f116if.jpo());
                nmdVar.addView(qkVarJpo);
            }
            qkVarJpo.setAdType(1);
            nmdVar2 = nmdVar;
            qkVarJpo.setCallback(new qk.jpo() { // from class: com.bytedance.sdk.openadsdk.core.cm.jpo.3
                @Override // com.bytedance.sdk.openadsdk.core.qk.jpo
                public void jd() {
                    jpo jpoVar2 = jpo.this;
                    jpoVar2.jd(jpoVar2.f20255cm);
                }

                @Override // com.bytedance.sdk.openadsdk.core.qk.jpo
                public void jpo(boolean z10) {
                    jpo.this.jpo(z10, dtVar);
                }

                @Override // com.bytedance.sdk.openadsdk.core.qk.jpo
                public void jpo() {
                    if (jpo.this.f20261sq != 0) {
                        jpo.this.yd();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.qk.jpo
                public void jpo(View view) throws JSONException {
                    if (jpo.this.f20254au.compareAndSet(false, true)) {
                        jpo.this.jpo(view, nmdVar2, dtVar, strJpo, jpoVarJu);
                    }
                    cm cmVar = jpo.this.jpo;
                    if (cmVar == null || cmVar.getCurView() == null) {
                        return;
                    }
                    jpo.this.jpo.getCurView().yd();
                    jpo.this.jpo.getCurView().opi();
                    jpo.this.jpo.setIsShow(true);
                }
            });
            qkVar = qkVarJpo;
            jpoVar = this;
            dtVar2 = dtVar;
        } else {
            boolean zJpo = this.f116if.jpo();
            vrc.jd jdVar = new vrc.jd() { // from class: com.bytedance.sdk.openadsdk.core.cm.jpo.4
                @Override // com.bytedance.sdk.openadsdk.utils.vrc.jd
                public void jd() {
                    jpo jpoVar2 = jpo.this;
                    jpoVar2.jd(jpoVar2.f20255cm);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.vrc.jd
                public void jpo(boolean z10) {
                    jpo.this.jpo(z10, dtVar);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.vrc.jd
                public void jpo() {
                    if (jpo.this.f20261sq != 0) {
                        jpo.this.yd();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.utils.vrc.jd
                public void jpo(View view, boolean z10) throws JSONException {
                    if (!z10) {
                        com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(jpo.this.f20255cm, 8);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(jpo.this.f20255cm, 4);
                    if (jpo.this.f20254au.compareAndSet(false, true)) {
                        jpo.this.jpo(view, nmdVar, dtVar, strJpo, jpoVarJu);
                    }
                    cm cmVar = jpo.this.jpo;
                    if (cmVar == null || cmVar.getCurView() == null) {
                        return;
                    }
                    jpo.this.jpo.getCurView().yd();
                    jpo.this.jpo.getCurView().opi();
                    jpo.this.jpo.setIsShow(true);
                }
            };
            jpoVar = this;
            dtVar2 = dtVar;
            vrc.jpo(nmdVar, true, 1, zJpo, jdVar, null);
            nmdVar2 = nmdVar;
            qkVar = null;
        }
        Context contextJpo = com.bytedance.sdk.component.utils.jd.jpo(nmdVar2);
        if (contextJpo == null) {
            contextJpo = jpoVar.f20257jj;
        }
        com.bytedance.sdk.openadsdk.core.zz.zz zzVar = new com.bytedance.sdk.openadsdk.core.zz.zz(contextJpo, dtVar2, jpoVar.wqx, 2);
        zzVar.jpo(nmdVar2);
        zzVar.jpo(this);
        zzVar.jpo(jpoVar.f20262yd);
        zzVar.jpo(new jd.jpo() { // from class: com.bytedance.sdk.openadsdk.core.cm.jpo.5
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jd.jpo
            public void jpo(View view, int i10) {
                if (jpo.this.my != null) {
                    jpo.this.my.onAdClicked();
                }
            }
        });
        nmdVar2.setClickListener(zzVar);
        com.bytedance.sdk.openadsdk.core.zz.xyk xykVar = new com.bytedance.sdk.openadsdk.core.zz.xyk(jpoVar.f20257jj, dtVar2, jpoVar.wqx, 2);
        xykVar.jpo((View) nmdVar2);
        xykVar.jpo(this);
        xykVar.jpo(new jd.jpo() { // from class: com.bytedance.sdk.openadsdk.core.cm.jpo.6
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jd.jpo
            public void jpo(View view, int i10) {
                if (jpo.this.my != null) {
                    jpo.this.my.onAdClicked();
                }
            }
        });
        nmd nmdVar3 = jpoVar.f20259ju;
        if (nmdVar3 instanceof jr) {
            xykVar.jpo(((jr) nmdVar3).getVideoController());
        }
        xykVar.jpo(jpoVar.f20262yd);
        nmdVar2.setClickCreativeListener(xykVar);
        if (jpoVar.xyk) {
            return;
        }
        qkVar.setNeedCheckingShow(true);
    }

    private com.bytedance.sdk.openadsdk.core.qk jpo(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            try {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.qk) {
                    return (com.bytedance.sdk.openadsdk.core.qk) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void jpo(final com.bytedance.sdk.openadsdk.jpo.jpo.jd jdVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f20258jr > 500) {
            this.f20258jr = jCurrentTimeMillis;
            cm cmVar = this.jpo;
            if (cmVar instanceof wqx) {
                cmVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cm.jpo.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((wqx) jpo.this.jpo).jpo(jdVar);
                    }
                }, 500L);
            }
        }
    }
}
