package com.unity3d.ads.beta;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UnityAdsPrivacy {
    public static final void set(UnityAdsPrivacyConsent consent, UnityAdsPrivacyConsentValue value) {
        e0.checkNotNullParameter(consent, "consent");
        e0.checkNotNullParameter(value, "value");
    }

    public static final void setPrivacy(String flag, UnityAdsPrivacyConsentValue value) {
        e0.checkNotNullParameter(flag, "flag");
        e0.checkNotNullParameter(value, "value");
    }

    public static final void set(UnityAdsPrivacyFlag privacy, UnityAdsPrivacyValue value) {
        e0.checkNotNullParameter(privacy, "privacy");
        e0.checkNotNullParameter(value, "value");
    }

    public static final void setPrivacy(String flag, UnityAdsPrivacyValue consent) {
        e0.checkNotNullParameter(flag, "flag");
        e0.checkNotNullParameter(consent, "consent");
    }
}
