package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ao.n;
import com.applovin.impl.sdk.CoreSdk;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.moloco.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MolocoMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter, MaxNativeAdAdapter {
    private static MaxAdapter.InitializationStatus initializationStatus;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static final MediationInfo mediationInfo = new MediationInfo("MAX");
    private Banner adView;
    private InterstitialAd interstitialAd;
    private InterstitialAdListener interstitialAdListener;
    private NativeAd nativeAd;
    private RewardedInterstitialAd rewardedAd;
    private RewardedAdListener rewardedAdListener;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.mediation.adapters.MolocoMediationAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$AdCreateError;
        static final /* synthetic */ int[] $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType;

        static {
            int[] iArr = new int[MolocoAdError.AdCreateError.values().length];
            $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$AdCreateError = iArr;
            try {
                iArr[MolocoAdError.AdCreateError.SDK_INIT_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$AdCreateError[MolocoAdError.AdCreateError.UNABLE_TO_CREATE_AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$AdCreateError[MolocoAdError.AdCreateError.SDK_INIT_WAS_NOT_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[MolocoAdError.ErrorType.values().length];
            $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType = iArr2;
            try {
                iArr2[MolocoAdError.ErrorType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[MolocoAdError.ErrorType.SDK_INIT_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[MolocoAdError.ErrorType.AD_LOAD_FAILED_SDK_NOT_INIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[MolocoAdError.ErrorType.SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[MolocoAdError.ErrorType.SDK_INVALID_CONFIGURATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[MolocoAdError.ErrorType.AD_LOAD_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[MolocoAdError.ErrorType.AD_LOAD_LIMIT_REACHED.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[MolocoAdError.ErrorType.AD_SHOW_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[MolocoAdError.ErrorType.AD_SHOW_ERROR_ALREADY_DISPLAYING.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[MolocoAdError.ErrorType.AD_SHOW_ERROR_NOT_LOADED.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[MolocoAdError.ErrorType.AD_BID_PARSE_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[MolocoAdError.ErrorType.AD_LOAD_WEBVIEW_FAILED.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[MolocoAdError.ErrorType.AD_SIGNAL_COLLECTION_FAILED.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class InterstitialAdListener implements AdLoad.Listener, InterstitialAdShowListener {
        private final MaxInterstitialAdapterListener listener;

        public InterstitialAdListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(MolocoAd molocoAd) {
            MolocoMediationAdapter.this.log("Interstitial ad clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(MolocoAd molocoAd) {
            MolocoMediationAdapter.this.log("Interstitial ad hidden");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadFailed(MolocoAdError molocoAdError) {
            MaxAdapterError maxError = MolocoMediationAdapter.this.toMaxError(molocoAdError);
            MolocoMediationAdapter.this.log("Interstitial ad failed to load with error: " + maxError);
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadSuccess(MolocoAd molocoAd) {
            MolocoMediationAdapter.this.log("Interstitial ad loaded");
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(MolocoAdError molocoAdError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, molocoAdError.getErrorType().getErrorCode(), molocoAdError.getDescription());
            MolocoMediationAdapter.this.log("Interstitial ad failed to display with error: " + maxAdapterError);
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(MolocoAd molocoAd) {
            MolocoMediationAdapter.this.log("Interstitial ad displayed");
            this.listener.onInterstitialAdDisplayed();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class MaxMolocoNativeAd extends MaxNativeAd {
        public MaxMolocoNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            final NativeAd nativeAd = MolocoMediationAdapter.this.nativeAd;
            if (nativeAd == null) {
                MolocoMediationAdapter.this.e("Failed to register native ad view: native ad is null.");
                return false;
            }
            MolocoMediationAdapter.this.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
            Iterator<View> it = list.iterator();
            while (it.hasNext()) {
                it.next().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.mediation.adapters.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        nativeAd.handleGeneralAdClick();
                    }
                });
            }
            if (getFormat() != MaxAdFormat.NATIVE) {
                return true;
            }
            nativeAd.handleImpression();
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class NativeAdListener implements AdLoad.Listener, NativeAd.InteractionListener {
        private final Context context;
        private final MaxNativeAdAdapterListener listener;
        private final Bundle serverParameters;

        public NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.context = context;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadFailed(MolocoAdError molocoAdError) {
            MaxAdapterError maxError = MolocoMediationAdapter.this.toMaxError(molocoAdError);
            MolocoMediationAdapter.this.log("Native ad failed to load with error: " + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadSuccess(MolocoAd molocoAd) {
            NativeAd nativeAd = MolocoMediationAdapter.this.nativeAd;
            if (nativeAd == null) {
                MolocoMediationAdapter.this.e("Native ad is null");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
                return;
            }
            MolocoMediationAdapter.this.log("Native ad loaded");
            NativeAd.Assets assets = nativeAd.getAssets();
            if (assets == null) {
                MolocoMediationAdapter.this.e("Native ad assets object is null");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            if (AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) && TextUtils.isEmpty(assets.getTitle())) {
                MolocoMediationAdapter.this.e("Native ad (" + nativeAd + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            MaxNativeAd.Builder starRating = new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(assets.getTitle()).setBody(assets.getDescription()).setAdvertiser(assets.getSponsorText()).setCallToAction(assets.getCallToActionText()).setStarRating(assets.getRating() != null ? Double.valueOf(assets.getRating().doubleValue()) : null);
            if (assets.getIconUri() != null) {
                starRating.setIcon(new MaxNativeAd.MaxNativeAdImage(assets.getIconUri()));
            }
            if (assets.getMediaView() != null) {
                starRating.setMediaView(assets.getMediaView());
            } else if (assets.getMainImageUri() != null) {
                ImageView imageView = new ImageView(this.context);
                ImageViewUtils.setImageUri(imageView, assets.getMainImageUri(), (CoreSdk) null);
                starRating.setMediaView(imageView);
                starRating.setMainImage(new MaxNativeAd.MaxNativeAdImage(assets.getMainImageUri()));
            }
            this.listener.onNativeAdLoaded(MolocoMediationAdapter.this.new MaxMolocoNativeAd(starRating), null);
        }

        @Override // com.moloco.sdk.publisher.NativeAd.InteractionListener
        public void onGeneralClickHandled() {
            MolocoMediationAdapter.this.log("Native ad clicked");
            this.listener.onNativeAdClicked();
        }

        @Override // com.moloco.sdk.publisher.NativeAd.InteractionListener
        public void onImpressionHandled() {
            MolocoMediationAdapter.this.log("Native ad displayed");
            this.listener.onNativeAdDisplayed(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class NativeAdViewListener implements AdLoad.Listener, NativeAd.InteractionListener {
        private final MaxAdFormat adFormat;
        private final Context context;
        private final MaxAdViewAdapterListener listener;
        private final Bundle serverParameters;

        public NativeAdViewListener(MaxAdFormat maxAdFormat, MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormat = maxAdFormat;
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.context = context;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadFailed(MolocoAdError molocoAdError) {
            MaxAdapterError maxError = MolocoMediationAdapter.this.toMaxError(molocoAdError);
            MolocoMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadSuccess(MolocoAd molocoAd) {
            NativeAd nativeAd = MolocoMediationAdapter.this.nativeAd;
            if (nativeAd == null) {
                MolocoMediationAdapter.this.e("Native " + this.adFormat.getLabel() + " ad is null");
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
                return;
            }
            MolocoMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad loaded");
            NativeAd.Assets assets = nativeAd.getAssets();
            if (assets == null) {
                MolocoMediationAdapter.this.e("Native " + this.adFormat.getLabel() + " ad assets object is null");
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
                return;
            }
            MaxNativeAd.Builder starRating = new MaxNativeAd.Builder().setAdFormat(this.adFormat).setTitle(assets.getTitle()).setBody(assets.getDescription()).setAdvertiser(assets.getSponsorText()).setCallToAction(assets.getCallToActionText()).setStarRating(assets.getRating() != null ? Double.valueOf(assets.getRating().doubleValue()) : null);
            if (assets.getIconUri() != null) {
                starRating.setIcon(new MaxNativeAd.MaxNativeAdImage(assets.getIconUri()));
            }
            if (assets.getMediaView() != null) {
                starRating.setMediaView(assets.getMediaView());
            } else if (assets.getMainImageUri() != null) {
                ImageView imageView = new ImageView(this.context);
                ImageViewUtils.setImageUri(imageView, assets.getMainImageUri(), (CoreSdk) null);
                starRating.setMediaView(imageView);
                starRating.setMainImage(new MaxNativeAd.MaxNativeAdImage(assets.getMainImageUri()));
            }
            MaxMolocoNativeAd maxMolocoNativeAd = MolocoMediationAdapter.this.new MaxMolocoNativeAd(starRating);
            String string = BundleUtils.getString("template", "", this.serverParameters);
            if (!AppLovinSdkUtils.isValidString(string)) {
                string = "media_banner_template";
            }
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(maxMolocoNativeAd, string, MolocoMediationAdapter.this.getApplicationContext());
            maxMolocoNativeAd.prepareForInteraction(MolocoMediationAdapter.this.getClickableViews(maxNativeAdView), maxNativeAdView);
            this.listener.onAdViewAdLoaded(maxNativeAdView);
            MolocoMediationAdapter.this.nativeAd.handleImpression();
        }

        @Override // com.moloco.sdk.publisher.NativeAd.InteractionListener
        public void onGeneralClickHandled() {
            MolocoMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.moloco.sdk.publisher.NativeAd.InteractionListener
        public void onImpressionHandled() {
            MolocoMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad displayed");
            this.listener.onAdViewAdDisplayed();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class RewardedAdListener implements AdLoad.Listener, RewardedInterstitialAdShowListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(MolocoAd molocoAd) {
            MolocoMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(MolocoAd molocoAd) {
            if (this.hasGrantedReward || MolocoMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = MolocoMediationAdapter.this.getReward();
                MolocoMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            MolocoMediationAdapter.this.log("Rewarded ad hidden");
            this.listener.onRewardedAdHidden();
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadFailed(MolocoAdError molocoAdError) {
            MaxAdapterError maxError = MolocoMediationAdapter.this.toMaxError(molocoAdError);
            MolocoMediationAdapter.this.log("Rewarded ad failed to load with error: " + maxError);
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadSuccess(MolocoAd molocoAd) {
            MolocoMediationAdapter.this.log("Rewarded ad loaded");
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(MolocoAdError molocoAdError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, molocoAdError.getErrorType().getErrorCode(), molocoAdError.getDescription());
            MolocoMediationAdapter.this.log("Rewarded ad failed to display error: " + maxAdapterError);
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(MolocoAd molocoAd) {
            MolocoMediationAdapter.this.log("Rewarded ad displayed");
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
        public void onRewardedVideoCompleted(MolocoAd molocoAd) {
            MolocoMediationAdapter.this.log("Rewarded video completed");
        }

        @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
        public void onRewardedVideoStarted(MolocoAd molocoAd) {
            MolocoMediationAdapter.this.log("Rewarded video started");
        }

        @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
        public void onUserRewarded(MolocoAd molocoAd) {
            MolocoMediationAdapter.this.log("Rewarded video granted reward");
            this.hasGrantedReward = true;
        }
    }

    public MolocoMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<View> getClickableViews(MaxNativeAdView maxNativeAdView) {
        ArrayList arrayList = new ArrayList(6);
        if (maxNativeAdView.getTitleTextView() != null) {
            arrayList.add(maxNativeAdView.getTitleTextView());
        }
        if (maxNativeAdView.getAdvertiserTextView() != null) {
            arrayList.add(maxNativeAdView.getAdvertiserTextView());
        }
        if (maxNativeAdView.getBodyTextView() != null) {
            arrayList.add(maxNativeAdView.getBodyTextView());
        }
        if (maxNativeAdView.getCallToActionButton() != null) {
            arrayList.add(maxNativeAdView.getCallToActionButton());
        }
        if (maxNativeAdView.getIconImageView() != null) {
            arrayList.add(maxNativeAdView.getIconImageView());
        }
        if (maxNativeAdView.getMediaContentViewGroup() != null) {
            arrayList.add(maxNativeAdView.getMediaContentViewGroup());
        }
        return arrayList;
    }

    private Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$collectSignal$1(MaxSignalCollectionListener maxSignalCollectionListener, String str, MolocoAdError.ErrorType errorType) {
        if (errorType == null) {
            log("Signal collection successful");
            maxSignalCollectionListener.onSignalCollected(str);
        } else {
            log("Signal collection failed: " + errorType.getDescription());
            maxSignalCollectionListener.onSignalCollectionFailed(errorType.getDescription());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$0(MaxAdapter.OnCompletionListener onCompletionListener, MolocoInitStatus molocoInitStatus) {
        if (molocoInitStatus.getInitialization() == Initialization.SUCCESS) {
            log("Moloco SDK initialized");
            MaxAdapter.InitializationStatus initializationStatus2 = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
            initializationStatus = initializationStatus2;
            onCompletionListener.onCompletion(initializationStatus2, null);
            return;
        }
        log("Moloco SDK failed to initialize with error: " + molocoInitStatus.getDescription());
        MaxAdapter.InitializationStatus initializationStatus3 = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
        initializationStatus = initializationStatus3;
        onCompletionListener.onCompletion(initializationStatus3, molocoInitStatus.getDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x0 lambda$loadAdViewAd$4(MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener, MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, NativeAd nativeAd, MolocoAdError.AdCreateError adCreateError) {
        if (nativeAd == null) {
            MaxAdapterError maxError = toMaxError(adCreateError);
            log("Native " + maxAdFormat.getLabel() + " ad load failed with error (" + maxError + ')');
            maxAdViewAdapterListener.onAdViewAdLoadFailed(maxError);
        } else {
            this.nativeAd = nativeAd;
            NativeAdViewListener nativeAdViewListener = new NativeAdViewListener(maxAdFormat, maxAdapterResponseParameters, getContext(activity), maxAdViewAdapterListener);
            nativeAd.setInteractionListener(nativeAdViewListener);
            nativeAd.load(maxAdapterResponseParameters.getBidResponse(), nativeAdViewListener);
        }
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x0 lambda$loadAdViewAd$5(MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener, MaxAdapterResponseParameters maxAdapterResponseParameters, Banner banner, MolocoAdError.AdCreateError adCreateError) {
        if (banner == null) {
            MaxAdapterError maxError = toMaxError(adCreateError);
            log(maxAdFormat.getLabel() + " ad load failed with error (" + maxError + ')');
            maxAdViewAdapterListener.onAdViewAdLoadFailed(maxError);
        } else {
            this.adView = banner;
            AdViewAdListener adViewAdListener = new AdViewAdListener(maxAdViewAdapterListener);
            banner.setAdShowListener(adViewAdListener);
            banner.load(maxAdapterResponseParameters.getBidResponse(), adViewAdListener);
        }
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x0 lambda$loadInterstitialAd$2(MaxInterstitialAdapterListener maxInterstitialAdapterListener, MaxAdapterResponseParameters maxAdapterResponseParameters, InterstitialAd interstitialAd, MolocoAdError.AdCreateError adCreateError) {
        if (interstitialAd == null) {
            MaxAdapterError maxError = toMaxError(adCreateError);
            log("Interstitial ad load failed with error (" + maxError + ')');
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(maxError);
        } else {
            this.interstitialAd = interstitialAd;
            this.interstitialAdListener = new InterstitialAdListener(maxInterstitialAdapterListener);
            interstitialAd.load(maxAdapterResponseParameters.getBidResponse(), this.interstitialAdListener);
        }
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x0 lambda$loadNativeAd$6(MaxNativeAdAdapterListener maxNativeAdAdapterListener, MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, NativeAd nativeAd, MolocoAdError.AdCreateError adCreateError) {
        if (nativeAd == null) {
            MaxAdapterError maxError = toMaxError(adCreateError);
            log("Native ad load failed with error (" + maxError + ')');
            maxNativeAdAdapterListener.onNativeAdLoadFailed(maxError);
        } else {
            this.nativeAd = nativeAd;
            NativeAdListener nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, getContext(activity), maxNativeAdAdapterListener);
            nativeAd.setInteractionListener(nativeAdListener);
            nativeAd.load(maxAdapterResponseParameters.getBidResponse(), nativeAdListener);
        }
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ x0 lambda$loadRewardedAd$3(MaxRewardedAdapterListener maxRewardedAdapterListener, MaxAdapterResponseParameters maxAdapterResponseParameters, RewardedInterstitialAd rewardedInterstitialAd, MolocoAdError.AdCreateError adCreateError) {
        if (rewardedInterstitialAd == null) {
            MaxAdapterError maxError = toMaxError(adCreateError);
            log("Rewarded ad load failed with error (" + maxError + ')');
            maxRewardedAdapterListener.onRewardedAdLoadFailed(maxError);
        } else {
            this.rewardedAd = rewardedInterstitialAd;
            this.rewardedAdListener = new RewardedAdListener(maxRewardedAdapterListener);
            rewardedInterstitialAd.load(maxAdapterResponseParameters.getBidResponse(), this.rewardedAdListener);
        }
        return x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxAdapterError toMaxError(MolocoAdError molocoAdError) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        switch (AnonymousClass1.$SwitchMap$com$moloco$sdk$publisher$MolocoAdError$ErrorType[molocoAdError.getErrorType().ordinal()]) {
            case 2:
            case 3:
                maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
                break;
            case 4:
                maxAdapterError = MaxAdapterError.BAD_REQUEST;
                break;
            case 5:
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                break;
            case 6:
                maxAdapterError = MaxAdapterError.NO_FILL;
                break;
            case 7:
                maxAdapterError = MaxAdapterError.TIMEOUT;
                break;
            case 8:
                maxAdapterError = MaxAdapterError.AD_FREQUENCY_CAPPED;
                break;
            case 9:
            case 10:
                maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
                break;
            case 11:
                maxAdapterError = MaxAdapterError.AD_NOT_READY;
                break;
            case 12:
                maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                break;
            case 13:
                maxAdapterError = MaxAdapterError.WEBVIEW_ERROR;
                break;
            case 14:
                maxAdapterError = MaxAdapterError.SIGNAL_COLLECTION_TIMEOUT;
                break;
        }
        return new MaxAdapterError(maxAdapterError, molocoAdError.getErrorType().getErrorCode(), molocoAdError.getDescription());
    }

    private void updatePrivacyPreferences(MaxAdapterParameters maxAdapterParameters) {
        MolocoPrivacy.setPrivacy(new MolocoPrivacy.PrivacySettings(maxAdapterParameters.hasUserConsent(), null, maxAdapterParameters.isDoNotSell()));
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal");
        updatePrivacyPreferences(maxAdapterSignalCollectionParameters);
        Moloco.getBidToken(mediationInfo, getContext(activity), new n(7, this, maxSignalCollectionListener));
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return getVersionString(com.moloco.sdk.BuildConfig.class, "SDK_VERSION_NAME");
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(initializationStatus, null);
            return;
        }
        initializationStatus = MaxAdapter.InitializationStatus.INITIALIZING;
        Moloco.initialize(new MolocoInitParams(getContext(activity), maxAdapterInitializationParameters.getServerParameters().getString(MBridgeConstans.APP_KEY), mediationInfo), new n(8, this, onCompletionListener));
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb2 = new StringBuilder("Loading ");
        sb2.append(z10 ? "native " : "");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" ad: ");
        sb2.append(thirdPartyAdPlacementId);
        log(sb2.toString());
        updatePrivacyPreferences(maxAdapterResponseParameters);
        if (z10) {
            Moloco.createNativeAd(mediationInfo, thirdPartyAdPlacementId, null, new c(this, maxAdFormat, maxAdViewAdapterListener, maxAdapterResponseParameters, activity, 0));
            return;
        }
        d dVar = new d(this, maxAdFormat, maxAdViewAdapterListener, maxAdapterResponseParameters);
        if (maxAdFormat == MaxAdFormat.BANNER) {
            Moloco.createBanner(mediationInfo, thirdPartyAdPlacementId, null, dVar);
            return;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            Moloco.createBannerTablet(mediationInfo, thirdPartyAdPlacementId, null, dVar);
        } else if (maxAdFormat == MaxAdFormat.MREC) {
            Moloco.createMREC(mediationInfo, thirdPartyAdPlacementId, null, dVar);
        } else {
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading interstitial ad: " + thirdPartyAdPlacementId);
        updatePrivacyPreferences(maxAdapterResponseParameters);
        Moloco.createInterstitial(mediationInfo, thirdPartyAdPlacementId, null, new e(this, maxInterstitialAdapterListener, maxAdapterResponseParameters, 0));
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading native ad: " + thirdPartyAdPlacementId);
        updatePrivacyPreferences(maxAdapterResponseParameters);
        Moloco.createNativeAd(mediationInfo, thirdPartyAdPlacementId, null, new d(this, maxNativeAdAdapterListener, maxAdapterResponseParameters, activity));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded ad: " + thirdPartyAdPlacementId);
        updatePrivacyPreferences(maxAdapterResponseParameters);
        Moloco.createRewardedInterstitial(mediationInfo, thirdPartyAdPlacementId, null, new e(this, maxRewardedAdapterListener, maxAdapterResponseParameters, 1));
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.interstitialAd = null;
            this.interstitialAdListener = null;
        }
        RewardedInterstitialAd rewardedInterstitialAd = this.rewardedAd;
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.destroy();
            this.rewardedAd = null;
            this.rewardedAdListener = null;
        }
        Banner banner = this.adView;
        if (banner != null) {
            banner.destroy();
            this.adView = null;
        }
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.destroy();
            this.nativeAd = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        if (this.interstitialAd.isLoaded()) {
            this.interstitialAd.show(this.interstitialAdListener);
            return;
        }
        log("Unable to show interstitial - ad not ready");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        if (this.rewardedAd.isLoaded()) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show(this.rewardedAdListener);
        } else {
            log("Unable to show rewarded ad - ad not ready");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
        }
    }

    private MaxAdapterError toMaxError(MolocoAdError.AdCreateError adCreateError) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (adCreateError == null) {
            return maxAdapterError;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$moloco$sdk$publisher$MolocoAdError$AdCreateError[adCreateError.ordinal()];
        if (i10 == 1) {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        } else if (i10 == 2 || i10 == 3) {
            maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
        }
        return new MaxAdapterError(maxAdapterError, adCreateError.getErrorCode(), adCreateError.getDescription());
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class AdViewAdListener implements AdLoad.Listener, BannerAdShowListener {
        private final MaxAdViewAdapterListener listener;

        public AdViewAdListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(MolocoAd molocoAd) {
            MolocoMediationAdapter.this.log("AdView ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadFailed(MolocoAdError molocoAdError) {
            MaxAdapterError maxError = MolocoMediationAdapter.this.toMaxError(molocoAdError);
            MolocoMediationAdapter.this.log("AdView ad failed to load with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadSuccess(MolocoAd molocoAd) {
            MolocoMediationAdapter.this.log("AdView ad loaded");
            this.listener.onAdViewAdLoaded(MolocoMediationAdapter.this.adView);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(MolocoAdError molocoAdError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, molocoAdError.getErrorType().getErrorCode(), molocoAdError.getDescription());
            MolocoMediationAdapter.this.log("AdView ad failed to display with error: " + maxAdapterError);
            this.listener.onAdViewAdDisplayFailed(maxAdapterError);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(MolocoAd molocoAd) {
            MolocoMediationAdapter.this.log("AdView ad displayed");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(MolocoAd molocoAd) {
        }
    }
}
