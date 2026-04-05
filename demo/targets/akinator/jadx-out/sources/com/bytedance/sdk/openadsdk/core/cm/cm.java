package com.bytedance.sdk.openadsdk.core.cm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.zz.nmd;
import com.bytedance.sdk.openadsdk.hmu.jd.my;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends com.bytedance.sdk.openadsdk.core.jj.wqx {

    /* renamed from: cm, reason: collision with root package name */
    protected AdSlot f20240cm;

    /* renamed from: jd, reason: collision with root package name */
    protected nmd f20241jd;

    /* renamed from: jj, reason: collision with root package name */
    protected String f20242jj;
    protected final Context jpo;
    protected PAGBannerAdWrapperListener my;

    /* renamed from: qk, reason: collision with root package name */
    protected boolean f20243qk;
    protected dt wqx;
    private int xyk;
    private boolean zz;

    public cm(Context context, dt dtVar, AdSlot adSlot, boolean z10) {
        super(context);
        this.f20242jj = "banner_ad";
        this.f20243qk = false;
        this.xyk = -1;
        this.zz = false;
        if (dtVar != null && dtVar.cql() != 2) {
            dtVar.prr(1);
        }
        this.f20243qk = z10;
        this.jpo = context;
        this.wqx = dtVar;
        this.f20240cm = adSlot;
        wqx();
        AdSlot adSlot2 = this.f20240cm;
        if (adSlot2 != null) {
            jpo(adSlot2.getExpressViewAcceptedWidth(), this.f20240cm.getExpressViewAcceptedHeight());
        }
    }

    public void cm() {
        if (this.f20241jd != null) {
            com.bytedance.sdk.openadsdk.core.zz.jd().jj(this.f20241jd.getClosedListenerKey());
            removeView(this.f20241jd);
            this.f20241jd.mo446if();
            this.f20241jd = null;
        }
        com.bytedance.sdk.openadsdk.core.zz.jd().rq();
    }

    public nmd getCurView() {
        return this.f20241jd;
    }

    public void my() {
        nmd nmdVar = this.f20241jd;
        if (nmdVar != null) {
            nmdVar.jr();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f20241jd == null) {
            wqx();
        }
        com.bytedance.sdk.openadsdk.utils.cm.jpo(this, this.wqx);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setCurrentIndex(int i10) {
        this.xyk = i10;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.my = pAGBannerAdWrapperListener;
        nmd nmdVar = this.f20241jd;
        if (nmdVar != null) {
            nmdVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.my() { // from class: com.bytedance.sdk.openadsdk.core.cm.cm.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.my
                public void jpo() {
                    cm.this.my.onAdClicked();
                }
            });
            this.f20241jd.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.cm.cm.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2;
                    dt dtVar = cm.this.wqx;
                    if (dtVar == null || !dtVar.jfy() || (pAGBannerAdWrapperListener2 = cm.this.my) == null) {
                        return;
                    }
                    pAGBannerAdWrapperListener2.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i10) {
                    cm cmVar = cm.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = cmVar.my;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(cmVar, str, i10);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f10, float f11) {
                    nmd nmdVar2 = cm.this.f20241jd;
                    if (nmdVar2 != null) {
                        nmdVar2.setSoundMute(true);
                    }
                    nmd nmdVar3 = cm.this.f20241jd;
                    if (nmdVar3 != null && !com.bytedance.sdk.openadsdk.core.ju.cm.jpo(nmdVar3.getDynamicShowType())) {
                        cm.this.jpo(f10, f11);
                    }
                    if (cm.this.zz) {
                        cm.this.f20241jd.opi();
                    }
                    cm cmVar = cm.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = cmVar.my;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(cmVar, f10, f11);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i10) {
                }
            });
        }
    }

    public void setIsShow(boolean z10) {
        this.zz = z10;
    }

    public void wqx() {
        nmd nmdVar = new nmd(this.jpo, this.wqx, this.f20240cm, this.f20242jj) { // from class: com.bytedance.sdk.openadsdk.core.cm.cm.1
            @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
            public my.jpo wqx(int i10) {
                return cm.this.jpo(super.wqx(i10));
            }
        };
        this.f20241jd = nmdVar;
        addView(nmdVar, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.my;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public my.jpo jpo(my.jpo jpoVar) {
        int i10;
        if (this.f20243qk && (i10 = this.xyk) >= 0) {
            jpoVar.f21162jd = i10;
        }
        return jpoVar;
    }

    public void jpo(float f10, float f11) {
        int iJd = va.jd(this.jpo, f10);
        int iJd2 = va.jd(this.jpo, f11);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iJd, iJd2);
        }
        layoutParams.width = iJd;
        layoutParams.height = iJd2;
        setLayoutParams(layoutParams);
    }
}
