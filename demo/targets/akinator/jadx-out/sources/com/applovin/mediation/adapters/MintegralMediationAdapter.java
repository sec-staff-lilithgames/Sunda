package com.applovin.mediation.adapters;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.mintegral.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.Y1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.mbbid.out.BidConstants;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBBidNativeHandler;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoListener;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import com.mbridge.msdk.widget.MBAdChoice;
import cv.BLca.YsiBvdpw;
import e3.g;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class MintegralMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxAppOpenAdapter, MaxRewardedAdapter, MaxAdViewAdapter, MaxSignalProvider, MaxNativeAdAdapter {
    private static final String APP_ID_PARAMETER = "app_id";
    private static final String APP_KEY_PARAMETER = "app_key";
    private static final String BAD_REQUEST = "request parameter is null";
    private static final int DEFAULT_IMAGE_TASK_TIMEOUT_SECONDS = 5;
    private static final String EXCEPTION_APP_ID_EMPTY = "EXCEPTION_APP_ID_EMPTY";
    private static final String EXCEPTION_APP_NOT_FOUND = "EXCEPTION_APP_NOT_FOUND";
    private static final String EXCEPTION_IV_RECALLNET_INVALIDATE = "EXCEPTION_IV_RECALLNET_INVALIDATE";
    private static final String EXCEPTION_RETURN_EMPTY = "EXCEPTION_RETURN_EMPTY";
    private static final String EXCEPTION_SIGN_ERROR = "EXCEPTION_SIGN_ERROR";
    private static final String EXCEPTION_TIMEOUT = "EXCEPTION_TIMEOUT";
    private static final String EXCEPTION_UNIT_ADTYPE_ERROR = "EXCEPTION_UNIT_ADTYPE_ERROR";
    private static final String EXCEPTION_UNIT_ID_EMPTY = "EXCEPTION_UNIT_ID_EMPTY";
    private static final String EXCEPTION_UNIT_NOT_FOUND = "EXCEPTION_UNIT_NOT_FOUND";
    private static final String EXCEPTION_UNIT_NOT_FOUND_IN_APP = "EXCEPTION_UNIT_NOT_FOUND_IN_APP";
    private static final String NETWORK_ERROR = "network exception";
    private static final String NETWORK_IO_ERROR = "Network error,I/O exception";
    private static final String NOT_INITIALIZED = "init error";
    private static final String NO_FILL_1 = "no ads available can show";
    private static final String NO_FILL_2 = "no ads available";
    private static final String NO_FILL_3 = "no server ads available";
    private static final String NO_FILL_4 = "no ads source";
    private static final String NO_FILL_5 = "load no ad";
    private static final String TIMEOUT = "load timeout";
    private static final String UNIT_ID_EMPTY = "UnitId is null";
    private static String sSdkVersion;
    private static MaxAdapter.InitializationStatus status;
    private List<View> clickableViews;
    private MBBannerView mbBannerView;
    private MBBidNewInterstitialHandler mbBidInterstitialVideoHandler;
    private MBBidNativeHandler mbBidNativeAdViewHandler;
    private MBBidNativeHandler mbBidNativeHandler;
    private MBBidRewardVideoHandler mbBidRewardVideoHandler;
    private MBNewInterstitialHandler mbInterstitialVideoHandler;
    private MBRewardVideoHandler mbRewardVideoHandler;
    private MBSplashHandler mbSplashHandler;
    private String mbUnitId;
    private MaxNativeAd nativeAd;
    private Campaign nativeAdCampaign;
    private ViewGroup nativeAdContainer;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static final ExecutorService executor = Executors.newCachedThreadPool();
    private static final Map<String, MBNewInterstitialHandler> mbInterstitialVideoHandlers = new HashMap();
    private static final Map<String, MBBidNewInterstitialHandler> mbBidInterstitialVideoHandlers = new HashMap();
    private static final Map<String, MBRewardVideoHandler> mbRewardVideoHandlers = new HashMap();
    private static final Map<String, MBBidRewardVideoHandler> mbBidRewardVideoHandlers = new HashMap();
    private static final MintegralMediationAdapterRouter router = (MintegralMediationAdapterRouter) MediationAdapterRouter.getSharedInstance(MintegralMediationAdapterRouter.class);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class AppOpenAdListener implements MBSplashLoadListener, MBSplashShowListener {
        private final MaxAppOpenAdapterListener listener;

        @Override // com.mbridge.msdk.out.MBSplashLoadListener
        public void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z10) {
            MintegralMediationAdapter.this.log("App open ad supports zoom out: " + z10);
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public void onAdClicked(MBridgeIds mBridgeIds) {
            MintegralMediationAdapter.this.log("App open ad clicked");
            this.listener.onAppOpenAdClicked();
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public void onAdTick(MBridgeIds mBridgeIds, long j10) {
            MintegralMediationAdapter.this.log("App open ad ticked with " + j10 + " ms remaining");
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public void onDismiss(MBridgeIds mBridgeIds, int i10) {
            MintegralMediationAdapter.this.log("App open ad hidden");
            this.listener.onAppOpenAdHidden();
        }

        @Override // com.mbridge.msdk.out.MBSplashLoadListener
        public void onLoadFailed(MBridgeIds mBridgeIds, String str, int i10) {
            MaxAdapterError maxError = MintegralMediationAdapter.toMaxError(str);
            MintegralMediationAdapter.this.log("App open ad failed to load: " + maxError);
            this.listener.onAppOpenAdLoadFailed(maxError);
        }

        @Override // com.mbridge.msdk.out.MBSplashLoadListener
        public void onLoadSuccessed(MBridgeIds mBridgeIds, int i10) {
            MintegralMediationAdapter.this.log("App open ad loaded for: " + mBridgeIds);
            String creativeIdWithUnitId = MintegralMediationAdapter.this.mbSplashHandler.getCreativeIdWithUnitId();
            this.listener.onAppOpenAdLoaded(AppLovinSdkUtils.isValidString(creativeIdWithUnitId) ? e2.d(1, CampaignEx.JSON_KEY_CREATIVE_ID, creativeIdWithUnitId) : null);
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public void onShowFailed(MBridgeIds mBridgeIds, String str) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, str);
            MintegralMediationAdapter.this.log("App open ad failed to show: " + maxAdapterError);
            this.listener.onAppOpenAdDisplayFailed(maxAdapterError);
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public void onShowSuccessed(MBridgeIds mBridgeIds) {
            MintegralMediationAdapter.this.log("App open ad displayed");
            this.listener.onAppOpenAdDisplayed();
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public void onZoomOutPlayFinish(MBridgeIds mBridgeIds) {
            MintegralMediationAdapter.this.log("App open ad zoom out finished");
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public void onZoomOutPlayStart(MBridgeIds mBridgeIds) {
            MintegralMediationAdapter.this.log("App open ad zoom out started");
        }

        private AppOpenAdListener(MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
            this.listener = maxAppOpenAdapterListener;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class MaxMintegralNativeAd extends MaxNativeAd {
        public MaxMintegralNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            Campaign campaign = MintegralMediationAdapter.this.nativeAdCampaign;
            if (campaign == null) {
                MintegralMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            MintegralMediationAdapter.this.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
            if (getFormat() == MaxAdFormat.NATIVE) {
                if (MintegralMediationAdapter.this.mbBidNativeHandler != null) {
                    MintegralMediationAdapter.this.mbBidNativeHandler.registerView(viewGroup, list, campaign);
                } else {
                    MintegralMediationAdapter.this.e("Failed to register native ad views: mbBidNativeHandler is null.");
                }
            } else if (MintegralMediationAdapter.this.mbBidNativeAdViewHandler != null) {
                MintegralMediationAdapter.this.mbBidNativeAdViewHandler.registerView(viewGroup, list, campaign);
            } else {
                MintegralMediationAdapter.this.e("Failed to register native ad views: mbBidNativeAdViewHandler is null.");
            }
            MintegralMediationAdapter.this.nativeAdContainer = viewGroup;
            MintegralMediationAdapter.this.clickableViews = list;
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class NativeAdListener implements NativeListener.NativeAdListener, OnMBMediaViewListener {
        private final Context context;
        private final MaxNativeAdAdapterListener listener;
        private final MaxAdapterResponseParameters parameters;
        private final String placementId;
        private final String unitId;

        public NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.parameters = maxAdapterResponseParameters;
            this.context = context;
            this.listener = maxNativeAdAdapterListener;
            this.unitId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.placementId = BundleUtils.getString("placement_id", maxAdapterResponseParameters.getServerParameters());
        }

        private void processNativeAd(final Campaign campaign) {
            MintegralMediationAdapter.this.getCachingExecutorService().submit(new Runnable() { // from class: com.applovin.mediation.adapters.MintegralMediationAdapter.NativeAdListener.1
                @Override // java.lang.Runnable
                public void run() {
                    String iconUrl = campaign.getIconUrl();
                    String imageUrl = campaign.getImageUrl();
                    NativeAdListener nativeAdListener = NativeAdListener.this;
                    Future<Drawable> futureCreateDrawableFuture = MintegralMediationAdapter.this.createDrawableFuture(iconUrl, nativeAdListener.context.getResources());
                    final MaxNativeAd.MaxNativeAdImage maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(Uri.parse(imageUrl));
                    final MaxNativeAd.MaxNativeAdImage maxNativeAdImage2 = null;
                    try {
                        Drawable drawable = futureCreateDrawableFuture.get(BundleUtils.getInt("image_task_timeout_seconds", 5, NativeAdListener.this.parameters.getServerParameters()), TimeUnit.SECONDS);
                        if (drawable != null) {
                            maxNativeAdImage2 = new MaxNativeAd.MaxNativeAdImage(drawable);
                        }
                    } catch (Throwable th2) {
                        MintegralMediationAdapter.this.log("Failed to fetch icon image from URL: " + iconUrl, th2);
                    }
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.MintegralMediationAdapter.NativeAdListener.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MBMediaView mBMediaView = new MBMediaView(NativeAdListener.this.context);
                            mBMediaView.setNativeAd(campaign);
                            mBMediaView.setOnMediaViewListener(NativeAdListener.this);
                            MBAdChoice mBAdChoice = new MBAdChoice(NativeAdListener.this.context);
                            mBAdChoice.setCampaign(campaign);
                            MaxNativeAd.Builder starRating = new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(campaign.getAppName()).setBody(campaign.getAppDesc()).setCallToAction(campaign.getAdCall()).setIcon(maxNativeAdImage2).setOptionsView(mBAdChoice).setMediaView(mBMediaView).setMainImage(maxNativeAdImage).setStarRating(Double.valueOf(campaign.getRating()));
                            MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
                            mintegralMediationAdapter.nativeAd = mintegralMediationAdapter.new MaxMintegralNativeAd(starRating);
                            NativeAdListener.this.listener.onNativeAdLoaded(MintegralMediationAdapter.this.nativeAd, null);
                        }
                    });
                }
            });
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public void onAdClick(Campaign campaign) {
            MintegralMediationAdapter.this.log("Native ad clicked for unit id: " + this.unitId + " placement id: " + this.placementId);
            this.listener.onNativeAdClicked();
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public void onAdFramesLoaded(List<Frame> list) {
            MintegralMediationAdapter.this.log("Native ad frames loaded for unit id: " + this.unitId + " placement id: " + this.placementId);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public void onAdLoadError(String str) {
            MaxAdapterError maxError = MintegralMediationAdapter.toMaxError(str);
            MintegralMediationAdapter.this.log("Native ad failed to load for unit id: " + this.unitId + " placement id: " + this.placementId + " with error: " + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public void onAdLoaded(List<Campaign> list, int i10) {
            if (list == null || list.isEmpty()) {
                MintegralMediationAdapter.this.log("Native ad failed to load for unit id: " + this.unitId + " placement id: " + this.placementId + " with error: no fill");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            Campaign campaign = list.get(0);
            if (AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.parameters.getServerParameters())) && TextUtils.isEmpty(campaign.getAppName())) {
                MintegralMediationAdapter.this.log("Native ad failed to load for unit id: " + this.unitId + " placement id: " + this.placementId + " with error: missing required assets");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            MintegralMediationAdapter.this.nativeAdCampaign = campaign;
            MintegralMediationAdapter.this.log("Native ad loaded for unit id: " + this.unitId + " placement id: " + this.placementId);
            processNativeAd(campaign);
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onEnterFullscreen() {
            MintegralMediationAdapter.this.log("Media view entered fullscreen");
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onExitFullscreen() {
            MintegralMediationAdapter.this.log("Media view exited fullscreen");
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onFinishRedirection(Campaign campaign, String str) {
            MintegralMediationAdapter.this.log("Media view finished redirection with url: " + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public void onLoggingImpression(int i10) {
            MintegralMediationAdapter.this.log("Native ad shown for unit id: " + this.unitId + " placement id: " + this.placementId);
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            MintegralMediationAdapter.this.log("Media view redirection failed with url: " + str);
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onStartRedirection(Campaign campaign, String str) {
            MintegralMediationAdapter.this.log("Media view started redirection with url: " + str);
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onVideoAdClicked(Campaign campaign) {
            MintegralMediationAdapter.this.log("Media view clicked for unit id: " + this.unitId + " placement id: " + this.placementId);
            this.listener.onNativeAdClicked();
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onVideoStart() {
            MintegralMediationAdapter.this.log("Media view video started");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class NativeAdViewListener implements NativeListener.NativeAdListener, OnMBMediaViewListener {
        private final MaxAdFormat adFormat;
        private final Context context;
        private final MaxAdViewAdapterListener listener;
        private final String placementId;
        private final Bundle serverParameters;
        private final String unitId;

        public NativeAdViewListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Context context, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.adFormat = maxAdFormat;
            this.context = context;
            this.listener = maxAdViewAdapterListener;
            this.unitId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.placementId = BundleUtils.getString("placement_id", maxAdapterResponseParameters.getServerParameters());
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public void onAdClick(Campaign campaign) {
            MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder("Native ");
            e2.w(this.adFormat, sb2, " ad clicked for unit id: ");
            sb2.append(this.unitId);
            sb2.append(" placement id: ");
            sb2.append(this.placementId);
            mintegralMediationAdapter.log(sb2.toString());
            this.listener.onAdViewAdClicked();
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public void onAdFramesLoaded(List<Frame> list) {
            MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder("Native ");
            e2.w(this.adFormat, sb2, " ad frames loaded for unit id: ");
            sb2.append(this.unitId);
            sb2.append(" placement id: ");
            sb2.append(this.placementId);
            mintegralMediationAdapter.log(sb2.toString());
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public void onAdLoadError(String str) {
            MaxAdapterError maxError = MintegralMediationAdapter.toMaxError(str);
            MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder("Native ");
            e2.w(this.adFormat, sb2, " ad failed to load for unit id: ");
            sb2.append(this.unitId);
            sb2.append(" placement id: ");
            sb2.append(this.placementId);
            sb2.append(" with error: ");
            sb2.append(maxError);
            mintegralMediationAdapter.log(sb2.toString());
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public void onAdLoaded(List<Campaign> list, int i10) {
            if (list == null || list.isEmpty()) {
                MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
                StringBuilder sb2 = new StringBuilder("Native ");
                e2.w(this.adFormat, sb2, " ad failed to load for unit id: ");
                sb2.append(this.unitId);
                sb2.append(" placement id: ");
                sb2.append(this.placementId);
                sb2.append(" with error: no fill");
                mintegralMediationAdapter.log(sb2.toString());
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            final Campaign campaign = list.get(0);
            if (TextUtils.isEmpty(campaign.getAppName())) {
                MintegralMediationAdapter mintegralMediationAdapter2 = MintegralMediationAdapter.this;
                StringBuilder sb3 = new StringBuilder("Native ");
                e2.w(this.adFormat, sb3, " ad failed to load for unit id: ");
                sb3.append(this.unitId);
                sb3.append(" placement id: ");
                sb3.append(this.placementId);
                sb3.append(" with error: missing required assets");
                mintegralMediationAdapter2.log(sb3.toString());
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            MintegralMediationAdapter.this.nativeAdCampaign = campaign;
            MintegralMediationAdapter mintegralMediationAdapter3 = MintegralMediationAdapter.this;
            StringBuilder sb4 = new StringBuilder("Native ");
            e2.w(this.adFormat, sb4, " ad loaded for unit id: ");
            sb4.append(this.unitId);
            sb4.append(" placement id: ");
            sb4.append(this.placementId);
            mintegralMediationAdapter3.log(sb4.toString());
            MintegralMediationAdapter.this.getCachingExecutorService().submit(new Runnable() { // from class: com.applovin.mediation.adapters.MintegralMediationAdapter.NativeAdViewListener.1
                @Override // java.lang.Runnable
                public void run() {
                    String iconUrl = campaign.getIconUrl();
                    String imageUrl = campaign.getImageUrl();
                    NativeAdViewListener nativeAdViewListener = NativeAdViewListener.this;
                    Future<Drawable> futureCreateDrawableFuture = MintegralMediationAdapter.this.createDrawableFuture(iconUrl, nativeAdViewListener.context.getResources());
                    new MaxNativeAd.MaxNativeAdImage(Uri.parse(imageUrl));
                    final MaxNativeAd.MaxNativeAdImage maxNativeAdImage = null;
                    try {
                        Drawable drawable = futureCreateDrawableFuture.get(BundleUtils.getInt("image_task_timeout_seconds", 5, NativeAdViewListener.this.serverParameters), TimeUnit.SECONDS);
                        if (drawable != null) {
                            maxNativeAdImage = new MaxNativeAd.MaxNativeAdImage(drawable);
                        }
                    } catch (Throwable th2) {
                        MintegralMediationAdapter.this.log("Failed to fetch icon image from URL: " + iconUrl, th2);
                    }
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.MintegralMediationAdapter.NativeAdViewListener.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MBMediaView mBMediaView = new MBMediaView(NativeAdViewListener.this.context);
                            mBMediaView.setNativeAd(campaign);
                            mBMediaView.setOnMediaViewListener(NativeAdViewListener.this);
                            MBAdChoice mBAdChoice = new MBAdChoice(NativeAdViewListener.this.context);
                            mBAdChoice.setCampaign(campaign);
                            MaxNativeAd.Builder mediaView = new MaxNativeAd.Builder().setAdFormat(NativeAdViewListener.this.adFormat).setTitle(campaign.getAppName()).setBody(campaign.getAppDesc()).setCallToAction(campaign.getAdCall()).setIcon(maxNativeAdImage).setOptionsView(mBAdChoice).setMediaView(mBMediaView);
                            MintegralMediationAdapter mintegralMediationAdapter4 = MintegralMediationAdapter.this;
                            mintegralMediationAdapter4.nativeAd = mintegralMediationAdapter4.new MaxMintegralNativeAd(mediaView);
                            String string = BundleUtils.getString("template", "", NativeAdViewListener.this.serverParameters);
                            MintegralMediationAdapter mintegralMediationAdapter5 = MintegralMediationAdapter.this;
                            MaxNativeAdView maxNativeAdViewCreateMaxNativeAdViewWithNativeAd = mintegralMediationAdapter5.createMaxNativeAdViewWithNativeAd(mintegralMediationAdapter5.nativeAd, string, NativeAdViewListener.this.context);
                            MintegralMediationAdapter.this.nativeAd.prepareForInteraction(MintegralMediationAdapter.this.getClickableViews(maxNativeAdViewCreateMaxNativeAdViewWithNativeAd), maxNativeAdViewCreateMaxNativeAdViewWithNativeAd);
                            NativeAdViewListener.this.listener.onAdViewAdLoaded(maxNativeAdViewCreateMaxNativeAdViewWithNativeAd);
                        }
                    });
                }
            });
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onEnterFullscreen() {
            MintegralMediationAdapter.this.log("Media view entered fullscreen");
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onExitFullscreen() {
            MintegralMediationAdapter.this.log("Media view exited fullscreen");
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onFinishRedirection(Campaign campaign, String str) {
            MintegralMediationAdapter.this.log("Media view finished redirection with url: " + str);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public void onLoggingImpression(int i10) {
            MintegralMediationAdapter mintegralMediationAdapter = MintegralMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder("Native ");
            e2.w(this.adFormat, sb2, " ad shown for unit id: ");
            sb2.append(this.unitId);
            sb2.append(" placement id: ");
            sb2.append(this.placementId);
            mintegralMediationAdapter.log(sb2.toString());
            this.listener.onAdViewAdDisplayed(null);
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            MintegralMediationAdapter.this.log("Media view redirection failed with url: " + str);
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onStartRedirection(Campaign campaign, String str) {
            MintegralMediationAdapter.this.log("Media view started redirection with url: " + str);
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onVideoAdClicked(Campaign campaign) {
            MintegralMediationAdapter.this.log("Media view clicked for unit id: " + this.unitId + " placement id: " + this.placementId);
            this.listener.onAdViewAdClicked();
        }

        @Override // com.mbridge.msdk.out.OnMBMediaViewListener
        public void onVideoStart() {
            MintegralMediationAdapter.this.log("Media view video started");
        }
    }

    public MintegralMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<View> getClickableViews(MaxNativeAdView maxNativeAdView) {
        return maxNativeAdView.getClickableViews();
    }

    private Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private void setChannelCode() {
        try {
            Method declaredMethod = Aa.class.getDeclaredMethod(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(Aa.class, "Y+H6DFttYrPQYcI9+F2F+F5/Hv==");
        } catch (Throwable th2) {
            e("Failed to set channel code", th2);
        }
    }

    private boolean shouldUpdateMuteState(Bundle bundle) {
        return bundle.containsKey("is_muted") && bundle.getBoolean("is_muted");
    }

    private BannerSize toBannerSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER) {
            return new BannerSize(3, 0, 0);
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return new BannerSize(2, 0, 0);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(String str) {
        return new MaxAdapterError((NOT_INITIALIZED.equals(str) || str.contains(EXCEPTION_IV_RECALLNET_INVALIDATE)) ? MaxAdapterError.NOT_INITIALIZED : (str.contains(NO_FILL_1) || str.contains(NO_FILL_2) || str.contains(NO_FILL_3) || str.contains(NO_FILL_4) || str.contains(NO_FILL_5) || str.contains(EXCEPTION_RETURN_EMPTY)) ? MaxAdapterError.NO_FILL : (NETWORK_ERROR.equalsIgnoreCase(str) || str.contains(NETWORK_IO_ERROR)) ? MaxAdapterError.NO_CONNECTION : BAD_REQUEST.equalsIgnoreCase(str) ? MaxAdapterError.BAD_REQUEST : (TIMEOUT.equalsIgnoreCase(str) || str.contains(EXCEPTION_TIMEOUT)) ? MaxAdapterError.TIMEOUT : (str.contains(EXCEPTION_SIGN_ERROR) || str.contains(EXCEPTION_UNIT_NOT_FOUND) || str.contains(EXCEPTION_UNIT_ID_EMPTY) || str.contains(EXCEPTION_UNIT_NOT_FOUND_IN_APP) || str.contains(EXCEPTION_UNIT_ADTYPE_ERROR) || str.contains(EXCEPTION_APP_ID_EMPTY) || str.contains(EXCEPTION_APP_NOT_FOUND) || str.contains(UNIT_ID_EMPTY)) ? MaxAdapterError.INVALID_CONFIGURATION : MaxAdapterError.UNSPECIFIED, 0, str);
    }

    private static String toMintegralAdType(MaxAdFormat maxAdFormat) {
        return maxAdFormat == MaxAdFormat.INTERSTITIAL ? BidConstants.BID_FILTER_VALUE_AD_TYPE_INTERSTITIAL_VIDEO : maxAdFormat == MaxAdFormat.REWARDED ? BidConstants.BID_FILTER_VALUE_AD_TYPE_REWARD_VIDEO : maxAdFormat == MaxAdFormat.APP_OPEN ? BidConstants.BID_FILTER_VALUE_AD_TYPE_SPLASH : (maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER || maxAdFormat == MaxAdFormat.MREC) ? BidConstants.BID_FILTER_VALUE_AD_TYPE_BANNER : maxAdFormat == MaxAdFormat.NATIVE ? BidConstants.BID_FILTER_VALUE_AD_TYPE_NATIVE : Y1.f35726f;
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        String buyerUid;
        log("Collecting signal...");
        String adUnitId = maxAdapterSignalCollectionParameters.getAdUnitId();
        if (AppLovinSdkUtils.isValidString(adUnitId)) {
            Bundle bundle = Bundle.EMPTY;
            Bundle bundle2 = BundleUtils.getBundle(adUnitId, bundle, BundleUtils.getBundle("credentials", bundle, maxAdapterSignalCollectionParameters.getServerParameters()));
            HashMap map = new HashMap(3);
            map.put(BidConstants.BID_FILTER_KEY_PLACEMENT_ID, BundleUtils.getString("placement_id", "", bundle2));
            map.put(BidConstants.BID_FILTER_KEY_UNIT_ID, BundleUtils.getString("ad_unit_id", "", bundle2));
            map.put(BidConstants.BID_FILTER_KEY_AD_TYPE, toMintegralAdType(maxAdapterSignalCollectionParameters.getAdFormat()));
            buyerUid = BidManager.getBuyerUid(getContext(activity), map);
        } else {
            buyerUid = BidManager.getBuyerUid(getContext(activity));
        }
        maxSignalCollectionListener.onSignalCollected(buyerUid);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        if (sSdkVersion == null) {
            sSdkVersion = getVersionString(MBConfiguration.class, "SDK_VERSION");
        }
        return sSdkVersion;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        MBridgeConstans.DEBUG = maxAdapterInitializationParameters.isTesting();
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        status = MaxAdapter.InitializationStatus.INITIALIZING;
        setChannelCode();
        String string = maxAdapterInitializationParameters.getServerParameters().getString("app_id");
        String string2 = maxAdapterInitializationParameters.getServerParameters().getString("app_key");
        log(g.l("Initializing Mintegral SDK with app id: ", string, " and app key: ", string2, APSSharedUtil.TRUNCATE_SEPARATOR));
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        Context context = getContext(activity);
        Boolean boolHasUserConsent = maxAdapterInitializationParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            mBridgeSDK.setConsentStatus(context, boolHasUserConsent.booleanValue() ? 1 : 0);
        } else {
            mBridgeSDK.setConsentStatus(context);
        }
        Boolean boolIsDoNotSell = maxAdapterInitializationParameters.isDoNotSell();
        if (boolIsDoNotSell != null && boolIsDoNotSell.booleanValue()) {
            mBridgeSDK.setDoNotTrackStatus(context, true);
        }
        mBridgeSDK.init(mBridgeSDK.getMBConfigurationMap(string, string2), (Application) context, new SDKInitStatusListener() { // from class: com.applovin.mediation.adapters.MintegralMediationAdapter.1
            @Override // com.mbridge.msdk.out.SDKInitStatusListener
            public void onInitFail(String str) {
                MintegralMediationAdapter.this.log("SDK failed to initialize with message: " + str);
                MaxAdapter.InitializationStatus unused = MintegralMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                onCompletionListener.onCompletion(MintegralMediationAdapter.status, str);
            }

            @Override // com.mbridge.msdk.out.SDKInitStatusListener
            public void onInitSuccess() {
                MintegralMediationAdapter.this.log("SDK initialization successful");
                MaxAdapter.InitializationStatus unused = MintegralMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                onCompletionListener.onCompletion(MintegralMediationAdapter.status, null);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) throws NoSuchAlgorithmException {
        this.mbUnitId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String string = BundleUtils.getString("placement_id", maxAdapterResponseParameters.getServerParameters());
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb2 = new StringBuilder("Loading");
        sb2.append(z10 ? " native " : " ");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" AdView ad for placement: ");
        sb2.append(string);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        if (z10) {
            Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string, this.mbUnitId);
            nativeProperties.put("ad_num", 1);
            nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
            NativeAdViewListener nativeAdViewListener = new NativeAdViewListener(maxAdapterResponseParameters, maxAdFormat, getContext(activity), maxAdViewAdapterListener);
            MBBidNativeHandler mBBidNativeHandler = new MBBidNativeHandler(nativeProperties, getContext(activity));
            this.mbBidNativeAdViewHandler = mBBidNativeHandler;
            mBBidNativeHandler.setAdListener(nativeAdViewListener);
            this.mbBidNativeAdViewHandler.bidLoad(maxAdapterResponseParameters.getBidResponse());
            return;
        }
        MBBannerView mBBannerView = new MBBannerView(getContext(activity));
        this.mbBannerView = mBBannerView;
        mBBannerView.init(toBannerSize(maxAdFormat), string, this.mbUnitId);
        this.mbBannerView.setAllowShowCloseBtn(false);
        this.mbBannerView.setRefreshTime(0);
        this.mbBannerView.setBannerAdListener(new BannerAdListener() { // from class: com.applovin.mediation.adapters.MintegralMediationAdapter.2
            @Override // com.mbridge.msdk.out.BannerAdListener
            public void closeFullScreen(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad collapsed");
                maxAdViewAdapterListener.onAdViewAdCollapsed();
            }

            @Override // com.mbridge.msdk.out.BannerAdListener
            public void onClick(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad clicked");
                maxAdViewAdapterListener.onAdViewAdClicked();
            }

            @Override // com.mbridge.msdk.out.BannerAdListener
            public void onCloseBanner(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad closed");
            }

            @Override // com.mbridge.msdk.out.BannerAdListener
            public void onLeaveApp(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad will leave application");
            }

            @Override // com.mbridge.msdk.out.BannerAdListener
            public void onLoadFailed(MBridgeIds mBridgeIds, String str) {
                MintegralMediationAdapter.this.log("Banner ad failed to load: " + str + " for: " + mBridgeIds);
                maxAdViewAdapterListener.onAdViewAdLoadFailed(MintegralMediationAdapter.toMaxError(str));
            }

            @Override // com.mbridge.msdk.out.BannerAdListener
            public void onLoadSuccessed(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad loaded for: " + mBridgeIds);
                if (!AppLovinSdkUtils.isValidString(MintegralMediationAdapter.this.mbBannerView.getCreativeIdWithUnitId())) {
                    maxAdViewAdapterListener.onAdViewAdLoaded(MintegralMediationAdapter.this.mbBannerView);
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, MintegralMediationAdapter.this.mbBannerView.getCreativeIdWithUnitId());
                maxAdViewAdapterListener.onAdViewAdLoaded(MintegralMediationAdapter.this.mbBannerView, bundle);
            }

            @Override // com.mbridge.msdk.out.BannerAdListener
            public void onLogImpression(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad displayed");
                maxAdViewAdapterListener.onAdViewAdDisplayed();
            }

            @Override // com.mbridge.msdk.out.BannerAdListener
            public void showFullScreen(MBridgeIds mBridgeIds) {
                MintegralMediationAdapter.this.log("Banner ad expanded");
                maxAdViewAdapterListener.onAdViewAdExpanded();
            }
        });
        if (AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            this.mbBannerView.loadFromBid(maxAdapterResponseParameters.getBidResponse());
        } else {
            this.mbBannerView.load();
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        this.mbUnitId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String string = BundleUtils.getString("placement_id", maxAdapterResponseParameters.getServerParameters());
        if (activity == null) {
            log("App open ad \"" + string + "\" load failed: Activity is null");
            maxAppOpenAdapterListener.onAppOpenAdLoadFailed(MaxAdapterError.MISSING_ACTIVITY);
            return;
        }
        log(o2.r(new StringBuilder("Loading bidding app open ad for unit id: "), this.mbUnitId, " and placement id: ", string, APSSharedUtil.TRUNCATE_SEPARATOR));
        this.mbSplashHandler = new MBSplashHandler(activity, string, this.mbUnitId);
        AppOpenAdListener appOpenAdListener = new AppOpenAdListener(maxAppOpenAdapterListener);
        this.mbSplashHandler.setSplashLoadListener(appOpenAdListener);
        this.mbSplashHandler.setSplashShowListener(appOpenAdListener);
        this.mbSplashHandler.preLoadByToken(maxAdapterResponseParameters.getBidResponse());
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) throws Throwable {
        boolean zShouldUpdateMuteState = shouldUpdateMuteState(maxAdapterResponseParameters.getServerParameters());
        int i10 = zShouldUpdateMuteState ? 1 : 2;
        this.mbUnitId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String string = BundleUtils.getString("placement_id", maxAdapterResponseParameters.getServerParameters());
        MintegralMediationAdapterRouter mintegralMediationAdapterRouter = router;
        mintegralMediationAdapterRouter.addInterstitialAdapter(this, maxInterstitialAdapterListener, this.mbUnitId);
        if (AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            log(o2.r(new StringBuilder("Loading bidding interstitial ad for unit id: "), this.mbUnitId, " and placement id: ", string, APSSharedUtil.TRUNCATE_SEPARATOR));
            Map<String, MBBidNewInterstitialHandler> map = mbBidInterstitialVideoHandlers;
            if (map.containsKey(this.mbUnitId)) {
                this.mbBidInterstitialVideoHandler = map.get(this.mbUnitId);
            } else {
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = new MBBidNewInterstitialHandler(getContext(activity), string, this.mbUnitId);
                this.mbBidInterstitialVideoHandler = mBBidNewInterstitialHandler;
                map.put(this.mbUnitId, mBBidNewInterstitialHandler);
            }
            this.mbBidInterstitialVideoHandler.setInterstitialVideoListener(mintegralMediationAdapterRouter.getInterstitialListener());
            if (zShouldUpdateMuteState) {
                this.mbBidInterstitialVideoHandler.playVideoMute(i10);
            }
            this.mbBidInterstitialVideoHandler.loadFromBid(maxAdapterResponseParameters.getBidResponse());
            return;
        }
        log(o2.r(new StringBuilder("Loading mediated interstitial ad for unit id: "), this.mbUnitId, " and placement id: ", string, APSSharedUtil.TRUNCATE_SEPARATOR));
        Map<String, MBNewInterstitialHandler> map2 = mbInterstitialVideoHandlers;
        if (map2.containsKey(this.mbUnitId)) {
            this.mbInterstitialVideoHandler = map2.get(this.mbUnitId);
        } else {
            MBNewInterstitialHandler mBNewInterstitialHandler = new MBNewInterstitialHandler(getContext(activity), string, this.mbUnitId);
            this.mbInterstitialVideoHandler = mBNewInterstitialHandler;
            map2.put(this.mbUnitId, mBNewInterstitialHandler);
        }
        this.mbInterstitialVideoHandler.setInterstitialVideoListener(mintegralMediationAdapterRouter.getInterstitialListener());
        if (!this.mbInterstitialVideoHandler.isReady()) {
            if (zShouldUpdateMuteState) {
                this.mbInterstitialVideoHandler.playVideoMute(i10);
            }
            this.mbInterstitialVideoHandler.load();
            return;
        }
        log("A mediated interstitial ad is ready already");
        if (!AppLovinSdkUtils.isValidString(this.mbInterstitialVideoHandler.getCreativeIdWithUnitId())) {
            mintegralMediationAdapterRouter.onAdLoaded(this.mbUnitId);
            return;
        }
        Bundle bundle = new Bundle(1);
        bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, this.mbInterstitialVideoHandler.getCreativeIdWithUnitId());
        mintegralMediationAdapterRouter.onAdLoaded(this.mbUnitId, bundle);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        this.mbUnitId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String string = BundleUtils.getString("placement_id", maxAdapterResponseParameters.getServerParameters());
        log(o2.r(new StringBuilder("Loading bidding native ad for unit id: "), this.mbUnitId, " and placement id: ", string, APSSharedUtil.TRUNCATE_SEPARATOR));
        Map<String, Object> nativeProperties = MBBidNativeHandler.getNativeProperties(string, this.mbUnitId);
        nativeProperties.put("ad_num", 1);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.TRUE);
        NativeAdListener nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, getContext(activity), maxNativeAdAdapterListener);
        MBBidNativeHandler mBBidNativeHandler = new MBBidNativeHandler(nativeProperties, getContext(activity));
        this.mbBidNativeHandler = mBBidNativeHandler;
        mBBidNativeHandler.setAdListener(nativeAdListener);
        this.mbBidNativeHandler.bidLoad(maxAdapterResponseParameters.getBidResponse());
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) throws Throwable {
        boolean zShouldUpdateMuteState = shouldUpdateMuteState(maxAdapterResponseParameters.getServerParameters());
        int i10 = zShouldUpdateMuteState ? 1 : 2;
        this.mbUnitId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String string = BundleUtils.getString("placement_id", maxAdapterResponseParameters.getServerParameters());
        MintegralMediationAdapterRouter mintegralMediationAdapterRouter = router;
        mintegralMediationAdapterRouter.addRewardedAdapter(this, maxRewardedAdapterListener, this.mbUnitId);
        if (AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            log(o2.r(new StringBuilder("Loading bidding rewarded ad for unit id: "), this.mbUnitId, " and placement id: ", string, APSSharedUtil.TRUNCATE_SEPARATOR));
            Map<String, MBBidRewardVideoHandler> map = mbBidRewardVideoHandlers;
            if (map.containsKey(this.mbUnitId)) {
                this.mbBidRewardVideoHandler = map.get(this.mbUnitId);
            } else {
                MBBidRewardVideoHandler mBBidRewardVideoHandler = new MBBidRewardVideoHandler(getContext(activity), string, this.mbUnitId);
                this.mbBidRewardVideoHandler = mBBidRewardVideoHandler;
                map.put(this.mbUnitId, mBBidRewardVideoHandler);
            }
            this.mbBidRewardVideoHandler.setRewardVideoListener(mintegralMediationAdapterRouter.getRewardedListener());
            if (zShouldUpdateMuteState) {
                this.mbBidRewardVideoHandler.playVideoMute(i10);
            }
            this.mbBidRewardVideoHandler.loadFromBid(maxAdapterResponseParameters.getBidResponse());
            return;
        }
        log(o2.r(new StringBuilder("Loading mediated rewarded ad for unit id: "), this.mbUnitId, " and placement id: ", string, APSSharedUtil.TRUNCATE_SEPARATOR));
        Map<String, MBRewardVideoHandler> map2 = mbRewardVideoHandlers;
        if (map2.containsKey(this.mbUnitId)) {
            this.mbRewardVideoHandler = map2.get(this.mbUnitId);
        } else {
            MBRewardVideoHandler mBRewardVideoHandler = new MBRewardVideoHandler(getContext(activity), string, this.mbUnitId);
            this.mbRewardVideoHandler = mBRewardVideoHandler;
            map2.put(this.mbUnitId, mBRewardVideoHandler);
        }
        this.mbRewardVideoHandler.setRewardVideoListener(mintegralMediationAdapterRouter.getRewardedListener());
        if (!this.mbRewardVideoHandler.isReady()) {
            if (zShouldUpdateMuteState) {
                this.mbRewardVideoHandler.playVideoMute(i10);
            }
            this.mbRewardVideoHandler.load();
            return;
        }
        log("A mediated rewarded ad is ready already");
        if (!AppLovinSdkUtils.isValidString(this.mbRewardVideoHandler.getCreativeIdWithUnitId())) {
            mintegralMediationAdapterRouter.onAdLoaded(this.mbUnitId);
            return;
        }
        Bundle bundle = new Bundle(1);
        bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, this.mbRewardVideoHandler.getCreativeIdWithUnitId());
        mintegralMediationAdapterRouter.onAdLoaded(this.mbUnitId, bundle);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        MBNewInterstitialHandler mBNewInterstitialHandler = this.mbInterstitialVideoHandler;
        if (mBNewInterstitialHandler != null) {
            mBNewInterstitialHandler.setInterstitialVideoListener(null);
            this.mbInterstitialVideoHandler = null;
        }
        this.mbBidInterstitialVideoHandler = null;
        MBSplashHandler mBSplashHandler = this.mbSplashHandler;
        if (mBSplashHandler != null) {
            mBSplashHandler.onDestroy();
            this.mbSplashHandler.setSplashLoadListener(null);
            this.mbSplashHandler.setSplashShowListener(null);
            this.mbSplashHandler = null;
        }
        MBRewardVideoHandler mBRewardVideoHandler = this.mbRewardVideoHandler;
        if (mBRewardVideoHandler != null) {
            mBRewardVideoHandler.setRewardVideoListener(null);
            this.mbRewardVideoHandler = null;
        }
        this.mbBidRewardVideoHandler = null;
        MBBannerView mBBannerView = this.mbBannerView;
        if (mBBannerView != null) {
            mBBannerView.release();
            this.mbBannerView = null;
        }
        MBBidNativeHandler mBBidNativeHandler = this.mbBidNativeHandler;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.unregisterView(this.nativeAdContainer, this.clickableViews, this.nativeAdCampaign);
            this.mbBidNativeHandler.bidRelease();
            this.mbBidNativeHandler.setAdListener(null);
            this.mbBidNativeHandler = null;
        }
        MBBidNativeHandler mBBidNativeHandler2 = this.mbBidNativeAdViewHandler;
        if (mBBidNativeHandler2 != null) {
            mBBidNativeHandler2.unregisterView(this.nativeAdContainer, this.clickableViews, this.nativeAdCampaign);
            this.mbBidNativeAdViewHandler.bidRelease();
            this.mbBidNativeAdViewHandler.setAdListener(null);
            this.mbBidNativeAdViewHandler = null;
        }
        MaxNativeAd maxNativeAd = this.nativeAd;
        if (maxNativeAd != null) {
            if (maxNativeAd.getMediaView() instanceof MBMediaView) {
                ((MBMediaView) this.nativeAd.getMediaView()).destory();
            }
            this.nativeAd = null;
        }
        this.nativeAdCampaign = null;
        router.removeAdapter(this, this.mbUnitId);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        MBSplashHandler mBSplashHandler = this.mbSplashHandler;
        if (mBSplashHandler == null || !mBSplashHandler.isReady(bidResponse)) {
            log("Unable to show app open ad - no ad loaded...");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        if (activity != null) {
            log("Showing app open ad...");
            RelativeLayout relativeLayout = new RelativeLayout(getContext(activity));
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            this.mbSplashHandler.show(relativeLayout, bidResponse);
            return;
        }
        log("App open ad \"" + this.mbUnitId + "\" display failed: Activity is null");
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(MaxAdapterError.MISSING_ACTIVITY);
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        MintegralMediationAdapterRouter mintegralMediationAdapterRouter = router;
        mintegralMediationAdapterRouter.addShowingAdapter(this);
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.mbBidInterstitialVideoHandler;
        if (mBBidNewInterstitialHandler != null && mBBidNewInterstitialHandler.isBidReady()) {
            log("Showing bidding interstitial...");
            this.mbBidInterstitialVideoHandler.showFromBid();
            return;
        }
        MBNewInterstitialHandler mBNewInterstitialHandler = this.mbInterstitialVideoHandler;
        if (mBNewInterstitialHandler != null && mBNewInterstitialHandler.isReady()) {
            log("Showing mediated interstitial...");
            this.mbInterstitialVideoHandler.show();
            return;
        }
        log("Unable to show interstitial - no ad loaded...");
        String str = this.mbUnitId;
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        mintegralMediationAdapterRouter.onAdDisplayFailed(str, new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        MintegralMediationAdapterRouter mintegralMediationAdapterRouter = router;
        mintegralMediationAdapterRouter.addShowingAdapter(this);
        configureReward(maxAdapterResponseParameters);
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        String string = serverParameters.getString("reward_id", "");
        String string2 = serverParameters.getString("user_id", "");
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.mbBidRewardVideoHandler;
        if (mBBidRewardVideoHandler != null && mBBidRewardVideoHandler.isBidReady()) {
            log("Showing bidding rewarded ad...");
            this.mbBidRewardVideoHandler.showFromBid(string, string2);
            return;
        }
        MBRewardVideoHandler mBRewardVideoHandler = this.mbRewardVideoHandler;
        if (mBRewardVideoHandler != null && mBRewardVideoHandler.isReady()) {
            log("Showing mediated rewarded ad...");
            this.mbRewardVideoHandler.show(string, string2);
            return;
        }
        log("Unable to show rewarded ad - no ad loaded...");
        String str = this.mbUnitId;
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        mintegralMediationAdapterRouter.onAdDisplayFailed(str, new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView createMaxNativeAdViewWithNativeAd(MaxNativeAd maxNativeAd, String str, Context context) {
        if (str.contains("vertical")) {
            if (str.equals("vertical")) {
                return new MaxNativeAdView(maxNativeAd, maxNativeAd.getFormat() == MaxAdFormat.LEADER ? YsiBvdpw.EZqZeMDpkEdu : "vertical_media_banner_template", context);
            }
            return new MaxNativeAdView(maxNativeAd, str, context);
        }
        if (!AppLovinSdkUtils.isValidString(str)) {
            str = "media_banner_template";
        }
        return new MaxNativeAdView(maxNativeAd, str, context);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class MintegralMediationAdapterRouter extends MediationAdapterRouter {
        private final NewInterstitialListener interstitialVideoListener = new NewInterstitialListener() { // from class: com.applovin.mediation.adapters.MintegralMediationAdapter.MintegralMediationAdapterRouter.1
            @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
            public void onAdClicked(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial clicked");
                MintegralMediationAdapterRouter.this.onAdClicked(mBridgeIds.getUnitId());
            }

            @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
            public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
                MintegralMediationAdapterRouter.this.log("Interstitial hidden");
                MintegralMediationAdapterRouter.this.onAdHidden(mBridgeIds.getUnitId());
            }

            @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
            public void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
                MintegralMediationAdapterRouter.this.log("Interstitial with reward hidden");
            }

            @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
            public void onAdShow(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial displayed");
                MintegralMediationAdapterRouter.this.onAdDisplayed(mBridgeIds.getUnitId());
            }

            @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
            public void onEndcardShow(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial endcard shown");
            }

            @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
            public void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial successfully loaded for: " + mBridgeIds);
            }

            @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
            public void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
                MintegralMediationAdapterRouter.this.log("Interstitial failed to load: " + str + " for: " + mBridgeIds);
                MintegralMediationAdapterRouter.this.onAdLoadFailed(mBridgeIds.getUnitId(), MintegralMediationAdapter.toMaxError(str));
            }

            @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
            public void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial resources downloaded successfully: " + mBridgeIds);
                String unitId = mBridgeIds.getUnitId();
                MBNewInterstitialHandler mBNewInterstitialHandler = (MBNewInterstitialHandler) MintegralMediationAdapter.mbInterstitialVideoHandlers.get(unitId);
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = (MBBidNewInterstitialHandler) MintegralMediationAdapter.mbBidInterstitialVideoHandlers.get(unitId);
                String creativeIdWithUnitId = mBBidNewInterstitialHandler != null ? mBBidNewInterstitialHandler.getCreativeIdWithUnitId() : mBNewInterstitialHandler.getCreativeIdWithUnitId();
                if (AppLovinSdkUtils.isValidString(creativeIdWithUnitId)) {
                    MintegralMediationAdapterRouter.this.onAdLoaded(unitId, e2.d(1, CampaignEx.JSON_KEY_CREATIVE_ID, creativeIdWithUnitId));
                } else {
                    MintegralMediationAdapterRouter.this.onAdLoaded(unitId);
                }
            }

            @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
            public void onShowFail(MBridgeIds mBridgeIds, String str) {
                MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, str);
                MintegralMediationAdapterRouter.this.log("Interstitial failed to show: " + maxAdapterError);
                MintegralMediationAdapterRouter.this.onAdDisplayFailed(mBridgeIds.getUnitId(), maxAdapterError);
            }

            @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
            public void onVideoComplete(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Interstitial video completed");
            }
        };
        private final RewardVideoListener rewardVideoListener = new RewardVideoListener() { // from class: com.applovin.mediation.adapters.MintegralMediationAdapter.MintegralMediationAdapterRouter.2
            @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
            public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad hidden");
                String unitId = mBridgeIds.getUnitId();
                if (rewardInfo.isCompleteView()) {
                    MintegralMediationAdapterRouter mintegralMediationAdapterRouter = MintegralMediationAdapterRouter.this;
                    mintegralMediationAdapterRouter.onUserRewarded(unitId, mintegralMediationAdapterRouter.getReward(unitId));
                } else if (MintegralMediationAdapterRouter.this.shouldAlwaysRewardUser(unitId)) {
                    MintegralMediationAdapterRouter mintegralMediationAdapterRouter2 = MintegralMediationAdapterRouter.this;
                    mintegralMediationAdapterRouter2.onUserRewarded(unitId, mintegralMediationAdapterRouter2.getReward(unitId));
                }
                MintegralMediationAdapterRouter.this.onAdHidden(unitId);
            }

            @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
            public void onAdShow(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad displayed");
                MintegralMediationAdapterRouter.this.onAdDisplayed(mBridgeIds.getUnitId());
            }

            @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
            public void onEndcardShow(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad endcard shown");
            }

            @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
            public void onLoadSuccess(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad successfully loaded but video still needs to be downloaded for: " + mBridgeIds);
            }

            @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
            public void onShowFail(MBridgeIds mBridgeIds, String str) {
                MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, str);
                MintegralMediationAdapterRouter.this.log("Rewarded ad failed to show: " + maxAdapterError);
                MintegralMediationAdapterRouter.this.onAdDisplayFailed(mBridgeIds.getUnitId(), maxAdapterError);
            }

            @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
            public void onVideoAdClicked(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad clicked");
                MintegralMediationAdapterRouter.this.onAdClicked(mBridgeIds.getUnitId());
            }

            @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
            public void onVideoComplete(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad video completed");
            }

            @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
            public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad failed to load: " + str + " for: " + mBridgeIds);
                MintegralMediationAdapterRouter.this.onAdLoadFailed(mBridgeIds.getUnitId(), MintegralMediationAdapter.toMaxError(str));
            }

            @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
            public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
                MintegralMediationAdapterRouter.this.log("Rewarded ad successfully loaded and video has been downloaded for: " + mBridgeIds);
                String unitId = mBridgeIds.getUnitId();
                MBRewardVideoHandler mBRewardVideoHandler = (MBRewardVideoHandler) MintegralMediationAdapter.mbRewardVideoHandlers.get(unitId);
                MBBidRewardVideoHandler mBBidRewardVideoHandler = (MBBidRewardVideoHandler) MintegralMediationAdapter.mbBidRewardVideoHandlers.get(unitId);
                String creativeIdWithUnitId = mBBidRewardVideoHandler != null ? mBBidRewardVideoHandler.getCreativeIdWithUnitId() : mBRewardVideoHandler.getCreativeIdWithUnitId();
                if (AppLovinSdkUtils.isValidString(creativeIdWithUnitId)) {
                    MintegralMediationAdapterRouter.this.onAdLoaded(unitId, e2.d(1, CampaignEx.JSON_KEY_CREATIVE_ID, creativeIdWithUnitId));
                } else {
                    MintegralMediationAdapterRouter.this.onAdLoaded(unitId);
                }
            }
        };

        private MintegralMediationAdapterRouter() {
        }

        public NewInterstitialListener getInterstitialListener() {
            return this.interstitialVideoListener;
        }

        public RewardVideoListener getRewardedListener() {
            return this.rewardVideoListener;
        }

        @Override // com.applovin.mediation.adapters.MediationAdapterRouter
        public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        }
    }
}
