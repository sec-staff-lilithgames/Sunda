package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize jpo;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.jpo = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.jpo;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.jpo = pAGBannerSize;
    }
}
