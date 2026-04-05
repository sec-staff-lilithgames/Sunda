package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.inneractive.BuildConfig;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.fyber.inneractive.sdk.external.BidTokenProvider;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class InneractiveMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private ViewGroup adViewGroup;
    private InneractiveAdSpot adViewSpot;
    private boolean hasGrantedReward;
    private InneractiveAdSpot interstitialSpot;
    private InneractiveAdSpot rewardedSpot;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.mediation.adapters.InneractiveMediationAdapter$10, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode;

        static {
            int[] iArr = new int[InneractiveErrorCode.values().length];
            $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode = iArr;
            try {
                iArr[InneractiveErrorCode.NO_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.SERVER_INTERNAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.SERVER_INVALID_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.SDK_INTERNAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.NATIVE_ADS_NOT_SUPPORTED_FOR_OS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.UNSUPPORTED_SPOT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.CANCELLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.CONNECTION_TIMEOUT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.LOAD_TIMEOUT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.IN_FLIGHT_TIMEOUT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.CONNECTION_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.UNKNOWN_APP_ID.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.INVALID_INPUT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.SDK_NOT_INITIALIZED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.SPOT_DISABLED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[InneractiveErrorCode.UNSPECIFIED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public InneractiveMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    private Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(InneractiveErrorCode inneractiveErrorCode) {
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        switch (AnonymousClass10.$SwitchMap$com$fyber$inneractive$sdk$external$InneractiveErrorCode[inneractiveErrorCode.ordinal()]) {
            case 1:
                maxAdapterError = MaxAdapterError.NO_FILL;
                break;
            case 2:
                maxAdapterError = MaxAdapterError.SERVER_ERROR;
                break;
            case 3:
                maxAdapterError = MaxAdapterError.BAD_REQUEST;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                break;
            case 9:
                maxAdapterError = MaxAdapterError.AD_NOT_READY;
                break;
            case 10:
            case 11:
            case 12:
                maxAdapterError = MaxAdapterError.TIMEOUT;
                break;
            case 13:
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
                break;
            case 18:
            case 19:
            case 20:
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                break;
        }
        return new MaxAdapterError(maxAdapterError, inneractiveErrorCode.ordinal(), inneractiveErrorCode.name());
    }

    private static void updateMuteState(Bundle bundle) {
        if (bundle.containsKey("is_muted")) {
            InneractiveAdManager.setMuteVideo(bundle.getBoolean("is_muted"));
        }
    }

    private void updateUserInfo(MaxAdapterParameters maxAdapterParameters) {
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            InneractiveAdManager.setGdprConsent(boolHasUserConsent.booleanValue());
        } else {
            InneractiveAdManager.clearGdprConsentData();
        }
        if (maxAdapterParameters.getConsentString() != null) {
            InneractiveAdManager.setGdprConsentString(maxAdapterParameters.getConsentString());
        }
        updateMuteState(maxAdapterParameters.getServerParameters());
        Boolean boolIsDoNotSell = maxAdapterParameters.isDoNotSell();
        if (boolIsDoNotSell != null) {
            InneractiveAdManager.setUSPrivacyString(boolIsDoNotSell.booleanValue() ? "1YY-" : "1YN-");
        } else {
            InneractiveAdManager.setUSPrivacyString("1---");
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updateUserInfo(maxAdapterSignalCollectionParameters);
        maxSignalCollectionListener.onSignalCollected(BidTokenProvider.getBidderToken());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return InneractiveAdManager.getVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) throws JSONException {
        if (!initialized.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        status = MaxAdapter.InitializationStatus.INITIALIZING;
        String string = maxAdapterInitializationParameters.getServerParameters().getString("app_id", null);
        log("Initializing Inneractive SDK with app id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        InneractiveAdManager.setMediationName("Max");
        InneractiveAdManager.setMediationVersion(AppLovinSdk.VERSION);
        InneractiveAdManager.initialize(getContext(activity), string, new OnFyberMarketplaceInitializedListener() { // from class: com.applovin.mediation.adapters.InneractiveMediationAdapter.1
            @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
            public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                if (fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                    InneractiveMediationAdapter.this.log("Inneractive SDK initialized");
                    MaxAdapter.InitializationStatus unused = InneractiveMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                    onCompletionListener.onCompletion(InneractiveMediationAdapter.status, null);
                } else {
                    InneractiveMediationAdapter.this.log("Inneractive SDK failed to initialize with error: " + fyberInitStatus);
                    MaxAdapter.InitializationStatus unused2 = InneractiveMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                    onCompletionListener.onCompletion(InneractiveMediationAdapter.status, fyberInitStatus.toString());
                }
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        StringBuilder sb2 = new StringBuilder("Loading ");
        sb2.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" ad for spot id \"");
        sb2.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        sb2.append("\"...");
        log(sb2.toString());
        updateUserInfo(maxAdapterResponseParameters);
        final InneractiveAdViewUnitController inneractiveAdViewUnitController = new InneractiveAdViewUnitController();
        inneractiveAdViewUnitController.setEventsListener(new InneractiveAdViewEventsListenerWithImpressionData() { // from class: com.applovin.mediation.adapters.InneractiveMediationAdapter.8
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("AdView clicked");
                maxAdViewAdapterListener.onAdViewAdClicked();
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
            public void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("AdView collapsed");
                maxAdViewAdapterListener.onAdViewAdCollapsed();
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
                MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, adDisplayError.toString());
                InneractiveMediationAdapter.this.log("AdView failed to show: " + maxAdapterError);
                maxAdViewAdapterListener.onAdViewAdDisplayFailed(maxAdapterError);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
            public void onAdExpanded(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("AdView expanded");
                maxAdViewAdapterListener.onAdViewAdExpanded();
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData
            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
                InneractiveMediationAdapter.this.log("AdView shown");
                String creativeId = impressionData.getCreativeId();
                if (TextUtils.isEmpty(creativeId)) {
                    maxAdViewAdapterListener.onAdViewAdDisplayed();
                } else {
                    maxAdViewAdapterListener.onAdViewAdDisplayed(e2.d(1, CampaignEx.JSON_KEY_CREATIVE_ID, creativeId));
                }
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
            public void onAdResized(InneractiveAdSpot inneractiveAdSpot) {
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            }
        });
        this.adViewGroup = new RelativeLayout(getContext(activity));
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        this.adViewSpot = inneractiveAdSpotCreateSpot;
        inneractiveAdSpotCreateSpot.addUnitController(inneractiveAdViewUnitController);
        this.adViewSpot.setRequestListener(new InneractiveAdSpot.RequestListener() { // from class: com.applovin.mediation.adapters.InneractiveMediationAdapter.9
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
                InneractiveMediationAdapter.this.log("AdView failed to load with Inneractive error: " + inneractiveErrorCode + " " + inneractiveErrorCode.toString());
                maxAdViewAdapterListener.onAdViewAdLoadFailed(InneractiveMediationAdapter.toMaxError(inneractiveErrorCode));
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
                ViewGroup viewGroup = InneractiveMediationAdapter.this.adViewGroup;
                if (viewGroup == null) {
                    InneractiveMediationAdapter.this.log("AdView container destroyed before it could be loaded");
                    maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INVALID_LOAD_STATE);
                } else if (!inneractiveAdSpot.isReady()) {
                    InneractiveMediationAdapter.this.log("AdView not ready");
                    maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.AD_NOT_READY);
                } else {
                    InneractiveMediationAdapter.this.log("AdView loaded");
                    inneractiveAdViewUnitController.bindView(viewGroup);
                    maxAdViewAdapterListener.onAdViewAdLoaded(viewGroup);
                }
            }
        });
        if (AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            this.adViewSpot.loadAd(maxAdapterResponseParameters.getBidResponse());
        } else {
            this.adViewSpot.requestAd(new InneractiveAdRequest(maxAdapterResponseParameters.getThirdPartyAdPlacementId()));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        StringBuilder sb2 = new StringBuilder("Loading ");
        sb2.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb2.append("interstitial ad for spot id \"");
        sb2.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        sb2.append("\"...");
        log(sb2.toString());
        updateUserInfo(maxAdapterResponseParameters);
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = new InneractiveFullscreenVideoContentController();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        inneractiveFullscreenUnitController.addContentController(inneractiveFullscreenVideoContentController);
        inneractiveFullscreenUnitController.setEventsListener(new InneractiveFullscreenAdEventsListenerWithImpressionData() { // from class: com.applovin.mediation.adapters.InneractiveMediationAdapter.2
            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("Interstitial clicked");
                maxInterstitialAdapterListener.onInterstitialAdClicked();
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
            public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("Interstitial hidden");
                maxInterstitialAdapterListener.onInterstitialAdHidden();
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
                MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, adDisplayError.toString());
                InneractiveMediationAdapter.this.log("Interstitial failed to show: " + maxAdapterError);
                maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(maxAdapterError);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData
            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
                InneractiveMediationAdapter.this.log("Interstitial shown");
                String creativeId = impressionData.getCreativeId();
                if (TextUtils.isEmpty(creativeId)) {
                    maxInterstitialAdapterListener.onInterstitialAdDisplayed();
                } else {
                    maxInterstitialAdapterListener.onInterstitialAdDisplayed(e2.d(1, CampaignEx.JSON_KEY_CREATIVE_ID, creativeId));
                }
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            }
        });
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        this.interstitialSpot = inneractiveAdSpotCreateSpot;
        inneractiveAdSpotCreateSpot.addUnitController(inneractiveFullscreenUnitController);
        this.interstitialSpot.setRequestListener(new InneractiveAdSpot.RequestListener() { // from class: com.applovin.mediation.adapters.InneractiveMediationAdapter.3
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
                MaxAdapterError maxError = InneractiveMediationAdapter.toMaxError(inneractiveErrorCode);
                InneractiveMediationAdapter.this.log("Interstitial failed to load with Inneractive error: " + maxError);
                maxInterstitialAdapterListener.onInterstitialAdLoadFailed(maxError);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("Interstitial loaded");
                maxInterstitialAdapterListener.onInterstitialAdLoaded();
            }
        });
        if (AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            this.interstitialSpot.loadAd(maxAdapterResponseParameters.getBidResponse());
        } else {
            this.interstitialSpot.requestAd(new InneractiveAdRequest(maxAdapterResponseParameters.getThirdPartyAdPlacementId()));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        StringBuilder sb2 = new StringBuilder("Loading ");
        sb2.append(AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "");
        sb2.append("rewarded ad for spot id \"");
        sb2.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        sb2.append("\"...");
        log(sb2.toString());
        updateUserInfo(maxAdapterResponseParameters);
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = new InneractiveFullscreenVideoContentController();
        inneractiveFullscreenVideoContentController.setEventsListener(new VideoContentListener() { // from class: com.applovin.mediation.adapters.InneractiveMediationAdapter.4
            @Override // com.fyber.inneractive.sdk.external.VideoContentListener
            public void onCompleted() {
                InneractiveMediationAdapter.this.log("Rewarded video completed");
            }

            @Override // com.fyber.inneractive.sdk.external.VideoContentListener
            public void onPlayerError() {
                InneractiveMediationAdapter.this.log("Rewarded video failed to display for unspecified error");
                maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
            }

            @Override // com.fyber.inneractive.sdk.external.VideoContentListener
            public void onProgress(int i10, int i11) {
                if (i11 == 0) {
                    InneractiveMediationAdapter.this.log("Rewarded video started");
                }
            }
        });
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        inneractiveFullscreenUnitController.addContentController(inneractiveFullscreenVideoContentController);
        inneractiveFullscreenUnitController.setEventsListener(new InneractiveFullscreenAdEventsListenerWithImpressionData() { // from class: com.applovin.mediation.adapters.InneractiveMediationAdapter.5
            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("Rewarded ad clicked");
                maxRewardedAdapterListener.onRewardedAdClicked();
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
            public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
                if (InneractiveMediationAdapter.this.hasGrantedReward || InneractiveMediationAdapter.this.shouldAlwaysRewardUser()) {
                    MaxReward reward = InneractiveMediationAdapter.this.getReward();
                    InneractiveMediationAdapter.this.log("Rewarded user with reward: " + reward);
                    maxRewardedAdapterListener.onUserRewarded(reward);
                }
                InneractiveMediationAdapter.this.log("Rewarded ad hidden");
                maxRewardedAdapterListener.onRewardedAdHidden();
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
                MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, adDisplayError.toString());
                InneractiveMediationAdapter.this.log("Rewarded ad failed to show: " + maxAdapterError);
                maxRewardedAdapterListener.onRewardedAdDisplayFailed(maxAdapterError);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData
            public void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
                InneractiveMediationAdapter.this.log("Rewarded ad shown");
                String creativeId = impressionData.getCreativeId();
                if (TextUtils.isEmpty(creativeId)) {
                    maxRewardedAdapterListener.onRewardedAdDisplayed();
                } else {
                    maxRewardedAdapterListener.onRewardedAdDisplayed(e2.d(1, CampaignEx.JSON_KEY_CREATIVE_ID, creativeId));
                }
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
            public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            }
        });
        inneractiveFullscreenUnitController.setRewardedListener(new InneractiveFullScreenAdRewardedListener() { // from class: com.applovin.mediation.adapters.InneractiveMediationAdapter.6
            @Override // com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener
            public void onAdRewarded(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("User earned reward.");
                InneractiveMediationAdapter.this.hasGrantedReward = true;
            }
        });
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        this.rewardedSpot = inneractiveAdSpotCreateSpot;
        inneractiveAdSpotCreateSpot.addUnitController(inneractiveFullscreenUnitController);
        this.rewardedSpot.setRequestListener(new InneractiveAdSpot.RequestListener() { // from class: com.applovin.mediation.adapters.InneractiveMediationAdapter.7
            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
                MaxAdapterError maxError = InneractiveMediationAdapter.toMaxError(inneractiveErrorCode);
                InneractiveMediationAdapter.this.log("Rewarded ad failed to load with Inneractive error: " + maxError);
                maxRewardedAdapterListener.onRewardedAdLoadFailed(maxError);
            }

            @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
            public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
                InneractiveMediationAdapter.this.log("Rewarded ad loaded");
                maxRewardedAdapterListener.onRewardedAdLoaded();
            }
        });
        if (AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            this.rewardedSpot.loadAd(maxAdapterResponseParameters.getBidResponse());
        } else {
            this.rewardedSpot.requestAd(new InneractiveAdRequest(maxAdapterResponseParameters.getThirdPartyAdPlacementId()));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        InneractiveAdSpot inneractiveAdSpot = this.interstitialSpot;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
            this.interstitialSpot = null;
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.rewardedSpot;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
            this.rewardedSpot = null;
        }
        InneractiveAdSpot inneractiveAdSpot3 = this.adViewSpot;
        if (inneractiveAdSpot3 != null) {
            inneractiveAdSpot3.destroy();
            this.adViewSpot = null;
        }
        this.adViewGroup = null;
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        if (this.interstitialSpot.isReady()) {
            ((InneractiveFullscreenUnitController) this.interstitialSpot.getSelectedUnitController()).show(activity);
            return;
        }
        log("Interstitial ad not ready");
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        if (this.rewardedSpot.isReady()) {
            configureReward(maxAdapterResponseParameters);
            ((InneractiveFullscreenUnitController) this.rewardedSpot.getSelectedUnitController()).show(activity);
        } else {
            log("Rewarded ad not ready");
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
        }
    }
}
