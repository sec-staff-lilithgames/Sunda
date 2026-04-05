package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface AppLovinNativeAd {
    void destroy();

    long getAdIdNumber();

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Uri getIconUri();

    AppLovinMediaView getMediaView();

    AppLovinOptionsView getOptionsView();

    Double getStarRating();

    String getTitle();

    void registerViewsForInteraction(List<View> list, ViewGroup viewGroup);

    void unregisterViewsForInteraction();
}
