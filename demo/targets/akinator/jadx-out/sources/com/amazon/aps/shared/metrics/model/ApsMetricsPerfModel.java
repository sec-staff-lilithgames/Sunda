package com.amazon.aps.shared.metrics.model;

import a.b;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsPerfModel extends ApsMetricsEventBase {
    private ApsMetricsPerfAdClickEvent adClickEvent;
    private String adFormat;
    private ApsMetricsPerfAdapterEvent adapterEvent;
    private ApsMetricsPerfAaxBidEvent bidEvent;
    private String bidId;
    private String correlationId;
    private ApsMetricsPerfAdFetchEvent fetchEvent;
    private ApsMetricsPerfImpressionFiredEvent impressionEvent;
    private String networkName;
    private ApsMetricsPerfVideoCompletedEvent videoCompletedEvent;
    private Boolean videoFlag;

    /* JADX WARN: Multi-variable type inference failed */
    public ApsMetricsPerfModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ApsMetricsPerfModel copy$default(ApsMetricsPerfModel apsMetricsPerfModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apsMetricsPerfModel.networkName;
        }
        return apsMetricsPerfModel.copy(str);
    }

    public final String component1() {
        return this.networkName;
    }

    public final ApsMetricsPerfModel copy(String str) {
        return new ApsMetricsPerfModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApsMetricsPerfModel) && e0.areEqual(this.networkName, ((ApsMetricsPerfModel) obj).networkName);
    }

    public final ApsMetricsPerfAdClickEvent getAdClickEvent() {
        return this.adClickEvent;
    }

    public final String getAdFormat() {
        return this.adFormat;
    }

    public final ApsMetricsPerfAdapterEvent getAdapterEvent() {
        return this.adapterEvent;
    }

    public final ApsMetricsPerfAaxBidEvent getBidEvent() {
        return this.bidEvent;
    }

    public final String getBidId() {
        return this.bidId;
    }

    public final String getCorrelationId() {
        return this.correlationId;
    }

    public final ApsMetricsPerfAdFetchEvent getFetchEvent() {
        return this.fetchEvent;
    }

    public final ApsMetricsPerfImpressionFiredEvent getImpressionEvent() {
        return this.impressionEvent;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    public String getJsonKeyName() {
        return "p";
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public final ApsMetricsPerfVideoCompletedEvent getVideoCompletedEvent() {
        return this.videoCompletedEvent;
    }

    public final Boolean getVideoFlag() {
        return this.videoFlag;
    }

    public int hashCode() {
        String str = this.networkName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    public boolean isToSendDeviceInfo() {
        return (this.bidEvent == null && this.adapterEvent == null) ? false : true;
    }

    public final void setAdClickEvent(ApsMetricsPerfAdClickEvent apsMetricsPerfAdClickEvent) {
        this.adClickEvent = apsMetricsPerfAdClickEvent;
    }

    public final void setAdFormat(String str) {
        this.adFormat = str;
    }

    public final void setAdapterEvent(ApsMetricsPerfAdapterEvent apsMetricsPerfAdapterEvent) {
        this.adapterEvent = apsMetricsPerfAdapterEvent;
    }

    public final void setBidEvent(ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent) {
        this.bidEvent = apsMetricsPerfAaxBidEvent;
    }

    public final void setBidId(String str) {
        this.bidId = str;
    }

    public final void setCorrelationId(String str) {
        this.correlationId = str;
    }

    public final void setFetchEvent(ApsMetricsPerfAdFetchEvent apsMetricsPerfAdFetchEvent) {
        this.fetchEvent = apsMetricsPerfAdFetchEvent;
    }

    public final void setImpressionEvent(ApsMetricsPerfImpressionFiredEvent apsMetricsPerfImpressionFiredEvent) {
        this.impressionEvent = apsMetricsPerfImpressionFiredEvent;
    }

    public final void setNetworkName(String str) {
        this.networkName = str;
    }

    public final void setVideoCompletedEvent(ApsMetricsPerfVideoCompletedEvent apsMetricsPerfVideoCompletedEvent) {
        this.videoCompletedEvent = apsMetricsPerfVideoCompletedEvent;
    }

    public final void setVideoFlag(Boolean bool) {
        this.videoFlag = bool;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jsonObject = super.toJsonObject();
        String str = this.networkName;
        if (str != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_NETWORK, str);
        }
        String str2 = this.bidId;
        if (str2 != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_BIDID, str2);
        }
        String str3 = this.correlationId;
        if (str3 != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_CORRELATIONID, str3);
        }
        Boolean bool = this.videoFlag;
        if (bool != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, bool.booleanValue());
        }
        String str4 = this.adFormat;
        if (str4 != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, str4);
        }
        ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent = this.bidEvent;
        if (apsMetricsPerfAaxBidEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_BIDEVENT, apsMetricsPerfAaxBidEvent.toJsonObject());
        }
        ApsMetricsPerfAdapterEvent apsMetricsPerfAdapterEvent = this.adapterEvent;
        if (apsMetricsPerfAdapterEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT, apsMetricsPerfAdapterEvent.toJsonObject());
        }
        ApsMetricsPerfAdFetchEvent apsMetricsPerfAdFetchEvent = this.fetchEvent;
        if (apsMetricsPerfAdFetchEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_FETCHEVENT, apsMetricsPerfAdFetchEvent.toJsonObject());
        }
        ApsMetricsPerfImpressionFiredEvent apsMetricsPerfImpressionFiredEvent = this.impressionEvent;
        if (apsMetricsPerfImpressionFiredEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, apsMetricsPerfImpressionFiredEvent.toJsonObject());
        }
        ApsMetricsPerfAdClickEvent apsMetricsPerfAdClickEvent = this.adClickEvent;
        if (apsMetricsPerfAdClickEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADCLICKEVENT, apsMetricsPerfAdClickEvent.toJsonObject());
        }
        ApsMetricsPerfVideoCompletedEvent apsMetricsPerfVideoCompletedEvent = this.videoCompletedEvent;
        if (apsMetricsPerfVideoCompletedEvent != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOCOMPLETEDEVENT, apsMetricsPerfVideoCompletedEvent.toJsonObject());
        }
        return jsonObject;
    }

    public String toString() {
        return b.l("ApsMetricsPerfModel(networkName=", this.networkName, ")");
    }

    public /* synthetic */ ApsMetricsPerfModel(String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public ApsMetricsPerfModel(String str) {
        super(0L, 1, null);
        this.networkName = str;
    }
}
