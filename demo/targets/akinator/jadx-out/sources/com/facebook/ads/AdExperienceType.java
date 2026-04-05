package com.facebook.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum AdExperienceType {
    AD_EXPERIENCE_TYPE_REWARDED("ad_experience_config_rewarded"),
    AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL("ad_experience_config_rewarded_interstitial"),
    AD_EXPERIENCE_TYPE_INTERSTITIAL("ad_experience_config_interstitial");

    private String adExperienceType;

    AdExperienceType(String str) {
        this.adExperienceType = str;
    }

    public String getAdExperienceType() {
        return this.adExperienceType;
    }
}
