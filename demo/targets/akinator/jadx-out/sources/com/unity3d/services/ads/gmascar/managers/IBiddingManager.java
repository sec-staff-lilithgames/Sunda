package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface IBiddingManager extends IUnityAdsTokenListener {
    String getFormattedToken(String str);

    String getTokenIdentifier();
}
