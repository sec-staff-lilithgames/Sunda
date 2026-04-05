package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AdPlacementConfig {
    private final AdsFormat adsFormat;
    private final CustomParams customParams;
    private final String placementId;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private final AdsFormat adsFormat;
        private CustomParams customParams;
        private String placementId;

        public Builder(AdsFormat adsFormat) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adsFormat, "adsFormat");
            this.adsFormat = adsFormat;
        }

        public final AdPlacementConfig build() {
            return new AdPlacementConfig(this.adsFormat, this.placementId, this.customParams);
        }

        public final Builder withCustomParams(CustomParams customParams) {
            this.customParams = customParams;
            return this;
        }

        public final Builder withPlacementId(String str) {
            this.placementId = str;
            return this;
        }
    }

    public AdPlacementConfig(AdsFormat adsFormat, String str, CustomParams customParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adsFormat, "adsFormat");
        this.adsFormat = adsFormat;
        this.placementId = str;
        this.customParams = customParams;
    }

    public static /* synthetic */ AdPlacementConfig copy$default(AdPlacementConfig adPlacementConfig, AdsFormat adsFormat, String str, CustomParams customParams, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            adsFormat = adPlacementConfig.adsFormat;
        }
        if ((i10 & 2) != 0) {
            str = adPlacementConfig.placementId;
        }
        if ((i10 & 4) != 0) {
            customParams = adPlacementConfig.customParams;
        }
        return adPlacementConfig.copy(adsFormat, str, customParams);
    }

    public final AdsFormat component1() {
        return this.adsFormat;
    }

    public final String component2() {
        return this.placementId;
    }

    public final CustomParams component3() {
        return this.customParams;
    }

    public final AdPlacementConfig copy(AdsFormat adsFormat, String str, CustomParams customParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adsFormat, "adsFormat");
        return new AdPlacementConfig(adsFormat, str, customParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdPlacementConfig)) {
            return false;
        }
        AdPlacementConfig adPlacementConfig = (AdPlacementConfig) obj;
        return this.adsFormat == adPlacementConfig.adsFormat && kotlin.jvm.internal.e0.areEqual(this.placementId, adPlacementConfig.placementId) && kotlin.jvm.internal.e0.areEqual(this.customParams, adPlacementConfig.customParams);
    }

    public final AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    public final CustomParams getCustomParams() {
        return this.customParams;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public int hashCode() {
        int iHashCode = this.adsFormat.hashCode() * 31;
        String str = this.placementId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CustomParams customParams = this.customParams;
        return iHashCode2 + (customParams != null ? customParams.hashCode() : 0);
    }

    public String toString() {
        return "AdPlacementConfig(adsFormat=" + this.adsFormat + ", placementId=" + this.placementId + ", customParams=" + this.customParams + ')';
    }
}
