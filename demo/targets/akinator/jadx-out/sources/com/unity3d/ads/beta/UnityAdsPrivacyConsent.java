package com.unity3d.ads.beta;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum UnityAdsPrivacyConsent {
    GDPR_CONSENT(0),
    PRIVACY_CONSENT(1),
    PIPL_CONSENT(2);

    private final int value;

    UnityAdsPrivacyConsent(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
