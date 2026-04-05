package com.amazon.aps.shared.metrics.model;

import kotlin.jvm.internal.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsEvent {
    private final ApsMetricsEventBase metricsEvent;

    public ApsMetricsEvent(ApsMetricsEventBase metricsEvent) {
        e0.checkNotNullParameter(metricsEvent, "metricsEvent");
        this.metricsEvent = metricsEvent;
    }

    private final ApsMetricsEventBase component1() {
        return this.metricsEvent;
    }

    public static /* synthetic */ ApsMetricsEvent copy$default(ApsMetricsEvent apsMetricsEvent, ApsMetricsEventBase apsMetricsEventBase, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apsMetricsEventBase = apsMetricsEvent.metricsEvent;
        }
        return apsMetricsEvent.copy(apsMetricsEventBase);
    }

    public final ApsMetricsEvent copy(ApsMetricsEventBase metricsEvent) {
        e0.checkNotNullParameter(metricsEvent, "metricsEvent");
        return new ApsMetricsEvent(metricsEvent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApsMetricsEvent) && e0.areEqual(this.metricsEvent, ((ApsMetricsEvent) obj).metricsEvent);
    }

    public int hashCode() {
        return this.metricsEvent.hashCode();
    }

    public final boolean isToSendDeviceInfo() {
        return this.metricsEvent.isToSendDeviceInfo();
    }

    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ApsMetricsEventBase apsMetricsEventBase = this.metricsEvent;
        jSONObject.put(apsMetricsEventBase.getJsonKeyName(), apsMetricsEventBase.toJsonObject());
        return jSONObject;
    }

    public String toString() {
        return "ApsMetricsEvent(metricsEvent=" + this.metricsEvent + ")";
    }
}
