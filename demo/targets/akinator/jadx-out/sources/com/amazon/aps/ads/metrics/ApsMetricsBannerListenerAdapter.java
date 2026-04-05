package com.amazon.aps.ads.metrics;

import com.amazon.device.ads.DTBAdBannerListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsBannerListenerAdapter extends ApsMetricsAdListenerAdapterBase implements DTBAdBannerListener {
    private String bidId;
    private final DTBAdBannerListener listener;

    public ApsMetricsBannerListenerAdapter(String str, DTBAdBannerListener dTBAdBannerListener) {
        super(str, dTBAdBannerListener);
        this.bidId = str;
        this.listener = dTBAdBannerListener;
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    public String getBidId() {
        return this.bidId;
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    public void setBidId(String str) {
        this.bidId = str;
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    public DTBAdBannerListener getListener() {
        return this.listener;
    }
}
