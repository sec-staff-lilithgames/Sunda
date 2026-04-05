package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class NativeAdScrollView extends LinearLayout {
    public static final int DEFAULT_INSET = 20;
    public static final int DEFAULT_MAX_ADS = 10;
    private final NativeAdScrollViewApi mNativeAdScrollViewApi;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AdViewProvider {
        View createView(NativeAd nativeAd, int i10);

        void destroyView(NativeAd nativeAd, View view);
    }

    private NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, int i10, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i11) {
        super(context);
        this.mNativeAdScrollViewApi = DynamicLoaderFactory.makeLoader(context).createNativeAdScrollViewApi(this, context, nativeAdsManager, adViewProvider, i10, type, nativeAdViewAttributes, i11);
    }

    public void setInset(int i10) {
        this.mNativeAdScrollViewApi.setInset(i10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider) {
        this(context, nativeAdsManager, adViewProvider, 0, null, null, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, int i10) {
        this(context, nativeAdsManager, adViewProvider, 0, null, null, i10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i10) {
        this(context, nativeAdsManager, null, i10, null, null, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i10, NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, null, i10, null, nativeAdViewAttributes, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i10, NativeAdViewAttributes nativeAdViewAttributes, int i11) {
        this(context, nativeAdsManager, null, i10, null, nativeAdViewAttributes, i11);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type) {
        this(context, nativeAdsManager, null, 0, type, null, 10);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, null, 0, type, nativeAdViewAttributes, 10);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i10) {
        this(context, nativeAdsManager, null, 0, type, nativeAdViewAttributes, i10);
    }
}
