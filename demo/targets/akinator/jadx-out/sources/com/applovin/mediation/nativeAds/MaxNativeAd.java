package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private MaxAdFormat f16430a;

        /* renamed from: b, reason: collision with root package name */
        private String f16431b;

        /* renamed from: c, reason: collision with root package name */
        private String f16432c;

        /* renamed from: d, reason: collision with root package name */
        private String f16433d;

        /* renamed from: e, reason: collision with root package name */
        private String f16434e;

        /* renamed from: f, reason: collision with root package name */
        private MaxNativeAdImage f16435f;

        /* renamed from: g, reason: collision with root package name */
        private View f16436g;

        /* renamed from: h, reason: collision with root package name */
        private View f16437h;

        /* renamed from: i, reason: collision with root package name */
        private View f16438i;

        /* renamed from: j, reason: collision with root package name */
        private MaxNativeAdImage f16439j;

        /* renamed from: k, reason: collision with root package name */
        private float f16440k;

        /* renamed from: l, reason: collision with root package name */
        private Double f16441l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f16430a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f16432c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f16433d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f16434e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f16435f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f16436g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f16439j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f10) {
            this.f16440k = f10;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f16438i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f16437h = view;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.f16441l = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.f16431b = str;
            return this;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f16430a;
        this.title = builder.f16431b;
        this.advertiser = builder.f16432c;
        this.body = builder.f16433d;
        this.callToAction = builder.f16434e;
        this.icon = builder.f16435f;
        this.iconView = builder.f16436g;
        this.optionsView = builder.f16437h;
        this.mediaView = builder.f16438i;
        this.mainImage = builder.f16439j;
        this.mediaContentAspectRatio = builder.f16440k;
        Double d10 = builder.f16441l;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final Double getStarRating() {
        return this.starRating;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class MaxNativeAdImage {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f16442a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f16443b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f16442a = drawable;
        }

        public Drawable getDrawable() {
            return this.f16442a;
        }

        public Uri getUri() {
            return this.f16443b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f16443b = uri;
        }
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }
}
