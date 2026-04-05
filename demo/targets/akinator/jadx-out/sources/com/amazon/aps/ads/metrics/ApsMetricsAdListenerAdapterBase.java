package com.amazon.aps.ads.metrics;

import android.view.View;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.metrics.ApsMetricsPerfEventModelBuilder;
import com.amazon.aps.shared.metrics.model.ApsMetricsResult;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBMetricsConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsMetricsAdListenerAdapterBase implements DTBAdListener {
    private String bidId;
    private final DTBAdListener listener;

    public ApsMetricsAdListenerAdapterBase(String str, DTBAdListener dTBAdListener) {
        this.bidId = str;
        this.listener = dTBAdListener;
    }

    public String getBidId() {
        return this.bidId;
    }

    public DTBAdListener getListener() {
        return this.listener;
    }

    public final boolean isAllowedToCaptureExtendedMetrics() {
        return DTBMetricsConfiguration.getInstance().isFeatureEnabled(DTBMetricsConfiguration.FEATURE_APSMETRICS_EXTENDED_METRICS, false);
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdClicked(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdClicked(view);
        }
        if (isAllowedToCaptureExtendedMetrics()) {
            ApsMetrics.Companion.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdClickEvent(jCurrentTimeMillis));
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdClosed(View view) {
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdClosed(view);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdError(View view) {
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdError(view);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdFailed(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdFailed(view);
        }
        ApsMetrics.Companion.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdFetchEndTime(ApsMetricsResult.Failure, jCurrentTimeMillis));
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdLeftApplication(View view) {
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdLeftApplication(view);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdLoaded(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdLoaded(view);
        }
        ApsMetrics.Companion.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdFetchEndTime(ApsMetricsResult.Success, jCurrentTimeMillis));
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdOpen(View view) {
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onAdOpen(view);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onImpressionFired(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        DTBAdListener listener = getListener();
        if (listener != null) {
            listener.onImpressionFired(view);
        }
        ApsMetrics.Companion.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdImpressionEndTime(ApsMetricsResult.Success, jCurrentTimeMillis));
    }

    public void setBidId(String str) {
        this.bidId = str;
    }
}
