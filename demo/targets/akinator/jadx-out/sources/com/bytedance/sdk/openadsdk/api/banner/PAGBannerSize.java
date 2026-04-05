package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.wqx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class PAGBannerSize {

    /* renamed from: cm, reason: collision with root package name */
    private int f19444cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f19445jd;
    private int jpo;
    private int wqx = 1;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i10, int i11) {
        this.jpo = i10;
        this.f19445jd = i11;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        int iJpo = wqx.jpo(context, i10, 0);
        if (iJpo == wqx.jpo) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, iJpo);
        pAGBannerSize.wqx = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iJpo = wqx.jpo(context, 0);
        if (iJpo == wqx.jpo) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, 0);
        pAGBannerSize.f19444cm = iJpo;
        pAGBannerSize.wqx = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i10, int i11) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, 0);
        pAGBannerSize.f19444cm = i11;
        pAGBannerSize.wqx = 3;
        return pAGBannerSize;
    }

    public int getHeight() {
        return this.f19445jd;
    }

    public int getMaxHeight() {
        return this.f19444cm;
    }

    public int getType() {
        return this.wqx;
    }

    public int getWidth() {
        return this.jpo;
    }
}
