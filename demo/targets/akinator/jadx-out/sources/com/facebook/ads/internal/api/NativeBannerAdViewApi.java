package com.facebook.ads.internal.api;

import android.content.Context;
import android.view.View;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface NativeBannerAdViewApi {
    View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type);

    View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes);
}
