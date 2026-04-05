package com.inmobi.adquality.models;

import com.inmobi.media.AbstractC2962r0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class AdQualityResult {
    private final String beaconUrl;
    private String extras;
    private String imageLocation;
    private String sdkModelResult;

    public AdQualityResult(String imageLocation, String str, String beaconUrl, String str2) {
        e0.checkNotNullParameter(imageLocation, "imageLocation");
        e0.checkNotNullParameter(beaconUrl, "beaconUrl");
        this.imageLocation = imageLocation;
        this.sdkModelResult = str;
        this.beaconUrl = beaconUrl;
        this.extras = str2;
    }

    public static /* synthetic */ AdQualityResult copy$default(AdQualityResult adQualityResult, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adQualityResult.imageLocation;
        }
        if ((i10 & 2) != 0) {
            str2 = adQualityResult.sdkModelResult;
        }
        if ((i10 & 4) != 0) {
            str3 = adQualityResult.beaconUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = adQualityResult.extras;
        }
        return adQualityResult.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.imageLocation;
    }

    public final String component2() {
        return this.sdkModelResult;
    }

    public final String component3() {
        return this.beaconUrl;
    }

    public final String component4() {
        return this.extras;
    }

    public final AdQualityResult copy(String imageLocation, String str, String beaconUrl, String str2) {
        e0.checkNotNullParameter(imageLocation, "imageLocation");
        e0.checkNotNullParameter(beaconUrl, "beaconUrl");
        return new AdQualityResult(imageLocation, str, beaconUrl, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityResult)) {
            return false;
        }
        AdQualityResult adQualityResult = (AdQualityResult) obj;
        return e0.areEqual(this.imageLocation, adQualityResult.imageLocation) && e0.areEqual(this.sdkModelResult, adQualityResult.sdkModelResult) && e0.areEqual(this.beaconUrl, adQualityResult.beaconUrl) && e0.areEqual(this.extras, adQualityResult.extras);
    }

    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    public final String getExtras() {
        return this.extras;
    }

    public final String getImageLocation() {
        return this.imageLocation;
    }

    public final String getSdkModelResult() {
        return this.sdkModelResult;
    }

    public int hashCode() {
        int iHashCode = this.imageLocation.hashCode() * 31;
        String str = this.sdkModelResult;
        int iE = o2.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.beaconUrl);
        String str2 = this.extras;
        return iE + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setExtras(String str) {
        this.extras = str;
    }

    public final void setImageLocation(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.imageLocation = str;
    }

    public final void setSdkModelResult(String str) {
        this.sdkModelResult = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdQualityResult(imageLocation=");
        sb2.append(this.imageLocation);
        sb2.append(", sdkModelResult=");
        sb2.append(this.sdkModelResult);
        sb2.append(", beaconUrl=");
        sb2.append(this.beaconUrl);
        sb2.append(", extras=");
        return AbstractC2962r0.a(sb2, this.extras, ')');
    }

    public /* synthetic */ AdQualityResult(String str, String str2, String str3, String str4, int i10, u uVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
    }
}
