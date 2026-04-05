package com.amazon.aps.shared.metrics.model;

import kotlin.jvm.internal.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsPerfAaxBidEvent extends ApsMetricsPerfEventBase {
    private final String hostname;
    private Boolean refreshFlag;
    private final ApsMetricsResult result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsMetricsPerfAaxBidEvent(ApsMetricsResult result, String hostname) {
        super(result, 0L, 0L, 6, null);
        e0.checkNotNullParameter(result, "result");
        e0.checkNotNullParameter(hostname, "hostname");
        this.result = result;
        this.hostname = hostname;
    }

    public static /* synthetic */ ApsMetricsPerfAaxBidEvent copy$default(ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent, ApsMetricsResult apsMetricsResult, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apsMetricsResult = apsMetricsPerfAaxBidEvent.result;
        }
        if ((i10 & 2) != 0) {
            str = apsMetricsPerfAaxBidEvent.hostname;
        }
        return apsMetricsPerfAaxBidEvent.copy(apsMetricsResult, str);
    }

    public final ApsMetricsResult component1() {
        return this.result;
    }

    public final String component2() {
        return this.hostname;
    }

    public final ApsMetricsPerfAaxBidEvent copy(ApsMetricsResult result, String hostname) {
        e0.checkNotNullParameter(result, "result");
        e0.checkNotNullParameter(hostname, "hostname");
        return new ApsMetricsPerfAaxBidEvent(result, hostname);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApsMetricsPerfAaxBidEvent)) {
            return false;
        }
        ApsMetricsPerfAaxBidEvent apsMetricsPerfAaxBidEvent = (ApsMetricsPerfAaxBidEvent) obj;
        return this.result == apsMetricsPerfAaxBidEvent.result && e0.areEqual(this.hostname, apsMetricsPerfAaxBidEvent.hostname);
    }

    public final String getHostname() {
        return this.hostname;
    }

    public final Boolean getRefreshFlag() {
        return this.refreshFlag;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    public ApsMetricsResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.hostname.hashCode() + (this.result.hashCode() * 31);
    }

    public final void setRefreshFlag(Boolean bool) {
        this.refreshFlag = bool;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, this.hostname);
        Boolean bool = this.refreshFlag;
        if (bool != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_REFRESHFLAG, bool.booleanValue());
        }
        return jsonObject;
    }

    public String toString() {
        return "ApsMetricsPerfAaxBidEvent(result=" + this.result + ", hostname=" + this.hostname + ")";
    }
}
