package com.facebook.ads.internal.api;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.NativeAdBase;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface NativeAdBaseApi {
    NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase);

    void destroy();

    void downloadMedia();

    String getAdBodyText();

    String getAdCallToAction();

    NativeAdImageApi getAdChoicesIcon();

    String getAdChoicesImageUrl();

    String getAdChoicesLinkUrl();

    String getAdChoicesText();

    NativeAdImageApi getAdCoverImage();

    String getAdHeadline();

    NativeAdImageApi getAdIcon();

    String getAdLinkDescription();

    String getAdSocialContext();

    @Deprecated
    NativeAdRatingApi getAdStarRating();

    String getAdTranslation();

    String getAdUntrimmedBodyText();

    String getAdvertiserName();

    float getAspectRatio();

    String getId();

    String getPlacementId();

    Drawable getPreloadedIconViewDrawable();

    String getPromotedTranslation();

    String getSponsoredTranslation();

    boolean hasCallToAction();

    boolean isAdInvalidated();

    boolean isAdLoaded();

    void loadAd();

    void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig);

    void onCtaBroadcast();

    void setExtraHints(ExtraHints extraHints);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void unregisterView();
}
