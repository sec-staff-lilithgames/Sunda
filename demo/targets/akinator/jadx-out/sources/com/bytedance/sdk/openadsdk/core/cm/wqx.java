package com.bytedance.sdk.openadsdk.core.cm;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.zz.jr;
import com.bytedance.sdk.openadsdk.core.zz.nmd;
import com.bytedance.sdk.openadsdk.hmu.jd.my;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends cm {
    private com.bytedance.sdk.openadsdk.jpo.jpo.jd xyk;

    /* renamed from: yd, reason: collision with root package name */
    private int f20283yd;
    private int zz;

    public wqx(Context context, dt dtVar, AdSlot adSlot, boolean z10) {
        super(context, dtVar, adSlot, z10);
        this.zz = 1;
        this.f20283yd = -1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cm.cm
    public void cm() {
        com.bytedance.sdk.openadsdk.core.au.jd.wqx videoController;
        nmd nmdVar = this.f20241jd;
        if ((nmdVar instanceof jr) && (videoController = ((jr) nmdVar).getVideoController()) != null) {
            this.zz = videoController.va();
        }
        super.cm();
    }

    public com.bytedance.sdk.openadsdk.multipro.jd.jpo getVideoModel() {
        nmd nmdVar = this.f20241jd;
        if (nmdVar != null) {
            return ((jr) nmdVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cm.cm
    public void wqx() {
        jr jrVar = new jr(this.jpo, this.wqx, this.f20240cm, this.f20242jj, this.f20243qk) { // from class: com.bytedance.sdk.openadsdk.core.cm.wqx.1
            @Override // com.bytedance.sdk.openadsdk.core.zz.nmd
            public my.jpo wqx(int i10) {
                return wqx.this.jpo(super.wqx(i10));
            }
        };
        this.f20241jd = jrVar;
        com.bytedance.sdk.openadsdk.core.au.jd.wqx videoController = jrVar.getVideoController();
        if (videoController != null) {
            videoController.cm(this.zz);
        }
        addView(this.f20241jd, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.my;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
        nmd nmdVar = this.f20241jd;
        if (nmdVar != null) {
            ((jr) nmdVar).setVideoAdListener(new com.bytedance.sdk.openadsdk.jpo.jd.wqx() { // from class: com.bytedance.sdk.openadsdk.core.cm.wqx.2
                @Override // com.bytedance.sdk.openadsdk.jpo.jd.wqx
                public void jpo(int i10, int i11) {
                }

                @Override // com.bytedance.sdk.openadsdk.jpo.jd.wqx
                public void wqx(PAGNativeAd pAGNativeAd) {
                    if (wqx.this.xyk != null) {
                        wqx.this.xyk.jpo();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.jpo.jd.wqx
                public void jpo(PAGNativeAd pAGNativeAd) {
                    if (wqx.this.f20283yd == 3) {
                        wqx wqxVar = wqx.this;
                        wqxVar.jpo(wqxVar.xyk);
                    } else if (wqx.this.f20283yd == 2) {
                        wqx.this.jpo();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.jpo.jd.wqx
                public void jd(PAGNativeAd pAGNativeAd) {
                }
            });
        }
    }

    public void jd() {
        nmd nmdVar = this.f20241jd;
        if (nmdVar != null) {
            ((jr) nmdVar).sq();
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.jpo.jpo.jd jdVar) {
        nmd nmdVar = this.f20241jd;
        if (nmdVar != null) {
            ((jr) nmdVar).hna();
            this.xyk = jdVar;
            this.f20283yd = 3;
        }
    }

    public void jpo() {
        nmd nmdVar = this.f20241jd;
        if (nmdVar != null) {
            ((jr) nmdVar).prr();
            this.f20283yd = 2;
        }
    }
}
