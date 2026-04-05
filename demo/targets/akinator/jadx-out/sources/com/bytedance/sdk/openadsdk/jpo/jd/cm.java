package com.bytedance.sdk.openadsdk.jpo.jd;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.dt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm implements PAGNativeAdData {
    private final jpo jpo;

    public cm(jpo jpoVar) {
        this.jpo = jpoVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        jpo jpoVar = this.jpo;
        if (jpoVar != null) {
            return jpoVar.ju();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        jpo jpoVar = this.jpo;
        if (jpoVar != null) {
            return jpoVar.yd();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        jpo jpoVar = this.jpo;
        if (jpoVar != null) {
            return jpoVar.jj();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        jpo jpoVar = this.jpo;
        if (jpoVar != null) {
            return jpoVar.my();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        jpo jpoVar = this.jpo;
        if (jpoVar != null) {
            return jpoVar.wqx();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        return dt.my(this.jpo.jpo) ? PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo : PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        jpo jpoVar = this.jpo;
        if (jpoVar != null) {
            return jpoVar.qk();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        jpo jpoVar = this.jpo;
        if (jpoVar != null) {
            return jpoVar.cm();
        }
        return null;
    }
}
