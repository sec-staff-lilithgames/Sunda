package com.amazon.aps.shared.metrics.model;

import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsPerfAdapterEvent extends ApsMetricsPerfEventBase {
    private ApsMetricsResult result;

    /* JADX WARN: Multi-variable type inference failed */
    public ApsMetricsPerfAdapterEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ApsMetricsPerfAdapterEvent copy$default(ApsMetricsPerfAdapterEvent apsMetricsPerfAdapterEvent, ApsMetricsResult apsMetricsResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apsMetricsResult = apsMetricsPerfAdapterEvent.result;
        }
        return apsMetricsPerfAdapterEvent.copy(apsMetricsResult);
    }

    public final ApsMetricsResult component1() {
        return this.result;
    }

    public final ApsMetricsPerfAdapterEvent copy(ApsMetricsResult apsMetricsResult) {
        return new ApsMetricsPerfAdapterEvent(apsMetricsResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApsMetricsPerfAdapterEvent) && this.result == ((ApsMetricsPerfAdapterEvent) obj).result;
    }

    @Override // com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase
    public ApsMetricsResult getResult() {
        return this.result;
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

    public String toString() {
        return "ApsMetricsPerfAdapterEvent(result=" + this.result + ")";
    }

    public /* synthetic */ ApsMetricsPerfAdapterEvent(ApsMetricsResult apsMetricsResult, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : apsMetricsResult);
    }

    public ApsMetricsPerfAdapterEvent(ApsMetricsResult apsMetricsResult) {
        super(apsMetricsResult, 0L, 0L, 6, null);
        this.result = apsMetricsResult;
    }
}
