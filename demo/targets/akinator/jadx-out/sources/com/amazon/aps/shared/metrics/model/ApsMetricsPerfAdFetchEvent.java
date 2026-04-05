package com.amazon.aps.shared.metrics.model;

import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsPerfAdFetchEvent extends ApsMetricsPerfEventBase {
    private ApsMetricsResult result;
    private String url;

    /* JADX WARN: Multi-variable type inference failed */
    public ApsMetricsPerfAdFetchEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ApsMetricsPerfAdFetchEvent copy$default(ApsMetricsPerfAdFetchEvent apsMetricsPerfAdFetchEvent, ApsMetricsResult apsMetricsResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apsMetricsResult = apsMetricsPerfAdFetchEvent.result;
        }
        return apsMetricsPerfAdFetchEvent.copy(apsMetricsResult);
    }

    public final ApsMetricsResult component1() {
        return this.result;
    }

    public final ApsMetricsPerfAdFetchEvent copy(ApsMetricsResult apsMetricsResult) {
        return new ApsMetricsPerfAdFetchEvent(apsMetricsResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApsMetricsPerfAdFetchEvent) && this.result == ((ApsMetricsPerfAdFetchEvent) obj).result;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    public ApsMetricsResult getResult() {
        return this.result;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        ApsMetricsResult apsMetricsResult = this.result;
        if (apsMetricsResult == null) {
            return 0;
        }
        return apsMetricsResult.hashCode();
    }

    public void setResult(ApsMetricsResult apsMetricsResult) {
        this.result = apsMetricsResult;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jsonObject = super.toJsonObject();
        String str = this.url;
        if (str != null) {
            jsonObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_URL, str);
        }
        return jsonObject;
    }

    public String toString() {
        return "ApsMetricsPerfAdFetchEvent(result=" + this.result + ")";
    }

    public /* synthetic */ ApsMetricsPerfAdFetchEvent(ApsMetricsResult apsMetricsResult, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : apsMetricsResult);
    }

    public ApsMetricsPerfAdFetchEvent(ApsMetricsResult apsMetricsResult) {
        super(apsMetricsResult, 0L, 0L, 6, null);
        this.result = apsMetricsResult;
    }
}
