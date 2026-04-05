package com.unity3d.services.core.extensions;

import a.b;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StringExtensionsKt {
    public static final String toUnityMessage(String str) {
        return (str == null || str.length() == 0) ? "[Unity Ads] Internal error" : b.k(UnityAdsConstants.Messages.MSG_UNITY_BASE, str);
    }
}
