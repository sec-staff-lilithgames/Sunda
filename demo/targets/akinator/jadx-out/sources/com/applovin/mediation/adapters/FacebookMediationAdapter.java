package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.utils.BundleUtils;
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
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.facebook.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import h2.rl.UeklptUrP;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class FacebookMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter, MaxSignalProvider {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus sStatus;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private NativeAd mNativeAd;
    private NativeBannerAd mNativeBannerAd;
    private RewardedVideoAd mRewardedVideoAd;
    private final AtomicBoolean onInterstitialAdHiddenCalled;
    private final AtomicBoolean onRewardedAdHiddenCalled;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class AdViewListener implements AdListener {
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;

        public AdViewListener(MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter.this.log(this.adFormat.getLabel() + " ad clicked: " + ad2.getPlacementId());
            this.listener.onAdViewAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter.this.log(this.adFormat.getLabel() + " ad loaded: " + ad2.getPlacementId());
            this.listener.onAdViewAdLoaded(FacebookMediationAdapter.this.mAdView);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter.this.log(this.adFormat.getLabel() + " ad (" + ad2.getPlacementId() + ") failed to load with error (" + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter.this.log(this.adFormat.getLabel() + " ad displayed: " + ad2.getPlacementId());
            this.listener.onAdViewAdDisplayed();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class MaxFacebookNativeAd extends MaxNativeAd {
        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            ImageView imageView;
            Ad ad2 = FacebookMediationAdapter.this.mNativeAd != null ? FacebookMediationAdapter.this.mNativeAd : FacebookMediationAdapter.this.mNativeBannerAd;
            if (ad2 == null) {
                FacebookMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            if (list.isEmpty()) {
                FacebookMediationAdapter.this.e("No clickable views to prepare");
                return false;
            }
            Iterator<View> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    imageView = null;
                    break;
                }
                View next = it.next();
                if (next instanceof ImageView) {
                    imageView = (ImageView) next;
                    break;
                }
            }
            if (getMediaView() != null) {
                list.add(getMediaView());
            }
            if (!(ad2 instanceof NativeBannerAd)) {
                ((NativeAd) ad2).registerViewForInteraction(viewGroup, (MediaView) getMediaView(), imageView, list);
                return true;
            }
            if (imageView != null) {
                ((NativeBannerAd) ad2).registerViewForInteraction(viewGroup, imageView, list);
                return true;
            }
            if (getMediaView() != null) {
                ((NativeBannerAd) ad2).registerViewForInteraction(viewGroup, (ImageView) getMediaView(), list);
                return true;
            }
            FacebookMediationAdapter.this.e("Failed to register native ad view for interaction: icon image view and media view are null");
            return false;
        }

        private MaxFacebookNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class MaxNativeAdListener implements NativeAdListener {
        final Context context;
        final MaxNativeAdAdapterListener listener;
        final Bundle serverParameters;

        public MaxNativeAdListener(Bundle bundle, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.serverParameters = bundle;
            this.context = context;
            this.listener = maxNativeAdAdapterListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleNativeAdLoaded(NativeAdBase nativeAdBase, Drawable drawable, MediaView mediaView, Context context) {
            float mediaWidth;
            int mediaHeight;
            float f10;
            MaxNativeAd.MaxNativeAdImage maxNativeAdImage = (!(nativeAdBase instanceof NativeAd) || nativeAdBase.getAdCoverImage() == null) ? null : new MaxNativeAd.MaxNativeAdImage(Uri.parse(nativeAdBase.getAdCoverImage().getUrl()));
            MaxNativeAd.Builder optionsView = new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(nativeAdBase.getAdHeadline()).setAdvertiser(nativeAdBase.getAdvertiserName()).setBody(nativeAdBase.getAdBodyText()).setCallToAction(nativeAdBase.getAdCallToAction()).setIcon(new MaxNativeAd.MaxNativeAdImage(drawable)).setOptionsView(new AdOptionsView(context, nativeAdBase, null));
            if (nativeAdBase instanceof NativeAd) {
                optionsView.setMainImage(maxNativeAdImage);
            }
            if (nativeAdBase instanceof NativeBannerAd) {
                ImageView imageView = new ImageView(context);
                imageView.setImageDrawable(drawable);
                optionsView.setMediaView(imageView);
                if (drawable == null) {
                    f10 = 0.0f;
                    optionsView.setMediaContentAspectRatio(f10);
                    this.listener.onNativeAdLoaded(new MaxFacebookNativeAd(optionsView), null);
                }
                mediaWidth = drawable.getIntrinsicWidth();
                mediaHeight = drawable.getIntrinsicHeight();
            } else {
                optionsView.setMediaView(mediaView);
                mediaWidth = mediaView.getMediaWidth();
                mediaHeight = mediaView.getMediaHeight();
            }
            f10 = mediaWidth / mediaHeight;
            optionsView.setMediaContentAspectRatio(f10);
            this.listener.onNativeAdLoaded(new MaxFacebookNativeAd(optionsView), null);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter.this.log("Native clicked: " + ad2.getPlacementId());
            this.listener.onNativeAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter.this.log("Native ad loaded: " + ad2.getPlacementId());
            final NativeAdBase nativeAdBase = FacebookMediationAdapter.this.mNativeAd != null ? FacebookMediationAdapter.this.mNativeAd : FacebookMediationAdapter.this.mNativeBannerAd;
            if (nativeAdBase == null || nativeAdBase != ad2) {
                FacebookMediationAdapter.this.log("Native ad failed to load: no fill");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            if (nativeAdBase.isAdInvalidated()) {
                FacebookMediationAdapter.this.log("Native ad failed to load: ad is no longer valid");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.AD_EXPIRED);
            } else {
                if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || !TextUtils.isEmpty(nativeAdBase.getAdHeadline())) {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.MaxNativeAdListener.1
                        @Override // java.lang.Runnable
                        public void run() {
                            final MediaView mediaView = new MediaView(MaxNativeAdListener.this.context);
                            Drawable preloadedIconViewDrawable = nativeAdBase.getPreloadedIconViewDrawable();
                            final NativeAdBase.Image adIcon = nativeAdBase.getAdIcon();
                            if (preloadedIconViewDrawable != null) {
                                MaxNativeAdListener maxNativeAdListener = MaxNativeAdListener.this;
                                maxNativeAdListener.handleNativeAdLoaded(nativeAdBase, preloadedIconViewDrawable, mediaView, maxNativeAdListener.context);
                            } else {
                                if (adIcon != null) {
                                    FacebookMediationAdapter.this.getCachingExecutorService().execute(new Runnable() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.MaxNativeAdListener.1.1
                                        @Override // java.lang.Runnable
                                        public void run() throws ExecutionException, InterruptedException, TimeoutException {
                                            Drawable drawable = null;
                                            if (AppLovinSdkUtils.isValidString(adIcon.getUrl())) {
                                                FacebookMediationAdapter.this.log("Adding native ad icon (" + adIcon.getUrl() + ") to queue to be fetched");
                                                Future<Drawable> futureCreateDrawableFuture = FacebookMediationAdapter.this.createDrawableFuture(adIcon.getUrl(), MaxNativeAdListener.this.context.getResources());
                                                int i10 = BundleUtils.getInt("image_task_timeout_seconds", 10, MaxNativeAdListener.this.serverParameters);
                                                if (futureCreateDrawableFuture != null) {
                                                    try {
                                                        drawable = futureCreateDrawableFuture.get(i10, TimeUnit.SECONDS);
                                                    } catch (Throwable th2) {
                                                        FacebookMediationAdapter.this.e("Image fetching tasks failed", th2);
                                                    }
                                                }
                                            }
                                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                            MaxNativeAdListener maxNativeAdListener2 = MaxNativeAdListener.this;
                                            maxNativeAdListener2.handleNativeAdLoaded(nativeAdBase, drawable, mediaView, maxNativeAdListener2.context);
                                        }
                                    });
                                    return;
                                }
                                FacebookMediationAdapter.this.log("No native ad icon (optional) available for the current creative.");
                                MaxNativeAdListener maxNativeAdListener2 = MaxNativeAdListener.this;
                                maxNativeAdListener2.handleNativeAdLoaded(nativeAdBase, null, mediaView, maxNativeAdListener2.context);
                            }
                        }
                    });
                    return;
                }
                FacebookMediationAdapter.this.e("Native ad (" + nativeAdBase + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter.this.log("Native ad (" + ad2.getPlacementId() + ") failed to load with error (" + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter.this.log("Native shown: " + ad2.getPlacementId());
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            FacebookMediationAdapter.this.log("Native ad successfully downloaded media: " + ad2.getPlacementId());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public class NativeAdViewListener implements NativeAdListener {
        final WeakReference<Activity> activityRef;
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;
        final Bundle serverParameters;

        public NativeAdViewListener(Bundle bundle, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.serverParameters = bundle;
            this.activityRef = new WeakReference<>(activity);
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        private void renderNativeAdView() {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.NativeAdViewListener.1
                @Override // java.lang.Runnable
                public void run() {
                    MaxNativeAdView maxNativeAdViewCreateMaxNativeAdView;
                    Activity activity = NativeAdViewListener.this.activityRef.get();
                    Context context = FacebookMediationAdapter.this.getContext(activity);
                    MediaView mediaView = new MediaView(context);
                    MediaView mediaView2 = new MediaView(context);
                    MaxNativeAd maxNativeAdBuild = new MaxNativeAd.Builder().setAdFormat(NativeAdViewListener.this.adFormat).setTitle(FacebookMediationAdapter.this.mNativeAd.getAdHeadline()).setAdvertiser(FacebookMediationAdapter.this.mNativeAd.getAdvertiserName()).setBody(FacebookMediationAdapter.this.mNativeAd.getAdBodyText()).setCallToAction(FacebookMediationAdapter.this.mNativeAd.getAdCallToAction()).setIconView(mediaView).setOptionsView(new AdOptionsView(context, FacebookMediationAdapter.this.mNativeAd, null)).setMediaView(mediaView2).build();
                    String string = BundleUtils.getString("template", "", NativeAdViewListener.this.serverParameters);
                    if (!string.contains("vertical")) {
                        FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                        if (!AppLovinSdkUtils.isValidString(string)) {
                            string = "media_banner_template";
                        }
                        maxNativeAdViewCreateMaxNativeAdView = facebookMediationAdapter.createMaxNativeAdView(maxNativeAdBuild, string, activity);
                    } else if (string.equals("vertical")) {
                        NativeAdViewListener nativeAdViewListener = NativeAdViewListener.this;
                        maxNativeAdViewCreateMaxNativeAdView = FacebookMediationAdapter.this.createMaxNativeAdView(maxNativeAdBuild, nativeAdViewListener.adFormat == MaxAdFormat.LEADER ? "vertical_leader_template" : "vertical_media_banner_template", activity);
                    } else {
                        maxNativeAdViewCreateMaxNativeAdView = FacebookMediationAdapter.this.createMaxNativeAdView(maxNativeAdBuild, string, activity);
                    }
                    ArrayList arrayList = new ArrayList(6);
                    if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getTitle()) && maxNativeAdViewCreateMaxNativeAdView.getTitleTextView() != null) {
                        arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getTitleTextView());
                    }
                    if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getAdvertiser()) && maxNativeAdViewCreateMaxNativeAdView.getAdvertiserTextView() != null) {
                        arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getAdvertiserTextView());
                    }
                    if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getBody()) && maxNativeAdViewCreateMaxNativeAdView.getBodyTextView() != null) {
                        arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getBodyTextView());
                    }
                    if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getCallToAction()) && maxNativeAdViewCreateMaxNativeAdView.getCallToActionButton() != null) {
                        arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getCallToActionButton());
                    }
                    if (maxNativeAdBuild.getIconView() != null) {
                        arrayList.add(maxNativeAdBuild.getIconView());
                    }
                    ViewGroup mediaContentViewGroup = maxNativeAdViewCreateMaxNativeAdView.getMediaContentViewGroup();
                    if (maxNativeAdBuild.getMediaView() != null && mediaContentViewGroup != null) {
                        arrayList.add(mediaContentViewGroup);
                    }
                    FacebookMediationAdapter.this.mNativeAd.registerViewForInteraction(maxNativeAdViewCreateMaxNativeAdView, mediaView2, mediaView, arrayList);
                    NativeAdViewListener.this.listener.onAdViewAdLoaded(maxNativeAdViewCreateMaxNativeAdView);
                }
            });
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " clicked: " + ad2.getPlacementId());
            this.listener.onAdViewAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad loaded: " + ad2.getPlacementId());
            if (FacebookMediationAdapter.this.mNativeAd == null || FacebookMediationAdapter.this.mNativeAd != ad2) {
                FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load: no fill");
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            if (!FacebookMediationAdapter.this.mNativeAd.isAdInvalidated()) {
                if (this.adFormat != MaxAdFormat.MREC) {
                    renderNativeAdView();
                    return;
                } else {
                    this.listener.onAdViewAdLoaded(NativeAdView.render(FacebookMediationAdapter.this.getContext(this.activityRef.get()), FacebookMediationAdapter.this.mNativeAd));
                    return;
                }
            }
            FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load: ad is no longer valid");
            this.listener.onAdViewAdLoadFailed(MaxAdapterError.AD_EXPIRED);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad (" + ad2.getPlacementId() + ") failed to load with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " shown: " + ad2.getPlacementId());
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + UeklptUrP.eccSJLvjHy + ad2.getPlacementId());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class RewardedAdListener implements RewardedVideoAdExtendedListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter.this.log("Rewarded ad clicked: " + ad2.getPlacementId());
            this.listener.onRewardedAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter.this.log("Rewarded ad loaded: " + ad2.getPlacementId());
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter.this.log("Rewarded ad (" + ad2.getPlacementId() + ") failed to load with error (" + maxError);
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter.this.log("Rewarded ad logging impression: " + ad2.getPlacementId());
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.facebook.ads.RewardedVideoAdExtendedListener
        public void onRewardedVideoActivityDestroyed() {
            FacebookMediationAdapter.this.log("Rewarded ad Activity destroyed");
            if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                this.listener.onRewardedAdHidden();
            }
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoClosed() {
            FacebookMediationAdapter.this.log("Rewarded ad hidden");
            if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                if (this.hasGrantedReward || FacebookMediationAdapter.this.shouldAlwaysRewardUser()) {
                    MaxReward reward = FacebookMediationAdapter.this.getReward();
                    FacebookMediationAdapter.this.log("Rewarded user with reward: " + reward);
                    this.listener.onUserRewarded(reward);
                }
                this.listener.onRewardedAdHidden();
            }
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoCompleted() {
            FacebookMediationAdapter.this.log("Rewarded ad video completed");
            this.hasGrantedReward = true;
        }
    }

    public FacebookMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
        this.onInterstitialAdHiddenCalled = new AtomicBoolean();
        this.onRewardedAdHiddenCalled = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView createMaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        return new MaxNativeAdView(maxNativeAd, str, getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private String getMediationIdentifier() {
        return "APPLOVIN_" + AppLovinSdk.VERSION + ":" + getAdapterVersion();
    }

    private AdSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.BANNER_HEIGHT_50;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.BANNER_HEIGHT_90;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.RECTANGLE_HEIGHT_250;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.applovin.mediation.adapter.MaxAdapterError toMaxError(com.facebook.ads.AdError r3) {
        /*
            int r0 = r3.getErrorCode()
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.UNSPECIFIED
            r2 = 2006(0x7d6, float:2.811E-42)
            if (r0 == r2) goto L3f
            r2 = 2100(0x834, float:2.943E-42)
            if (r0 == r2) goto L3c
            r2 = 9001(0x2329, float:1.2613E-41)
            if (r0 == r2) goto L39
            r2 = 2008(0x7d8, float:2.814E-42)
            if (r0 == r2) goto L36
            r2 = 2009(0x7d9, float:2.815E-42)
            if (r0 == r2) goto L33
            switch(r0) {
                case 1000: goto L30;
                case 1001: goto L2d;
                case 1002: goto L3c;
                default: goto L1d;
            }
        L1d:
            switch(r0) {
                case 2000: goto L36;
                case 2001: goto L33;
                case 2002: goto L3c;
                case 2003: goto L3f;
                case 2004: goto L3f;
                default: goto L20;
            }
        L20:
            switch(r0) {
                case 6001: goto L2a;
                case 6002: goto L2a;
                case 6003: goto L2a;
                default: goto L23;
            }
        L23:
            switch(r0) {
                case 7001: goto L3c;
                case 7002: goto L3c;
                case 7003: goto L27;
                case 7004: goto L3c;
                case 7005: goto L39;
                case 7006: goto L39;
                case 7007: goto L3c;
                default: goto L26;
            }
        L26:
            goto L41
        L27:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_CONFIGURATION
            goto L41
        L2a:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS
            goto L41
        L2d:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_FILL
            goto L41
        L30:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.NO_CONNECTION
            goto L41
        L33:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.TIMEOUT
            goto L41
        L36:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.SERVER_ERROR
            goto L41
        L39:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR
            goto L41
        L3c:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INVALID_LOAD_STATE
            goto L41
        L3f:
            com.applovin.mediation.adapter.MaxAdapterError r1 = com.applovin.mediation.adapter.MaxAdapterError.INTERNAL_ERROR
        L41:
            com.applovin.mediation.adapter.MaxAdapterError r2 = new com.applovin.mediation.adapter.MaxAdapterError
            java.lang.String r3 = r3.getErrorMessage()
            r2.<init>(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.FacebookMediationAdapter.toMaxError(com.facebook.ads.AdError):com.applovin.mediation.adapter.MaxAdapterError");
    }

    private void updateAdSettings(MaxAdapterParameters maxAdapterParameters) {
        Bundle serverParameters = maxAdapterParameters.getServerParameters();
        if (serverParameters.containsKey("video_autoplay")) {
            AdSettings.setVideoAutoplay(serverParameters.getBoolean("video_autoplay"));
        }
        String string = serverParameters.getString("test_device_ids", null);
        if (!TextUtils.isEmpty(string)) {
            AdSettings.addTestDevices(Arrays.asList(string.split(",")));
        }
        AdSettings.setMediationService(getMediationIdentifier());
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updateAdSettings(maxAdapterSignalCollectionParameters);
        maxSignalCollectionListener.onSignalCollected(BidderTokenProvider.getBidderToken(getContext(activity)));
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return getVersionString(com.facebook.ads.BuildConfig.class, "VERSION_NAME");
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        updateAdSettings(maxAdapterInitializationParameters);
        if (!INITIALIZED.compareAndSet(false, true)) {
            onCompletionListener.onCompletion(sStatus, null);
            return;
        }
        sStatus = MaxAdapter.InitializationStatus.INITIALIZING;
        ArrayList<String> stringArrayList = maxAdapterInitializationParameters.getServerParameters().getStringArrayList("placement_ids");
        AudienceNetworkAds.InitListener initListener = new AudienceNetworkAds.InitListener() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.1
            @Override // com.facebook.ads.AudienceNetworkAds.InitListener
            public void onInitialized(AudienceNetworkAds.InitResult initResult) {
                if (initResult.isSuccess()) {
                    FacebookMediationAdapter.this.log("Facebook SDK successfully finished initialization: " + initResult.getMessage());
                    MaxAdapter.InitializationStatus unused = FacebookMediationAdapter.sStatus = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                    onCompletionListener.onCompletion(FacebookMediationAdapter.sStatus, null);
                    return;
                }
                FacebookMediationAdapter.this.log("Facebook SDK failed to finished initialization: " + initResult.getMessage());
                MaxAdapter.InitializationStatus unused2 = FacebookMediationAdapter.sStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                onCompletionListener.onCompletion(FacebookMediationAdapter.sStatus, initResult.getMessage());
            }
        };
        if (maxAdapterInitializationParameters.isTesting()) {
            AdSettings.setDebugBuild(true);
        }
        log("Initializing Facebook SDK with placements: " + stringArrayList);
        AudienceNetworkAds.buildInitSettings(getContext(activity)).withMediationService(getMediationIdentifier()).withPlacementIds(stringArrayList).withInitListener(initListener).initialize();
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb2 = new StringBuilder("Loading");
        sb2.append(z10 ? " native " : " ");
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" ad: ");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb2.toString());
        updateAdSettings(maxAdapterResponseParameters);
        if (z10) {
            NativeAd nativeAd = new NativeAd(getContext(activity), thirdPartyAdPlacementId);
            this.mNativeAd = nativeAd;
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdViewListener(maxAdapterResponseParameters.getServerParameters(), maxAdFormat, activity, maxAdViewAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
        } else {
            AdView adView = new AdView(getContext(activity), thirdPartyAdPlacementId, toAdSize(maxAdFormat));
            this.mAdView = adView;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(new AdViewListener(maxAdFormat, maxAdViewAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading interstitial ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        updateAdSettings(maxAdapterResponseParameters);
        InterstitialAd interstitialAd = new InterstitialAd(getContext(activity), thirdPartyAdPlacementId);
        this.mInterstitialAd = interstitialAd;
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithAdListener = interstitialAd.buildLoadAdConfig().withAdListener(new InterstitialAdListener(maxInterstitialAdapterListener));
        if (!this.mInterstitialAd.isAdLoaded() || this.mInterstitialAd.isAdInvalidated()) {
            log("Loading bidding interstitial ad...");
            this.mInterstitialAd.loadAd(interstitialAdLoadConfigBuilderWithAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
        } else {
            log("An interstitial ad has been loaded already");
            maxInterstitialAdapterListener.onInterstitialAdLoaded();
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        boolean z10 = BundleUtils.getBoolean("is_native_banner", maxAdapterResponseParameters.getServerParameters());
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(o2.r(new StringBuilder("Loading native "), z10 ? "banner " : "", "ad: ", thirdPartyAdPlacementId, APSSharedUtil.TRUNCATE_SEPARATOR));
        updateAdSettings(maxAdapterResponseParameters);
        Context context = getContext(activity);
        if (z10) {
            NativeBannerAd nativeBannerAd = new NativeBannerAd(context, thirdPartyAdPlacementId);
            this.mNativeBannerAd = nativeBannerAd;
            nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new MaxNativeAdListener(maxAdapterResponseParameters.getServerParameters(), context, maxNativeAdAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
        } else {
            NativeAd nativeAd = new NativeAd(context, thirdPartyAdPlacementId);
            this.mNativeAd = nativeAd;
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new MaxNativeAdListener(maxAdapterResponseParameters.getServerParameters(), context, maxNativeAdAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
        updateAdSettings(maxAdapterResponseParameters);
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(getContext(activity), thirdPartyAdPlacementId);
        this.mRewardedVideoAd = rewardedVideoAd;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder rewardedVideoAdLoadConfigBuilderWithAdListener = rewardedVideoAd.buildLoadAdConfig().withAdListener(new RewardedAdListener(maxRewardedAdapterListener));
        if (!this.mRewardedVideoAd.isAdLoaded() || this.mRewardedVideoAd.isAdInvalidated()) {
            log("Loading bidding rewarded ad...");
            this.mRewardedVideoAd.loadAd(rewardedVideoAdLoadConfigBuilderWithAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
        } else {
            log("A rewarded ad has been loaded already");
            maxRewardedAdapterListener.onRewardedAdLoaded();
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.mInterstitialAd = null;
        }
        RewardedVideoAd rewardedVideoAd = this.mRewardedVideoAd;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
            this.mRewardedVideoAd = null;
        }
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
            this.mAdView = null;
        }
        NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            nativeAd.unregisterView();
            this.mNativeAd.destroy();
            this.mNativeAd = null;
        }
        NativeBannerAd nativeBannerAd = this.mNativeBannerAd;
        if (nativeBannerAd != null) {
            nativeBannerAd.unregisterView();
            this.mNativeBannerAd.destroy();
            this.mNativeBannerAd = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd == null || !interstitialAd.isAdLoaded()) {
            log("Unable to show interstitial - no ad loaded...");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, "Interstitial ad not ready"));
        } else if (!this.mInterstitialAd.isAdInvalidated()) {
            this.mInterstitialAd.show();
        } else {
            log("Unable to show interstitial - ad expired...");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        RewardedVideoAd rewardedVideoAd = this.mRewardedVideoAd;
        if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded()) {
            log("Unable to show rewarded ad - no ad loaded...");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.AD_DISPLAY_FAILED, 0, "Rewarded ad not ready"));
        } else if (this.mRewardedVideoAd.isAdInvalidated()) {
            log("Unable to show rewarded ad - ad expired...");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
        } else {
            configureReward(maxAdapterResponseParameters);
            this.mRewardedVideoAd.show();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class InterstitialAdListener implements InterstitialAdExtendedListener {
        private final MaxInterstitialAdapterListener listener;

        public InterstitialAdListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter.this.log("Interstitial ad clicked: " + ad2.getPlacementId());
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter.this.log("Interstitial ad loaded: " + ad2.getPlacementId());
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter.this.log("Interstitial ad (" + ad2.getPlacementId() + ") failed to load with error: " + maxError);
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.InterstitialAdExtendedListener
        public void onInterstitialActivityDestroyed() {
            FacebookMediationAdapter.this.log("Interstitial ad Activity destroyed");
            if (FacebookMediationAdapter.this.onInterstitialAdHiddenCalled.compareAndSet(false, true)) {
                this.listener.onInterstitialAdHidden();
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(Ad ad2) {
            FacebookMediationAdapter.this.log("Interstitial ad hidden: " + ad2.getPlacementId());
            if (FacebookMediationAdapter.this.onInterstitialAdHiddenCalled.compareAndSet(false, true)) {
                this.listener.onInterstitialAdHidden();
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDisplayed(Ad ad2) {
            FacebookMediationAdapter.this.log("Interstitial ad displayed: " + ad2.getPlacementId());
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter.this.log("Interstitial ad logging impression: " + ad2.getPlacementId());
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdCompleted() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdServerFailed() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdServerSucceeded() {
        }
    }
}
