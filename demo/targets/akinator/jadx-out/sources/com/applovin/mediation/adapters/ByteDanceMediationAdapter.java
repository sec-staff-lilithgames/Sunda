package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.bytedance.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import e3.g;
import i2.hQ.aTNDubNmpwAqdU;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class ByteDanceMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final int ABNORMAL_MATERIAL_DATA_ERROR = 104;
    private static final int ADSLOT_EMPTY = 40004;
    private static final int ADSLOT_ID_ERROR = 40006;
    private static final int ADSLOT_SIZE_EMPTY = 40005;
    private static final int AD_DATA_ERROR = -4;
    private static final int APP_EMPTY = 40002;
    private static final int BANNER_AD_LOAD_IMAGE_ERROR = -5;
    private static final int CONTENT_TYPE = 40000;
    private static final int DEFAULT_IMAGE_TASK_TIMEOUT_SECONDS = 10;
    private static final int ERROR_ACCESS_METHOD_API_SDK = 40017;
    private static final int ERROR_ACCESS_METHOD_PASS = 40012;
    private static final int ERROR_ADTYPE_DIFFER = 40019;
    private static final int ERROR_AD_TYPE = 40011;
    private static final int ERROR_APK_SIGN_CHECK_ERROR = 40021;
    private static final int ERROR_CODE_ADCOUNT_ERROR = 40007;
    private static final int ERROR_CODE_CLICK_EVENT_ERROR = 60002;
    private static final int ERROR_IMAGE_SIZE = 40008;
    private static final int ERROR_MEDIA_ID = 40009;
    private static final int ERROR_MEDIA_TYPE = 40010;
    private static final int ERROR_NEW_REGISTER_LIMIT = 40020;
    private static final int ERROR_ORIGIN_AD_ERROR = 40022;
    private static final int ERROR_PACKAGE_NAME = 40018;
    private static final int ERROR_REDIRECT = 40014;
    private static final int ERROR_REQUEST_INVALID = 40015;
    private static final int ERROR_SLOT_ID_APP_ID_DIFFER = 40016;
    private static final int ERROR_SPLASH_AD_TYPE = 40013;
    private static final int ERROR_TEMPLATE_METHODS = 40029;
    private static final int ERROR_UNION_OS_ERROR = 40023;
    private static final int ERROR_UNION_SDK_NOT_INSTALLED = 40025;
    private static final int ERROR_UNION_SDK_TOO_OLD = 40024;
    private static final int ERROR_VERIFY_REWARD = 60007;
    private static final int FAIL_PARSE_RENDERING_RESULT_DATA_ERROR = 101;
    private static final int FREQUENT_CALL_ERROR = -8;
    private static final int INSERT_AD_LOAD_IMAGE_ERROR = -6;
    private static final int INVALID_MAIN_TEMPLATE_ERROR = 102;
    private static final int INVALID_TEMPLATE_DIFFERENCE_ERROR = 103;
    private static final String MAX_EXCHANGE_ID = "105";
    private static final int NET_ERROR = -2;
    private static final int NO_AD = 20001;
    private static final int NO_AD_PARSE = -3;
    private static final int OK = 20000;
    private static final int PARSE_FAIL = -1;
    private static final int RENDERING_ERROR = 106;
    private static final int RENDERING_TIMEOUT_ERROR = 107;
    private static final int REQUEST_BODY_ERROR = -9;
    private static final int REQUEST_PB_ERROR = 40001;
    private static final int ROR_CODE_SHOW_EVENT_ERROR = 60001;
    private static final int SPLASH_AD_LOAD_IMAGE_ERROR = -7;
    private static final int SPLASH_CACHE_EXPIRED_ERROR = -11;
    private static final int SPLASH_CACHE_PARSE_ERROR = -10;
    private static final int SPLASH_NOT_HAVE_CACHE_ERROR = -12;
    private static final int SYS_ERROR = 50001;
    private static final int TEMPLATE_DATA_PARSING_ERROR = 105;
    private static final int WAP_EMPTY = 40003;
    private static MaxAdapter.InitializationStatus status;
    private PAGBannerAd adViewAd;
    private PAGAppOpenAd appOpenAd;
    private AppOpenAdListener appOpenAdListener;
    private PAGInterstitialAd interstitialAd;
    private InterstitialAdListener interstitialAdListener;
    private PAGNativeAd nativeAd;
    private NativeAdListener nativeAdListener;
    private PAGRewardedAd rewardedAd;
    private RewardedAdListener rewardedAdListener;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static final ExecutorService executor = Executors.newCachedThreadPool();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class AdViewListener implements PAGBannerAdLoadListener, PAGBannerAdInteractionListener {
        private final MaxAdFormat adFormat;
        private final String codeId;
        private final MaxAdViewAdapterListener listener;

        public AdViewListener(String str, MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.codeId = str;
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder();
            e2.w(this.adFormat, sb2, " ad clicked: ");
            e2.C(sb2, this.codeId, byteDanceMediationAdapter);
            this.listener.onAdViewAdClicked();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder();
            e2.w(this.adFormat, sb2, " ad hidden: ");
            e2.C(sb2, this.codeId, byteDanceMediationAdapter);
            this.listener.onAdViewAdHidden();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder();
            e2.w(this.adFormat, sb2, " ad displayed: ");
            e2.C(sb2, this.codeId, byteDanceMediationAdapter);
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onAdLoaded(PAGBannerAd pAGBannerAd) {
            if (pAGBannerAd == null) {
                ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
                StringBuilder sb2 = new StringBuilder();
                e2.w(this.adFormat, sb2, " ad(");
                sb2.append(this.codeId);
                sb2.append(") NO FILL'd");
                byteDanceMediationAdapter.log(sb2.toString());
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            ByteDanceMediationAdapter byteDanceMediationAdapter2 = ByteDanceMediationAdapter.this;
            StringBuilder sb3 = new StringBuilder();
            e2.w(this.adFormat, sb3, " ad (");
            sb3.append(this.codeId);
            sb3.append(") loaded");
            byteDanceMediationAdapter2.log(sb3.toString());
            ByteDanceMediationAdapter.this.adViewAd = pAGBannerAd;
            Bundle bundle = new Bundle(2);
            PAGBannerSize bannerSize = ByteDanceMediationAdapter.this.adViewAd.getBannerSize();
            bundle.putInt("ad_width", bannerSize.getWidth());
            bundle.putInt("ad_height", bannerSize.getHeight());
            ByteDanceMediationAdapter.this.adViewAd.setAdInteractionListener(this);
            this.listener.onAdViewAdLoaded(pAGBannerAd.getBannerView(), bundle);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
        public void onError(int i10, String str) {
            MaxAdapterError maxError = ByteDanceMediationAdapter.toMaxError(i10, str);
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder();
            e2.w(this.adFormat, sb2, " ad (");
            sb2.append(this.codeId);
            sb2.append(aTNDubNmpwAqdU.amry);
            sb2.append(maxError);
            byteDanceMediationAdapter.log(sb2.toString());
            this.listener.onAdViewAdLoadFailed(maxError);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class AppOpenAdListener implements PAGAppOpenAdLoadListener, PAGAppOpenAdInteractionListener {
        private final String codeId;
        private final MaxAppOpenAdapterListener listener;

        public AppOpenAdListener(String str, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
            this.codeId = str;
            this.listener = maxAppOpenAdapterListener;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            e2.C(new StringBuilder("App open ad clicked: "), this.codeId, ByteDanceMediationAdapter.this);
            this.listener.onAppOpenAdClicked();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            e2.C(new StringBuilder("App open ad hidden: "), this.codeId, ByteDanceMediationAdapter.this);
            this.listener.onAppOpenAdHidden();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            e2.C(new StringBuilder("App open ad displayed: "), this.codeId, ByteDanceMediationAdapter.this);
            this.listener.onAppOpenAdDisplayed();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
        public void onError(int i10, String str) {
            MaxAdapterError maxError = ByteDanceMediationAdapter.toMaxError(i10, str);
            ByteDanceMediationAdapter.this.log("App open ad (" + this.codeId + ") failed to load with error: " + maxError);
            this.listener.onAppOpenAdLoadFailed(maxError);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
            if (pAGAppOpenAd != null) {
                e2.C(new StringBuilder("App open ad loaded: "), this.codeId, ByteDanceMediationAdapter.this);
                ByteDanceMediationAdapter.this.appOpenAd = pAGAppOpenAd;
                this.listener.onAppOpenAdLoaded();
                return;
            }
            ByteDanceMediationAdapter.this.log("App open ad(" + this.codeId + ") NO FILL'd");
            this.listener.onAppOpenAdLoadFailed(MaxAdapterError.NO_FILL);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class InterstitialAdListener implements PAGInterstitialAdLoadListener, PAGInterstitialAdInteractionListener {
        private final String codeId;
        private final MaxInterstitialAdapterListener listener;

        public InterstitialAdListener(String str, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.codeId = str;
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            e2.C(new StringBuilder("Interstitial ad clicked: "), this.codeId, ByteDanceMediationAdapter.this);
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            e2.C(new StringBuilder("Interstitial ad hidden: "), this.codeId, ByteDanceMediationAdapter.this);
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            e2.C(new StringBuilder("Interstitial ad displayed: "), this.codeId, ByteDanceMediationAdapter.this);
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
        public void onError(int i10, String str) {
            MaxAdapterError maxError = ByteDanceMediationAdapter.toMaxError(i10, str);
            ByteDanceMediationAdapter.this.log("Interstitial ad (" + this.codeId + ") failed to load with error: " + maxError);
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            if (pAGInterstitialAd != null) {
                e2.C(new StringBuilder("Interstitial ad loaded: "), this.codeId, ByteDanceMediationAdapter.this);
                ByteDanceMediationAdapter.this.interstitialAd = pAGInterstitialAd;
                this.listener.onInterstitialAdLoaded();
                return;
            }
            ByteDanceMediationAdapter.this.log("Interstitial ad(" + this.codeId + ") NO FILL'd");
            this.listener.onInterstitialAdLoadFailed(MaxAdapterError.NO_FILL);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class MaxByteDanceNativeAd extends MaxNativeAd {
        public MaxByteDanceNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            PAGNativeAd pAGNativeAd = ByteDanceMediationAdapter.this.nativeAd;
            if (pAGNativeAd == null) {
                ByteDanceMediationAdapter.this.e("Failed to register native ad view for interaction. Native ad is null");
                return false;
            }
            ByteDanceMediationAdapter.this.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
            pAGNativeAd.registerViewForInteraction(viewGroup, list, (List<View>) null, (View) null, ByteDanceMediationAdapter.this.nativeAdListener);
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class NativeAdListener implements PAGNativeAdLoadListener, PAGNativeAdInteractionListener, PAGVideoAdListener {
        final String codeId;
        final Context context;
        final MaxNativeAdAdapterListener listener;
        final Bundle serverParameters;

        public NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.codeId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.context = context;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            e2.C(new StringBuilder("Native ad clicked: "), this.codeId, ByteDanceMediationAdapter.this);
            this.listener.onNativeAdClicked();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            e2.C(new StringBuilder("Native ad hidden: "), this.codeId, ByteDanceMediationAdapter.this);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            e2.C(new StringBuilder("Native ad displayed: "), this.codeId, ByteDanceMediationAdapter.this);
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
        public void onError(int i10, String str) {
            MaxAdapterError maxError = ByteDanceMediationAdapter.toMaxError(i10, str);
            ByteDanceMediationAdapter.this.log("Native ad (" + this.codeId + ") failed to load with error: " + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
        public void onVideoAdComplete() {
            ByteDanceMediationAdapter.this.log("Native ad video completed");
        }

        @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
        public void onVideoAdPaused() {
            ByteDanceMediationAdapter.this.log("Native ad video paused");
        }

        @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
        public void onVideoAdPlay() {
            ByteDanceMediationAdapter.this.log("Native ad video started playing");
        }

        @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
        public void onVideoError() {
            ByteDanceMediationAdapter.this.log("Native ad video error");
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onAdLoaded(PAGNativeAd pAGNativeAd) {
            if (pAGNativeAd == null) {
                ByteDanceMediationAdapter.this.log("Native ad(" + this.codeId + ") NO FILL'd");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            ByteDanceMediationAdapter.this.log("Native ad loaded: " + this.codeId + ". Preparing assets...");
            final PAGNativeAdData nativeAdData = pAGNativeAd.getNativeAdData();
            ByteDanceMediationAdapter.this.nativeAd = pAGNativeAd;
            if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || !TextUtils.isEmpty(nativeAdData.getTitle())) {
                ByteDanceMediationAdapter.this.getCachingExecutorService().execute(new Runnable() { // from class: com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Future<Drawable> futureCreateDrawableFuture;
                        Drawable drawable;
                        if (nativeAdData.getIcon() == null || !StringUtils.isValidString(nativeAdData.getIcon().getImageUrl())) {
                            futureCreateDrawableFuture = null;
                        } else {
                            String imageUrl = nativeAdData.getIcon().getImageUrl();
                            ByteDanceMediationAdapter.this.log("Adding native ad icon (" + imageUrl + ") to queue to be fetched");
                            NativeAdListener nativeAdListener = NativeAdListener.this;
                            futureCreateDrawableFuture = ByteDanceMediationAdapter.this.createDrawableFuture(imageUrl, nativeAdListener.context.getResources());
                        }
                        int i10 = BundleUtils.getInt("image_task_timeout_seconds", 10, NativeAdListener.this.serverParameters);
                        if (futureCreateDrawableFuture != null) {
                            try {
                                drawable = futureCreateDrawableFuture.get(i10, TimeUnit.SECONDS);
                            } catch (Throwable th2) {
                                ByteDanceMediationAdapter.this.e("Image fetching tasks failed", th2);
                            }
                        } else {
                            drawable = null;
                        }
                        final MaxNativeAd.MaxNativeAdImage maxNativeAdImage = drawable != null ? new MaxNativeAd.MaxNativeAdImage(drawable) : null;
                        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdListener.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ByteDanceMediationAdapter.this.log("Creating native ad with assets");
                                MaxByteDanceNativeAd maxByteDanceNativeAd = ByteDanceMediationAdapter.this.new MaxByteDanceNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(nativeAdData.getTitle()).setBody(nativeAdData.getDescription()).setCallToAction(nativeAdData.getButtonText()).setIcon(maxNativeAdImage).setOptionsView(nativeAdData.getAdLogoView()).setMediaView(nativeAdData.getMediaView()));
                                e2.C(new StringBuilder("Native ad fully loaded: "), NativeAdListener.this.codeId, ByteDanceMediationAdapter.this);
                                NativeAdListener.this.listener.onNativeAdLoaded(maxByteDanceNativeAd, null);
                            }
                        });
                    }
                });
                return;
            }
            ByteDanceMediationAdapter.this.e("Native ad (" + pAGNativeAd + ") does not have required assets.");
            this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class NativeAdViewListener implements PAGNativeAdLoadListener, PAGNativeAdInteractionListener, PAGVideoAdListener {
        final WeakReference<Activity> activityRef;
        final MaxAdFormat adFormat;
        final String codeId;
        final MaxAdViewAdapterListener listener;
        final Bundle serverParameters;

        public NativeAdViewListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.codeId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.adFormat = maxAdFormat;
            this.activityRef = new WeakReference<>(activity);
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder("Native ");
            e2.w(this.adFormat, sb2, " ad clicked: ");
            e2.C(sb2, this.codeId, byteDanceMediationAdapter);
            this.listener.onAdViewAdClicked();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder("Native ");
            e2.w(this.adFormat, sb2, " ad hidden: ");
            e2.C(sb2, this.codeId, byteDanceMediationAdapter);
            this.listener.onAdViewAdHidden();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder("Native ");
            e2.w(this.adFormat, sb2, " ad displayed: ");
            e2.C(sb2, this.codeId, byteDanceMediationAdapter);
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
        public void onError(int i10, String str) {
            MaxAdapterError maxError = ByteDanceMediationAdapter.toMaxError(i10, str);
            ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder("Native ");
            e2.w(this.adFormat, sb2, " ad (");
            sb2.append(this.codeId);
            sb2.append(") failed to load with error: ");
            sb2.append(maxError);
            byteDanceMediationAdapter.log(sb2.toString());
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
        public void onVideoAdComplete() {
            ByteDanceMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad video completed");
        }

        @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
        public void onVideoAdPaused() {
            ByteDanceMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad video paused");
        }

        @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
        public void onVideoAdPlay() {
            ByteDanceMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad video loaded");
        }

        @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
        public void onVideoError() {
            ByteDanceMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad video error");
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
            if (pAGNativeAd == null) {
                ByteDanceMediationAdapter byteDanceMediationAdapter = ByteDanceMediationAdapter.this;
                StringBuilder sb2 = new StringBuilder("Native ");
                e2.w(this.adFormat, sb2, "ad(");
                sb2.append(this.codeId);
                sb2.append(") NO FILL'd");
                byteDanceMediationAdapter.log(sb2.toString());
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            ByteDanceMediationAdapter byteDanceMediationAdapter2 = ByteDanceMediationAdapter.this;
            StringBuilder sb3 = new StringBuilder("Native ");
            e2.w(this.adFormat, sb3, " ad loaded: ");
            sb3.append(this.codeId);
            sb3.append(". Preparing assets...");
            byteDanceMediationAdapter2.log(sb3.toString());
            final PAGNativeAdData nativeAdData = pAGNativeAd.getNativeAdData();
            ExecutorService cachingExecutorService = ByteDanceMediationAdapter.this.getCachingExecutorService();
            final Context context = ByteDanceMediationAdapter.this.getContext(this.activityRef.get());
            cachingExecutorService.execute(new Runnable() { // from class: com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.1
                @Override // java.lang.Runnable
                public void run() {
                    Future<Drawable> futureCreateDrawableFuture;
                    Drawable drawable;
                    Resources resources = context.getResources();
                    if (nativeAdData.getIcon() == null || !StringUtils.isValidString(nativeAdData.getIcon().getImageUrl())) {
                        futureCreateDrawableFuture = null;
                    } else {
                        String imageUrl = nativeAdData.getIcon().getImageUrl();
                        ByteDanceMediationAdapter.this.log("Adding native ad icon (" + imageUrl + ") to queue to be fetched");
                        futureCreateDrawableFuture = ByteDanceMediationAdapter.this.createDrawableFuture(imageUrl, resources);
                    }
                    int i10 = BundleUtils.getInt("image_task_timeout_seconds", 10, NativeAdViewListener.this.serverParameters);
                    if (futureCreateDrawableFuture != null) {
                        try {
                            drawable = futureCreateDrawableFuture.get(i10, TimeUnit.SECONDS);
                        } catch (Throwable th2) {
                            ByteDanceMediationAdapter.this.e("Image fetching tasks failed", th2);
                        }
                    } else {
                        drawable = null;
                    }
                    final MaxNativeAd.MaxNativeAdImage maxNativeAdImage = drawable != null ? new MaxNativeAd.MaxNativeAdImage(drawable) : null;
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.ByteDanceMediationAdapter.NativeAdViewListener.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ByteDanceMediationAdapter.this.log("Creating native ad with assets");
                            MaxNativeAd maxNativeAdBuild = new MaxNativeAd.Builder().setAdFormat(NativeAdViewListener.this.adFormat).setTitle(nativeAdData.getTitle()).setBody(nativeAdData.getDescription()).setCallToAction(nativeAdData.getButtonText()).setIcon(maxNativeAdImage).setOptionsView(nativeAdData.getAdLogoView()).setMediaView(nativeAdData.getMediaView()).build();
                            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(maxNativeAdBuild, BundleUtils.getString("template", "", NativeAdViewListener.this.serverParameters), context);
                            ArrayList arrayList = new ArrayList(4);
                            if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getTitle()) && maxNativeAdView.getTitleTextView() != null) {
                                arrayList.add(maxNativeAdView.getTitleTextView());
                            }
                            if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getBody()) && maxNativeAdView.getBodyTextView() != null) {
                                arrayList.add(maxNativeAdView.getBodyTextView());
                            }
                            if (maxNativeAdBuild.getIcon() != null && maxNativeAdView.getIconImageView() != null) {
                                arrayList.add(maxNativeAdView.getIconImageView());
                            }
                            ViewGroup mediaContentViewGroup = maxNativeAdView.getMediaContentViewGroup();
                            if (maxNativeAdBuild.getMediaView() != null && mediaContentViewGroup != null) {
                                arrayList.add(mediaContentViewGroup);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
                                arrayList2.add(maxNativeAdView.getCallToActionButton());
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            pAGNativeAd.registerViewForInteraction(maxNativeAdView, arrayList, arrayList2, (View) null, NativeAdViewListener.this);
                            ByteDanceMediationAdapter byteDanceMediationAdapter3 = ByteDanceMediationAdapter.this;
                            StringBuilder sb4 = new StringBuilder("Native ");
                            e2.w(NativeAdViewListener.this.adFormat, sb4, " ad fully loaded: ");
                            e2.C(sb4, NativeAdViewListener.this.codeId, byteDanceMediationAdapter3);
                            NativeAdViewListener.this.listener.onAdViewAdLoaded(maxNativeAdView);
                        }
                    });
                }
            });
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class RewardedAdListener implements PAGRewardedAdLoadListener, PAGRewardedAdInteractionListener {
        private final String codeId;
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public RewardedAdListener(String str, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.codeId = str;
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            e2.C(new StringBuilder("Rewarded ad clicked: "), this.codeId, ByteDanceMediationAdapter.this);
            this.listener.onRewardedAdClicked();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            e2.C(new StringBuilder("Rewarded ad hidden: "), this.codeId, ByteDanceMediationAdapter.this);
            if (this.hasGrantedReward || ByteDanceMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = ByteDanceMediationAdapter.this.getReward();
                ByteDanceMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            e2.C(new StringBuilder("Rewarded ad displayed: "), this.codeId, ByteDanceMediationAdapter.this);
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.jj
        public void onError(int i10, String str) {
            MaxAdapterError maxError = ByteDanceMediationAdapter.toMaxError(i10, str);
            ByteDanceMediationAdapter.this.log("Rewarded ad (" + this.codeId + ") failed to load with error: " + maxError);
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
            ByteDanceMediationAdapter.this.log("Rewarded user with reward: " + pAGRewardItem.getRewardAmount() + " " + pAGRewardItem.getRewardName());
            this.hasGrantedReward = true;
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedRewardFail(int i10, String str) {
            ByteDanceMediationAdapter.this.log("Failed to reward user with error: " + i10 + " " + str);
            this.hasGrantedReward = false;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            if (pAGRewardedAd != null) {
                e2.C(new StringBuilder("Rewarded ad loaded: "), this.codeId, ByteDanceMediationAdapter.this);
                ByteDanceMediationAdapter.this.rewardedAd = pAGRewardedAd;
                this.listener.onRewardedAdLoaded();
                return;
            }
            ByteDanceMediationAdapter.this.log("Rewarded ad(" + this.codeId + ") NO FILL'd");
            this.listener.onRewardedAdLoadFailed(MaxAdapterError.NO_FILL);
        }
    }

    public ByteDanceMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    private String createAdConfigData(Bundle bundle, Boolean bool) {
        return bool.booleanValue() ? a.b.l("[{\"name\":\"mediation\",\"value\":\"MAX\"},{\"name\":\"adapter_version\",\"value\":\"", getAdapterVersion(), "\"}]") : g.l("[{\"name\":\"mediation\",\"value\":\"MAX\"},{\"name\":\"adapter_version\",\"value\":\"", getAdapterVersion(), "\"},{\"name\":\"hybrid_id\",\"value\":\"", BundleUtils.getString("event_id", bundle), "\"}]");
    }

    private PAGBiddingRequest createBiddingRequestWithParameters(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Context context) {
        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
        if (maxAdapterSignalCollectionParameters.getAdFormat().isAdViewAd()) {
            Object obj = maxAdapterSignalCollectionParameters.getLocalExtraParameters().get("adaptive_banner");
            pAGBiddingRequest.setBannerSize(toPAGBannerSize(maxAdapterSignalCollectionParameters.getAdFormat(), (obj instanceof String) && "true".equalsIgnoreCase((String) obj), maxAdapterSignalCollectionParameters, context));
        }
        pAGBiddingRequest.setAdxId(MAX_EXCHANGE_ID);
        String adUnitId = maxAdapterSignalCollectionParameters.getAdUnitId();
        Bundle bundle = BundleUtils.getBundle("placement_ids", Bundle.EMPTY, maxAdapterSignalCollectionParameters.getServerParameters());
        if (AppLovinSdkUtils.isValidString(adUnitId)) {
            String string = bundle.getString(adUnitId);
            if (AppLovinSdkUtils.isValidString(string)) {
                pAGBiddingRequest.setSlotId(string);
                return pAGBiddingRequest;
            }
            log("No valid slot ID found during signal collection");
        }
        return pAGBiddingRequest;
    }

    private Callable<Drawable> createDrawableTask(final String str, final Resources resources) {
        return new Callable<Drawable>() { // from class: com.applovin.mediation.adapters.ByteDanceMediationAdapter.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Drawable call() throws Exception {
                return new BitmapDrawable(resources, BitmapFactory.decodeStream(new URL(str).openStream()));
            }
        };
    }

    private PAGBannerSize getAdaptiveAdSize(MaxAdapterParameters maxAdapterParameters, Context context) {
        int adaptiveAdViewWidth = getAdaptiveAdViewWidth(maxAdapterParameters, context);
        if (!isInlineAdaptiveAdView(maxAdapterParameters)) {
            return PAGBannerSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, adaptiveAdViewWidth);
        }
        int inlineAdaptiveAdViewMaximumHeight = getInlineAdaptiveAdViewMaximumHeight(maxAdapterParameters);
        return inlineAdaptiveAdViewMaximumHeight > 0 ? PAGBannerSize.getInlineAdaptiveBannerAdSize(adaptiveAdViewWidth, inlineAdaptiveAdViewMaximumHeight) : PAGBannerSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, adaptiveAdViewWidth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.applovin.mediation.adapter.MaxAdapterError toMaxError(int r2, java.lang.String r3) {
        /*
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
            r1 = 20000(0x4e20, float:2.8026E-41)
            if (r2 == r1) goto L37
            r1 = 20001(0x4e21, float:2.8027E-41)
            if (r2 == r1) goto L2f
            r1 = 40029(0x9c5d, float:5.6093E-41)
            if (r2 == r1) goto L2c
            r1 = 50001(0xc351, float:7.0066E-41)
            if (r2 == r1) goto L2c
            r1 = 60007(0xea67, float:8.4088E-41)
            if (r2 == r1) goto L2c
            switch(r2) {
                case -12: goto L2c;
                case -11: goto L29;
                case -10: goto L2c;
                case -9: goto L2c;
                case -8: goto L2c;
                case -7: goto L2c;
                case -6: goto L2c;
                case -5: goto L2c;
                case -4: goto L2c;
                case -3: goto L2c;
                case -2: goto L26;
                case -1: goto L2c;
                default: goto L1c;
            }
        L1c:
            switch(r2) {
                case 101: goto L2c;
                case 102: goto L2c;
                case 103: goto L2c;
                case 104: goto L2c;
                case 105: goto L2c;
                case 106: goto L2c;
                case 107: goto L2c;
                default: goto L1f;
            }
        L1f:
            switch(r2) {
                case 40000: goto L2c;
                case 40001: goto L2c;
                case 40002: goto L2c;
                case 40003: goto L2c;
                case 40004: goto L2c;
                case 40005: goto L2c;
                case 40006: goto L2c;
                case 40007: goto L2c;
                case 40008: goto L2c;
                case 40009: goto L2c;
                case 40010: goto L2c;
                case 40011: goto L2c;
                case 40012: goto L2c;
                case 40013: goto L2c;
                case 40014: goto L2c;
                case 40015: goto L2c;
                case 40016: goto L2c;
                case 40017: goto L2c;
                case 40018: goto L2c;
                case 40019: goto L2c;
                case 40020: goto L2c;
                case 40021: goto L2c;
                case 40022: goto L2c;
                case 40023: goto L2c;
                case 40024: goto L2c;
                case 40025: goto L2c;
                default: goto L22;
            }
        L22:
            switch(r2) {
                case 60001: goto L2c;
                case 60002: goto L2c;
                default: goto L25;
            }
        L25:
            goto L31
        L26:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.NO_CONNECTION
            goto L31
        L29:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.AD_EXPIRED
            goto L31
        L2c:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION
            goto L31
        L2f:
            com.applovin.mediation.adapter.MaxAdapterError r0 = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL
        L31:
            com.applovin.mediation.adapter.MaxAdapterError r1 = new com.applovin.mediation.adapter.MaxAdapterError
            r1.<init>(r0, r2, r3)
            return r1
        L37:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Returned error code for success"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.ByteDanceMediationAdapter.toMaxError(int, java.lang.String):com.applovin.mediation.adapter.MaxAdapterError");
    }

    private PAGBannerSize toPAGBannerSize(MaxAdFormat maxAdFormat, boolean z10, MaxAdapterParameters maxAdapterParameters, Context context) {
        if (z10 && isAdaptiveAdViewFormat(maxAdFormat, maxAdapterParameters)) {
            return getAdaptiveAdSize(maxAdapterParameters, context);
        }
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return PAGBannerSize.BANNER_W_320_H_50;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return PAGBannerSize.BANNER_W_728_H_90;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return PAGBannerSize.BANNER_W_300_H_250;
        }
        throw new IllegalArgumentException("Unsupported ad view ad format: " + maxAdFormat.getLabel());
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        Context context = getContext(activity);
        PAGSdk.getBiddingToken(context, createBiddingRequestWithParameters(maxAdapterSignalCollectionParameters, context), new BiddingTokenCallback() { // from class: com.applovin.mediation.adapters.ByteDanceMediationAdapter.2
            @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
            public void onBiddingTokenCollected(String str) {
                ByteDanceMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(str);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return PAGSdk.getSDKVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        status = MaxAdapter.InitializationStatus.INITIALIZING;
        Bundle serverParameters = maxAdapterInitializationParameters.getServerParameters();
        String string = serverParameters.getString("app_id");
        log("Initializing SDK with app id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        PAGConfig.Builder builder = new PAGConfig.Builder();
        builder.setUserData(createAdConfigData(serverParameters, Boolean.TRUE));
        Boolean boolHasUserConsent = maxAdapterInitializationParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            builder.setGDPRConsent(boolHasUserConsent.booleanValue() ? 1 : 0);
        }
        Boolean boolIsDoNotSell = maxAdapterInitializationParameters.isDoNotSell();
        if (boolIsDoNotSell != null) {
            builder.setPAConsent(!boolIsDoNotSell.booleanValue() ? 1 : 0);
        }
        PAGSdk.init(getContext(activity), builder.appId(string).debugLog(maxAdapterInitializationParameters.isTesting()).setAdxId(MAX_EXCHANGE_ID).supportMultiProcess(false).build(), new PAGSdk.PAGInitCallback() { // from class: com.applovin.mediation.adapters.ByteDanceMediationAdapter.1
            @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
            public void fail(int i10, String str) {
                ByteDanceMediationAdapter.this.log("SDK failed to initialize with code: " + i10 + " and message: " + str);
                MaxAdapter.InitializationStatus unused = ByteDanceMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                onCompletionListener.onCompletion(ByteDanceMediationAdapter.status, str);
            }

            @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
            public void success() {
                ByteDanceMediationAdapter.this.log("SDK initialized");
                MaxAdapter.InitializationStatus unused = ByteDanceMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                onCompletionListener.onCompletion(ByteDanceMediationAdapter.status, null);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        StringBuilder sb2 = new StringBuilder("Loading ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append(z10 ? "native " : "");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" ad for code id \"");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append("\"...");
        log(sb2.toString());
        PAGConfig.setUserData(createAdConfigData(maxAdapterResponseParameters.getServerParameters(), Boolean.FALSE));
        if (z10) {
            PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
            if (zIsValidString) {
                pAGNativeRequest.setAdString(bidResponse);
            }
            PAGNativeAd.loadAd(thirdPartyAdPlacementId, pAGNativeRequest, new NativeAdViewListener(maxAdapterResponseParameters, maxAdFormat, activity, maxAdViewAdapterListener));
            return;
        }
        PAGBannerRequest pAGBannerRequest = new PAGBannerRequest(toPAGBannerSize(maxAdFormat, maxAdapterResponseParameters.getServerParameters().getBoolean("adaptive_banner", false), maxAdapterResponseParameters, getContext(activity)));
        if (zIsValidString) {
            pAGBannerRequest.setAdString(bidResponse);
        }
        PAGBannerAd.loadAd(thirdPartyAdPlacementId, pAGBannerRequest, new AdViewListener(thirdPartyAdPlacementId, maxAdFormat, maxAdViewAdapterListener));
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        log(o2.r(new StringBuilder("Loading "), zIsValidString ? "bidding " : "", "app open ad for code id \"", thirdPartyAdPlacementId, "\"..."));
        PAGConfig.setUserData(createAdConfigData(maxAdapterResponseParameters.getServerParameters(), Boolean.FALSE));
        int i10 = getContext(activity).getApplicationInfo().icon;
        if (i10 <= 0) {
            log("App icon resource id could not be found");
        } else {
            PAGConfig.setAppIconId(i10);
        }
        PAGAppOpenRequest pAGAppOpenRequest = new PAGAppOpenRequest();
        if (zIsValidString) {
            pAGAppOpenRequest.setAdString(bidResponse);
        }
        AppOpenAdListener appOpenAdListener = new AppOpenAdListener(thirdPartyAdPlacementId, maxAppOpenAdapterListener);
        this.appOpenAdListener = appOpenAdListener;
        PAGAppOpenAd.loadAd(thirdPartyAdPlacementId, pAGAppOpenRequest, appOpenAdListener);
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        log(o2.r(new StringBuilder("Loading "), zIsValidString ? "bidding " : "", "interstitial ad for code id \"", thirdPartyAdPlacementId, "\"..."));
        PAGConfig.setUserData(createAdConfigData(maxAdapterResponseParameters.getServerParameters(), Boolean.FALSE));
        PAGInterstitialRequest pAGInterstitialRequest = new PAGInterstitialRequest();
        if (zIsValidString) {
            pAGInterstitialRequest.setAdString(bidResponse);
        }
        InterstitialAdListener interstitialAdListener = new InterstitialAdListener(thirdPartyAdPlacementId, maxInterstitialAdapterListener);
        this.interstitialAdListener = interstitialAdListener;
        PAGInterstitialAd.loadAd(thirdPartyAdPlacementId, pAGInterstitialRequest, interstitialAdListener);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(o2.r(new StringBuilder("Loading "), zIsValidString ? "bidding " : "", "native ad for code id \"", thirdPartyAdPlacementId, "\"..."));
        PAGConfig.setUserData(createAdConfigData(maxAdapterResponseParameters.getServerParameters(), Boolean.FALSE));
        PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
        if (zIsValidString) {
            pAGNativeRequest.setAdString(bidResponse);
        }
        NativeAdListener nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, getContext(activity), maxNativeAdAdapterListener);
        this.nativeAdListener = nativeAdListener;
        PAGNativeAd.loadAd(thirdPartyAdPlacementId, pAGNativeRequest, nativeAdListener);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        log(o2.r(new StringBuilder("Loading "), zIsValidString ? "bidding " : "", "rewarded ad for code id \"", thirdPartyAdPlacementId, "\"..."));
        PAGConfig.setUserData(createAdConfigData(maxAdapterResponseParameters.getServerParameters(), Boolean.FALSE));
        PAGRewardedRequest pAGRewardedRequest = new PAGRewardedRequest();
        if (zIsValidString) {
            pAGRewardedRequest.setAdString(bidResponse);
        }
        RewardedAdListener rewardedAdListener = new RewardedAdListener(thirdPartyAdPlacementId, maxRewardedAdapterListener);
        this.rewardedAdListener = rewardedAdListener;
        PAGRewardedAd.loadAd(thirdPartyAdPlacementId, pAGRewardedRequest, rewardedAdListener);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        this.interstitialAdListener = null;
        this.interstitialAd = null;
        this.appOpenAdListener = null;
        this.appOpenAd = null;
        this.rewardedAdListener = null;
        this.rewardedAd = null;
        PAGBannerAd pAGBannerAd = this.adViewAd;
        if (pAGBannerAd != null) {
            pAGBannerAd.destroy();
            this.adViewAd = null;
        }
        this.nativeAd = null;
        this.nativeAdListener = null;
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return Boolean.FALSE;
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldShowAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return Boolean.TRUE;
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad for code id \"" + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "\"...");
        this.interstitialAd.setAdInteractionListener(this.interstitialAdListener);
        this.interstitialAd.show(activity);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad for code id \"" + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "\"...");
        configureReward(maxAdapterResponseParameters);
        this.rewardedAd.setAdInteractionListener(this.rewardedAdListener);
        this.rewardedAd.show(activity);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        log(PtLatqAYjEFT.HFVTuUaEBjvBtW + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "\"...");
        this.appOpenAd.setAdInteractionListener(this.appOpenAdListener);
        this.appOpenAd.show(activity);
    }
}
