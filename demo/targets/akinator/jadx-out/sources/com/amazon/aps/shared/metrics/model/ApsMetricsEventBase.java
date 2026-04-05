package com.amazon.aps.shared.metrics.model;

import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class ApsMetricsEventBase {
    private final long timestamp;

    public ApsMetricsEventBase() {
        this(0L, 1, null);
    }

    public abstract String getJsonKeyName();

    public boolean isToSendDeviceInfo() {
        return false;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, this.timestamp);
        return jSONObject;
    }

    public ApsMetricsEventBase(long j10) {
        this.timestamp = j10;
    }

    public /* synthetic */ ApsMetricsEventBase(long j10, int i10, u uVar) {
        this((i10 & 1) != 0 ? System.currentTimeMillis() : j10);
    }
}
