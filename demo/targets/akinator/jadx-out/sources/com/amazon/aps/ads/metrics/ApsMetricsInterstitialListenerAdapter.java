package com.amazon.aps.ads.metrics;

import android.view.View;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.metrics.ApsMetricsPerfEventModelBuilder;
import com.amazon.device.ads.DTBAdInterstitialListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsMetricsInterstitialListenerAdapter extends ApsMetricsAdListenerAdapterBase implements DTBAdInterstitialListener {
    private String bidId;
    private final DTBAdInterstitialListener listener;

    public ApsMetricsInterstitialListenerAdapter(String str, DTBAdInterstitialListener dTBAdInterstitialListener) {
        super(str, dTBAdInterstitialListener);
        this.bidId = str;
        this.listener = dTBAdInterstitialListener;
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    public String getBidId() {
        return this.bidId;
    }

    @Override // com.amazon.device.ads.DTBAdVideoListener
    public void onVideoCompleted(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        DTBAdInterstitialListener listener = getListener();
        if (listener != null) {
            listener.onVideoCompleted(view);
        }
        ApsMetrics.Companion.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withVideoCompletedEvent(jCurrentTimeMillis));
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    public void setBidId(String str) {
        this.bidId = str;
    }

    @Override // com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase
    public DTBAdInterstitialListener getListener() {
        return this.listener;
    }
}
