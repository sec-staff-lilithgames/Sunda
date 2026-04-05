package com.amazon.aps.ads.util.adview;

import af.n;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.browser.customtabs.g;
import b0.e2;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdUtils;
import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.metrics.ApsMetricsAdListenerAdapterBase;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.ads.util.ApsUtils;
import com.amazon.aps.ads.util.adview.ApsAdViewFetchUtils;
import com.amazon.aps.bidder.adapter.ApsBidder;
import com.amazon.aps.bidder.adapter.ApsBidderAdViewAdapter;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.ApsMetricsPerfEventModelBuilder;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBAdMRAIDBannerController;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.amazon.device.ads.WebResourceOptions;
import com.amazon.device.ads.WebResourceService;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsAdViewImpl extends ApsAdViewBase implements ApsWebBridgeListener, ApsAdWebViewClientListener {
    private final Context adViewContext;
    private final ApsAdListener apsAdListener;
    private final boolean localOnly;
    protected ApsAdViewWebBridge webBridge;
    private ApsAdWebViewSupportClientBase webClient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsAdViewImpl(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        this.localOnly = WebResourceOptions.isLocalSourcesOnly();
        this.apsAdListener = new ApsAdListener() { // from class: com.amazon.aps.ads.util.adview.ApsAdViewImpl$apsAdListener$1
            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onAdClicked(ApsAd apsAd) {
                ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
                DTBAdListener listener;
                WeakReference<View> viewWeakReference;
                e0.checkNotNullParameter(apsAd, "apsAd");
                ApsAdViewImpl adView = apsAd.getAdView();
                View view = (adView == null || (viewWeakReference = adView.getViewWeakReference()) == null) ? null : viewWeakReference.get();
                ApsAdViewImpl adView2 = apsAd.getAdView();
                if (adView2 == null || (mraidListenerAdapter = adView2.getMraidListenerAdapter()) == null || (listener = mraidListenerAdapter.getListener()) == null) {
                    return;
                }
                listener.onAdClicked(view);
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onAdClosed(ApsAd apsAd) {
                ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
                DTBAdListener listener;
                WeakReference<View> viewWeakReference;
                e0.checkNotNullParameter(apsAd, "apsAd");
                ApsAdViewImpl adView = apsAd.getAdView();
                View view = (adView == null || (viewWeakReference = adView.getViewWeakReference()) == null) ? null : viewWeakReference.get();
                ApsAdViewImpl adView2 = apsAd.getAdView();
                if (adView2 == null || (mraidListenerAdapter = adView2.getMraidListenerAdapter()) == null || (listener = mraidListenerAdapter.getListener()) == null) {
                    return;
                }
                listener.onAdClosed(view);
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onAdError(ApsAd apsAd) {
                e0.checkNotNullParameter(apsAd, "apsAd");
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onAdFailedToLoad(ApsAd apsAd) {
                ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
                DTBAdListener listener;
                WeakReference<View> viewWeakReference;
                e0.checkNotNullParameter(apsAd, "apsAd");
                ApsAdViewImpl adView = apsAd.getAdView();
                View view = (adView == null || (viewWeakReference = adView.getViewWeakReference()) == null) ? null : viewWeakReference.get();
                ApsAdViewImpl adView2 = apsAd.getAdView();
                if (adView2 == null || (mraidListenerAdapter = adView2.getMraidListenerAdapter()) == null || (listener = mraidListenerAdapter.getListener()) == null) {
                    return;
                }
                listener.onAdFailed(view);
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onAdLoaded(ApsAd apsAd) {
                ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
                DTBAdListener listener;
                WeakReference<View> viewWeakReference;
                e0.checkNotNullParameter(apsAd, "apsAd");
                ApsAdViewImpl adView = apsAd.getAdView();
                View view = (adView == null || (viewWeakReference = adView.getViewWeakReference()) == null) ? null : viewWeakReference.get();
                ApsAdViewImpl adView2 = apsAd.getAdView();
                if (adView2 == null || (mraidListenerAdapter = adView2.getMraidListenerAdapter()) == null || (listener = mraidListenerAdapter.getListener()) == null) {
                    return;
                }
                listener.onAdLoaded(view);
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onAdOpen(ApsAd apsAd) {
                ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
                DTBAdListener listener;
                WeakReference<View> viewWeakReference;
                e0.checkNotNullParameter(apsAd, "apsAd");
                ApsAdViewImpl adView = apsAd.getAdView();
                View view = (adView == null || (viewWeakReference = adView.getViewWeakReference()) == null) ? null : viewWeakReference.get();
                ApsAdViewImpl adView2 = apsAd.getAdView();
                if (adView2 == null || (mraidListenerAdapter = adView2.getMraidListenerAdapter()) == null || (listener = mraidListenerAdapter.getListener()) == null) {
                    return;
                }
                listener.onAdOpen(view);
            }

            @Override // com.amazon.aps.ads.listeners.ApsAdListener
            public void onImpressionFired(ApsAd apsAd) {
                ApsMetricsAdListenerAdapterBase mraidListenerAdapter;
                DTBAdListener listener;
                WeakReference<View> viewWeakReference;
                e0.checkNotNullParameter(apsAd, "apsAd");
                ApsUtils.Companion.fireAAXImpressionPixel(apsAd);
                ApsAdViewImpl adView = apsAd.getAdView();
                View view = (adView == null || (viewWeakReference = adView.getViewWeakReference()) == null) ? null : viewWeakReference.get();
                ApsAdViewImpl adView2 = apsAd.getAdView();
                if (adView2 == null || (mraidListenerAdapter = adView2.getMraidListenerAdapter()) == null || (listener = mraidListenerAdapter.getListener()) == null) {
                    return;
                }
                listener.onImpressionFired(view);
            }
        };
        this.adViewContext = context;
    }

    private final long handleClick(MotionEvent motionEvent, long j10) {
        if (j10 - this.timeClicked < 1000) {
            return this.timePressed;
        }
        if (j10 - this.timePressed >= 500) {
            return 0L;
        }
        this.timeClicked = j10;
        if (getMraidHandler() == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "Null controller instance onAdClick callback");
            return 0L;
        }
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        e0.checkNotNull(mraidHandler);
        mraidHandler.onAdClicked();
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initWebView$lambda$3(ApsAdViewImpl apsAdViewImpl, View view, MotionEvent motionEvent) {
        return apsAdViewImpl.detectAdClick(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadUrl$lambda$10$lambda$9(ApsAdViewImpl apsAdViewImpl, String str) {
        try {
            super.loadUrl(str);
        } catch (Exception e10) {
            ApsAdExtensionsKt.logEvent(apsAdViewImpl, APSEventSeverity.FATAL, APSEventType.EXCEPTION, a.b.k("WebView crash noticed during super.loadUrl method. URL:", str), e10);
        }
    }

    private final void passRenderingControlToBidderSDK(String str) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception e10) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "SDKB : Failed to pass rendering control to bidder SDK", e10);
                return;
            }
        } else {
            jSONObject = null;
        }
        ApsAd apsAdForBidderRendering = ApsAdUtils.getApsAdForBidderRendering(jSONObject, this);
        if (apsAdForBidderRendering == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "SDKB : Failed to create ApsAd for bidder Adapater");
            return;
        }
        Object adapterInstance = ApsBidder.getApsBidderInstance().getAdapterInstance(apsAdForBidderRendering.getBidder());
        if (adapterInstance != null) {
            ((ApsBidderAdViewAdapter) adapterInstance).loadAdView(AdRegistration.getContext(), apsAdForBidderRendering, this.apsAdListener);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    public void cleanup() {
        try {
            super.cleanup();
            removeJavascriptInterface("amzn_bridge");
            DtbOmSdkSessionManager omSdkManager = getOmSdkManager();
            if (omSdkManager != null) {
                omSdkManager.stopOmAdSession();
            }
            DTBAdMRAIDController mraidHandler = getMraidHandler();
            if (mraidHandler != null) {
                mraidHandler.cleanup();
            }
            setMraidHandler(null);
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error in ApsAdView cleanup", e10);
        }
    }

    public boolean detectAdClick(MotionEvent motionEvent) {
        if (isVideo() || motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        long jC = e2.c();
        if (action != 0) {
            jC = action != 1 ? this.timePressed : handleClick(motionEvent, jC);
        }
        this.timePressed = jC;
        return false;
    }

    @Override // com.amazon.aps.ads.util.adview.ApsWebBridgeListener
    public void evaluateApsJavascript(String str, ValueCallback<String> valueCallback) {
        if (str != null) {
            new Handler(Looper.getMainLooper()).post(new g(this, 3, str, valueCallback));
        }
    }

    public void fetchAd(String str, Map<String, ? extends Object> extra) {
        e0.checkNotNullParameter(extra, "extra");
        ApsAdViewFetchUtils.Companion.fetchAd(this, str, extra);
    }

    public final void fetchAdWithLocation(String str) {
        Context context = getContext();
        if (context != null) {
            ApsAdViewFetchUtils.Companion.fetchAdWithLocation(context, this, this.localOnly, str);
        }
    }

    public final void getAdInfo(String adhtml, Bundle adInfoBundle) {
        e0.checkNotNullParameter(adhtml, "adhtml");
        e0.checkNotNullParameter(adInfoBundle, "adInfoBundle");
        ApsAdViewFetchUtils.Companion.getAdInfo(adhtml, adInfoBundle);
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    public Context getAdViewContext() {
        return this.adViewContext;
    }

    public final ApsAdListener getApsAdListener() {
        return this.apsAdListener;
    }

    @Override // com.amazon.aps.ads.util.adview.ApsWebBridgeListener
    public DTBAdMRAIDController getApsMraidHandler() {
        return getMraidHandler();
    }

    public final boolean getLocalOnly() {
        return this.localOnly;
    }

    public final ApsAdWebViewSupportClientBase getWebClient() {
        return this.webClient;
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    public void initWebView() {
        super.initWebView();
        ApsAdWebViewSupportClientBase apsAdWebViewSupportClient = new ApsAdWebViewSupportClient(this);
        setWebViewClient(apsAdWebViewSupportClient);
        setWebClient(apsAdWebViewSupportClient);
        setAdViewScrollEnabled(false);
        ApsAdViewWebBridge apsAdViewWebBridge = new ApsAdViewWebBridge(this);
        this.webBridge = apsAdViewWebBridge;
        addJavascriptInterface(apsAdViewWebBridge, "amzn_bridge");
        WebResourceService.init();
        initLayoutListeners();
        setOnTouchListener(new b(this, 0));
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    public boolean isTwoPartExpand() {
        if (getMraidHandler() == null) {
            return false;
        }
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        e0.checkNotNull(mraidHandler, "null cannot be cast to non-null type com.amazon.device.ads.DTBAdMRAIDController");
        return mraidHandler.isTwoPartExpand();
    }

    public final void loadLocalFile(String filename, StringBuilder sb2) {
        e0.checkNotNullParameter(filename, "filename");
        e0.checkNotNullParameter(sb2, "sb");
        ApsAdViewFetchUtils.Companion companion = ApsAdViewFetchUtils.Companion;
        Context context = getContext();
        e0.checkNotNullExpressionValue(context, "getContext(...)");
        companion.loadLocalFile(context, this.localOnly, filename, sb2);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String url) {
        e0.checkNotNullParameter(url, "url");
        try {
            ApsAdWebViewSupportClientBase apsAdWebViewSupportClientBase = this.webClient;
            if (apsAdWebViewSupportClientBase != null) {
                if (!apsAdWebViewSupportClientBase.isCrashed()) {
                    new Handler(Looper.getMainLooper()).post(new n(14, this, url));
                    return;
                }
                ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.LOG, "WebView is corrupted. loadUrl method will not be executed. URL:" + url);
            }
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to execute loadUrl method", e10);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    public void onAdLeftApplication() {
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.onAdLeftApplication();
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    public void onAdOpened() {
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.onAdOpened();
        }
    }

    public final void onAdRemoved() {
        if (getMraidHandler() == null) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.LOG, "Null controller instance onAdRemoved");
            return;
        }
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        e0.checkNotNull(mraidHandler);
        mraidHandler.onAdRemoved();
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    public void onCrash(WebView webView, StringBuilder errorInfo, String errorDetail) {
        DtbOmSdkSessionManager omSdkManager;
        e0.checkNotNullParameter(webView, "webView");
        e0.checkNotNullParameter(errorInfo, "errorInfo");
        e0.checkNotNullParameter(errorDetail, "errorDetail");
        try {
            if (webView instanceof DTBAdView) {
                String userAgentString = ((DTBAdView) webView).getSettings().getUserAgentString();
                if (userAgentString != null) {
                    String str = String.format("webViewUserAgentInfo = %s;", Arrays.copyOf(new Object[]{userAgentString}, 1));
                    e0.checkNotNullExpressionValue(str, "format(...)");
                    errorInfo.append(str);
                }
                if (getBidId() != null) {
                    String str2 = String.format("webViewBidId = %s;", Arrays.copyOf(new Object[]{getBidId()}, 1));
                    e0.checkNotNullExpressionValue(str2, "format(...)");
                    errorInfo.append(str2);
                }
                onAdRemoved();
                if (getMraidHandler() != null && (omSdkManager = getOmSdkManager()) != null) {
                    omSdkManager.stopOmAdSession();
                }
                ViewParent parent = ((DTBAdView) webView).getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this);
                }
                DTBAdMRAIDController mraidHandler = getMraidHandler();
                if (mraidHandler != null) {
                    mraidHandler.onLoadError();
                    cleanup();
                }
                webView.removeAllViews();
            }
            String strSubstring = errorDetail.substring(0, Math.min(100, errorDetail.length()));
            e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String str3 = String.format("webViewErrorDetail = %s", Arrays.copyOf(new Object[]{strSubstring}, 1));
            e0.checkNotNullExpressionValue(str3, "format(...)");
            errorInfo.append(str3);
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, errorInfo.toString());
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, errorInfo.toString(), e10);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    public void onExposureChange(int i10, Rect adViewRect) {
        e0.checkNotNullParameter(adViewRect, "adViewRect");
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.fireExposureChange(i10, adViewRect);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    public void onLoadError() {
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.onLoadError();
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    public void onPageFinished(String url, WebView webView) {
        DtbOmSdkSessionManager omSdkManager;
        e0.checkNotNullParameter(url, "url");
        try {
            ApsAdExtensionsKt.d(this, "Page finished:" + url);
            if (webView instanceof DTBAdView) {
                if (n0.contains$default((CharSequence) url, (CharSequence) "MRAID_ENV", false, 2, (Object) null)) {
                    onPageLoaded();
                    return;
                }
                if (url.equals("https://c.amazon-adsystem.com/")) {
                    if ((getMraidHandler() instanceof DTBAdMRAIDBannerController) && (omSdkManager = getOmSdkManager()) != null) {
                        omSdkManager.stopOmAdSession();
                        if (isVideo()) {
                            omSdkManager.initJavaScriptOmAdSession(this, url);
                        } else {
                            omSdkManager.initHtmlDisplayOmAdSession(this, url);
                        }
                        omSdkManager.registerAdView(this);
                        omSdkManager.startAdSession();
                        if (!isVideo()) {
                            omSdkManager.displayAdEventLoaded();
                        }
                    }
                    onPageLoaded();
                }
            }
        } catch (RuntimeException e10) {
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onPageFinished method", e10);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdWebViewClientListener
    public void onPageLoaded() {
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.onPageLoad();
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    public void onPositionChanged(Rect adViewRect) {
        e0.checkNotNullParameter(adViewRect, "adViewRect");
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.onPositionChanged(adViewRect);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    public void onViewabilityChanged(boolean z10) {
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.onViewabilityChanged(z10);
        }
    }

    @Override // com.amazon.aps.ads.util.adview.ApsAdViewBase
    public void setCurrentPositionProperty() {
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            mraidHandler.setCurrentPositionProperty();
        }
    }

    public final void setIgnoreDetachment() {
        this.ignoreDetachment = true;
    }

    public final void setWebClient(ApsAdWebViewSupportClientBase apsAdWebViewSupportClientBase) {
        if (apsAdWebViewSupportClientBase != null) {
            this.webClient = apsAdWebViewSupportClientBase;
            setWebViewClient(apsAdWebViewSupportClientBase);
        }
    }

    public void fetchAd(Map<String, ? extends Object> map) {
        e0.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String?, kotlin.Any>");
        fetchAd((String) null, map);
    }

    public void fetchAd(String str) {
        fetchAd(str, (Bundle) null);
    }

    public void fetchAd(Bundle bundle) {
        fetchAd((String) null, bundle);
    }

    public final void fetchAd(String str, Bundle bundle) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (ApsUtils.Companion.isNullOrEmpty(str)) {
            str = null;
            if (bundle != null) {
                str = bundle.getString("bid_html_template", null);
            }
        }
        if (ApsAdUtils.sdkRenderingBridgeEnabled(str)) {
            passRenderingControlToBidderSDK(str);
            ApsLog.d("Ad Rendered by Bidder SDK");
            return;
        }
        DTBAdMRAIDController mraidHandler = getMraidHandler();
        if (mraidHandler != null) {
            ApsAdViewFetchUtils.Companion companion = ApsAdViewFetchUtils.Companion;
            Bundle bundleForFetchAd = companion.getBundleForFetchAd(mraidHandler, str, bundle);
            if (bundleForFetchAd != null) {
                setBidId(bundleForFetchAd.getString("bid_identifier"));
                setHostname(bundleForFetchAd.getString("hostname_identifier"));
                setVideo(bundleForFetchAd.getBoolean("video_flag"));
            }
            setStartTime(new Date().getTime());
            companion.fetchAd(this, mraidHandler, str, bundle);
        }
        ApsMetrics.Companion.adEvent(getBidId(), new ApsMetricsPerfEventModelBuilder().withBidId(getBidId()).withAdFetchStartTime(jCurrentTimeMillis));
    }
}
