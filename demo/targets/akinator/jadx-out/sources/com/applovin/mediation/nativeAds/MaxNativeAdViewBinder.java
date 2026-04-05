package com.applovin.mediation.nativeAds;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final View f16461a;

        /* renamed from: b, reason: collision with root package name */
        private final int f16462b;

        /* renamed from: c, reason: collision with root package name */
        private int f16463c;

        /* renamed from: d, reason: collision with root package name */
        private int f16464d;

        /* renamed from: e, reason: collision with root package name */
        private int f16465e;

        /* renamed from: f, reason: collision with root package name */
        private int f16466f;

        /* renamed from: g, reason: collision with root package name */
        private int f16467g;

        /* renamed from: h, reason: collision with root package name */
        private int f16468h;

        /* renamed from: i, reason: collision with root package name */
        private int f16469i;

        /* renamed from: j, reason: collision with root package name */
        private int f16470j;

        /* renamed from: k, reason: collision with root package name */
        private int f16471k;

        /* renamed from: l, reason: collision with root package name */
        private int f16472l;

        /* renamed from: m, reason: collision with root package name */
        private int f16473m;

        /* renamed from: n, reason: collision with root package name */
        private String f16474n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f16461a, this.f16462b, this.f16463c, this.f16464d, this.f16465e, this.f16466f, this.f16467g, this.f16470j, this.f16468h, this.f16469i, this.f16471k, this.f16472l, this.f16473m, this.f16474n);
        }

        public Builder setAdvertiserTextViewId(int i10) {
            this.f16464d = i10;
            return this;
        }

        public Builder setBodyTextViewId(int i10) {
            this.f16465e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(int i10) {
            this.f16473m = i10;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(int i10) {
            this.f16467g = i10;
            return this;
        }

        public Builder setIconImageViewId(int i10) {
            this.f16466f = i10;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i10) {
            this.f16472l = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i10) {
            this.f16471k = i10;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i10) {
            this.f16469i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i10) {
            this.f16468h = i10;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i10) {
            this.f16470j = i10;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f16474n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i10) {
            this.f16463c = i10;
            return this;
        }

        public Builder(int i10) {
            this(i10, null);
        }

        private Builder(int i10, View view) {
            this.f16463c = -1;
            this.f16464d = -1;
            this.f16465e = -1;
            this.f16466f = -1;
            this.f16467g = -1;
            this.f16468h = -1;
            this.f16469i = -1;
            this.f16470j = -1;
            this.f16471k = -1;
            this.f16472l = -1;
            this.f16473m = -1;
            this.f16462b = i10;
            this.f16461a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.starRatingContentViewGroupId = i16;
        this.optionsContentViewGroupId = i17;
        this.optionsContentFrameLayoutId = i18;
        this.mediaContentViewGroupId = i19;
        this.mediaContentFrameLayoutId = i20;
        this.callToActionButtonId = i21;
        this.templateType = str;
    }
}
