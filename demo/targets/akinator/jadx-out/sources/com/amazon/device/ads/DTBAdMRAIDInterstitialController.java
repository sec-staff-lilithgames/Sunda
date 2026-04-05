package com.amazon.device.ads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBAdMRAIDInterstitialController extends DTBAdMRAIDController implements DTBAdViewDisplayListener {
    public String bidId;
    public DTBAdInterstitialListener interstitialListener;
    public boolean pageDisplayed;
    public boolean pageLoaded;

    public DTBAdMRAIDInterstitialController(DTBAdView dTBAdView, DTBAdInterstitialListener dTBAdInterstitialListener) {
        super(dTBAdView);
        this.pageLoaded = false;
        this.pageDisplayed = false;
        this.interstitialListener = dTBAdInterstitialListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cleanOnCloseHandler, reason: merged with bridge method [inline-methods] */
    public void lambda$executeClose$0() {
        try {
            DTBAdView dTBAdView = this.adView;
            if (dTBAdView != null) {
                dTBAdView.setWebViewClient(null);
                this.adView.removeAllViews();
                this.adView.cleanup();
                DTBAdInterstitialListener dTBAdInterstitialListener = this.interstitialListener;
                if (dTBAdInterstitialListener != null) {
                    dTBAdInterstitialListener.onAdClosed(this.adView);
                }
            }
            Activity currentActivity = ActivityMonitor.getInstance().getCurrentActivity();
            if (this.useCustomClose && !currentActivity.isFinishing() && (currentActivity instanceof DTBInterstitialActivity)) {
                DTBInterstitialActivity dTBInterstitialActivity = (DTBInterstitialActivity) currentActivity;
                dTBInterstitialActivity.cleanup();
                dTBInterstitialActivity.finish();
            }
        } catch (RuntimeException e10) {
            DtbLog.error(DTBAdMRAIDController.LOG_TAG, "Failed to execute cleanOnCloseHandler method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Failed to execute cleanOnCloseHandler method", e10);
        }
    }

    private void executeClose(String str) {
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
        commandCompleted(str);
        setState(MraidStateType.HIDDEN);
        fireViewableChange(false);
        new Handler(Looper.getMainLooper()).post(new i(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$impressionFired$6() {
        this.interstitialListener.onImpressionFired(this.adView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdClicked$1() {
        this.interstitialListener.onAdClicked(this.adView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdError$4() {
        this.interstitialListener.onAdError(this.adView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdFailedToLoad$3() {
        this.interstitialListener.onAdFailed(this.adView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdLeftApplication$5() {
        this.interstitialListener.onAdLeftApplication(this.adView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdLoaded$2() {
        this.interstitialListener.onAdLoaded(this.adView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onVideoCompleted$7() {
        this.interstitialListener.onVideoCompleted(this.adView);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void expand(Map<String, Object> map) {
        fireErrorEvent(MraidExpandCommand.NAME, "invalid placement type for interstitial ");
        commandCompleted(MraidExpandCommand.NAME);
    }

    public DTBAdInterstitialListener getInterstitialListener() {
        return this.interstitialListener;
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public String getPlacementType() {
        return "interstitial";
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void impressionFired() {
        if (this.interstitialListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Failed to get interstitialListener on onAdError");
        } else {
            DtbThreadService.executeOnMainThread(new i(this, 4));
            super.impressionFired();
        }
    }

    public void initializeOnLoadAndDisplay() throws JSONException {
        if (this.pageLoaded && this.pageDisplayed) {
            prepareMraid();
        } else {
            createLoadReport();
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController, com.amazon.device.ads.DTBActivityListener
    public void onActivityDestroyed(Activity activity) {
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
        ActivityMonitor.getInstance().setActivityListener(null);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController, com.amazon.device.ads.DTBActivityListener
    public void onActivityResumed(Activity activity) {
        ActivityMonitor.getInstance().setActivityListener(null);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdClicked() {
        if (this.interstitialListener != null) {
            new Handler(Looper.getMainLooper()).post(new i(this, 1));
        }
    }

    public void onAdError() {
        if (this.interstitialListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Failed to get interstitialListener on onAdError");
        } else {
            DtbThreadService.executeOnMainThread(new i(this, 2));
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdFailedToLoad() {
        if (this.interstitialListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Failed to get interstitialListener on onAdFailedToLoad");
        } else {
            DtbThreadService.executeOnMainThread(new i(this, 0));
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdLeftApplication() {
        new Handler(Looper.getMainLooper()).post(new i(this, 5));
        ActivityMonitor.getInstance().setActivityListener(this);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdLoaded() {
        if (this.interstitialListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Failed to get interstitialListener on OnAdLoaded");
        } else {
            DtbThreadService.executeOnMainThread(new i(this, 3));
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdOpened() {
        DTBAdInterstitialListener dTBAdInterstitialListener = this.interstitialListener;
        if (dTBAdInterstitialListener != null) {
            dTBAdInterstitialListener.onAdOpen(this.adView);
        }
    }

    @Override // com.amazon.device.ads.DTBAdViewDisplayListener
    public void onInitialDisplay() {
        this.pageDisplayed = true;
        try {
            initializeOnLoadAndDisplay();
        } catch (JSONException e10) {
            DtbLog.error("JSON exception:" + e10.getMessage());
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onMRAIDClose() {
        executeClose("close");
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onMRAIDUnload() {
        executeClose(MraidUnloadCommand.NAME);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onPageLoad() {
        this.pageLoaded = true;
        try {
            initializeOnLoadAndDisplay();
            if (DTBMetricsConfiguration.getInstance().isFeatureEnabled("additional_webview_metric", false)) {
                String bidId = getAdView().getBidId();
                this.bidId = bidId;
                ApsMetrics.customEvent("interstitialCreativeFinished", bidId, null);
            }
        } catch (JSONException e10) {
            DtbLog.error("Error:" + e10.getMessage());
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onResize(Map<String, Object> map) {
        fireErrorEvent(MraidResizeCommand.NAME, "invalid placement type");
        commandCompleted(MraidResizeCommand.NAME);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onVideoCompleted() {
        if (this.interstitialListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Failed to get interstitialListener on onAdError");
        } else {
            DtbThreadService.executeOnMainThread(new i(this, 6));
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void passLoadError() {
        onAdError();
    }

    public void setInterstitialListener(DTBAdInterstitialListener dTBAdInterstitialListener) {
        this.interstitialListener = dTBAdInterstitialListener;
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void startEndCardDisplayOMSDKSession() {
        if (getDtbOmSdkSessionManager() == null || getAdView() == null) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.LOG, "OMSDK : Aps OMSDK Session Manager or AdView is null on start");
            return;
        }
        try {
            if (getDtbOmSdkSessionManager().getCurrentAdSession() != null) {
                getDtbOmSdkSessionManager().stopOmAdSession();
            }
            getDtbOmSdkSessionManager().initHtmlDisplayOmAdSession(getAdView(), "https://c.amazon-adsystem.com/");
            getDtbOmSdkSessionManager().registerAdView(getAdView());
            getDtbOmSdkSessionManager().startAdSession();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "OMSDK : End Card display : Unable to restart OM SDK session", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void startOMSDKSession() {
        if (getDtbOmSdkSessionManager() == null || getAdView() == null) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.LOG, "OMSDK : Aps OMSDK Session Manager or AdView is null on start");
            return;
        }
        try {
            if (getDtbOmSdkSessionManager().getCurrentAdSession() != null) {
                getDtbOmSdkSessionManager().stopOmAdSession();
            }
            if (getAdView().isVideo()) {
                getDtbOmSdkSessionManager().initJavaScriptOmAdSession(getAdView(), "https://c.amazon-adsystem.com/");
            } else {
                getDtbOmSdkSessionManager().initHtmlDisplayOmAdSession(getAdView(), "https://c.amazon-adsystem.com/");
            }
            getDtbOmSdkSessionManager().registerAdView(getAdView());
            getDtbOmSdkSessionManager().startAdSession();
            getDtbOmSdkSessionManager().displayAdEventLoaded();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "OMSDK :Unable to start OM SDK session", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void stopOMSDKSession() {
        if (getDtbOmSdkSessionManager() == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMSDK : Aps OmSdk Session Manager is null on Stop Session");
        } else {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
    }
}
