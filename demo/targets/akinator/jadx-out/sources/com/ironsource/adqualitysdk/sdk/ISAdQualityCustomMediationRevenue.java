package com.ironsource.adqualitysdk.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ISAdQualityCustomMediationRevenue {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final String f205;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final double f206;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final ISAdQualityAdType f207;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final ISAdQualityMediationNetwork f208;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private ISAdQualityMediationNetwork f209 = ISAdQualityMediationNetwork.UNKNOWN;

        /* renamed from: ｋ, reason: contains not printable characters */
        private ISAdQualityAdType f210 = ISAdQualityAdType.UNKNOWN;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private String f211;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private double f212;

        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f209, this.f210, this.f212, this.f211, (byte) 0);
        }

        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f210 = iSAdQualityAdType;
            return this;
        }

        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f209 = iSAdQualityMediationNetwork;
            return this;
        }

        public Builder setPlacement(String str) {
            this.f211 = str;
            return this;
        }

        public Builder setRevenue(double d10) {
            this.f212 = d10;
            return this;
        }
    }

    public /* synthetic */ ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d10, String str, byte b10) {
        this(iSAdQualityMediationNetwork, iSAdQualityAdType, d10, str);
    }

    public ISAdQualityAdType getAdType() {
        return this.f207;
    }

    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f208;
    }

    public String getPlacement() {
        return this.f205;
    }

    public double getRevenue() {
        return this.f206;
    }

    private ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d10, String str) {
        this.f208 = iSAdQualityMediationNetwork;
        this.f207 = iSAdQualityAdType;
        this.f206 = d10;
        this.f205 = str;
    }
}
