package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import ao.n;
import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class GoogleAdManagerMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxAppOpenAdapter, MaxRewardedAdapter, MaxAdViewAdapter, MaxNativeAdAdapter {
    private static final String ADAPTIVE_BANNER_TYPE_INLINE = "inline";
    private static final int ADVERTISER_VIEW_TAG = 8;
    private static final int BODY_VIEW_TAG = 4;
    private static final int CALL_TO_ACTION_VIEW_TAG = 5;
    private static final int ICON_VIEW_TAG = 3;
    private static final int MEDIA_VIEW_CONTAINER_TAG = 2;
    private static final int TITLE_LABEL_TAG = 1;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private AdManagerAdView adView;
    private AppOpenAd appOpenAd;
    private AppOpenAdListener appOpenAdListener;
    private AdManagerInterstitialAd interstitialAd;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;
    private RewardedAd rewardedAd;
    private RewardedAdListener rewardedAdListener;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class AdViewListener extends AdListener {
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;
        final String placementId;

        public AdViewListener(String str, MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.placementId = str;
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            GoogleAdManagerMediationAdapter.this.log(this.adFormat.getLabel() + " ad closed");
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            MaxAdapterError maxError = GoogleAdManagerMediationAdapter.toMaxError(loadAdError);
            GoogleAdManagerMediationAdapter googleAdManagerMediationAdapter = GoogleAdManagerMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder();
            e2.w(this.adFormat, sb2, " ad (");
            sb2.append(this.placementId);
            sb2.append(") failed to load with error code: ");
            sb2.append(maxError);
            googleAdManagerMediationAdapter.log(sb2.toString());
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            GoogleAdManagerMediationAdapter googleAdManagerMediationAdapter = GoogleAdManagerMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder();
            e2.w(this.adFormat, sb2, " ad shown: ");
            sb2.append(this.placementId);
            googleAdManagerMediationAdapter.log(sb2.toString());
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            GoogleAdManagerMediationAdapter googleAdManagerMediationAdapter = GoogleAdManagerMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder();
            e2.w(this.adFormat, sb2, " ad loaded: ");
            sb2.append(this.placementId);
            googleAdManagerMediationAdapter.log(sb2.toString());
            Bundle bundle = new Bundle(3);
            ResponseInfo responseInfo = GoogleAdManagerMediationAdapter.this.adView.getResponseInfo();
            String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
            if (AppLovinSdkUtils.isValidString(responseId)) {
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, responseId);
            }
            AdSize adSize = GoogleAdManagerMediationAdapter.this.adView.getAdSize();
            if (adSize != null) {
                bundle.putInt("ad_width", adSize.getWidth());
                bundle.putInt("ad_height", adSize.getHeight());
            }
            this.listener.onAdViewAdLoaded(GoogleAdManagerMediationAdapter.this.adView, bundle);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            GoogleAdManagerMediationAdapter.this.log(this.adFormat.getLabel() + " ad opened");
            this.listener.onAdViewAdClicked();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class AppOpenAdListener extends FullScreenContentCallback {
        private final MaxAppOpenAdapterListener listener;
        private final String placementId;

        public AppOpenAdListener(String str, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
            this.placementId = str;
            this.listener = maxAppOpenAdapterListener;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            GoogleAdManagerMediationAdapter.this.log("App open ad clicked: " + this.placementId);
            this.listener.onAppOpenAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            GoogleAdManagerMediationAdapter.this.log("App open ad hidden: " + this.placementId);
            this.listener.onAppOpenAdHidden();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getCode(), adError.getMessage());
            GoogleAdManagerMediationAdapter.this.log("App open ad (" + this.placementId + ") failed to show with error: " + maxAdapterError);
            this.listener.onAppOpenAdDisplayFailed(maxAdapterError);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            GoogleAdManagerMediationAdapter.this.log("App open ad impression recorded: " + this.placementId);
            this.listener.onAppOpenAdDisplayed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            GoogleAdManagerMediationAdapter.this.log("App open ad shown: " + this.placementId);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class AutoMeasuringMediaView extends MediaView {
        public AutoMeasuringMediaView(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$requestLayout$0() {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            layout(getLeft(), getTop(), getRight(), getBottom());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            requestLayout();
        }

        @Override // android.view.View, android.view.ViewParent
        public void requestLayout() {
            super.requestLayout();
            post(new a(this, 0));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class InterstitialAdListener extends FullScreenContentCallback {
        private final MaxInterstitialAdapterListener listener;
        private final String placementId;

        public InterstitialAdListener(String str, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.placementId = str;
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            GoogleAdManagerMediationAdapter.this.log("Interstitial ad clicked: " + this.placementId);
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            GoogleAdManagerMediationAdapter.this.log("Interstitial ad hidden: " + this.placementId);
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getCode(), adError.getMessage());
            GoogleAdManagerMediationAdapter.this.log("Interstitial ad (" + this.placementId + ") failed to show with error: " + maxAdapterError);
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            GoogleAdManagerMediationAdapter.this.log("Interstitial ad impression recorded: " + this.placementId);
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            GoogleAdManagerMediationAdapter.this.log("Interstitial ad shown: " + this.placementId);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class MaxGoogleAdManagerNativeAd extends MaxNativeAd {
        public MaxGoogleAdManagerNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            MediaView mediaView;
            MediaContent mediaContent;
            NativeAd nativeAd = GoogleAdManagerMediationAdapter.this.nativeAd;
            if (nativeAd == null) {
                GoogleAdManagerMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            GoogleAdManagerMediationAdapter.this.nativeAdView = new NativeAdView(viewGroup.getContext());
            if (viewGroup instanceof MaxNativeAdView) {
                MaxNativeAdView maxNativeAdView = (MaxNativeAdView) viewGroup;
                View mainView = maxNativeAdView.getMainView();
                maxNativeAdView.removeView(mainView);
                GoogleAdManagerMediationAdapter.this.nativeAdView.addView(mainView);
                maxNativeAdView.addView(GoogleAdManagerMediationAdapter.this.nativeAdView);
                GoogleAdManagerMediationAdapter.this.nativeAdView.setIconView(maxNativeAdView.getIconImageView());
                GoogleAdManagerMediationAdapter.this.nativeAdView.setHeadlineView(maxNativeAdView.getTitleTextView());
                GoogleAdManagerMediationAdapter.this.nativeAdView.setAdvertiserView(maxNativeAdView.getAdvertiserTextView());
                GoogleAdManagerMediationAdapter.this.nativeAdView.setBodyView(maxNativeAdView.getBodyTextView());
                GoogleAdManagerMediationAdapter.this.nativeAdView.setCallToActionView(maxNativeAdView.getCallToActionButton());
                View mediaView2 = getMediaView();
                if (mediaView2 instanceof MediaView) {
                    GoogleAdManagerMediationAdapter.this.nativeAdView.setMediaView((MediaView) mediaView2);
                } else if (mediaView2 instanceof ImageView) {
                    GoogleAdManagerMediationAdapter.this.nativeAdView.setImageView(mediaView2);
                }
                GoogleAdManagerMediationAdapter.this.nativeAdView.setNativeAd(nativeAd);
            } else {
                View autoMeasuringMediaView = null;
                for (View view : list) {
                    Object tag = view.getTag();
                    if (tag != null) {
                        int iIntValue = ((Integer) tag).intValue();
                        if (iIntValue == 1) {
                            GoogleAdManagerMediationAdapter.this.nativeAdView.setHeadlineView(view);
                        } else if (iIntValue == 3) {
                            GoogleAdManagerMediationAdapter.this.nativeAdView.setIconView(view);
                        } else if (iIntValue == 4) {
                            GoogleAdManagerMediationAdapter.this.nativeAdView.setBodyView(view);
                        } else if (iIntValue == 5) {
                            GoogleAdManagerMediationAdapter.this.nativeAdView.setCallToActionView(view);
                        } else if (iIntValue == 8) {
                            GoogleAdManagerMediationAdapter.this.nativeAdView.setAdvertiserView(view);
                        } else if (iIntValue == 2) {
                            autoMeasuringMediaView = getMediaView();
                        }
                    }
                }
                if (autoMeasuringMediaView != null) {
                    viewGroup = (ViewGroup) autoMeasuringMediaView.getParent();
                }
                if (viewGroup == null) {
                    return true;
                }
                boolean z10 = (viewGroup instanceof RelativeLayout) || (viewGroup instanceof FrameLayout);
                if (autoMeasuringMediaView != null) {
                    viewGroup.removeView(autoMeasuringMediaView);
                    if (!z10 && (autoMeasuringMediaView instanceof MediaView) && (mediaContent = (mediaView = (MediaView) autoMeasuringMediaView).getMediaContent()) != null && mediaContent.hasVideoContent()) {
                        autoMeasuringMediaView = new AutoMeasuringMediaView(viewGroup.getContext());
                        mediaView.setMediaContent(nativeAd.getMediaContent());
                    }
                    GoogleAdManagerMediationAdapter.this.nativeAdView.addView(autoMeasuringMediaView, new ViewGroup.LayoutParams(-1, -1));
                    if (autoMeasuringMediaView instanceof MediaView) {
                        GoogleAdManagerMediationAdapter.this.nativeAdView.setMediaView((MediaView) autoMeasuringMediaView);
                    } else if (autoMeasuringMediaView instanceof ImageView) {
                        GoogleAdManagerMediationAdapter.this.nativeAdView.setImageView((ImageView) autoMeasuringMediaView);
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    View view2 = new View(viewGroup.getContext());
                    GoogleAdManagerMediationAdapter.this.nativeAdView.addView(view2, layoutParams);
                    GoogleAdManagerMediationAdapter.this.nativeAdView.setStoreView(view2);
                }
                GoogleAdManagerMediationAdapter.this.nativeAdView.setNativeAd(nativeAd);
                if (z10) {
                    viewGroup.addView(GoogleAdManagerMediationAdapter.this.nativeAdView, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    GoogleAdManagerMediationAdapter.this.nativeAdView.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 1073741824));
                    GoogleAdManagerMediationAdapter.this.nativeAdView.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
                    viewGroup.addView(GoogleAdManagerMediationAdapter.this.nativeAdView);
                }
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class NativeAdListener extends AdListener implements NativeAd.OnNativeAdLoadedListener {
        final Context context;
        final MaxNativeAdAdapterListener listener;
        final String placementId;
        final Bundle serverParameters;

        public NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.context = context;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            GoogleAdManagerMediationAdapter.this.log("Native ad clicked");
            this.listener.onNativeAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            GoogleAdManagerMediationAdapter.this.log("Native ad closed");
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            MaxAdapterError maxError = GoogleAdManagerMediationAdapter.toMaxError(loadAdError);
            GoogleAdManagerMediationAdapter.this.log("Native ad (" + this.placementId + ") failed to load with error: " + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            GoogleAdManagerMediationAdapter.this.log("Native ad shown");
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            GoogleAdManagerMediationAdapter.this.log("Native ad opened");
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(final NativeAd nativeAd) {
            GoogleAdManagerMediationAdapter.this.log("Native ad loaded: " + this.placementId);
            GoogleAdManagerMediationAdapter.this.nativeAd = nativeAd;
            if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || !TextUtils.isEmpty(nativeAd.getHeadline())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter.NativeAdListener.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public void run() {
                        /*
                            r7 = this;
                            com.google.android.gms.ads.nativead.NativeAd r0 = r2
                            com.google.android.gms.ads.MediaContent r0 = r0.getMediaContent()
                            com.google.android.gms.ads.nativead.NativeAd r1 = r2
                            java.util.List r1 = r1.getImages()
                            r2 = 0
                            if (r0 == 0) goto L24
                            com.google.android.gms.ads.nativead.MediaView r1 = new com.google.android.gms.ads.nativead.MediaView
                            com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter$NativeAdListener r3 = com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter.NativeAdListener.this
                            android.content.Context r3 = r3.context
                            r1.<init>(r3)
                            r1.setMediaContent(r0)
                            android.graphics.drawable.Drawable r3 = r0.getMainImage()
                            float r0 = r0.getAspectRatio()
                            goto L59
                        L24:
                            if (r1 == 0) goto L56
                            int r0 = r1.size()
                            if (r0 <= 0) goto L56
                            r0 = 0
                            java.lang.Object r0 = r1.get(r0)
                            com.google.android.gms.ads.nativead.NativeAd$Image r0 = (com.google.android.gms.ads.nativead.NativeAd.Image) r0
                            android.widget.ImageView r1 = new android.widget.ImageView
                            com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter$NativeAdListener r3 = com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter.NativeAdListener.this
                            android.content.Context r3 = r3.context
                            r1.<init>(r3)
                            android.graphics.drawable.Drawable r3 = r0.getDrawable()
                            if (r3 == 0) goto L56
                            android.graphics.drawable.Drawable r0 = r0.getDrawable()
                            r1.setImageDrawable(r0)
                            int r0 = r3.getIntrinsicWidth()
                            float r0 = (float) r0
                            int r3 = r3.getIntrinsicHeight()
                            float r3 = (float) r3
                            float r0 = r0 / r3
                            r3 = r2
                            goto L59
                        L56:
                            r0 = 0
                            r1 = r2
                            r3 = r1
                        L59:
                            com.google.android.gms.ads.nativead.NativeAd r4 = r2
                            com.google.android.gms.ads.nativead.NativeAd$Image r4 = r4.getIcon()
                            if (r4 == 0) goto L7b
                            android.graphics.drawable.Drawable r5 = r4.getDrawable()
                            if (r5 == 0) goto L71
                            com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage r5 = new com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage
                            android.graphics.drawable.Drawable r4 = r4.getDrawable()
                            r5.<init>(r4)
                            goto L7c
                        L71:
                            com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage r5 = new com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage
                            android.net.Uri r4 = r4.getUri()
                            r5.<init>(r4)
                            goto L7c
                        L7b:
                            r5 = r2
                        L7c:
                            com.applovin.mediation.nativeAds.MaxNativeAd$Builder r4 = new com.applovin.mediation.nativeAds.MaxNativeAd$Builder
                            r4.<init>()
                            com.applovin.mediation.MaxAdFormat r6 = com.applovin.mediation.MaxAdFormat.NATIVE
                            com.applovin.mediation.nativeAds.MaxNativeAd$Builder r4 = r4.setAdFormat(r6)
                            com.google.android.gms.ads.nativead.NativeAd r6 = r2
                            java.lang.String r6 = r6.getHeadline()
                            com.applovin.mediation.nativeAds.MaxNativeAd$Builder r4 = r4.setTitle(r6)
                            com.google.android.gms.ads.nativead.NativeAd r6 = r2
                            java.lang.String r6 = r6.getAdvertiser()
                            com.applovin.mediation.nativeAds.MaxNativeAd$Builder r4 = r4.setAdvertiser(r6)
                            com.google.android.gms.ads.nativead.NativeAd r6 = r2
                            java.lang.String r6 = r6.getBody()
                            com.applovin.mediation.nativeAds.MaxNativeAd$Builder r4 = r4.setBody(r6)
                            com.google.android.gms.ads.nativead.NativeAd r6 = r2
                            java.lang.String r6 = r6.getCallToAction()
                            com.applovin.mediation.nativeAds.MaxNativeAd$Builder r4 = r4.setCallToAction(r6)
                            com.applovin.mediation.nativeAds.MaxNativeAd$Builder r4 = r4.setIcon(r5)
                            com.applovin.mediation.nativeAds.MaxNativeAd$Builder r1 = r4.setMediaView(r1)
                            com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage r4 = new com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage
                            r4.<init>(r3)
                            com.applovin.mediation.nativeAds.MaxNativeAd$Builder r1 = r1.setMainImage(r4)
                            com.applovin.mediation.nativeAds.MaxNativeAd$Builder r0 = r1.setMediaContentAspectRatio(r0)
                            com.google.android.gms.ads.nativead.NativeAd r1 = r2
                            java.lang.Double r1 = r1.getStarRating()
                            com.applovin.mediation.nativeAds.MaxNativeAd$Builder r0 = r0.setStarRating(r1)
                            com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter$MaxGoogleAdManagerNativeAd r1 = new com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter$MaxGoogleAdManagerNativeAd
                            com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter$NativeAdListener r3 = com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter.NativeAdListener.this
                            com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter r3 = com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter.this
                            r1.<init>(r0)
                            com.google.android.gms.ads.nativead.NativeAd r0 = r2
                            com.google.android.gms.ads.ResponseInfo r0 = r0.getResponseInfo()
                            if (r0 == 0) goto Le3
                            java.lang.String r2 = r0.getResponseId()
                        Le3:
                            r0 = 1
                            java.lang.String r3 = "creative_id"
                            android.os.Bundle r0 = b0.e2.d(r0, r3, r2)
                            com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter$NativeAdListener r2 = com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter.NativeAdListener.this
                            com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener r2 = r2.listener
                            r2.onNativeAdLoaded(r1, r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter.NativeAdListener.AnonymousClass1.run():void");
                    }
                });
                return;
            }
            GoogleAdManagerMediationAdapter.this.e("Native ad (" + nativeAd + ") does not have required assets.");
            this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class NativeAdViewListener extends AdListener implements NativeAd.OnNativeAdLoadedListener {
        final WeakReference<Activity> activityRef;
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;
        final String placementId;
        final Bundle serverParameters;

        public NativeAdViewListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.activityRef = new WeakReference<>(activity);
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            GoogleAdManagerMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            GoogleAdManagerMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad closed");
            this.listener.onAdViewAdCollapsed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            MaxAdapterError maxError = GoogleAdManagerMediationAdapter.toMaxError(loadAdError);
            GoogleAdManagerMediationAdapter googleAdManagerMediationAdapter = GoogleAdManagerMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder("Native ");
            e2.w(this.adFormat, sb2, " ad (");
            sb2.append(this.placementId);
            sb2.append(") failed to load with error: ");
            sb2.append(maxError);
            googleAdManagerMediationAdapter.log(sb2.toString());
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            GoogleAdManagerMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad shown");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            GoogleAdManagerMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad opened");
            this.listener.onAdViewAdExpanded();
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(final NativeAd nativeAd) {
            GoogleAdManagerMediationAdapter googleAdManagerMediationAdapter = GoogleAdManagerMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder("Native ");
            e2.w(this.adFormat, sb2, " ad loaded: ");
            sb2.append(this.placementId);
            googleAdManagerMediationAdapter.log(sb2.toString());
            GoogleAdManagerMediationAdapter.this.nativeAd = nativeAd;
            final Context context = GoogleAdManagerMediationAdapter.this.getContext(this.activityRef.get());
            final MediaView mediaView = new MediaView(context);
            MediaContent mediaContent = nativeAd.getMediaContent();
            if (mediaContent != null) {
                mediaView.setMediaContent(mediaContent);
            }
            NativeAd.Image icon = nativeAd.getIcon();
            final MaxNativeAd maxNativeAdBuild = new MaxNativeAd.Builder().setAdFormat(this.adFormat).setTitle(nativeAd.getHeadline()).setBody(nativeAd.getBody()).setCallToAction(nativeAd.getCallToAction()).setIcon(icon != null ? icon.getDrawable() != null ? new MaxNativeAd.MaxNativeAdImage(icon.getDrawable()) : new MaxNativeAd.MaxNativeAdImage(icon.getUri()) : null).setMediaView(mediaView).build();
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter.NativeAdViewListener.1
                @Override // java.lang.Runnable
                public void run() {
                    MaxNativeAdView maxNativeAdView = new MaxNativeAdView(maxNativeAdBuild, BundleUtils.getString("template", "", NativeAdViewListener.this.serverParameters), context);
                    GoogleAdManagerMediationAdapter.this.nativeAdView = new NativeAdView(context);
                    GoogleAdManagerMediationAdapter.this.nativeAdView.setIconView(maxNativeAdView.getIconImageView());
                    GoogleAdManagerMediationAdapter.this.nativeAdView.setHeadlineView(maxNativeAdView.getTitleTextView());
                    GoogleAdManagerMediationAdapter.this.nativeAdView.setBodyView(maxNativeAdView.getBodyTextView());
                    GoogleAdManagerMediationAdapter.this.nativeAdView.setMediaView(mediaView);
                    GoogleAdManagerMediationAdapter.this.nativeAdView.setCallToActionView(maxNativeAdView.getCallToActionButton());
                    GoogleAdManagerMediationAdapter.this.nativeAdView.setNativeAd(nativeAd);
                    GoogleAdManagerMediationAdapter.this.nativeAdView.addView(maxNativeAdView);
                    ResponseInfo responseInfo = nativeAd.getResponseInfo();
                    String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                    if (!AppLovinSdkUtils.isValidString(responseId)) {
                        NativeAdViewListener nativeAdViewListener = NativeAdViewListener.this;
                        nativeAdViewListener.listener.onAdViewAdLoaded(GoogleAdManagerMediationAdapter.this.nativeAdView);
                    } else {
                        Bundle bundleD = e2.d(1, CampaignEx.JSON_KEY_CREATIVE_ID, responseId);
                        NativeAdViewListener nativeAdViewListener2 = NativeAdViewListener.this;
                        nativeAdViewListener2.listener.onAdViewAdLoaded(GoogleAdManagerMediationAdapter.this.nativeAdView, bundleD);
                    }
                }
            });
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class RewardedAdListener extends FullScreenContentCallback {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;
        private final String placementId;

        public RewardedAdListener(String str, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.placementId = str;
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            GoogleAdManagerMediationAdapter.this.log("Rewarded ad clicked: " + this.placementId);
            this.listener.onRewardedAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            if (this.hasGrantedReward || GoogleAdManagerMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = GoogleAdManagerMediationAdapter.this.getReward();
                GoogleAdManagerMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            GoogleAdManagerMediationAdapter.this.log("Rewarded ad hidden: " + this.placementId);
            this.listener.onRewardedAdHidden();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, adError.getCode(), adError.getMessage());
            GoogleAdManagerMediationAdapter.this.log("Rewarded ad (" + this.placementId + ") failed to show with error: " + maxAdapterError);
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            GoogleAdManagerMediationAdapter.this.log("Rewarded ad impression recorded: " + this.placementId);
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            GoogleAdManagerMediationAdapter.this.log("Rewarded ad shown: " + this.placementId);
        }
    }

    public GoogleAdManagerMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    private AdManagerAdRequest createAdRequestWithParameters(MaxAdapterParameters maxAdapterParameters, Context context) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        Bundle serverParameters = maxAdapterParameters.getServerParameters();
        builder.setRequestAgent(MediationAdapterBase.mediationTag());
        Bundle bundle = new Bundle();
        String string = BundleUtils.getString("event_id", serverParameters);
        if (AppLovinSdkUtils.isValidString(string)) {
            bundle.putString("placement_req_id", string);
        }
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null && !boolHasUserConsent.booleanValue()) {
            bundle.putString("npa", "1");
        }
        Boolean boolIsDoNotSell = maxAdapterParameters.isDoNotSell();
        if (boolIsDoNotSell == null || !boolIsDoNotSell.booleanValue()) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().remove("gad_rdp").apply();
        } else {
            bundle.putInt("rdp", 1);
            PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("gad_rdp", 1).apply();
        }
        Map<String, Object> localExtraParameters = maxAdapterParameters.getLocalExtraParameters();
        Object obj = localExtraParameters.get("google_max_ad_content_rating");
        if (obj instanceof String) {
            bundle.putString("max_ad_content_rating", (String) obj);
        }
        Object obj2 = localExtraParameters.get("google_content_url");
        if (obj2 instanceof String) {
            builder.setContentUrl((String) obj2);
        }
        Object obj3 = localExtraParameters.get("google_neighbouring_content_url_strings");
        if (obj3 instanceof List) {
            try {
                builder.setNeighboringContentUrls((List) obj3);
            } catch (Throwable th2) {
                e("Neighbouring content URL strings extra param needs to be of type List<String>.", th2);
            }
        }
        Object obj4 = localExtraParameters.get("ppid");
        if (obj4 instanceof String) {
            builder.setPublisherProvidedId((String) obj4);
        }
        Object obj5 = localExtraParameters.get("custom_targeting");
        if (obj5 instanceof Map) {
            try {
                Map map = (Map) obj5;
                for (String str : map.keySet()) {
                    Object obj6 = map.get(str);
                    if (obj6 instanceof String) {
                        builder.addCustomTargeting(str, (String) obj6);
                    } else if (obj6 instanceof List) {
                        builder.addCustomTargeting(str, (List<String>) obj6);
                    } else {
                        e("Object in the map needs to be either of type String or List<String>.");
                    }
                }
            } catch (Throwable th3) {
                e("Custom targeting extra param value needs to be of type Map<String, Object>.", th3);
            }
        }
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        return builder.build();
    }

    private int getAdChoicesPlacement(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        Object obj = localExtraParameters != null ? localExtraParameters.get("gam_ad_choices_placement") : null;
        if (isValidAdChoicesPlacement(obj)) {
            return ((Integer) obj).intValue();
        }
        return 1;
    }

    private AdSize getAdaptiveAdSize(MaxAdapterParameters maxAdapterParameters, Context context) {
        int adaptiveBannerWidth = getAdaptiveBannerWidth(maxAdapterParameters, context);
        if (!isInlineAdaptiveBanner(maxAdapterParameters)) {
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, adaptiveBannerWidth);
        }
        int inlineAdaptiveBannerMaxHeight = getInlineAdaptiveBannerMaxHeight(maxAdapterParameters);
        return inlineAdaptiveBannerMaxHeight > 0 ? AdSize.getInlineAdaptiveBannerAdSize(adaptiveBannerWidth, inlineAdaptiveBannerMaxHeight) : AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, adaptiveBannerWidth);
    }

    private int getAdaptiveBannerWidth(MaxAdapterParameters maxAdapterParameters, Context context) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner_width");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj != null) {
            e("Expected parameter \"adaptive_banner_width\" to be of type Integer, received: " + obj.getClass());
        }
        return AppLovinSdkUtils.pxToDp(context, getApplicationWindowWidth(context));
    }

    public static int getApplicationWindowWidth(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private int getInlineAdaptiveBannerMaxHeight(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("inline_adaptive_banner_max_height");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    private boolean isAdaptiveAdFormat(MaxAdFormat maxAdFormat, MaxAdapterParameters maxAdapterParameters) {
        return (maxAdFormat == MaxAdFormat.MREC && isInlineAdaptiveBanner(maxAdapterParameters)) || maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER;
    }

    private boolean isInlineAdaptiveBanner(MaxAdapterParameters maxAdapterParameters) {
        Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner_type");
        return (obj instanceof String) && ADAPTIVE_BANNER_TYPE_INLINE.equalsIgnoreCase((String) obj);
    }

    private boolean isValidAdChoicesPlacement(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        Integer num = (Integer) obj;
        return num.intValue() == 0 || num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showRewardedAd$0(String str, RewardItem rewardItem) {
        log("Rewarded ad user earned reward: " + str);
        this.rewardedAdListener.hasGrantedReward = true;
    }

    private AdSize toAdSize(MaxAdFormat maxAdFormat, boolean z10, MaxAdapterParameters maxAdapterParameters, Context context) {
        if (z10 && isAdaptiveAdFormat(maxAdFormat, maxAdapterParameters)) {
            return getAdaptiveAdSize(maxAdapterParameters, context);
        }
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.LEADERBOARD;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.MEDIUM_RECTANGLE;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.applovin.mediation.adapter.MaxAdapterError toMaxError(com.google.android.gms.ads.AdError r3) {
        /*
            int r0 = r3.getCode()
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
            if (r0 == 0) goto L21
            r2 = 1
            if (r0 == r2) goto L1e
            r2 = 2
            if (r0 == r2) goto L1b
            r2 = 3
            if (r0 == r2) goto L18
            switch(r0) {
                case 8: goto L15;
                case 9: goto L18;
                case 10: goto L1e;
                case 11: goto L15;
                default: goto L14;
            }
        L14:
            goto L23
        L15:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION
            goto L23
        L18:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL
            goto L23
        L1b:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_CONNECTION
            goto L23
        L1e:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.BAD_REQUEST
            goto L23
        L21:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR
        L23:
            com.applovin.mediation.adapter.MaxAdapterError r2 = new com.applovin.mediation.adapter.MaxAdapterError
            java.lang.String r3 = r3.getMessage()
            r2.<init>(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter.toMaxError(com.google.android.gms.ads.AdError):com.applovin.mediation.adapter.MaxAdapterError");
    }

    private static void updateMuteState(Bundle bundle) {
        if (bundle.containsKey("is_muted")) {
            MobileAds.setAppMuted(bundle.getBoolean("is_muted"));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return "24.7.0.0";
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return String.valueOf(MobileAds.getVersion());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        log("Initializing Google Ad Manager SDK...");
        if (initialized.compareAndSet(false, true)) {
            MobileAds.initialize(getContext(activity));
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb2 = new StringBuilder("Loading ");
        sb2.append(z10 ? "native " : "");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" ad for placement id: ");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        Context context = getContext(activity);
        AdManagerAdRequest adManagerAdRequestCreateAdRequestWithParameters = createAdRequestWithParameters(maxAdapterResponseParameters, context);
        if (z10) {
            NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
            builder.setAdChoicesPlacement(getAdChoicesPlacement(maxAdapterResponseParameters));
            builder.setRequestMultipleImages(maxAdFormat == MaxAdFormat.MREC);
            NativeAdViewListener nativeAdViewListener = new NativeAdViewListener(maxAdapterResponseParameters, maxAdFormat, activity, maxAdViewAdapterListener);
            new AdLoader.Builder(context, thirdPartyAdPlacementId).withNativeAdOptions(builder.build()).forNativeAd(nativeAdViewListener).withAdListener(nativeAdViewListener).build().loadAd(adManagerAdRequestCreateAdRequestWithParameters);
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.adView = adManagerAdView;
        adManagerAdView.setAdUnitId(thirdPartyAdPlacementId);
        this.adView.setAdListener(new AdViewListener(thirdPartyAdPlacementId, maxAdFormat, maxAdViewAdapterListener));
        this.adView.setAdSize(toAdSize(maxAdFormat, maxAdapterResponseParameters.getServerParameters().getBoolean("adaptive_banner", false), maxAdapterResponseParameters, context));
        this.adView.loadAd(adManagerAdRequestCreateAdRequestWithParameters);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading app open ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        updateMuteState(maxAdapterResponseParameters.getServerParameters());
        Context context = getContext(activity);
        AppOpenAd.load(context, thirdPartyAdPlacementId, createAdRequestWithParameters(maxAdapterResponseParameters, context), new AppOpenAd.AppOpenAdLoadCallback() { // from class: com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter.2
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                MaxAdapterError maxError = GoogleAdManagerMediationAdapter.toMaxError(loadAdError);
                GoogleAdManagerMediationAdapter.this.log("App open ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + maxError);
                maxAppOpenAdapterListener.onAppOpenAdLoadFailed(maxError);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(AppOpenAd appOpenAd) {
                GoogleAdManagerMediationAdapter.this.log("App open ad loaded: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
                GoogleAdManagerMediationAdapter.this.appOpenAd = appOpenAd;
                GoogleAdManagerMediationAdapter googleAdManagerMediationAdapter = GoogleAdManagerMediationAdapter.this;
                googleAdManagerMediationAdapter.appOpenAdListener = googleAdManagerMediationAdapter.new AppOpenAdListener(thirdPartyAdPlacementId, maxAppOpenAdapterListener);
                appOpenAd.setFullScreenContentCallback(GoogleAdManagerMediationAdapter.this.appOpenAdListener);
                ResponseInfo responseInfo = GoogleAdManagerMediationAdapter.this.appOpenAd.getResponseInfo();
                String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                if (AppLovinSdkUtils.isValidString(responseId)) {
                    maxAppOpenAdapterListener.onAppOpenAdLoaded(e2.d(1, CampaignEx.JSON_KEY_CREATIVE_ID, responseId));
                } else {
                    maxAppOpenAdapterListener.onAppOpenAdLoaded();
                }
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading interstitial ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        updateMuteState(maxAdapterResponseParameters.getServerParameters());
        Context context = getContext(activity);
        AdManagerInterstitialAd.load(context, thirdPartyAdPlacementId, createAdRequestWithParameters(maxAdapterResponseParameters, context), new AdManagerInterstitialAdLoadCallback() { // from class: com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                MaxAdapterError maxError = GoogleAdManagerMediationAdapter.toMaxError(loadAdError);
                GoogleAdManagerMediationAdapter.this.log("Interstitial ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + maxError);
                maxInterstitialAdapterListener.onInterstitialAdLoadFailed(maxError);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
                GoogleAdManagerMediationAdapter.this.log("Interstitial ad loaded: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
                GoogleAdManagerMediationAdapter.this.interstitialAd = adManagerInterstitialAd;
                GoogleAdManagerMediationAdapter.this.interstitialAd.setFullScreenContentCallback(GoogleAdManagerMediationAdapter.this.new InterstitialAdListener(thirdPartyAdPlacementId, maxInterstitialAdapterListener));
                ResponseInfo responseInfo = GoogleAdManagerMediationAdapter.this.interstitialAd.getResponseInfo();
                String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                if (AppLovinSdkUtils.isValidString(responseId)) {
                    maxInterstitialAdapterListener.onInterstitialAdLoaded(e2.d(1, CampaignEx.JSON_KEY_CREATIVE_ID, responseId));
                } else {
                    maxInterstitialAdapterListener.onInterstitialAdLoaded();
                }
            }
        });
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading native ad for placement id: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        Context context = getContext(activity);
        AdManagerAdRequest adManagerAdRequestCreateAdRequestWithParameters = createAdRequestWithParameters(maxAdapterResponseParameters, context);
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        builder.setAdChoicesPlacement(getAdChoicesPlacement(maxAdapterResponseParameters));
        builder.setRequestMultipleImages(BundleUtils.getString("template", "", maxAdapterResponseParameters.getServerParameters()).contains("medium"));
        NativeAdListener nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, context, maxNativeAdAdapterListener);
        new AdLoader.Builder(context, thirdPartyAdPlacementId).withNativeAdOptions(builder.build()).forNativeAd(nativeAdListener).withAdListener(nativeAdListener).build().loadAd((AdRequest) adManagerAdRequestCreateAdRequestWithParameters);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        updateMuteState(maxAdapterResponseParameters.getServerParameters());
        Context context = getContext(activity);
        RewardedAd.load(context, thirdPartyAdPlacementId, createAdRequestWithParameters(maxAdapterResponseParameters, context), new RewardedAdLoadCallback() { // from class: com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter.3
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                MaxAdapterError maxError = GoogleAdManagerMediationAdapter.toMaxError(loadAdError);
                GoogleAdManagerMediationAdapter.this.log("Rewarded ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + maxError);
                maxRewardedAdapterListener.onRewardedAdLoadFailed(maxError);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(RewardedAd rewardedAd) {
                GoogleAdManagerMediationAdapter.this.log("Rewarded ad loaded: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
                GoogleAdManagerMediationAdapter.this.rewardedAd = rewardedAd;
                GoogleAdManagerMediationAdapter googleAdManagerMediationAdapter = GoogleAdManagerMediationAdapter.this;
                googleAdManagerMediationAdapter.rewardedAdListener = googleAdManagerMediationAdapter.new RewardedAdListener(thirdPartyAdPlacementId, maxRewardedAdapterListener);
                GoogleAdManagerMediationAdapter.this.rewardedAd.setFullScreenContentCallback(GoogleAdManagerMediationAdapter.this.rewardedAdListener);
                ResponseInfo responseInfo = GoogleAdManagerMediationAdapter.this.rewardedAd.getResponseInfo();
                String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                if (AppLovinSdkUtils.isValidString(responseId)) {
                    maxRewardedAdapterListener.onRewardedAdLoaded(e2.d(1, CampaignEx.JSON_KEY_CREATIVE_ID, responseId));
                } else {
                    maxRewardedAdapterListener.onRewardedAdLoaded();
                }
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        log("Destroy called for adapter " + this);
        AdManagerInterstitialAd adManagerInterstitialAd = this.interstitialAd;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(null);
            this.interstitialAd = null;
        }
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd != null) {
            appOpenAd.setFullScreenContentCallback(null);
            this.appOpenAd = null;
            this.appOpenAdListener = null;
        }
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.rewardedAd = null;
            this.rewardedAdListener = null;
        }
        AdManagerAdView adManagerAdView = this.adView;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.adView = null;
        }
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.destroy();
            this.nativeAd = null;
        }
        NativeAdView nativeAdView = this.nativeAdView;
        if (nativeAdView != null) {
            nativeAdView.destroy();
            this.nativeAdView = null;
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing app open ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd != null) {
            appOpenAd.show(activity);
            return;
        }
        log("App open ad failed to show: " + thirdPartyAdPlacementId);
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        AdManagerInterstitialAd adManagerInterstitialAd = this.interstitialAd;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.show(activity);
            return;
        }
        log("Interstitial ad failed to show: " + thirdPartyAdPlacementId);
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (this.rewardedAd != null) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show(activity, new n(5, this, thirdPartyAdPlacementId));
            return;
        }
        log("Rewarded ad failed to show: " + thirdPartyAdPlacementId);
        MaxAdapterError maxAdapterError = MaxAdapterError.AD_DISPLAY_FAILED;
        MaxAdapterError maxAdapterError2 = MaxAdapterError.AD_NOT_READY;
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(maxAdapterError, maxAdapterError2.getCode(), maxAdapterError2.getMessage()));
    }
}
