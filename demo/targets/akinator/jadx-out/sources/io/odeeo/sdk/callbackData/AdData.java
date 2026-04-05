package io.odeeo.sdk.callbackData;

import io.odeeo.sdk.AdUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AdData {
    private final String country;
    private final String customTag;
    private final double eCPM;
    private final String placementID;
    private final AdUnit.PlacementType placementType;
    private final String sessionID;
    private final String transactionID;

    public AdData(AdUnit.PlacementType placementType, String sessionID, String placementID, String country, double d10, String transactionID, String customTag) {
        e0.checkNotNullParameter(placementType, "placementType");
        e0.checkNotNullParameter(sessionID, "sessionID");
        e0.checkNotNullParameter(placementID, "placementID");
        e0.checkNotNullParameter(country, "country");
        e0.checkNotNullParameter(transactionID, "transactionID");
        e0.checkNotNullParameter(customTag, "customTag");
        this.placementType = placementType;
        this.sessionID = sessionID;
        this.placementID = placementID;
        this.country = country;
        this.eCPM = d10;
        this.transactionID = transactionID;
        this.customTag = customTag;
    }

    public static /* synthetic */ AdData copy$default(AdData adData, AdUnit.PlacementType placementType, String str, String str2, String str3, double d10, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            placementType = adData.placementType;
        }
        if ((i10 & 2) != 0) {
            str = adData.sessionID;
        }
        if ((i10 & 4) != 0) {
            str2 = adData.placementID;
        }
        if ((i10 & 8) != 0) {
            str3 = adData.country;
        }
        if ((i10 & 16) != 0) {
            d10 = adData.eCPM;
        }
        if ((i10 & 32) != 0) {
            str4 = adData.transactionID;
        }
        if ((i10 & 64) != 0) {
            str5 = adData.customTag;
        }
        double d11 = d10;
        String str6 = str2;
        String str7 = str3;
        return adData.copy(placementType, str, str6, str7, d11, str4, str5);
    }

    public final AdUnit.PlacementType component1() {
        return this.placementType;
    }

    public final String component2() {
        return this.sessionID;
    }

    public final String component3() {
        return this.placementID;
    }

    public final String component4() {
        return this.country;
    }

    public final double component5() {
        return this.eCPM;
    }

    public final String component6() {
        return this.transactionID;
    }

    public final String component7() {
        return this.customTag;
    }

    public final AdData copy(AdUnit.PlacementType placementType, String sessionID, String placementID, String country, double d10, String transactionID, String customTag) {
        e0.checkNotNullParameter(placementType, "placementType");
        e0.checkNotNullParameter(sessionID, "sessionID");
        e0.checkNotNullParameter(placementID, "placementID");
        e0.checkNotNullParameter(country, "country");
        e0.checkNotNullParameter(transactionID, "transactionID");
        e0.checkNotNullParameter(customTag, "customTag");
        return new AdData(placementType, sessionID, placementID, country, d10, transactionID, customTag);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdData)) {
            return false;
        }
        AdData adData = (AdData) obj;
        return this.placementType == adData.placementType && e0.areEqual(this.sessionID, adData.sessionID) && e0.areEqual(this.placementID, adData.placementID) && e0.areEqual(this.country, adData.country) && e0.areEqual((Object) Double.valueOf(this.eCPM), (Object) Double.valueOf(adData.eCPM)) && e0.areEqual(this.transactionID, adData.transactionID) && e0.areEqual(this.customTag, adData.customTag);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCustomTag() {
        return this.customTag;
    }

    public final double getECPM() {
        return this.eCPM;
    }

    public final String getPlacementID() {
        return this.placementID;
    }

    public final AdUnit.PlacementType getPlacementType() {
        return this.placementType;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final String getTransactionID() {
        return this.transactionID;
    }

    public int hashCode() {
        return this.customTag.hashCode() + o2.e((Double.hashCode(this.eCPM) + o2.e(o2.e(o2.e(this.placementType.hashCode() * 31, 31, this.sessionID), 31, this.placementID), 31, this.country)) * 31, 31, this.transactionID);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdData(placementType=");
        sb2.append(this.placementType);
        sb2.append(", sessionID=");
        sb2.append(this.sessionID);
        sb2.append(", placementID=");
        sb2.append(this.placementID);
        sb2.append(", country=");
        sb2.append(this.country);
        sb2.append(", eCPM=");
        sb2.append(this.eCPM);
        sb2.append(", transactionID=");
        sb2.append(this.transactionID);
        sb2.append(", customTag=");
        return o2.q(sb2, this.customTag, ')');
    }

    public /* synthetic */ AdData(AdUnit.PlacementType placementType, String str, String str2, String str3, double d10, String str4, String str5, int i10, u uVar) {
        this(placementType, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? 0.0d : d10, (i10 & 32) != 0 ? "" : str4, (i10 & 64) != 0 ? "" : str5);
    }
}
