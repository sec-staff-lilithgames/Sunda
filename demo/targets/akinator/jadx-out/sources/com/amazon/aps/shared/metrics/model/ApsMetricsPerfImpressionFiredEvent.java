package com.amazon.aps.shared.metrics.model;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsPerfImpressionFiredEvent extends ApsMetricsPerfEventBase {
    private final ApsMetricsResult result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsMetricsPerfImpressionFiredEvent(ApsMetricsResult result) {
        super(result, 0L, 0L, 6, null);
        e0.checkNotNullParameter(result, "result");
        this.result = result;
    }

    public static /* synthetic */ ApsMetricsPerfImpressionFiredEvent copy$default(ApsMetricsPerfImpressionFiredEvent apsMetricsPerfImpressionFiredEvent, ApsMetricsResult apsMetricsResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apsMetricsResult = apsMetricsPerfImpressionFiredEvent.result;
        }
        return apsMetricsPerfImpressionFiredEvent.copy(apsMetricsResult);
    }

    public final ApsMetricsResult component1() {
        return this.result;
    }

    public final ApsMetricsPerfImpressionFiredEvent copy(ApsMetricsResult result) {
        e0.checkNotNullParameter(result, "result");
        return new ApsMetricsPerfImpressionFiredEvent(result);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApsMetricsPerfImpressionFiredEvent) && this.result == ((ApsMetricsPerfImpressionFiredEvent) obj).result;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    public ApsMetricsResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        return "ApsMetricsPerfImpressionFiredEvent(result=" + this.result + ")";
    }
}
