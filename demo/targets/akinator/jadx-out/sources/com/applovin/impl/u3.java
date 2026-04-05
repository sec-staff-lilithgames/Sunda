package com.applovin.impl;

import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class u3 implements MaxAd {

    /* renamed from: a, reason: collision with root package name */
    private final x2 f15800a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15801b;

    public u3(String str, MaxAdFormat maxAdFormat, String str2) {
        h hVar = new h(-1, -1, -1, -1);
        Map map = Collections.EMPTY_MAP;
        this.f15800a = new x2(str, maxAdFormat, map, map, map, hVar);
        this.f15801b = str2;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdUnitId() {
        return this.f15800a.b();
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return this.f15800a.a();
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return "";
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getPlacement() {
        return this.f15801b;
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return 0L;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        return AdError.UNDEFINED_DOMAIN;
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        return getFormat().getSize();
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return new MaxAdWaterfallInfoImpl(null, "", "", 0L, new ArrayList(), this.f15800a, Collections.EMPTY_LIST, "", "");
    }

    public String toString() {
        return "MaxAd{adUnitId=" + this.f15800a.b() + ", format=" + this.f15800a.a() + "}";
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        return null;
    }
}
