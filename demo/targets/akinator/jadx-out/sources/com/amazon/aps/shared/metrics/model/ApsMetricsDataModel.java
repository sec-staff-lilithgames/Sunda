package com.amazon.aps.shared.metrics.model;

import be.nVUQ.UupKET;
import com.amazon.aps.shared.ApsMetrics;
import java.util.UUID;
import kotlin.jvm.internal.e0;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class ApsMetricsDataModel {
    private final ApsMetricsEvent metrics;

    public ApsMetricsDataModel(ApsMetricsEvent metrics) {
        e0.checkNotNullParameter(metrics, "metrics");
        this.metrics = metrics;
    }

    public final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, 1);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, System.currentTimeMillis());
        jSONObject2.put("id", UUID.randomUUID().toString());
        if (this.metrics.isToSendDeviceInfo()) {
            ApsMetrics.Companion companion = ApsMetrics.Companion;
            jSONObject2.put(UupKET.QXiz, companion.getApsMetricsDeviceInfo().toJsonObject());
            jSONObject2.put(ApsMetricsDataMap.APSMETRICS_FIELD_SDK, companion.getApsMetricsSdkInfo().toJsonObject());
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.metrics.toJsonObject());
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_APS, jSONObject2.put("m", jSONArray));
        return jSONObject;
    }
}
