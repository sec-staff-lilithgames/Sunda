package com.vungle.ads.internal.util;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LogEntry {
    private String adSource;
    private Boolean adoEnabled;
    private String creativeId;
    private String eventId;
    private String mediationName;
    private Boolean partialDownloadEnabled;
    private String placementRefId;
    private String vmVersion;

    private final int hashCode(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e0.areEqual(LogEntry.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        e0.checkNotNull(obj, "null cannot be cast to non-null type com.vungle.ads.internal.util.LogEntry");
        LogEntry logEntry = (LogEntry) obj;
        return e0.areEqual(this.placementRefId, logEntry.placementRefId) && e0.areEqual(this.creativeId, logEntry.creativeId) && e0.areEqual(this.eventId, logEntry.eventId) && e0.areEqual(this.adSource, logEntry.adSource) && e0.areEqual(this.mediationName, logEntry.mediationName) && e0.areEqual(this.vmVersion, logEntry.vmVersion) && e0.areEqual(this.partialDownloadEnabled, logEntry.partialDownloadEnabled) && e0.areEqual(this.adoEnabled, logEntry.adoEnabled);
    }

    public final String getAdSource$vungle_ads_release() {
        return this.adSource;
    }

    public final Boolean getAdoEnabled$vungle_ads_release() {
        return this.adoEnabled;
    }

    public final String getCreativeId$vungle_ads_release() {
        return this.creativeId;
    }

    public final String getEventId$vungle_ads_release() {
        return this.eventId;
    }

    public final String getMediationName$vungle_ads_release() {
        return this.mediationName;
    }

    public final Boolean getPartialDownloadEnabled$vungle_ads_release() {
        return this.partialDownloadEnabled;
    }

    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    public final String getVmVersion$vungle_ads_release() {
        return this.vmVersion;
    }

    public final void setAdSource$vungle_ads_release(String str) {
        this.adSource = str;
    }

    public final void setAdoEnabled$vungle_ads_release(Boolean bool) {
        this.adoEnabled = bool;
    }

    public final void setCreativeId$vungle_ads_release(String str) {
        this.creativeId = str;
    }

    public final void setEventId$vungle_ads_release(String str) {
        this.eventId = str;
    }

    public final void setMediationName$vungle_ads_release(String str) {
        this.mediationName = str;
    }

    public final void setPartialDownloadEnabled$vungle_ads_release(Boolean bool) {
        this.partialDownloadEnabled = bool;
    }

    public final void setPlacementRefId$vungle_ads_release(String str) {
        this.placementRefId = str;
    }

    public final void setVmVersion$vungle_ads_release(String str) {
        this.vmVersion = str;
    }

    public String toString() {
        return "LogEntry(placementRefId=" + this.placementRefId + ", creativeId=" + this.creativeId + ", eventId=" + this.eventId + ", adSource=" + this.adSource + ", mediationName=" + this.mediationName + ", vmVersion=" + this.vmVersion + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ", adoEnabled=" + this.adoEnabled + ')';
    }

    public int hashCode() {
        int iHashCode = ((((((((((hashCode(this.placementRefId) * 31) + hashCode(this.creativeId)) * 31) + hashCode(this.eventId)) * 31) + hashCode(this.adSource)) * 31) + hashCode(this.mediationName)) * 31) + hashCode(this.vmVersion)) * 31;
        Boolean bool = this.partialDownloadEnabled;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.adoEnabled;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
