package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PAGBiddingRequest {
    private PAGBannerSize jpo = null;

    /* renamed from: jd, reason: collision with root package name */
    private String f19446jd = null;
    private String wqx = null;

    public String getAdxId() {
        return this.wqx;
    }

    public PAGBannerSize getBannerSize() {
        return this.jpo;
    }

    public String getSlotId() {
        return this.f19446jd;
    }

    public void setAdxId(String str) {
        this.wqx = str;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.jpo = pAGBannerSize;
    }

    public void setSlotId(String str) {
        this.f19446jd = str;
    }
}
