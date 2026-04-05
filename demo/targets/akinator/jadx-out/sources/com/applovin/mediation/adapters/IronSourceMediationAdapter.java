package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.applovin.mediation.adapters.ironsource.BuildConfig;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class IronSourceMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static MaxAdapter.InitializationStatus status;
    private ISDemandOnlyBannerLayout adView;
    private String adViewPlacementIdentifier;
    private BannerAdView biddingAdView;
    private InterstitialAd biddingInterstitialAd;
    private BiddingInterstitialListener biddingInterstitialListener;
    private RewardedAd biddingRewardedAd;
    private BiddingRewardedListener biddingRewardedListener;
    private String mRouterPlacementIdentifier;
    private static final IronSourceRouter ROUTER = new IronSourceRouter();
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static final List<String> loadedAdViewPlacementIdentifiers = Collections.synchronizedList(new ArrayList());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class AdViewListener implements ISDemandOnlyBannerListener {
        private final MaxAdViewAdapterListener listener;

        public AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdClicked(String str) {
            IronSourceMediationAdapter.this.log("AdView ad clicked for instance ID: " + str);
            this.listener.onAdViewAdClicked();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdLeftApplication(String str) {
            IronSourceMediationAdapter.this.log("AdView ad left application for instance ID: " + str);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdLoadFailed(String str, IronSourceError ironSourceError) {
            MaxAdapterError maxError = IronSourceMediationAdapter.toMaxError(ironSourceError);
            IronSourceMediationAdapter.this.log("AdView ad failed to load for instance ID: " + str + " with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdLoaded(String str) {
            IronSourceMediationAdapter.this.log("AdView loaded for instance ID: " + str);
            this.listener.onAdViewAdLoaded(IronSourceMediationAdapter.this.adView);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdShown(String str) {
            IronSourceMediationAdapter.loadedAdViewPlacementIdentifiers.add(str);
            IronSourceMediationAdapter.this.log("AdView ad displayed for instance ID: " + str);
            this.listener.onAdViewAdDisplayed();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class BiddingAdViewListener implements BannerAdLoaderListener, BannerAdViewListener {
        private final MaxAdViewAdapterListener listener;

        public BiddingAdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        private Bundle createExtraInfo(BannerAdView bannerAdView) {
            String adId = bannerAdView.getAdInfo().getAdId();
            if (TextUtils.isEmpty(adId)) {
                return null;
            }
            return e2.d(1, CampaignEx.JSON_KEY_CREATIVE_ID, adId);
        }

        @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
        public void onBannerAdClicked(BannerAdView bannerAdView) {
            IronSourceMediationAdapter.this.log("AdView ad clicked");
            this.listener.onAdViewAdClicked(createExtraInfo(bannerAdView));
        }

        @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
        public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
            MaxAdapterError maxError = IronSourceMediationAdapter.toMaxError(ironSourceError);
            IronSourceMediationAdapter.this.log("AdView ad failed to load for bidding instance with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
        public void onBannerAdLoaded(BannerAdView bannerAdView) {
            IronSourceMediationAdapter.this.log("AdView loaded for instance ID: " + bannerAdView.getAdInfo().getInstanceId());
            IronSourceMediationAdapter.this.biddingAdView = bannerAdView;
            IronSourceMediationAdapter.this.biddingAdView.setListener(this);
            this.listener.onAdViewAdLoaded(IronSourceMediationAdapter.this.biddingAdView, createExtraInfo(bannerAdView));
        }

        @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
        public void onBannerAdShown(BannerAdView bannerAdView) {
            IronSourceMediationAdapter.this.log("AdView ad displayed");
            this.listener.onAdViewAdDisplayed(createExtraInfo(bannerAdView));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class BiddingInterstitialListener implements InterstitialAdLoaderListener, InterstitialAdListener {
        private final MaxInterstitialAdapterListener listener;

        public BiddingInterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        private Bundle createExtraInfo(InterstitialAd interstitialAd) {
            String adId = interstitialAd.getAdInfo().getAdId();
            if (TextUtils.isEmpty(adId)) {
                return null;
            }
            return e2.d(1, CampaignEx.JSON_KEY_CREATIVE_ID, adId);
        }

        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
        public void onInterstitialAdClicked(InterstitialAd interstitialAd) {
            IronSourceMediationAdapter.this.log("Interstitial ad clicked for bidding instance ID: " + interstitialAd.getAdInfo().getInstanceId());
            this.listener.onInterstitialAdClicked(createExtraInfo(interstitialAd));
        }

        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
        public void onInterstitialAdDismissed(InterstitialAd interstitialAd) {
            IronSourceMediationAdapter.this.log("Interstitial ad closed for bidding instance ID: " + interstitialAd.getAdInfo().getInstanceId());
            this.listener.onInterstitialAdHidden(createExtraInfo(interstitialAd));
        }

        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
        public void onInterstitialAdFailedToShow(InterstitialAd interstitialAd, IronSourceError ironSourceError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
            IronSourceMediationAdapter.this.log("Interstitial ad failed to show for bidding instance ID: " + interstitialAd.getAdInfo().getInstanceId() + " with error: " + maxAdapterError);
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError, createExtraInfo(interstitialAd));
        }

        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
        public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
            IronSourceMediationAdapter.this.log("Interstitial ad failed to load for bidding instance with error: " + ironSourceError);
            this.listener.onInterstitialAdLoadFailed(IronSourceMediationAdapter.toMaxError(ironSourceError));
        }

        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
        public void onInterstitialAdLoaded(InterstitialAd interstitialAd) {
            IronSourceMediationAdapter.this.log("Interstitial loaded for bidding instance ID: " + interstitialAd.getAdInfo().getInstanceId());
            IronSourceMediationAdapter.this.biddingInterstitialAd = interstitialAd;
            this.listener.onInterstitialAdLoaded(createExtraInfo(interstitialAd));
        }

        @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
        public void onInterstitialAdShown(InterstitialAd interstitialAd) {
            IronSourceMediationAdapter.this.log("Interstitial ad displayed for bidding instance ID: " + interstitialAd.getAdInfo().getInstanceId());
            this.listener.onInterstitialAdDisplayed(createExtraInfo(interstitialAd));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class BiddingRewardedListener implements RewardedAdLoaderListener, RewardedAdListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public BiddingRewardedListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        private Bundle createExtraInfo(RewardedAd rewardedAd) {
            String adId = rewardedAd.getAdInfo().getAdId();
            if (TextUtils.isEmpty(adId)) {
                return null;
            }
            return e2.d(1, CampaignEx.JSON_KEY_CREATIVE_ID, adId);
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
        public void onRewardedAdClicked(RewardedAd rewardedAd) {
            IronSourceMediationAdapter.this.log("Rewarded ad clicked for instance ID: " + rewardedAd.getAdInfo().getInstanceId());
            this.listener.onRewardedAdClicked(createExtraInfo(rewardedAd));
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
        public void onRewardedAdDismissed(RewardedAd rewardedAd) {
            if (this.hasGrantedReward || IronSourceMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = IronSourceMediationAdapter.this.getReward();
                IronSourceMediationAdapter.this.log("Rewarded ad rewarded user with reward: " + reward + " for instance ID: " + rewardedAd.getAdInfo().getInstanceId());
                this.listener.onUserRewarded(reward);
            }
            IronSourceMediationAdapter.this.log("Rewarded ad hidden for instance ID: " + rewardedAd.getAdInfo().getInstanceId());
            this.listener.onRewardedAdHidden(createExtraInfo(rewardedAd));
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
        public void onRewardedAdFailedToShow(RewardedAd rewardedAd, IronSourceError ironSourceError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
            IronSourceMediationAdapter.this.log("Rewarded ad failed to show for bidding instance ID: " + rewardedAd.getAdInfo().getInstanceId() + " with error: " + maxAdapterError);
            this.listener.onRewardedAdDisplayFailed(maxAdapterError, createExtraInfo(rewardedAd));
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
        public void onRewardedAdLoadFailed(IronSourceError ironSourceError) {
            IronSourceMediationAdapter.this.log("Rewarded ad failed to load for bidding instance with error: " + ironSourceError);
            this.listener.onRewardedAdLoadFailed(IronSourceMediationAdapter.toMaxError(ironSourceError));
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
        public void onRewardedAdLoaded(RewardedAd rewardedAd) {
            IronSourceMediationAdapter.this.log("Rewarded ad loaded for bidding instance ID: " + rewardedAd.getAdInfo().getInstanceId());
            IronSourceMediationAdapter.this.biddingRewardedAd = rewardedAd;
            this.listener.onRewardedAdLoaded(createExtraInfo(rewardedAd));
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
        public void onRewardedAdShown(RewardedAd rewardedAd) {
            IronSourceMediationAdapter.this.log("Rewarded ad shown for bidding instance ID: " + rewardedAd.getAdInfo().getInstanceId());
            this.listener.onRewardedAdDisplayed(createExtraInfo(rewardedAd));
        }

        @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
        public void onUserEarnedReward(RewardedAd rewardedAd) {
            IronSourceMediationAdapter.this.log("Rewarded ad granted reward for instance ID: " + rewardedAd.getAdInfo().getInstanceId());
            this.hasGrantedReward = true;
        }
    }

    public IronSourceMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    private List<IronSourceAds.AdFormat> getAdFormatsToInitialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters) {
        ArrayList<String> stringArrayList = maxAdapterInitializationParameters.getServerParameters().getStringArrayList("init_ad_formats");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return Arrays.asList(IronSourceAds.AdFormat.INTERSTITIAL, IronSourceAds.AdFormat.REWARDED, IronSourceAds.AdFormat.BANNER);
        }
        ArrayList arrayList = new ArrayList();
        if (stringArrayList.contains("inter")) {
            arrayList.add(IronSourceAds.AdFormat.INTERSTITIAL);
        }
        if (stringArrayList.contains("rewarded")) {
            arrayList.add(IronSourceAds.AdFormat.REWARDED);
        }
        if (stringArrayList.contains("banner")) {
            arrayList.add(IronSourceAds.AdFormat.BANNER);
        }
        return arrayList;
    }

    private long getAdapterVersionCode() throws NumberFormatException {
        int i10;
        long j10;
        long j11 = 0;
        for (String str : getAdapterVersion().replaceAll("[^0-9.]", "").split("\\.")) {
            long j12 = j11 * 100;
            if (j12 != 0 && str.length() > 2) {
                i10 = Integer.parseInt(str.substring(0, 2));
            } else if (str.isEmpty()) {
                j10 = 0;
                j11 = j12 + j10;
            } else {
                i10 = Integer.parseInt(str);
            }
            j10 = i10;
            j11 = j12 + j10;
        }
        return j11;
    }

    private void setPrivacySettings(MaxAdapterParameters maxAdapterParameters) {
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            IronSourceAds.setConsent(boolHasUserConsent.booleanValue());
        }
    }

    private AdSize toISAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.banner();
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.leaderboard();
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.mediumRectangle();
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    private ISBannerSize toISBannerSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return ISBannerSize.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return ISBannerSize.LARGE;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return ISBannerSize.RECTANGLE;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.applovin.mediation.adapter.MaxAdapterError toMaxError(com.ironsource.mediationsdk.logger.IronSourceError r3) {
        /*
            int r0 = r3.getErrorCode()
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
            r2 = 501(0x1f5, float:7.02E-43)
            if (r0 == r2) goto L57
            r2 = 502(0x1f6, float:7.03E-43)
            if (r0 == r2) goto L57
            r2 = 505(0x1f9, float:7.08E-43)
            if (r0 == r2) goto L57
            r2 = 506(0x1fa, float:7.09E-43)
            if (r0 == r2) goto L57
            r2 = 526(0x20e, float:7.37E-43)
            if (r0 == r2) goto L54
            r2 = 527(0x20f, float:7.38E-43)
            if (r0 == r2) goto L51
            r2 = 1060(0x424, float:1.485E-42)
            if (r0 == r2) goto L51
            r2 = 1061(0x425, float:1.487E-42)
            if (r0 == r2) goto L51
            switch(r0) {
                case 1: goto L51;
                case 520: goto L4e;
                case 600: goto L4b;
                case 601: goto L4b;
                case 602: goto L4b;
                case 603: goto L4b;
                case 604: goto L54;
                case 605: goto L51;
                case 606: goto L48;
                case 607: goto L4b;
                case 608: goto L45;
                case 609: goto L45;
                case 610: goto L51;
                case 611: goto L51;
                case 612: goto L4b;
                case 613: goto L51;
                case 614: goto L51;
                case 615: goto L57;
                case 616: goto L57;
                case 621: goto L48;
                case 1010: goto L4b;
                case 1158: goto L48;
                case 7001: goto L4b;
                case 7002: goto L4b;
                case 7003: goto L4b;
                case 7004: goto L4b;
                case 7101: goto L51;
                case 7102: goto L51;
                case 7103: goto L51;
                case 7104: goto L51;
                case 7105: goto L57;
                case 7106: goto L57;
                case 7107: goto L57;
                case 7108: goto L57;
                case 7109: goto L57;
                case 7110: goto L57;
                case 7111: goto L57;
                case 7112: goto L57;
                case 7113: goto L45;
                case 7115: goto L4b;
                case 7116: goto L57;
                case 7117: goto L57;
                case 7118: goto L57;
                case 7201: goto L51;
                case 7202: goto L42;
                default: goto L29;
            }
        L29:
            switch(r0) {
                case 508: goto L4b;
                case 509: goto L48;
                case 510: goto L59;
                default: goto L2c;
            }
        L2c:
            switch(r0) {
                case 1000: goto L51;
                case 1001: goto L51;
                case 1002: goto L51;
                case 1003: goto L51;
                case 1004: goto L51;
                case 1005: goto L51;
                case 1006: goto L3f;
                case 1007: goto L51;
                case 1008: goto L51;
                default: goto L2f;
            }
        L2f:
            switch(r0) {
                case 1020: goto L57;
                case 1021: goto L57;
                case 1022: goto L3c;
                case 1023: goto L3c;
                case 1024: goto L48;
                default: goto L32;
            }
        L32:
            switch(r0) {
                case 1026: goto L3c;
                case 1027: goto L3c;
                case 1028: goto L51;
                case 1029: goto L57;
                case 1030: goto L51;
                case 1031: goto L57;
                case 1032: goto L45;
                case 1033: goto L45;
                case 1034: goto L51;
                case 1035: goto L48;
                case 1036: goto L3c;
                case 1037: goto L3c;
                case 1038: goto L51;
                case 1039: goto L51;
                case 1040: goto L51;
                case 1041: goto L51;
                default: goto L35;
            }
        L35:
            switch(r0) {
                case 1050: goto L3c;
                case 1051: goto L42;
                case 1052: goto L45;
                case 1053: goto L3c;
                case 1054: goto L42;
                case 1055: goto L45;
                case 1056: goto L3c;
                case 1057: goto L39;
                case 1058: goto L48;
                default: goto L38;
            }
        L38:
            goto L59
        L39:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.AD_EXPIRED
            goto L59
        L3c:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_LOAD_STATE
            goto L59
        L3f:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.SIGNAL_COLLECTION_TIMEOUT
            goto L59
        L42:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.AD_NOT_READY
            goto L59
        L45:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.TIMEOUT
            goto L59
        L48:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL
            goto L59
        L4b:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NOT_INITIALIZED
            goto L59
        L4e:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_CONNECTION
            goto L59
        L51:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR
            goto L59
        L54:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.AD_FREQUENCY_CAPPED
            goto L59
        L57:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION
        L59:
            com.applovin.mediation.adapter.MaxAdapterError r2 = new com.applovin.mediation.adapter.MaxAdapterError
            java.lang.String r3 = r3.getErrorMessage()
            r2.<init>(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.IronSourceMediationAdapter.toMaxError(com.ironsource.mediationsdk.logger.IronSourceError):com.applovin.mediation.adapter.MaxAdapterError");
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        setPrivacySettings(maxAdapterSignalCollectionParameters);
        maxSignalCollectionListener.onSignalCollected(IronSource.getISDemandOnlyBiddingData(getApplicationContext()));
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return IronSourceAds.getSdkVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) throws JSONException {
        if (!INITIALIZED.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(status, null);
            return;
        }
        status = MaxAdapter.InitializationStatus.INITIALIZING;
        String string = maxAdapterInitializationParameters.getServerParameters().getString(MBridgeConstans.APP_KEY);
        log("Initializing IronSource SDK with app key: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        IronSource.setMediationType("MAX" + getAdapterVersionCode() + "SDK" + AppLovinSdk.VERSION_CODE);
        setPrivacySettings(maxAdapterInitializationParameters);
        Boolean boolIsDoNotSell = maxAdapterInitializationParameters.isDoNotSell();
        if (boolIsDoNotSell != null) {
            IronSourceAds.setMetaData(com.ironsource.mediationsdk.metadata.a.f37595a, Boolean.toString(boolIsDoNotSell.booleanValue()));
        }
        IronSourceAds.enableDebugMode(maxAdapterInitializationParameters.isTesting());
        IronSourceRouter ironSourceRouter = ROUTER;
        IronSource.setISDemandOnlyInterstitialListener(ironSourceRouter);
        IronSource.setISDemandOnlyRewardedVideoListener(ironSourceRouter);
        IronSourceAds.init(getApplicationContext(), new InitRequest.Builder(string).withLegacyAdFormats(getAdFormatsToInitialize(maxAdapterInitializationParameters)).build(), new InitListener() { // from class: com.applovin.mediation.adapters.IronSourceMediationAdapter.1
            @Override // com.unity3d.ironsourceads.InitListener
            public void onInitFailed(IronSourceError ironSourceError) {
                IronSourceMediationAdapter.this.log("Failed to initialize IronSource SDK with error: " + ironSourceError);
                MaxAdapter.InitializationStatus unused = IronSourceMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                onCompletionListener.onCompletion(IronSourceMediationAdapter.status, ironSourceError.getErrorMessage());
            }

            @Override // com.unity3d.ironsourceads.InitListener
            public void onInitSuccess() {
                IronSourceMediationAdapter.this.log("IronSource SDK initialized.");
                MaxAdapter.InitializationStatus unused = IronSourceMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                onCompletionListener.onCompletion(IronSourceMediationAdapter.status, null);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        setPrivacySettings(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        StringBuilder sb2 = new StringBuilder("Loading ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" ad for instance ID: ");
        sb2.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        log(sb2.toString());
        if (zIsValidString) {
            BannerAdLoader.loadAd(new BannerAdRequest.Builder(getApplicationContext(), maxAdapterResponseParameters.getThirdPartyAdPlacementId(), bidResponse, toISAdSize(maxAdFormat)).build(), new BiddingAdViewListener(maxAdViewAdapterListener));
            return;
        }
        if (activity == null) {
            log(maxAdFormat.getLabel() + " ad load failed: Activity is null");
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.MISSING_ACTIVITY);
            return;
        }
        if (!loadedAdViewPlacementIdentifiers.contains(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            this.adViewPlacementIdentifier = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutCreateBannerForDemandOnly = IronSource.createBannerForDemandOnly(activity, toISBannerSize(maxAdFormat));
            this.adView = iSDemandOnlyBannerLayoutCreateBannerForDemandOnly;
            iSDemandOnlyBannerLayoutCreateBannerForDemandOnly.setBannerDemandOnlyListener(new AdViewListener(maxAdViewAdapterListener));
            IronSource.loadISDemandOnlyBanner(activity, this.adView, this.adViewPlacementIdentifier);
            return;
        }
        log("AdView ad failed to load for instance ID: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + ". An ad with the same instance ID is already loaded");
        MaxAdapterError maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        maxAdViewAdapterListener.onAdViewAdLoadFailed(new MaxAdapterError(maxAdapterError.getCode(), maxAdapterError.getMessage(), 0, "An ad with the same instance ID is already loaded"));
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) throws Throwable {
        setPrivacySettings(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Loading ironSource ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append("interstitial for instance ID: ");
        sb2.append(thirdPartyAdPlacementId);
        log(sb2.toString());
        if (zIsValidString) {
            InterstitialAdRequest interstitialAdRequestBuild = new InterstitialAdRequest.Builder(thirdPartyAdPlacementId, bidResponse).build();
            BiddingInterstitialListener biddingInterstitialListener = new BiddingInterstitialListener(maxInterstitialAdapterListener);
            this.biddingInterstitialListener = biddingInterstitialListener;
            InterstitialAdLoader.loadAd(interstitialAdRequestBuild, biddingInterstitialListener);
            return;
        }
        String interstitialRouterIdentifier = IronSourceRouter.getInterstitialRouterIdentifier(thirdPartyAdPlacementId);
        this.mRouterPlacementIdentifier = interstitialRouterIdentifier;
        IronSourceRouter ironSourceRouter = ROUTER;
        ironSourceRouter.addInterstitialAdapter(this, maxInterstitialAdapterListener, interstitialRouterIdentifier);
        if (!IronSource.isISDemandOnlyInterstitialReady(thirdPartyAdPlacementId)) {
            IronSource.loadISDemandOnlyInterstitial(activity, thirdPartyAdPlacementId);
            return;
        }
        log("Ad is available already for instance ID: " + thirdPartyAdPlacementId);
        ironSourceRouter.onAdLoaded(this.mRouterPlacementIdentifier);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) throws Throwable {
        setPrivacySettings(maxAdapterResponseParameters);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Loading ironSource ");
        sb2.append(zIsValidString ? "bidding " : "");
        sb2.append("rewarded for instance ID: ");
        sb2.append(thirdPartyAdPlacementId);
        log(sb2.toString());
        if (zIsValidString) {
            RewardedAdRequest rewardedAdRequestBuild = new RewardedAdRequest.Builder(thirdPartyAdPlacementId, bidResponse).build();
            BiddingRewardedListener biddingRewardedListener = new BiddingRewardedListener(maxRewardedAdapterListener);
            this.biddingRewardedListener = biddingRewardedListener;
            RewardedAdLoader.loadAd(rewardedAdRequestBuild, biddingRewardedListener);
            return;
        }
        String rewardedVideoRouterIdentifier = IronSourceRouter.getRewardedVideoRouterIdentifier(thirdPartyAdPlacementId);
        this.mRouterPlacementIdentifier = rewardedVideoRouterIdentifier;
        IronSourceRouter ironSourceRouter = ROUTER;
        ironSourceRouter.addRewardedAdapter(this, maxRewardedAdapterListener, rewardedVideoRouterIdentifier);
        if (!IronSource.isISDemandOnlyRewardedVideoAvailable(thirdPartyAdPlacementId)) {
            IronSource.loadISDemandOnlyRewardedVideo(activity, thirdPartyAdPlacementId);
            return;
        }
        log("Ad is available already for instance ID: " + thirdPartyAdPlacementId);
        ironSourceRouter.onAdLoaded(this.mRouterPlacementIdentifier);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        if (this.adViewPlacementIdentifier != null) {
            log("Destroying adview with instance ID: " + this.adViewPlacementIdentifier);
            IronSource.destroyISDemandOnlyBanner(this.adViewPlacementIdentifier);
            loadedAdViewPlacementIdentifiers.remove(this.adViewPlacementIdentifier);
        }
        ROUTER.removeAdapter(this, this.mRouterPlacementIdentifier);
        BannerAdView bannerAdView = this.biddingAdView;
        if (bannerAdView != null) {
            bannerAdView.setListener(null);
            this.biddingAdView = null;
        }
        InterstitialAd interstitialAd = this.biddingInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setListener(null);
            this.biddingInterstitialAd = null;
        }
        RewardedAd rewardedAd = this.biddingRewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setListener(null);
            this.biddingRewardedAd = null;
        }
        this.biddingInterstitialListener = null;
        this.biddingRewardedListener = null;
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing ironSource interstitial for instance ID: " + thirdPartyAdPlacementId);
        if (!zIsValidString) {
            IronSourceRouter ironSourceRouter = ROUTER;
            ironSourceRouter.addShowingAdapter(this);
            if (IronSource.isISDemandOnlyInterstitialReady(thirdPartyAdPlacementId)) {
                IronSource.showISDemandOnlyInterstitial(thirdPartyAdPlacementId);
                return;
            }
            log("Unable to show ironSource interstitial - no ad loaded for instance ID: " + thirdPartyAdPlacementId);
            String interstitialRouterIdentifier = IronSourceRouter.getInterstitialRouterIdentifier(thirdPartyAdPlacementId);
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            ironSourceRouter.onAdDisplayFailed(interstitialRouterIdentifier, new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        InterstitialAd interstitialAd = this.biddingInterstitialAd;
        if (interstitialAd == null || !interstitialAd.isReadyToShow()) {
            log("Unable to show ironSource interstitial - ad is not ready for instance ID: " + thirdPartyAdPlacementId);
            MaxAdapterError maxAdapterError3 = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError4 = MaxAdapterError.AD_NOT_READY;
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError3, maxAdapterError4.getCode(), maxAdapterError4.getMessage()));
            return;
        }
        if (activity == null) {
            log("Interstitial ad display failed: Activity is null");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.biddingInterstitialAd.setListener(this.biddingInterstitialListener);
            this.biddingInterstitialAd.show(activity);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing ironSource rewarded for instance ID: " + thirdPartyAdPlacementId);
        if (!zIsValidString) {
            IronSourceRouter ironSourceRouter = ROUTER;
            ironSourceRouter.addShowingAdapter(this);
            if (IronSource.isISDemandOnlyRewardedVideoAvailable(thirdPartyAdPlacementId)) {
                configureReward(maxAdapterResponseParameters);
                IronSource.showISDemandOnlyRewardedVideo(thirdPartyAdPlacementId);
                return;
            }
            log("Unable to show ironSource rewarded - no ad loaded...");
            String rewardedVideoRouterIdentifier = IronSourceRouter.getRewardedVideoRouterIdentifier(thirdPartyAdPlacementId);
            MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
            ironSourceRouter.onAdDisplayFailed(rewardedVideoRouterIdentifier, new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
            return;
        }
        RewardedAd rewardedAd = this.biddingRewardedAd;
        if (rewardedAd == null || !rewardedAd.isReadyToShow()) {
            log("Unable to show ironSource rewarded - ad is not ready for instance ID: " + thirdPartyAdPlacementId);
            MaxAdapterError maxAdapterError3 = MaxAdapterError.AD_DISPLAY_FAILED;
            MaxAdapterError maxAdapterError4 = MaxAdapterError.AD_NOT_READY;
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError3, maxAdapterError4.getCode(), maxAdapterError4.getMessage()));
            return;
        }
        if (activity == null) {
            log("Rewarded ad display failed: Activity is null");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.MISSING_ACTIVITY);
        } else {
            configureReward(maxAdapterResponseParameters);
            this.biddingRewardedAd.setListener(this.biddingRewardedListener);
            this.biddingRewardedAd.show(activity);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class IronSourceRouter extends MediationAdapterRouter implements ISDemandOnlyInterstitialListener, ISDemandOnlyRewardedVideoListener {
        private boolean hasGrantedReward;

        private IronSourceRouter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String getInterstitialRouterIdentifier(String str) {
            StringBuilder sbS = a.b.s(str, '-');
            sbS.append(IronSourceAds.AdFormat.INTERSTITIAL);
            return sbS.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String getRewardedVideoRouterIdentifier(String str) {
            StringBuilder sbS = a.b.s(str, '-');
            sbS.append(IronSourceAds.AdFormat.REWARDED);
            return sbS.toString();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public void onInterstitialAdClicked(String str) {
            log("Interstitial ad clicked for instance ID: " + str);
            onAdClicked(getInterstitialRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public void onInterstitialAdClosed(String str) {
            log("Interstitial ad closed for instance ID: " + str);
            onAdHidden(getInterstitialRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
            log("Interstitial ad failed to load for instance ID: " + str + " with error: " + ironSourceError);
            onAdLoadFailed(getInterstitialRouterIdentifier(str), IronSourceMediationAdapter.toMaxError(ironSourceError));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public void onInterstitialAdOpened(String str) {
            log("Interstitial ad displayed for instance ID: " + str);
            onAdDisplayed(getInterstitialRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public void onInterstitialAdReady(String str) {
            log("Interstitial loaded for instance ID: " + str);
            onAdLoaded(getInterstitialRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
        public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
            log("Interstitial ad failed to show for instance ID: " + str + " with error: " + maxAdapterError);
            onAdDisplayFailed(getInterstitialRouterIdentifier(str), maxAdapterError);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdClicked(String str) {
            log("Rewarded ad clicked for instance ID: " + str);
            onAdClicked(getRewardedVideoRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdClosed(String str) {
            String rewardedVideoRouterIdentifier = getRewardedVideoRouterIdentifier(str);
            if (this.hasGrantedReward || shouldAlwaysRewardUser(rewardedVideoRouterIdentifier)) {
                MaxReward reward = getReward(rewardedVideoRouterIdentifier);
                log("Rewarded  ad rewarded user with reward: " + reward + " for instance ID: " + str);
                onUserRewarded(rewardedVideoRouterIdentifier, reward);
            }
            log("Rewarded ad hidden for instance ID: " + str);
            onAdHidden(rewardedVideoRouterIdentifier);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
            log("Rewarded ad failed to load for instance ID: " + str);
            onAdLoadFailed(getRewardedVideoRouterIdentifier(str), IronSourceMediationAdapter.toMaxError(ironSourceError));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdLoadSuccess(String str) {
            log("Rewarded ad loaded for instance ID: " + str);
            onAdLoaded(getRewardedVideoRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdOpened(String str) {
            log("Rewarded ad shown for instance ID: " + str);
            onAdDisplayed(getRewardedVideoRouterIdentifier(str));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdRewarded(String str) {
            log("Rewarded ad granted reward for instance ID: " + str);
            this.hasGrantedReward = true;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
        public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
            log("Rewarded ad failed to show for instance ID: " + str + " with error: " + maxAdapterError);
            onAdDisplayFailed(getRewardedVideoRouterIdentifier(str), maxAdapterError);
        }

        @Override // com.applovin.mediation.adapters.MediationAdapterRouter
        public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        }
    }
}
