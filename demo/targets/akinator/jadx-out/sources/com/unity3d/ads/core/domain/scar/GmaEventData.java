package com.unity3d.ads.core.domain.scar;

import com.google.android.gms.internal.play_billing.a;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.banners.bridge.BannerBridge;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GmaEventData {
    private final BannerBridge.BannerEvent bannerEvent;
    private final Integer errorCode;
    private final String errorMessage;
    private final c gmaEvent;
    private final String opportunityId;
    private final String placementId;
    private final String queryId;

    public GmaEventData(c gmaEvent, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num) {
        e0.checkNotNullParameter(gmaEvent, "gmaEvent");
        this.gmaEvent = gmaEvent;
        this.bannerEvent = bannerEvent;
        this.opportunityId = str;
        this.placementId = str2;
        this.queryId = str3;
        this.errorMessage = str4;
        this.errorCode = num;
    }

    public static /* synthetic */ GmaEventData copy$default(GmaEventData gmaEventData, c cVar, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = gmaEventData.gmaEvent;
        }
        if ((i10 & 2) != 0) {
            bannerEvent = gmaEventData.bannerEvent;
        }
        if ((i10 & 4) != 0) {
            str = gmaEventData.opportunityId;
        }
        if ((i10 & 8) != 0) {
            str2 = gmaEventData.placementId;
        }
        if ((i10 & 16) != 0) {
            str3 = gmaEventData.queryId;
        }
        if ((i10 & 32) != 0) {
            str4 = gmaEventData.errorMessage;
        }
        if ((i10 & 64) != 0) {
            num = gmaEventData.errorCode;
        }
        String str5 = str4;
        Integer num2 = num;
        String str6 = str3;
        String str7 = str;
        return gmaEventData.copy(cVar, bannerEvent, str7, str2, str6, str5, num2);
    }

    public final c component1() {
        return this.gmaEvent;
    }

    public final BannerBridge.BannerEvent component2() {
        return this.bannerEvent;
    }

    public final String component3() {
        return this.opportunityId;
    }

    public final String component4() {
        return this.placementId;
    }

    public final String component5() {
        return this.queryId;
    }

    public final String component6() {
        return this.errorMessage;
    }

    public final Integer component7() {
        return this.errorCode;
    }

    public final GmaEventData copy(c gmaEvent, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num) {
        e0.checkNotNullParameter(gmaEvent, "gmaEvent");
        return new GmaEventData(gmaEvent, bannerEvent, str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GmaEventData)) {
            return false;
        }
        GmaEventData gmaEventData = (GmaEventData) obj;
        return this.gmaEvent == gmaEventData.gmaEvent && this.bannerEvent == gmaEventData.bannerEvent && e0.areEqual(this.opportunityId, gmaEventData.opportunityId) && e0.areEqual(this.placementId, gmaEventData.placementId) && e0.areEqual(this.queryId, gmaEventData.queryId) && e0.areEqual(this.errorMessage, gmaEventData.errorMessage) && e0.areEqual(this.errorCode, gmaEventData.errorCode);
    }

    public final BannerBridge.BannerEvent getBannerEvent() {
        return this.bannerEvent;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final c getGmaEvent() {
        return this.gmaEvent;
    }

    public final String getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public int hashCode() {
        int iHashCode = this.gmaEvent.hashCode() * 31;
        BannerBridge.BannerEvent bannerEvent = this.bannerEvent;
        int iHashCode2 = (iHashCode + (bannerEvent == null ? 0 : bannerEvent.hashCode())) * 31;
        String str = this.opportunityId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placementId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.queryId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorMessage;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.errorCode;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GmaEventData(gmaEvent=");
        sb2.append(this.gmaEvent);
        sb2.append(", bannerEvent=");
        sb2.append(this.bannerEvent);
        sb2.append(", opportunityId=");
        sb2.append(this.opportunityId);
        sb2.append(", placementId=");
        sb2.append(this.placementId);
        sb2.append(", queryId=");
        sb2.append(this.queryId);
        sb2.append(", errorMessage=");
        sb2.append(this.errorMessage);
        sb2.append(", errorCode=");
        return a.j(sb2, this.errorCode, ')');
    }

    public /* synthetic */ GmaEventData(c cVar, BannerBridge.BannerEvent bannerEvent, String str, String str2, String str3, String str4, Integer num, int i10, u uVar) {
        this(cVar, (i10 & 2) != 0 ? null : bannerEvent, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : num);
    }
}
