package com.amazon.aps.shared.metrics.model;

import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsMetricsPerfEventBase {
    private long endTime;
    private final ApsMetricsResult result;
    private long startTime;

    public ApsMetricsPerfEventBase() {
        this(null, 0L, 0L, 7, null);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public ApsMetricsResult getResult() {
        return this.result;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setEndTime(long j10) {
        this.endTime = j10;
    }

    public final void setStartTime(long j10) {
        this.startTime = j10;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ApsMetricsResult result = getResult();
        if (result != null) {
            jSONObject.put("r", result == ApsMetricsResult.Success);
        }
        long j10 = this.startTime;
        if (j10 != 0) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_STARTTIME, j10);
        }
        long j11 = this.endTime;
        if (j11 != 0) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_ENDTIME, j11);
        }
        return jSONObject;
    }

    public ApsMetricsPerfEventBase(ApsMetricsResult apsMetricsResult, long j10, long j11) {
        this.result = apsMetricsResult;
        this.startTime = j10;
        this.endTime = j11;
    }

    public /* synthetic */ ApsMetricsPerfEventBase(ApsMetricsResult apsMetricsResult, long j10, long j11, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : apsMetricsResult, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) != 0 ? 0L : j11);
    }
}
