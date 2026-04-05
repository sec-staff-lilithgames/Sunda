package com.amazon.device.ads;

import android.content.Context;
import com.amazon.aps.ads.metrics.ApsMetricsBannerListenerAdapter;
import com.amazon.aps.ads.metrics.ApsMetricsInterstitialListenerAdapter;
import com.amazon.aps.ads.util.adview.ApsAdViewConstants;
import com.amazon.aps.ads.util.adview.ApsAdViewImpl;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBAdView extends ApsAdViewImpl implements ApsAdViewConstants {
    public static final String LOG_TAG = "DTBAdView";

    public DTBAdView(Context context) {
        super(context);
    }

    public DTBAdMRAIDController getController() {
        return getMraidHandler();
    }

    public void initAdBannerListener(DTBAdBannerListener dTBAdBannerListener) {
        try {
            setMraidListenerAdapter(new ApsMetricsBannerListenerAdapter(getBidId(), dTBAdBannerListener));
            setMraidHandler(new DTBAdMRAIDBannerController(this, (ApsMetricsBannerListenerAdapter) getMraidListenerAdapter()));
            initWebView();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdBannerListener", e10);
        }
    }

    public void initAdExpandedListener(DTBAdExpandedListener dTBAdExpandedListener, int i10) {
        try {
            DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController = new DTBAdMRAIDExpandedController(this);
            setMraidHandler(dTBAdMRAIDExpandedController);
            dTBAdMRAIDExpandedController.setMasterController(DTBAdMRAIDBannerController.findControllerByIndex(i10));
            dTBAdExpandedListener.onCreateExpandedController((DTBAdMRAIDExpandedController) getMraidHandler());
            initWebView();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdExpandedListener", e10);
        }
    }

    public void initAdInterstitialListener(DTBAdInterstitialListener dTBAdInterstitialListener) {
        try {
            setMraidListenerAdapter(new ApsMetricsInterstitialListenerAdapter(getBidId(), dTBAdInterstitialListener));
            setMraidHandler(new DTBAdMRAIDInterstitialController(this, (ApsMetricsInterstitialListenerAdapter) getMraidListenerAdapter()));
            initWebView();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdInterstitialListener", e10);
        }
    }

    public DTBAdView(Context context, DTBAdInterstitialListener dTBAdInterstitialListener) {
        super(context);
        initAdInterstitialListener(dTBAdInterstitialListener);
    }

    public DTBAdView(Context context, DTBAdBannerListener dTBAdBannerListener) {
        super(context);
        initAdBannerListener(dTBAdBannerListener);
    }

    public DTBAdView(Context context, DTBAdExpandedListener dTBAdExpandedListener) {
        this(context, dTBAdExpandedListener, 0);
    }

    public DTBAdView(Context context, DTBAdExpandedListener dTBAdExpandedListener, int i10) {
        super(context);
        initAdExpandedListener(dTBAdExpandedListener, i10);
    }
}
