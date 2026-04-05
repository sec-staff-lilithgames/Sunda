package com.amazon.aps.shared.metrics.model;

import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsCustomModel extends ApsMetricsEventBase {
    private final ApsMetricsCustomEventInfo event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsMetricsCustomModel(ApsMetricsCustomEventInfo event) {
        super(0L, 1, null);
        e0.checkNotNullParameter(event, "event");
        this.event = event;
    }

    private final ApsMetricsCustomEventInfo component1() {
        return this.event;
    }

    public static /* synthetic */ ApsMetricsCustomModel copy$default(ApsMetricsCustomModel apsMetricsCustomModel, ApsMetricsCustomEventInfo apsMetricsCustomEventInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apsMetricsCustomEventInfo = apsMetricsCustomModel.event;
        }
        return apsMetricsCustomModel.copy(apsMetricsCustomEventInfo);
    }

    public final ApsMetricsCustomModel copy(ApsMetricsCustomEventInfo event) {
        e0.checkNotNullParameter(event, "event");
        return new ApsMetricsCustomModel(event);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApsMetricsCustomModel) && e0.areEqual(this.event, ((ApsMetricsCustomModel) obj).event);
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    public String getJsonKeyName() {
        return ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM;
    }

    public int hashCode() {
        return this.event.hashCode();
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    public boolean isToSendDeviceInfo() {
        return true;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsEventBase
    public JSONObject toJsonObject() {
        return this.event.toJsonObject();
    }

    public String toString() {
        return "ApsMetricsCustomModel(event=" + this.event + ")";
    }
}
