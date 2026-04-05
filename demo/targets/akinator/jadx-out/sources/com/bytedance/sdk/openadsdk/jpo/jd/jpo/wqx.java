package com.bytedance.sdk.openadsdk.jpo.jd.jpo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.core.ju.cm;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.zz.jr;
import com.bytedance.sdk.openadsdk.core.zz.nmd;
import com.bytedance.sdk.openadsdk.jpo.jd.xyk;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends xyk {

    /* renamed from: if, reason: not valid java name */
    private boolean f156if;

    /* renamed from: ju, reason: collision with root package name */
    protected String f21230ju;
    protected final Context xyk;

    /* renamed from: yd, reason: collision with root package name */
    protected nmd f21231yd;
    protected AdSlot zz;

    public wqx(Context context, dt dtVar, AdSlot adSlot) {
        super(context, dtVar, 5, true);
        this.f21230ju = "embeded_ad";
        this.f156if = false;
        this.f21235jd.prr(1);
        this.f21234cm.jpo(this);
        this.xyk = context;
        this.zz = adSlot;
        jpo();
        jd();
    }

    private void jd() {
        nmd nmdVar = this.f21231yd;
        if (nmdVar != null) {
            nmdVar.setBackupListener(new com.bytedance.sdk.component.adexpress.jd.wqx() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.jpo.wqx.1
                @Override // com.bytedance.sdk.component.adexpress.jd.wqx
                public boolean jpo(ViewGroup viewGroup, int i10) {
                    jpo jpoVar = new jpo(wqx.this.f21231yd.getContext());
                    jpoVar.setExtraFuncationHelper(((xyk) wqx.this).f21234cm);
                    jpoVar.jpo(wqx.this.f21231yd);
                    return true;
                }
            });
        }
    }

    public nmd cm() {
        return this.f21231yd;
    }

    public void my() {
        nmd nmdVar = this.f21231yd;
        if (nmdVar != null) {
            nmdVar.jr();
        }
    }

    public void wqx() {
        nmd nmdVar = this.f21231yd;
        if (nmdVar != null) {
            nmdVar.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.jpo.wqx.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f10, float f11) {
                    if (!wqx.this.f21231yd.rq()) {
                        wqx.this.jpo(f10, f11);
                        if (wqx.this.f156if) {
                            wqx.this.f21231yd.opi();
                            return;
                        }
                        return;
                    }
                    wqx wqxVar = wqx.this;
                    Context context = wqxVar.xyk;
                    dt dtVar = ((xyk) wqxVar).f21235jd;
                    wqx wqxVar2 = wqx.this;
                    com.bytedance.sdk.openadsdk.jpo.jd.jd jdVar = new com.bytedance.sdk.openadsdk.jpo.jd.jd(context, dtVar, 5, wqxVar2.zz, ((xyk) wqxVar2).f21234cm, ((xyk) wqx.this).jpo);
                    wqx wqxVar3 = wqx.this;
                    if (wqxVar3 instanceof jd) {
                        jdVar.jpo(((jr) wqxVar3.cm()).getVideoAdListener());
                    }
                    ((xyk) wqx.this).f21234cm.jpo((com.bytedance.sdk.openadsdk.core.wqx.jpo) wqx.this.f21231yd.getClickCreativeListener());
                    PAGMediaView pAGMediaViewZz = ((xyk) wqx.this).f21234cm.zz();
                    if (pAGMediaViewZz == null) {
                        pAGMediaViewZz = new PAGMediaView(wqx.this.xyk);
                    }
                    wqx.this.f21231yd.addView(pAGMediaViewZz);
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i10) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i10) {
                }
            });
        }
    }

    public void jpo() {
        this.f21231yd = new nmd(this.xyk, this.f21235jd, this.zz, this.f21230ju);
        wqx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(float f10, float f11) {
        nmd nmdVar = this.f21231yd;
        if (nmdVar != null && cm.jpo(nmdVar.getDynamicShowType())) {
            ViewGroup.LayoutParams layoutParams = this.f21231yd.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            this.f21231yd.setLayoutParams(layoutParams);
            return;
        }
        int iJd = va.jd(this.xyk, f10);
        int iJd2 = va.jd(this.xyk, f11);
        ViewGroup.LayoutParams layoutParams2 = this.f21231yd.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(iJd, iJd2);
        } else {
            layoutParams2.width = iJd;
            layoutParams2.height = iJd2;
        }
        this.f21231yd.setLayoutParams(layoutParams2);
    }

    public void jpo(boolean z10) {
        this.f156if = z10;
    }
}
