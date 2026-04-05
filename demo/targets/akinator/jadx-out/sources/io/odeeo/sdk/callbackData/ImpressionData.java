package io.odeeo.sdk.callbackData;

import io.odeeo.sdk.AdUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ImpressionData {
    private String country;
    private String customTag;
    private double payableAmount;
    private String placementID;
    private AdUnit.PlacementType placementType;
    private String sessionID;
    private String transactionID;

    public ImpressionData(AdUnit.PlacementType placementType, String placementID, String sessionID, String country, String transactionID, double d10, String customTag) {
        e0.checkNotNullParameter(placementType, "placementType");
        e0.checkNotNullParameter(placementID, "placementID");
        e0.checkNotNullParameter(sessionID, "sessionID");
        e0.checkNotNullParameter(country, "country");
        e0.checkNotNullParameter(transactionID, "transactionID");
        e0.checkNotNullParameter(customTag, "customTag");
        this.placementType = placementType;
        this.placementID = placementID;
        this.sessionID = sessionID;
        this.country = country;
        this.transactionID = transactionID;
        this.payableAmount = d10;
        this.customTag = customTag;
    }

    public static /* synthetic */ ImpressionData copy$default(ImpressionData impressionData, AdUnit.PlacementType placementType, String str, String str2, String str3, String str4, double d10, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            placementType = impressionData.placementType;
        }
        if ((i10 & 2) != 0) {
            str = impressionData.placementID;
        }
        if ((i10 & 4) != 0) {
            str2 = impressionData.sessionID;
        }
        if ((i10 & 8) != 0) {
            str3 = impressionData.country;
        }
        if ((i10 & 16) != 0) {
            str4 = impressionData.transactionID;
        }
        if ((i10 & 32) != 0) {
            d10 = impressionData.payableAmount;
        }
        if ((i10 & 64) != 0) {
            str5 = impressionData.customTag;
        }
        String str6 = str5;
        double d11 = d10;
        String str7 = str4;
        String str8 = str2;
        return impressionData.copy(placementType, str, str8, str3, str7, d11, str6);
    }

    public final AdUnit.PlacementType component1() {
        return this.placementType;
    }

    public final String component2() {
        return this.placementID;
    }

    public final String component3() {
        return this.sessionID;
    }

    public final String component4() {
        return this.country;
    }

    public final String component5() {
        return this.transactionID;
    }

    public final double component6() {
        return this.payableAmount;
    }

    public final String component7() {
        return this.customTag;
    }

    public final ImpressionData copy(AdUnit.PlacementType placementType, String placementID, String sessionID, String country, String transactionID, double d10, String customTag) {
        e0.checkNotNullParameter(placementType, "placementType");
        e0.checkNotNullParameter(placementID, "placementID");
        e0.checkNotNullParameter(sessionID, "sessionID");
        e0.checkNotNullParameter(country, "country");
        e0.checkNotNullParameter(transactionID, "transactionID");
        e0.checkNotNullParameter(customTag, "customTag");
        return new ImpressionData(placementType, placementID, sessionID, country, transactionID, d10, customTag);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImpressionData)) {
            return false;
        }
        ImpressionData impressionData = (ImpressionData) obj;
        return this.placementType == impressionData.placementType && e0.areEqual(this.placementID, impressionData.placementID) && e0.areEqual(this.sessionID, impressionData.sessionID) && e0.areEqual(this.country, impressionData.country) && e0.areEqual(this.transactionID, impressionData.transactionID) && e0.areEqual((Object) Double.valueOf(this.payableAmount), (Object) Double.valueOf(impressionData.payableAmount)) && e0.areEqual(this.customTag, impressionData.customTag);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCustomTag() {
        return this.customTag;
    }

    public final double getPayableAmount() {
        return this.payableAmount;
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
        return this.customTag.hashCode() + ((Double.hashCode(this.payableAmount) + o2.e(o2.e(o2.e(o2.e(this.placementType.hashCode() * 31, 31, this.placementID), 31, this.sessionID), 31, this.country), 31, this.transactionID)) * 31);
    }

    public final void setCountry(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.country = str;
    }

    public final void setCustomTag(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.customTag = str;
    }

    public final void setPayableAmount(double d10) {
        this.payableAmount = d10;
    }

    public final void setPlacementID(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.placementID = str;
    }

    public final void setPlacementType(AdUnit.PlacementType placementType) {
        e0.checkNotNullParameter(placementType, "<set-?>");
        this.placementType = placementType;
    }

    public final void setSessionID(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.sessionID = str;
    }

    public final void setTransactionID(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.transactionID = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImpressionData(placementType=");
        sb2.append(this.placementType);
        sb2.append(", placementID=");
        sb2.append(this.placementID);
        sb2.append(", sessionID=");
        sb2.append(this.sessionID);
        sb2.append(", country=");
        sb2.append(this.country);
        sb2.append(", transactionID=");
        sb2.append(this.transactionID);
        sb2.append(", payableAmount=");
        sb2.append(this.payableAmount);
        sb2.append(", customTag=");
        return o2.q(sb2, this.customTag, ')');
    }

    public /* synthetic */ ImpressionData(AdUnit.PlacementType placementType, String str, String str2, String str3, String str4, double d10, String str5, int i10, u uVar) {
        this(placementType, str, str2, str3, str4, d10, (i10 & 64) != 0 ? "" : str5);
    }
}
